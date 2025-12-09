-- PostgreSQL 17 Database Schema for Batch Investitori Application
-- This schema supports the financial batch processing system

-- Create application schema
CREATE SCHEMA IF NOT EXISTS investitori;

-- Set search path
SET search_path TO investitori, public;

-- ============================================
-- Core Financial Tables
-- ============================================

-- Table: fin_interfaccia
CREATE TABLE IF NOT EXISTS fin_interfaccia (
    interfaccia_id BIGSERIAL PRIMARY KEY,
    interfaccia VARCHAR(50) NOT NULL,
    descrizione VARCHAR(255),
    data_inserimento TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    utente_inserimento VARCHAR(100),
    data_modifica TIMESTAMP,
    utente_modifica VARCHAR(100),
    CONSTRAINT uk_fin_interfaccia UNIQUE (interfaccia)
);

-- Table: fin_promotore
CREATE TABLE IF NOT EXISTS fin_promotore (
    promotore_id BIGSERIAL PRIMARY KEY,
    cod_rete VARCHAR(20),
    cod_comp VARCHAR(20),
    cod_promotore VARCHAR(50) NOT NULL,
    nome VARCHAR(100),
    cognome VARCHAR(100),
    data_inserimento TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    utente_inserimento VARCHAR(100),
    data_modifica TIMESTAMP,
    utente_modifica VARCHAR(100),
    CONSTRAINT uk_fin_promotore UNIQUE (cod_rete, cod_comp, cod_promotore)
);

-- Table: fin_prodotto
CREATE TABLE IF NOT EXISTS fin_prodotto (
    prodotto_id BIGSERIAL PRIMARY KEY,
    tipo VARCHAR(20) NOT NULL,
    codice VARCHAR(50) NOT NULL,
    descrizione VARCHAR(255),
    data_inserimento TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    utente_inserimento VARCHAR(100),
    data_modifica TIMESTAMP,
    utente_modifica VARCHAR(100),
    CONSTRAINT uk_fin_prodotto UNIQUE (tipo, codice)
);

-- Table: fin_contratto (base table)
CREATE TABLE IF NOT EXISTS fin_contratto (
    contratto_id BIGSERIAL PRIMARY KEY,
    num_contratto VARCHAR(50) NOT NULL,
    tipo VARCHAR(20),
    prodotto_id BIGINT,
    interfaccia_id BIGINT,
    stato VARCHAR(10),
    data_apertura DATE,
    data_chiusura DATE,
    data_inserimento TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    utente_inserimento VARCHAR(100),
    data_modifica TIMESTAMP,
    utente_modifica VARCHAR(100),
    CONSTRAINT fk_contratto_prodotto FOREIGN KEY (prodotto_id) REFERENCES fin_prodotto(prodotto_id),
    CONSTRAINT fk_contratto_interfaccia FOREIGN KEY (interfaccia_id) REFERENCES fin_interfaccia(interfaccia_id)
);

-- Table: fin_gp (extends fin_contratto)
CREATE TABLE IF NOT EXISTS fin_gp (
    gp_id BIGSERIAL PRIMARY KEY,
    contratto_id BIGINT NOT NULL,
    tipo_gp VARCHAR(20),
    num_contratto VARCHAR(50),
    codice_prodotto VARCHAR(50),
    data_inserimento TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    utente_inserimento VARCHAR(100),
    data_modifica TIMESTAMP,
    utente_modifica VARCHAR(100),
    CONSTRAINT fk_gp_contratto FOREIGN KEY (contratto_id) REFERENCES fin_contratto(contratto_id)
);

-- Table: fin_attivita_finanziaria
CREATE TABLE IF NOT EXISTS fin_attivita_finanziaria (
    attivita_fin_id BIGSERIAL PRIMARY KEY,
    codice VARCHAR(50) NOT NULL,
    descrizione VARCHAR(255),
    tipo VARCHAR(50),
    data_inserimento TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    utente_inserimento VARCHAR(100),
    CONSTRAINT uk_fin_attivita_finanziaria UNIQUE (codice)
);

