package com.best1.report.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.regex.Pattern;
import jxl.Sheet;
import jxl.Workbook;
import org.apache.struts2.ServletActionContext;
import com.best1.base.BaseAction;
import com.best1.base.DataModel;
import com.best1.domain.UserInfo;
import com.best1.report.common.ReportCommonDefine;
import com.best1.report.service.ChannelStatService;

public class ChannelStatAction extends BaseAction {
	private ChannelStatService channelStatService;
	private File file;
	private String fileFileName;
	
	private File fileCreatebyid;
	private String fileCreatebyidFileName;
	
	private String excludereturnflag;
	
	
	public String getExcludereturnflag() {
		return excludereturnflag;
	}

	public void setExcludereturnflag(String excludereturnflag) {
		this.excludereturnflag = excludereturnflag;
	}

	public String channelAreaStatList() throws Exception {
		DataModel resData = channelStatService.getChannelAreaStatByPage(paramMap);
		//判断是否是excel导出
		if(paramMap.get("export")!=null &&"excel".equals(paramMap.get("export"))){
			dealGarbled();//处理paramMap的乱码问题
			commonOutExcel(resData);
		}else{
			commonOutPrint(resData);
		}
		return null;
	}
	
	public String channelOrderStatList() throws Exception {
		DataModel resData = channelStatService.getChannelOrderStatByPage(paramMap);
		//判断是否是excel导出
		if(paramMap.get("export")!=null &&"excel".equals(paramMap.get("export"))){
			dealGarbled();//处理paramMap的乱码问题
			commonOutExcel(resData);
		}else{
			commonOutPrint(resData);
		}
		return null;
	}
	
	public String spProgramStatList() throws Exception {
		DataModel resData = channelStatService.getSpProgramStatByPage(paramMap);
		//判断是否是excel导出
		if(paramMap.get("export")!=null &&"excel".equals(paramMap.get("export"))){
			dealGarbled();//处理paramMap的乱码问题
			commonOutExcel(resData);
		}else{
			commonOutPrint(resData);
		}
		return null;
	}
	
	public String pgMorderStatList() throws Exception {
		DataModel resData = channelStatService.getPgMorderStatByPage(paramMap);
		//判断是否是excel导出
		if(paramMap.get("export")!=null &&"excel".equals(paramMap.get("export"))){
			dealGarbled();//处理paramMap的乱码问题
			commonOutExcel(resData);
		}else{
			commonOutPrint(resData);
		}
		return null;
	}
	
	public String areaChannelStatList() throws Exception {
		DataModel resData = channelStatService.getAreaChannelStatByPage(paramMap);
		//判断是否是excel导出
		if(paramMap.get("export")!=null &&"excel".equals(paramMap.get("export"))){
			dealGarbled();//处理paramMap的乱码问题
			commonOutExcel(resData);
		}else{
			commonOutPrint(resData);
		}
		return null;
	}
	
	public String areaStatList() throws Exception {
		DataModel resData = channelStatService.getAreaStatByPage(paramMap);
		//判断是否是excel导出
		if(paramMap.get("export")!=null &&"excel".equals(paramMap.get("export"))){
			dealGarbled();//处理paramMap的乱码问题
			commonOutExcel(resData);
		}else{
			commonOutPrint(resData);
		}
		return null;
	}
	
	public String timeOrderStatList() throws Exception {
		DataModel resData = channelStatService.getTimeOrderStatByPage(paramMap);
		//判断是否是excel导出
		if(paramMap.get("export")!=null &&"excel".equals(paramMap.get("export"))){
			dealGarbled();//处理paramMap的乱码问题
			commonOutExcel(resData);
		}else{
			commonOutPrint(resData);
		}
		return null;
	}
	
	/**
	 * 商品品号excel上传
	 * @return
	 * @throws Exception
	 */
	public String upload() throws Exception {
		DataModel resData = new DataModel();
		String path = ServletActionContext.getRequest().getRealPath(ReportCommonDefine.CHANNELSTAT_FILEPATH);
		try {
			File f = this.getFile();
			if(!this.getFileFileName().toLowerCase().endsWith(".xls")){
				resData.setErrCode("1");
				resData.setErrMsg("请选择2003版excel文件进行上传！");
				commonOutPrintForFileUpload(resData);
				return null;
			}
			FileInputStream inputStream = new FileInputStream(f);
			UserInfo user = (UserInfo) getSession().getAttribute("user");
			String fileName = paramMap.get("prefix").toString()+user.getUserid()+this.getFileFileName().substring(this.getFileFileName().lastIndexOf("."),this.getFileFileName().length());
			FileOutputStream outputStream = new FileOutputStream(path + "/" + fileName);
			byte[] buf = new byte[1024];
			int length = 0;
			while ((length = inputStream.read(buf)) != -1) {
				outputStream.write(buf, 0, length);
			}
			inputStream.close();
			outputStream.close();
			//解析文件内容是否满足要求
			resData = checkFile(path + "/" + fileName);
			resData.setValue(subFileName(this.getFileFileName())+","+fileName);
		} catch (Exception e) {
			e.printStackTrace();
			resData.setErrCode("1");
			resData.setErrMsg("对不起,文件上传失败了!");
		}
		commonOutPrintForFileUpload(resData);
		return null;
	}
	
