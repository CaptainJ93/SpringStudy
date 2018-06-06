package com.best1.api.webapp.mvc.oaf.ftp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.best1.api.webservice.soap.response.dto.oaf.FedirefundresponseDTO;

public class FediRefundListToTxtUtil {

	public static boolean FediRefundWriteListToFile(List<FedirefundresponseDTO> list ) {
		DateFormat format = new SimpleDateFormat("yyyy_MM_dd-HH_mm_ss_S");
		String fileName = "fedirefund/"+format.format(new Date())+"FediRefund.tmp";
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
			for(FedirefundresponseDTO status:list){
				String Stringline = FediRefundmodelToStringLine(status);
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
	
	
	public static String FediRefundmodelToStringLine(FedirefundresponseDTO status){
		StringBuffer sb = new StringBuffer();
		sb.append(stringToFixedLength(status.getRefundstatus()+"",4," ",0));
		sb.append(stringToFixedLength(status.getTransactionsequence()+"",100," ",0));
		sb.append(stringToFixedLength(status.getRefundamount()+"",15," ",1));
		sb.append(stringToFixedLength(new SimpleDateFormat("yyyyMMdd").format(status.getPaymentdate())+"",8," ",0));
		if(null == status.getPayingaccountnumber()){
			sb.append(stringToFixedLength("",50," ",1));
		}else{
			sb.append(stringToFixedLength(status.getPayingaccountnumber()+"",50," ",1));
		}
		
		
		sb.append(stringToFixedLength("",7,"1",0));
		sb.append(stringToFixedLength(status.getCompanyid()+"",9," ",0));
		if(null == status.getPayername()){
			sb.append(stringToFixedLength("",64," ",0));
		}else{
			sb.append(stringToFixedLength(status.getPayername()+"",64," ",0));
		}
		
		if(null ==status.getServicefee() ){
			sb.append(stringToFixedLength("",15," ",1));
		}else{
			sb.append(stringToFixedLength(status.getServicefee()+"",15," ",1));
		}
		if(null ==status.getBusinesscode() ){
			sb.append(stringToFixedLength("",50," ",0));
		}else{
			sb.append(stringToFixedLength(status.getBusinesscode()+"",50," ",0));
		}
		
		
		
		
		if(null ==status.getRecipientaccount() ){
			sb.append(stringToFixedLength("",50," ",1));
		}else{
			sb.append(stringToFixedLength(status.getRecipientaccount()+"",50," ",1));
		}
		sb.append(stringToFixedLength("",7," ",0));
		sb.append(stringToFixedLength("",10," ",0));
		if(null ==status.getRecipientname() ){
			sb.append(stringToFixedLength("",50," ",0));
		}else{
			sb.append(stringToFixedLength(status.getRecipientname()+"",50," ",0));
		}
		if(null ==status.getBankcode() ){
			sb.append(stringToFixedLength("",50," ",0));
		}else{
			sb.append(stringToFixedLength(status.getBankcode()+"",50," ",0));
		}
		
		
		if(null ==status.getRefundid()){
			sb.append(stringToFixedLength("",9," ",0));
		}else{
			sb.append(stringToFixedLength(status.getRefundid()+"",9," ",0));
		}
		if(null ==status.getCustomerid() ){
			sb.append(stringToFixedLength("",9," ",0));
		}else{
			sb.append(stringToFixedLength(status.getCustomerid()+"",9," ",0));
		}
		
	
		
		
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
}
