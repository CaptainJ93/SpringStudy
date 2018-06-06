package com.best1.db;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import com.best1.base.BaseBO;
import com.best1.base.DataModel;
import com.best1.domain.MenuInfo;

public class TreeInfoDAO  extends BaseBO{
	
	
	public List<MenuInfo> getTreeInfosByParentId(HashMap paramMap) throws SQLException{
		
		return (baseDAO.queryForList("TreeSql.getTreeInfos", paramMap)).getRows();
//		String sql = "SELECT DISTINCT A.MENUID, A.MENUNAME, A.MENUPID, A.MENUURL, A.MENUTYPE FROM TB_BEST1_MENU A WHERE 1 = 1 AND A.MENUPID = ? START WITH A.MENUID IN (SELECT B.MENUID FROM TB_BEST1_ROLE_MENU B WHERE B.ROLEID IN (SELECT C.ROLEID FROM TB_BEST1_USERROLE C WHERE C.USERID = ?))CONNECT BY PRIOR MENUPID = MENUID";
	}
	
	public DataModel getMenuTree(HashMap paramMap) throws SQLException{
		return baseDAO.queryForList("TreeSql.getMenuTree", paramMap);
	}
	
	public DataModel getMenuTreeDirectory(HashMap paramMap) throws SQLException{
		return baseDAO.queryForList("TreeSql.getMenuTreeDirectory", paramMap);
	}

	public DataModel getDepartmentTree(HashMap paramMap) throws SQLException{
		return baseDAO.queryForList("TreeSql.getDepartmentTree", paramMap);
	}
}
