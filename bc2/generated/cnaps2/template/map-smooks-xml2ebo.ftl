<?xml version="1.0" encoding="ASCII"?>
<smooks-resource-list xmlns="http://www.milyn.org/xsd/smooks-1.1.xsd" xmlns:jb="http://www.milyn.org/xsd/smooks/javabean-1.2.xsd">
  <params>
    <param name="stream.filter.type">SAX</param>
    <param name="inputType">input.xsd</param>
    <param name="input.xsd.rootElement">Document</param>
    <param name="input.xsd" type="input.type.actived">File:/D:\bankConnector\source\sample\Schema\pacs.008.001.02.xsd</param>
  </params>
  <jb:bean beanId="target" class="${table.pkgName}.${table.destinationClassName}" createOnElement="Document">
<#list table.basicColumns as column>    
		<#if (""!=column.xmlPath)>
		<jb:value data="${column.xmlPath}" property="${column.variableName}"/>    
		</#if>
</#list>   
	</jb:bean>
</smooks-resource-list>  
    
    