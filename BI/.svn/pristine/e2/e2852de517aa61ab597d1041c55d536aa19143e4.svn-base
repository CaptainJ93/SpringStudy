var setting = {
data: {
simpleData: {
enable: true
// idKey:"id",
// pIdKey:"pId",
}
}
,async: {
enable: true,
url:"./ZTreeSerlvet",
autoParam:["id", "name"],
otherParam:{"otherParam":"zTreeAsyncTest"},
// dataType: "text",//\u9ed8\u8ba4text
// type:"get",//\u9ed8\u8ba4post
dataFilter: filter //\u5f02\u6b65\u8fd4\u56de\u540e\u7ecf\u8fc7Filter
}
,callback:{
// beforeAsync: zTreeBeforeAsync, // \u5f02\u6b65\u52a0\u8f7d\u4e8b\u4ef6\u4e4b\u524d\u5f97\u5230\u76f8\u5e94\u4fe1\u606f
asyncSuccess: zTreeOnAsyncSuccess,//\u5f02\u6b65\u52a0\u8f7d\u6210\u529f\u7684fun
asyncError: zTreeOnAsyncError, //\u52a0\u8f7d\u9519\u8bef\u7684fun
beforeClick:beforeClick //\u6355\u83b7\u5355\u51fb\u8282\u70b9\u4e4b\u524d\u7684\u4e8b\u4ef6\u56de\u8c03\u51fd\u6570
}
};
//treeId\u662ftreeDemo
function filter(treeId, parentNode, childNodes) {
if (!childNodes) return null;
for (var i=0, l=childNodes.length; i<l; i++) {
childNodes[i].name = childNodes[i].name.replace('','');
}
return childNodes;
}
function beforeClick(treeId,treeNode){
alert($("#userid").val());
if(!treeNode.isParent){
return false;
}else{
return true;
}
}
function zTreeOnAsyncError(event, treeId, treeNode){
alert("\u5f02\u6b65\u52a0\u8f7d\u5931\u8d25!");
}
function zTreeOnAsyncSuccess(event, treeId, treeNode, msg){

}
/***********************\u5f53\u4f60\u70b9\u51fb\u7236\u8282\u70b9\u662f,\u4f1a\u5f02\u6b65\u8bbf\u95eeservlet,\u628aid\u4f20\u8fc7\u53bb*****************************/
var zNodes=[];
/* var zNodes =[
{ id:1, pId:0, name:"parentNode 1", open:true},
{ id:11, pId:1, name:"parentNode 11"},
{ id:111, pId:11, name:"leafNode 111"},
{ id:112, pId:11, name:"leafNode 112"},
{ id:113, pId:11, name:"leafNode 113"},
{ id:114, pId:11, name:"leafNode 114"},
{ id:12, pId:1, name:"parentNode 12"},
{ id:121, pId:12, name:"leafNode 121"},
{ id:122, pId:12, name:"leafNode 122"},
{ id:123, pId:12, name:"leafNode 123"},
{ id:13, pId:1, name:"parentNode 13", isParent:true},
{ id:2, pId:0, name:"parentNode 2", isParent:true}
]; */
$(document).ready(function(){
$.fn.zTree.init($("#treeDemo"), setting, zNodes);
}); 