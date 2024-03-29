-- T_MSG_IBPS_102_001_01 generated by ParseSampleXml
 
DROP TABLE T_MSG_IBPS_102_001_01 CASCADE CONSTRAINTS;

/*==============================================================*/
/* Table: T_MSG_IBPS_102_001_01                                             */
/*==============================================================*/
CREATE TABLE T_MSG_IBPS_102_001_01  (
   UUID			VARCHAR2(64)		,
   GRPHDR_MSGID			VARCHAR2(200)		,
   CREDTTM			DATE		,
   ORGNLMSGID			VARCHAR2(200)		,
   ORGNLMSGNMID			VARCHAR2(200)		,
   ADDTLINF			VARCHAR2(200)		,
   TXINFANDSTS_STSID			VARCHAR2(200)		,
   ORGNLENDTOENDID			VARCHAR2(200)		,
   ORGNLTXID			VARCHAR2(200)		,
   RSN_PRTRY			VARCHAR2(200)		,
   INTRBKSTTLMAMT_VALUE			NUMBER		,
   INTRBKSTTLMAMT_CCY			VARCHAR2(200)		,
   INSTRPRTY			VARCHAR2(20)		,
   CTGYPURP_PRTRY			VARCHAR2(200)		,
   DBTR_NM			VARCHAR2(200)		,
   DBTRACCT_ID_OTHR_ID			VARCHAR2(200)		,
   DBTRACCT_ID_OTHR_ISSR			VARCHAR2(200)		,
   TP_PRTRY			VARCHAR2(200)		,
   CLRSYSMMBID_MMBID			VARCHAR2(200)		,
   BRNCHID_ID			VARCHAR2(200)		,
   CLRSYSMMBID_MMBID1			VARCHAR2(200)		,
   BRNCHID_ID1			VARCHAR2(200)		,
   CTRYSUBDVSN			VARCHAR2(200)		,
   CDTR_NM			VARCHAR2(200)		,
   EMAILADR			VARCHAR2(200)		,
   CDTRACCT_ID_OTHR_ID			VARCHAR2(200)		,
   CDTRACCT_ID_OTHR_ISSR			VARCHAR2(200)		,
   TP_PRTRY1			VARCHAR2(200)		,
   TS			TIMESTAMP		DEFAULT SYSTIMESTAMP,
   CONSTRAINT PK_T_MSG_IBPS_102_001_01 PRIMARY KEY (UUID)
);

COMMENT ON TABLE T_MSG_IBPS_102_001_01 IS
'网银贷记业务回执表';

COMMENT ON COLUMN T_MSG_IBPS_102_001_01.UUID IS 
'UUID';

COMMENT ON COLUMN T_MSG_IBPS_102_001_01.GRPHDR_MSGID IS 
'报文标识号';

COMMENT ON COLUMN T_MSG_IBPS_102_001_01.CREDTTM IS 
'报文发送时间';

COMMENT ON COLUMN T_MSG_IBPS_102_001_01.ORGNLMSGID IS 
'原报文标识号';

COMMENT ON COLUMN T_MSG_IBPS_102_001_01.ORGNLMSGNMID IS 
'原报文类型代码';

COMMENT ON COLUMN T_MSG_IBPS_102_001_01.ADDTLINF IS 
'业务回执附言';

COMMENT ON COLUMN T_MSG_IBPS_102_001_01.TXINFANDSTS_STSID IS 
'业务状态';

COMMENT ON COLUMN T_MSG_IBPS_102_001_01.ORGNLENDTOENDID IS 
'原端到端标识号';

COMMENT ON COLUMN T_MSG_IBPS_102_001_01.ORGNLTXID IS 
'原交易标识号';

COMMENT ON COLUMN T_MSG_IBPS_102_001_01.RSN_PRTRY IS 
'业务拒绝码';

COMMENT ON COLUMN T_MSG_IBPS_102_001_01.INTRBKSTTLMAMT_VALUE IS 
'原结算金额';

COMMENT ON COLUMN T_MSG_IBPS_102_001_01.INTRBKSTTLMAMT_CCY IS 
'原货币符号';

COMMENT ON COLUMN T_MSG_IBPS_102_001_01.INSTRPRTY IS 
'编码';

COMMENT ON COLUMN T_MSG_IBPS_102_001_01.CTGYPURP_PRTRY IS 
'原业务类型编码';

COMMENT ON COLUMN T_MSG_IBPS_102_001_01.DBTR_NM IS 
'付款人户名';

COMMENT ON COLUMN T_MSG_IBPS_102_001_01.DBTRACCT_ID_OTHR_ID IS 
'付款人账号';

COMMENT ON COLUMN T_MSG_IBPS_102_001_01.DBTRACCT_ID_OTHR_ISSR IS 
'付款人开户行名称';

COMMENT ON COLUMN T_MSG_IBPS_102_001_01.TP_PRTRY IS 
'付款人账户类型';

COMMENT ON COLUMN T_MSG_IBPS_102_001_01.CLRSYSMMBID_MMBID IS 
'付款清算行行号';

COMMENT ON COLUMN T_MSG_IBPS_102_001_01.BRNCHID_ID IS 
'收款人开户行所属网银系统行号';

COMMENT ON COLUMN T_MSG_IBPS_102_001_01.CLRSYSMMBID_MMBID1 IS 
'收款清算行行号';

COMMENT ON COLUMN T_MSG_IBPS_102_001_01.BRNCHID_ID1 IS 
'收款人开户行所属网银系统行号';

COMMENT ON COLUMN T_MSG_IBPS_102_001_01.CTRYSUBDVSN IS 
'收款人开户行所属城市代码';

COMMENT ON COLUMN T_MSG_IBPS_102_001_01.CDTR_NM IS 
'收款人户名';

COMMENT ON COLUMN T_MSG_IBPS_102_001_01.EMAILADR IS 
'数字签名';

COMMENT ON COLUMN T_MSG_IBPS_102_001_01.CDTRACCT_ID_OTHR_ID IS 
'收款人账号';

COMMENT ON COLUMN T_MSG_IBPS_102_001_01.CDTRACCT_ID_OTHR_ISSR IS 
'收款人开户行名称';

COMMENT ON COLUMN T_MSG_IBPS_102_001_01.TP_PRTRY1 IS 
'收款人账户类型';

COMMENT ON COLUMN T_MSG_IBPS_102_001_01.TS IS 
'时间戳';

