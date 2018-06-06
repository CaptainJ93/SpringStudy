package com.best1.api.mapper.cmn;

import com.best1.api.entity.cmn.TcmnAreadetails;
import com.best1.api.entity.cmn.TcmnAreadetailsExample;
import com.best1.api.mapper.SqlMapper;

import java.util.List;


@SqlMapper
public interface TcmnAreadetailsMapper {


    List<TcmnAreadetails> selectByExample(TcmnAreadetailsExample example);

   
}