-- Sample Test Data for Development and Testing
-- PostgreSQL 17 Database
-- This file can be used to populate the database with sample data for testing

SET search_path TO investitori, public;

-- ============================================
-- Sample Promoters (Financial Advisors)
-- ============================================

INSERT INTO fin_promotore (cod_rete, cod_comp, cod_promotore, nome, cognome, utente_inserimento) VALUES
    ('RETE01', '99', 'PROM001', 'Mario', 'Rossi', 'SYSTEM'),
    ('RETE01', '99', 'PROM002', 'Luigi', 'Bianchi', 'SYSTEM'),
    ('RETE02', '99', 'PROM003', 'Giovanni', 'Verdi', 'SYSTEM'),
    ('RETE02', '01', 'PROM004', 'Paolo', 'Neri', 'SYSTEM')
ON CONFLICT (cod_rete, cod_comp, cod_promotore) DO NOTHING;

-- ============================================
-- Sample Contracts
-- ============================================

-- Insert sample GP contracts
INSERT INTO fin_contratto (num_contratto, tipo, prodotto_id, interfaccia_id, stato, data_apertura, utente_inserimento)
SELECT 
    'GP' || LPAD(i::text, 6, '0'),
    'GPM',
    p.prodotto_id,
    if.interfaccia_id,
    'A',
    CURRENT_DATE - (i * 30 || ' days')::interval,
    'SYSTEM'
FROM generate_series(1, 5) AS i
CROSS JOIN (SELECT prodotto_id FROM fin_prodotto WHERE tipo = 'GPM' LIMIT 1) p
CROSS JOIN (SELECT interfaccia_id FROM fin_interfaccia WHERE interfaccia = 'RAM' LIMIT 1) if
ON CONFLICT DO NOTHING;

-- Link GP contracts
INSERT INTO fin_gp (contratto_id, tipo_gp, num_contratto, codice_prodotto, utente_inserimento)
SELECT 
    c.contratto_id,
    'GPM',
    c.num_contratto,
    'GPM001',
    'SYSTEM'
FROM fin_contratto c
WHERE c.tipo = 'GPM'
ON CONFLICT DO NOTHING;

-- ============================================
-- Sample Positions
-- ============================================

INSERT INTO fin_posizione (contratto_id, attivita_fin_id, stato_posizione, data_apertura, importo_apertura, saldo_corrente, utente_inserimento)
SELECT 
    c.contratto_id,
    af.attivita_fin_id,
    'A',
    c.data_apertura,
    10000.00 + (random() * 90000)::numeric(18,2),
    8000.00 + (random() * 92000)::numeric(18,2),
    'SYSTEM'
FROM fin_contratto c
CROSS JOIN (SELECT attivita_fin_id FROM fin_attivita_finanziaria WHERE codice = 'LIQ' LIMIT 1) af
WHERE c.tipo = 'GPM'
ON CONFLICT DO NOTHING;

-- ============================================
-- Sample Orders
-- ============================================

INSERT INTO fin_ordine (num_ordine, contratto_id, posizione_id, tipo_ordine, stato, data_ordine, importo, utente_inserimento)
SELECT 
    'ORD' || LPAD(i::text, 8, '0'),
    p.contratto_id,
    p.posizione_id,
    CASE (random() * 2)::int WHEN 0 THEN 'ACQUISTO' ELSE 'VENDITA' END,
    'ESEGUITO',
    CURRENT_DATE - (i || ' days')::interval,
    1000.00 + (random() * 9000)::numeric(18,2),
    'SYSTEM'
FROM generate_series(1, 10) AS i
CROSS JOIN (SELECT contratto_id, posizione_id FROM fin_posizione LIMIT 1) p
ON CONFLICT DO NOTHING;

-- ============================================
-- Sample Movements
-- ============================================

