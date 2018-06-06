package com.best1.api.mapper.view;

import java.util.List;

import com.best1.api.entity.view.ReturnToVenderView;
import com.best1.api.mapper.SqlMapper;

@SqlMapper
public interface ReturnToVenderViewMapper {
	List<ReturnToVenderView> fetchReturnToVenders(ReturnToVenderView record);
}
