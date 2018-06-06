package com.best1.base;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.engine.impl.SqlMapClientImpl;
import com.ibatis.sqlmap.engine.mapping.sql.Sql;
import com.ibatis.sqlmap.engine.mapping.statement.MappedStatement;
import com.ibatis.sqlmap.engine.scope.SessionScope;
import com.ibatis.sqlmap.engine.scope.StatementScope;

public class BaseDAO {

	//日志对象
	protected transient Log log = null;

	/**构造DTO对象*/
	public BaseDAO() {
		log = LogFactory.getLog(this.getClass());
	}

    /**取得日志对象*/
	protected Log getLog() {
		return log;
	}
	protected SqlMapClient sqlMapClient;

	public SqlMapClient getSqlMapClient() {
		return sqlMapClient;
	}

	public void setSqlMapClient(SqlMapClient sqlMapClient) {
		this.sqlMapClient = sqlMapClient;
	}

	/**
	 * 此方法用与分页查询
	 * 
	 * @Title: queryForList
	 * @param sqlIdForList
	 *            查询的SQL ID
	 * @param sqlIdForNum
	 *            查询总记录数SQL ID
	 * @param paramMap
	 *            查询的条件,分页必须包括下面字段 key="page" 含期望的页码 key="rows" 每页的记录数
	 *            key="sidx" 排序的字段 key="sord" 排序的顺序
	 * @return DataModel
	 */
	public DataModel queryForList(String sqlIdForList, String sqlIdForNum,
			Map paramMap){
		DataModel dataModel = new DataModel();
		try {
			int rows = Integer.parseInt((String) paramMap.get("rows"));// 每页记录数
			int page = Integer.parseInt((String) paramMap.get("page"));// 当前页数
			// 总记录数
			int records = Integer.parseInt(String.valueOf(sqlMapClient
					.queryForObject(sqlIdForNum, paramMap)));
			if (records == 0) {
				log.debug(sqlIdForList + "---无符合条件的记录");
				dataModel.setRows(new ArrayList());
				dataModel.setErrCode("2");
				dataModel.setErrMsg("无查询记录");
			} else {
				// 计算总页数
				int total = (int) Math.ceil(((double) records / (double) rows));
				/*
				 * 数据库分页查询 1起始和结束index
				 * 2根据HashMap里的startIndex"开始行",endIndex"结束行",
				 * sidx"排序字段",sord"排序方式"进行查询
				 */
				int startIndex = (page - 1) * (rows) + 1;
				int endIndex = startIndex + rows - 1;
				paramMap.put("startIndex", String.valueOf(startIndex));
				paramMap.put("endIndex", String.valueOf(endIndex));
				List list = sqlMapClient.queryForList(sqlIdForList, paramMap);
				
				/*
				 *获得ibatis查询条件，用于记录插入日志用 
				 */
				String sql = this.getSql(sqlIdForList, paramMap);  
				
				// 设置返回对象DataModel
				dataModel.setPage(page);
				dataModel.setTotal(total);
				dataModel.setRecords(records);
				dataModel.setRows(list);
				dataModel.setErrCode("0");
				dataModel.setSql(sql);
			}
		} catch (SQLException se) {
			throw new BusiException("查询" + sqlIdForList + "出错!原因:" + se.getMessage(),se);
		} catch (Exception e) {
			throw new BusiException("其它错误原因:" + e.getMessage(),e);
		}
		return dataModel;
	}

	/**
	 * 不进行分页的查询
	 * 
	 * @Title: queryForList
	 * @param sqlIdForList
	 *            查询SQL ID
	 * @param paramMap
	 *            查询的条件,必须包含下面参数 key="rows" 每页记录数
	 * @return
	 */
	public DataModel queryForList(String sqlIdForList, Map paramMap){
		DataModel dataModel = new DataModel();
		try {
			paramMap.put("startIndex", 0);
			paramMap.put("endIndex", 100000);
			List list = sqlMapClient.queryForList(sqlIdForList, paramMap);
			int records = list.size(); // 总记录数
			int rows = 0;
			int total =0;
			if(paramMap.get("rows")==null||"".equals(paramMap.get("rows"))){
				rows = 10;
				total = (int) Math.ceil(((double) records / (double) rows)); 
			}else{
				rows = Integer.parseInt((String) paramMap.get("rows")); // 每页记录数
				total = (int) Math.ceil(((double) records / (double) rows)); // 总页数
			}
			/*
			 *获得ibatis查询条件，用于记录插入日志用 
			 */
			String sql = this.getSql(sqlIdForList, paramMap);  
			
			// 设置返回对象DataModel
			dataModel.setPage(1);
			dataModel.setTotal(total);
			dataModel.setRecords(records);
			dataModel.setRows(list);
			dataModel.setErrCode("0");
			dataModel.setSql(sql);
		} catch (SQLException se) {
			throw new BusiException("查询" + sqlIdForList + "出错!原因:" + se.getMessage(),se);
		} catch (Exception e) {
			throw new BusiException("其它错误原因:" + e.getMessage(),e);
		}
		return dataModel;
	}

