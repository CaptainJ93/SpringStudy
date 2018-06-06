package com.best1.api.utils;
/**
 * @author 作者 胡文华 E-mail: huwenghua1@hotmail.com
 * @version 创建时间：2008-8-28 下午02:59:10
 * 类说明
 */

public class CardID{
//验证15位身份证是否正确
public static boolean getInfof(String s){
String M=new String(s);
int y=Integer.parseInt(M.substring(6,8));
int m=Integer.parseInt(M.substring(8,10));
int d=Integer.parseInt(M.substring(10,12));
if (m<1 || m>12 || d<1 || d>31 || ((m==4 || m==6 || m==9 || m==11) && d>30) ||(m==2 && (((y+1900) % 4>0 && d>28) || d>29))) 
{return false;}
return true;
}
//验证15位身份证与生日是否正确
public static boolean getInfofBirthDate(String s,int meyear,int memonth,int meday ){
	String M=new String(s);
	int y=Integer.parseInt(M.substring(6,8));
	int m=Integer.parseInt(M.substring(8,10));
	int d=Integer.parseInt(M.substring(10,12));
	if(y!=(meyear-1900)||m!=memonth||d!=meday)
	return false;
   return true;
	}
//验证15位身份证与性别是否正确
public static boolean getInfofSex(String s,String sexstr ){
	String M=new String(s);
	String sexflage;
	int sex=Integer.parseInt(M.substring(14,15));
	if(sex%2==0)
	sexflage="F";
	else
   sexflage="M";
	if(sexflage.endsWith(sexstr))
	return true;
	else
	return false;
	}
//验证18位身份证是否正确
public static boolean getInfoe(String s){
String M=new String(s);
int y=Integer.parseInt(M.substring(6,10));
int m=Integer.parseInt(M.substring(10,12));
int d=Integer.parseInt(M.substring(12,14));
int[] xx={2,4,8, 5,10,9,7, 3,6,1,2, 4,8,5,10, 9,7}; 
char[] yy={'1','0','X','9','8','7','6','5','4','3','2'};
int mm=0;
int[] gg = new int[18];
if (y<1900 || m<1 || m>12 || d<1 || d>31 || ((m==4 || m==6 || m==9 || m==11) && d>30) || (m==2 && ((y % 4>0 && d>28) || d>29))) 
{
return false;
}
for(int i=1;i<18;i++)
{ int j = 17 - i; 
gg[i-1]=Integer.parseInt(M.substring(j,j+1));
}
for( int i=0;i<17;i++)
   { mm+=xx[i]*gg[i];
   }
mm=mm%11;
char c= M.charAt(17);
if(c==yy[mm])
 {
return true;
}
else
{
return false;
}
}
//验证18位身份证与生日是否正确
public static boolean getInfoeBirthDate(String s,int meyear,int memonth,int meday ){
	String M=new String(s);
	int y=Integer.parseInt(M.substring(6,10));
	int m=Integer.parseInt(M.substring(10,12));
	int d=Integer.parseInt(M.substring(12,14));
  if(y!=(meyear)||m!=memonth||d!=meday)
		return false;
return true;
	}
//验证18位身份证与性别是否正确
public static boolean getInfoeSex(String s,String sexstr ){
	String M=new String(s);
	String sexflage;
int sex=Integer.parseInt(M.substring(16,17));
	if(sex%2==0)
	{
	sexflage="F";}
else
{
sexflage="M";}
	if(sexflage.endsWith(sexstr))
		return true;
		else
		return false;
}
public static void Convert(String s){ 

  StringBuffer sad=new StringBuffer(s);

 sad.insert(6,"19");

 int[] xx={2,4,8, 5,10,9,7, 3,6,1,2, 4,8,5,10, 9,7}; 

 char[] yy={'1','0','X','9','8','7','6','5','4','3','2'};

int mm=0;

int[] gg = new int[18];

for(int i=1;i<18;i++)

{ int j = 17 - i; 

gg[i-1]=Integer.parseInt(sad.substring(j,j+1));

}

for(int i=0;i<17;i++)

{ mm+=xx[i]*gg[i];}

  mm=mm%11;    

System.out.println("该居民身份证是新的身份证"+sad+yy[mm]);    }             } 


