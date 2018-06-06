package com.best1.api.utils;

import java.net.MalformedURLException;
import java.rmi.RemoteException;

import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.ser.BeanDeserializerFactory;
import org.apache.axis.encoding.ser.BeanSerializerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConnectET1Util {
	private static final Logger log = LoggerFactory
			.getLogger(ConnectET1Util.class);
	

	public static String erpReturnResult(String erpwsurl,String apiType, String WSType,String beanName,
			Object classType, Object objType) throws RemoteException,
			MalformedURLException, ServiceException {
		log.info("connect  begin!");

		Service service = new Service();
		Call call = (Call) service.createCall();

		QName qn = new QName("urn:BeanService", beanName);
		call.registerTypeMapping(classType.getClass(), qn,
				new BeanSerializerFactory(classType.getClass(), qn),
				new BeanDeserializerFactory(classType.getClass(), qn));
		String wsdlUrl = erpwsurl + WSType + "?wsdl";
		String nameSpaceUri = erpwsurl + WSType;

		QName getDescQn = new QName(nameSpaceUri, apiType);
		call.setOperationName(getDescQn);
		call.setTargetEndpointAddress(new java.net.URL(wsdlUrl));

		String retk = (String) call.invoke(new Object[] { objType });
		log.info("connect  end!"+retk);
		return retk;

	}

}
