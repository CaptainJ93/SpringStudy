package com.best1.api.service.cmn.impl;

import java.text.ParseException;
import java.util.List;

import org.javasimon.aop.Monitored;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.best1.api.entity.cmn.TcmnAreadetails;
import com.best1.api.entity.cmn.TcmnAreadetailsExample;
import com.best1.api.entity.cmn.TcmnWeather;
import com.best1.api.mapper.cmn.TcmnAreadetailsMapper;
import com.best1.api.mapper.cmn.TcmnWeatherMapper;
import com.best1.api.mq.weather.bean.Casts;
import com.best1.api.mq.weather.bean.Forecasts;
import com.best1.api.mq.weather.bean.Weather;
import com.best1.api.service.cmn.WeatherService;
import com.best1.api.utils.DateUtil;

@Component
@Transactional
@Monitored
public class WeatherServiceImpl implements WeatherService {
	private static Logger logger = LoggerFactory
			.getLogger(WeatherServiceImpl.class);
	@Autowired
	private TcmnWeatherMapper weatherDAO;
	
	@Autowired
	private TcmnAreadetailsMapper areadetailsDAO;
	@Override
	public List<TcmnAreadetails> queryWeatherArea() {
		TcmnAreadetailsExample example =new TcmnAreadetailsExample();
		TcmnAreadetailsExample.Criteria criteria=example.createCriteria();
		criteria.andAppcodeEqualTo(1000);
		return  areadetailsDAO.selectByExample(example);
		
	}

	
	@Override
	public void addWeather(Weather weather) {
        List<Forecasts>forecasts=weather.getForecasts();
        
        for( Forecasts forecast:forecasts)
        {	List<Casts> catts=forecast.getCasts();
		for(Casts catt:catts){
			TcmnWeather weatherinfo=new TcmnWeather();	
			weatherinfo.setCity(forecast.getCity());
			weatherinfo.setAdcode(forecast.getAdcode());
			weatherinfo.setProvince(forecast.getProvince());
		System.out.println(forecast.getReporttime());
		System.out.println(catt.getDate().trim());
			try {
				weatherinfo.setReporttime(DateUtil.parse(forecast.getReporttime().trim()));
				weatherinfo.setDateweather(DateUtil.parseyyymmdd(catt.getDate().trim()));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			weatherinfo.setWeek(catt.getWeek());
			weatherinfo.setDayweather(catt.getDayweather());
			weatherinfo.setNightweather(catt.getNightweather());
			weatherinfo.setDaytemp(catt.getDaytemp());
			weatherinfo.setNighttemp(catt.getNighttemp());
			weatherinfo.setDaywind(catt.getDaywind());
			weatherinfo.setNightwind(catt.getNightwind());
			weatherinfo.setDaypower(catt.getDaypower());
			weatherinfo.setNightpower(catt.getNightpower());
			weatherinfo.setCreatedtimestamp(DateUtil.getTodayTime());
			weatherDAO.insertSelective(weatherinfo);
			
		}
        }
		
	}

}
