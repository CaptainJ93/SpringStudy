package com.best1.api.mq.weixin.client;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.best1.api.entity.crm.TcrmCustomermessage;
import com.best1.api.entity.oaf.order.CustomerOrderPayment;
import com.best1.api.mq.rabbit.MQProducer;
import com.best1.api.mq.weixin.bean.TemplateData;
import com.best1.api.mq.weixin.bean.WxTemplate;
import com.best1.api.mq.weixin.bean.msgbean;
import com.best1.api.mq.weixin.service.SmsManageSerevice;
import com.best1.api.mq.weixin.util.HttpRequestUtil;
import com.best1.api.mq.weixin.util.WeixinConstants;
import com.best1.api.service.cmn.RedisCacheUtilService;
import com.best1.api.utils.APIConstant;
import com.best1.api.utils.DateUtil;
import com.best1.api.utils.ShortUrlGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class MsgSend {
	private static Logger logger = LoggerFactory.getLogger(MsgSend.class);

	@Value("${sms.url}")
	private String url;

	@Value("${sms.sname}")
	private String sname;

	@Value("${sms.spwd}")
	private String spwd;
	@Value("${sms.scorpid}")
	private String scorpid;
	@Value("${sms.sprdid}")
	private String sprdid;

	@Value("${sms.templet}")
	private String templet;

	public String access_token = null;
	@Value("${weixin.gettoken}")
	public String gettoken = "https://qyapi.weixin.qq.com/cgi-bin/gettoken?";
	@Value("${weixin.send}")
	public String sendurl = "https://qyapi.weixin.qq.com/cgi-bin/message/send?access_token=";

	@Value("${weixin.corpid}")
	public String corpid = "wx02405a18b644aee1";

	@Value("${weixin.corpsecret}")
	public String corpsecret = "XBLaGRkabukxlX3u2sxZHB1qresX7FxPbMOMl3eZ7bDFaYzGuuQVHeAVxbznCuLm";

	@Value("${weixin.party}")
	public String party = "20";

	@Value("${weixin.agentid}")
	public String agentid = "wx02405a18b644aee1";

	@Value("${weixin.safe}")
	public String safe = "0";

	@Value("${weixin.grant_type}")
	public String grant_type = "client_credential";
	@Value("${weixin.messagetoken}")
	public String messagetoken = "https://api.weixin.qq.com/cgi-bin/token?";
	@Value("${weixin.appid}")
	public String appid;
	@Value("${weixin.secret}")
	public String secret;
	@Value("${weixin.messag_template_send}")
	public String messag_template_send = "https://api.weixin.qq.com/cgi-bin/message/template/send?access_token=";
	@Value("${weixin.messag_tempalte_title}")
	public String messag_tempalte_title;
	@Value("${weixin.template_id}")
	public String template_id;
	@Value("${weixin.template_url}")
	public String template_url;

	@Value("${weixin.messag_tempalte_remark}")
	public String tempalte_remark;

	@Value("${sms.alipay}")
	public String sms_alipay;

	@Value("${sms.weixinpay}")
	public String sms_weixinpay;

	@Value("${sms.paymessage}")
	private String sms_paymessage;
	
	@Value("${sms.paycodeurl}")
	public String sms_pay_codeurl;
	
	@Value("${sms.keytimeout}")
	public int sms_key_timeout;

	@Autowired
	private SmsManageSerevice smsManageSerevice;

	@Autowired
	private MQProducer mqsend;

	@Autowired
	private RedisCacheUtilService redis;
	
	public void sendCustomerSmsPay(TcrmCustomermessage message) {
		logger.info("发送通知支付");

		if (message != null) {
			try {
				String template_Pay_Url = "";
				String productstr = "";
				double paymentamount = 0;
				int i = 0;
				if (message.getValueid() != null) {

					List<CustomerOrderPayment> customerorders = smsManageSerevice
							.customerOrderPay(message.getCustomerid(),
									message.getValueid());
					if (customerorders.size() > 0) {
						for (CustomerOrderPayment custtomerorder : customerorders) {
							if (i == 0) {
								productstr += custtomerorder.getProductname();
							}
							paymentamount += custtomerorder.getPaymentamount();
							i++;
						}

					}
					String orderId_url = message.getValueid() + "";
					if (message.getMessagetype() == APIConstant.MESSAGE_TYPE_SMS_WEIXINPAY) {
						template_Pay_Url = sms_weixinpay + orderId_url;
					}
					if (message.getMessagetype() == APIConstant.MESSAGE_TYPE_SMS_ALIPAY) {
						template_Pay_Url = sms_alipay + orderId_url;
					}
					
					String url_code=ShortUrlGenerator.getRandomString(6);
					String url_encrypt=(String)redis.getCacheObject(url_code);
					while(!StringUtils.isBlank(url_encrypt))
					{   url_code="";
						url_code=ShortUrlGenerator.getRandomString(6);
						url_encrypt=(String)redis.getCacheObject(url_code);
					}
					logger.info("加密码:"+url_code);
					redis.setCacheObject(url_code, template_Pay_Url);
					redis.setExpire(url_code, sms_key_timeout);
					String pay_code_usrl=sms_pay_codeurl+url_code;
					
					logger.info("加密URL:"+pay_code_usrl);
					Object [] array = new Object[]{productstr,paymentamount,pay_code_usrl};     
					String Pay_Message = MessageFormat.format(sms_paymessage,array);
					message.setMessage(Pay_Message);
					mqsend.sendDataToQueue("MESSAGE_SMS_SEND_KEY", message);

				}

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void sendTexCustomermessage(List<TcrmCustomermessage> smslist) {
		logger.info("发送信息");

		if (smslist.size() > 0) {
			try {
				do {
					access_token = weixinToken(corpsecret);

				} while (access_token == null);

				for (TcrmCustomermessage smsstr : smslist) {
					HashMap<String, String> text = new HashMap<String, String>();
					text.put("content", smsstr.getMessage());
					msgbean msg = new msgbean();
					msg.setToparty(party);
					msg.setMsgtype(WeixinConstants.MSGTYPE_TEXT);
					msg.setAgentid("wx02405a18b644aee1");
					// msg.setSafe("0");
					msg.setText(text);
					this.sendWeixinMeg(msg, access_token);
				}
				access_token = null;

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void sendTexCustomermessage(TcrmCustomermessage message) {
		logger.info("发送企业信息");

		if (message != null) {
			try {
				do {
					access_token = weixinToken(corpsecret);

				} while (access_token == null);

				logger.info(message.getMessage());
				HashMap<String, String> text = new HashMap<String, String>();
				text.put("content", message.getMessage());
				msgbean msg = new msgbean();
				// msg.setTouser("@all");
				msg.setToparty(party);
				msg.setMsgtype(WeixinConstants.MSGTYPE_TEXT);
				msg.setAgentid(agentid);
				msg.setSafe(safe);
				msg.setText(text);
				this.sendWeixinMeg(msg, access_token);

				access_token = null;

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void getDepartment() {
		logger.info("获取企业组");

		try {
			do {
				access_token = weixinToken(corpsecret);

			} while (access_token == null);

			this.sendWeixinDepartment(access_token);

			access_token = null;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void sendCustomerTemplatemessage(TcrmCustomermessage message) {
		logger.info("发送支付通知信息");

		if (message != null) {
			try {
				do {
					access_token = weixinMessageToken();
				} while (access_token == null);

				if (message.getValueid() != null) {
					List<CustomerOrderPayment> customerorders = smsManageSerevice
							.customerOrderPay(message.getCustomerid(),
									message.getValueid());
					if (customerorders.size() > 0) {
						WxTemplate tempmsg = new WxTemplate();
						String orderId_url = message.getValueid() + "";
						String template_Pay_Url = template_url + orderId_url;
						tempmsg.setUrl(template_Pay_Url);
						tempmsg.setTouser(message.getTargetobj());
						tempmsg.setTopcolor("#FF0000");
						tempmsg.setTemplate_id(template_id);
						Map<String, TemplateData> m = new HashMap<String, TemplateData>();

						TemplateData first = new TemplateData();
						first.setColor("#173177");
						first.setValue(messag_tempalte_title);
						m.put("first", first);

						DecimalFormat df = new DecimalFormat("######0.00");
						String productstr = "";
						double paymentamount = 0;
						int quantityint = 0;
						String createdtimestamp = "";
						String expiryDate = "";

						for (CustomerOrderPayment custtomerorder : customerorders) {

							productstr += custtomerorder.getProductname()
									+ "\n";

							paymentamount += custtomerorder.getPaymentamount();
							quantityint++;
							createdtimestamp = DateUtil
									.formatDate(custtomerorder
											.getCreatedtimestamp());
							expiryDate = DateUtil.formatDate(DateUtil
									.getDateADDDay(custtomerorder
											.getCreatedtimestamp(), 7));

						}

						TemplateData product = new TemplateData();
						product.setColor("#173177");
						product.setValue(productstr);
						// m.put("product", product);
						m.put("keyword1", product);

						TemplateData price = new TemplateData();
						price.setColor("#173177");
						price.setValue(df.format(paymentamount)); // 订单金额
						// m.put("price", price);
						m.put("keyword2", price);

						TemplateData orderid = new TemplateData();
						orderid.setColor("#173177");
						orderid.setValue(message.getValueid() + "");
						m.put("keyword3", orderid);

						TemplateData orderCreatedtimestamp = new TemplateData();
						orderCreatedtimestamp.setColor("#173177");
						orderCreatedtimestamp.setValue(createdtimestamp); // 订单数量
						m.put("keyword4", orderCreatedtimestamp);

						TemplateData expiryDateKey = new TemplateData();
						expiryDateKey.setColor("#173177");
						expiryDateKey.setValue(expiryDate); // 订单数量
						m.put("keyword5", expiryDateKey);

						/**
						 * TemplateData quantity = new TemplateData();
						 * quantity.setColor("#173177");
						 * quantity.setValue(quantityint+""); // 订单数量
						 * m.put("keyword3", quantity);
						 **/

						TemplateData remark = new TemplateData();
						remark.setColor("#173177");
						remark.setValue(tempalte_remark);
						m.put("remark", remark);

						tempmsg.setData(m);

						this.sendWeixinTempMeg(tempmsg, access_token);
					}
				}

				access_token = null;

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void sendCustomerTemplatemessage(List<TcrmCustomermessage> smslist) {
		logger.info("发送支付通知信息");

		if (smslist.size() > 0) {
			try {
				do {
					access_token = weixinMessageToken();

				} while (access_token == null);

				for (TcrmCustomermessage smsstr : smslist) {
					logger.info("发送支付内容");
					if (smsstr.getValueid() != null) {
						List<CustomerOrderPayment> customerorders = smsManageSerevice
								.customerOrderPay(smsstr.getCustomerid(),
										smsstr.getValueid());

						if (customerorders.size() > 0) {
							WxTemplate tempmsg = new WxTemplate();
							tempmsg.setUrl(template_url);
							tempmsg.setTouser(smsstr.getTargetobj());
							tempmsg.setTopcolor("#FF0000");
							tempmsg.setTemplate_id(template_id);
							Map<String, TemplateData> m = new HashMap<String, TemplateData>();

							/**
							 * TemplateData customer = new TemplateData();
							 * customer.setColor("#173177");
							 * customer.setValue("胡文华"); m.put("customer",
							 * customer);
							 * */
							TemplateData orderid = new TemplateData();
							orderid.setColor("#173177");
							orderid.setValue(smsstr.getValueid() + "");
							m.put("orderid", orderid);

							String productstr = "";
							double paymentamount = 0;

							for (CustomerOrderPayment custtomerorder : customerorders) {

								productstr += custtomerorder.getProductname()
										+ "\n";

								paymentamount += custtomerorder
										.getPaymentamount();

							}

							TemplateData product = new TemplateData();
							product.setColor("#173177");
							product.setValue(productstr);
							m.put("product", product);

							TemplateData price = new TemplateData();
							price.setColor("#173177");
							price.setValue(paymentamount + ""); // 订单金额
							m.put("price", price);

							TemplateData remark = new TemplateData();
							remark.setColor("#173177");
							remark.setValue(tempalte_remark);
							m.put("remark", remark);

							tempmsg.setData(m);

							this.sendWeixinTempMeg(tempmsg, access_token);
						}
					}
				}
				access_token = null;

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void industry(String access_token) {
		logger.info("发送行业数据");
		// String str="{\"industry_id1\":\"1\",\"industry_id2\":\"2\"}";
		// IIXR_0pcLjik-j2YVSYy1SAChwbrjnvC2hVqJOGshow"
		String str = "{\"template_id\":\"2Uc0JJzMTDOU59T9BU0FdbRwO-dAZnU1ZcwgiE0hpkU\",\"touser\":\"oskyRwUUOHLJjZUDmZUkSDxgBPxQ\",\"url\":\"www.best1.com\",\"topcolor\":\"#000000\",\"data\":{\"title\":{\"value\":\"好易购\",\"color\":\"#000000\"}}}";
		// https://api.weixin.qq.com/cgi-bin/message/template/send?access_token=ACCESS_TOKEN
		if (access_token != null) {
			// String requestUrl =
			// "https://api.weixin.qq.com/cgi-bin/template/api_set_industry?access_token="
			// + access_token;
			String requestUrl = "https://api.weixin.qq.com/cgi-bin/message/template/send?access_token="
					+ access_token;

			logger.info(requestUrl);

			String retrunstr = HttpRequestUtil.httpRequest(requestUrl, "POST",
					str);

			logger.info(retrunstr);
			System.out.println(retrunstr);
		}
	}

	private void sendWeixinDepartment(String access_token) throws Exception {
		ObjectMapper mapper = new ObjectMapper();

		if (access_token != null) {
			String requestUrl = "https://qyapi.weixin.qq.com/cgi-bin/department/list?access_token="
					+ access_token;
			String retrunstr = HttpRequestUtil.httpRequest(requestUrl, "POST",
					"");
			logger.info(retrunstr);
			System.out.println(retrunstr);

		} else {

		}

	}

	private void sendWeixinMeg(msgbean msg, String access_token)
			throws Exception {
		ObjectMapper mapper = new ObjectMapper();

		if (access_token != null) {
			String requestUrl = sendurl + access_token;
			String retrunstr = HttpRequestUtil.httpRequest(requestUrl, "POST",
					mapper.writeValueAsString(msg));
			logger.info(retrunstr);
			System.out.println(retrunstr);
			Map<String, String> response = mapper.readValue(retrunstr,
					Map.class);
			// String errcode = response.get("errcode");
			// String errmsg = response.get("errmsg");

		} else {

		}

	}

	private void sendWeixinTempMeg(WxTemplate tempmsg, String access_token)
			throws Exception {
		ObjectMapper mapper = new ObjectMapper();

		if (access_token != null) {
			String requestUrl = messag_template_send + access_token;
			String retrunstr = HttpRequestUtil.httpRequest(requestUrl, "POST",
					mapper.writeValueAsString(tempmsg));
			logger.info(retrunstr);
			Map<String, String> response = mapper.readValue(retrunstr,
					Map.class);
			// String errcode = response.get("errcode");
			// String errmsg = response.get("errmsg");

		} else {

		}

	}

	private String weixinToken(String corpsecret) throws Exception {
		ObjectMapper mapper = new ObjectMapper();

		String requestUrl = gettoken + "corpid=" + corpid + "&corpsecret="
				+ corpsecret;

		String retrunstr = HttpRequestUtil.httpRequest(requestUrl, "GET", "");
		logger.info(retrunstr);
		Map<String, String> response = mapper.readValue(retrunstr, Map.class);
		access_token = response.get("access_token");

		return access_token;
	}

	private String weixinMessageToken() throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		String requestUrl = messagetoken + "grant_type=" + grant_type
				+ "&appid=" + appid + "&secret=" + secret;
		logger.info(requestUrl);
		String retrunstr = HttpRequestUtil.httpRequest(requestUrl, "GET", "");
		logger.info(retrunstr);
		Map<String, String> response = mapper.readValue(retrunstr, Map.class);
		access_token = response.get("access_token");

		return access_token;
	}

	public void sendNoticeMessage(TcrmCustomermessage message) {
		logger.info("发送通知短信");

		if (message != null) {
			String infoMessage = message.getMessage();
			logger.info(message.getTargetobj());
			logger.info(infoMessage);
			try {
				String PostData = "sname=" + sname + "&spwd=" + spwd
						+ "&scorpid=" + scorpid + "&sprdid=" + sprdid
						+ "&sdst=" + message.getTargetobj() + "&smsg="
						+ java.net.URLEncoder.encode(infoMessage, "utf-8");

				HttpRequestUtil.smsServer(PostData, url + "/g_Submit");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void sendMassMessage(TcrmCustomermessage message) {
		logger.info("发送群发短信");

		if (message != null) {
		}

	}
}
