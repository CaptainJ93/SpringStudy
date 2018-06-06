$(document).ready(function(){ 

//高度自适应
		var a=document.documentElement.clientHeight-62;
		var b=a-28;
		var c=a-3;
		$(".left").css("height",a+"px");
		$(".split").css("height",a+"px");
		$(".main").css("height",a+"px");
		$(".iframe").css("height",b+"px");
		$(".orderLeftIframe").css("height",c+"px");
		$(".OrderRightiframe").css("height",c+"px");
//表格隔行换色						   
  $(".trcolor tr").mouseover(function(){$(this).addClass("over")}).mouseout(function(){$(this).removeClass("over")});
  $(".trcolor tr:even").addClass("splitColor");
  
//高级查找层的控制
  $(".searchTop h2").click(function(){
		 $(".searchList").slideToggle(500);
		 var hClass=$(".searchTop h2.showH").attr("class");
		 if(hClass=="showH"){
			   $(".searchTop h2").removeClass("showH").addClass("hiddenH");
			 }else if(typeof(hClass)=="undefined"){
				 $(".searchTop h2").removeClass("hiddenH").addClass("showH")
			}
  })
  
//编辑层的控制
  $(".editTop h2").click(function(){
		 $(".editList").slideToggle(500);
		 var hClass=$(".editTop h2.showH").attr("class");
		 if(hClass=="showH"){
			   $(".editTop h2").removeClass("showH").addClass("hiddenH");
			 }else if(typeof(hClass)=="undefined"){
				 $(".editTop h2").removeClass("hiddenH").addClass("showH")
			}
  })
  
//新增层的控制
  $(".addTop h2").click(function(){
		 $(".addList").slideToggle(500);
		 var hClass=$(".addTop h2.showH").attr("class");
		 if(hClass=="showH"){
			   $(".addTop h2").removeClass("showH").addClass("hiddenH");
			 }else if(typeof(hClass)=="undefined"){
				 $(".addTop h2").removeClass("hiddenH").addClass("showH")
			}
  })  
  
//菜单TAB页
   $(".head .meau li").each(function(n){
	    $(this).click(function(){
		 var liover=$(this);
		 $(".head .sildeCon ul.block").removeClass("block");
		 $(".head .sildeCon ul").eq(n).addClass("block");
		 $(".head .meau li.sed").removeClass("sed");
		 $(liover).addClass("sed");
		})
	})

//左边菜单栏控制
  $(".hidden").click(function(){
		 $(".left").css("display","none");
		 $(".main").css("margin-left","9px");
		 $(".hidden").css("display","none");
		 $(".show").css("display","inline");
  })
  $(".show").click(function(){
		 $(".left").css("display","block");
		 $(".main").css("margin-left","189px");
		 $(".hidden").css("display","inline");
		 $(".show").css("display","none");
  })
  
//滑出层
  $(".testPopDiv").click(function(){
		$(".popDiv").css("display","block"); 
  })
  $(".trcolor th").click(function(){
		$(".popDiv").css("display","none"); 
  })
  
//页脚TAB页
   $(".foot li a").each(function(n){
	    $(this).click(function(){
		 var liover=$(this);
		 $(".mainBlock").removeClass("mainBlock");
		 $(".mainSilde").eq(n).addClass("mainBlock");
		 $(".foot li a.sed").removeClass("sed");
		 $(liover).addClass("sed");
		})
	})

//详细页面编辑 
    $(".mainTable .mainTableTop .func .edit").click(function(){
		$(".mainTable .mainTableTop .func .save").css("display","block"); 
		$(".basicList .listNormal").css("display","none")
		$(".basicList .listEdit").css("display","block")
  })
    $(".mainTable .mainTableTop .func .save").click(function(){
		$(".mainTable .mainTableTop .func .save").css("display","none"); 
		$(".basicList .listNormal").css("display","block")
		$(".basicList .listEdit").css("display","none")
  })
	
//详细页面TAB页
   $(".detailsildeTop li a").each(function(n){
	    $(this).click(function(){
		 var liover=$(this);
		 $(".sildeDoor div.block").removeClass("block");
		 $(".sildeDoor div.sildeDoorDiv").eq(n).addClass("block");
		 $(".detailsildeTop li a").removeClass("sed");
		 $(liover).addClass("sed");
		})
	})
   
//选择销售品TAB页
   $(".leftSilde li").each(function(n){
	    $(this).click(function(){
		 var liover=$(this);
		 $(".saleLeft .leftSildeblock").removeClass("leftSildeblock");
		 $(".saleLeft .leftSildeDiv").eq(n).addClass("leftSildeblock");
		 $(".leftSilde li.sed").removeClass("sed");
		 $(liover).addClass("sed");
		})
	})
   
//销售品新购外TAB页
   $(".orderBuyNew .orderBuyNewLeft li").each(function(n){
	    $(this).click(function(){
		 var liover=$(this);
		 $(".orderBuyNewRight .orderBuyNewBlock").removeClass("orderBuyNewBlock");
		 $(".orderBuyNewRight .sildeDoorDiv").eq(n).addClass("orderBuyNewBlock");
		 $(".orderBuyNew .orderBuyNewLeft li.sed").removeClass("sed");
		 $(liover).addClass("sed");
		})
	})
   
//销售品新购内TAB页
   $(".orderBuyNewTop li").each(function(n){
	    $(this).click(function(){
		 var liover=$(this);
		 $(".orderBuyNewBottom .BottomBlock").removeClass("BottomBlock");
		 $(".orderBuyNewRight .BottomDiv").eq(n).addClass("BottomBlock");
		 $(".orderBuyNewTop li.sed").removeClass("sed");
		 $(liover).addClass("sed");
		})
	})
   
//规范页面TAB页
   $(".sildeDoor input").each(function(n){
									   
	    $(this).click(function(){
		 var liover=$(this);
		 $(".silde div.block").removeClass("block");
		 $(".silde div.sildeCon").eq(n).addClass("block");
		})
	})
	window.onresize=function(){
	  	var a=document.documentElement.clientHeight-62;
		var b=a-28;
		var c=a-3;
	  	$(".left").css("height",a+"px");
		$(".split").css("height",a+"px");
		$(".main").css("height",a+"px");
		$(".iframe").css("height",b+"px");
		$(".orderLeftIframe").css("height",c+"px");
		$(".OrderRightiframe").css("height",c+"px");
  	};

})