INSERT INTO fin_movimento (
    num_mov_ext, contratto_id, posizione_id, attivita_fin_id, ordine_id, promotore_id,
    causale, descrizione, tipo_prodotto, codice_agente,
    imp_versato_lordo, imp_prelev_lordo, ctv_lordo, ctv_netto, commissioni,
    prezzo, prezzo_valuta, quantita, cambio, divisa,
    data_movimento, data_competenza, data_registraz, data_regolamento, data_valuta, data_esecuzione,
    fnd_destinazione, utente_inserimento
)
SELECT 
    'MOV' || LPAD(i::text, 10, '0'),
    p.contratto_id,
    p.posizione_id,
    p.attivita_fin_id,
    o.ordine_id,
    pr.promotore_id,
    'GLEDIN',
    'Movimento di test ' || i,
    'GPM',
    pr.cod_promotore,
    CASE WHEN (random() > 0.5) THEN 5000.00 + (random() * 5000)::numeric(18,2) ELSE NULL END,
    CASE WHEN (random() <= 0.5) THEN 5000.00 + (random() * 5000)::numeric(18,2) ELSE NULL END,
    (4000.00 + (random() * 6000))::numeric(18,2),
    (3900.00 + (random() * 6000))::numeric(18,2),
    (50.00 + (random() * 150))::numeric(18,2),
    (100.00 + (random() * 100))::numeric(18,6),
    (100.00 + (random() * 100))::numeric(18,6),
    (10.00 + (random() * 90))::numeric(18,6),
    1.000000,
    '242',
    CURRENT_DATE - (i || ' days')::interval,
    CURRENT_DATE - (i || ' days')::interval,
    CURRENT_DATE - (i || ' days')::interval,
    CURRENT_DATE - (i || ' days')::interval + interval '2 days',
    CURRENT_DATE - (i || ' days')::interval + interval '2 days',
    CURRENT_DATE - (i || ' days')::interval,
    'IT0001234567;Fondo Test',
    'SYSTEM'
FROM generate_series(1, 20) AS i
CROSS JOIN (SELECT contratto_id, posizione_id, attivita_fin_id FROM fin_posizione LIMIT 1) p
CROSS JOIN (SELECT ordine_id FROM fin_ordine LIMIT 1) o
CROSS JOIN (SELECT promotore_id, cod_promotore FROM fin_promotore LIMIT 1) pr
ON CONFLICT DO NOTHING;

-- ============================================
-- Sample Payment Dispositions
-- ============================================

INSERT INTO fin_disp_pagamento (movimento_id, mezzo_pagamento, importo, stato, data_pagamento, utente_inserimento)
SELECT 
    m.movimento_id,
    'PS',
    m.ctv_lordo,
    'ESEGUITO',
    m.data_valuta,
    'SYSTEM'
FROM fin_movimento m
WHERE m.causale IN ('GLEDIN', 'GLESIN')
LIMIT 5
ON CONFLICT DO NOTHING;

-- ============================================
-- Sample Staging Data
-- ============================================

-- Sample movements in staging table
INSERT INTO flx_investitori_movimenti (
    numero_riferimento, tipo_prod, numero_rapporto, codice_causale_mov, causale_movimento,
    segno_mov, importo_movimento, commissione_cliente, segno_comm_cli,
    codice_isin, descrizione_titolo, prezzo, quantita_titolo, cambio,
    data_movimento, data_valuta, data_contabile,
    codice_rete, codice_compagnia, codice_agente, rif_ordine, stato
)
SELECT 
    'RIFEXT' || LPAD(i::text, 10, '0'),
    'GPM',
    'GP' || LPAD((i % 5 + 1)::text, 6, '0'),
    'GLEDIN',
    'Versamento',
    '+',
    (5000.00 + (random() * 5000))::numeric(18,2),
    (50.00 + (random() * 150))::numeric(18,2),
    '+',
    'IT000' || LPAD(i::text, 7, '0'),
    'Titolo Test ' || i,
    (100.00 + (random() * 100))::numeric(18,6),
    (10.00 + (random() * 90))::numeric(18,6),
    1.000000,
    CURRENT_DATE - (i || ' days')::interval,
    CURRENT_DATE - (i || ' days')::interval + interval '2 days',
    CURRENT_DATE - (i || ' days')::interval,
    'RETE01',
    '99',
    'PROM001',
    '*',
    'PENDING'
