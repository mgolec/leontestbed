jsx3.lang.Class.defineClass("com.tibco.cmi.editProtocolBinding.EditProtocolBinding",    jsx3.gui.Block,    null,    function(EditProtocolBinding,instance){			var systemUtil = com.tibco.cmi.system.util;      var server = systemUtil.getServer();			var dwrEngine = com.tibco.cmi.dwr.Engine;			var dwrService = com.tibco.cmi.dwr.Service;						instance.onRsrcLoad = function(){				this.getServer().subscribe("showEditProtocol", this, this.showEditProtocol);				this.getServer().subscribe("editProtocolBinding.getProtBindingid",this, this.getProtocolBindingId);					};						instance.getProtocolBindingId = function(objEvent) {				EditProtocolBinding.PBID = objEvent.protBindingId;				EditProtocolBinding.protName = objEvent.protName;									server.getJSXByName("blkEditProtocolTitle").setText("Edit Protocol Binding: " + objEvent.protName);				server.getJSXByName("blkEditProtocolTitle").repaint();				this.getProtocolBindingInfo();					this.getProtocolBindingView();			}						instance.getProtocolBindingInfo = function() {				var me = this;				var service = dwrEngine.loadService('PROTBINDING','getProtBindingByID',[EditProtocolBinding.PBID]);				service.subscribe(dwrService.ON_SUCCESS, me, me._callback_getProtBindingByID_onSuccess);				service.doCall();			}						instance._callback_getProtBindingByID_onSuccess = function(objEvent){				var pb = objEvent.data;				EditProtocolBinding.PB = pb;								if(pb.allowAllops)					server.getJSXByName("isAllowAllops").setChecked(1);				else				  server.getJSXByName("isAllowAllops").setChecked(0);								if(pb.nrAllops)					server.getJSXByName("isNrAllops").setChecked(1);				else					server.getJSXByName("isNrAllops").setChecked(0);			}						instance.getProtocolBindingView = function() {				var me = this;				var service = dwrEngine.loadService('PROTBINDVIEW','getProtBindingViewList',[EditProtocolBinding.PBID]);				service.subscribe(dwrService.ON_SUCCESS, me, me._callback_getProtBindingViewList_onSuccess);				service.doCall();			}						instance._callback_getProtBindingViewList_onSuccess = function(objEvent){				var pbViewList = objEvent.data;								for(var i = 0; i < pbViewList.length;i++) {					var pbView = pbViewList[i];					if(pbView.type == "Host")						EditProtocolBinding.HOSTPBID = pbView.binindex;					else						EditProtocolBinding.PARTNERPBID = pbView.binindex;									}								server.getJSXByName("blkEditProtocolBinding").getHostOPBindingList();				server.getJSXByName("blkEditProtocolBinding").getPartnerOPBindingList();			}						instance.getHostOPBindingList = function(){				var me = this;				var service = dwrEngine.loadService('OPBINDING','getOpBindingList',[EditProtocolBinding.HOSTPBID]);				service.subscribe(dwrService.ON_SUCCESS, me, me._callback_getHostOpBindingList_onSuccess);				service.doCall();			}						instance._callback_getHostOpBindingList_onSuccess = function(objEvent) {				var hostOPList = objEvent.data;				var hostOPcdf = new jsx3.xml.Document();				var root = hostOPcdf.createDocumentElement("data");				root.setAttribute("jsxid", "jsxroot");								for(var i = 0;i < hostOPList.length;i++) {						var record = root.createNode(jsx3.xml.Entity.TYPEELEMENT, "record");					var item = hostOPList[i];					var opId = item.binindex;					var name = item.txId;										record.setAttribute("jsxid", opId);					record.setAttribute("checked",0);					record.setAttribute("operationName", name);										root.appendChild(record);				}				server.getJSXByName("mtxHostOperation").setSourceXML(hostOPcdf);			  server.getJSXByName("mtxHostOperation").repaint();			}						instance.getPartnerOPBindingList = function(){				var me = this;				var service = dwrEngine.loadService('OPBINDING','getOpBindingList',[EditProtocolBinding.PARTNERPBID]);				service.subscribe(dwrService.ON_SUCCESS, me, me._callback_getPartnerOpBindingList_onSuccess);				service.doCall();			}						instance._callback_getPartnerOpBindingList_onSuccess = function(objEvent) {				var partnerOPList = objEvent.data;				var partnerOPcdf = new jsx3.xml.Document();				var root = partnerOPcdf.createDocumentElement("data");				root.setAttribute("jsxid", "jsxroot");								for(var i = 0;i < partnerOPList.length;i++) {						var record = root.createNode(jsx3.xml.Entity.TYPEELEMENT, "record");					var item = partnerOPList[i];					var opId = item.binindex;					var name = item.txId;										record.setAttribute("jsxid", opId);					record.setAttribute("checked",0);					record.setAttribute("operationName", name);										root.appendChild(record);				}				server.getJSXByName("mtxPartnerOperation").setSourceXML(partnerOPcdf);			  server.getJSXByName("mtxPartnerOperation").repaint();			}						instance.removeHost = function(){				var selectItems = this.getSelectedItem(server.getJSXByName("mtxHostOperation"));				this.remove(selectItems,"host");			}						instance.removePartner = function() {				var selectItems = this.getSelectedItem(server.getJSXByName("mtxPartnerOperation"));				this.remove(selectItems,"partner");			}						instance.remove = function(selectItems,type){								var opbs = [];				for(var i = 0; i < selectItems.size(); i++) {					item = selectItems.get(i);					opbs.push(item.getAttribute("jsxid"));				}								var service = dwrEngine.loadService('OPBINDING','removeOpBinding',[opbs]);				service.subscribe(dwrService.ON_SUCCESS, 					function(){										if(type == "host")							server.getJSXByName("blkEditProtocolBinding").getHostOPBindingList();						else							server.getJSXByName("blkEditProtocolBinding").getPartnerOPBindingList();							  					});				service.doCall();			}						instance.saveProtocol = function(){							if(server.getJSXByName("isAllowAllops").getChecked())					EditProtocolBinding.PB.allowAllops = "true";				else				  EditProtocolBinding.PB.allowAllops = "false";								if(server.getJSXByName("isNrAllops").getChecked())					EditProtocolBinding.PB.nrAllops = "true";				else				  EditProtocolBinding.PB.nrAllops = "false";								delete EditProtocolBinding.PB.lastmodified;				var service = dwrEngine.loadService('PROTBINDING','saveProtBinding',[EditProtocolBinding.PB]);				service.doCall();				this.getServer().publish({subject:"showEditAgreement"});							}						instance.cancel = function() {				this.getServer().publish({subject:"showEditAgreement"});				}						instance.newOperation = function(type) {        var server = com.tibco.cmi;        var masterDetail = com.tibco.cmi.getJSXByName("editProtocolLayout");        masterDetail.setSubcontainer1Pct("0",true);								var objContainer = this.getDescendantOfName("blkAddOperation");				var extPoint = "newOperation";				this.getPlugIn().getExtPoint(extPoint).processExts(jsx3.$F(function(ext,xml){            var uiId = xml.attr("uiId");            var extPlugIn = ext.getPlugIn();            extPlugIn.load().when(function(){                extPlugIn.loadRsrcComponent(uiId,objContainer)});								if(type == "host")									setTimeout(function(){server.publish({subject:"newOperationBinding.getPB", PBID:EditProtocolBinding.HOSTPBID, protName:											EditProtocolBinding.protName});},500);								else								  setTimeout(function(){server.publish({subject:"newOperationBinding.getPB", PBID:EditProtocolBinding.PARTNERPBID, protName:											EditProtocolBinding.protName});},500);            }).bind(this));       }						instance.showEditProtocol = function() {				com.tibco.cmi.getJSXByName("blkAddOperation").removeChildren();				var masterDetail = com.tibco.cmi.getJSXByName("editProtocolLayout");        masterDetail.setSubcontainer1Pct("100%",true);				setTimeout(function(){server.getJSXByName("blkEditProtocolBinding").getHostOPBindingList();															server.getJSXByName("blkEditProtocolBinding").getPartnerOPBindingList();},1000);			}						instance.setEnabled = function(btnEnable, btnRemove, type) {				var mtx;				if(type == "host")					mtx = server.getJSXByName("mtxHostOperation");				else				  mtx = server.getJSXByName("mtxPartnerOperation")				if(btnEnable.getText() == "Enable All") {					for(var i = 0; i < mtx.getSortedIds().length; i++){						var recordId = mtx.getSortedIds()[i];						var record = mtx.getRecordNode(recordId);						record.setAttribute("checked",1);						mtx.redrawRecord(recordId, jsx3.xml.CDF.UPDATE);					}					btnEnable.setText("Disable All",true);					btnRemove.setEnabled(1);				}								else {					for(var i = 0; i < mtx.getSortedIds().length; i++){						var recordId = mtx.getSortedIds()[i];						var record = mtx.getRecordNode(recordId);						record.setAttribute("checked",0);						mtx.redrawRecord(recordId, jsx3.xml.CDF.UPDATE);					}					btnEnable.setText("Enable All",true);					btnRemove.setEnabled(0);				}					}						instance.changeState = function(btn, mtx) {				if(this.getSelectedItem(mtx).size() == 0)					btn.setEnabled(0);				else				  btn.setEnabled(1);			}						instance.getSelectedItem = function(mtx) {				var xml = mtx.getXML();				var itemList = xml.selectNodes("//record[@checked='1']");				return itemList;			}    })