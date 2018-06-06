package com.best1.api.mapper.scm;

import com.best1.api.entity.scm.supplier.TscmSuppliermaster;
import com.best1.api.entity.scm.supplier.TscmSuppliermasterExample;
import com.best1.api.mapper.SqlMapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
@SqlMapper
public interface TscmSuppliermasterMapper {
 
    int countByExample(TscmSuppliermasterExample example);

  
    int deleteByExample(TscmSuppliermasterExample example);

  
    int deleteByPrimaryKey(Long supplierid);

    int insert(TscmSuppliermaster record);

    int insertSelective(TscmSuppliermaster record);

   
    List<TscmSuppliermaster> selectByExample(TscmSuppliermasterExample example);

   
    TscmSuppliermaster selectByPrimaryKey(Long supplierid);

   
    int updateByExampleSelective(@Param("record") TscmSuppliermaster record, @Param("example") TscmSuppliermasterExample example);

  
    int updateByExample(@Param("record") TscmSuppliermaster record, @Param("example") TscmSuppliermasterExample example);

   
    int updateByPrimaryKeySelective(TscmSuppliermaster record);

   
    int updateByPrimaryKey(TscmSuppliermaster record);
}