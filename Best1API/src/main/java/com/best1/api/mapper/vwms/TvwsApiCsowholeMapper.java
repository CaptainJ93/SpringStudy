package com.best1.api.mapper.vwms;


import java.util.List;

import com.best1.api.entity.vwms.TvwsApiCsowhole;
import com.best1.api.mapper.SqlMapper;


@SqlMapper
public interface TvwsApiCsowholeMapper {
    
    int countByCsowhole (TvwsApiCsowhole csowhole);


    List<TvwsApiCsowhole> selectByCsowhole(TvwsApiCsowhole csowhole);

  
    
}