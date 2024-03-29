﻿jsx3.lang.Class.defineClass("com.tibco.cmi.businessAgreements.BusinessAgreements",
    jsx3.gui.Block,
    null,
    function(BusinessAgreements,instance){
			
			var systemUtil = com.tibco.cmi.system.util;
      var server = systemUtil.getServer();
			var dwrEngine = com.tibco.cmi.dwr.Engine;
			var dwrService = com.tibco.cmi.dwr.Service;

			instance.onRsrcLoad = function(){				
				this.getServer().subscribe("showAgreementsList", this, this.showAgreementsList);
				this.getAgreementList();
				BusinessAgreements.BALIST;
				
				BusinessAgreements.interval = setInterval(this.getAgreementList,5000);
			};
		
			instance.getAgreementList = function(){
				var me = server.getJSXByName("blkBusinessAgreements");
				var service = dwrEngine.loadService('BIZAGREEMENT','getBAList',[]);
				service.subscribe(dwrService.ON_SUCCESS, me, me._callback_getBAList_onSuccess);
				service.doCall();
			}
			
			instance._callback_getBAList_onSuccess = function(objEvent) {
				var agreementList = objEvent.data;
				BusinessAgreements.BALIST = agreementList;
				var agreementcdf = new jsx3.xml.Document();
				var root = agreementcdf.createDocumentElement("data");
				root.setAttribute("jsxid", "jsxroot");
				
				for(var i = 0;i < agreementList.length;i++) {	
					var record = root.createNode(jsx3.xml.Entity.TYPEELEMENT, "record");
					var item = agreementList[i];
					var agreementId = item.binindex;
					var displayName = item.displayName;
					var isValid = item.isValid;
					var status;
					if(isValid)
						status = "Active";
					else
						status = "Inactive";
					
					record.setAttribute("jsxid", agreementId);
					record.setAttribute("checked",0);
					record.setAttribute("name", displayName);
					record.setAttribute("status", status);
					
					root.appendChild(record);
				}
				server.getJSXByName("mtxAgreements").setSourceXML(agreementcdf);
			  server.getJSXByName("mtxAgreements").repaint();
			}
		
      instance.newAgreements = function() {
				clearInterval(BusinessAgreements.interval);
        var server = com.tibco.cmi;
        var masterDetail = com.tibco.cmi.getJSXByName("mainLayout");
        masterDetail.setSubcontainer1Pct("0",true);
				
				var objContainer = this.getDescendantOfName("blkAddEdit");
				var extPoint = "newAgreement";
				this.getPlugIn().getExtPoint(extPoint).processExts(jsx3.$F(function(ext,xml){
            var uiId = xml.attr("uiId");
            var extPlugIn = ext.getPlugIn();
            extPlugIn.load().when(function(){
                extPlugIn.loadRsrcComponent(uiId,objContainer)});
								setTimeout(function(){server.publish({subject:"newAgreement.getBALIST", BALIST:BusinessAgreements.BALIST});},500);
            }).bind(this)); 
      }
			
			instance.editAgreements = function() {
				clearInterval(BusinessAgreements.interval);
        var masterDetail = server.getJSXByName("mainLayout");
        masterDetail.setSubcontainer1Pct("0",true);
				
				var objContainer = this.getDescendantOfName("blkAddEdit");
				var extPoint = "editAgreement";
				this.getPlugIn().getExtPoint(extPoint).processExts(jsx3.$F(function(ext,xml){
            var uiId = xml.attr("uiId");
            var extPlugIn = ext.getPlugIn();
            extPlugIn.load().when(function(){
                extPlugIn.loadRsrcComponent(uiId,objContainer)});
								var mtx = server.getJSXByName("mtxAgreements");
								var baid = mtx.getSelectedIds()[0];
								var displayName = mtx.getSelectedNodes().get(0).getAttribute("name");
								setTimeout(function(){server.publish({subject:"editAgreement.getBAid", BAid:baid, name:displayName});},500);
            }).bind(this)); 
      }
			
			instance.showAgreementsList = function() {
				this.getAgreementList();
				server.getJSXByName("blkAddEdit").removeChildren();
				var masterDetail = com.tibco.cmi.getJSXByName("mainLayout");
        masterDetail.setSubcontainer1Pct("100%",true);
				BusinessAgreements.interval = setInterval(this.getAgreementList,5000);
			}
			
			instance.deleteBA = function() {
				var itemList = this.getSelectedItem();
				var BAs = [];
				for(var i = 0; i < itemList.size(); i++) {
					var item = itemList.get(i);
					BAs.push(item.getAttribute("jsxid"));
				}
				
				var service = dwrEngine.loadService('BIZAGREEMENT','removeBA',[BAs]);
				service.subscribe(dwrService.ON_SUCCESS, function(){
																									server.getJSXByName("blkBusinessAgreements").getAgreementList();
																									server.getJSXByName("blkBusinessAgreements").changeState(server.getJSXByName("btnRemove"));																				
																								});
				service.doCall();
			}
			
			instance.setEnabled = function(btnEnable, btnRemove) { 
				var mtx = com.tibco.cmi.getJSXByName("mtxAgreements");
				if(btnEnable.getText() == "Enable All") {
					for(var i = 0; i < mtx.getSortedIds().length; i++){
						var recordId = mtx.getSortedIds()[i];
						var record = mtx.getRecordNode(recordId);
						record.setAttribute("checked",1);
						mtx.redrawRecord(recordId, jsx3.xml.CDF.UPDATE);
					}
					btnEnable.setText("Disable All",true);
					btnRemove.setEnabled(1);
				}
				
				else {
					for(var i = 0; i < mtx.getSortedIds().length; i++){
						var recordId = mtx.getSortedIds()[i];
						var record = mtx.getRecordNode(recordId);
						record.setAttribute("checked",0);
						mtx.redrawRecord(recordId, jsx3.xml.CDF.UPDATE);
					}
					btnEnable.setText("Enable All",true);
					btnRemove.setEnabled(0);
				}		
			}
			
			instance.changeState = function(btn) {
				if(this.getSelectedItem().size() == 0)
					btn.setEnabled(0);
				else
				  btn.setEnabled(1);
			}
			
			instance.getSelectedItem = function() {
				var mtx = com.tibco.cmi.getJSXByName("mtxAgreements");
				var xml = mtx.getXML();
				var itemList = xml.selectNodes("//record[@checked='1']");
				return itemList;
			}
    })