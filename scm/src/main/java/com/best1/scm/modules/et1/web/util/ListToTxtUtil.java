package com.best1.scm.modules.et1.web.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.best1.scm.common.utils.SCMConstants;
import com.best1.scm.modules.delivery.entity.DeliveryOrderintransit;
import com.best1.scm.modules.delivery.entity.DeliveryOrderintransitDetail;
import com.best1.scm.modules.supplier.entity.ScmSupplierCsoinfo;
import com.best1.scm.modules.supplier.entity.ScmSupplierSrodetail;
import com.best1.scm.modules.supplier.entity.ScmSupplierSroheader;

/**
 * 把java  model对应转化为适合EDI标准格式的字符串并写入某个文件
 * @author zhangzujie
 *
 */
public class ListToTxtUtil {
	
	
	public static void StringToTxtFile(String Diretory,String str){
		
	}
	
	public  static void cpFiles(String Fromdirectory,String ToDirectory){
		
	}
	
	/**
	 * 把对应的对象集合写到某个文件，文件名以时间特殊标注
	 * @param list
	 * @return
	 * @throws IOException 
	 */
	public static boolean WriteListToFile(List<DeliveryOrderintransit> list) {
		DateFormat format = new SimpleDateFormat("yyyy_MM_dd-HH_mm_ss_S");
		String fileName = "statustemp/"+format.format(new Date())+"cso.tmp";
		/**
		File f = new File("statustemp");
		if(!f.exists())
			f.mkdir();
		**/
		File file = new File(fileName);
		if(!file.exists())
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
		//System.out.println("**********"+file.getName());
		FileOutputStream os;
		try {
			os = new FileOutputStream(file,false);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		//byte[] wubom = new byte[] { (byte)0xEF, (byte)0xBB, (byte)0xBF}; 
        //os.write(wubom); 
		try{
			for(DeliveryOrderintransit status:list){
				String Stringline = modelToStringLine(status);
				if("".equals(Stringline))
					continue;
				byte[] bytes = (Stringline+"\n").getBytes("UTF-8");
			    int j = 0;
			    if (bytes[0] == -17 && bytes[1] == -69 && bytes[2] == -65) {    //bom文件格式头字节
			    byte[] strs = new byte[bytes.length - 3];//去掉该内容的bom标示
				for (int i = 3; i < bytes.length; i++) {
					strs[j] = bytes[i];
					j++;
			      }
					os.write(strs);
			    }else{
			    	os.write(bytes);	
			    }
				
			}
			os.flush();
			os.close();
			file.renameTo(new File(fileName.substring(0, fileName.length()-4)));
		}catch(IOException e){
			e.printStackTrace();
			return false;
		}
		
		return true;
		
	}
	
	
	
	
	/**
	 * 把对应的对象集合写到某个文件，文件名以时间特殊标注
	 * @param list
	 * @return
	 * @throws IOException 
	 */
	public static boolean WriteListToFileForDirectCSO(List<ScmSupplierCsoinfo> list) {
		DateFormat format = new SimpleDateFormat("yyyy_MM_dd-HH_mm_ss_S");
		String fileName = "statustempfordirectcso/"+format.format(new Date())+"cso.tmp";
		File file = new File(fileName);
		if(!file.exists())
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
				return false;
			}
		FileOutputStream os;
		try {
			os = new FileOutputStream(file,false);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return false;
		}
		try{
			for(ScmSupplierCsoinfo status:list){
				String Stringline = modelToStringLineForDirectCSO(status);
				if("".equals(Stringline))
					continue;
				byte[] bytes = (Stringline+"\n").getBytes("UTF-8");
			    int j = 0;
			    if (bytes[0] == -17 && bytes[1] == -69 && bytes[2] == -65) {    //bom文件格式头字节
			    byte[] strs = new byte[bytes.length - 3];//去掉该内容的bom标示
				for (int i = 3; i < bytes.length; i++) {
					strs[j] = bytes[i];
					j++;
			      }
					os.write(strs);
			    }else{
			    	os.write(bytes);	
			    }
				
			}
			os.flush();
			os.close();
			file.renameTo(new File(fileName.substring(0, fileName.length()-4)));
		}catch(IOException e){
			e.printStackTrace();
			return false;
		}
		
		return true;
		
	}
	
	
	/**
	 * 把对应的对象集合写到某个文件，文件名以时间特殊标注
	 * @param list
	 * @return
	 * @throws IOException 
	 */
	public static boolean WriteListToFileForDirectSRO(List<ScmSupplierSroheader> list) {
		DateFormat format = new SimpleDateFormat("yyyy_MM_dd-HH_mm_ss_S");
		String fileName = "statustempfordirectsro/"+format.format(new Date())+"cso.tmp";
		File file = new File(fileName);
		if(!file.exists())
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
				return false;
			}
		FileOutputStream os;
		try {
			os = new FileOutputStream(file,false);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return false;
		}
		try{
			for(ScmSupplierSroheader status:list){
				
				for(ScmSupplierSrodetail  detail : status.getReturnReturnintransitDetail()){
					
					String Stringline = modelToStringLineForDirectSRO(status,detail);
					if("".equals(Stringline))
						continue;
					byte[] bytes = (Stringline+"\n").getBytes("UTF-8");
				    int j = 0;
				    if (bytes[0] == -17 && bytes[1] == -69 && bytes[2] == -65) {    //bom文件格式头字节
				    byte[] strs = new byte[bytes.length - 3];//去掉该内容的bom标示
					for (int i = 3; i < bytes.length; i++) {
						strs[j] = bytes[i];
						j++;
				      }
						os.write(strs);
				    }else{
				    	os.write(bytes);	
				    }
				}
				
			}
			os.flush();
			os.close();
			file.renameTo(new File(fileName.substring(0, fileName.length()-4)));
		}catch(IOException e){
			e.printStackTrace();
			return false;
		}
		
