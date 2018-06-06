package com.best1.report.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import jxl.Sheet;
import jxl.Workbook;
import org.apache.struts2.ServletActionContext;
import com.best1.base.BaseAction;
import com.best1.base.DataModel;
import com.best1.base.common.CommonDefine;
import com.best1.domain.UserInfo;
import com.best1.report.common.ReportCommonDefine;
import com.best1.report.domain.FilePathCof;
import com.best1.report.service.DetailStatService;

public class DetailStatAction extends BaseAction {
	private DetailStatService detailStatService;
	private File file;
	private String fileFileName;
	
	private File fileCreatebyid;
	private String fileCreatebyidFileName;
	
	private File fileHandlebyid;
	private String fileHandlebyidFileName;
	
	private String excludereturnflag;
	
	
	public String getExcludereturnflag() {
		return excludereturnflag;
	}

	public void setExcludereturnflag(String excludereturnflag) {
		this.excludereturnflag = excludereturnflag;
	}
	//销退主因查客诉明细
	public String returnResonStatList() throws Exception {
		DataModel resData = detailStatService.getReturnResonStatByPage(paramMap);
		//判断是否是excel导出
		if(paramMap.get("export")!=null &&"excel".equals(paramMap.get("export"))){
			dealGarbled();//处理paramMap的乱码问题
			commonOutExcel(resData);
		}else{
			commonOutPrint(resData);
		}
		return null;
	}
	
	//销退主因查客诉明细导出
	public String exportReturnResonStat() throws Exception {
		dealGarbled();//处理paramMap的乱码问题
		DataModel resData = new DataModel();
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		UserInfo user = (UserInfo)session.getAttribute("user");
		paramMap.put("userid", user.getUserid());
		if("0".equals(paramMap.get("exportAction"))){//查询导出的数据量
			resData = detailStatService.getReturnResonStatRecords(paramMap);
			if(Integer.parseInt(resData.getValue()) > CommonDefine.EXCEL_MAX_NUM){
				resData.setErrCode("1");
				resData.setErrMsg("导出数据量不能大于:"+CommonDefine.EXCEL_MAX_NUM+"条");
				commonOutPrint(resData);
				return null;
			}
			commonOutPrint(resData);
		}else{
			resData = detailStatService.getReturnResonStats(paramMap);
			commonOutExcel(resData);
		}
		return null;
	}
	
	//后抛客诉明细
	public String complaintStatList() throws Exception {
		DataModel resData = detailStatService.getComplaintStatByPage(paramMap);
		//判断是否是excel导出
		if(paramMap.get("export")!=null &&"excel".equals(paramMap.get("export"))){
			dealGarbled();//处理paramMap的乱码问题
			commonOutExcel(resData);
		}else{
			commonOutPrint(resData);
		}
		return null;
	}
	
	//后抛客诉明细导出
	public String exportComplaintStat() throws Exception {
		dealGarbled();//处理paramMap的乱码问题
		DataModel resData = new DataModel();
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		UserInfo user = (UserInfo)session.getAttribute("user");
		paramMap.put("userid", user.getUserid());
		if("0".equals(paramMap.get("exportAction"))){//查询导出的数据量
			resData = detailStatService.getComplaintStatRecords(paramMap);
			if(Integer.parseInt(resData.getValue()) > CommonDefine.EXCEL_MAX_NUM){
				resData.setErrCode("1");
				resData.setErrMsg("导出数据量不能大于:"+CommonDefine.EXCEL_MAX_NUM+"条");
				commonOutPrint(resData);
				return null;
			}
			commonOutPrint(resData);
		}else{
			resData = detailStatService.getComplaintStats(paramMap);
			commonOutExcel(resData);
		}
		return null;
	}

	public String customerInfoAllOutList() throws Exception {
		DataModel resData = detailStatService.getCustomerInfoAllOutByPage(paramMap);
		commonOutPrint(resData);
		return null;
	}
	//客户明细导出
	public String exportCustomerInfoAllOut() throws Exception {
		dealGarbled();//处理paramMap的乱码问题
		DataModel resData = new DataModel();
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		UserInfo user = (UserInfo)session.getAttribute("user");
		paramMap.put("userid", user.getUserid());
		paramMap.put("auditBusiCode", ReportCommonDefine.CUSTOMER_DETAILSTAT_EXPORT_CODE);
		if("0".equals(paramMap.get("exportAction"))){//查询导出的数据量
			resData = detailStatService.getCustomerInfoAllOutRecords(paramMap);
			if(Integer.parseInt(resData.getValue()) > CommonDefine.EXCEL_MAX_NUM){
				resData.setErrCode("1");
				resData.setErrMsg("导出数据量不能大于:"+CommonDefine.EXCEL_MAX_NUM+"条");
				commonOutPrint(resData);
				return null;
			}
			if(paramMap.get("sensitiveData") != null && !"".equals(paramMap.get("sensitiveData"))){
				HashMap map = detailStatService.addExportAudit(paramMap);
				resData = (DataModel)map.get("resData");
				if("1".equals(resData.getErrCode())){
					commonOutPrint(resData);
					return null;
				}
				resData = detailStatService.getCustomerInfoAllOuts(paramMap);
				resData = commonOutExcelToServer(resData,(FilePathCof)map.get("filePathCof"),map.get("fileName").toString());
				commonOutPrint(resData);
			}else{
				commonOutPrint(resData);
			}
		}else{
			resData = detailStatService.getCustomerInfoAllOuts(paramMap);
			//commonOutExcel(resData);//导出到本机
			commonOutExcel(resData);
		}
		return null;
	}
	
