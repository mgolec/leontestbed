-- T_MSG_SAPS_737_001_01___TxList generated by ParseSampleXml
 
DROP TABLE T_MSG_SAPS_737_001_01___TxList CASCADE CONSTRAINTS;

/*==============================================================*/
/* Table: T_MSG_SAPS_737_001_01___TxList                                             */
/*==============================================================*/
CREATE TABLE T_MSG_SAPS_737_001_01___TxList  (
   ID			Integer		,
   MMBID			VARCHAR2(200)		,
   INITLAMT			VARCHAR2(200)		,
   CONSTRAINT PK_T_MSG_SAPS_737_001_01___TxList PRIMARY KEY (UUID)
);

COMMENT ON COLUMN T_MSG_SAPS_737_001_01___TxList.ID IS 
'';

COMMENT ON COLUMN T_MSG_SAPS_737_001_01___TxList.MMBID IS 
'balWorkDayChckngAppl.balWorkDayChckngApplInf.txList[0].mmbId';

COMMENT ON COLUMN T_MSG_SAPS_737_001_01___TxList.INITLAMT IS 
'balWorkDayChckngAppl.balWorkDayChckngApplInf.txList[0].mmbId';

