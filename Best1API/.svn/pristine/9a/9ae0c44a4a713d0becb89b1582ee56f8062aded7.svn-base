package com.best1.api.service.cmn;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.data.redis.core.BoundSetOperations;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.ValueOperations;

public interface RedisCacheUtilService<T> {
	public <T> ValueOperations<String, T> setCacheObject(String key, T value);
	public boolean setExpire(String key,  long timeout);
	public <T> T getCacheObject(String key);
	public <T> ListOperations<String, T> setCacheList(String key,List<T> dataList);
	public <T> List<T> getCacheList(String key);
	public <T> BoundSetOperations<String, T> setCacheSet(String key,Set<T> dataSet);
	public Set<T> getCacheSet(String key);
	public <T> HashOperations<String, String, T> setCacheMap(String key,Map<String, T> dataMap);
	public <T> Map<String, T> getCacheMap(String key);
	public <T> HashOperations<String, Integer, T> setCacheIntegerMap(String key, Map<Integer, T> dataMap);
	public <T> Map<Integer, T> getCacheIntegerMap(String key);

}
