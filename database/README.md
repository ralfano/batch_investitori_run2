# PostgreSQL 17 Database Implementation

This directory contains the PostgreSQL 17 database implementation for the Batch Investitori application.

## Overview

The database implementation includes:
- **Schema definitions** for all financial entities
- **Seed data** for reference tables
- **Configuration files** for Hibernate and Spring
- **Docker Compose** setup for easy deployment

## Database Architecture

### Schema: `investitori`

The database uses a dedicated schema named `investitori` to organize all application tables.

### Core Tables

#### Financial Domain Tables
- **fin_contratto**: Financial contracts (base table)
- **fin_gp**: Gestioni Patrimoniali contracts (extends fin_contratto)
- **fin_posizione**: Financial positions within contracts
- **fin_movimento**: Financial transactions/movements
- **fin_ordine**: Trading orders
- **fin_disp_pagamento**: Payment dispositions
- **fin_promotore**: Financial advisors/promoters
- **fin_prodotto**: Financial products
- **fin_attivita_finanziaria**: Financial activities/instruments
- **fin_interfaccia**: System interfaces

#### Batch Processing Tables
- **flx_investitori_movimenti**: Staging table for transaction data
- **flx_investitori_anagrafica**: Staging table for customer data
- **flx_investitori_contratti**: Staging table for contract data

#### Logging and Control Tables
- **tbl_exe_log**: Batch execution log
- **tbl_commit**: Commit point tracking

#### Reference Tables
- **causale_movimento**: Transaction reason codes with mappings

## Quick Start

### Option 1: Using Docker Compose (Recommended)

1. **Start PostgreSQL 17**:
   ```bash
   docker-compose up -d
   ```

2. **Verify the database is running**:
   ```bash
   docker-compose ps
   docker-compose logs postgres
   ```

3. **Access the database**:
   ```bash
   docker exec -it batch_investitori_postgres psql -U batch_investitori -d batch_investitori
   ```

4. **Verify schema creation**:
   ```sql
   \dn  -- List schemas
   SET search_path TO investitori;
   \dt  -- List tables
   ```

### Option 2: Manual Installation

1. **Install PostgreSQL 17**:
   ```bash
   # Ubuntu/Debian
   sudo apt-get install postgresql-17
   
   # RHEL/CentOS
   sudo yum install postgresql17-server
   
   # macOS
   brew install postgresql@17
   ```

2. **Create database and user**:
   ```bash
   sudo -u postgres psql
   ```
   ```sql
   CREATE DATABASE batch_investitori;
   CREATE USER batch_investitori WITH PASSWORD 'your_secure_password';
   GRANT ALL PRIVILEGES ON DATABASE batch_investitori TO batch_investitori;
   \c batch_investitori
   GRANT ALL PRIVILEGES ON SCHEMA public TO batch_investitori;
   ```

3. **Run schema scripts**:
   ```bash
   psql -U batch_investitori -d batch_investitori -f schema/01_create_schema.sql
   psql -U batch_investitori -d batch_investitori -f schema/02_seed_data.sql
   ```

## Configuration

### Database Connection Properties

Copy the template and update with your credentials:
```bash
cp config/database.properties.template config/database.properties
```

Edit `config/database.properties`:
```properties
db.url=jdbc:postgresql://localhost:5432/batch_investitori
db.username=batch_investitori
db.password=your_secure_password
```

### Spring Configuration

The Spring SessionFactory configuration is located at:
- `config/SpringSessionFactory.xml` - Spring bean definitions
- `config/hibernate.cfg.xml` - Hibernate configuration

These files are pre-configured for PostgreSQL 17 with optimized settings for batch processing.

## Schema Management

### Creating the Schema

The schema is automatically created when you run:
```bash
docker-compose up -d
```

Or manually:
```bash
psql -U batch_investitori -d batch_investitori -f schema/01_create_schema.sql
```

### Loading Seed Data

Seed data is loaded automatically after schema creation, or manually:
```bash
psql -U batch_investitori -d batch_investitori -f schema/02_seed_data.sql
```

### Verifying the Installation

