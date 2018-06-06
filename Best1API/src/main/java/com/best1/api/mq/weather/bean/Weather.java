package com.best1.api.mq.weather.bean;
import java.util.List;
public class Weather {
private int status;

private int count;

private String info;

private String infocode;

private  List<Forecasts> forecasts;

public int getStatus() {
	return status;
}

public void setStatus(int status) {
	this.status = status;
}

public int getCount() {
	return count;
}

public void setCount(int count) {
	this.count = count;
}

public String getInfo() {
	return info;
}

public void setInfo(String info) {
	this.info = info;
}

public String getInfocode() {
	return infocode;
}

public void setInfocode(String infocode) {
	this.infocode = infocode;
}

public List<Forecasts> getForecasts() {
	return forecasts;
}

public void setForecasts(List<Forecasts> forecasts) {
	this.forecasts = forecasts;
}





}
