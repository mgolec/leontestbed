-- T_MSG_HVPS_111_001_01_A100_02101 generated by ParseSampleXml
 
DROP TABLE IF EXISTS T_MSG_HVPS_111_001_01_A100_02101;

/*==============================================================*/
/* Table: T_MSG_HVPS_111_001_01_A100_02101                                             */
/*==============================================================*/
CREATE TABLE T_MSG_HVPS_111_001_01_A100_02101  (
   UUID			VARCHAR(64)		,
   MSGID			VARCHAR(200)		,
   TS			TIMESTAMP		,
   INDEX PK_T_MSG_IBPS_101_001_01 (UUID)
)Type=InnoDB;

