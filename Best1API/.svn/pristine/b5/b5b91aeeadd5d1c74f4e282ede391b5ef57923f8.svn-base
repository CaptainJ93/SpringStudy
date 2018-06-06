package com.best1.api.mapper.scm;

import com.best1.api.entity.scm.supplier.TscmSuppliercontract;
import com.best1.api.entity.scm.supplier.TscmSuppliercontractExample;
import com.best1.api.mapper.SqlMapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
@SqlMapper
public interface TscmSuppliercontractMapper {
  
    int countByExample(TscmSuppliercontractExample example);

 
    int deleteByExample(TscmSuppliercontractExample example);

    int deleteByPrimaryKey(Long contractno);


    int insert(TscmSuppliercontract record);

    int insertSelective(TscmSuppliercontract record);

   
    List<TscmSuppliercontract> selectByExample(TscmSuppliercontractExample example);

    
    TscmSuppliercontract selectByPrimaryKey(Long contractno);

  
    int updateByExampleSelective(@Param("record") TscmSuppliercontract record, @Param("example") TscmSuppliercontractExample example);

   
    int updateByExample(@Param("record") TscmSuppliercontract record, @Param("example") TscmSuppliercontractExample example);

 
    int updateByPrimaryKeySelective(TscmSuppliercontract record);

   
    int updateByPrimaryKey(TscmSuppliercontract record);
}