-- Table: fin_posizione
CREATE TABLE IF NOT EXISTS fin_posizione (
    posizione_id BIGSERIAL PRIMARY KEY,
    contratto_id BIGINT NOT NULL,
    attivita_fin_id BIGINT,
    stato_posizione VARCHAR(10),
    data_apertura DATE,
    data_chiusura DATE,
    importo_apertura NUMERIC(18,2),
    saldo_corrente NUMERIC(18,2),
    data_inserimento TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    utente_inserimento VARCHAR(100),
    data_modifica TIMESTAMP,
    utente_modifica VARCHAR(100),
    CONSTRAINT fk_posizione_contratto FOREIGN KEY (contratto_id) REFERENCES fin_contratto(contratto_id),
    CONSTRAINT fk_posizione_attivita FOREIGN KEY (attivita_fin_id) REFERENCES fin_attivita_finanziaria(attivita_fin_id)
);

-- Table: fin_ordine
CREATE TABLE IF NOT EXISTS fin_ordine (
    ordine_id BIGSERIAL PRIMARY KEY,
    num_ordine VARCHAR(50),
    contratto_id BIGINT,
    posizione_id BIGINT,
    tipo_ordine VARCHAR(20),
    stato VARCHAR(20),
    data_ordine DATE,
    importo NUMERIC(18,2),
    quantita NUMERIC(18,6),
    data_inserimento TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    utente_inserimento VARCHAR(100),
    CONSTRAINT fk_ordine_contratto FOREIGN KEY (contratto_id) REFERENCES fin_contratto(contratto_id),
    CONSTRAINT fk_ordine_posizione FOREIGN KEY (posizione_id) REFERENCES fin_posizione(posizione_id)
);

-- Table: fin_movimento
CREATE TABLE IF NOT EXISTS fin_movimento (
    movimento_id BIGSERIAL PRIMARY KEY,
    num_mov_ext VARCHAR(50),
    contratto_id BIGINT NOT NULL,
    posizione_id BIGINT,
    attivita_fin_id BIGINT,
    ordine_id BIGINT,
    promotore_id BIGINT,
    causale VARCHAR(50),
    descrizione VARCHAR(500),
    tipo_prodotto VARCHAR(20),
    codice_agente VARCHAR(50),
    
    -- Amounts
    imp_versato_lordo NUMERIC(18,2),
    imp_prelev_lordo NUMERIC(18,2),
    ctv_lordo NUMERIC(18,2),
    ctv_netto NUMERIC(18,2),
    commissioni NUMERIC(18,2),
    
    -- Pricing
    prezzo NUMERIC(18,6),
    prezzo_valuta NUMERIC(18,6),
    quantita NUMERIC(18,6),
    cambio NUMERIC(18,6),
    divisa VARCHAR(10),
    
    -- Dates
    data_movimento DATE,
    data_competenza DATE,
    data_registraz DATE,
    data_regolamento DATE,
    data_valuta DATE,
    data_esecuzione DATE,
    
    -- Additional info
    fnd_destinazione VARCHAR(500),
    
    -- Audit fields
    data_inserimento TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    utente_inserimento VARCHAR(100),
    data_modifica TIMESTAMP,
    utente_modifica VARCHAR(100),
    
    CONSTRAINT fk_movimento_contratto FOREIGN KEY (contratto_id) REFERENCES fin_contratto(contratto_id),
    CONSTRAINT fk_movimento_posizione FOREIGN KEY (posizione_id) REFERENCES fin_posizione(posizione_id),
    CONSTRAINT fk_movimento_attivita FOREIGN KEY (attivita_fin_id) REFERENCES fin_attivita_finanziaria(attivita_fin_id),
    CONSTRAINT fk_movimento_ordine FOREIGN KEY (ordine_id) REFERENCES fin_ordine(ordine_id),
    CONSTRAINT fk_movimento_promotore FOREIGN KEY (promotore_id) REFERENCES fin_promotore(promotore_id)
);

