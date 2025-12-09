#!/bin/bash
# Database Manager Script for Batch Investitori PostgreSQL 17
# Usage: ./db-manager.sh [command]

set -e

# Colors for output
RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
NC='\033[0m' # No Color

# Configuration
DB_CONTAINER="batch_investitori_postgres"
DB_NAME="batch_investitori"
DB_USER="batch_investitori"
SCHEMA_DIR="./schema"

# Functions
print_usage() {
    echo "Database Manager for Batch Investitori"
    echo ""
    echo "Usage: $0 [command]"
    echo ""
    echo "Commands:"
    echo "  start          - Start PostgreSQL container"
    echo "  stop           - Stop PostgreSQL container"
    echo "  restart        - Restart PostgreSQL container"
    echo "  status         - Show container status"
    echo "  logs           - Show PostgreSQL logs"
    echo "  connect        - Connect to database with psql"
    echo "  init           - Initialize database (run all schema scripts)"
    echo "  verify         - Verify database installation"
    echo "  backup         - Create database backup"
    echo "  restore [file] - Restore database from backup"
    echo "  reset          - Reset database (WARNING: destroys all data)"
    echo "  help           - Show this help message"
    echo ""
}

check_docker() {
    if ! command -v docker &> /dev/null; then
        echo -e "${RED}Error: Docker is not installed${NC}"
        exit 1
    fi
    
    if ! command -v docker-compose &> /dev/null; then
        echo -e "${RED}Error: Docker Compose is not installed${NC}"
        exit 1
    fi
}

start_db() {
    echo -e "${GREEN}Starting PostgreSQL 17...${NC}"
    docker-compose up -d postgres
    echo -e "${GREEN}Waiting for database to be ready...${NC}"
    sleep 5
    docker-compose exec postgres pg_isready -U $DB_USER -d $DB_NAME
    echo -e "${GREEN}PostgreSQL is ready!${NC}"
}

stop_db() {
    echo -e "${YELLOW}Stopping PostgreSQL...${NC}"
    docker-compose stop postgres
    echo -e "${GREEN}PostgreSQL stopped${NC}"
}

restart_db() {
    echo -e "${YELLOW}Restarting PostgreSQL...${NC}"
    stop_db
    start_db
}

show_status() {
    echo -e "${GREEN}Container Status:${NC}"
    docker-compose ps
    echo ""
    echo -e "${GREEN}Database Connection:${NC}"
    docker-compose exec postgres pg_isready -U $DB_USER -d $DB_NAME || true
}

show_logs() {
    echo -e "${GREEN}PostgreSQL Logs (Ctrl+C to exit):${NC}"
    docker-compose logs -f postgres
}

connect_db() {
    echo -e "${GREEN}Connecting to database...${NC}"
    docker-compose exec postgres psql -U $DB_USER -d $DB_NAME
}

init_db() {
    echo -e "${GREEN}Initializing database...${NC}"
    
    if [ ! -d "$SCHEMA_DIR" ]; then
        echo -e "${RED}Error: Schema directory not found: $SCHEMA_DIR${NC}"
        exit 1
    fi
    
    echo -e "${YELLOW}Running initialization script...${NC}"
    docker-compose exec -T postgres psql -U $DB_USER -d $DB_NAME < $SCHEMA_DIR/00_init.sql
    
    echo -e "${YELLOW}Creating schema...${NC}"
    docker-compose exec -T postgres psql -U $DB_USER -d $DB_NAME < $SCHEMA_DIR/01_create_schema.sql
    
    echo -e "${YELLOW}Loading seed data...${NC}"
    docker-compose exec -T postgres psql -U $DB_USER -d $DB_NAME < $SCHEMA_DIR/02_seed_data.sql
    
    echo -e "${GREEN}Database initialized successfully!${NC}"
}

verify_db() {
    echo -e "${GREEN}Verifying database installation...${NC}"
    docker-compose exec -T postgres psql -U $DB_USER -d $DB_NAME < $SCHEMA_DIR/99_verify_installation.sql
}

backup_db() {
    BACKUP_FILE="backup_$(date +%Y%m%d_%H%M%S).sql"
    echo -e "${GREEN}Creating backup: $BACKUP_FILE${NC}"
    docker-compose exec -T postgres pg_dump -U $DB_USER $DB_NAME > $BACKUP_FILE
    echo -e "${GREEN}Backup created: $BACKUP_FILE${NC}"
}

restore_db() {
    if [ -z "$1" ]; then
        echo -e "${RED}Error: Backup file not specified${NC}"
        echo "Usage: $0 restore <backup_file>"
        exit 1
    fi
    
    BACKUP_FILE="$1"
    
    if [ ! -f "$BACKUP_FILE" ]; then
        echo -e "${RED}Error: Backup file not found: $BACKUP_FILE${NC}"
        exit 1
    fi
    
    echo -e "${YELLOW}Warning: This will overwrite existing database data${NC}"
    read -p "Are you sure? (yes/no): " confirm
    
    if [ "$confirm" != "yes" ]; then
        echo -e "${YELLOW}Restore cancelled${NC}"
        exit 0
    fi
    
    echo -e "${GREEN}Restoring from backup: $BACKUP_FILE${NC}"
    docker-compose exec -T postgres psql -U $DB_USER $DB_NAME < $BACKUP_FILE
    echo -e "${GREEN}Restore completed${NC}"
}

reset_db() {
    echo -e "${RED}WARNING: This will destroy all data in the database!${NC}"
    read -p "Are you absolutely sure? Type 'DELETE ALL DATA' to confirm: " confirm
    
    if [ "$confirm" != "DELETE ALL DATA" ]; then
        echo -e "${YELLOW}Reset cancelled${NC}"
        exit 0
    fi
    
    echo -e "${YELLOW}Dropping database...${NC}"
    docker-compose exec postgres psql -U postgres -c "DROP DATABASE IF EXISTS $DB_NAME;"
    
    echo -e "${YELLOW}Creating database...${NC}"
    docker-compose exec postgres psql -U postgres -c "CREATE DATABASE $DB_NAME OWNER $DB_USER;"
    
    echo -e "${YELLOW}Reinitializing database...${NC}"
    init_db
    
    echo -e "${GREEN}Database reset completed${NC}"
}

# Main script
case "${1:-help}" in
    start)
        check_docker
        start_db
        ;;
    stop)
        check_docker
        stop_db
        ;;
    restart)
        check_docker
        restart_db
        ;;
    status)
        check_docker
        show_status
        ;;
    logs)
        check_docker
        show_logs
        ;;
    connect)
        check_docker
        connect_db
        ;;
    init)
        check_docker
        init_db
        ;;
    verify)
        check_docker
        verify_db
        ;;
    backup)
        check_docker
        backup_db
        ;;
    restore)
        check_docker
        restore_db "$2"
        ;;
    reset)
        check_docker
        reset_db
        ;;
    help|--help|-h)
        print_usage
        ;;
    *)
        echo -e "${RED}Error: Unknown command: $1${NC}"
        echo ""
        print_usage
        exit 1
        ;;
esac

exit 0
