DROP TABLE IF EXISTS TBL_TRANSACTION;
--:

DROP TABLE IF EXISTS TBL_TRANSACTION_DETAIL;
--:

DROP TABLE IF EXISTS TBL_HIBERENTRY;
--:

CREATE TABLE TBL_TRANSACTION (        
        AUDIT_ID          VARCHAR(255)    PRIMARY KEY,
        DOC_ID           VARCHAR(255)    NULL,
        TX_ID        VARCHAR(255)    NULL,
        OP_NAME        VARCHAR(512)    NULL,
        PARTNER             VARCHAR(128)    NULL,
        HOST           VARCHAR(128)    NULL,
        STATUS             VARCHAR(64)     NULL,
        DIRECTION      VARCHAR(5)      null,        
        DESCRIPTION    VARCHAR(1024)     NULL,
        TS                 TIMESTAMP	not null,
        STARTDATE          TIMESTAMP    not null,
    INDEX TBL_TRANSACTION_AUDITID (AUDIT_ID)
) Type=InnoDB;
--:

CREATE TABLE TBL_TRANSACTION_DETAIL (        
        U_ID          VARCHAR(255)    PRIMARY KEY,
        AUDIT_ID          VARCHAR(255) not null,
        STATUS             VARCHAR(64)     NULL,
        STATE             VARCHAR(64)     NULL,        
        DESCRIPTION    VARCHAR(1024)     NULL,
        TS                 TIMESTAMP	not null,
    INDEX TBL_TRANSACTION_AUDITID (AUDIT_ID)
) Type=InnoDB;
--:

CREATE TABLE TBL_HIBERENTRY (        
        HIBERKEY          VARCHAR(255)    PRIMARY KEY,
        TX_ID        			VARCHAR(255)    NULL,
        AUDIT_ID        	VARCHAR(512)    NULL,
        STATUS             VARCHAR(64)     NULL,
        TS                 TIMESTAMP	not null,
        EXPIRATION         bigint(20) unsigned  not null,
    INDEX TBL_TRANSACTION_AUDITID (AUDIT_ID)
) Type=InnoDB;
--: