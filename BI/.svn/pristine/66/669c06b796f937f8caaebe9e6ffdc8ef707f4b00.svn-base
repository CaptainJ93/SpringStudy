$(document).ready(function() {
	var priData = JSON.parse($("#priData").val());
	if (priData && priData.rows && priData.rows.length) {
		for (var i = 0; i < priData.rows.length; i++) {
			if(priData.rows[i].formId==undefined || priData.rows[i].formId==""){
				$.each($("input,select,textarea"), function(k, v) {
					if ($(v).attr("id") == priData.rows[i].itemName) {
						var oper = priData.rows[i].operateValue;
	
						if (oper == 2 || oper == "2") {// 只读
							if ($(this).attr("tagName") == "SELECT") {
								$(this).attr("disabled", "disabled");
							} else {
								$(this).attr("readonly", "readonly");
							}
						} else if (oper == 1 || oper == "1") {// 不可见
							$(this).css("display", "none");
						}
					}
				});
			}else{
				$.each($("input,select,textarea", $("#" + priData.rows[i].formId)), function(k, v) {
					if ($(v).attr("id") == priData.rows[i].itemName) {
						var oper = priData.rows[i].operateValue;
	
						if (oper == 2 || oper == "2") {// 只读
							if ($(this).attr("tagName") == "SELECT") {
								$(this).attr("disabled", "disabled");
							} else {
								$(this).attr("readonly", "readonly");
							}
						} else if (oper == 1 || oper == "1") {// 不可见
							$(this).css("display", "none");
						}
					}
				});
			}
			
		}
	}
});