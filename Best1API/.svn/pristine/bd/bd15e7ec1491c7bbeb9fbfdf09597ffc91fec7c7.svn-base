package com.best1.api.webapp.mvc.vwms.ftp;

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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.best1.api.entity.vwms.TvwsApiCsowholeConfirm;
import com.best1.api.entity.vwms.TvwsApiProductinventory;
import com.best1.api.entity.vwms.TvwsApiReturnorderconfirm;
import com.best1.api.entity.vwms.TvwsApiRtvconfirm;
import com.best1.api.entity.vwms.TvwsApiSuppliershipconfirm;


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
	public static boolean WMSInventoryWriteListToFile(List<TvwsApiProductinventory> list ) {
		DateFormat format = new SimpleDateFormat("yyyy_MM_dd-HH_mm_ss_S");
		String fileName = "wmsinventory/"+format.format(new Date())+"cso.tmp";
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
			for(TvwsApiProductinventory status:list){
				String Stringline = WMSInventorymodelToStringLine(status);
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
	 * 对应的每个对象转化为edi每行
	 * @param status
	 * @return
	 */
	public static String WMSInventorymodelToStringLine(TvwsApiProductinventory status){
		StringBuffer sb = new StringBuffer();
		sb.append(stringToFixedLength(status.getWarehouseid()+"",6," ",0));
		sb.append(stringToFixedLength(status.getProductid()+"",6," ",0));
		sb.append(stringToFixedLength(status.getProductversion()+"",2,"0",1));
		sb.append(stringToFixedLength(status.getColourcode()+"",4," ",0));
		sb.append(stringToFixedLength(status.getColourclass()+"",4," ",0));
		sb.append(stringToFixedLength(status.getStylecode()+"",4," ",0));
		sb.append(stringToFixedLength(status.getStyleclass()+"",4," ",0));
		sb.append(stringToFixedLength(status.getLocationid()+"",10," ",0));
		sb.append(stringToFixedLength(status.getLocationtype()+"",10," ",0));
		sb.append(stringToFixedLength(status.getTotalproductquantity()+"",8," ",0));
		sb.append(stringToFixedLength(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(status.getStockupdatedate())+"",19," ",0));
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
		testWMSInventoryWriteListToFile();
	}
	
	
	
	public static void testWMSInventoryWriteListToFile(){
		
		List<TvwsApiProductinventory>  list = new ArrayList<TvwsApiProductinventory>();
		
		TvwsApiProductinventory tvwsApiProductinventory  = new TvwsApiProductinventory();
		tvwsApiProductinventory.setProductid(110880l);
		tvwsApiProductinventory.setStockupdatedate(new Date());
		list.add(tvwsApiProductinventory);
		
		WMSInventoryWriteListToFile(list);
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
	
	
	public static boolean WMSCSOWriteListToFile(List<TvwsApiCsowholeConfirm> list ) {
		DateFormat format = new SimpleDateFormat("yyyy_MM_dd-HH_mm_ss_S");
		String fileName = "wmscso/"+format.format(new Date())+"cso.tmp";
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
			for(TvwsApiCsowholeConfirm status:list){
				String Stringline = WMSCSOmodelToStringLine(status);
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
	public static String WMSCSOmodelToStringLine(TvwsApiCsowholeConfirm status){
		StringBuffer sb = new StringBuffer();
		sb.append(stringToFixedLength(status.getWarehouseid()+"",6," ",0));
		sb.append(stringToFixedLength(status.getShiporderid()+"",9," ",0));
		sb.append(stringToFixedLength(status.getShipordersequence()+"",2,"0",1));
		sb.append(stringToFixedLength(status.getProductid()+"",6," ",0));
		sb.append(stringToFixedLength(status.getProductversion()+"",2,"0",1));
		sb.append(stringToFixedLength(status.getColourcode()+"",4," ",0));
		sb.append(stringToFixedLength(status.getColourclass()+"",4," ",0));
		sb.append(stringToFixedLength(status.getStylecode()+"",4," ",0));
		sb.append(stringToFixedLength(status.getStyleclass()+"",4," ",0));
		sb.append(stringToFixedLength(status.getProductquantity()+"",8," ",0));
		sb.append(stringToFixedLength(status.getIntransitquantity()+"",8," ",0));
		sb.append(stringToFixedLength(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(status.getActualshippeddate())+"",19," ",0)); 
		sb.append(stringToFixedLength(status.getSelectedcarrier()+"",9," ",0));
		sb.append(stringToFixedLength(status.getDeliverynumber()+"",20," ",0));
		sb.append(stringToFixedLength(status.getReason()+"",80," ",0));
		sb.append(stringToFixedLength(status.getCsostatus()+"",4," ",0));
		sb.append(stringToFixedLength(status.getDeliveryarea()+"",200," ",0));
		return sb.toString();
		
	}
	
	
	
	public static boolean WMSSROWriteListToFile(List<TvwsApiReturnorderconfirm> list ) {
		DateFormat format = new SimpleDateFormat("yyyy_MM_dd-HH_mm_ss_S");
		String fileName = "wmssro/"+format.format(new Date())+"cso.tmp";
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
			for(TvwsApiReturnorderconfirm status:list){
				String Stringline = WMSSROmodelToStringLine(status);
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
	public static String WMSSROmodelToStringLine(TvwsApiReturnorderconfirm status){
		StringBuffer sb = new StringBuffer();
		sb.append(stringToFixedLength(status.getWarehouseid()+"",6," ",0)); 
		sb.append(stringToFixedLength(status.getReturnorderid()+"",9," ",0));
		sb.append(stringToFixedLength(status.getReturnordersequence()+"",2," ",0));
		sb.append(stringToFixedLength(status.getProductid()+"",6," ",0));
		sb.append(stringToFixedLength(status.getColourcode()+"",4," ",0));
		sb.append(stringToFixedLength(status.getColourclass()+"",4," ",0));
		sb.append(stringToFixedLength(status.getStylecode()+"",4," ",0));
		sb.append(stringToFixedLength(status.getStyleclass()+"",4," ",0));
		sb.append(stringToFixedLength(status.getRequestquantity()+"",8," ",0));
		sb.append(stringToFixedLength(status.getReceivedquantity()+"",8," ",0));
		sb.append(stringToFixedLength(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(status.getReturntowarehousedate())+"",19," ",0));
		if(null!=status.getSelectedcarrier()){
			sb.append(stringToFixedLength(status.getSelectedcarrier()+"",9," ",0));
		}else{
			sb.append(stringToFixedLength("0",9," ",0));
		}
		
		sb.append(stringToFixedLength(status.getMissingpartsflag()+"",1," ",0));
		sb.append(stringToFixedLength("",6," ",0));
		sb.append(stringToFixedLength("",6," ",0));
		sb.append(stringToFixedLength(status.getDeliverynumber()+"",20," ",0));
		sb.append(stringToFixedLength("",80," ",0));
		sb.append(stringToFixedLength(status.getOrderstatus()+"",4," ",0));
		sb.append(stringToFixedLength(status.getProductversion()+"",2," ",0));
		return sb.toString();
		
	}
	
	
	public static boolean WMSSSOWriteListToFile(List<TvwsApiSuppliershipconfirm> list ) {
		DateFormat format = new SimpleDateFormat("yyyy_MM_dd-HH_mm_ss_S");
		String fileName = "wmssso/"+format.format(new Date())+"cso.tmp";
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
			for(TvwsApiSuppliershipconfirm status:list){
				String Stringline = WMSSSOmodelToStringLine(status);
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
	public static String WMSSSOmodelToStringLine(TvwsApiSuppliershipconfirm status){
		StringBuffer sb = new StringBuffer();
		sb.append(stringToFixedLength(status.getWarehouseid()+"",6," ",0));
		sb.append(stringToFixedLength(status.getSuppliershiporderid()+"",9," ",0));
		sb.append(stringToFixedLength(status.getRecievedquantity()+"",8," ",0));
		sb.append(stringToFixedLength(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(status.getArrivaldate())+"",19," ",0));
		sb.append(stringToFixedLength(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(status.getReceivedtime())+"",19," ",0));
		return sb.toString();
		
	}
	
	
	
	
	public static boolean WMSRTVWriteListToFile(List<TvwsApiRtvconfirm> list ) {
		DateFormat format = new SimpleDateFormat("yyyy_MM_dd-HH_mm_ss_S");
		String fileName = "wmsrtv/"+format.format(new Date())+"cso.tmp";
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
			for(TvwsApiRtvconfirm status:list){
				String Stringline = WMSRTVmodelToStringLine(status);
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
	public static String WMSRTVmodelToStringLine(TvwsApiRtvconfirm status){
		StringBuffer sb = new StringBuffer();
		sb.append(stringToFixedLength(status.getWarehouseid()+"",6," ",0));
		sb.append(stringToFixedLength(status.getRtvorderid()+"",9," ",0));
		sb.append(stringToFixedLength(status.getRtvordersequence()+"",2,"0",1));
		sb.append(stringToFixedLength(status.getProductid()+"",6," ",0));
		sb.append(stringToFixedLength(status.getProductversion()+"",2,"0",1));
		sb.append(stringToFixedLength(status.getColourcode()+"",4," ",0));
		sb.append(stringToFixedLength(status.getColourclass()+"",4," ",0));
		sb.append(stringToFixedLength(status.getStylecode()+"",4," ",0));
		sb.append(stringToFixedLength(status.getStyleclass()+"",4," ",0));
		sb.append(stringToFixedLength(status.getDamagedquantity()+"",8," ",0));
		sb.append(stringToFixedLength(status.getReturnquantity()+"",8," ",0));
		sb.append(stringToFixedLength(status.getReturnquantitypicked()+"",8," ",0));
		sb.append(stringToFixedLength(status.getDamagedquantitypicked()+"",8," ",0));
		sb.append(stringToFixedLength(status.getReason()+"",80," ",0));
		sb.append(stringToFixedLength(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(status.getReturnorderconfirmdate())+"",19," ",0));
		sb.append(stringToFixedLength(status.getForcecloseflag()+"",1," ",0));
		return sb.toString();
		
	}
	
}
