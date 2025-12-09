-- PostgreSQL 17 - Installation Verification Script
-- Run this script to verify the database installation is complete and correct

SET search_path TO investitori, public;

\echo '========================================='
\echo 'PostgreSQL 17 Database Verification'
\echo '========================================='
\echo ''

-- Check PostgreSQL version
\echo 'PostgreSQL Version:'
SELECT version();
\echo ''

-- Check current database
\echo 'Current Database:'
SELECT current_database();
\echo ''

-- Check schema exists
\echo 'Checking schema...'
SELECT 
    CASE 
        WHEN EXISTS (SELECT 1 FROM information_schema.schemata WHERE schema_name = 'investitori')
        THEN '✓ Schema "investitori" exists'
        ELSE '✗ Schema "investitori" NOT FOUND'
    END AS schema_check;
\echo ''

-- Count and list all tables
\echo 'Tables in investitori schema:'
SELECT 
    table_name,
    (SELECT COUNT(*) FROM information_schema.columns WHERE table_schema = 'investitori' AND table_name = t.table_name) AS column_count
FROM information_schema.tables t
WHERE table_schema = 'investitori' 
    AND table_type = 'BASE TABLE'
ORDER BY table_name;
\echo ''

-- Check table counts
\echo 'Expected vs Actual table counts:'
WITH expected AS (
    SELECT 18 AS expected_tables
),
actual AS (
    SELECT COUNT(*) AS actual_tables
    FROM information_schema.tables
    WHERE table_schema = 'investitori' 
        AND table_type = 'BASE TABLE'
)
SELECT 
    expected_tables,
    actual_tables,
    CASE 
        WHEN expected_tables = actual_tables THEN '✓ PASS'
        ELSE '✗ FAIL'
    END AS status
FROM expected, actual;
\echo ''

-- Check indexes
\echo 'Indexes created:'
SELECT 
    schemaname,
    tablename,
    indexname
FROM pg_indexes
WHERE schemaname = 'investitori'
ORDER BY tablename, indexname;
\echo ''

-- Check foreign key constraints
\echo 'Foreign key constraints:'
SELECT 
    tc.table_name,
    tc.constraint_name,
    tc.constraint_type,
    kcu.column_name,
    ccu.table_name AS foreign_table_name,
    ccu.column_name AS foreign_column_name
FROM information_schema.table_constraints AS tc
JOIN information_schema.key_column_usage AS kcu
    ON tc.constraint_name = kcu.constraint_name
    AND tc.table_schema = kcu.table_schema
JOIN information_schema.constraint_column_usage AS ccu
    ON ccu.constraint_name = tc.constraint_name
    AND ccu.table_schema = tc.table_schema
WHERE tc.constraint_type = 'FOREIGN KEY'
    AND tc.table_schema = 'investitori'
ORDER BY tc.table_name, tc.constraint_name;
\echo ''

-- Check seed data
\echo 'Seed data verification:'
SELECT 
    'fin_interfaccia' AS table_name,
    COUNT(*) AS record_count,
    CASE WHEN COUNT(*) >= 3 THEN '✓ OK' ELSE '✗ Missing data' END AS status
FROM fin_interfaccia
UNION ALL
SELECT 
    'fin_prodotto',
    COUNT(*),
    CASE WHEN COUNT(*) >= 4 THEN '✓ OK' ELSE '✗ Missing data' END
FROM fin_prodotto
UNION ALL
SELECT 
    'causale_movimento',
    COUNT(*),
    CASE WHEN COUNT(*) >= 30 THEN '✓ OK' ELSE '✗ Missing data' END
FROM causale_movimento
UNION ALL
SELECT 
    'fin_attivita_finanziaria',
    COUNT(*),
    CASE WHEN COUNT(*) >= 5 THEN '✓ OK' ELSE '✗ Missing data' END
FROM fin_attivita_finanziaria;
\echo ''

-- Check sequences
\echo 'Sequences created:'
SELECT 
    sequence_schema,
    sequence_name,
    data_type,
    start_value,
    minimum_value,
    maximum_value,
    increment
FROM information_schema.sequences
WHERE sequence_schema = 'investitori'
ORDER BY sequence_name;
\echo ''

-- Check table sizes
\echo 'Table sizes:'
SELECT 
    schemaname,
    tablename,
    pg_size_pretty(pg_total_relation_size(schemaname||'.'||tablename)) AS total_size,
    pg_size_pretty(pg_table_size(schemaname||'.'||tablename)) AS table_size,
    pg_size_pretty(pg_indexes_size(schemaname||'.'||tablename)) AS indexes_size
FROM pg_tables
WHERE schemaname = 'investitori'
ORDER BY pg_total_relation_size(schemaname||'.'||tablename) DESC;
\echo ''

-- Check user permissions
\echo 'Database permissions for batch_investitori:'
SELECT 
    grantee,
    privilege_type,
    table_schema,
    table_name
FROM information_schema.table_privileges
WHERE table_schema = 'investitori'
    AND grantee = 'batch_investitori'
ORDER BY table_name
LIMIT 10;
\echo ''

-- Connectivity test
\echo 'Database connectivity test:'
SELECT 
    'Database connection' AS test,
    '✓ SUCCESS' AS result,
    current_timestamp AS tested_at;
\echo ''

-- Sample queries to verify data structure
\echo 'Sample data structure verification:'
\echo 'Checking fin_movimento columns...'
SELECT 
    column_name,
    data_type,
    character_maximum_length,
    is_nullable
FROM information_schema.columns
WHERE table_schema = 'investitori' 
    AND table_name = 'fin_movimento'
ORDER BY ordinal_position;
\echo ''

-- Final summary
\echo '========================================='
\echo 'Verification Summary'
\echo '========================================='
WITH 
schema_check AS (
    SELECT EXISTS (SELECT 1 FROM information_schema.schemata WHERE schema_name = 'investitori') AS exists
),
table_check AS (
    SELECT COUNT(*) >= 18 AS sufficient
    FROM information_schema.tables
    WHERE table_schema = 'investitori' AND table_type = 'BASE TABLE'
),
data_check AS (
    SELECT 
        (SELECT COUNT(*) FROM fin_interfaccia) >= 3 AND
        (SELECT COUNT(*) FROM fin_prodotto) >= 4 AND
        (SELECT COUNT(*) FROM causale_movimento) >= 30 AND
        (SELECT COUNT(*) FROM fin_attivita_finanziaria) >= 5 AS sufficient
)
SELECT 
    CASE 
        WHEN schema_check.exists AND table_check.sufficient AND data_check.sufficient 
        THEN '✓✓✓ ALL CHECKS PASSED - Database ready for use!'
        ELSE '✗✗✗ SOME CHECKS FAILED - Review output above'
    END AS final_status
FROM schema_check, table_check, data_check;
\echo ''
\echo 'Verification complete. Review results above.'
\echo '========================================='
