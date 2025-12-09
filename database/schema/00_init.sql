-- PostgreSQL 17 - Database Initialization Script
-- This script sets up the database environment before creating tables

-- Enable required extensions
CREATE EXTENSION IF NOT EXISTS "uuid-ossp";
CREATE EXTENSION IF NOT EXISTS "pg_stat_statements";

-- Set timezone
SET timezone = 'Europe/Rome';

-- Set client encoding
SET client_encoding = 'UTF8';

-- Set standard conforming strings
SET standard_conforming_strings = on;

-- Display version information
SELECT version();

-- Display current settings
SHOW server_version;
SHOW server_encoding;
SHOW client_encoding;
SHOW timezone;

-- Create application user if not exists (run as superuser)
DO $$
BEGIN
    IF NOT EXISTS (SELECT FROM pg_catalog.pg_user WHERE usename = 'batch_investitori') THEN
        CREATE USER batch_investitori WITH PASSWORD 'your_secure_password';
    END IF;
END
$$;

-- Grant necessary privileges
GRANT CONNECT ON DATABASE batch_investitori TO batch_investitori;
GRANT CREATE ON DATABASE batch_investitori TO batch_investitori;

-- Display success message
SELECT 'PostgreSQL 17 initialization completed successfully' AS status;