	/**
	 * 不进行分页的查询
	 * 
	 * @Title: queryResultForList
	 * @param sqlIdForList
	 *            查询SQL ID
	 * @param paramMap
	 *            查询的条件,必须包含下面参数
	 * @return
	 */
	public List queryResultForList(String sqlIdForList, Object paramMap){
		List list = null;
		try {
			list = sqlMapClient.queryForList(sqlIdForList, paramMap);
		} catch (SQLException se) {
			throw new BusiException("查询" + sqlIdForList + "出错!原因:" + se.getMessage(),se);
		} catch (Exception e) {
			throw new BusiException("其它错误原因:" + e.getMessage(),e);
		}
		return list;
	}

	/**
	 * 用于查询单条记录
	 * 
	 * @Title: queryForMap
	 * @param sqlId
	 *            查询的SQL ID
	 * @param paramMap
	 *            查询的条件
	 * @return DataModel
	 */
	public DataModel queryForMap(String sqlId, Map paramMap){
		DataModel dataModel = new DataModel();
		try {
			List mapList = sqlMapClient.queryForList(sqlId, paramMap);
			int size = mapList.size();
			if (size > 1) {
				log.debug(sqlId + "---查询结果有" + size + "条记录,可能数据有错误");
				dataModel.setResultMap((HashMap) mapList.get(0));
				dataModel.setErrCode("0");
				dataModel.setErrMsg("成功");
			} else if (size < 1) {
				log.debug(sqlId + "--无该条记录");
				dataModel.setErrCode("2");
				dataModel.setErrMsg("无查询记录");
			} else {
				dataModel.setResultMap((HashMap) mapList.get(0));
				dataModel.setErrCode("0");
				dataModel.setErrMsg("成功");
			}
		} catch (SQLException se) {
			throw new BusiException("查询" + sqlId + "出错!原因:" + se.getMessage(),se);
		} catch (Exception e) {
			throw new BusiException("其它错误原因:" + e.getMessage(),e);
		}
		return dataModel;
	}

	/**
	 * 用于查询单条记录
	 * 
	 * @Title: queryForMap
	 * @param sqlId
	 *            查询的SQL ID
	 * @param id
	 *            查询的条件
	 * @return DataModel
	 */
	public DataModel queryForMap(String sqlId, String id){
		DataModel dataModel = new DataModel();
		try {
			List mapList = sqlMapClient.queryForList(sqlId, id);
			int size = mapList.size();
			if (size > 1) {
				log.debug(sqlId + "---查询结果有" + size + "条记录,可能数据有错误");
				dataModel.setResultMap((HashMap) mapList.get(0));
				dataModel.setErrCode("0");
				dataModel.setErrMsg("成功");
			} else if (size < 1) {
				log.debug(sqlId + "--无该条记录");
				dataModel.setErrCode("2");
				dataModel.setErrMsg("无查询记录");
			} else {
				dataModel.setResultMap((HashMap) mapList.get(0));
				dataModel.setErrCode("0");
				dataModel.setErrMsg("成功");
			}
		} catch (SQLException se) {
			throw new BusiException("查询" + sqlId + "出错!原因:" + se.getMessage(),se);
		} catch (Exception e) {
			throw new BusiException("其它错误原因:" + e.getMessage(),e);
		}
		return dataModel;
	}

