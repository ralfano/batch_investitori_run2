-- PostgreSQL 17 - Seed Data for Batch Investitori Application
-- Initial reference data and lookup tables

SET search_path TO investitori, public;

-- ============================================
-- Insert Interface Data
-- ============================================

INSERT INTO fin_interfaccia (interfaccia, descrizione, utente_inserimento) VALUES
    ('RAM', 'Interfaccia RAM', 'SYSTEM'),
    ('GPRAM', 'Gestioni Patrimoniali RAM', 'SYSTEM'),
    ('INVEST', 'Sistema Investitori', 'SYSTEM')
ON CONFLICT (interfaccia) DO NOTHING;

-- ============================================
-- Insert Sample Products
-- ============================================

INSERT INTO fin_prodotto (tipo, codice, descrizione, utente_inserimento) VALUES
    ('GPM', 'GPM001', 'Gestione Patrimoniale Mobiliare', 'SYSTEM'),
    ('GMM', 'GMM001', 'Gestione Mobiliare', 'SYSTEM'),
    ('GPF', 'GPF001', 'Gestione Patrimoniale Fondi', 'SYSTEM'),
    ('FND', 'FND001', 'Fondo di Investimento', 'SYSTEM')
ON CONFLICT (tipo, codice) DO NOTHING;

-- ============================================
-- Insert Causale Movimento (Transaction Reason Codes)
-- Based on the mapping in MovimentiGenBL.java
-- ============================================

INSERT INTO causale_movimento (codice_esterno, codice_interno, descrizione, tipo) VALUES
    -- PS type transactions
    ('GLEDIN', 'PS', 'Gestione Liquidità Entrata In', 'PAGAMENTO_SOTTOSCRIZIONE'),
    ('GLESIN', 'PS', 'Gestione Liquidità Entrata Sottoscrizione', 'PAGAMENTO_SOTTOSCRIZIONE'),
    ('GLUSIN', 'PS', 'Gestione Liquidità Uscita Sottoscrizione', 'PAGAMENTO_SOTTOSCRIZIONE'),
    ('GLUDIN', 'PS', 'Gestione Liquidità Uscita Din', 'PAGAMENTO_SOTTOSCRIZIONE'),
    ('GTELSI', 'PS', 'Gestione Tel Si', 'PAGAMENTO_SOTTOSCRIZIONE'),
    ('GTENDI', 'PS', 'Gestione Tel Endi', 'PAGAMENTO_SOTTOSCRIZIONE'),
    ('GTENSI', 'PS', 'Gestione Tel Ensi', 'PAGAMENTO_SOTTOSCRIZIONE'),
    ('GTELDI', 'PS', 'Gestione Tel Di', 'PAGAMENTO_SOTTOSCRIZIONE'),
    ('GTUNSI', 'PS', 'Gestione Tun Si', 'PAGAMENTO_SOTTOSCRIZIONE'),
    ('GTUNDI', 'PS', 'Gestione Tun Di', 'PAGAMENTO_SOTTOSCRIZIONE'),
    ('GTULDI', 'PS', 'Gestione Tul Di', 'PAGAMENTO_SOTTOSCRIZIONE'),
    ('GTULSI', 'PS', 'Gestione Tul Si', 'PAGAMENTO_SOTTOSCRIZIONE'),
    ('L_LPP1', 'PS', 'Liquidazione Posizione P1', 'PAGAMENTO_SOTTOSCRIZIONE'),
    ('L_LVP', 'PS', 'Liquidazione Vendita P', 'PAGAMENTO_SOTTOSCRIZIONE'),
    ('L_LVPP', 'PS', 'Liquidazione Vendita PP', 'PAGAMENTO_SOTTOSCRIZIONE'),
    ('TVI3GP', 'PS', 'Trasferimento VI 3GP', 'PAGAMENTO_SOTTOSCRIZIONE'),
    ('TVI4GP', 'PS', 'Trasferimento VI 4GP', 'PAGAMENTO_SOTTOSCRIZIONE'),
    ('TVN2GP', 'PS', 'Trasferimento VN 2GP', 'PAGAMENTO_SOTTOSCRIZIONE'),
    ('TVN4GP', 'PS', 'Trasferimento VN 4GP', 'PAGAMENTO_SOTTOSCRIZIONE'),
    
    -- BO type transactions
    ('L_BOEI', 'BO', 'Liquidazione BOE Ingresso', 'BONIFICO'),
    ('L_BOEE', 'BO', 'Liquidazione BOE Uscita', 'BONIFICO'),
    ('L_BOUE', 'BO', 'Liquidazione BOU Uscita', 'BONIFICO'),
    ('L_BOUI', 'BO', 'Liquidazione BOU Ingresso', 'BONIFICO'),
    ('L_LPB', 'BO', 'Liquidazione Posizione B', 'BONIFICO'),
    ('L_LVB', 'BO', 'Liquidazione Vendita B', 'BONIFICO'),
    ('L_LVBE', 'BO', 'Liquidazione Vendita BE', 'BONIFICO'),
    
    -- CO type transactions
    ('L_LPC', 'CO', 'Liquidazione Posizione C', 'CONTANTI'),
    ('L_PRCO', 'CO', 'Prelievo Contanti', 'CONTANTI'),
    ('L_VECO', 'CO', 'Vendita Contanti', 'CONTANTI'),
    
    -- AC type transactions
    ('L_LVA', 'AC', 'Liquidazione Vendita A', 'ACCREDITO'),
    ('L_LVAP', 'AC', 'Liquidazione Vendita AP', 'ACCREDITO'),
    ('L_PRAS', 'AC', 'Prelievo AS', 'ACCREDITO'),
    ('L_VEAS', 'AC', 'Vendita AS', 'ACCREDITO')