-- Table: fin_disp_pagamento
CREATE TABLE IF NOT EXISTS fin_disp_pagamento (
    disp_pagamento_id BIGSERIAL PRIMARY KEY,
    movimento_id BIGINT NOT NULL,
    mezzo_pagamento VARCHAR(10),
    importo NUMERIC(18,2),
    stato VARCHAR(20),
    data_pagamento DATE,
    data_inserimento TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    utente_inserimento VARCHAR(100),
    CONSTRAINT fk_disp_pagamento_movimento FOREIGN KEY (movimento_id) REFERENCES fin_movimento(movimento_id)
);

-- ============================================
-- Batch Processing Tables
-- ============================================

-- Table: flx_investitori_movimenti (staging table for batch processing)
CREATE TABLE IF NOT EXISTS flx_investitori_movimenti (
    id BIGSERIAL PRIMARY KEY,
    numero_riferimento VARCHAR(50),
    numero_rif_esterno VARCHAR(50),
    tipo_prod VARCHAR(20),
    numero_rapporto VARCHAR(50),
    codice_causale_mov VARCHAR(50),
    causale_movimento VARCHAR(255),
    segno_mov VARCHAR(1),
    importo_movimento NUMERIC(18,2),
    commissione_cliente NUMERIC(18,2),
    segno_comm_cli VARCHAR(1),
    codice_isin VARCHAR(50),
    descrizione_titolo VARCHAR(255),
    prezzo NUMERIC(18,6),
    quantita_titolo NUMERIC(18,6),
    cambio NUMERIC(18,6),
    data_movimento DATE,
    data_valuta DATE,
    data_contabile DATE,
    codice_rete VARCHAR(20),
    codice_compagnia VARCHAR(20),
    codice_agente VARCHAR(50),
    rif_ordine VARCHAR(50),
    data_elab TIMESTAMP,
    descrizione_errore VARCHAR(500),
    stato VARCHAR(20)
);

-- Table: flx_investitori_anagrafica (staging table for customer data)
CREATE TABLE IF NOT EXISTS flx_investitori_anagrafica (
    id BIGSERIAL PRIMARY KEY,
    numero_rapporto VARCHAR(50),
    tipo_prod VARCHAR(20),
    codice_fiscale VARCHAR(50),
    cognome VARCHAR(100),
    nome VARCHAR(100),
    data_nascita DATE,
    comune_nascita VARCHAR(100),
    provincia_nascita VARCHAR(10),
    indirizzo VARCHAR(255),
    cap VARCHAR(10),
    comune VARCHAR(100),
    provincia VARCHAR(10),
    telefono VARCHAR(50),
    email VARCHAR(255),
    data_elab TIMESTAMP,
    descrizione_errore VARCHAR(500),
    stato VARCHAR(20)
);

-- Table: flx_investitori_contratti (staging table for contracts)
CREATE TABLE IF NOT EXISTS flx_investitori_contratti (
    id BIGSERIAL PRIMARY KEY,
    numero_contratto VARCHAR(50),
    tipo_contratto VARCHAR(20),
    codice_prodotto VARCHAR(50),
    data_apertura DATE,
    data_chiusura DATE,
    stato VARCHAR(20),
    codice_fiscale VARCHAR(50),
    data_elab TIMESTAMP,
    descrizione_errore VARCHAR(500)
);

-- ============================================
-- Batch Execution Logging Tables
-- ============================================

-- Table: tbl_exe_log (execution log)
CREATE TABLE IF NOT EXISTS tbl_exe_log (
    log_id BIGSERIAL PRIMARY KEY,
    batch_name VARCHAR(100) NOT NULL,
    execution_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    start_time TIMESTAMP,
    end_time TIMESTAMP,
    status VARCHAR(20),
    total_records INTEGER,
    processed_records INTEGER,
    success_records INTEGER,
    warning_records INTEGER,
    error_records INTEGER,
    error_message TEXT,
    user_name VARCHAR(100)
);

