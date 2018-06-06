package com.best1.scm.modules.webapi.client;

import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.best1.scm.modules.common.Constant;
import com.best1.scm.modules.webapi.mapper.AliExpress;

/**
 * 快递公司API
 * 
 * @author jiashizhen
 *
 */
@Component
public class ExpressClient {

//	@Value("${api.client.trackingNumber.url}")
//	private String express100Url = "http://v.juhe.cn/exp/index";
//	@Value("${api.client.trackingNumber.app_key}")
//	private String express100AppKey;
//	@Value("${api.client.trackingNumber.result_type}")
//	private String express100ResultType;
//	@Value("${api.client.trackingNumber.order}")
//	private String express100Order;
//
//	@Autowired
//	RestTemplate restTemplate;
//
//	String host = "https://ali-deliver.showapi.com?com={com}&nu={nu}";
//	String path = "/showapi_expInfo";
//	String method = "GET";
//	String appcode = "4693723d372345288e1bc1bcf9ea4fb4";

	/*
	 * 获取快递100快递信息
	 */
	public AliExpress requestAPIAliExpress(String expressCompanyNo,
			String trackingNumber) {
		String host = "https://ali-deliver.showapi.com";
	    String path = "/showapi_expInfo";
	    String method = "GET";
	    String appcode = Constant.ExpressClient_appcode;
	    Map<String, String> headers = new HashMap<String, String>();
	    //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
	    headers.put("Authorization", "APPCODE " + appcode);
	    Map<String, String> querys = new HashMap<String, String>();
	    querys.put("com", expressCompanyNo);
	    querys.put("nu", trackingNumber);
	    AliExpress aliExpress = new AliExpress();

	    try {
	    	/**
	    	* 重要提示如下:
	    	* HttpUtils请从
	    	* https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/src/main/java/com/aliyun/api/gateway/demo/util/HttpUtils.java
	    	* 下载
	    	*
	    	* 相应的依赖请参照
	    	* https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/pom.xml
	    	*/
	    	HttpResponse response = HttpUtils.doGet(host, path, method, headers, querys);
	    	aliExpress = JSON.parseObject(EntityUtils.toString(response.getEntity()), AliExpress.class);
	    } catch (Exception e) {
	    	e.printStackTrace();
	    }
		return aliExpress;
	}
}
