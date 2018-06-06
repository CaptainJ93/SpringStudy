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
	$('.blockOverlay').attr('title','����ر���ʾ').click($.unblockUI); 

}

/**
 * ��ҳ�����Ͻ���ʾ��Ϣ
 * @param {} msg ��ʾ��Ϣ����
 * @param {} timeout ��ʾ��ʾʱ������λ�Ǻ���
 * @param {} onUnblockCallBack �ص��������ڽ���ҳ��ʱ����
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
