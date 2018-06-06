package com.best1.scm.modules.irpeort.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CSOMianDanSenderInfo {
	@Value("#{APP_PROP['csomiandan.sender-zipcode']}")
	private String senderZipcode;
	@Value("#{APP_PROP['csomiandan.sender-address']}")
	private String senderAddress;
	@Value("#{APP_PROP['csomiandan.sender-tel']}")
	private String senderTelephone;
	@Value("#{APP_PROP['csomiandan.sender']}")
	private String sender;

	public String getSenderZipcode() {
		return senderZipcode;
	}

	public void setSenderZipcode(String senderZipcode) {
		this.senderZipcode = senderZipcode;
	}

	public String getSenderAddress() {
		return senderAddress;
	}

	public void setSenderAddress(String senderAddress) {
		this.senderAddress = senderAddress;
	}

	public String getSenderTelephone() {
		return senderTelephone;
	}

	public void setSenderTelephone(String senderTelephone) {
		this.senderTelephone = senderTelephone;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

}