	/**
	 * 用于查询某个条记录的某个属性,入参为HashMap类型
	 * 
	 * @Title: queryForValue
	 * @param sqlId
	 *            查询的SQL ID
	 * @param paramMap
	 *            查询的条件
	 * @return
	 */
	public DataModel queryForValue(String sqlId, Map paramMap){
		DataModel dataModel = new DataModel();
		try {
			List valueList = sqlMapClient.queryForList(sqlId, paramMap);
			int size = valueList.size();
			if (size > 1) {
				log.debug(sqlId + "---查询结果有" + size + "条记录,可能数据有错误");
				dataModel.setValue((String) valueList.get(0));
				dataModel.setErrCode("0");
				dataModel.setErrMsg("结果有" + size + "条记录");
			} else if (size < 1) {
				log.debug(sqlId + "--无该条记录");
				dataModel.setErrCode("1");
				dataModel.setErrMsg("失败,无记录");
			} else {
				dataModel.setValue((String) valueList.get(0));
				dataModel.setErrCode("0");
				dataModel.setErrMsg("成功");
			}
		} catch (SQLException se) {
			throw new BusiException("查询" + sqlId + "出错!原因:" + se.getMessage(),se);
		} catch (Exception e) {
			throw new BusiException("其它错误原因:" + e.getMessage(),e);
		}
		return dataModel;
	}

	/**
	 * 用于查询某个条记录的某个属性,入参为HashMap类型
	 * 
	 * @Title: queryForValue
	 * @param sqlId
	 *            查询的SQL ID
	 * @param paramMap
	 *            查询的条件
	 * @returnType 指示返回值的类型
	 * 
	 * @return String
	 */
	public String queryForValue(String sqlId, HashMap paramMap,String returnType){
		String value="";
		try {
			List valueList = sqlMapClient.queryForList(sqlId, paramMap);
			int size = valueList.size();
			if (size > 1) {
				log.debug(sqlId + "---查询结果有" + size + "条记录,可能数据有错误");
				value=(String) valueList.get(0);
			} else if (size < 1) {
				log.debug(sqlId + "--无该条记录");
			} else {
				value=(String) valueList.get(0);
			}
		} catch (SQLException se) {
			throw new BusiException("查询" + sqlId + "出错!原因:" + se.getMessage());
		} catch (Exception e) {
			throw new BusiException("其它错误原因:" + e.getMessage());
		}
		return value;
	}

	/**
	 * 用于查询某个条记录的某个属性,入参为HashMap类型
	 * 
	 * @Title: queryForValue
	 * @param sqlId
	 *            查询的SQL ID
	 * @param paramMap
	 *            查询的条件
	 * @returnType 指示返回值的类型
	 * 
	 * @return int
	 */
	public int queryForValue(String sqlId, HashMap paramMap,int returnType){
		int value=0;
		try {
			value = Integer.parseInt(String.valueOf(sqlMapClient
					.queryForObject(sqlId, paramMap)));
		} catch (SQLException se) {
			throw new BusiException("查询" + sqlId + "出错!原因:" + se.getMessage());
		} catch (Exception e) {
			throw new BusiException("其它错误原因:" + e.getMessage());
		}
		return value;
	}
	
	/**
	 * 用于查询某个条记录的某个属性,入参为String类型
	 * 
	 * @Title: queryForValue
	 * @param sqlId
	 *            查询的SQL ID
	 * @param id
	 *            查询主键
	 * @return
	 */
	public DataModel queryForValue(String sqlId, String id){
		DataModel dataModel = new DataModel();
		try {
			List valueList = sqlMapClient.queryForList(sqlId, id);
			int size = valueList.size();
			if (size > 1) {
				log.debug(sqlId + "---查询结果有" + size + "条记录,可能数据有错误");
				dataModel.setValue((String) valueList.get(0));
				dataModel.setErrCode("0");
				dataModel.setErrMsg("结果有" + size + "条记录");
			} else if (size < 1) {
				log.debug(sqlId + "--无该条记录");
				dataModel.setErrCode("1");
				dataModel.setErrMsg("失败,无记录");
			} else {
				dataModel.setValue((String) valueList.get(0));
				dataModel.setErrCode("0");
				dataModel.setErrMsg("成功");
			}
		} catch (SQLException se) {
			throw new BusiException("查询" + sqlId + "出错!原因:" + se.getMessage(),se);
		} catch (Exception e) {
			throw new BusiException("其它错误原因:" + e.getMessage(),e);
		}
		return dataModel;
	}

