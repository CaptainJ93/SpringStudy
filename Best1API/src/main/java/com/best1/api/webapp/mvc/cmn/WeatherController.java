package com.best1.api.webapp.mvc.cmn;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.best1.api.entity.cmn.TcmnAreadetails;
import com.best1.api.mq.weather.bean.Weather;
import com.best1.api.mq.weixin.util.HttpRequestUtil;
import com.best1.api.service.cmn.WeatherService;
import com.best1.api.utils.MediaTypes;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class WeatherController {


	private static Logger logger = LoggerFactory
			.getLogger(WeatherController.class);
	@Value("${weather.url}")
	public String url = "http://restapi.amap.com/v3/weather/weatherInfo?";

	@Value("${weather.key}")
	public String key = "3b1dc0972a0df12cd1d5b01319f0e373";

	
	@Autowired
	private WeatherService weatherService;
	
	

	@RequestMapping(value = "/cmn/weather/get", produces = MediaTypes.JSON_UTF_8)
	public void  Weather() throws Exception {
		logger.info("天气信息");
		List<TcmnAreadetails> areas=weatherService.queryWeatherArea();
		for (TcmnAreadetails area:areas){
			//http://restapi.amap.com/v3/weather/weatherInfo?key=3b1dc0972a0df12cd1d5b01319f0e373&city=330102&extensions=all
			//String requestUrl=url+"key="+key+"&city="+area.getAdcode()+"&extensions=all";
			String parameter="key="+key+"&city="+area.getAdcode()+"&extensions=all";
			sendWeather(url,parameter);
		}
		
	}
	
	
	private void sendWeather(String requestUrl,String parameter)
			throws Exception {
		    logger.info(requestUrl);
		    ObjectMapper mapper = new ObjectMapper();
            String retrunstr = HttpRequestUtil.httpUrlRequest(requestUrl, "GET", parameter);
			logger.info(retrunstr);
			Weather weather = mapper.readValue(retrunstr,
					Weather.class);
			if(weather.getStatus()==1)
			weatherService.addWeather(weather);
			// String errcode = response.get("errcode");
			// String errmsg = response.get("errmsg");

		

	}
	
}