Connect to the database and run:
```sql
-- Set schema
SET search_path TO investitori;

-- Check tables
SELECT table_name 
FROM information_schema.tables 
WHERE table_schema = 'investitori' 
ORDER BY table_name;

-- Check seed data
SELECT COUNT(*) as interfaces FROM fin_interfaccia;
SELECT COUNT(*) as products FROM fin_prodotto;
SELECT COUNT(*) as transaction_codes FROM causale_movimento;
SELECT COUNT(*) as activities FROM fin_attivita_finanziaria;
```

## Key Features

### PostgreSQL 17 Specific Features
- Native JSON/JSONB support for flexible data storage
- Advanced indexing for performance
- Partitioning support for large tables
- Parallel query execution

### Optimizations
- **Connection Pooling**: Configured with Apache DBCP2
- **JDBC Batching**: Batch size of 50 for optimal performance
- **Indexes**: Strategic indexes on frequently queried columns
- **Sequences**: BIGSERIAL for primary keys

### Transaction Management
- Configurable commit points
- Transaction isolation level: READ_COMMITTED
- Rollback on error support

## Maintenance

### Backup

```bash
# Full backup
docker exec batch_investitori_postgres pg_dump -U batch_investitori batch_investitori > backup.sql

# Schema only
docker exec batch_investitori_postgres pg_dump -U batch_investitori -s batch_investitori > schema_backup.sql

# Data only
docker exec batch_investitori_postgres pg_dump -U batch_investitori -a batch_investitori > data_backup.sql
```

### Restore

```bash
docker exec -i batch_investitori_postgres psql -U batch_investitori batch_investitori < backup.sql
```

### Performance Monitoring

```sql
-- Check table sizes
SELECT 
    schemaname,
    tablename,
    pg_size_pretty(pg_total_relation_size(schemaname||'.'||tablename)) AS size
FROM pg_tables
WHERE schemaname = 'investitori'
ORDER BY pg_total_relation_size(schemaname||'.'||tablename) DESC;

-- Check index usage
SELECT 
    schemaname,
    tablename,
    indexname,
    idx_scan,
    idx_tup_read,
    idx_tup_fetch
FROM pg_stat_user_indexes
WHERE schemaname = 'investitori'
ORDER BY idx_scan DESC;

-- Check slow queries
SELECT 
    query,
    calls,
    total_time,
    mean_time,
    max_time
FROM pg_stat_statements
ORDER BY mean_time DESC
LIMIT 10;
```

## Troubleshooting

### Connection Issues

1. **Check PostgreSQL is running**:
   ```bash
   docker-compose ps
   ```

2. **Check logs**:
   ```bash
   docker-compose logs postgres
   ```

3. **Test connection**:
   ```bash
   psql -h localhost -p 5432 -U batch_investitori -d batch_investitori
   ```

### Schema Issues

1. **Verify schema exists**:
   ```sql
   SELECT schema_name FROM information_schema.schemata WHERE schema_name = 'investitori';
   ```

2. **Check table permissions**:
   ```sql
   SELECT grantee, privilege_type 
   FROM information_schema.table_privileges 
   WHERE table_schema = 'investitori';
   ```

## pgAdmin Access

If using Docker Compose, pgAdmin is available at:
- URL: http://localhost:5050
- Email: admin@batch-investitori.local
- Password: admin

### Adding PostgreSQL Server in pgAdmin

1. Right-click "Servers" → "Register" → "Server"
2. General tab:
   - Name: Batch Investitori
3. Connection tab:
   - Host: postgres
   - Port: 5432
   - Database: batch_investitori
   - Username: batch_investitori
   - Password: your_secure_password

## Security Considerations

1. **Change default passwords** in production
2. **Use SSL/TLS** for database connections
3. **Restrict network access** using firewalls
4. **Regular backups** are essential
5. **Monitor access logs** for suspicious activity

## Migration Scripts

For future schema changes, create migration scripts in the `migrations/` directory:
```
migrations/
  ├── V001__initial_schema.sql
  ├── V002__add_new_table.sql
  └── V003__add_index.sql
```

## Support

For issues or questions:
1. Check the logs: `docker-compose logs postgres`
2. Review Hibernate logs in the application
3. Check PostgreSQL documentation: https://www.postgresql.org/docs/17/

## Version Information

- **PostgreSQL Version**: 17
- **JDBC Driver**: org.postgresql:postgresql (latest)
- **Hibernate Version**: 5.x compatible
- **Spring Framework**: Compatible with Spring Framework 4.x/5.x
