-- T_MSG_IBPS_102_001_01 generated by ParseSampleXml
 
DROP TABLE IF EXISTS T_MSG_IBPS_102_001_01;

/*==============================================================*/
/* Table: T_MSG_IBPS_102_001_01                                             */
/*==============================================================*/
CREATE TABLE T_MSG_IBPS_102_001_01  (
   UUID			VARCHAR(64)		,
   GRPHDR_MSGID			VARCHAR(200)		,
   CREDTTM			DATE		,
   ORGNLMSGID			VARCHAR(200)		,
   ORGNLMSGNMID			VARCHAR(200)		,
   ADDTLINF			VARCHAR(200)		,
   TXINFANDSTS_STSID			VARCHAR(200)		,
   ORGNLENDTOENDID			VARCHAR(200)		,
   ORGNLTXID			VARCHAR(200)		,
   RSN_PRTRY			VARCHAR(200)		,
   INTRBKSTTLMAMT_VALUE			DOUBLE		,
   INTRBKSTTLMAMT_CCY			VARCHAR(200)		,
   INSTRPRTY			VARCHAR(20)		,
   CTGYPURP_PRTRY			VARCHAR(200)		,
   DBTR_NM			VARCHAR(200)		,
   DBTRACCT_ID_OTHR_ID			VARCHAR(200)		,
   DBTRACCT_ID_OTHR_ISSR			VARCHAR(200)		,
   TP_PRTRY			VARCHAR(200)		,
   CLRSYSMMBID_MMBID			VARCHAR(200)		,
   BRNCHID_ID			VARCHAR(200)		,
   CLRSYSMMBID_MMBID1			VARCHAR(200)		,
   BRNCHID_ID1			VARCHAR(200)		,
   CTRYSUBDVSN			VARCHAR(200)		,
   CDTR_NM			VARCHAR(200)		,
   EMAILADR			VARCHAR(200)		,
   CDTRACCT_ID_OTHR_ID			VARCHAR(200)		,
   CDTRACCT_ID_OTHR_ISSR			VARCHAR(200)		,
   TP_PRTRY1			VARCHAR(200)		,
   TS			TIMESTAMP		,
   INDEX PK_T_MSG_IBPS_101_001_01 (UUID)
)Type=InnoDB;

-- T_MSG_IBPS_101_001_01 generated by ParseSampleXml
 
DROP TABLE IF EXISTS T_MSG_IBPS_101_001_01;

/*==============================================================*/
/* Table: T_MSG_IBPS_101_001_01                                             */
/*==============================================================*/
CREATE TABLE T_MSG_IBPS_101_001_01  (
   UUID			VARCHAR(64)		,
   GRPHDR_MSGID			VARCHAR(200)		,
   CREDTTM			DATE		,
   BTCHBOOKG			CHAR(1)		,
   NBOFTXS			VARCHAR(200)		,
   CTRLSUM			DOUBLE		,
   INTRBKSTTLMDT			DATE		,
   STTLMMTD			VARCHAR(20)		,
   ENDTOENDID			VARCHAR(200)		,
   PMTID_TXID			VARCHAR(200)		,
   INSTRPRTY			VARCHAR(20)		,
   CTGYPURP_PRTRY			VARCHAR(200)		,
   INTRBKSTTLMAMT_VALUE			DOUBLE		,
   INTRBKSTTLMAMT_CCY			VARCHAR(200)		,
   ACCPTNCDTTM			DATE		,
   CHRGBR			VARCHAR(20)		,
   DBTR_NM			VARCHAR(200)		,
   EMAILADR			VARCHAR(200)		,
   DBTRACCT_ID_OTHR_ID			VARCHAR(200)		,
   DBTRACCT_ID_OTHR_ISSR			VARCHAR(200)		,
   TP_PRTRY			VARCHAR(200)		,
   CLRSYSMMBID_MMBID			VARCHAR(200)		,
   BRNCHID_ID			VARCHAR(200)		,
   CTRYSUBDVSN			VARCHAR(200)		,
   CLRSYSMMBID_MMBID1			VARCHAR(200)		,
   BRNCHID_ID1			VARCHAR(200)		,
   CDTR_NM			VARCHAR(200)		,
   CDTRACCT_ID_OTHR_ID			VARCHAR(200)		,
   PURP_PRTRY			VARCHAR(200)		,
   RMTINF_USTRD			VARCHAR(200)		,
   TS			TIMESTAMP		,
   INDEX PK_T_MSG_IBPS_101_001_01 (UUID)
)Type=InnoDB;

-- T_MSG_SAPS_601_001_01 generated by ParseSampleXml
 
DROP TABLE IF EXISTS T_MSG_SAPS_601_001_01;

/*==============================================================*/
/* Table: T_MSG_SAPS_601_001_01                                             */
/*==============================================================*/
CREATE TABLE T_MSG_SAPS_601_001_01  (
   UUID			VARCHAR(64)		,
   GRPHDR_MSGID			VARCHAR(200)		,
   CREDTTM			DATE		,
   EMAILADR			VARCHAR(200)		,
   ADDTLINF			VARCHAR(200)		,
   NTFCTN_ID			VARCHAR(200)		,
   CREDTTM1			DATE		,
   RPTGSRC_PRTRY			VARCHAR(200)		,
   ACCT_ID_OTHR_ID			VARCHAR(200)		,
   RLTDACCT_ID_OTHR_ID			VARCHAR(200)		,
   AMT_VALUE			DOUBLE		,
   AMT_CCY			VARCHAR(200)		,
   CDTDBTIND			VARCHAR(20)		,
   NTRY_STS			VARCHAR(20)		,
   BOOKGDT_DT			DATE		,
   DOMN_CD			VARCHAR(200)		,
   FMLY_CD			VARCHAR(200)		,
   SUBFMLYCD			VARCHAR(200)		,
   AMT_VALUE1			DOUBLE		,
   AMT_CCY1			VARCHAR(200)		,
   CLRSYSREF			VARCHAR(200)		,
   DBTR_NM			VARCHAR(200)		,
   DBTRACCT_ID_OTHR_ID			VARCHAR(200)		,
   DBTRACCT_ID_OTHR_ISSR			VARCHAR(200)		,
   TP_PRTRY			VARCHAR(200)		,
   TS			TIMESTAMP		,
   INDEX PK_T_MSG_IBPS_101_001_01 (UUID)
)Type=InnoDB;

