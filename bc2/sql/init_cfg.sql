----配置支付系统
insert into T_CFG_PROTOCOL  (OID,NAME,CONFIG,"IS_ACTIVE") values(S_CFG_SEQUNCE.NEXTVAL,'CNAPS2','','Y');

----配置参数集
insert into "T_CFG_CONFIG_SET"  (ID,PROVIDER,"CFG_KEY","CFG_DFT_VAL") values(S_CFG_SEQUNCE.NEXTVAL,'AMQ','brokerUrl','');
insert into "T_CFG_CONFIG_SET"  (ID,PROVIDER,"CFG_KEY","CFG_DFT_VAL") values(S_CFG_SEQUNCE.NEXTVAL,'AMQ','maxConsumer','');
insert into "T_CFG_CONFIG_SET"  (ID,PROVIDER,"CFG_KEY","CFG_DFT_VAL") values(S_CFG_SEQUNCE.NEXTVAL,'IBMMQ','hostName','');
insert into "T_CFG_CONFIG_SET"  (ID,PROVIDER,"CFG_KEY","CFG_DFT_VAL") values(S_CFG_SEQUNCE.NEXTVAL,'IBMMQ','port','1414');
insert into "T_CFG_CONFIG_SET"  (ID,PROVIDER,"CFG_KEY","CFG_DFT_VAL") values(S_CFG_SEQUNCE.NEXTVAL,'IBMMQ','queueManager','');
insert into "T_CFG_CONFIG_SET"  (ID,PROVIDER,"CFG_KEY","CFG_DFT_VAL") values(S_CFG_SEQUNCE.NEXTVAL,'IBMMQ','channel','');
insert into "T_CFG_CONFIG_SET"  (ID,PROVIDER,"CFG_KEY","CFG_DFT_VAL") values(S_CFG_SEQUNCE.NEXTVAL,'IBMMQ','transportType','1');
insert into "T_CFG_CONFIG_SET"  (ID,PROVIDER,"CFG_KEY","CFG_DFT_VAL") values(S_CFG_SEQUNCE.NEXTVAL,'IBMMQ','ccsid','1381');
insert into "T_CFG_CONFIG_SET"  (ID,PROVIDER,"CFG_KEY","CFG_DFT_VAL") values(S_CFG_SEQUNCE.NEXTVAL,'8583','timeout','1000');

----配置供应类型
insert into "T_CFG_PROVIDER_SET"  (ID,PROVIDER,CLAS,"DIRECTION","IS_ACTIVE") values(S_CFG_SEQUNCE.NEXTVAL,'8583','com.topfinance.cfg.xml.OmCfgTransOut8583','OUT','Y');
insert into "T_CFG_PROVIDER_SET"  (ID,PROVIDER,CLAS,"DIRECTION","IS_ACTIVE") values(S_CFG_SEQUNCE.NEXTVAL,'AMQ','com.topfinance.cfg.xml.OmCfgTransOutAMQ','OUT','Y');
insert into "T_CFG_PROVIDER_SET"  (ID,PROVIDER,CLAS,"DIRECTION","IS_ACTIVE") values(S_CFG_SEQUNCE.NEXTVAL,'IBMMQ','com.topfinance.cfg.xml.OmCfgTransOutIBMMQ','OUT','Y');
insert into "T_CFG_PROVIDER_SET"  (ID,PROVIDER,CLAS,"DIRECTION","IS_ACTIVE") values(S_CFG_SEQUNCE.NEXTVAL,'JETTY','com.topfinance.cfg.xml.OmCfgTransOutJetty','OUT','Y');
insert into "T_CFG_PROVIDER_SET"  (ID,PROVIDER,CLAS,"DIRECTION","IS_ACTIVE") values(S_CFG_SEQUNCE.NEXTVAL,'8583','com.topfinance.cfg.xml.OmCfgTransIn8583','IN','Y');
insert into "T_CFG_PROVIDER_SET"  (ID,PROVIDER,CLAS,"DIRECTION","IS_ACTIVE") values(S_CFG_SEQUNCE.NEXTVAL,'AMQ','com.topfinance.cfg.xml.OmCfgTransInAMQ','IN','Y');
insert into "T_CFG_PROVIDER_SET"  (ID,PROVIDER,CLAS,"DIRECTION","IS_ACTIVE") values(S_CFG_SEQUNCE.NEXTVAL,'IBMMQ','com.topfinance.cfg.xml.OmCfgTransInIBMMQ','IN','Y');
insert into "T_CFG_PROVIDER_SET"  (ID,PROVIDER,CLAS,"DIRECTION","IS_ACTIVE") values(S_CFG_SEQUNCE.NEXTVAL,'JETTY','com.topfinance.cfg.xml.OmCfgTransInJetty','IN','Y');

