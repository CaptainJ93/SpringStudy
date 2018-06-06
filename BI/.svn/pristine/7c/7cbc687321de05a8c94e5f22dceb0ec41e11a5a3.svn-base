/*
version: 2.9
release: 2011/5/28
集成json2,ajaxform,form validate,tip,databind,cascadeselect
*/
//缓存获取方法
(function($) {
	//取当前页面的参数 
	$.getParameter=function(name){      
		var reg = new RegExp("(^|&)"+name+"=([^&]*)(&|$)");
		var r = window.location.search.substr(1).match(reg);      
		if (r!=null) return unescape(r[2]);
	 	return  null;      
	};
	$.getHost=function(url) { 
		var host="null";
		if(typeof url=="undefined"||null==url)
			return window.location.host;
			//url = window.location.href;
		var reg = /.*\:\/\/([^\/]*).*/;
		var r = url.match(reg);
		if (r!=null) return unescape(r[2]);
	 	return null;      
	};
	$.getCache=function(path,keys,success,forcerefresh){
		var url=(path.charAt(path.length-1)=="/")?(path+"cacheManage.do"):(path+"/cacheManage.do");
		if ($.getHost(path)!=null&&$.getHost()!=$.getHost(path)) url+="?callback=?";
		var postData={"method":"getCachesNew","keys":keys,nd:(new Date()).getTime()};
		if (forcerefresh) postData["forcerefresh"]=1;
		
		$.getJSON(url, postData, function(json) {
			if (typeof success=="function") success(json);
		});
	};
	$.getCaches=function(path,keys,success,forcerefresh){
		var getCachesComplete=function(json){
			$.each($("input.easyui-input"),function(n,v){
				$(v).input({cacheKeys:json});
			});
			/* 防止多次提交 下拉框要显示的value值*/
			$.each($("select.easyui-select"),function(n,v){
				$(v).select({cacheKeys:json});
			});
			
			$.each($("select.easyui-cascadeselect"),function(n,v){
				$(v).cascadeselect({cacheKeys:json});
			});
			
			if (typeof success=="function") success(json);
		}
		
		//var url=(path.charAt(path.length-1)=="/")?(path+"cacheManage.do"):(path+"/cacheManage.do");
		var url = path;
		if ($.getHost(path)!=null&&$.getHost()!=$.getHost(path)) url+="?";
		var postData={/*"method":"getCachesNew",*/"keys":keys,nd:(new Date()).getTime()};
		if (forcerefresh) postData["forcerefresh"]=1;
		if (typeof(cacheKeys)=="undefined")
			$.getJSON(url, postData, getCachesComplete);
		else
			getCachesComplete(cacheKeys); 
	};
	$.getCaches1=function(path,keys,success,forcerefresh){
		$.ajax({
			url:path+keys+"?_nd="+(new Date()).getTime(),
			type:"GET",
			dataType:"jsonp",
			jsonp:"jsonp",
			jsonpCallback: "getCaches",
			success:function(data){if(typeof success=="function") success(data);}
		});
	};
	//将后台返回的结果集（纵向的数组）转换为横向的map  加快搜索效率 
	$.dictv2h=function(kname,vname,data){
		if (data==undefined) return;
		var map={};
		var sdata=data;
		if (data["rows"]!=undefined) sdata=data.rows;
		if (sdata.length==0) return {};
		
		$.each(sdata,function(k,v){
			if (v[kname]==undefined||v[vname]==undefined) {
				$.each(v,function(kk,vv){
					if (v[kname]==undefined) {
						kname=kk;
						return;
					}
					if (v[vname]==undefined&&kk!=kname) {
						vname=kk;
						return;
					}
				});
				
				if ((typeof v[kname]!="number"&&((v[kname]).charCodeAt(0)>256||(v[kname]).charCodeAt(0)==20))&&(typeof v[vname]=="number"||(v[vname]).charCodeAt(0)<256)) {
					var tmp=vname;
					vname=kname;
					kname=tmp;
				}
			}
			map[v[kname]]=v[vname];
		});
		return map;
	};
	$.fn.addOptions=function(opts){
			var defaults={allownull:true,nulltext:"请选择",nullvalue:""};
			opts=$.extend(defaults,opts);
			var arr=[];
			if (opts.allownull==undefined||opts.allownull==true||opts.allownull=="true") arr.push("<option value=\""+opts.nullvalue+"\">"+opts.nulltext+"</>");
			if (opts.data){
			//选择下拉框要显示的value值
			$.each(opts.data,function(n,v){
				if(opts.filter!=undefined&&opts.filter!="") {
					if ($.isArray(opts.filter.split(","))) {
						if ($.inArray(n,opts.filter.split(","))<0) return;
					}
				}
				if (opts.initvalue==n) {
					arr.push("<option value=\""+n+"\" selected>"+v+"</option>");
				}	else arr.push("<option value=\""+n+"\">"+v+"</option>");
			});
			}
			$(this).empty().append(arr.join(""));
	};
	$.fn.select = function(fn){
		var defaults={allownull:true,nulltext:"请选择",nullvalue:""};
		fn=$.extend(defaults,fn);
		
		var selectId=$(this).attr("id");
		
		if($(this).attr("allownull")!=undefined) fn.allownull=$(this).attr("allownull");
		if($(this).attr("nullname")!=undefined) fn.nulltext=$(this).attr("nullname");
		if($(this).attr("nulltext")!=undefined) fn.nulltext=$(this).attr("nulltext");
		if($(this).attr("nullvalue")!=undefined) fn.nullvalue=$(this).attr("nullvalue");
		if($(this).attr("initvalue")!=undefined) fn.initvalue=$(this).attr("initvalue");
		if($(this).attr("filter")!=undefined&&$(this).attr("filter")!="") fn.filter=$(this).attr("filter").split(",");
		
		if (fn==undefined||(fn.data==undefined&&(fn.cacheKeys==undefined||fn["cacheKeys"][$(this).attr("data")]==undefined))) {
			alert("select id="+selectId+"设置的数据字典data="+$(this).attr("data")+" undefined");
			return;
		}
		if (fn.data) {
			var dictData=fn.data;
		} else {
			var dictData=fn["cacheKeys"][$(this).attr("data")];
		}
		var valueField=$(this).attr("valueField");
		var textField=$(this).attr("textField");
		if (valueField==undefined) valueField="codeFlag";
		if (textField==undefined) textField="codeName";
		
		fn["data"]=$.dictv2h(valueField,textField,dictData);
		$(this).addOptions(fn);
		$(this).removeClass("easyui-select");
	};
	$.fn.input = function(fn,arg){
		if(typeof fn=="string") return $.fn.input.methods[fn](this,arg);
		if ($.data($(this)[0],"input")!=undefined) {
			if (typeof fn=="object") {
				$(this).input.methods["setData"](this,fn["data"]);
			}
			return;
		}
		var inputId=$(this).attr("id");
		var inputValue=$(this).val();		
		if (fn==undefined||(fn.data==undefined&&(fn.cacheKeys==undefined||fn["cacheKeys"][$(this).attr("data")]==undefined))) {
			alert("input id="+inputId+"设置的数据字典data="+$(this).attr("data")+" undefined");
			return;
		}
		if (fn.data) {
			var dictData=fn.data;
		} else {
			var dictData=fn["cacheKeys"][$(this).attr("data")];
		}
		$(this).attr("id",inputId+"_text").attr("name",inputId+"_text").removeClass("easyui-input").before("<input type=\"hidden\" id=\""+inputId+"\" value=\""+inputValue+"\" comboname=\""+inputId+"\"/>");
		$(this).prev().input.methods["setData"]($(this).prev(),dictData); 
	};
	$.fn.input.methods={
		options: function(o){return $.data(o[0],"input").options},
		setData: function(o,v){
			var valueField=$(o).attr("valueField");
			var textField=$(o).attr("textField");
			if (valueField==undefined) valueField="codeFlag";
			if (textField==undefined) textField="codeName";			
			
			$.data(o[0],"input",{options:{dictObj:$.dictv2h(valueField,textField,v)}});
			//数据字典改变立即翻译
			$(o).input.methods["setValue"](o,$(o).val());
		},
		setValue: function(o,v){
			$(o).val(v);
			var attrInput=$.data(o[0],"input");
			if (attrInput==undefined) return;
			var dictObj=attrInput.options.dictObj;
			if (dictObj==undefined) return;
			$(o).next().val(dictObj[v]==undefined?v:dictObj[v]);
		},
		setText: function(o,v){
			$(o).next().val(v);
		}
	};
	$.fn.cascadeselect=function(fn,arg){
		if(typeof fn=="string") return $.fn.cascadeselect.methods[fn](this,arg);
		var form=this;
		if ($(this).attr("tagName")=="SELECT") {
			if(fn==undefined) fn={};
			//首先找到form，如果找不到，则使用body
			form=$(this).closest("form");
			if (form.attr("tagName")==undefined) {
				form=$(this).closest("body");
			}
			if (form.attr("id")==undefined||form.attr("id")=="") {
				form.attr("id",$(this).attr("id")+"_form");
			}
			fn["url"]=$(this).attr("url");
			fn["data"]=$(this).attr("data");
			if (fn.url==undefined||fn.url==""){
				if (fn.data==undefined||fn.cacheKeys==undefined||fn["cacheKeys"][fn.data]==undefined) {
					alert("cascadeselect id="+$(this).attr("id")+"设置的数据字典data="+fn.data+" undefined");
					return;
				}
				fn.data=fn["cacheKeys"][fn.data];
			}
			var selId=$(this).attr("id");
			for(var i=1;i<10000;i++){
				fn.lvcnt=i;
				var selObj=form.find("#"+selId);
				fn["lv"+i+"sel"]=selId;
				fn["lv"+i+"k"]=selId;
				fn["lv"+i+"v"]=selId+"_text";
				if(selObj.attr("textField")!=undefined&&selObj.attr("textField")!="") fn["lv"+i+"v"]=selObj.attr("textField");
				if(selObj.attr("valueField")!=undefined&&selObj.attr("valueField")!="") fn["lv"+i+"k"]=selObj.attr("valueField");
				if(selObj.attr("filter")!=undefined&&selObj.attr("filter")!="") fn["lv"+i+"filter"]=selObj.attr("filter").split(",");

				if (selObj.attr("nextselect")==undefined||selObj.attr("nextselect")=="") break;				
				selId=selObj.attr("nextselect");
			}
			fn["allownull"]=true;
			if($(this).attr("allownull")=="false") fn["allownull"]=false;
			fn["initvalue"]=$(this).attr("initvalue");
			fn["multiple"]=false;
			if($(this).attr("multiple1")=="true") fn["multiple"]=true;
			if($(this).attr("nulltext")!=undefined) fn["nulltext"]=$(this).attr("nulltext");
			if($(this).attr("nullvalue")!=undefined) fn["nullvalue"]=$(this).attr("nullvalue");
			
			$(this).removeClass("easyui-cascadeselect");
		}
		var defaults={lvcnt:1,allownull:true,nulltext:"请选择",nullvalue:"",multiple:false,initvalue:""};
		var opts=$.extend(defaults,fn);
		opts["form"]="#"+form.attr("id");
		function loadData(obj){
			var lvk,lvv,lvnk,lvnv;
			var map={};
			//if (eval("obj."+opts.paramName)) var rows=eval("obj."+opts.paramName); else var rows=obj;
			if (obj.rows) var rows=obj.rows; else var rows=obj;
			if (rows.length==0) return;
/*			
			for(var i=1;i<=opts.lvcnt;i++){
				if (rows[0][opts["lv"+i+"k"]]==undefined) {
					alert("JSON数据源中找不到字段 " + opts["lv"+i+"k"]);
					return false;
				}
				if (rows[0][opts["lv"+i+"v"]]==undefined) {
					alert("JSON数据源中找不到字段 " + opts["lv"+i+"v"]);
					return false;
				}
			}
*/			
			var initvalue=(opts.initvalue+"").split(",")[0];
			$.each(rows,function(n,row){
				lvk=""; lvv="";
				for (var i=1; i<=opts.lvcnt; i++) {
					lvnk=row[opts["lv"+i+"k"]];
					lvnv=row[opts["lv"+i+"v"]];
					if (lvnk==undefined||lvnv==undefined) continue;
					
					if (map["lv"+i]==undefined) map["lv"+i]={};
					
					if (lvk=="") {
						if (map["lv"+i][lvnk]==undefined) map["lv"+i][lvnk]=lvnv;
					} else {
						if (map["lv"+i][lvk]==undefined) map["lv"+i][lvk]={};
						map["lv"+i][lvk][lvnk]=lvnv;
					}
					lvk=lvnk;
					lvv=lvnv;
					if(typeof opts.initlevel=="number"&&opts.initlevel>0&&opts.initlevel!=i) continue;
					if (lvk==initvalue) opts.initrow=row;
				}
			});
			opts["map"]=map;
			
			var selValue;
			for(var i=1;i<=opts.lvcnt;i++) {
				var selObj=$(form).find("#"+opts["lv"+i+"sel"]);
				selObj.attr("comboname",selObj.attr("id"));
				
				$.data(selObj[0],"cascadeselect",{options:opts});
			}
			loadOptions(1);
			opts.initrow=undefined;
		}
		
		function loadOptions(level){
			var parentValue;
			for(var i=level;i<=opts.lvcnt;i++) {
				var dataObj={};
				var initvalue;
				if (i==1) {
					dataObj=opts["map"]["lv"+i];
					//initvalue=opts.initrow?opts["initrow"][opts["lv"+i+"k"]]:undefined;
					initvalue=opts.SelectedValue;//modify by cf
				} else {
					parentValue=$(form).find("#"+opts["lv"+(i-1)+"sel"]).val();

					if(opts.initrow!=undefined) {
						dataObj=opts["map"]["lv"+i][parentValue];
						initvalue=opts["initrow"][opts["lv"+i+"k"]];
					} else {
						dataObj=opts["map"]["lv"+i][parentValue];
						initvalue=undefined;
					}
				}
				if(i==opts.lvcnt&&opts.multiple){
					var data=[];
					if(dataObj) {
						$.each(dataObj,function(k,v){
							if ($.isArray(opts["lv"+i+"filter"])) {
								if ($.inArray(k,opts["lv"+i+"filter"])<0) return;
							}
							data.push({value:k,text:v});
						});
					}
					var cb=$(form).find("#"+opts["lv"+i+"sel"]);
					if($.data(cb[0],"combobox")) {
						cb.combobox("clear");
						cb.combobox("loadData",data);
					} else {
						cb.attr("name",cb.attr("id"));
						cb.combobox({data:data,multiple:true,editable:false});
					}
				  if (initvalue==undefined||initvalue=="") {
						if(opts.allownull)
							cb.combobox("setText",opts.nulltext);
						else
							if(data.length>0) cb.combobox("setValue",data[0]["value"]);
					}	else {
						cb.combobox("setValues",(opts.initvalue).split(","));
					}
				} else $(form).find("#"+opts["lv"+i+"sel"]).addOptions({data:dataObj,initvalue:initvalue,allownull:opts.allownull,nullvalue:opts.nullvalue,nulltext:opts.nulltext,filter:opts["lv"+i+"filter"]});
			}
		}
		function addEvent(){
			for(var i=1; i<=opts.lvcnt; i++){
				$(form).find("#"+opts["lv"+i+"sel"]).change(function(){
					onChange(this,"");
				});
			}
		}
		function onChange(select,noEvent){
			var parentId=$(select).attr("id");
			var parentKey=$(select).val();
			var level=1;
			for(var i=1;i<=opts.lvcnt;i++){
				if (opts["lv"+i+"sel"]==parentId) {
					level=i;
					break;
				}
			}

			var parentChange=opts["onlv"+level+"Changed"]?opts["onlv"+level+"Changed"]:opts["onlv"+level+"Change"];
			loadOptions(level+1);
			if(level==opts.lvcnt){
				if(typeof parentChange=="function") parentChange(parentKey);
			}else{			
				if(noEvent!==true&&typeof parentChange=="function") parentChange(opts.map["lv"+(level+1)][parentKey]);
			}
		}
		
		//仅为了和老版本保持兼容
		if (opts.AllowNull!=undefined) opts.allownull=opts.AllowNull;
		if (opts.NullName!=undefined) opts.nulltext=opts.NullName;
		if (opts.nullname!=undefined) opts.nulltext=opts.nullname;
		if (opts.NullValue!=undefined) opts.nullvalue=opts.NullValue;
		if (opts.SelectedValue!=undefined) opts.initvalue=opts.SelectedValue;
		if (opts.SelectedLevel!=undefined) opts.initlevel=opts.SelectedLevel;
		if (opts.onSelectComplete!=undefined) opts.onComplete=opts.onSelectComplete;

		function initField(level){
			if(opts["lv"+level+"sel"]==undefined) {
				alert("level "+level+" 下拉框没有指定");
				return false;
			}
			if(opts["lv"+level+"k"]==undefined) {
				opts["lv"+level+"k"]=opts["lv"+level+"sel"];
				opts["lv"+level+"v"]=opts["lv"+level+"k"]+"_text";
			}
			return true;
		}
		for(var i=1;i<=opts.lvcnt;i++) if(!initField(i)) return;
		
		//判断传入url还是dataobject
		if(opts.data!=undefined && typeof opts.data=="object") {
			loadData(opts.data);
		} else {
			if(opts.url==undefined) {
				alert("请设置级联下拉框的数据源");
				return;
			}
			$.getJSON(opts.url,function(data){
				opts.data=(data.rows)?data.rows:data;
				if(typeof opts.onComplete=="function") opts.onComplete(opts.data);
				loadData(data);
			});
		}
		addEvent();
	};
	$.fn.CascadeSelect=function(fn,arg){
		$(this).cascadeselect(fn,arg);
	};
	$.fn.cascadeselect.methods={
		setValue: function(o,v){
			if(o[0]==undefined) return;
			//判断值是否有变化,没有变化直接返回
			if ($(o).val()==v) return;

			var obj=$(o);
			if($.data($(o)[0],"cascadeselect")==undefined) {
				alert("id="+$(o).attr("id")+" 的下拉框没有初始化为级联下拉框");
				return false;
			}
			var opts=$.data($(o)[0],"cascadeselect")["options"];
			var selectId=$(o).attr("id");
			var level=1;
			for(var i=1;i<=opts.lvcnt;i++){
				if (selectId==opts["lv"+i+"sel"]) {
					level=i;
					break;
				}
			}

			var data=opts.data;
			var map=opts.map;
			var row={};
			var sv=$.isArray(v)?v[0]:v;
			
			for(var i=0;i<data.length;i++)
				if (data[i][opts["lv"+level+"k"]]==sv) {
					row=data[i];
					break;
				}
			
			$(opts.form).find("#"+opts["lv1sel"]).val(row[opts["lv1k"]]);
			//var cnt=((level+1)>opts.lvcnt)?opts.lvcnt:(level+1);
			var selObj="";
			for(var i=2;i<=opts.lvcnt;i++) {
				if((i-1)>level)
					var lastk=selObj.val();
				else
					var lastk=row[opts["lv"+(i-1)+"k"]];
				if(i>level)
					var currk=opts.nullvalue;
				else
					var currk=row[opts["lv"+i+"k"]];
				
				selObj=$(opts.form).find("#"+opts["lv"+i+"sel"]);
				
				if($.data(selObj[0],"combobox")) {
					var cbdata=[];
					$.each(opts["map"]["lv"+i][lastk],function(kk,vv){
						cbdata.push({value:kk,text:vv});
					});
					selObj.combobox("clear");
					selObj.combobox("loadData",cbdata);
					if ($.isArray(v))
						selObj.combobox("setValues",v);
					else
						selObj.combobox("setValue",v);
				} else
					$(opts.form).find("#"+opts["lv"+i+"sel"]).addOptions({data:opts["map"]["lv"+i][lastk],initvalue:currk,allownull:opts.allownull,nullvalue:opts.nullvalue,nulltext:opts.nulltext});
			}
		}
	};	
})(jQuery);

