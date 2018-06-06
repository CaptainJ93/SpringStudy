package com.best1.base;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.best1.base.DataModel;
import com.best1.domain.UserInfo;
import com.best1.report.common.ReportCommonDefine;
import com.best1.report.domain.ExportAudit;
import com.best1.report.domain.FilePathCof;
import com.opensymphony.xwork2.ActionSupport;


public class BaseAction extends ActionSupport implements
		ServletRequestAware, ServletResponseAware, SessionAware {
	private static final long serialVersionUID = -2548719911419951528L;
	
	public HttpServletResponse getResponse() {
		return ServletActionContext.getResponse();
	}
	public HttpServletRequest getRequest() {
		return ServletActionContext.getRequest();
	}
	public HttpSession getSession() {
		return getRequest().getSession();
	}
	// 参数传递容器
	protected HashMap<String, Object> paramMap = new HashMap<String, Object>();
	protected String oper = "";
	//日志对象
	protected transient Log log = null;
	/**构造DTO对象*/
	public BaseAction() {
		log = LogFactory.getLog(this.getClass());
	}
	
	public Log getLog() {
		return log;
	}
	
	
	protected static final String EDIT = "edit";
	protected static final String ADD = "add";

	/**
	 * 将DataModel类型数据输出
	 * @Title: commonOut
	 * @param resData
	 * @throws Exception
	 */
	public void commonOutPrint(DataModel resData) throws Exception {
		String result = resData.resultListToJson();
		getResponse().setCharacterEncoding("UTF-8");
		PrintWriter out = getResponse().getWriter();
		out.print(result);
	}
	
	/**
	 * 文件上传response的返回类型需要设置为【text/html】
	 */
	
	public void commonOutPrintForFileUpload(DataModel resData) throws Exception {
		String result = resData.resultListToJson();
		getResponse().setCharacterEncoding("UTF-8");
		getResponse().setContentType("text/html;charset=UTF-8");
		PrintWriter out = getResponse().getWriter();
		out.print(result);
	}
	
	/**
	 * 将字符串输出
	 * @param resStr
	 * @throws Exception
	 */
	public void commonOutPrint(String resStr) throws Exception {
		getResponse().setCharacterEncoding("UTF-8");
		PrintWriter out = getResponse().getWriter();
		out.print(resStr);
	}
	
	/**
	 * 查询结果导出excel
	 * @Title: resDataToExcel
	 * @Description: TODO
	 * @param
	 * @param resData
	 * @param
	 * @return
	 * @return String
	 * @throws
	 */
	public String commonOutExcel(DataModel resData) {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		UserInfo user = (UserInfo)session.getAttribute("user");
		SimpleDateFormat time=new SimpleDateFormat("yyyyMMddHHmmss"); 
		Date nowTime=new Date(); 
		String fileName = time.format(nowTime)+"-"+user.getUserloginid()+".xls";
		try {
			HttpServletResponse res = getResponse();
			res.setContentType( "application/vnd.ms-excel " );
			res.setHeader( "Content-Disposition","attachment;filename=\""+fileName+"\" ");
			res.setDateHeader("Expires", 0);
			
			ServletOutputStream   os = res.getOutputStream();
			String colNamesStr = (String)paramMap.get("colLabels");
//			colNamesStr = new String(colNamesStr.getBytes("ISO-8859-1"),"UTF-8");//统一在service层控制
			String colModelStr = (String)paramMap.get("colnames");
			resData.resultListToExcel(colNamesStr, colModelStr, os);
			os.close();
			res.flushBuffer();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";//resData.excelExport(colNamesStr, colModelStr, path);
	}
	
	public String commonDownloadExcel(ExportAudit obj) {
		try {
			HttpServletResponse res = getResponse();
			HttpServletRequest request = getRequest();
			String fileName = obj.getExportFileName();
			String path = "";
			if(ReportCommonDefine.FILEPATH_TYPE_10.equals(obj.getFilepathType())){//文件在工程内
				path = request.getSession().getServletContext().getRealPath("/") + obj.getExportPath().replaceAll("\\\\", "/");;
			}else if(ReportCommonDefine.FILEPATH_TYPE_11.equals(obj.getFilepathType())){//文件在工程外（同一服务器）
				path = obj.getExportPath().replaceAll("\\\\", "/");
			}
			File file = new File(path+"/"+fileName);
			res.setContentType("application/x-msdownload");
			res.setContentLength((int)file.length());
			res.setHeader( "Content-Disposition","attachment;filename=\""+fileName+"\" ");
			FileInputStream fis = new FileInputStream(file);
			BufferedInputStream buff = new BufferedInputStream(fis);
			byte[] b = new byte[1024];
			long k = 0;
			ServletOutputStream   os = res.getOutputStream();
			while(k<file.length()){
				int j = buff.read(b,0,1024);
				k += j;
				os.write(b,0,j);
			}
			os.flush();
			os.close();
			res.flushBuffer();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}
	
	/**
	 * 查询结果导出excel,并合并列单元格
	 * @Title: resDataToExcel
	 * @Description: TODO
	 * @param
	 * @param resData
	 * @param
	 * @return
	 * @return String
	 * @throws
	 */
	public String commonOutExcelMergeColumns(DataModel resData) {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		UserInfo user = (UserInfo)session.getAttribute("user");
		SimpleDateFormat time=new SimpleDateFormat("yyyyMMddHHmmss"); 
		Date nowTime=new Date(); 
		String fileName = time.format(nowTime)+"-"+user.getUserloginid()+".xls";
		try {
			HttpServletResponse res = getResponse();
			res.setContentType( "application/vnd.ms-excel " );
			res.setHeader( "Content-Disposition","attachment;filename=\""+fileName+"\" ");
			res.setDateHeader("Expires", 0);
			
			ServletOutputStream   os = res.getOutputStream();
			String colNamesStr = (String)paramMap.get("colLabels");
			String colModelStr = (String)paramMap.get("colnames");
			String mergeColStr = (String)paramMap.get("mergeColStr");
			String imageNameStr = (String)paramMap.get("imageName");//图片生成
			resData.resultListToExcelMergeColumns(colNamesStr, colModelStr, mergeColStr,imageNameStr,os);
			os.close();
			res.flushBuffer();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
	
	/**
	 * 涉及到敏感字段导出需先将文件导出到服务器端，查询结果导出excel到服务器目录下
	 * @Title: resDataToExcel
	 * @Description: TODO
	 * @param
	 * @param resData
	 * @param
	 * @return
	 * @return String
	 * @throws
	 */
//	public DataModel commonOutExcelToServer(DataModel resData,String path) {
//		HttpServletRequest request = ServletActionContext.getRequest();
//		HttpSession session = request.getSession();
//		UserInfo user = (UserInfo)session.getAttribute("user");
//		SimpleDateFormat time=new SimpleDateFormat("yyyyMMddHHmmss"); 
//		Date nowTime=new Date(); 
//		path = request.getSession().getServletContext().getRealPath("/") + path;
//		String fileName = time.format(nowTime)+"-"+user.getUserloginid()+".xls";
//		
//		try {
//			File file = new File(path+fileName);
//			file.createNewFile();
//			String colNamesStr = (String)paramMap.get("colLabels");
//			colNamesStr = new String(colNamesStr.getBytes("ISO-8859-1"),"UTF-8");
//			String colModelStr = (String)paramMap.get("colnames");
//			resData.resultListToExcelToServer(colNamesStr, colModelStr, file);
//			resData.setValue(fileName);//记录文件名
//			resData.setErrCode("99");
//			resData.setErrMsg("文件名："+fileName+"已生成，由于内容涉及敏感数据，请等待审批！");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return resData;
//	}
	
	public DataModel commonOutExcelToServer(DataModel resData,FilePathCof filePathCof,String fileName) {
		HttpServletRequest request = ServletActionContext.getRequest();
		String path = "";
		if(ReportCommonDefine.FILEPATH_TYPE_10.equals(filePathCof.getFilepathType())){//文件保存在工程内
			path = request.getSession().getServletContext().getRealPath("/") + filePathCof.getFilepath().replaceAll("\\\\", "/");;
		}else if(ReportCommonDefine.FILEPATH_TYPE_11.equals(filePathCof.getFilepathType())){//文件保存工程外（同一服务器）
			path = filePathCof.getFilepath().replaceAll("\\\\", "/");
		}
		try {
			File file = new File(path+"/"+fileName);
			file.createNewFile();
			String colNamesStr = (String)paramMap.get("colLabels");
//			colNamesStr = new String(colNamesStr.getBytes("ISO-8859-1"),"UTF-8");//统一在service层控制
			String colModelStr = (String)paramMap.get("colnames");
			resData.resultListToExcelToServer(colNamesStr, colModelStr, file);
			resData.setErrCode("99");
			resData.setErrMsg("文件名："+fileName+"已生成，由于内容涉及敏感数据，请等待审批！");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resData;
	}
	
	/**
	 * 循环paramMap，解决乱码问题
	 * @throws Exception 
	 */
	
	public void dealGarbled() throws Exception{
		Iterator<String> keySetIterator = paramMap.keySet().iterator();
		while (keySetIterator.hasNext()) {
			String key = keySetIterator.next();
			if(paramMap.get(key) != null && paramMap.get(key) instanceof String){
				paramMap.put(key, new String(paramMap.get(key).toString().getBytes("ISO8859-1"),"UTF-8"));
			}
		}

	}

	public HashMap<String, Object> getParamMap() {
		return paramMap;
	}

	public void setParamMap(HashMap<String, Object> paramMap) {
		this.paramMap = paramMap;
	}
	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		
	}
	public void setServletResponse(HttpServletResponse arg0) {
		// TODO Auto-generated method stub
		
	}
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public String getOper() {
		return oper;
	}
	public void setOper(String oper) {
		this.oper = oper;
	}

}