	public String orderDetailAllOutList() throws Exception {
		DataModel resData = detailStatService.getOrderDetailAllOutByPage(paramMap);
		commonOutPrint(resData);
		return null;
	}
	
	//订单明细导出
	public String exportOrderDetailAllOut() throws Exception {
		dealGarbled();//处理paramMap的乱码问题
		DataModel resData = new DataModel();
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		UserInfo user = (UserInfo)session.getAttribute("user");
		paramMap.put("userid", user.getUserid());
		paramMap.put("auditBusiCode", ReportCommonDefine.ORDER_DETAILSTAT_EXPORT_CODE);
		if("0".equals(paramMap.get("exportAction"))){//查询导出的数据量
			resData = detailStatService.getOrderDetailAllOutRecords(paramMap);
			if(Integer.parseInt(resData.getValue()) > CommonDefine.EXCEL_MAX_NUM){
				resData.setErrCode("1");
				resData.setErrMsg("导出数据量不能大于:"+CommonDefine.EXCEL_MAX_NUM+"条");
				commonOutPrint(resData);
				return null;
			}
			if(paramMap.get("sensitiveData") != null && !"".equals(paramMap.get("sensitiveData"))){
				HashMap map = detailStatService.addExportAudit(paramMap);
				resData = (DataModel)map.get("resData");
				if("1".equals(resData.getErrCode())){
					commonOutPrint(resData);
					return null;
				}
				resData = detailStatService.getOrderDetailAllOuts(paramMap);
				resData = commonOutExcelToServer(resData,(FilePathCof)map.get("filePathCof"),map.get("fileName").toString());
				commonOutPrint(resData);
			}else{
				commonOutPrint(resData);
			}
		}else{
			resData = detailStatService.getOrderDetailAllOuts(paramMap);
			commonOutExcel(resData);//导出到本机
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
		String path = ServletActionContext.getRequest().getRealPath(ReportCommonDefine.DETAILSTAT_FILEPATH);
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
		String path = ServletActionContext.getRequest().getRealPath(ReportCommonDefine.DETAILSTAT_FILEPATH);
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
	
	/**
	 * 订单处理人工号excel上传
	 * @return
	 * @throws Exception
	 */
	public String uploadHandleUserId() throws Exception {
		DataModel resData = new DataModel();
		String path = ServletActionContext.getRequest().getRealPath(ReportCommonDefine.DETAILSTAT_FILEPATH);
		try {
			File f = this.getFileHandlebyid();
			if(!this.getFileHandlebyidFileName().toLowerCase().endsWith(".xls")){
				resData.setErrCode("1");
				resData.setErrMsg("请选择2003版excel文件进行上传！");
				commonOutPrintForFileUpload(resData);
				return null;
			}
			FileInputStream inputStream = new FileInputStream(f);
			UserInfo user = (UserInfo) getSession().getAttribute("user");
			String fileName = paramMap.get("prefix").toString()+user.getUserid()+this.getFileHandlebyidFileName().substring(this.getFileHandlebyidFileName().lastIndexOf("."),this.getFileHandlebyidFileName().length());
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
			resData.setValue(subFileName(this.getFileHandlebyidFileName())+","+fileName);
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

	public DetailStatService getDetailStatService() {
		return detailStatService;
	}

	public void setDetailStatService(DetailStatService detailStatService) {
		this.detailStatService = detailStatService;
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

	public File getFileHandlebyid() {
		return fileHandlebyid;
	}

	public void setFileHandlebyid(File fileHandlebyid) {
		this.fileHandlebyid = fileHandlebyid;
	}

	public String getFileHandlebyidFileName() {
		return fileHandlebyidFileName;
	}

	public void setFileHandlebyidFileName(String fileHandlebyidFileName) {
		this.fileHandlebyidFileName = fileHandlebyidFileName;
	}
}