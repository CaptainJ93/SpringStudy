package com.best1.util;

/**
 * 文件工具类
 */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import jxl.Cell;
import jxl.CellType;
import jxl.DateCell;
import jxl.Sheet;
import jxl.Workbook;

public class FileUtil {
	private static final int BUFFER_SIZE =1024;
	
	/**
	 * 文件拷贝
	 * @param src 源文件
	 * @param target 目标文件
	 * @return 成功返回true，出错返回false
	 */
	public static boolean copy(File src, File target) {
		try {
			InputStream in = null;
			OutputStream out = null;
			try {
				in = new BufferedInputStream(new FileInputStream(src),
						BUFFER_SIZE );
				out = new BufferedOutputStream(new FileOutputStream(target),
						BUFFER_SIZE);
				byte[] buffer = new byte[BUFFER_SIZE];
				while (in.read(buffer) > 0) {
					out.write(buffer);
				}
			} finally {
				if (null != in) {
					in.close();
				}
				if (null != out) {
					out.close();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	/**
	 * 文件拷贝
	 * @param src 源文件
	 * @param toPath 目标目录
	 * @return 返回保存后的物理地址
	 * @throws Exception 
	 */
	public static String copy(File src,String toPath) throws Exception{
		if(src == null){
			return null;
		}
		String temp = getNewName()+getExtention(src.getName());
		File f = new File(toPath);
		if(!f.exists())
			f.mkdir();
		File target = new File(toPath+File.separator+temp);
		try {
			InputStream in = null;
			OutputStream out = null;
			try {
				if(!target.exists()){
					target.createNewFile();
				}
				in = new BufferedInputStream(new FileInputStream(src),
						BUFFER_SIZE );
				out = new BufferedOutputStream(new FileOutputStream(target),
						BUFFER_SIZE);
				byte[] buffer = new byte[BUFFER_SIZE];
				while (in.read(buffer) > 0) {
					out.write(buffer);
				}
			} finally {
				if (null != in) {
					in.close();
				}
				if (null != out) {
					out.close();
				}
			}
		} catch (Exception e) {
			throw e;
		}
		return temp;
	}
	/**
	 * 获得后缀名
	 * @param fileName 文件名
	 * @return 返回该文件的后缀名
	 */
	public static String getExtention(String fileName) {
		int pos = fileName.lastIndexOf(".");
		return fileName.substring(pos);
	}

	/**
	 * 把文件转化为List，每个元素对应一个行，元素是一个Map，key是列名，value是值
	 */
	public static List<Map<String, Object>> getMapFromFile(File file)
			throws Exception {
		Workbook wb = null;
		wb = Workbook.getWorkbook(file);
		Sheet rs = wb.getSheet(0);
		int rsColumns = rs.getColumns();
		int rsRows = rs.getRows();
		if (rsRows < 1) {
			return null;
		}
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		List<String> key = new ArrayList<String>();
		for (int j = 0; j < rsColumns; j++) {
			Cell cell = rs.getCell(j, 0);
			key.add(cell.getContents());
		}
		for (int i = 1; i < rsRows; i++) {
			Map<String, Object> bean = new HashMap<String, Object>();
			boolean flag = false;
			for (int j = 0; j < rsColumns; j++) {
				Cell cell = rs.getCell(j, i);
				String temp = cell.getContents();
				if(cell.getType()==CellType.DATE){
					DateCell dc = (DateCell)cell;
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
					temp = ""+sdf.format(dc.getDate());
				}
				if(temp!=null && !"".equals(temp.trim())){
					flag = true;
					bean.put(key.get(j), temp);
				}
			}
			if(flag){
				list.add(bean);
			}
		}
		return list;
	}

	/**
	 * 判断两个文件名是否相同，不考虑后缀名和大小写，如A123.jpg和a123.jpeg 将返回true
	 * @param fileName1
	 * @param fileName2
	 * @return 相同且符合文件名(即包含扩展名)，则返回true
	 */
	public static boolean isEquals(String fileName1,String fileName2){
		if(fileName1!=null && fileName2 !=null && fileName1.indexOf(".")!=-1 && fileName2.indexOf(".")!=-1)
			return fileName1.substring(0,fileName1.indexOf(".")).toUpperCase().equals(fileName2.substring(0,fileName2.indexOf(".")).toUpperCase());
		else
			return false;
	}
	/**
	 * 获取随机文件名
	 * @return
	 */
	public static synchronized String getNewName(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmss");
		String temp = String.valueOf(new Date().getTime());
		String nowTime = sdf.format(new Date());
		try {
			Thread.sleep(12l);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return nowTime+temp.substring(temp.length()-3);
	}

	/**
	 * 删除文件,支持以逗号分隔的批量删除
	 * @param delFiles
	 * @param delFiles 
	 */
	public static void delFiles(String dir, String delFiles) {
		if(delFiles== null) return ;
		String[] filePath = delFiles.split(",");
		for (String string : filePath) {
			File file = new File(dir+File.separator+string);
			if(file.exists()){
				file.delete();
			}
		}
	}
	 /**
	   * 拷贝上传文件
	   * @param src
	   * @param dst
	   * @throws IOException
	   */
	    public static void uploadFile(File src, File dst) throws IOException {   
	  
	        InputStream in = null;   
	        OutputStream out = null;   
	        try {   
	            in = new BufferedInputStream(new FileInputStream(src), BUFFER_SIZE);   
	            out = new BufferedOutputStream(new FileOutputStream(dst),   
	                    BUFFER_SIZE);   
	            byte[] buffer = new byte[BUFFER_SIZE];   
	            while (in.read(buffer) > 0) {   
	                out.write(buffer);   
	            }   
	        } finally {   
	            if (null != in) {   
	                in.close();   
	            }   
	            if (null != out) {   
	                out.close();   
	            }   
	        }   
	  
	    }   
	    public static void makeDir(String directory) {   
	        File dir = new File(directory);   
	  
	        if (!dir.isDirectory()) {   
	            dir.mkdirs();   
	        }   
	  
	    }   
	  /**
	   * 对上传文件重命名
	   * @param fileName
	   * @return
	   * @throws UnsupportedEncodingException
	   */
	    public static String generateFileName(String fileName)   
	            throws UnsupportedEncodingException {   
	        DateFormat format = new SimpleDateFormat("yyMMddHHmmss");   
	        String formatDate = format.format(new Date());   
	        String extension = fileName.substring(fileName.lastIndexOf("."));   
	        fileName = new String(fileName.getBytes("iso8859-1"), "gb2312");   
	        return fileName + formatDate + new Random().nextInt(10000)   
	                + extension;   
	    }   

	    /**
	     * 删除文件
	     * @param dir
	     */
	    public static void delFile(String dir){
	    	if(dir==null) return;
	    	File file=new File(dir);
	    	if(file.exists()){
	    		file.delete();
	    	}
	    }
	    
	    /**
	     * 按行读取文件内容
	     * @param fileName
	     * @return
	     */
	    public static String readFileByLines(String fileName) throws IOException {
			StringBuffer sb = new StringBuffer();
			InputStream is = null; 
			BufferedReader reader = null;
			try {
				is = new BufferedInputStream(new FileInputStream(fileName),BUFFER_SIZE );
				InputStreamReader isr = new InputStreamReader(is,"utf-8");
				reader = new BufferedReader(isr);
				String line = null;
				while ((line = reader.readLine()) != null) {
					sb.append(line+"\n");
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (reader != null) {
					try {
						reader.close();
					} catch (IOException e1) {
					}
				}
			}
			return sb.toString();
		}
	    
	    /**
	     * 写入文件内容
	     * @param target
	     * @param content
	     * @throws IOException 
	     */
	    public static void writeFileContent(String target,String content) throws IOException {
	    	OutputStreamWriter osw = null;
	    	BufferedWriter bw = null;
	    	try {
	    		File f = new File(target); 
	    		osw = new OutputStreamWriter(new FileOutputStream(f),"UTF-8"); 
		    	bw=new BufferedWriter(osw);
		    	bw.write(content); 
		    	bw.close();
		    	osw.close();
	    	}catch (Exception e) { 
	    	   e.printStackTrace(); 
	    	} finally {
	    		try{
	    			bw.close();
			    	osw.close();
	    		}catch(IOException e){}
	    	}
		}
}