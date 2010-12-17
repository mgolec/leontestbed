package com.topfinance.cfg.xml;

import org.simpleframework.xml.Attribute;
import com.topfinance.cfg.ICfgUpInMH;

public class OmCfgUpInMH implements ICfgUpInMH {
    
    @Attribute(required=false)
    private String name;
    @Attribute(required=false)
    private String clazz;
    
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getClazz() {
        return clazz;
    }
    public void setClazz(String clazz) {
        this.clazz = clazz;
    }
    


}