		return true;
		
	}
	
	
	
	/**
	 * 对应的每个对象转化为edi每行
	 * @param status
	 * @return
	 */
	public static String modelToStringLine(DeliveryOrderintransit status){
		StringBuffer sb = new StringBuffer();
		sb.append(stringToFixedLength("ZJ0008",16," ",0));
		sb.append(stringToFixedLength("",8," ",0));
		sb.append(stringToFixedLength("",10," ",0));
		
		
		List<DeliveryOrderintransitDetail>  deliveryOrderintransitDetailList =  status.getDeliveryOrderintransitDetail();
		if((null!=deliveryOrderintransitDetailList)&&(deliveryOrderintransitDetailList.size()>0)){
			DeliveryOrderintransitDetail deliveryOrderintransitDetail = deliveryOrderintransitDetailList.get(0);
			sb.append(stringToFixedLength((deliveryOrderintransitDetail.getShiporderid())+"-"+(deliveryOrderintransitDetail.getShipordersequence()),14," ",0));
			
		}else{
			return "";
		}
		
		sb.append(stringToFixedLength("",1," ",0));
		sb.append(stringToFixedLength(status.getTrackingnumber(),21," ",1));
		sb.append(stringToFixedLength("",20," ",0));
		sb.append(stringToFixedLength("",26," ",0));
		sb.append(stringToFixedLength(new SimpleDateFormat("yyyy/MM/dd").format(status.getReceiptorrejecttime()),11," ",0));
		sb.append(stringToFixedLength("001",3," ",1));
		sb.append(stringToFixedLength("..",98," ",0));
		sb.append(stringToFixedLength("",22," ",0));
		if(status.getTrackingstatus()==1002){
			sb.append(stringToFixedLength("1",4," ",0));
		}else if(status.getTrackingstatus()==1003){
			sb.append(stringToFixedLength("5",4," ",0));
		}else{
			sb.append(stringToFixedLength("7",4," ",0));
		}
		
		sb.append(stringToFixedLength("",18," ",0));
		return sb.toString();
		
	}
	
	
	
	
	/**
	 * 对应的每个对象转化为edi每行
	 * @param status
	 * @return
	 */
	public static String modelToStringLineForDirectCSO(ScmSupplierCsoinfo status){
		StringBuffer sb = new StringBuffer();
		sb.append(stringToFixedLength(status.getWarehouseid()+"",6," ",0));
		sb.append(stringToFixedLength(status.getShiporderid()+"",9," ",0));
		sb.append(stringToFixedLength(status.getShipordersequence()+"",2," ",0));
		sb.append(stringToFixedLength(status.getProductid()+"",6," ",0));
		sb.append(stringToFixedLength(status.getProductversion()+"",2," ",0));
		
		sb.append(stringToFixedLength(status.getProductcolourcode()+"",4," ",0));
		sb.append(stringToFixedLength(status.getProductcolourclass()+"",4," ",0));
		sb.append(stringToFixedLength(status.getProductstylecode()+"",4," ",0));
		sb.append(stringToFixedLength(status.getProductstyleclass()+"",4," ",0));
		
		sb.append(stringToFixedLength(status.getProductquantity()+"",8," ",0));
		sb.append(stringToFixedLength(status.getProductquantity()+"",8," ",0));
		if(null !=(status.getActualshipdate()) ){
			sb.append(stringToFixedLength(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(status.getActualshipdate())+"",19," ",0));
		}else{
			sb.append(stringToFixedLength(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date()),19," ",0));
		}
	
		if(status.getOrderstatus() == SCMConstants.ORDER_STATUS_SHIPPING_CANCELSUCCESS){
			sb.append(stringToFixedLength("1000025",9," ",0));
		}else{
			sb.append(stringToFixedLength(status.getSelectedcarrier()+"",9," ",0));
		}
		sb.append(stringToFixedLength((status.getDeliveryorderid()+"").replaceAll("\r|\n", ""),20," ",0));
		
		sb.append(stringToFixedLength("",80," ",0));
		
		if(status.getOrderstatus() == SCMConstants.ORDER_STATUS_SHIPPING_CANCELSUCCESS){
			sb.append(stringToFixedLength("9903",4," ",0));
		}else{
			sb.append(stringToFixedLength("9901",4," ",0));
		}
		
		sb.append(stringToFixedLength(status.getDeliveryaddress1()+"",200," ",0));
		
		return sb.toString();
		
	}
	
	
	/**
	 * 对应的每个对象转化为edi每行
	 * @param status
	 * @return
	 */
	public static String modelToStringLineForDirectSRO(ScmSupplierSroheader  header,ScmSupplierSrodetail detail){
		
		
		StringBuffer sb = new StringBuffer();
		
		
		
		sb.append(stringToFixedLength(header.getWarehouseid()+"",6," ",0));
		sb.append(stringToFixedLength(detail.getReturnorderid()+"",9," ",0));
		sb.append(stringToFixedLength(detail.getReturnorderseq()+"",2," ",0));
		sb.append(stringToFixedLength(detail.getProductid()+"",6," ",0));
		
		sb.append(stringToFixedLength(detail.getColorcode()+"",4," ",0));
		sb.append(stringToFixedLength(detail.getColorclasscode()+"",4," ",0));
		sb.append(stringToFixedLength(detail.getStylecode()+"",4," ",0));
		sb.append(stringToFixedLength(detail.getStyleclasscode()+"",4," ",0));
		
		sb.append(stringToFixedLength(detail.getProductnumber()+"",8," ",0));
		if(header.getReceiptstatus()==1005){
			sb.append(stringToFixedLength(detail.getProductnumber()+"",8," ",0));
		}else{
			sb.append(stringToFixedLength("0",8," ",0));
		}
		
		if(null !=(header.getReceiptsuccesstime()) ){
			sb.append(stringToFixedLength(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(header.getReceiptsuccesstime())+"",19," ",0));
		}else{
			sb.append(stringToFixedLength("",19," ",0));
		}
		if(header.getReceiptstatus()==1005){
			sb.append(stringToFixedLength(header.getSelectedcarrier()+"",9," ",0));
		}else{
			sb.append(stringToFixedLength("",9," ",0));
		}
		sb.append(stringToFixedLength("N",1," ",0));
		
		sb.append(stringToFixedLength("",6," ",0));
		sb.append(stringToFixedLength("",6," ",0));
		if(header.getReceiptstatus()==1005){
			sb.append(stringToFixedLength(header.getReceiptdeliveryorderid(),20," ",0));
		}else{
			sb.append(stringToFixedLength("",20," ",0));
		}
		
		sb.append(stringToFixedLength("",80," ",0));
		if(header.getReceiptstatus()==1005){
			sb.append(stringToFixedLength("1007",4," ",0));  //销退入库
		}else if(header.getReceiptstatus()==1011){
			sb.append(stringToFixedLength("1011",4," ",0));  //强迫结案
		}else{
			sb.append(stringToFixedLength("1013",4," ",0));  //拦截成功
		}
		
		sb.append(stringToFixedLength(detail.getProductversion()+"",2," ",0));
		
		return sb.toString();
		
	}
	
	
	
	
	/**
	 * 对应的每个对象转化为edi每行
	 * @param status
	 * @return
	 */
	public static String modelToStringLineForCSOConfirm(ScmSupplierCsoinfo status){
		StringBuffer sb = new StringBuffer();
		sb.append(stringToFixedLength("ZJ0008",16," ",0));
		sb.append(stringToFixedLength("",8," ",0));
		sb.append(stringToFixedLength("",10," ",0));
		
		return sb.toString();
		
	}
	
	
	/**
	 * 把字段串转化为固定长度的字符串
	 * @param s 源字符串
	 * @param len 字符串固定长度
	 * @param str  补齐字符
	 * @param align  对齐方式 0左对齐 其他右对齐
	 * @return
	 */
	public static String stringToFixedLength(String s,int len,String str,int align){
		if(s.length()>len){
			return s.substring(0, len-1);
		}
		int appendStrLen=len - s.length();
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<appendStrLen;i++){
			sb.append(str);
		}
		if(align==0){
			return s+sb.toString();
		}else{
			return sb.toString()+s;
		}
	}
	
	public static void main(String[] args) throws IOException {
	//	File directory = new File("xxx/xxx.txt");
		//directory.createNewFile();
		/*
		Date d = new Date();
		DateFormat format = new SimpleDateFormat("yyyy_MM_dd-HH_mm_ss");
		String fileName = "statustemp/"+format.format(d)+".txt";
		File file = new File(fileName);
		file.createNewFile();*/
		//long l = 175l ;
		//System.out.println(l/100+"  "+l%100);
		/**
		List<EmsStatus> list = new ArrayList<EmsStatus>();
		EmsStatus emsStatus1 = new EmsStatus();
		emsStatus1.setMailnum("ZJ500020131DS");
		emsStatus1.setShiporderidsequence(592201l);
		emsStatus1.setProcdate("20131211");
		emsStatus1.setErpstatus(7);
		emsStatus1.setDescription("客户44444444444444");
		
		EmsStatus emsStatus2 = new EmsStatus();
		emsStatus2.setMailnum("ZJ500020145DS");
		emsStatus2.setShiporderidsequence(592301);
		emsStatus2.setProcdate("20131211");
		emsStatus2.setErpstatus(7);
		emsStatus2.setDescription("客户44444444444444");
		// System.out.println(modelToStringLine(emsStatus));
		list.add(emsStatus1);
		list.add(emsStatus2);
		testFileRename();*/
		/**
		WriteListToFile(list);
		FtpUtil.uploadFileBySun(FtpCommon.ftphost,
				FtpCommon.ftpusername, FtpCommon.ftppassword,FtpCommon.ftpdirectory,
				FtpCommon.toftpfileCode, FtpCommon.toLocalDer);
		testFilesInfo();**/
	}
	
	public static void testFilesInfo() throws IOException{
		System.out.println("^^^^^");
		String fileName = "statustemp/2013_12_12-11_13_19ws";
		// String fileName = "statustemp/2013_12_11-20_08_38ws--v2.txt";
		File file = new File(fileName);
		
		FileInputStream in = new FileInputStream(file);  
        // 指定读取文件时以UTF-8的格式读取  
        BufferedReader br = new BufferedReader(new InputStreamReader(in, Charset.defaultCharset().name()));  
          
        String line = br.readLine();  
        while(line != null)  
        {  
            System.out.println(line);  
            line = br.readLine();  
        }  
    }
	
	public static void testFileRename() throws IOException{
		DateFormat format = new SimpleDateFormat("yyyy_MM_dd-HH_mm_ss_S");
		String fileName = "statustemp/"+format.format(new Date())+"ws.tmp";
		File file = new File(fileName);
		if(!file.exists())
			file.createNewFile();
		FileOutputStream os = new FileOutputStream(file,false);
		//byte[] wubom = new byte[] { (byte)0xEF, (byte)0xBB, (byte)0xBF}; 
        //os.write(wubom); 
			String Stringline = "cccccc";
			byte[] bytes = (Stringline+"\n").getBytes("UTF-8");
		    int j = 0;
		    if (bytes[0] == -17 && bytes[1] == -69 && bytes[2] == -65) {    //bom文件格式头字节
		    byte[] strs = new byte[bytes.length - 3];//去掉该内容的bom标示
			for (int i = 3; i < bytes.length; i++) {
				strs[j] = bytes[i];
				j++;
		      }
				os.write(strs);
		    }else{
		    	os.write(bytes);	
		    }
			
		os.flush();
		os.close();
		 fileName = "statustemp/";
		File[] files = new File(fileName).listFiles();
		for(File f:files){
			System.out.println(f.getName());
		}
		
	}
		
}