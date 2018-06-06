package com.best1.api.mapper.vwms;

import com.best1.api.entity.vwms.TvwsApiSuppliershiporder;
import com.best1.api.entity.vwms.TvwsApiSuppliershiporderExample;
import com.best1.api.mapper.SqlMapper;

import java.util.List;
@SqlMapper
public interface TvwsApiSuppliershiporderMapper {
  
    int countByExample(TvwsApiSuppliershiporderExample example);

    List<TvwsApiSuppliershiporder> selectByExample(TvwsApiSuppliershiporderExample example);

  
}