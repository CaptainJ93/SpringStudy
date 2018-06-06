package com.best1.api.mapper.chm;



import com.best1.api.mapper.SqlMapper;

import java.util.List;
import java.util.Map;

import com.best1.api.entity.chm.Programdetail;
/**
 *  
 * This method corresponds to the database table TCRM_CUSTOMERADDRESS


 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * 
 *
 */
@SqlMapper
public interface PgmProductInfoMapper {
	  /**节目信息**/
    void  pgmInfo(Map<String,Object> param);
    
    List<Programdetail>  programDetailInfo(Programdetail  programdetail);
   
    List<Programdetail>  livenfmProgproductInfo(Programdetail  programdetail);
    
}