	/**
	 * 订单创建人工号excel上传
	 * @return
	 * @throws Exception
	 */
	public String uploadUserId() throws Exception {
		DataModel resData = new DataModel();
		String path = ServletActionContext.getRequest().getRealPath(ReportCommonDefine.CHANNELSTAT_FILEPATH);
		try {
			File f = this.getFileCreatebyid();
			if(!this.getFileCreatebyidFileName().toLowerCase().endsWith(".xls")){
				resData.setErrCode("1");
				resData.setErrMsg("请选择2003版excel文件进行上传！");
				commonOutPrintForFileUpload(resData);
				return null;
			}
			FileInputStream inputStream = new FileInputStream(f);
			UserInfo user = (UserInfo) getSession().getAttribute("user");
			String fileName = paramMap.get("prefix").toString()+user.getUserid()+this.getFileCreatebyidFileName().substring(this.getFileCreatebyidFileName().lastIndexOf("."),this.getFileCreatebyidFileName().length());
			FileOutputStream outputStream = new FileOutputStream(path + "/" + fileName);
			byte[] buf = new byte[1024];
			int length = 0;
			while ((length = inputStream.read(buf)) != -1) {
				outputStream.write(buf, 0, length);
			}
			inputStream.close();
			//outputStream.flush();
			outputStream.close();
			//解析文件内容是否满足要求
			resData = checkFile(path + "/" + fileName);
			resData.setValue(subFileName(this.getFileCreatebyidFileName())+","+fileName);
		} catch (Exception e) {
			e.printStackTrace();
			resData.setErrCode("1");
			resData.setErrMsg("对不起,文件上传失败了!");
		}
		commonOutPrintForFileUpload(resData);
		return null;
	}
	
	public DataModel checkFile(String path) throws Exception{
		DataModel resData = new DataModel();
		resData.setErrCode("0");
		int i = 0;
		int j = 0;
		Workbook book = Workbook.getWorkbook(new File(path));
		Sheet sheet = book.getSheet(0);
		int colcnt = sheet.getColumns();
		if(colcnt != 1){
			resData.setErrCode("1");
			resData.setErrMsg("文件内容列数不正确，请下载模板后重新选择！");
			return resData;
		}
		int rowcnt = sheet.getRows();
		if(rowcnt < 2){
			resData.setErrCode("1");
			resData.setErrMsg("文件行数不正确，请确认内容是否为空！");
			return resData;
		}
		for (i = 1; i < rowcnt; i++) {
			for (j = 0; j < colcnt; j++) {
				if(!isNumeric(sheet.getCell(j, i).getContents().trim())){
					resData.setErrCode("1");
					resData.setErrMsg("内容必须为数字形式，请检查后再重新选择！");
					break;
				}
			}
			if (j == colcnt)
				continue;
		}
		return resData;
	}
	
	public String subFileName(String filename){
		String suffix=filename.substring(filename.lastIndexOf("."),filename.length());
		String result = filename.substring(0,filename.lastIndexOf(".")-1);
		if(result.length() > 3){
			result = result.substring(0,3)+".."+suffix;
		}
		return result;
	}
	
	/**
	 * 验证字符串是否为数字
	 * @param str
	 * @return
	 */
	public static boolean isNumeric(String str){ 
	    Pattern pattern = Pattern.compile("[0-9]*"); 
	    return pattern.matcher(str).matches();    
	} 

	public ChannelStatService getChannelStatService() {
		return channelStatService;
	}

	public void setChannelStatService(ChannelStatService channelStatService) {
		this.channelStatService = channelStatService;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public File getFileCreatebyid() {
		return fileCreatebyid;
	}

	public void setFileCreatebyid(File fileCreatebyid) {
		this.fileCreatebyid = fileCreatebyid;
	}

	public String getFileFileName() {
		return fileFileName;
	}

	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}

	public String getFileCreatebyidFileName() {
		return fileCreatebyidFileName;
	}

	public void setFileCreatebyidFileName(String fileCreatebyidFileName) {
		this.fileCreatebyidFileName = fileCreatebyidFileName;
	}
	

}