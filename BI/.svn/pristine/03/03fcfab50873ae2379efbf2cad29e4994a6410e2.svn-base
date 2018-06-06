package com.best1.base;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class ConnectionObject {
	
	public Connection getConn(){
		try{
			Context context = new InitialContext();
			DataSource ds = (DataSource)context.lookup("java:/comp/env/jdbc/oracleds");
			Connection conn = ds.getConnection(); 
			return conn;
		}catch(Exception e){
			System.out.println("建立数据库连接失败！ " + e.getMessage());
			return null;
		}
	}
	
}
