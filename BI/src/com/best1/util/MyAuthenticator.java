package com.best1.util;

import javax.mail.*;   

public class MyAuthenticator extends Authenticator{   
    String userName=null;   
    String password=null;   
        
    public MyAuthenticator(){   
    }   
    public MyAuthenticator(String username, String password) {    
        this.userName = username;    
        this.password = password;    
    }    
    protected PasswordAuthentication getPasswordAuthentication(){   
        return new PasswordAuthentication(userName, password);   
    }   
    
    /*
    public static void main(String[] args){   
        //这个类主要是设置邮件   
     MailSenderInfo mailInfo = new MailSenderInfo();
     mailInfo.setMailServerHost("smtp.best1.com");
     mailInfo.setMailServerPort("25");    
     mailInfo.setValidate(true);    
     mailInfo.setUserName("chenfei@best1.com");    
     mailInfo.setPassword("*******");//您的邮箱密码    
     mailInfo.setFromAddress("chenfei@best1.com");    
     mailInfo.setToAddress("chenfei@best1.com");    
     mailInfo.setSubject("主题");
     mailInfo.setContent("内容");
        //这个类主要来发送邮件   
     SimpleMailSender sms = new SimpleMailSender();   
         sms.sendTextMail(mailInfo);//发送文体格式    
         sms.sendHtmlMail(mailInfo);//发送html格式   
   }  
   */
}   
