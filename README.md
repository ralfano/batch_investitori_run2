# Batch Investitori - Financial Batch Processing Application

A Java-based batch processing application for financial investment management with **PostgreSQL 17** database backend.

## Overview

This application processes financial transactions, manages investment portfolios, and handles customer data for the Gestioni Patrimoniali (GP) system. It uses Spring Framework for dependency injection, Hibernate ORM for database operations, and PostgreSQL 17 as the database.

## Features

- **Financial Transaction Processing**: Batch processing of investment movements
- **Portfolio Management**: GP (Gestioni Patrimoniali) contract management
- **Customer Data Management**: Anagrafica cliente processing
- **Multi-threaded Batch Processing**: Configurable parallel processing
- **PostgreSQL 17 Integration**: Modern, high-performance database backend
- **Transaction Safety**: Configurable commit points and rollback support

## Technology Stack

- **Java**: 1.8+
- **Database**: PostgreSQL 17
- **ORM**: Hibernate 5.6.x
- **Framework**: Spring Framework 5.3.x
- **Connection Pool**: Apache Commons DBCP2
- **Build Tool**: Maven 3.x
- **Deployment**: Docker Compose

## Quick Start

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Maven 3.6+
- Docker and Docker Compose (recommended)
- PostgreSQL 17 (if not using Docker)

### 1. Database Setup

#### Using Docker (Recommended)

```bash
# Start PostgreSQL 17 and pgAdmin
docker-compose up -d

# Verify database is running
docker-compose ps
docker-compose logs postgres
```

The database will be automatically initialized with:
- Schema creation
- Reference data
- Indexes and constraints

#### Manual Setup

See [database/README.md](database/README.md) for detailed manual installation instructions.

### 2. Configure Database Connection

```bash
# Copy template and update credentials
cp database/config/database.properties.template database/config/database.properties

# Edit database.properties with your settings
vi database/config/database.properties
```

### 3. Build the Application

```bash
# Clean and build
mvn clean package

# This creates:
# - target/batch-investitori-2.0.0.jar
# - target/batch-investitori-2.0.0-jar-with-dependencies.jar (fat JAR)
```

### 4. Run Batch Jobs

```bash
# Example: Run anagrafica cliente batch
java -cp target/batch-investitori-2.0.0-jar-with-dependencies.jar \
  it.ras.arco.batch.investitori.main.MainAnagraficaCliente \
  it/ras/arco/batch/investitori/config/main/BatchAnagraficaCliente.xml

# Example: Run movimenti batch
java -cp target/batch-investitori-2.0.0-jar-with-dependencies.jar \
  it.ras.arco.batch.investitori.main.MovimentiMain \
  it/ras/arco/batch/investitori/config/main/BatchMovimentiGp.xml
```

## Project Structure

```
batch_investitori_run2/
├── it/ras/arco/batch/investitori/
│   ├── businesslogic/       # Business logic implementations
│   │   ├── MovimentiGenBL.java
│   │   ├── GetFlxAnagraficaClienteBL.java
│   │   └── ...
│   ├── cursor/              # Database cursors
│   ├── main/                # Main entry points for batch jobs
│   ├── rules/               # Business rules
│   └── config/              # Spring and batch configurations
│       ├── spring/          # Spring bean definitions
│       ├── main/            # Batch job configurations
│       └── flusso/          # Flow configurations
├── database/                # PostgreSQL 17 database files
│   ├── schema/             # SQL schema and seed scripts
│   ├── config/             # Database configuration files
│   ├── migrations/         # Database migration scripts
│   └── README.md           # Database documentation
├── docker-compose.yml      # Docker Compose configuration
├── pom.xml                 # Maven project configuration
└── README.md              # This file
```

## Batch Jobs

### Available Batch Processes

1. **Anagrafica Cliente** (`MainAnagraficaCliente`)
   - Processes customer master data
   - Config: `BatchAnagraficaCliente.xml`

2. **Movimenti GP** (`MovimentiMain`)
   - Processes GP investment movements
   - Config: `BatchMovimentiGp.xml`

3. **Movimenti Gen** (`MovimentiMainGen`)
   - Generic movement processing
   - Config: `BatchMovimentiGenBL.xml`

4. **Contratto GP** (`ContrattoGPMain`)
   - GP contract management
   - Config: `BatchContrattoGp.xml`

5. **Cointestazioni** (`MainGpCointestazione`)
   - Joint account holder processing
   - Config: `BatchCointestazione.xml`

6. **Saldi Fondi** (`MainSaldiFondi`)
   - Fund balance processing
   - Config: `BatchSaldiFondi.xml`

### Batch Configuration

Each batch job is configured via XML files in `config/main/`:

```xml
<BATCH>
    <NUMBEROFTHREAD>1</NUMBEROFTHREAD>           <!-- Parallel threads -->
    <COMMITPOINT>100</COMMITPOINT>               <!-- Commit every N records -->
    <MAXWARNING>1000000</MAXWARNING>             <!-- Max warnings before stop -->
    <ELABORATIONTYPE>DB</ELABORATIONTYPE>        <!-- Processing type -->
    <BATCHNAME>BATCH_NAME</BATCHNAME>            <!-- Batch identifier -->
</BATCH>
```

## Database

### Schema: `investitori`

The application uses a dedicated PostgreSQL schema with the following main tables:

#### Core Financial Tables
- `fin_contratto`: Financial contracts
- `fin_gp`: GP contracts
- `fin_posizione`: Financial positions
- `fin_movimento`: Financial movements/transactions
- `fin_ordine`: Trading orders
- `fin_promotore`: Financial advisors
- `fin_prodotto`: Financial products

