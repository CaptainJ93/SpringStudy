package com.best1.api.mapper.vwms;

import com.best1.api.entity.vwms.TvwsApiSuppliershipconfirm;
import com.best1.api.entity.vwms.TvwsApiSuppliershipconfirmExample;
import com.best1.api.mapper.SqlMapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
@SqlMapper
public interface TvwsApiSuppliershipconfirmMapper {


	int countByExample(TvwsApiSuppliershipconfirmExample example);


	int deleteByExample(TvwsApiSuppliershipconfirmExample example);

	int insertSelective(TvwsApiSuppliershipconfirm record);

	List<TvwsApiSuppliershipconfirm> selectByExample(
			TvwsApiSuppliershipconfirmExample example);

	int updateByExampleSelective(
			@Param("record") TvwsApiSuppliershipconfirm record,
			@Param("example") TvwsApiSuppliershipconfirmExample example);

	
}