// json2.js  JSON.parse JSON.stringify
// 针对不支持JSON对象的浏览器,模拟实现JSON对象以实现兼容
if(!this.JSON)this.JSON={};
(function(){function l(b){return b<10?"0"+b:b}function o(b){p.lastIndex=0;return p.test(b)?'"'+b.replace(p,function(f){var c=r[f];return typeof c==="string"?c:"\\u"+("0000"+f.charCodeAt(0).toString(16)).slice(-4)})+'"':'"'+b+'"'}function m(b,f){var c,d,g,j,i=h,e,a=f[b];if(a&&typeof a==="object"&&typeof a.toJSON==="function")a=a.toJSON(b);if(typeof k==="function")a=k.call(f,b,a);switch(typeof a){case "string":return o(a);case "number":return isFinite(a)?String(a):"null";case "boolean":case "null":return String(a);
case "object":if(!a)return"null";h+=n;e=[];if(Object.prototype.toString.apply(a)==="[object Array]"){j=a.length;for(c=0;c<j;c+=1)e[c]=m(c,a)||"null";g=e.length===0?"[]":h?"[\n"+h+e.join(",\n"+h)+"\n"+i+"]":"["+e.join(",")+"]";h=i;return g}if(k&&typeof k==="object"){j=k.length;for(c=0;c<j;c+=1){d=k[c];if(typeof d==="string")if(g=m(d,a))e.push(o(d)+(h?": ":":")+g)}}else for(d in a)if(Object.hasOwnProperty.call(a,d))if(g=m(d,a))e.push(o(d)+(h?": ":":")+g);g=e.length===0?"{}":h?"{\n"+h+e.join(",\n"+h)+
"\n"+i+"}":"{"+e.join(",")+"}";h=i;return g}}if(typeof Date.prototype.toJSON!=="function"){Date.prototype.toJSON=function(){return isFinite(this.valueOf())?this.getUTCFullYear()+"-"+l(this.getUTCMonth()+1)+"-"+l(this.getUTCDate())+"T"+l(this.getUTCHours())+":"+l(this.getUTCMinutes())+":"+l(this.getUTCSeconds())+"Z":null};String.prototype.toJSON=Number.prototype.toJSON=Boolean.prototype.toJSON=function(){return this.valueOf()}}var q=/[\u0000\u00ad\u0600-\u0604\u070f\u17b4\u17b5\u200c-\u200f\u2028-\u202f\u2060-\u206f\ufeff\ufff0-\uffff]/g,
p=/[\\\"\x00-\x1f\x7f-\x9f\u00ad\u0600-\u0604\u070f\u17b4\u17b5\u200c-\u200f\u2028-\u202f\u2060-\u206f\ufeff\ufff0-\uffff]/g,h,n,r={"\u0008":"\\b","\t":"\\t","\n":"\\n","\u000c":"\\f","\r":"\\r",'"':'\\"',"\\":"\\\\"},k;if(typeof JSON.stringify!=="function")JSON.stringify=function(b,f,c){var d;n=h="";if(typeof c==="number")for(d=0;d<c;d+=1)n+=" ";else if(typeof c==="string")n=c;if((k=f)&&typeof f!=="function"&&(typeof f!=="object"||typeof f.length!=="number"))throw Error("JSON.stringify");return m("",
{"":b})};if(typeof JSON.parse!=="function")JSON.parse=function(b,f){function c(g,j){var i,e,a=g[j];if(a&&typeof a==="object")for(i in a)if(Object.hasOwnProperty.call(a,i)){e=c(a,i);if(e!==undefined)a[i]=e;else delete a[i]}return f.call(g,j,a)}var d;b=String(b);q.lastIndex=0;if(q.test(b))b=b.replace(q,function(g){return"\\u"+("0000"+g.charCodeAt(0).toString(16)).slice(-4)});if(/^[\],:{}\s]*$/.test(b.replace(/\\(?:["\\\/bfnrt]|u[0-9a-fA-F]{4})/g,"@").replace(/"[^"\\\n\r]*"|true|false|null|-?\d+(?:\.\d*)?(?:[eE][+\-]?\d+)?/g,
"]").replace(/(?:^|:|,)(?:\s*\[)+/g,""))){d=eval("("+b+")");return typeof f==="function"?c({"":d},""):d}throw new SyntaxError("JSON.parse");}})();

/*!
 * jQuery Form Plugin
 * version: 2.52 (07-DEC-2010)
 * @requires jQuery v1.3.2 or later
 *
 * Examples and documentation at: http://malsup.com/jquery/form/
 * Dual licensed under the MIT and GPL licenses:
 *   http://www.opensource.org/licenses/mit-license.php
 *   http://www.gnu.org/licenses/gpl.html
 */
;(function($) {

/*
	Usage Note:
	-----------
	Do not use both ajaxSubmit and ajaxForm on the same form.  These
	functions are intended to be exclusive.  Use ajaxSubmit if you want
	to bind your own submit handler to the form.  For example,

	$(document).ready(function() {
		$('#myForm').bind('submit', function(e) {
			e.preventDefault(); // <-- important
			$(this).ajaxSubmit({
				target: '#output'
			});
		});
	});

	Use ajaxForm when you want the plugin to manage all the event binding
	for you.  For example,

	$(document).ready(function() {
		$('#myForm').ajaxForm({
			target: '#output'
		});
	});

	When using ajaxForm, the ajaxSubmit function will be invoked for you
	at the appropriate time.
*/

/**
 * ajaxSubmit() provides a mechanism for immediately submitting
 * an HTML form using AJAX.
 */
$.fn.ajaxSubmit = function(options) {
	// fast fail if nothing selected (http://dev.jquery.com/ticket/2752)
	if (!this.length) {
		log('ajaxSubmit: skipping submit process - no element selected');
		return this;
	}

	if (typeof options == 'function') {
		options = { success: options };
	}

	var action = this.attr('action');
	var url = (typeof action === 'string') ? $.trim(action) : '';
	if (url) {
		// clean url (don't include hash vaue)
		url = (url.match(/^([^#]+)/)||[])[1];
	}
	url = url || window.location.href || '';

	options = $.extend(true, {
		url:  url,
		type: this.attr('method') || 'GET',
		iframeSrc: /^https/i.test(window.location.href || '') ? 'javascript:false' : 'about:blank'
	}, options);

	// hook for manipulating the form data before it is extracted;
	// convenient for use with rich editors like tinyMCE or FCKEditor
	var veto = {};
	this.trigger('form-pre-serialize', [this, options, veto]);
	if (veto.veto) {
		log('ajaxSubmit: submit vetoed via form-pre-serialize trigger');
		return this;
	}

	// provide opportunity to alter form data before it is serialized
	if (options.beforeSerialize && options.beforeSerialize(this, options) === false) {
		log('ajaxSubmit: submit aborted via beforeSerialize callback');
		return this;
	}

	var n,v;
	//add by ylw not support function
	var a=this.unbindData();
	$.extend(true, a, options.data);
	//add by ylw
	
/*	comment by ylw
	var a = this.formToArray(options.semantic);
	if (options.data) {
		options.extraData = options.data;
		for (n in options.data) {
			if(options.data[n] instanceof Array) {
				for (var k in options.data[n]) {
					a.push( { name: n, value: options.data[n][k] } );
				}
			}
			else {
				v = options.data[n];
				v = $.isFunction(v) ? v() : v; // if value is fn, invoke it
				a.push( { name: n, value: v } );
			}
		}
	}
*/

	// give pre-submit callback an opportunity to abort the submit
	if (options.beforeSubmit && options.beforeSubmit(a, this, options) === false) {
		log('ajaxSubmit: submit aborted via beforeSubmit callback');
		return this;
	}

	// fire vetoable 'validate' event
	this.trigger('form-submit-validate', [a, this, options, veto]);
	if (veto.veto) {
		log('ajaxSubmit: submit vetoed via form-submit-validate trigger');
		return this;
	}

	var q = $.param(a);

	if (options.type.toUpperCase() == 'GET') {
		options.url += (options.url.indexOf('?') >= 0 ? '&' : '?') + q;
		options.data = null;  // data is null for 'get'
	}
	else {
		options.data = q; // data is the query string for 'post'
	}

	var $form = this, callbacks = [];
	if (options.resetForm) {
		callbacks.push(function() { $form.resetForm(); });
	}
	if (options.clearForm) {
		callbacks.push(function() { $form.clearForm(); });
	}

	//add by ylw
	if (options.success==undefined) 
		options.success = function(data,textStatus){
			if (data==undefined||data["errCode"]==undefined||data["errCode"]!=0) {
				if (data["errMsg"]!=undefined)
					alert("服务器返回错误: "+data.errMsg);
				else
					alert("服务器返回错误");
			} else {
				alert("操作成功");
			}
		};
	if (options.error==undefined) 
		options.error = function(XMLHttpRequest,textStatus){
			if(XMLHttpRequest.status == '303' || XMLHttpRequest.status == '12150'){
				top.location.reload();
			}else{
				if (textStatus==="parsererror") 
					alert("服务器返回的json字符串格式有误");
				else
					alert("服务器返回错误:"+XMLHttpRequest.statusText);
			}
		};
	//add by ylw
	
	// perform a load on the target only if dataType is not provided
	if (!options.dataType && options.target) {
		var oldSuccess = options.success || function(){};
		callbacks.push(function(data) {
			var fn = options.replaceTarget ? 'replaceWith' : 'html';
			$(options.target)[fn](data).each(oldSuccess, arguments);
		});
	}
	else if (options.success) {
		callbacks.push(options.success);
	}

	options.success = function(data, status, xhr) { // jQuery 1.4+ passes xhr as 3rd arg
		var context = options.context || options;   // jQuery 1.4+ supports scope context
		for (var i=0, max=callbacks.length; i < max; i++) {
			callbacks[i].apply(context, [data, status, xhr || $form, $form]);
		}
	};

	// are there files to upload?
	var fileInputs = $('input:file', this).length > 0;
	var mp = 'multipart/form-data';
	var multipart = ($form.attr('enctype') == mp || $form.attr('encoding') == mp);

	// options.iframe allows user to force iframe mode
	// 06-NOV-09: now defaulting to iframe mode if file input is detected
   if (options.iframe !== false && (fileInputs || options.iframe || multipart)) {
	   // hack to fix Safari hang (thanks to Tim Molendijk for this)
	   // see:  http://groups.google.com/group/jquery-dev/browse_thread/thread/36395b7ab510dd5d
	   if (options.closeKeepAlive) {
		   $.get(options.closeKeepAlive, fileUpload);
		}
	   else {
		   fileUpload();
		}
   }
   else {
	   $.ajax(options);
   }

	// fire 'notify' event
	this.trigger('form-submit-notify', [this, options]);
	return this;


	// private function for handling file uploads (hat tip to YAHOO!)
	function fileUpload() {
		var form = $form[0];

		if ($(':input[name=submit],:input[id=submit]', form).length) {
			// if there is an input with a name or id of 'submit' then we won't be
			// able to invoke the submit fn on the form (at least not x-browser)
			alert('Error: Form elements must not have name or id of "submit".');
			return;
		}

		var s = $.extend(true, {}, $.ajaxSettings, options);
		s.context = s.context || s;
		var id = 'jqFormIO' + (new Date().getTime()), fn = '_'+id;
		window[fn] = function() {
			var f = $io.data('form-plugin-onload');
			if (f) {
				f();
				window[fn] = undefined;
				try { delete window[fn]; } catch(e){}
			}
		}
		var $io = $('<iframe id="' + id + '" name="' + id + '" src="'+ s.iframeSrc +'" onload="window[\'_\'+this.id]()" />');
		var io = $io[0];

		$io.css({ position: 'absolute', top: '-1000px', left: '-1000px' });

		var xhr = { // mock object
			aborted: 0,
			responseText: null,
			responseXML: null,
			status: 0,
			statusText: 'n/a',
			getAllResponseHeaders: function() {},
			getResponseHeader: function() {},
			setRequestHeader: function() {},
			abort: function() {
				this.aborted = 1;
				$io.attr('src', s.iframeSrc); // abort op in progress
			}
		};

		var g = s.global;
		// trigger ajax global events so that activity/block indicators work like normal
		if (g && ! $.active++) {
			$.event.trigger("ajaxStart");
		}
		if (g) {
			$.event.trigger("ajaxSend", [xhr, s]);
		}

		if (s.beforeSend && s.beforeSend.call(s.context, xhr, s) === false) {
			if (s.global) {
				$.active--;
			}
			return;
		}
		if (xhr.aborted) {
			return;
		}

		var cbInvoked = false;
		var timedOut = 0;

		// add submitting element to data if we know it
		var sub = form.clk;
		if (sub) {
			var n = sub.name;
			if (n && !sub.disabled) {
				s.extraData = s.extraData || {};
				s.extraData[n] = sub.value;
				if (sub.type == "image") {
					s.extraData[n+'.x'] = form.clk_x;
					s.extraData[n+'.y'] = form.clk_y;
				}
			}
		}

		// take a breath so that pending repaints get some cpu time before the upload starts
		function doSubmit() {
			// make sure form attrs are set
			var t = $form.attr('target'), a = $form.attr('action');

			// update form attrs in IE friendly way
			form.setAttribute('target',id);
			if (form.getAttribute('method') != 'POST') {
				form.setAttribute('method', 'POST');
			}
			if (form.getAttribute('action') != s.url) {
				form.setAttribute('action', s.url);
			}

			// ie borks in some cases when setting encoding
			if (! s.skipEncodingOverride) {
				$form.attr({
					encoding: 'multipart/form-data',
					enctype:  'multipart/form-data'
				});
			}

			// support timout
			if (s.timeout) {
				setTimeout(function() { timedOut = true; cb(); }, s.timeout);
			}

			// add "extra" data to form if provided in options
			var extraInputs = [];
			try {
				if (s.extraData) {
					for (var n in s.extraData) {
						extraInputs.push(
							$('<input type="hidden" name="'+n+'" value="'+s.extraData[n]+'" />')
								.appendTo(form)[0]);
					}
				}

				// add iframe to doc and submit the form
				$io.appendTo('body');
				$io.data('form-plugin-onload', cb);
				form.submit();
			}
			finally {
				// reset attrs and remove "extra" input elements
				form.setAttribute('action',a);
				if(t) {
					form.setAttribute('target', t);
				} else {
					$form.removeAttr('target');
				}
				$(extraInputs).remove();
			}
		}

		if (s.forceSync) {
			doSubmit();
		}
		else {
			setTimeout(doSubmit, 10); // this lets dom updates render
		}

		var data, doc, domCheckCount = 50;

		function cb() {
			if (cbInvoked) {
				return;
			}

			$io.removeData('form-plugin-onload');

			var ok = true;
			try {
				if (timedOut) {
					throw 'timeout';
				}
				// extract the server response from the iframe
				doc = io.contentWindow ? io.contentWindow.document : io.contentDocument ? io.contentDocument : io.document;

				var isXml = s.dataType == 'xml' || doc.XMLDocument || $.isXMLDoc(doc);
				log('isXml='+isXml);
				if (!isXml && window.opera && (doc.body == null || doc.body.innerHTML == '')) {
					if (--domCheckCount) {
						// in some browsers (Opera) the iframe DOM is not always traversable when
						// the onload callback fires, so we loop a bit to accommodate
						log('requeing onLoad callback, DOM not available');
						setTimeout(cb, 250);
						return;
					}
					// let this fall through because server response could be an empty document
					//log('Could not access iframe DOM after mutiple tries.');
					//throw 'DOMException: not available';
				}

				//log('response detected');
				cbInvoked = true;
				xhr.responseText = doc.documentElement ? doc.documentElement.innerHTML : null;
				xhr.responseXML = doc.XMLDocument ? doc.XMLDocument : doc;
				xhr.getResponseHeader = function(header){
					var headers = {'content-type': s.dataType};
					return headers[header];
				};

				var scr = /(json|script)/.test(s.dataType);
				if (scr || s.textarea) {
					// see if user embedded response in textarea
					var ta = doc.getElementsByTagName('textarea')[0];
					if (ta) {
						xhr.responseText = ta.value;
					}
					else if (scr) {
						// account for browsers injecting pre around json response
						var pre = doc.getElementsByTagName('pre')[0];
						var b = doc.getElementsByTagName('body')[0];
						if (pre) {
							xhr.responseText = pre.textContent;
						}
						else if (b) {
							xhr.responseText = b.innerHTML;
						}
					}
				}
				else if (s.dataType == 'xml' && !xhr.responseXML && xhr.responseText != null) {
					xhr.responseXML = toXml(xhr.responseText);
				}
				data = $.httpData(xhr, s.dataType);
			}
			catch(e){
				log('error caught:',e);
				ok = false;
				xhr.error = e;
				$.handleError(s, xhr, 'error', e);
			}

			if (xhr.aborted) {
				log('upload aborted');
				ok = false;
			}

			// ordering of these callbacks/triggers is odd, but that's how $.ajax does it
			if (ok) {
				s.success.call(s.context, data, 'success', xhr);
				if (g) {
					$.event.trigger("ajaxSuccess", [xhr, s]);
				}
			}
			if (g) {
				$.event.trigger("ajaxComplete", [xhr, s]);
			}
			if (g && ! --$.active) {
				$.event.trigger("ajaxStop");
			}
			if (s.complete) {
				s.complete.call(s.context, xhr, ok ? 'success' : 'error');
			}

			// clean up
			setTimeout(function() {
				$io.removeData('form-plugin-onload');
				$io.remove();
				xhr.responseXML = null;
			}, 100);
		}

		function toXml(s, doc) {
			if (window.ActiveXObject) {
				doc = new ActiveXObject('Microsoft.XMLDOM');
				doc.async = 'false';
				doc.loadXML(s);
			}
			else {
				doc = (new DOMParser()).parseFromString(s, 'text/xml');
			}
			return (doc && doc.documentElement && doc.documentElement.tagName != 'parsererror') ? doc : null;
		}
	}
};

/**
 * ajaxForm() provides a mechanism for fully automating form submission.
 *
 * The advantages of using this method instead of ajaxSubmit() are:
 *
 * 1: This method will include coordinates for <input type="image" /> elements (if the element
 *	is used to submit the form).
 * 2. This method will include the submit element's name/value data (for the element that was
 *	used to submit the form).
 * 3. This method binds the submit() method to the form for you.
 *
 * The options argument for ajaxForm works exactly as it does for ajaxSubmit.  ajaxForm merely
 * passes the options argument along after properly binding events for submit elements and
 * the form itself.
 */
$.fn.ajaxForm = function(options) {
	// in jQuery 1.3+ we can fix mistakes with the ready state
	if (this.length === 0) {
		var o = { s: this.selector, c: this.context };
		if (!$.isReady && o.s) {
			log('DOM not ready, queuing ajaxForm');
			$(function() {
				$(o.s,o.c).ajaxForm(options);
			});
			return this;
		}
		// is your DOM ready?  http://docs.jquery.com/Tutorials:Introducing_$(document).ready()
		log('terminating; zero elements found by selector' + ($.isReady ? '' : ' (DOM not ready)'));
		return this;
	}

	return this.ajaxFormUnbind().bind('submit.form-plugin', function(e) {
		if (!e.isDefaultPrevented()) { // if event has been canceled, don't proceed
			e.preventDefault();
			$(this).ajaxSubmit(options);
		}
	}).bind('click.form-plugin', function(e) {
		var target = e.target;
		var $el = $(target);
		if (!($el.is(":submit,input:image"))) {
			// is this a child element of the submit el?  (ex: a span within a button)
			var t = $el.closest(':submit');
			if (t.length == 0) {
				return;
			}
			target = t[0];
		}
		var form = this;
		form.clk = target;
		if (target.type == 'image') {
			if (e.offsetX != undefined) {
				form.clk_x = e.offsetX;
				form.clk_y = e.offsetY;
			} else if (typeof $.fn.offset == 'function') { // try to use dimensions plugin
				var offset = $el.offset();
				form.clk_x = e.pageX - offset.left;
				form.clk_y = e.pageY - offset.top;
			} else {
				form.clk_x = e.pageX - target.offsetLeft;
				form.clk_y = e.pageY - target.offsetTop;
			}
		}
		// clear form vars
		setTimeout(function() { form.clk = form.clk_x = form.clk_y = null; }, 100);
	});
};

// ajaxFormUnbind unbinds the event handlers that were bound by ajaxForm
$.fn.ajaxFormUnbind = function() {
	return this.unbind('submit.form-plugin click.form-plugin');
};

/**
 * formToArray() gathers form element data into an array of objects that can
 * be passed to any of the following ajax functions: $.get, $.post, or load.
 * Each object in the array has both a 'name' and 'value' property.  An example of
 * an array for a simple login form might be:
 *
 * [ { name: 'username', value: 'jresig' }, { name: 'password', value: 'secret' } ]
 *
 * It is this array that is passed to pre-submit callback functions provided to the
 * ajaxSubmit() and ajaxForm() methods.
 */
$.fn.formToArray = function(semantic) {
	var a = [];
	if (this.length === 0) {
		return a;
	}

	var form = this[0];
	var els = semantic ? form.getElementsByTagName('*') : form.elements;
	if (!els) {
		return a;
	}

	var i,j,n,v,el,max,jmax;
	for(i=0, max=els.length; i < max; i++) {
		el = els[i];
		n = el.name;
		if (!n) {
			continue;
		}

		if (semantic && form.clk && el.type == "image") {
			// handle image inputs on the fly when semantic == true
			if(!el.disabled && form.clk == el) {
				a.push({name: n, value: $(el).val()});
				a.push({name: n+'.x', value: form.clk_x}, {name: n+'.y', value: form.clk_y});
			}
			continue;
		}

		v = $.fieldValue(el, true);
		if (v && v.constructor == Array) {
			for(j=0, jmax=v.length; j < jmax; j++) {
				a.push({name: n, value: v[j]});
			}
		}
		else if (v !== null && typeof v != 'undefined') {
			a.push({name: n, value: v});
		}
	}

	if (!semantic && form.clk) {
		// input type=='image' are not found in elements array! handle it here
		var $input = $(form.clk), input = $input[0];
		n = input.name;
		if (n && !input.disabled && input.type == 'image') {
			a.push({name: n, value: $input.val()});
			a.push({name: n+'.x', value: form.clk_x}, {name: n+'.y', value: form.clk_y});
		}
	}
	return a;
};

/**
 * Serializes form data into a 'submittable' string. This method will return a string
 * in the format: name1=value1&amp;name2=value2
 */
$.fn.formSerialize = function(semantic) {
	//hand off to jQuery.param for proper encoding
	return $.param(this.formToArray(semantic));
};

/**
 * Serializes all field elements in the jQuery object into a query string.
 * This method will return a string in the format: name1=value1&amp;name2=value2
 */
$.fn.fieldSerialize = function(successful) {
	var a = [];
	this.each(function() {
		var n = this.name;
		if (!n) {
			return;
		}
		var v = $.fieldValue(this, successful);
		if (v && v.constructor == Array) {
			for (var i=0,max=v.length; i < max; i++) {
				a.push({name: n, value: v[i]});
			}
		}
		else if (v !== null && typeof v != 'undefined') {
			a.push({name: this.name, value: v});
		}
	});
	//hand off to jQuery.param for proper encoding
	return $.param(a);
};

/**
 * Returns the value(s) of the element in the matched set.  For example, consider the following form:
 *
 *  <form><fieldset>
 *	  <input name="A" type="text" />
 *	  <input name="A" type="text" />
 *	  <input name="B" type="checkbox" value="B1" />
 *	  <input name="B" type="checkbox" value="B2"/>
 *	  <input name="C" type="radio" value="C1" />
 *	  <input name="C" type="radio" value="C2" />
 *  </fieldset></form>
 *
 *  var v = $(':text').fieldValue();
 *  // if no values are entered into the text inputs
 *  v == ['','']
 *  // if values entered into the text inputs are 'foo' and 'bar'
 *  v == ['foo','bar']
 *
 *  var v = $(':checkbox').fieldValue();
 *  // if neither checkbox is checked
 *  v === undefined
 *  // if both checkboxes are checked
 *  v == ['B1', 'B2']
 *
 *  var v = $(':radio').fieldValue();
 *  // if neither radio is checked
 *  v === undefined
 *  // if first radio is checked
 *  v == ['C1']
 *
 * The successful argument controls whether or not the field element must be 'successful'
 * (per http://www.w3.org/TR/html4/interact/forms.html#successful-controls).
 * The default value of the successful argument is true.  If this value is false the value(s)
 * for each element is returned.
 *
 * Note: This method *always* returns an array.  If no valid value can be determined the
 *	   array will be empty, otherwise it will contain one or more values.
 */
$.fn.fieldValue = function(successful) {
	for (var val=[], i=0, max=this.length; i < max; i++) {
		var el = this[i];
		var v = $.fieldValue(el, successful);
		if (v === null || typeof v == 'undefined' || (v.constructor == Array && !v.length)) {
			continue;
		}
		v.constructor == Array ? $.merge(val, v) : val.push(v);
	}
	return val;
};

/**
 * Returns the value of the field element.
 */
$.fieldValue = function(el, successful) {
	var n = el.name, t = el.type, tag = el.tagName.toLowerCase();
	if (successful === undefined) {
		successful = true;
	}

	if (successful && (!n || el.disabled || t == 'reset' || t == 'button' ||
		(t == 'checkbox' || t == 'radio') && !el.checked ||
		(t == 'submit' || t == 'image') && el.form && el.form.clk != el ||
		tag == 'select' && el.selectedIndex == -1)) {
			return null;
	}

	if (tag == 'select') {
		var index = el.selectedIndex;
		if (index < 0) {
			return null;
		}
		var a = [], ops = el.options;
		var one = (t == 'select-one');
		var max = (one ? index+1 : ops.length);
		for(var i=(one ? index : 0); i < max; i++) {
			var op = ops[i];
			if (op.selected) {
				var v = op.value;
				if (!v) { // extra pain for IE...
					v = (op.attributes && op.attributes['value'] && !(op.attributes['value'].specified)) ? op.text : op.value;
				}
				if (one) {
					return v;
				}
				a.push(v);
			}
		}
		return a;
	}
	return $(el).val();
};

/**
 * Clears the form data.  Takes the following actions on the form's input fields:
 *  - input text fields will have their 'value' property set to the empty string
 *  - select elements will have their 'selectedIndex' property set to -1
 *  - checkbox and radio inputs will have their 'checked' property set to false
 *  - inputs of type submit, button, reset, and hidden will *not* be effected
 *  - button elements will *not* be effected
 */
$.fn.clearForm = function() {
	return this.each(function() {
		$('input,select,textarea', this).clearFields();
	});
};

/**
 * Clears the selected form elements.
 */
$.fn.clearFields = $.fn.clearInputs = function() {
	return this.each(function() {
		var t = this.type, tag = this.tagName.toLowerCase();
		if (t == 'text' || t == 'password' || t == 'hidden' || tag == 'textarea') {
			this.value = '';
		}
		else if (t == 'checkbox' || t == 'radio') {
			this.checked = false;
		}
		else if (tag == 'select') {
			this.selectedIndex = -1;
		}
	});
};

/**
 * Resets the form data.  Causes all form elements to be reset to their original value.
 */
$.fn.resetForm = function() {
	return this.each(function() {
		// guard against an input with the name of 'reset'
		// note that IE reports the reset function as an 'object'
		if (typeof this.reset == 'function' || (typeof this.reset == 'object' && !this.reset.nodeType)) {
			this.reset();
		}
	});
};

/**
 * Enables or disables any matching elements.
 */
$.fn.enable = function(b) {
	if (b === undefined) {
		b = true;
	}
	return this.each(function() {
		this.disabled = !b;
	});
};

/**
 * Checks/unchecks any matching checkboxes or radio buttons and
 * selects/deselects and matching option elements.
 */
$.fn.selected = function(select) {
	if (select === undefined) {
		select = true;
	}
	return this.each(function() {
		var t = this.type;
		if (t == 'checkbox' || t == 'radio') {
			this.checked = select;
		}
		else if (this.tagName.toLowerCase() == 'option') {
			var $sel = $(this).parent('select');
			if (select && $sel[0] && $sel[0].type == 'select-one') {
				// deselect all other options
				$sel.find('option').selected(false);
			}
			this.selected = select;
		}
	});
};

// helper fn for console logging
// set $.fn.ajaxSubmit.debug to true to enable debug logging
function log() {
	if ($.fn.ajaxSubmit.debug) {
		var msg = '[jquery.form] ' + Array.prototype.join.call(arguments,'');
		if (window.console && window.console.log) {
			window.console.log(msg);
		}
		else if (window.opera && window.opera.postError) {
			window.opera.postError(msg);
		}
	}
};


/**
 *根据url从服务器获取json数据，自动填充到form相应id的输入元素中
 *url:*.action
 *param:{"key":"value"}
 *success:function(data){}
 *callback:function(data){}
 *complete:function(data){}
**/
$.fn.ajaxLoad = function(opts) {
	// 页面form的命名空间 
	var $scope=$(this);
	if (opts==undefined) var opts={};
	if (opts["url"]==undefined)	opts["url"]=$scope.attr("action");
	if (opts["param"]==undefined) opts["param"]={};	// 增加防止缓存的参数 
	opts["param"]["nd"]=new Date().getTime();
	var cfunc=undefined;

	if (typeof opts.callback=="function")
	  cfunc=opts.callback;
	if (typeof opts.complete=="function")
	  cfunc=opts.complete;
	if (typeof opts.success=="function")
	  cfunc=opts.success;

	if (opts.url!=undefined && opts.url!=null && opts.url!=""){
		jQuery.ajax({
			type: "GET",
			url: opts.url,
			data: opts.param,
			context:this,
			error: function(XMLHttpRequest,textStatus){
				if(XMLHttpRequest.status == '303' || XMLHttpRequest.status == '12150'){
					top.location.reload();
				}else{
					if (textStatus==="parsererror") 
						alert("服务器返回的json字符串格式有误");
					else
						alert("服务器返回错误:"+XMLHttpRequest.statusText);
				}
			},
			success: function(data,textStatus) {
				if (data["errCode"]!=undefined && data["errCode"]!=0) {
					if (data["errMsg"]!=undefined) alert("服务端返回错误："+data.errMsg);	else alert("服务端返回错误");
						return false;
				}
				// 查询成功回调函数 
				var resData = data;
				if(data.rows!=undefined) resData=data.rows[0];
				if(data.resultMap!=undefined) resData=data.resultMap;
				//执行回调函数
				if (typeof cfunc=="function") cfunc(resData);
				// 绑定页面的input, select,textarea对应的值 
				$scope.bindData(resData);

		  },
			dataType: "json"
		});
	} else {
		alert("请设置有效的url地址!");
		return false;
	}
};

})(jQuery);

/*
 * jQuery validation plug-in 1.7
 *
 * http://bassistance.de/jquery-plugins/jquery-plugin-validation/
 * http://docs.jquery.com/Plugins/Validation
 *
 * Copyright (c) 2006 - 2008 J枚rn Zaefferer
 *
 * $Id: jquery.validate.js 6403 2009-06-17 14:27:16Z joern.zaefferer $
 *
 * Dual licensed under the MIT and GPL licenses:
 *   http://www.opensource.org/licenses/mit-license.php
 *   http://www.gnu.org/licenses/gpl.html
 */

/* 
(function($) {

$.extend($.fn, {
	// http://docs.jquery.com/Plugins/Validation/validate
	validate: function( options ) {

		// if nothing is selected, return nothing; can't chain anyway
		if (!this.length) {
			options && options.debug && window.console && console.warn( "nothing selected, can't validate, returning nothing" );
			return;
		}

		// check if a validator for this form was already created
		var validator = $.data(this[0], 'validator');
		if ( validator ) {
			return validator;
		}

		validator = new $.validator( options, this[0] );
		$.data(this[0], 'validator', validator);

		if ( validator.settings.onsubmit ) {

			// allow suppresing validation by adding a cancel class to the submit button
			this.find("input, button").filter(".cancel").click(function() {
				validator.cancelSubmit = true;
			});

			// when a submitHandler is used, capture the submitting button
			if (validator.settings.submitHandler) {
				this.find("input, button").filter(":submit").click(function() {
					validator.submitButton = this;
				});
			}

			// validate the form on submit
			this.submit( function( event ) {
				if ( validator.settings.debug )
					// prevent form submit to be able to see console output
					event.preventDefault();

				function handle() {
					if ( validator.settings.submitHandler ) {
						if (validator.submitButton) {
							// insert a hidden input as a replacement for the missing submit button
							var hidden = $("<input type='hidden'/>").attr("name", validator.submitButton.name).val(validator.submitButton.value).appendTo(validator.currentForm);
						}
						validator.settings.submitHandler.call( validator, validator.currentForm );
						if (validator.submitButton) {
							// and clean up afterwards; thanks to no-block-scope, hidden can be referenced
							hidden.remove();
						}
						return false;
					}
					return true;
				}

				// prevent submit for invalid forms or custom submit handlers
				if ( validator.cancelSubmit ) {
					validator.cancelSubmit = false;
					return handle();
				}
				if ( validator.form() ) {
					if ( validator.pendingRequest ) {
						validator.formSubmitted = true;
						return false;
					}
					return handle();
				} else {
					validator.focusInvalid();
					return false;
				}
			});
		}

		return validator;
	},
	// http://docs.jquery.com/Plugins/Validation/valid
	valid: function() {
        if ( $(this[0]).is('form')) {
            return this.validate().form();
        } else {
            var valid = true;
            var validator = $(this[0].form).validate();
            this.each(function() {
				valid &= validator.element(this);
            });
            return valid;
        }
    },
	// attributes: space seperated list of attributes to retrieve and remove
	removeAttrs: function(attributes) {
		var result = {},
			$element = this;
		$.each(attributes.split(/\s/), function(index, value) {
			result[value] = $element.attr(value);
			$element.removeAttr(value);
		});
		return result;
	},
	// http://docs.jquery.com/Plugins/Validation/rules
	rules: function(command, argument) {
		var element = this[0];

		if (command) {
			var settings = $.data(element.form, 'validator').settings;
			var staticRules = settings.rules;
			var existingRules = $.validator.staticRules(element);
			switch(command) {
			case "add":
				$.extend(existingRules, $.validator.normalizeRule(argument));
				staticRules[element.name] = existingRules;
				if (argument.messages)
					settings.messages[element.name] = $.extend( settings.messages[element.name], argument.messages );
				break;
			case "remove":
				if (!argument) {
					delete staticRules[element.name];
					return existingRules;
				}
				var filtered = {};
				$.each(argument.split(/\s/), function(index, method) {
					filtered[method] = existingRules[method];
					delete existingRules[method];
				});
				return filtered;
			}
		}

		var data = $.validator.normalizeRules(
		$.extend(
			{},
			$.validator.metadataRules(element),
			$.validator.classRules(element),
			$.validator.attributeRules(element),
			$.validator.staticRules(element)
		), element);

		// make sure required is at front
		if (data.required) {
			var param = data.required;
			delete data.required;
			data = $.extend({required: param}, data);
		}

		return data;
	}
});

// Custom selectors
$.extend($.expr[":"], {
	// http://docs.jquery.com/Plugins/Validation/blank
	blank: function(a) {return !$.trim("" + a.value);},
	// http://docs.jquery.com/Plugins/Validation/filled
	filled: function(a) {return !!$.trim("" + a.value);},
	// http://docs.jquery.com/Plugins/Validation/unchecked
	unchecked: function(a) {return !a.checked;}
});

// constructor for validator
$.validator = function( options, form ) {
	this.settings = $.extend( true, {}, $.validator.defaults, options );
	this.currentForm = form;
	this.init();
};

$.validator.format = function(source, params) {
	if ( arguments.length == 1 )
		return function() {
			var args = $.makeArray(arguments);
			args.unshift(source);
			return $.validator.format.apply( this, args );
		};
	if ( arguments.length > 2 && params.constructor != Array  ) {
		params = $.makeArray(arguments).slice(1);
	}
	if ( params.constructor != Array ) {
		params = [ params ];
	}
	$.each(params, function(i, n) {
		source = source.replace(new RegExp("\\{" + i + "\\}", "g"), n);
	});
	return source;
};

$.extend($.validator, {

	defaults: {
		messages: {},
		groups: {},
		rules: {},
		errorClass: "error",
		validClass: "valid",
		errorElement: "label",
		focusInvalid: true,
		errorContainer: $( [] ),
		errorLabelContainer: $( [] ),
		onsubmit: true,
		ignore: [],
		ignoreTitle: false,
		onfocusin: function(element) {
			this.lastActive = element;

			// hide error label and remove error class on focus if enabled
			if ( this.settings.focusCleanup && !this.blockFocusCleanup ) {
				this.settings.unhighlight && this.settings.unhighlight.call( this, element, this.settings.errorClass, this.settings.validClass );
				this.errorsFor(element).hide();
			}
		},
		onfocusout: function(element) {
			if ( !this.checkable(element) && (element.name in this.submitted || !this.optional(element)) ) {
				this.element(element);
			}
		},
		onkeyup: function(element) {
			if ( element.name in this.submitted || element == this.lastElement ) {
				this.element(element);
			}
		},
		onclick: function(element) {
			// click on selects, radiobuttons and checkboxes
			if ( element.name in this.submitted )
				this.element(element);
			// or option elements, check parent select in that case
			else if (element.parentNode.name in this.submitted)
				this.element(element.parentNode);
		},
		highlight: function( element, errorClass, validClass ) {
			$(element).addClass(errorClass).removeClass(validClass);
		},
		unhighlight: function( element, errorClass, validClass ) {
			$(element).removeClass(errorClass).addClass(validClass);
		}
	},

	// http://docs.jquery.com/Plugins/Validation/Validator/setDefaults
	setDefaults: function(settings) {
		$.extend( $.validator.defaults, settings );
	},

	messages: {
		required: "This field is required.",
		remote: "Please fix this field.",
		email: "Please enter a valid email address.",
		url: "Please enter a valid URL.",
		date: "Please enter a valid date.",
		dateISO: "Please enter a valid date (ISO).",
		number: "Please enter a valid number.",
		digits: "Please enter only digits.",
		creditcard: "Please enter a valid credit card number.",
		equalTo: "Please enter the same value again.",
		accept: "Please enter a value with a valid extension.",
		maxlength: $.validator.format("Please enter no more than {0} characters."),
		minlength: $.validator.format("Please enter at least {0} characters."),
		rangelength: $.validator.format("Please enter a value between {0} and {1} characters long."),
		range: $.validator.format("Please enter a value between {0} and {1}."),
		max: $.validator.format("Please enter a value less than or equal to {0}."),
		min: $.validator.format("Please enter a value greater than or equal to {0}.")
	},

	autoCreateRanges: false,

	prototype: {

		init: function() {
			this.labelContainer = $(this.settings.errorLabelContainer);
			this.errorContext = this.labelContainer.length && this.labelContainer || $(this.currentForm);
			this.containers = $(this.settings.errorContainer).add( this.settings.errorLabelContainer );
			this.submitted = {};
			this.valueCache = {};
			this.pendingRequest = 0;
			this.pending = {};
			this.invalid = {};
			this.reset();

			var groups = (this.groups = {});
			$.each(this.settings.groups, function(key, value) {
				$.each(value.split(/\s/), function(index, name) {
					groups[name] = key;
				});
			});
			var rules = this.settings.rules;
			$.each(rules, function(key, value) {
				rules[key] = $.validator.normalizeRule(value);
			});

			function delegate(event) {
				var validator = $.data(this[0].form, "validator"),
					eventType = "on" + event.type.replace(/^validate/, "");
				validator.settings[eventType] && validator.settings[eventType].call(validator, this[0] );
			}
			$(this.currentForm)
				.validateDelegate(":text, :password, :file, select, textarea", "focusin focusout keyup", delegate)
				.validateDelegate(":radio, :checkbox, select, option", "click", delegate);

			if (this.settings.invalidHandler)
				$(this.currentForm).bind("invalid-form.validate", this.settings.invalidHandler);
		},

		// http://docs.jquery.com/Plugins/Validation/Validator/form
		form: function() {
			this.checkForm();
			$.extend(this.submitted, this.errorMap);
			this.invalid = $.extend({}, this.errorMap);
			if (!this.valid())
				$(this.currentForm).triggerHandler("invalid-form", [this]);
			this.showErrors();
			return this.valid();
		},

		checkForm: function() {
			this.prepareForm();
			for ( var i = 0, elements = (this.currentElements = this.elements()); elements[i]; i++ ) {
				this.check( elements[i] );
			}
			return this.valid();
		},

		// http://docs.jquery.com/Plugins/Validation/Validator/element
		element: function( element ) {
			element = this.clean( element );
			this.lastElement = element;
			this.prepareElement( element );
			this.currentElements = $(element);
			var result = this.check( element );
			if ( result ) {
				delete this.invalid[element.name];
			} else {
				this.invalid[element.name] = true;
			}
			if ( !this.numberOfInvalids() ) {
				// Hide error containers on last error
				this.toHide = this.toHide.add( this.containers );
			}
			this.showErrors();
			return result;
		},

		// http://docs.jquery.com/Plugins/Validation/Validator/showErrors
		showErrors: function(errors) {
			if(errors) {
				// add items to error list and map
				$.extend( this.errorMap, errors );
				this.errorList = [];
				for ( var name in errors ) {
					this.errorList.push({
						message: errors[name],
						element: this.findByName(name)[0]
					});
				}
				// remove items from success list
				this.successList = $.grep( this.successList, function(element) {
					return !(element.name in errors);
				});
			}
			this.settings.showErrors
				? this.settings.showErrors.call( this, this.errorMap, this.errorList )
				: this.defaultShowErrors();
		},

		// http://docs.jquery.com/Plugins/Validation/Validator/resetForm
		resetForm: function() {
			if ( $.fn.resetForm )
				$( this.currentForm ).resetForm();
			this.submitted = {};
			this.prepareForm();
			this.hideErrors();
			this.elements().removeClass( this.settings.errorClass );
		},

		numberOfInvalids: function() {
			return this.objectLength(this.invalid);
		},

		objectLength: function( obj ) {
			var count = 0;
			for ( var i in obj )
				count++;
			return count;
		},

		hideErrors: function() {
			this.addWrapper( this.toHide ).hide();
		},

		valid: function() {
			return this.size() == 0;
		},

		size: function() {
			return this.errorList.length;
		},

		focusInvalid: function() {
			if( this.settings.focusInvalid ) {
				try {
					$(this.findLastActive() || this.errorList.length && this.errorList[0].element || [])
					.filter(":visible")
					.focus()
					// manually trigger focusin event; without it, focusin handler isn't called, findLastActive won't have anything to find
					.trigger("focusin");
				} catch(e) {
					// ignore IE throwing errors when focusing hidden elements
				}
			}
		},

		findLastActive: function() {
			var lastActive = this.lastActive;
			return lastActive && $.grep(this.errorList, function(n) {
				return n.element.name == lastActive.name;
			}).length == 1 && lastActive;
		},

		elements: function() {
			var validator = this,
				rulesCache = {};

			// select all valid inputs inside the form (no submit or reset buttons)
			// workaround $Query([]).add until http://dev.jquery.com/ticket/2114 is solved
			return $([]).add(this.currentForm.elements)
			.filter(":input")
			.not(":submit, :reset, :image, [disabled]")
			.not( this.settings.ignore )
			.filter(function() {
				!this.name && validator.settings.debug && window.console && console.error( "%o has no name assigned", this);

				// select only the first element for each name, and only those with rules specified
				if ( this.name in rulesCache || !validator.objectLength($(this).rules()) ){
					return false;
				}
				rulesCache[this.name] = true;
				return true;
			});
		},

		clean: function( selector ) {
			return $( selector )[0];
		},

		errors: function() {
			return $( this.settings.errorElement + "." + this.settings.errorClass, this.errorContext );
		},

		reset: function() {
			this.successList = [];
			this.errorList = [];
			this.errorMap = {};
			this.toShow = $([]);
			this.toHide = $([]);
			this.currentElements = $([]);
		},

		prepareForm: function() {
			this.reset();
			this.toHide = this.errors().add( this.containers );
		},

		prepareElement: function( element ) {
			this.reset();
			this.toHide = this.errorsFor(element);
		},

		check: function( element ) {
			element = this.clean( element );

			// if radio/checkbox, validate first element in group instead
			if (this.checkable(element)) {
				element = this.findByName( element.name )[0];
			}

			var rules = $(element).rules();			
			var dependencyMismatch = false;
			for( method in rules ) {
				var rule = { method: method, parameters: rules[method] };
				try {
					var result = $.validator.methods[method].call( this, element.value.replace(/\r/g, ""), element, rule.parameters );

					// if a method indicates that the field is optional and therefore valid,
					// don't mark it as valid when there are no other rules
					if ( result == "dependency-mismatch" ) {
						dependencyMismatch = true;
						continue;
					}
					dependencyMismatch = false;

					if ( result == "pending" ) {
						this.toHide = this.toHide.not( this.errorsFor(element) );
						return;
					}

					if( !result ) {
						this.formatAndAdd( element, rule );
						return false;
					}
				} catch(e) {
					this.settings.debug && window.console && console.log("exception occured when checking element " + element.id
						 + ", check the '" + rule.method + "' method", e);
					throw e;
				}
			}
			if (dependencyMismatch)
				return;
			if ( this.objectLength(rules) )
				this.successList.push(element);
			return true;
		},

		// return the custom message for the given element and validation method
		// specified in the element's "messages" metadata
		customMetaMessage: function(element, method) {
			if (!$.metadata)
				return;

			var meta = this.settings.meta
				? $(element).metadata()[this.settings.meta]
				: $(element).metadata();

			return meta && meta.messages && meta.messages[method];
		},

		// return the custom message for the given element name and validation method
		customMessage: function( name, method ) {
			var m = this.settings.messages[name];
			return m && (m.constructor == String
				? m
				: m[method]);
		},

		// return the first defined argument, allowing empty strings
		findDefined: function() {
			for(var i = 0; i < arguments.length; i++) {
				if (arguments[i] !== undefined)
					return arguments[i];
			}
			return undefined;
		},

		defaultMessage: function( element, method) {
			return this.findDefined(
				this.customMessage( element.name, method ),
				this.customMetaMessage( element, method ),
				// title is never undefined, so handle empty string as undefined
				!this.settings.ignoreTitle && element.title || undefined,
				$.validator.messages[method],
				"<strong>Warning: No message defined for " + element.name + "</strong>"
			);
		},

		formatAndAdd: function( element, rule ) {
			var message = this.defaultMessage( element, rule.method ),
				theregex = /\$?\{(\d+)\}/g;
			if ( typeof message == "function" ) {
				message = message.call(this, rule.parameters, element);
			} else if (theregex.test(message)) {
				message = jQuery.format(message.replace(theregex, '{$1}'), rule.parameters);
			}
			this.errorList.push({
				message: message,
				element: element
			});

			this.errorMap[element.name] = message;
			this.submitted[element.name] = message;
		},

		addWrapper: function(toToggle) {
			if ( this.settings.wrapper )
				toToggle = toToggle.add( toToggle.parent( this.settings.wrapper ) );
			return toToggle;
		},

		defaultShowErrors: function() {
			for ( var i = 0; this.errorList[i]; i++ ) {
				var error = this.errorList[i];
				this.settings.highlight && this.settings.highlight.call( this, error.element, this.settings.errorClass, this.settings.validClass );
				this.showLabel( error.element, error.message );
			}
			if( this.errorList.length ) {
				this.toShow = this.toShow.add( this.containers );
			}
			if (this.settings.success) {
				for ( var i = 0; this.successList[i]; i++ ) {
					this.showLabel( this.successList[i] );
				}
			}
			if (this.settings.unhighlight) {
				for ( var i = 0, elements = this.validElements(); elements[i]; i++ ) {
					this.settings.unhighlight.call( this, elements[i], this.settings.errorClass, this.settings.validClass );
				}
			}
			this.toHide = this.toHide.not( this.toShow );
			this.hideErrors();
			this.addWrapper( this.toShow ).show();
		},

		validElements: function() {
			return this.currentElements.not(this.invalidElements());
		},

		invalidElements: function() {
			return $(this.errorList).map(function() {
				return this.element;
			});
		},

		showLabel: function(element, message) {
			var label = this.errorsFor( element );
			if ( label.length ) {
				// refresh error/success class
				label.removeClass().addClass( this.settings.errorClass );

				// check if we have a generated label, replace the message then
				label.attr("generated") && label.html(message);
			} else {
				// create label
				label = $("<" + this.settings.errorElement + "/>")
					.attr({"for":  this.idOrName(element), generated: true})
					.addClass(this.settings.errorClass)
					.html(message || "");
				if ( this.settings.wrapper ) {
					// make sure the element is visible, even in IE
					// actually showing the wrapped element is handled elsewhere
					label = label.hide().show().wrap("<" + this.settings.wrapper + "/>").parent();
				}
				if ( !this.labelContainer.append(label).length )
					//ylw
					var p=$(element).parent();
					if (p.attr("tagName")=="SPAN" && p.attr("class").indexOf("combo")>-1) 
						this.settings.errorPlacement
							? this.settings.errorPlacement(label, $(p) )
							: label.insertAfter(p);
					else
					//ylw^
						this.settings.errorPlacement
							? this.settings.errorPlacement(label, $(element) )
							: label.insertAfter(element);
			}
			if ( !message && this.settings.success ) {
				label.text("");
				typeof this.settings.success == "string"
					? label.addClass( this.settings.success )
					: this.settings.success( label );
			}
			this.toShow = this.toShow.add(label);
		},

		errorsFor: function(element) {
			var name = this.idOrName(element);
    		return this.errors().filter(function() {
				return $(this).attr('for') == name;
			});
		},

		idOrName: function(element) {
			return this.groups[element.name] || (this.checkable(element) ? element.name : element.id || element.name);
		},

		checkable: function( element ) {
			return /radio|checkbox/i.test(element.type);
		},

		findByName: function( name ) {
			// select by name and filter by form for performance over form.find("[name=...]")
			var form = this.currentForm;
			return $(document.getElementsByName(name)).map(function(index, element) {
				return element.form == form && element.name == name && element  || null;
			});
		},

		getLength: function(value, element) {
			switch( element.nodeName.toLowerCase() ) {
			case 'select':
				return $("option:selected", element).length;
			case 'input':
				if( this.checkable( element) )
					return this.findByName(element.name).filter(':checked').length;
			}
			return value.length;
		},

		depend: function(param, element) {
			return this.dependTypes[typeof param]
				? this.dependTypes[typeof param](param, element)
				: true;
		},

		dependTypes: {
			"boolean": function(param, element) {
				return param;
			},
			"string": function(param, element) {
				return !!$(param, element.form).length;
			},
			"function": function(param, element) {
				return param(element);
			}
		},

		optional: function(element) {
			return !$.validator.methods.required.call(this, $.trim(element.value), element) && "dependency-mismatch";
		},

		startRequest: function(element) {
			if (!this.pending[element.name]) {
				this.pendingRequest++;
				this.pending[element.name] = true;
			}
		},

		stopRequest: function(element, valid) {
			this.pendingRequest--;
			// sometimes synchronization fails, make sure pendingRequest is never < 0
			if (this.pendingRequest < 0)
				this.pendingRequest = 0;
			delete this.pending[element.name];
			if ( valid && this.pendingRequest == 0 && this.formSubmitted && this.form() ) {
				$(this.currentForm).submit();
				this.formSubmitted = false;
			} else if (!valid && this.pendingRequest == 0 && this.formSubmitted) {
				$(this.currentForm).triggerHandler("invalid-form", [this]);
				this.formSubmitted = false;
			}
		},

		previousValue: function(element) {
			return $.data(element, "previousValue") || $.data(element, "previousValue", {
				old: null,
				valid: true,
				message: this.defaultMessage( element, "remote" )
			});
		}

	},

	classRuleSettings: {
		required: {required: true},
		email: {email: true},
		url: {url: true},
		date: {date: true},
		dateISO: {dateISO: true},
		dateDE: {dateDE: true},
		number: {number: true},
		numberDE: {numberDE: true},
		digits: {digits: true},
		creditcard: {creditcard: true}
	},

	addClassRules: function(className, rules) {
		className.constructor == String ?
			this.classRuleSettings[className] = rules :
			$.extend(this.classRuleSettings, className);
	},

	classRules: function(element) {
		var rules = {};
		var classes = $(element).attr('class');
		classes && $.each(classes.split(' '), function() {
			if (this in $.validator.classRuleSettings) {
				$.extend(rules, $.validator.classRuleSettings[this]);
			}
		});
		return rules;
	},

	attributeRules: function(element) {
		var rules = {};
		var $element = $(element);

		for (method in $.validator.methods) {
			var value = $element.attr(method);
			if (value) {
				rules[method] = value;
			}
		}

		// maxlength may be returned as -1, 2147483647 (IE) and 524288 (safari) for text inputs
		if (rules.maxlength && /-1|2147483647|524288/.test(rules.maxlength)) {
			delete rules.maxlength;
		}

		return rules;
	},

	metadataRules: function(element) {
		if (!$.metadata) return {};

		var meta = $.data(element.form, 'validator').settings.meta;
		return meta ?
			$(element).metadata()[meta] :
			$(element).metadata();
	},

	staticRules: function(element) {
		var rules = {};
		var validator = $.data(element.form, 'validator');
		if (validator.settings.rules) {
			rules = $.validator.normalizeRule(validator.settings.rules[element.name]) || {};
		}
		return rules;
	},

	normalizeRules: function(rules, element) {
		// handle dependency check
		$.each(rules, function(prop, val) {
			// ignore rule when param is explicitly false, eg. required:false
			if (val === false) {
				delete rules[prop];
				return;
			}
			if (val.param || val.depends) {
				var keepRule = true;
				switch (typeof val.depends) {
					case "string":
						keepRule = !!$(val.depends, element.form).length;
						break;
					case "function":
						keepRule = val.depends.call(element, element);
						break;
				}
				if (keepRule) {
					rules[prop] = val.param !== undefined ? val.param : true;
				} else {
					delete rules[prop];
				}
			}
		});

		// evaluate parameters
		$.each(rules, function(rule, parameter) {
			rules[rule] = $.isFunction(parameter) ? parameter(element) : parameter;
		});

		// clean number parameters
		$.each(['minlength', 'maxlength', 'min', 'max'], function() {
			if (rules[this]) {
				rules[this] = Number(rules[this]);
			}
		});
		$.each(['rangelength', 'range'], function() {
			if (rules[this]) {
				rules[this] = [Number(rules[this][0]), Number(rules[this][1])];
			}
		});

		if ($.validator.autoCreateRanges) {
			// auto-create ranges
			if (rules.min && rules.max) {
				rules.range = [rules.min, rules.max];
				delete rules.min;
				delete rules.max;
			}
			if (rules.minlength && rules.maxlength) {
				rules.rangelength = [rules.minlength, rules.maxlength];
				delete rules.minlength;
				delete rules.maxlength;
			}
		}

		// To support custom messages in metadata ignore rule methods titled "messages"
		if (rules.messages) {
			delete rules.messages;
		}

		return rules;
	},

	// Converts a simple string to a {string: true} rule, e.g., "required" to {required:true}
	normalizeRule: function(data) {
		if( typeof data == "string" ) {
			var transformed = {};
			$.each(data.split(/\s/), function() {
				transformed[this] = true;
			});
			data = transformed;
		}
		return data;
	},

	// http://docs.jquery.com/Plugins/Validation/Validator/addMethod
	addMethod: function(name, method, message) {
		$.validator.methods[name] = method;
		$.validator.messages[name] = message != undefined ? message : $.validator.messages[name];
		if (method.length < 3) {
			$.validator.addClassRules(name, $.validator.normalizeRule(name));
		}
	},

	methods: {

		// http://docs.jquery.com/Plugins/Validation/Methods/required
		required: function(value, element, param) {
			// check if dependency is met
			if ( !this.depend(param, element) )
				return "dependency-mismatch";
			switch( element.nodeName.toLowerCase() ) {
			case 'select':
				// could be an array for select-multiple or a string, both are fine this way
				var val = $(element).val();
				//ylw
				if ($.data($(element)[0],"combo")!=undefined) {
					val=$(element).combo("getValue");
				}
				//ylw^
				return val && val.length > 0;
			case 'input':
				//ylw
				if ($.data($(element)[0],"combo")!=undefined) {
					return $(element).combo("getValue")==""?false:true;
				} else {
				//ylw^
					if ( this.checkable(element) )
						return this.getLength(value, element) > 0;
				}
			default:
				return $.trim(value).length > 0;
			}
		},

		// http://docs.jquery.com/Plugins/Validation/Methods/remote
		remote: function(value, element, param) {
			if ( this.optional(element) )
				return "dependency-mismatch";

			var previous = this.previousValue(element);
			if (!this.settings.messages[element.name] )
				this.settings.messages[element.name] = {};
			previous.originalMessage = this.settings.messages[element.name].remote;
			this.settings.messages[element.name].remote = previous.message;

			param = typeof param == "string" && {url:param} || param;

			if ( previous.old !== value ) {
				previous.old = value;
				var validator = this;
				this.startRequest(element);
				var data = {};
				data[element.name] = value;
				$.ajax($.extend(true, {
					//url: param,
					url: param.url,
					mode: "abort",
					port: "validate" + element.name,
					dataType: "json",
					//data: data,
					data: param.data || data,
					success: function(response) {
						validator.settings.messages[element.name].remote = previous.originalMessage;
						var valid = response === true;
						if ( valid ) {
							var submitted = validator.formSubmitted;
							validator.prepareElement(element);
							validator.formSubmitted = submitted;
							validator.successList.push(element);
							validator.showErrors();
						} else {
							var errors = {};
							var message = (previous.message = response || validator.defaultMessage( element, "remote" ));
							errors[element.name] = $.isFunction(message) ? message(value) : message;
							validator.showErrors(errors);
						}
						previous.valid = valid;
						validator.stopRequest(element, valid);
					}
				}, param));
				return "pending";
			} else if( this.pending[element.name] ) {
				return "pending";
			}
			return previous.valid;
		},

		// http://docs.jquery.com/Plugins/Validation/Methods/minlength
		minlength: function(value, element, param) {
			return this.optional(element) || this.getLength($.trim(value), element) >= param;
		},

		// http://docs.jquery.com/Plugins/Validation/Methods/maxlength
		maxlength: function(value, element, param) {
			return this.optional(element) || this.getLength($.trim(value), element) <= param;
		},

		// http://docs.jquery.com/Plugins/Validation/Methods/rangelength
		rangelength: function(value, element, param) {
			var length = this.getLength($.trim(value), element);
			return this.optional(element) || ( length >= param[0] && length <= param[1] );
		},

		// http://docs.jquery.com/Plugins/Validation/Methods/min
		min: function( value, element, param ) {
			return this.optional(element) || value >= param;
		},

		// http://docs.jquery.com/Plugins/Validation/Methods/max
		max: function( value, element, param ) {
			return this.optional(element) || value <= param;
		},

		// http://docs.jquery.com/Plugins/Validation/Methods/range
		range: function( value, element, param ) {
			return this.optional(element) || ( value >= param[0] && value <= param[1] );
		},

		// http://docs.jquery.com/Plugins/Validation/Methods/email
		email: function(value, element) {
			// contributed by Scott Gonzalez: http://projects.scottsplayground.com/email_address_validation/
			return this.optional(element) || /^((([a-z]|\d|[!#\$%&'\*\+\-\/=\?\^_`{\|}~]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])+(\.([a-z]|\d|[!#\$%&'\*\+\-\/=\?\^_`{\|}~]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])+)*)|((\x22)((((\x20|\x09)*(\x0d\x0a))?(\x20|\x09)+)?(([\x01-\x08\x0b\x0c\x0e-\x1f\x7f]|\x21|[\x23-\x5b]|[\x5d-\x7e]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(\\([\x01-\x09\x0b\x0c\x0d-\x7f]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF]))))*(((\x20|\x09)*(\x0d\x0a))?(\x20|\x09)+)?(\x22)))@((([a-z]|\d|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(([a-z]|\d|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])([a-z]|\d|-|\.|_|~|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])*([a-z]|\d|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])))\.)+(([a-z]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(([a-z]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])([a-z]|\d|-|\.|_|~|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])*([a-z]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])))\.?$/i.test(value);
		},

		// http://docs.jquery.com/Plugins/Validation/Methods/url
		url: function(value, element) {
			// contributed by Scott Gonzalez: http://projects.scottsplayground.com/iri/
			//ylw easyui的combobox和combotree可能也设置了url属性
			if ($(element).attr("url")) return true;
			//ylw^
			return this.optional(element) || /^(https?|ftp):\/\/(((([a-z]|\d|-|\.|_|~|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(%[\da-f]{2})|[!\$&'\(\)\*\+,;=]|:)*@)?(((\d|[1-9]\d|1\d\d|2[0-4]\d|25[0-5])\.(\d|[1-9]\d|1\d\d|2[0-4]\d|25[0-5])\.(\d|[1-9]\d|1\d\d|2[0-4]\d|25[0-5])\.(\d|[1-9]\d|1\d\d|2[0-4]\d|25[0-5]))|((([a-z]|\d|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(([a-z]|\d|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])([a-z]|\d|-|\.|_|~|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])*([a-z]|\d|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])))\.)+(([a-z]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(([a-z]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])([a-z]|\d|-|\.|_|~|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])*([a-z]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])))\.?)(:\d*)?)(\/((([a-z]|\d|-|\.|_|~|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(%[\da-f]{2})|[!\$&'\(\)\*\+,;=]|:|@)+(\/(([a-z]|\d|-|\.|_|~|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(%[\da-f]{2})|[!\$&'\(\)\*\+,;=]|:|@)*)*)?)?(\?((([a-z]|\d|-|\.|_|~|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(%[\da-f]{2})|[!\$&'\(\)\*\+,;=]|:|@)|[\uE000-\uF8FF]|\/|\?)*)?(\#((([a-z]|\d|-|\.|_|~|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(%[\da-f]{2})|[!\$&'\(\)\*\+,;=]|:|@)|\/|\?)*)?$/i.test(value);
		},

		// http://docs.jquery.com/Plugins/Validation/Methods/date
		date: function(value, element) {
			return this.optional(element) || !/Invalid|NaN/.test(new Date(value));
		},

		// http://docs.jquery.com/Plugins/Validation/Methods/dateISO
		dateISO: function(value, element) {
			return this.optional(element) || /^\d{4}[\/-]\d{1,2}[\/-]\d{1,2}$/.test(value);
		},

		// http://docs.jquery.com/Plugins/Validation/Methods/number
		number: function(value, element) {
			return this.optional(element) || /^-?(?:\d+|\d{1,3}(?:,\d{3})+)(?:\.\d+)?$/.test(value);
		},

		// http://docs.jquery.com/Plugins/Validation/Methods/digits
		digits: function(value, element) {
			return this.optional(element) || /^\d+$/.test(value);
		},

		// http://docs.jquery.com/Plugins/Validation/Methods/creditcard
		// based on http://en.wikipedia.org/wiki/Luhn
		creditcard: function(value, element) {
			if ( this.optional(element) )
				return "dependency-mismatch";
			// accept only digits and dashes
			if (/[^0-9-]+/.test(value))
				return false;
			var nCheck = 0,
				nDigit = 0,
				bEven = false;

			value = value.replace(/\D/g, "");

			for (var n = value.length - 1; n >= 0; n--) {
				var cDigit = value.charAt(n);
				var nDigit = parseInt(cDigit, 10);
				if (bEven) {
					if ((nDigit *= 2) > 9)
						nDigit -= 9;
				}
				nCheck += nDigit;
				bEven = !bEven;
			}

			return (nCheck % 10) == 0;
		},

		// http://docs.jquery.com/Plugins/Validation/Methods/accept
		accept: function(value, element, param) {
			param = typeof param == "string" ? param.replace(/,/g, '|') : "png|jpe?g|gif";
			return this.optional(element) || value.match(new RegExp(".(" + param + ")$", "i"));
		},

		// http://docs.jquery.com/Plugins/Validation/Methods/equalTo
		equalTo: function(value, element, param) {
			// bind to the blur event of the target in order to revalidate whenever the target field is updated
			// TODO find a way to bind the event just once, avoiding the unbind-rebind overhead
			var target = $(param).unbind(".validate-equalTo").bind("blur.validate-equalTo", function() {
				$(element).valid();
			});
			return value == target.val();
		}

	}

});

// deprecated, use $.validator.format instead
$.format = $.validator.format;

})(jQuery);
*/

// ajax mode: abort
// usage: $.ajax({ mode: "abort"[, port: "uniqueport"]});
// if mode:"abort" is used, the previous request on that port (port can be undefined) is aborted via XMLHttpRequest.abort()
;(function($) {
	var ajax = $.ajax;
	var pendingRequests = {};
	$.ajax = function(settings) {
		// create settings for compatibility with ajaxSetup
		settings = $.extend(settings, $.extend({}, $.ajaxSettings, settings));
		var port = settings.port;
		if (settings.mode == "abort") {
			if ( pendingRequests[port] ) {
				pendingRequests[port].abort();
			}
			return (pendingRequests[port] = ajax.apply(this, arguments));
		}
		return ajax.apply(this, arguments);
	};
})(jQuery);

// provides cross-browser focusin and focusout events
// IE has native support, in other browsers, use event caputuring (neither bubbles)

// provides delegate(type: String, delegate: Selector, handler: Callback) plugin for easier event delegation
// handler is only called when $(event.target).is(delegate), in the scope of the jquery-object for event.target
;(function($) {
	// only implement if not provided by jQuery core (since 1.4)
	// TODO verify if jQuery 1.4's implementation is compatible with older jQuery special-event APIs
	if (!jQuery.event.special.focusin && !jQuery.event.special.focusout && document.addEventListener) {
		$.each({
			focus: 'focusin',
			blur: 'focusout'
		}, function( original, fix ){
			$.event.special[fix] = {
				setup:function() {
					this.addEventListener( original, handler, true );
				},
				teardown:function() {
					this.removeEventListener( original, handler, true );
				},
				handler: function(e) {
					arguments[0] = $.event.fix(e);
					arguments[0].type = fix;
					return $.event.handle.apply(this, arguments);
				}
			};
			function handler(e) {
				e = $.event.fix(e);
				e.type = fix;
				return $.event.handle.call(this, e);
			}
		});
	};
	$.extend($.fn, {
		validateDelegate: function(delegate, type, handler) {
			return this.bind(type, function(event) {
				var target = $(event.target);
				if (target.is(delegate)) {
					return handler.apply(target, arguments);
				}
			});
		}
	});
})(jQuery);


/* 
jQuery.extend(jQuery.validator.messages, {
    required: "必选字段",
		remote: "请修正该字段",
		email: "请输入正确格式的电子邮件",
		url: "请输入合法的网址",
		date: "请输入合法的日期",
		dateISO: "请输入合法的日期 (ISO).",
		number: "请输入合法的数字",
		digits: "只能输入整数",
		creditcard: "请输入合法的信用卡号",
		equalTo: "请再次输入相同的值",
		accept: "请输入拥有合法后缀名的字符串",
		maxlength: jQuery.validator.format("请输入一个长度最多是 {0} 的字符串"),
		minlength: jQuery.validator.format("请输入一个长度最少是 {0} 的字符串"),
		rangelength: jQuery.validator.format("请输入一个长度介于 {0} 和 {1} 之间的字符串"),
		range: jQuery.validator.format("请输入一个介于 {0} 和 {1} 之间的值"),
		max: jQuery.validator.format("请输入一个最大为 {0} 的值"),
		min: jQuery.validator.format("请输入一个最小为 {0} 的值")
});
*/


(function($){
	$.fn.colorTip = function(settings){

		var defaultSettings = {
			color		: 'yellow',
			timeout		: 500
		}
		
		var supportedColors = ['red','green','blue','white','yellow','black'];
		
		/* Combining the default settings object with the supplied one */
		settings = $.extend(defaultSettings,settings);

		/*
		*	Looping through all the elements and returning them afterwards.
		*	This will add chainability to the plugin.
		*/
		
		return this.each(function(){

			var elem = $(this);
			
			// If the title attribute is empty, continue with the next element
			if(!elem.attr('title')) return true;
			
			// Creating new eventScheduler and Tip objects for this element.
			// (See the class definition at the bottom).
			
			var scheduleEvent = new eventScheduler();
			var tip = new Tip(elem.attr('title'));

			// Adding the tooltip markup to the element and
			// applying a special class:
			
			elem.append(tip.generate()).addClass('colorTipContainer');

			// Checking to see whether a supported color has been
			// set as a classname on the element.
			
			var hasClass = false;
			for(var i=0;i<supportedColors.length;i++)
			{
				if(elem.hasClass(supportedColors[i])){
					hasClass = true;
					break;
				}
			}
			
			// If it has been set, it will override the default color
			
			if(!hasClass){
				elem.addClass(settings.color);
			}
			
			// On mouseenter, show the tip, on mouseleave set the
			// tip to be hidden in half a second.
			
			elem.hover(function(){

				tip.show();
				
				// If the user moves away and hovers over the tip again,
				// clear the previously set event:
				
				scheduleEvent.clear();

			},function(){

				// Schedule event actualy sets a timeout (as you can
				// see from the class definition below).
				
				scheduleEvent.set(function(){
					tip.hide();
				},settings.timeout);

			});
			
			// Removing the title attribute, so the regular OS titles are
			// not shown along with the tooltips.
			
			elem.removeAttr('title');
		});
		
	}


	/*
	/	Event Scheduler Class Definition
	*/

	function eventScheduler(){}
	
	eventScheduler.prototype = {
		set	: function (func,timeout){

			// The set method takes a function and a time period (ms) as
			// parameters, and sets a timeout

			this.timer = setTimeout(func,timeout);
		},
		clear: function(){
			
			// The clear method clears the timeout
			
			clearTimeout(this.timer);
		}
	}


	/*
	/	Tip Class Definition
	*/

	function Tip(txt){
		this.content = txt;
		this.shown = false;
	}
	
	Tip.prototype = {
		generate: function(){
			
			// The generate method returns either a previously generated element
			// stored in the tip variable, or generates it and saves it in tip for
			// later use, after which returns it.
			
			return this.tip || (this.tip = $('<span class="colorTip">'+this.content+
											 '<span class="pointyTipShadow"></span><span class="pointyTip"></span></span>'));
		},
		show: function(){
			if(this.shown) return;
			
			// Center the tip and start a fadeIn animation
			this.tip.css('margin-left',-this.tip.outerWidth()/2).fadeIn('fast');
			this.shown = true;
		},
		hide: function(){
			this.tip.fadeOut();
			this.shown = false;
		}
	}
	
})(jQuery);


/*
* databind
* author: yinglinwei
* version: 1.1
* desc: 支持以<span isform>标签嵌套形式的绑定和反绑定
* bindData 将json对象的数据绑定到form的元素中
* unbindData 将form中的元素转换到json对象中
*/

(function($) {
	$.fn.extend({bindData:function(data, map, fn) {
		if(fn != null && !$.isFunction(fn)) {
			fn = null
		}
		if(map != null && $.isFunction(map)) {
			map = null
		}
		return this.each(function() {
			if($.isArray(data)) {
				var tagName = this.tagName.toLowerCase();
				if(tagName == "table" || tagName == "tbody") {
					bindTable(data);
				}
				if(tagName == "select") {
					bindSelect(this, data)
				}
			}else {
				if(typeof data == "object") {
					bindObject(this, data)
				}
			}
		});

		function bindObject(scope,json) {
			var $scope=$(scope);
			for(var key in json) {
				var value = json[key];
				var selector = "#" + key;
				//如果需要绑定的数据源是数组，查找页面上具有相同id的顺序绑定
				if ($.isArray(value)) {
					if (value[0]!=undefined && typeof value[0]!="object" && $(selector) && $(selector).attr("comboname") ) {
						bindEasyUI(selector,key,value,json);
						continue;
					}
					var n=0;
					$(selector, $scope).each(function() {
						if (value[n]) bindObject(this,value[n]);
						n++;
					});
					continue;
				}
				if(typeof value=="object") {
					var subscope=$scope.find(selector);
					if (subscope.attr("isform")!=undefined) {
						bindObject(subscope,value);
					} else {
						bindObject(scope,value);
					}
					continue
				}
				if(map != null) {
					var lookup = map[key];
					if(typeof lookup == "string") {
						selector = lookup
					}
				}
				var result = true;
				if(fn != null) {
					var args = {selector:selector, value:value};
					result = fn(args);
					if(result) {
						selector = args.selector;
						value = args.value
					}
				}
				if(result) {
					$(selector, $scope).each(function() {
						var tag = this.tagName.toLowerCase();
						var $this = $(this);
						if(tag == "input") {
							if ($this.attr("type")=="checkbox" || $this.attr("type")=="radiobox") {
								if (value!=0||value=="true")
									$this.attr("checked",true);
								else
									$this.attr("checked",false);
							}
							if ($this.attr("type")=="text" || $this.attr("type")=="hidden") {
								if ($this.attr("comboname")) {
									bindEasyUI(this,key,value,json);
								} else $this.val(value);
							}
						}else {
							if(tag == "select") {
								if($.isArray(value)) {
									bindSelect(this, value)
								}else {
									try {
										if ($this.attr("comboname")) {
											bindEasyUI(this,key,value,json);
										} else $this.val(value.toString());
									}catch(e) {
									}
								}
							}
							else if(tag == "span"){
								if($this.attr("data") != null && $this.attr("data") != ''){
									var value1 = value;
									$.getJSON("../cache!getCacheByName.action?paramName="+$this.attr("data"),{nd:(new Date).getTime()},function(data){
										var boo = false;
										$.each(data[$this.attr("data")],function(i,item) {
											if(value1 != null && value1 != '' && value1 == item.VALUE){
												value1 = item.NAME;
												boo = true;
												return true;
											}
											if(boo==true){
												if($this.text() == $this.html()) {
													$this.text(value1);
												}else {
													$this.html(value1);
												}
											}else{
												if($this.text() == $this.html()) {
													$this.text('');
												}else {
													$this.html('');
												}
											}
										});
									});
								}else{
									if($this.text() == $this.html()) {
										$this.text(value)
									}else {
										$this.html(value)
									}
								}
							}
							else {
								if($this.text() == $this.html()) {
									$this.val(value)
								}else {
									$this.html(value)
								}
							}
						}
					});
				}
			}
		}
		
		function bindEasyUI(element, key, value, data) {
			if (typeof value=="string"&& value.indexOf(",")>-1)
				value=value.split(",");

			if ($.data($(element)[0],"cascadeselect")!=undefined) {
				$(element).cascadeselect("setValue",value);
				return;
			}

			if ($.data($(element)[0],"combotree")!=undefined) {
				if ($.isArray(value)) 
					$(element).combotree("setValues",value);
				else
					$(element).combotree("setValue",value);
				
				if ($(element).combotree("getText")==$(element).combotree("getValue") 
					&& data[key+"_text"]) 
					$(element).combotree("setText",data[key+"_text"]);
				return;
			}
			if ($.data($(element)[0],"combobox")!=undefined) {
				if ($.isArray(value)) 
					$(element).combobox("setValues",value);
				else
					$(element).combobox("setValue",value);
				return;
			}
			if ($.data($(element)[0],"combogrid")!=undefined) {
				if ($.isArray(value)) 
					$(element).combogrid("setValues",value);
				else
					$(element).combogrid("setValue",value);
				return;
			}
			if ($.data($(element)[0],"combo")!=undefined) {
				if ($.isArray(value))
					$(element).combo("setValues",value).combo("setText",value.join(","));
				else
					$(element).combo("setValue",value).combo("setText",value);
				return;
			}
			if ($.data($(element)[0],"input")!=undefined) {
				$(element).input("setValue",value);
				return;
			}
		}
		
		function bindSelect(element, array) {
			var html = [];
			for(var i in array) {
				var option = array[i];
				if(typeof option == "object") {
					if($.isArray(option)) {
						html.push('<option value="');
						html.push(option[0]);
						html.push('">');
						html.push(option[1])
					}else {
						var flag = true;
						for(var key2 in option) {
							var value2 = option[key2];
							if(flag) {
								html.push('<option value="');
								html.push(value2);
								html.push('">');
								flag = false
							}else {
								html.push(value2);
								break
							}
						}
					}
				}else {
					html.push("<option>");
					html.push(option)
				}
				html.push("</option>")
			}
			$(element).html(html.join(""))
		}
		function bindTable(array) {
			var is2D = $.isArray(array[0]);
			var html = [];
			var row = [];
			var col;
			var selector = "";
			var result = true;
			var value = null;
			html.push("<tbody>");
			for(var i in array) {
				row = array[i];
				selector = "<tr>";
				result = true;
				if(fn != null) {
					var args = {element:selector, row:row, col:i};
					result = fn(args);
					if(result) {
						selector = args.element
					}
				}
				if(result) {
					html.push(selector);
					if(is2D) {
						for(var i2 in row) {
							value = row[i2];
							selector = "<td>";
							result = true;
							if(map != null && $.isArray(map)) {
								var index = map[i2];
								if(typeof index == "number") {
									value = row[index]
								}
							}
							if(fn != null) {
								var args = {element:selector, value:value, col:i2};
								result = fn(args);
								if(result) {
									selector = args.element;
									value = args.value
								}
							}
							if(result) {
								html.push(selector);
								html.push(value);
								html.push("</td>")
							}
						}
					}else {
						if(typeof row == "object") {
							var i = 0;
							for(var key in row) {
								value = row[key];
								selector = "<td>";
								result = true;
								if(map != null) {
									key = map[i];
									value = row[key]
								}
								if(fn != null) {
									var args = {element:selector, key:key, value:value};
									result = fn(args);
									if(result) {
										selector = args.element;
										value = args.value
									}
								}
								if(result) {
									html.push(selector);
									html.push(value);
									html.push("</td>")
								}
								if(map != null && i >= map.length - 1) {
									break
								}
								i++
							}
						}else {
							value = row;
							selector = "<td>";
							result = true;
							if(fn != null) {
								var args = {element:selector, value:value};
								result = fn(args);
								if(result) {
									selector = args.element;
									value = args.value
								}
							}
							if(result) {
								html.push(selector);
								html.push(value);
								html.push("</td>")
							}
						}
					}
					html.push("</tr>")
				}
			}
			html.push("</tbody>");
			$("tbody", $scope).replaceWith(html.join(""))
		}
	}, unbindData:function(map, fn) {
		var fdata={};
		var $scope = $(this);
		if(fn != null && !$.isFunction(fn)) {
			fn = null
		}
		if(map != null && $.isFunction(map)) {
			map = null
		}
		this.each(function() {
			var elements = [];
			if(map != null) {
				for(var key in map) {
					$(map[key], $scope).each(function() {
						var tag = this.tagName.toLowerCase();
						var val = tag == "input" || tag == "select" ? $(this).val() : $(this).text();
						elements.push({element:this, name:key, value:val})
					})
				}
			}

			$("input, select, textarea", $scope).each(function() {
				if ($(this).attr("type")=='button' || $(this).attr("type")=='submit' || $(this).attr("type")=='reset') return;
				var child = this;
				var flag = true;
				for(var i2 in elements) {
					var element = elements[i2];
					if(element.element == child) {
						flag = false;
						break
					}
				}
				if(flag) {
					// 类似form提交，dom元素定义了name，则优先使用name，如果没有则采用id 
					var kname=$(child).attr("name");
					if (kname==undefined || $.trim(kname)=="") kname=$(child).attr("id");
					if (kname==undefined || kname=="") return;
					elements.push({element:this, name:kname,value:$(child).val()});
				}
			});

			var element;
			var check;
			function mergedata(tdata,data){
				$.each(data,function(k,v){
					if (k=="hlobject") return;
					if (tdata[k]==undefined) {
						// 还没有 直接加入  
						$.extend(tdata,data);
					} else {
						if ($.isArray(tdata[k])) {
							// 循环找，应该插入那一个对象 
							for(var k1 in tdata[k]){
								if (tdata[k][k1]["hlobject"]==v["hlobject"]) {
									mergedata(tdata[k][k1],data[k]);
									return;
								}
							}
							tdata[k].push(data[k]);
						} else if (typeof tdata[k]=="object") {
							// 对比是否相同，如果相同则直接加入；不同则变为数组 
							if (tdata[k]["hlobject"]==v["hlobject"]) {
								mergedata(tdata[k],data[k]);
							} else {
								var tmp=[];
								tmp.push(tdata[k]);
								tmp.push(data[k]);
								tdata[k]=tmp;
							}
						} else {
							tdata[k]=(tdata[k]==""||data[k]=="") ? tdata[k]+data[k] : tdata[k]=tdata[k]+","+data[k];
						}
					}
				});
			}

			function deletehlobject(tdata) {
				for (var k in tdata) {
					if (k=="hlobject") continue;
					if ($.isArray(tdata[k]) || typeof tdata[k]=="object")
						deletehlobject(tdata[k]);
				}
				if (tdata["hlobject"]!=undefined)	delete tdata["hlobject"];
			}

			// 将页面上定义的层级关系 找出来 
			for (var i3 in elements) {
				dom = elements[i3];
				var domdata={};
				var lvl=0;
				var key="";
				$(dom.element).parents("span").each(function(){
					// 把设置为notform的子元素给剔除掉 
					if ($(this).attr("notform")!=undefined) {
						dom.element="";
						return;
					}

					if ($(this).attr("isform")!=undefined) {
						dom.element="";
						if (lvl==0) domdata[dom.name]=dom.value;
						var domdata1={};
						key=$(this).attr("id");
						domdata1[key]=domdata;
						domdata1["hlobject"]=this;
						domdata=domdata1;
						lvl++;
					}
				});

				mergedata(fdata,domdata);
			}
			deletehlobject(fdata);

			for (var i in elements) {
				element = elements[i];
				if(typeof element.element!="object") continue;
				if(element.name == "") continue;
				var values = [];
				var first = true;
				for(var i2 in elements) {
					check = elements[i2];
					if(typeof check.element!="object") continue;
					if(check.name == "") continue;
					if(check.name == element.name) {
						values.push(check.value);
						if(element != check) check.name = "";
					}
				}
				var result = true;
				var value="";

				if (values.length>1) {
					for(var ii in values) {
						if (values[ii]=="") continue;
						if (typeof values[ii]=="object" || typeof values[ii]=="function") continue;
						if (value=="") value=values[ii]; else value+=","+values[ii];
					}
				} else {
					value=values[0];
				}

				if(fn != null) {
					var args = {selector:element.name, value:value};
					result = fn(args);
					if(result) {
						element.name = selector;
						value = args.value;
					}
				}
				fdata[element.name] = value;
			}
		});
		return fdata;
	}})
})(jQuery);

//begin add by 
/*
* easyui.validatebox 扩展
* version: 1.0
* removeInvalid: 将"class=validatebox-invalid"的样式去掉和将class="validatebox-tip"的div层隐藏掉
* isAllValid： 验证selector下的元素，只要有1个未验证通过，则返回false，全部验证通过则返回true
* disableForm: 将页面元素置为disabled
* unDisableForm: 恢复被disableForm的页面元素
*/
(function($) {
	$.extend($.fn.validatebox.methods,{
		removeInvalid : function(o) {
			$.each($(o).find(".validatebox-invalid"),function(n,v){
				$(v).removeClass("validatebox-invalid");
			});
			$(".validatebox-tip").hide();
		},
		isAllValid : function(o){
			var _isValid = true;
			$.each($(o).find(".easyui-validatebox"),function(n,v){
				if(!$(v).validatebox("isValid")){
					_isValid = false;
					return false;
				}
			});
			return _isValid;
		}
	});
	
	//$.extend($.fn.panel.defaults,
	/*$.extend(false,$.fn.panel.defaults,{
		onBeforeClose:function(o){
			$("#channelId").val("后");//easyui的2097行
			//$(this).validatebox("removeInvalid");
		}
	})*/
	//);
	//begin 
	$.fn.extend({
		disableForm:function(){
			alert("disableForm正在开发中~");
			//var filter = /\s*/;
			/*$.each(this,function(n,v){
				//alert($(v).attr("class").split(filter));
			})*/
		},
		undisableForm:function(){
			alert("unDisableForm正在开发中~");
		}
	});
	//end add by 
	
})(jQuery);
//end add by 
