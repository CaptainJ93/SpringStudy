package com.best1.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

import com.best1.domain.UserInfo;


public class UserSigninListener implements HttpSessionAttributeListener{
	Map<Long, HttpSession> map = new HashMap<Long, HttpSession>();
    public void attributeAdded(HttpSessionBindingEvent event) {
       String name = event.getName();
       if(name.equals("user")){
           UserInfo user = (UserInfo)event.getValue();
           if(map.get(user.getUserid())!=null){
              HttpSession sess = map.get(user.getUserid());
              sess.removeAttribute("user");
              sess.removeAttribute("userroleResources");
              sess.invalidate();
           }
           map.put(user.getUserid(), event.getSession());
       }
    }
 
    public void attributeRemoved(HttpSessionBindingEvent event) {
       String name = event.getName();
       if(name.equals("user")){
    	   UserInfo user = (UserInfo)event.getValue();
           map.remove(user.getUserid());
       }
    }
 
    public void attributeReplaced(HttpSessionBindingEvent event) {
       // TODO Auto-generated method stub
       
    }
}
