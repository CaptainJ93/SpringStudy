/**
 * These functions are used to replace the 'alert' function in Javascript.<br>
 * to provide better appearance and more convenient manipulability.
 * these effects work with jQuery blockUI plugin.
 * 
 * any report of bug will be appreciated.
 * 
 * @author DongMin
 *
 */

function ALERT(msg){
	msg="<div style='margin:6px' align='left'>"+msg+"</div>";
	
	if(parent!=this&&parent.ALERT){
		parent.ALERT(msg);
		return;
	} 
	$.blockUI.defaults.fadeOut = 100; 
	$.blockUI({ message: msg, css: {cursor: 'text' }, overlayCSS: {cursor: 'pointer' },fadeIn:  100, fadeOut:  100   }); 
	$('.blockOverlay').attr('title','点击关闭提示').click($.unblockUI); 

}

/**
 * 在页面右上角提示信息
 * @param {} msg 提示消息内容
 * @param {} timeout 提示显示时长，单位是毫秒
 * @param {} onUnblockCallBack 回调函数，在解锁页面时调用
 */
function Hint(msg, timeout, onUnblockCallBack){      
	
	if(parent!=this&&parent.HINT){
		parent.Hint(msg, timeout, onUnblockCallBack);
		return;
	}
	
	$.blockUI({ 
           message: msg, 
           fadeIn: 700, 
           fadeOut: 700, 
           timeout: timeout, 
           showOverlay: false, 
           centerY: false, 
           onUnblock: onUnblockCallBack,
           css: { 
               width: '350px', 
               cursor: 'pointer',
               top: '10px', 
               left: '', 
               right: '10px', 
               border: 'none', 
               padding: '5px', 
               backgroundColor: '#003366', 
               '-webkit-border-radius': '10px', 
               '-moz-border-radius': '10px', 
               opacity: .6, 
               color: '#fff' 
           }
       }); 
}

function HINT(msg){      

	if(parent!=this&&parent.HINT){
		parent.HINT(msg);
		return;
	}
	
	$.blockUI({ 
           message: msg, 
           fadeIn: 700, 
           fadeOut: 700, 
           timeout: 5000, 
           showOverlay: false, 
           centerY: false, 
           css: { 
               width: '350px', 
               cursor: 'pointer',
               top: '10px', 
               left: '', 
               right: '10px', 
               border: 'none', 
               padding: '5px', 
               backgroundColor: '#003366', 
               '-webkit-border-radius': '10px', 
               '-moz-border-radius': '10px', 
               opacity: .6, 
               color: '#fff' 
           }
       }); 
}