FROM generate_series(1, 10) AS i
ON CONFLICT DO NOTHING;

-- Sample customer data in staging table
INSERT INTO flx_investitori_anagrafica (
    numero_rapporto, tipo_prod, codice_fiscale, cognome, nome, data_nascita,
    comune_nascita, provincia_nascita, indirizzo, cap, comune, provincia,
    telefono, email, stato
)
SELECT 
    'GP' || LPAD(i::text, 6, '0'),
    'GPM',
    'RSSMRA' || (60 + i)::text || 'A01H501' || CHAR(64 + i),
    CASE (i % 4) 
        WHEN 0 THEN 'Rossi'
        WHEN 1 THEN 'Bianchi'
        WHEN 2 THEN 'Verdi'
        ELSE 'Neri'
    END,
    CASE (i % 4)
        WHEN 0 THEN 'Mario'
        WHEN 1 THEN 'Luigi'
        WHEN 2 THEN 'Giovanni'
        ELSE 'Paolo'
    END,
    CURRENT_DATE - ((20 + i) * 365 || ' days')::interval,
    'Roma',
    'RM',
    'Via Test ' || i,
    '0010' || i,
    'Roma',
    'RM',
    '+39 06 ' || LPAD(i::text, 8, '0'),
    'test' || i || '@example.com',
    'PENDING'
FROM generate_series(1, 5) AS i
ON CONFLICT DO NOTHING;

-- ============================================
-- Sample Batch Execution Logs
-- ============================================

INSERT INTO tbl_exe_log (
    batch_name, execution_date, start_time, end_time, status,
    total_records, processed_records, success_records, warning_records, error_records,
    user_name
)
VALUES
    ('MOVIMENTI_GP', CURRENT_TIMESTAMP - interval '1 day', CURRENT_TIMESTAMP - interval '1 day', CURRENT_TIMESTAMP - interval '1 day' + interval '30 minutes', 'COMPLETED', 100, 100, 95, 4, 1, 'BatchUser'),
    ('ANAG_INVESTITORI', CURRENT_TIMESTAMP - interval '2 days', CURRENT_TIMESTAMP - interval '2 days', CURRENT_TIMESTAMP - interval '2 days' + interval '15 minutes', 'COMPLETED', 50, 50, 50, 0, 0, 'BatchUser'),
    ('CONTRATTI_GP', CURRENT_TIMESTAMP - interval '3 days', CURRENT_TIMESTAMP - interval '3 days', CURRENT_TIMESTAMP - interval '3 days' + interval '20 minutes', 'COMPLETED', 75, 75, 70, 5, 0, 'BatchUser')
ON CONFLICT DO NOTHING;

-- ============================================
-- Verification
-- ============================================

DO $$
DECLARE
    promoter_count INTEGER;
    contract_count INTEGER;
    position_count INTEGER;
    movement_count INTEGER;
    staging_count INTEGER;
BEGIN
    SELECT COUNT(*) INTO promoter_count FROM fin_promotore WHERE utente_inserimento = 'SYSTEM';
    SELECT COUNT(*) INTO contract_count FROM fin_contratto WHERE utente_inserimento = 'SYSTEM';
    SELECT COUNT(*) INTO position_count FROM fin_posizione WHERE utente_inserimento = 'SYSTEM';
    SELECT COUNT(*) INTO movement_count FROM fin_movimento WHERE utente_inserimento = 'SYSTEM';
    SELECT COUNT(*) INTO staging_count FROM flx_investitori_movimenti WHERE stato = 'PENDING';
    
    RAISE NOTICE 'Sample test data loaded successfully:';
    RAISE NOTICE '  - Promoters: %', promoter_count;
    RAISE NOTICE '  - Contracts: %', contract_count;
    RAISE NOTICE '  - Positions: %', position_count;
    RAISE NOTICE '  - Movements: %', movement_count;
    RAISE NOTICE '  - Staging movements: %', staging_count;
END $$;