ON CONFLICT (codice_esterno) DO NOTHING;

-- ============================================
-- Insert Sample Financial Activities
-- ============================================

INSERT INTO fin_attivita_finanziaria (codice, descrizione, tipo, utente_inserimento) VALUES
    ('LIQ', 'Liquidità', 'LIQUIDITA', 'SYSTEM'),
    ('FND', 'Fondo Comune', 'FONDO', 'SYSTEM'),
    ('AZN', 'Azione', 'TITOLO', 'SYSTEM'),
    ('OBL', 'Obbligazione', 'TITOLO', 'SYSTEM'),
    ('ETF', 'Exchange Traded Fund', 'FONDO', 'SYSTEM')
ON CONFLICT (codice) DO NOTHING;

-- ============================================
-- Create database user for application (if needed)
-- Note: This should be run by a superuser
-- ============================================

-- Uncomment the following lines if you need to create a dedicated user
-- CREATE USER batch_investitori WITH PASSWORD 'your_secure_password';
-- GRANT CONNECT ON DATABASE your_database_name TO batch_investitori;
-- GRANT USAGE ON SCHEMA investitori TO batch_investitori;
-- GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA investitori TO batch_investitori;
-- GRANT ALL PRIVILEGES ON ALL SEQUENCES IN SCHEMA investitori TO batch_investitori;

-- ============================================
-- Verification Queries
-- ============================================

-- Count records in each table
DO $$
DECLARE
    interface_count INTEGER;
    product_count INTEGER;
    causale_count INTEGER;
    activity_count INTEGER;
BEGIN
    SELECT COUNT(*) INTO interface_count FROM fin_interfaccia;
    SELECT COUNT(*) INTO product_count FROM fin_prodotto;
    SELECT COUNT(*) INTO causale_count FROM causale_movimento;
    SELECT COUNT(*) INTO activity_count FROM fin_attivita_finanziaria;
    
    RAISE NOTICE 'Seed data loaded successfully:';
    RAISE NOTICE '  - Interfaces: %', interface_count;
    RAISE NOTICE '  - Products: %', product_count;
    RAISE NOTICE '  - Transaction codes: %', causale_count;
    RAISE NOTICE '  - Financial activities: %', activity_count;
END $$;
