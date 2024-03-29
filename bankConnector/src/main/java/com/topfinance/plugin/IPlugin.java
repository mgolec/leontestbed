package com.topfinance.plugin;

import com.topfinance.runtime.DWMessageContext;
import com.topfinance.runtime.DownwardProcessor;
import com.topfinance.runtime.OperationDefinitions;
import com.topfinance.runtime.UWMessageContext;
import com.topfinance.runtime.UpwardProcessor;
import org.apache.camel.Exchange;

public interface IPlugin {
    
    public DWMessageContext createDWMessageContext(Exchange exchange);
    public UWMessageContext createUWMessageContext(Exchange exchange);
    
    public UpwardProcessor createUpwardProcessor();
    public DownwardProcessor createDownwardProcessor();
    
    public OperationDefinitions loadOperationDefinitions();
    
}