	/**
	 * 插入一条数据
	 * 
	 * @Title: insertSqlStatement
	 * @Description: TODO
	 * @param @param sqlId 插入语句的SQL ID
	 * @param @param projectMap 插入语句的数据
	 * @param @return
	 * @return HashMap
	 * @throws
	 */
	public DataModel insertSqlStatement(String sqlId, Map operMap){
		DataModel dataModel = new DataModel();
		try {
			Object obj = this.getSqlMapClient().insert(sqlId, operMap);
			if (obj != null) {
				int s = Integer.parseInt(obj.toString());
				if (s == 0) {
					dataModel.setErrCode("1");
					dataModel.setErrMsg("插入数据失败!");
				} else {
					dataModel.setValue(String.valueOf(s));
					dataModel.setErrCode("0");
					dataModel.setErrMsg("成功");
				}
			} else {
				dataModel.setErrCode("0");
				dataModel.setErrMsg("成功");
			}
		} catch (SQLException se) {
			throw new BusiException("插入数据" + sqlId + "出错!原因:" + se.getMessage(),se);
		} catch (Exception e) {
			throw new BusiException("其它错误原因:" + e.getMessage(),e);
		}
		return dataModel;
	}
    
	/**
	 * 插入一条数据
	 * 
	 * @Title: insertSqlStatement
	 * @Description: TODO
	 * @param @param sqlId 插入语句的SQL ID
	 * @param @param po 插入语句的数据
	 * @param @return
	 * @return HashMap
	 * @throws
	 */
	public DataModel insertSqlStatement(String sqlId,  BasePO po){
		DataModel dataModel = new DataModel();
		try {
			Object obj = this.getSqlMapClient().insert(sqlId, po);
			if (obj != null) {
				int s = Integer.parseInt(obj.toString());
				if (s == 0) {
					dataModel.setErrCode("1");
					dataModel.setErrMsg("失败");
				} else {
					dataModel.setValue(String.valueOf(s));
					dataModel.setErrCode("0");
					dataModel.setErrMsg("成功");
				}
			} else {
				dataModel.setErrCode("0");
				dataModel.setErrMsg("成功");
			}
		} catch (SQLException se) {
			throw new BusiException("插入数据" + sqlId + "出错!原因:" + se.getMessage(),se);
		} catch (Exception e) {
			throw new BusiException("其它错误原因:" + e.getMessage(),e);
		}
		return dataModel;
	}
	
	/**
	 * 批量插入一组事务语句
	 * 
	 * @Title: insertSqlStatement
	 * @Description: TODO
	 * @param @param sqlId 查询SQLID的数组
	 * @param @param mapList 对应的条件List
	 * @param @return
	 * @return DataModel
	 * @throws
	 */
	public DataModel insertSqlStatement(String[] sqlId, List mapList){
		DataModel dataModel = new DataModel();
		try {
			this.getSqlMapClient().startTransaction();
			for (int i = 0; i < sqlId.length; i++) {
				this.getSqlMapClient().insert(sqlId[i],
						(HashMap) mapList.get(i));
			}
			this.getSqlMapClient().commitTransaction();
			dataModel.setErrCode("0");
			dataModel.setErrMsg("成功");
		} catch (SQLException se) {
			throw new BusiException("多条插入" + sqlId + "出错!原因:" + se.getMessage(),se);
		} catch (Exception e) {
			throw new BusiException("其它错误原因:" + e.getMessage(),e);
		} finally {
			try {
				this.getSqlMapClient().endTransaction();
			} catch (SQLException e) {
				throw new BusiException("结束事务异常:" + e.getMessage(),e);
			}
		}
		return dataModel;
	}

	/**
	 * 修改一条数据
	 * 
	 * @Title: updateSqlStatement
	 * @Description: TODO
	 * @param @param sqlId
	 * @param @param operMap
	 * @param @return
	 * @return HashMap
	 * @throws
	 */
	public DataModel updateSqlStatement(String sqlId, Map operMap){
		DataModel dataModel = new DataModel();
		try {
			int s = (Integer) this.getSqlMapClient().update(sqlId, operMap);
			if (s == 0) {
				dataModel.setErrCode("1");
				dataModel.setErrMsg("失败!未修改数据");
			} else {
				dataModel.setValue(String.valueOf(s));
				dataModel.setErrCode("0");
				dataModel.setErrMsg("成功");
			}
		} catch (SQLException se) {
			throw new BusiException("修改" + sqlId + "出错!原因:" + se.getMessage(),se);
		} catch (Exception e) {
			throw new BusiException("其它错误原因:" + e.getMessage(),e);
		}
		return dataModel;
	}
    
	
	/**
	 * 修改一条数据
	 * 
	 * @Title: updateSqlStatement
	 * @Description: TODO
	 * @param @param sqlId
	 * @param @param po
	 * @param @return
	 * @return HashMap
	 * @throws
	 */
	public DataModel updateSqlStatement(String sqlId, BasePO po){
		DataModel dataModel = new DataModel();
		try {
			int s = (Integer) this.getSqlMapClient().update(sqlId, po);
			if (s == 0) {
				dataModel.setErrCode("1");
				dataModel.setErrMsg("失败!未修改数据");
			} else {
				dataModel.setValue(String.valueOf(s));
				dataModel.setErrCode("0");
				dataModel.setErrMsg("成功");
			}
		} catch (SQLException se) {
			throw new BusiException("修改" + sqlId + "出错!原因:" + se.getMessage(),se);
		} catch (Exception e) {
			throw new BusiException("其它错误原因:" + e.getMessage(),e);
		}
		return dataModel;
	}
	
