package com.topfinance.cfg.jpa;

// Generated 2009-6-19 13:56:29 by Hibernate Tools 3.2.2.GA

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.topfinance.cfg.ICfgOperation;

/**
 * SysDepartment generated by hbm2java
 */
@Entity
@Table(name = "T_CFG_OPERATION")
public class JpaCfgOperation implements ICfgOperation, java.io.Serializable {

    // oid 主键 integer
    private Integer uid;

    // NAME 名称 varchar2(40)
    private String name;


    private JpaCfgFormat format;


//	// UP_MF 上行转换模板 varchar2
//    private String upMappingFile;
//
//    // DOWN_MF 下行转换模板 varchar2
//    private String downMappingFile;

    // UP_PP_REPLY_TYPE 上行PP响应模式 varchar2
    private String upPpReplyType;
    
    // DOWN_PP_REPLY_TYPE 下行PP响应模式 varchar2
    private String downPpReplyType;
    
    // PROT_ID 业务协议 integer
    private JpaCfgProtocol protocol;

    public JpaCfgOperation() {
    }

    @Id
    @Column(name = "OID", nullable = false)
    @SequenceGenerator(name = "CFG_OPERATION_GEN", sequenceName = "S_CFG_SEQUNCE")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "CFG_OPERATION_GEN")
    public Integer getUid() {
        return this.uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    
//    @Column(name="UP_MF", nullable=true)
//    public String getUpMappingFile() {
//        return upMappingFile;
//    }
//
//    public void setUpMappingFile(String upMappingFile) {
//        this.upMappingFile = upMappingFile;
//    }
//
//    @Column(name="DOWN_MF", nullable=true)
//    public String getDownMappingFile() {
//        return downMappingFile;
//    }
//
//    public void setDownMappingFile(String downMappingFile) {
//        this.downMappingFile = downMappingFile;
//    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "PROT_ID")
    public JpaCfgProtocol getProtocol() {
        return protocol;
    }

    public void setProtocol(JpaCfgProtocol cfgProtocol) {
        this.protocol = cfgProtocol;
    }
    
    @Column(name="UP_PP_REPLY_TYPE", nullable=true)
    public String getUpPpReplyType() {
        return upPpReplyType;
    }

    public void setUpPpReplyType(String upPpReplyType) {
        this.upPpReplyType = upPpReplyType;
    }
    
    @Column(name="DOWN_PP_REPLY_TYPE", nullable=true)
    public String getDownPpReplyType() {
        return downPpReplyType;
    }

    public void setDownPpReplyType(String downPpReplyType) {
        this.downPpReplyType = downPpReplyType;
    }
    
    
    @ManyToOne(fetch = FetchType.EAGER, optional=true)
    @JoinColumn(name = "FORMAT_ID")
	public JpaCfgFormat getFormat() {
		return format;
	}

	public void setFormat(JpaCfgFormat format) {
		this.format = format;
	}
	
	
}
