/*
 * Copyright (c) 2001-2009, TIBCO Software Inc.
 * Use, modification, and distribution subject to terms of license.
 */
jsx3.require("jsx3.gui.Form","jsx3.gui.Block");jsx3.Class.defineClass("jsx3.gui.RadioButton",jsx3.gui.Block,[jsx3.gui.Form],function(k,f){var
ub={A:'" value="',B:'" ',C:"0/0/0",D:' checked="checked" ',E:" ",F:"3.0.00",G:"C0",H:"disabled",I:/<(input .*?)\/>/g,J:"<$1><xsl:if test=\"{0}='1'\"><xsl:attribute name=\"checked\">checked</xsl:attribute></xsl:if><xsl:if test=\"@jsxdisabled='1'\"><xsl:attribute name=\"disabled\">disabled</xsl:attribute></xsl:if></input>",K:"//record[@",L:"='1']",M:"1",a:"jsx30radio",b:"jsxselect",c:"input",d:"radio",e:"click",f:"keydown",g:"span",h:"",i:"relativebox",j:"box",k:"div",l:"inline",m:"input[radio]",n:"100%",o:"0 0 0 18",p:' id="',q:'"',r:' class="',s:"overflow-x:hidden;",t:' class="jsx30radio_tristate" ',u:' type="radio" ',v:"focus",w:"Ik",x:"blur",y:"ah",z:' name="'};k.UNSELECTED=0;k.SELECTED=1;k.DEFAULTCLASSNAME=ub.a;f.init=function(e,a,o,c,s,j,n,r,g){this.jsxsuper(e,a,o,c,s,j);this.setGroupName(r);this.setValue(n);this.setDefaultSelected(g==null?1:g);if(g!=null)this.setSelected(g);};f.getGroupName=function(){return this.jsxgroupname;};f.setGroupName=function(e){this.jsxgroupname=e;};f.qh=function(c,j){this.focus(j);if(!c.leftButton()&&c.isMouseEvent())return;if(this.getSelected()!=1){var
ob=this.doEvent(ub.b,{objEVENT:c,_gipp:1});if(ob!==false)this.setSelected(1,j);}};f._ebKeyDown=function(s,m){if(s.enterKey()){this.qh(s,m);s.cancelAll();}};f.getDefaultSelected=function(){return this.jsxdefaultselected;};f.setDefaultSelected=function(g){this.jsxdefaultselected=g;return this;};f.getSelected=function(){return this.jsxselected!=null?this.jsxselected:this.getDefaultSelected();};f.setSelected=function(q,a){q=q!=null?q:1;this.jsxselected=q;if(a==null)a=this.getRendered();if(a){(jsx3.html.selectSingleElm(a,0,0,0)).checked=q==1;if(q==1){var
lb=this.getSiblings();for(var
Da=0;Da<lb.length;Da++)lb[Da].jsxselected=0;}}return this;};f.getSiblings=function(l){var
ya=[];var
oa=this.getDocument();if(oa==null)return ya;var
Ia=this.getId();var
N=oa.getElementsByName(this.getGroupName());for(var
Ib=0;Ib<N.length;Ib++){var
Fa=N[Ib];if(Fa.nodeName.toLowerCase()==ub.c&&Fa.type.toLowerCase()==ub.d){var
ea=Fa.parentNode.parentNode.parentNode;if(ea.id!=Ia)ya.push(l?[jsx3.GO(ea.id),ea]:jsx3.GO(ea.id));}}return ya;};k.getValue=function(a){var
Ba=document;if(Ba!=null){var
Y=Ba.getElementsByName(a);if(Y!=null){var
wa=Y.length;for(var
bb=0;bb<wa;bb++)if(Y[bb].checked)return Y[bb].value;}}};k.setValue=function(g,b){var
ya=document;if(ya==null)return null;var
Ab=ya.getElementsByName(g);if(Ab!=null){var
Fb=Ab.length;for(var
T=0;T<Fb;T++)if(Ab[T].value==b){var
_=jsx3.GO(Ab[T].parentNode.parentNode.parentNode.id);_.setSelected(1);return _;}}return null;};f.getValue=function(){return this.jsxvalue;};f.setValue=function(p){this.jsxvalue=p;return this;};f.getGroupValue=function(){if(this.getSelected()==1)return this.getValue();var
Pa=this.getSiblings();for(var
Eb=0;Eb<Pa.length;Eb++){var
H=Pa[Eb];if(H.getSelected()==1)return H.getValue();}return null;};f.setGroupValue=function(p){if(this.getValue()==p){if(this.getSelected()!=1)this.setSelected(1);}else{this.jsxselected=0;var
yb=this.getSiblings(true);for(var
T=0;T<yb.length;T++){var
K=yb[T][0];var
ma=yb[T][1];var
X=K.getValue()==p;K.jsxselected=X?1:0;(jsx3.html.selectSingleElm(ma,0,0,0)).checked=X;}}};f.doValidate=function(){this.setValidationState(this.getRequired()==0||this.getGroupValue()!=null?1:0);return this.getValidationState();};k.Tj={};k.Tj[ub.e]=true;k.Tj[ub.f]=true;f.Rc=function(m,j,e){this.ag(m,j,e,3);};f.Vm=function(g){if(this.getParent()&&(g==null||isNaN(g.parentwidth)||isNaN(g.parentheight))){g=(this.getParent()).ng(this);}else if(g==null)g={};var
Q=this.getRelativePosition()!=0&&(!this.getRelativePosition()||this.getRelativePosition()==1);var
hb,ra,w,na;if(g.tagname==null)g.tagname=ub.g;if((hb=this.getBorder())!=null&&hb!=ub.h)g.border=hb;if(Q&&(ra=this.getMargin())!=null&&ra!=ub.h)g.margin=ra;if(!g.boxtype)g.boxtype=Q?ub.i:ub.j;if(g.left==null)g.left=!Q&&!jsx3.util.strEmpty(this.getLeft())?this.getLeft():0;if(g.top==null)g.top=!Q&&!jsx3.util.strEmpty(this.getTop())?this.getTop():0;if(g.height==null)g.height=(w=this.getHeight())!=null?w:18;if(g.width==null)if((na=this.getWidth())!=null)g.width=na;var
Ga=new
jsx3.gui.Painted.Box(g);var
yb={};yb.tagname=ub.k;yb.boxtype=ub.l;var
Aa=new
jsx3.gui.Painted.Box(yb);Ga.bl(Aa);yb={};yb.tagname=ub.g;yb.boxtype=ub.j;yb.width=16;yb.parentheight=Ga.Qi();yb.height=18;var
_=new
jsx3.gui.Painted.Box(yb);Aa.bl(_);yb={};yb.tagname=ub.m;yb.empty=true;yb.omitpos=true;var
Za=new
jsx3.gui.Painted.Box(yb);_.bl(Za);yb={};yb.tagname=ub.g;yb.boxtype=ub.l;yb.top=2;yb.parentheight=Ga.Qi();yb.height=ub.n;yb.padding=ub.o;var
Ca=new
jsx3.gui.Painted.Box(yb);Ga.bl(Ca);return Ga;};f.paint=function(){this.applyDynamicProperties();var
ea=this.getEnabled()==1;var
Ia=ea?this.Pj(k.Tj,0):ub.h;var
Q=this.renderAttributes(null,true);var
H=this.Wl(true);H.setAttributes(ub.p+this.getId()+ub.q+this.di()+ub.r+this.kf()+ub.q+this.Rh()+Ia+Q);H.setStyles((H.getPaintedWidth()?ub.s:ub.h)+this.yg(true)+this.wm()+this.ze()+this._i()+this.Gd()+this.Uc()+this.qg()+this.Ne()+this.en()+this.Ae());var
Ba=H.lg(0);var
Ib=Ba.lg(0);Ib.setAttributes(ub.t);var
O=Ib.lg(0);O.setAttributes(ub.u+this.pi(ub.v,ub.w,3)+this.pi(ub.x,ub.y,3)+ub.z+this.getGroupName()+ub.A+this.getValue()+ub.B+this.fe()+this.paintSelected()+this.uj());var
Ja=H.lg(1);Ja.setAttributes(jsx3.html.pe);return (H.paint()).join((Ba.paint()).join((Ib.paint()).join((O.paint()).join(ub.h))+(Ja.paint()).join(this.ii())));};f.focus=function(b){if(!b)b=this.getRendered();if(b)jsx3.html.focus(jsx3.html.selectSingleElm(b,ub.C));};f.paintSelected=function(){return this.getSelected()==1?ub.D:ub.h;};f.kf=function(){var
ja=this.getClassName();return k.DEFAULTCLASSNAME+(ja?ub.E+ja:ub.h);};k.getVersion=function(){return ub.F;};f.emGetType=function(){return jsx3.gui.Matrix.EditMask.FORMAT;};f.emInit=function(r){this.jsxsupermix(r);this.subscribe(ub.b,this,ub.G);};f.emSetValue=function(m){this.jsxselected=Number(m)==1?1:0;};f.emGetValue=function(){var
nb=this.emGetSession();if(nb)return nb.column.getValueForRecord(nb.recordId);return null;};f.emBeginEdit=function(q,n,i,c,h,a,o){var
Q=jsx3.html.selectSingleElm(o,0,0,0,0,0);if(Q&&!Q.getAttribute(ub.H)){this.jsxsupermix(q,n,i,c,h,a,o);jsx3.html.focus(Q);}else return false;};f.emPaintTemplate=function(){this.jsxselected=0;this.setText(ub.h);this.setEnabled(0);var
Sa=this.paint();this.setEnabled(1);var
C=this.paint();var
ya=this.emGetTemplate(C,Sa);ya=ya.replace(ub.I,ub.J);return ya;};f.C0=function(e){var
Qa=this.emGetSession();if(Qa){var
S=Qa.column.getPath();var
U=(Qa.matrix.getXML()).selectNodeIterator(ub.K+S+ub.L);while(U.hasNext()){var
Ya=U.next();Ya.removeAttribute(S);}Qa.column.setValueForRecord(Qa.recordId,ub.M);}};});jsx3.RadioButton=jsx3.gui.RadioButton;