	/**
	 * 删除一条数据
	 * 
	 * @Title: deleteSqlStatement
	 * @Description: TODO
	 * @param @param sqlId
	 * @param @param operMap
	 * @param @return
	 * @return HashMap
	 * @throws
	 */
	public DataModel deleteSqlStatement(String sqlId, BasePO po){
		DataModel dataModel = new DataModel();
		try {
			int s = (Integer) this.getSqlMapClient().delete(sqlId, po);
			if (s == 0) {
				dataModel.setErrCode("0");
				dataModel.setErrMsg("未删除数据");
			} else {
				dataModel.setValue(String.valueOf(s));
				dataModel.setErrCode("0");
				dataModel.setErrMsg("成功");
			}
		} catch (SQLException se) {
			throw new BusiException("删除" + sqlId + "出错!原因:" + se.getMessage(),se);
		} catch (Exception e) {
			throw new BusiException("其它错误原因:" + e.getMessage(),e);
		}
		return dataModel;
	}
    
	/**
	 * 删除一条数据
	 * 
	 * @Title: deleteSqlStatement
	 * @Description: TODO
	 * @param @param sqlId
	 * @param @param operMap
	 * @param @return
	 * @return HashMap
	 * @throws
	 */
	public DataModel deleteSqlStatement(String sqlId, Map operMap){
		DataModel dataModel = new DataModel();
		try {
			int s = (Integer) this.getSqlMapClient().delete(sqlId, operMap);
			if (s == 0) {
				dataModel.setErrCode("1");
				dataModel.setErrMsg("失败!未删除数据");
			} else {
				dataModel.setValue(String.valueOf(s));
				dataModel.setErrCode("0");
				dataModel.setErrMsg("成功");
			}
		} catch (SQLException se) {
			throw new BusiException("删除" + sqlId + "出错!原因:" + se.getMessage(),se);
		} catch (Exception e) {
			throw new BusiException("其它错误原因:" + e.getMessage(),e);
		}
		return dataModel;
	}
	
	/**
	 * 执行存储过程
	 * 
	 * @Title: procedureSqlStatement
	 * @Description: TODO
	 * @param @param sqlId
	 * @param @param operMap
	 * @param @return
	 * @return DataModel
	 * @throws
	 */
	public Map procedureSqlStatement(String sqlId, Map operMap){
		try {
			/*
			 *获得ibatis查询条件，用于记录插入日志用 
			 */
			String sql = this.getSql(sqlId, operMap);  
			
			this.getSqlMapClient().insert(sqlId, operMap);
			operMap.put("sql", sql);
		} catch (SQLException se) {
			throw new BusiException("执行存储过程" + sqlId + "出错!原因:" + se.getMessage(),se);
		} catch (Exception e) {
			throw new BusiException("其它错误原因:" + e.getMessage(),e);
		}
		return operMap;
	}
	
	private String getSql(String sqlIdForList, Map paramMap){
		String sqlStr = "";  
		/**获取隐身对象*/  
        MappedStatement stmt = ((SqlMapClientImpl) sqlMapClient).getMappedStatement(sqlIdForList);   
        Sql sql = stmt.getSql();  
        /**获取规则*/  
        SessionScope sessionScope = new SessionScope();     
        sessionScope.incrementRequestStackDepth();     
        StatementScope statementScope = new StatementScope(sessionScope);     
        stmt.initRequest(statementScope);     
        /**获取sql映射对象*/  
        sqlStr = sql.getSql(statementScope, paramMap);   
        return sqlStr;
	}

}