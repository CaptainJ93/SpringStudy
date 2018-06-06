package com.best1.api.service.vwms;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.best1.api.entity.oaf.order.ToafOrderinvoiceinfo;
import com.best1.api.entity.vwms.TvwsApiCsowholeConfirm;
import com.best1.api.entity.vwms.TvwsApiCsowholeConfirmExample;
import com.best1.api.entity.vwms.TvwsApiProductinventory;
import com.best1.api.entity.vwms.TvwsApiProductinventoryExample;
import com.best1.api.entity.vwms.TvwsApiReturnorderconfirm;
import com.best1.api.entity.vwms.TvwsApiReturnorderconfirmExample;
import com.best1.api.entity.vwms.TvwsApiRtvconfirm;
import com.best1.api.entity.vwms.TvwsApiRtvconfirmExample;
import com.best1.api.entity.vwms.TvwsApiSuppliershipconfirm;
import com.best1.api.entity.vwms.TvwsApiSuppliershipconfirmExample;
import com.best1.api.entity.vwms.TvwsApiWhtransferodconfirm;
import com.best1.api.webservice.soap.response.dto.vwms.CsowholeConfirmDTO;
import com.best1.api.webservice.soap.response.dto.vwms.OrderinvoiceinfoDTO;
import com.best1.api.webservice.soap.response.dto.vwms.ProductinventoryDTO;
import com.best1.api.webservice.soap.response.dto.vwms.ReturnorderconfirmDTO;
import com.best1.api.webservice.soap.response.dto.vwms.RtvconfirmDTO;
import com.best1.api.webservice.soap.response.dto.vwms.SuppliershipconfirmDTO;
import com.best1.api.webservice.soap.response.dto.vwms.WhtransferodconfirmDTO;


public interface VwmsInputService {
	
	OrderinvoiceinfoDTO modifyOrderInvoiceno(ToafOrderinvoiceinfo orderinvoiceinfo);
	
	CsowholeConfirmDTO  modifyShippingConfirmed(TvwsApiCsowholeConfirm csoConfirmed);
	
	ProductinventoryDTO modifyProductinventory(TvwsApiProductinventory productinventory);
	
	RtvconfirmDTO modifyReturnProductconfirm(TvwsApiRtvconfirm returnproduct);
	
	ReturnorderconfirmDTO modifyReturnOrderconfirm(TvwsApiReturnorderconfirm returnorder);
	
	SuppliershipconfirmDTO modifySupplierShipconfirm(TvwsApiSuppliershipconfirm suppliershiporder);
	
	WhtransferodconfirmDTO modifyWhtransferodconfirm(TvwsApiWhtransferodconfirm whtransferodconfirm);
	
	List<TvwsApiProductinventory> selectByExample(TvwsApiProductinventoryExample example);
	
	int updateByExampleSelective(@Param("record") TvwsApiProductinventory record, @Param("example") TvwsApiProductinventoryExample example);
	
    List<TvwsApiSuppliershipconfirm> selectByExample(TvwsApiSuppliershipconfirmExample example);
    int updateByExampleSelective(@Param("record") TvwsApiSuppliershipconfirm record, @Param("example") TvwsApiSuppliershipconfirmExample example);
    
    List<TvwsApiCsowholeConfirm> selectByExample(TvwsApiCsowholeConfirmExample example);
    int updateByExampleSelective(@Param("record") TvwsApiCsowholeConfirm record, @Param("example") TvwsApiCsowholeConfirmExample example);
    
    List<TvwsApiReturnorderconfirm> selectByExample(TvwsApiReturnorderconfirmExample example);
    int updateByExampleSelective(@Param("record") TvwsApiReturnorderconfirm record, @Param("example") TvwsApiReturnorderconfirmExample example);
    
    List<TvwsApiRtvconfirm> selectByExample(TvwsApiRtvconfirmExample example);
    int updateByExampleSelective(@Param("record") TvwsApiRtvconfirm record, @Param("example") TvwsApiRtvconfirmExample example);
    
    ProductinventoryDTO modifyProductinventoryByProc(TvwsApiProductinventory productinventory);
	
}
