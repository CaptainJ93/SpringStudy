package com.best1.api.mapper.cmn;

import com.best1.api.entity.cmn.TcmnUser;
import com.best1.api.entity.cmn.TcmnUserExample;
import com.best1.api.mapper.SqlMapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
@SqlMapper
public interface TcmnUserMapper {


	int countByExample(TcmnUserExample example);

	int deleteByExample(TcmnUserExample example);

	
	int deleteByPrimaryKey(Long userid);

	
	int insert(TcmnUser record);

	
	int insertSelective(TcmnUser record);


	List<TcmnUser> selectByExample(TcmnUserExample example);

	
	TcmnUser selectByPrimaryKey(Long userid);
	
	TcmnUser selectByUserloginid(String userloginid);

	int updateByExampleSelective(@Param("record") TcmnUser record,
			@Param("example") TcmnUserExample example);

	int updateByExample(@Param("record") TcmnUser record,
			@Param("example") TcmnUserExample example);

	
	int updateByPrimaryKeySelective(TcmnUser record);

	int updateByPrimaryKey(TcmnUser record);
}