----系统节点
insert into T_CFG_NODE  (OID,NAME,TYPE,"IP") values(S_CFG_SEQUNCE.NEXTVAL,'SYSTEM1','H','192.168.192.168');
insert into T_CFG_NODE  (OID,NAME,TYPE,"IP") values(S_CFG_SEQUNCE.NEXTVAL,'CNAPS2','P','192.168.192.168');

----传输IN
insert into T_CFG_TRANS_IN  (OID,NAME,PREFIX,PROVIDER,CLAS,TYPE,IS_PRIVATE,"CONFIG") values(S_CFG_SEQUNCE.NEXTVAL,'PREFIX_PP_AMQ','interQueue','AMQ','com.topfinance.cfg.xml.OmCfgTransInAMQ','','T','');
insert into T_CFG_TRANS_IN  (OID,NAME,PREFIX,PROVIDER,CLAS,TYPE,IS_PRIVATE,"CONFIG") values(S_CFG_SEQUNCE.NEXTVAL,'PREFIX_PUBLIC_IBMMQ','ibmmqC-A','IBMMQ','com.topfinance.cfg.xml.OmCfgTransInIBMMQ','','F','');
insert into T_CFG_TRANS_IN  (OID,NAME,PREFIX,PROVIDER,CLAS,TYPE,IS_PRIVATE,"CONFIG") values(S_CFG_SEQUNCE.NEXTVAL,'PREFIX_PP_JETTY','jettyA','JETTY','com.topfinance.cfg.xml.OmCfgTransInJetty','','T','');
insert into T_CFG_TRANS_IN  (OID,NAME,PREFIX,PROVIDER,CLAS,TYPE,IS_PRIVATE,"CONFIG") values(S_CFG_SEQUNCE.NEXTVAL,'PREFIX_PUBLIC_AMQ','amqC-A','AMQ','com.topfinance.cfg.xml.OmCfgTransInAMQ','','F','');
insert into T_CFG_TRANS_IN  (OID,NAME,PREFIX,PROVIDER,CLAS,TYPE,IS_PRIVATE,"CONFIG") values(S_CFG_SEQUNCE.NEXTVAL,'PREFIX_PP_8583','Iso8583A','8583','com.topfinance.cfg.xml.OmCfgTransIn8583','','T','');

----传输OUT
insert into T_CFG_TRANS_OUT  (OID,NAME,PREFIX,PROVIDER,CLAS,TYPE,IS_PRIVATE,"CONFIG") values(S_CFG_SEQUNCE.NEXTVAL,'8583','Iso8583OutPP','8583','com.topfinance.cfg.xml.OmCfgTransOut8583','','T','');
insert into T_CFG_TRANS_OUT  (OID,NAME,PREFIX,PROVIDER,CLAS,TYPE,IS_PRIVATE,"CONFIG") values(S_CFG_SEQUNCE.NEXTVAL,'AMQ','AMQOutTP','AMQ','com.topfinance.cfg.xml.OmCfgTransOutAMQ','','F','');
insert into T_CFG_TRANS_OUT  (OID,NAME,PREFIX,PROVIDER,CLAS,TYPE,IS_PRIVATE,"CONFIG") values(S_CFG_SEQUNCE.NEXTVAL,'AMQ','AMQOutPP','AMQ','com.topfinance.cfg.xml.OmCfgTransOutAMQ','','F','');


commit;