#### Staging Tables
- `flx_investitori_movimenti`: Transaction staging
- `flx_investitori_anagrafica`: Customer data staging
- `flx_investitori_contratti`: Contract staging

#### Control Tables
- `tbl_exe_log`: Batch execution log
- `tbl_commit`: Commit point tracking

For detailed database documentation, see [database/README.md](database/README.md).

## Configuration

### Database Configuration

Edit `database/config/database.properties`:

```properties
# Connection
db.url=jdbc:postgresql://localhost:5432/batch_investitori
db.username=batch_investitori
db.password=your_secure_password

# Pool settings
db.pool.maxTotal=20
db.pool.maxIdle=10

# Hibernate
hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
hibernate.jdbc.batch_size=50
```

### Spring Configuration

Spring beans are configured in `database/config/SpringSessionFactory.xml`:
- DataSource with connection pooling
- SessionFactory for Hibernate
- Transaction manager
- Property placeholder configuration

## Development

### Building from Source

```bash
# Compile
mvn compile

# Run tests (if available)
mvn test

# Package
mvn package

# Clean build
mvn clean install
```

### IDE Setup

#### IntelliJ IDEA
1. Open project as Maven project
2. Configure JDK 8+
3. Set source directories: `it/` as source root
4. Add PostgreSQL data source in Database tool

#### Eclipse
1. Import as Maven project
2. Configure Java build path
3. Add PostgreSQL JDBC driver to build path

## Monitoring and Logging

### Application Logs

Logs are written to console and can be configured via Log4j2:

```bash
# View logs in Docker
docker-compose logs -f
```

### Database Monitoring

```sql
-- Check batch execution history
SELECT * FROM investitori.tbl_exe_log 
ORDER BY execution_date DESC 
LIMIT 10;

-- Check processing statistics
SELECT 
    batch_name,
    COUNT(*) as executions,
    AVG(processed_records) as avg_records,
    SUM(error_records) as total_errors
FROM investitori.tbl_exe_log
GROUP BY batch_name;
```

### pgAdmin Access

If using Docker Compose:
- URL: http://localhost:5050
- Email: admin@batch-investitori.local
- Password: admin

## Troubleshooting

### Database Connection Issues

```bash
# Check database is running
docker-compose ps

# Check logs
docker-compose logs postgres

# Test connection
psql -h localhost -U batch_investitori -d batch_investitori
```

### Batch Processing Errors

1. Check `tbl_exe_log` table for error messages
2. Review staging tables for rejected records
3. Check Hibernate SQL logs (set `hibernate.show_sql=true`)

### Common Issues

**Issue**: `relation "investitori.xxx" does not exist`
- **Solution**: Run schema creation scripts

**Issue**: Connection pool exhausted
- **Solution**: Increase `db.pool.maxTotal` in properties

**Issue**: Out of memory during batch
- **Solution**: Reduce `COMMITPOINT` or increase JVM heap size

## Performance Tuning

### Database Optimization

```sql
-- Analyze tables
ANALYZE investitori.fin_movimento;

-- Reindex
REINDEX TABLE investitori.fin_movimento;

-- Check slow queries
SELECT * FROM pg_stat_statements 
ORDER BY mean_time DESC 
LIMIT 10;
```

### Application Tuning

1. **Batch Size**: Adjust `hibernate.jdbc.batch_size`
2. **Commit Points**: Configure `COMMITPOINT` in batch XML
3. **Thread Count**: Increase `NUMBEROFTHREAD` for parallel processing
4. **Connection Pool**: Tune pool sizes based on load

## Security

### Production Deployment

1. **Change all default passwords**
2. **Use SSL/TLS for database connections**
3. **Restrict database access by IP**
4. **Enable database connection encryption**
5. **Regular security updates**
6. **Audit logging enabled**

### Database Security

```sql
-- Create restricted user
CREATE USER batch_readonly WITH PASSWORD 'readonly_pass';
GRANT CONNECT ON DATABASE batch_investitori TO batch_readonly;
GRANT USAGE ON SCHEMA investitori TO batch_readonly;
GRANT SELECT ON ALL TABLES IN SCHEMA investitori TO batch_readonly;
```

## Backup and Recovery

### Database Backup

```bash
# Full backup
docker exec batch_investitori_postgres pg_dump \
  -U batch_investitori batch_investitori > backup.sql

# Scheduled backup (cron)
0 2 * * * /usr/local/bin/backup-script.sh
```

### Restore

```bash
docker exec -i batch_investitori_postgres psql \
  -U batch_investitori batch_investitori < backup.sql
```

## Migration from Other Databases

If migrating from another database (e.g., Oracle, MySQL):

1. Export data from source database
2. Transform data to match PostgreSQL schema
3. Load into staging tables
4. Run batch processes to populate main tables

See [database/migrations/](database/migrations/) for migration scripts.

## Contributing

1. Create feature branch
2. Make changes with tests
3. Submit pull request
4. Ensure CI passes

## License

Copyright (c) 2024 RAS Arco. All rights reserved.

## Support

For issues or questions:
- Check [database/README.md](database/README.md) for database issues
- Review batch logs in `tbl_exe_log` table
- Check Docker logs: `docker-compose logs`

## Version History

### Version 2.0.0 (Current)
- PostgreSQL 17 database implementation
- Docker Compose support
- Enhanced batch processing
- Improved logging and monitoring

### Version 1.0.0
- Initial release
- Basic batch processing functionality
