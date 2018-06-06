package com.best1.service.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

import javax.naming.AuthenticationException;
import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;

import com.best1.base.BaseServiceImpl;
import com.best1.base.BusiException;
import com.best1.base.DataModel;
import com.best1.base.common.SystemCommonDefine;
import com.best1.db.PrivilegeDao;
import com.best1.db.UserDao;
import com.best1.domain.Privilege;
import com.best1.domain.UserInfo;
import com.best1.service.LoginService;

public class LoginServiceImpl extends BaseServiceImpl implements LoginService {
	private UserDao userDao;
	private PrivilegeDao privilegeDao;
	private  DirContext ctx = null;
	private boolean isUserPass=false;
	
	public UserInfo getUserInfo(HashMap condition) throws BusiException {
		try {
			DataModel dataModel = userDao.getUserInfo(condition);
			List list = dataModel.getRows();
			if(list.size() > 0){
				UserInfo userInfo = (UserInfo)list.get(0);
				//查询敏感数据权限
				condition.clear();
				condition.put("userid", userInfo.getUserid());
				condition.put("privilegeType", SystemCommonDefine.PRIVILEGE_TYPE_10);
				dataModel = privilegeDao.getSensitiveData(condition);
				list = dataModel.getRows();
				HashMap map = new HashMap();
				for(int i=0;i<list.size();i++){
					map.put(((Privilege)list.get(i)).getPrivilegeCode(), ((Privilege)list.get(i)).getPrivilegeValue());
				}
				userInfo.setSensitiveData(map);
				return userInfo;	
			}else{
				return null;
			}
		}catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel updateUserpwdErrorNum(HashMap paramMap){
		try {
			return userDao.updateUserpwdErrorNum(paramMap);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel lockUserStatus(HashMap paramMap){
		try {
			return userDao.lockUserStatus(paramMap);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel updateUserPwd(HashMap paramMap){
		try {
			return userDao.updateUserPwd(paramMap);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	@Deprecated
	public boolean isUserPass(String name,String password){
		
		 Hashtable<String, String> env = new Hashtable<String, String>(11);
		 try {
			 env.put(Context.SECURITY_AUTHENTICATION,"simple" );
			 env.put( Context.SECURITY_PRINCIPAL,name+ "@" + "best1.com");
			 env.put(Context.SECURITY_CREDENTIALS, password);
		     env.put(Context.INITIAL_CONTEXT_FACTORY,"com.sun.jndi.ldap.LdapCtxFactory");
			 env.put(Context.PROVIDER_URL,"ldap://10.50.7.10:389/");
			 env.put("com.sun.jndi.ldap.connect.timeout", "10000"); 
		     ctx = new InitialDirContext(env);
		     isUserPass=true;
	         ctx.close();
		} catch(AuthenticationException b){
			return false;
		}catch (NamingException e) {
			return false;
		}finally{
               try {
               	if (ctx != null) {
					ctx.close();}
				} catch (NamingException e) {
					e.printStackTrace();
				}
           }
		return isUserPass;
	}
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public PrivilegeDao getPrivilegeDao() {
		return privilegeDao;
	}

	public void setPrivilegeDao(PrivilegeDao privilegeDao) {
		this.privilegeDao = privilegeDao;
	}

}