-- Table: tbl_commit (commit tracking)
CREATE TABLE IF NOT EXISTS tbl_commit (
    commit_id BIGSERIAL PRIMARY KEY,
    log_id BIGINT,
    commit_point INTEGER,
    commit_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    records_committed INTEGER,
    CONSTRAINT fk_commit_log FOREIGN KEY (log_id) REFERENCES tbl_exe_log(log_id)
);

-- ============================================
-- Reference/Lookup Tables
-- ============================================

-- Table: causale_movimento (transaction reason codes)
CREATE TABLE IF NOT EXISTS causale_movimento (
    causale_id BIGSERIAL PRIMARY KEY,
    codice_esterno VARCHAR(50) NOT NULL,
    codice_interno VARCHAR(50) NOT NULL,
    descrizione VARCHAR(255),
    tipo VARCHAR(50),
    CONSTRAINT uk_causale_movimento UNIQUE (codice_esterno)
);

-- ============================================
-- Indexes for Performance
-- ============================================

-- Indexes for fin_contratto
CREATE INDEX IF NOT EXISTS idx_fin_contratto_num ON fin_contratto(num_contratto);
CREATE INDEX IF NOT EXISTS idx_fin_contratto_tipo ON fin_contratto(tipo);
CREATE INDEX IF NOT EXISTS idx_fin_contratto_interfaccia ON fin_contratto(interfaccia_id);

-- Indexes for fin_posizione
CREATE INDEX IF NOT EXISTS idx_fin_posizione_contratto ON fin_posizione(contratto_id);
CREATE INDEX IF NOT EXISTS idx_fin_posizione_stato ON fin_posizione(stato_posizione);

-- Indexes for fin_movimento
CREATE INDEX IF NOT EXISTS idx_fin_movimento_num_ext ON fin_movimento(num_mov_ext);
CREATE INDEX IF NOT EXISTS idx_fin_movimento_contratto ON fin_movimento(contratto_id);
CREATE INDEX IF NOT EXISTS idx_fin_movimento_posizione ON fin_movimento(posizione_id);
CREATE INDEX IF NOT EXISTS idx_fin_movimento_data ON fin_movimento(data_movimento);
CREATE INDEX IF NOT EXISTS idx_fin_movimento_causale ON fin_movimento(causale);

-- Indexes for fin_promotore
CREATE INDEX IF NOT EXISTS idx_fin_promotore_cod ON fin_promotore(cod_promotore);
CREATE INDEX IF NOT EXISTS idx_fin_promotore_rete ON fin_promotore(cod_rete, cod_comp);

-- Indexes for batch processing tables
CREATE INDEX IF NOT EXISTS idx_flx_mov_numero_rif ON flx_investitori_movimenti(numero_riferimento);
CREATE INDEX IF NOT EXISTS idx_flx_mov_rapporto ON flx_investitori_movimenti(numero_rapporto);
CREATE INDEX IF NOT EXISTS idx_flx_mov_stato ON flx_investitori_movimenti(stato);
CREATE INDEX IF NOT EXISTS idx_flx_mov_data_elab ON flx_investitori_movimenti(data_elab);

CREATE INDEX IF NOT EXISTS idx_flx_anag_rapporto ON flx_investitori_anagrafica(numero_rapporto);
CREATE INDEX IF NOT EXISTS idx_flx_anag_cf ON flx_investitori_anagrafica(codice_fiscale);
CREATE INDEX IF NOT EXISTS idx_flx_anag_stato ON flx_investitori_anagrafica(stato);

-- ============================================
-- Comments
-- ============================================

COMMENT ON SCHEMA investitori IS 'Schema for Batch Investitori financial application';
COMMENT ON TABLE fin_movimento IS 'Financial transactions/movements';
COMMENT ON TABLE fin_contratto IS 'Financial contracts';
COMMENT ON TABLE fin_posizione IS 'Financial positions within contracts';
COMMENT ON TABLE flx_investitori_movimenti IS 'Staging table for incoming transaction data';
COMMENT ON TABLE tbl_exe_log IS 'Batch execution log for tracking processing runs';
