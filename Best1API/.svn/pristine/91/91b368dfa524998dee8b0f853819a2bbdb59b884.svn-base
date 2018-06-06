package com.best1.api.service.vwms;

import java.util.List;

import com.best1.api.entity.vwms.TvwsApiCsowhole;
import com.best1.api.entity.vwms.TvwsApiProductdetail;
import com.best1.api.entity.vwms.TvwsApiProductmaster;
import com.best1.api.entity.vwms.TvwsApiRtv;
import com.best1.api.entity.vwms.TvwsApiSrowhole;
import com.best1.api.entity.vwms.TvwsApiSuppliermaster;
import com.best1.api.entity.vwms.TvwsApiSuppliershiporder;
import com.best1.api.entity.vwms.TvwsApiWhtransferorder;
import com.best1.api.webservice.soap.response.dto.vwms.ProductdetailDTO;
import com.best1.api.webservice.soap.response.dto.vwms.ProductmasterDTO;
import com.best1.api.webservice.soap.response.dto.vwms.SupplierReturnProductDTO;
import com.best1.api.webservice.soap.response.dto.vwms.SupplierShiporderDTO;
import com.best1.api.webservice.soap.response.dto.vwms.SuppliermasterDTO;
import com.best1.api.webservice.soap.response.dto.vwms.CustomerShiporderDTO;
import com.best1.api.webservice.soap.response.dto.vwms.ReturnProductsDTO;
import com.best1.api.webservice.soap.response.dto.vwms.WhtransferorderDTO;


public interface VwmsOutputService {

	
    /**出货数据*/
	List<CustomerShiporderDTO> orderProductDetail(TvwsApiCsowhole csowhole);
	

	
	 /**销退_拦截数据*/
	List<ReturnProductsDTO> SroWholeDetaile(TvwsApiSrowhole srowhole);
	/**商品明细*/
	List<ProductdetailDTO> ProductdetailDTO(TvwsApiProductdetail productdetail);
	/**商品信息*/
	List<ProductmasterDTO> Productmaster(TvwsApiProductmaster productmaster);
	/**厂商信息*/
	List<SuppliermasterDTO> Suppliermaster(TvwsApiSuppliermaster suppliermaster);
	
	/**供应商送货信息*/
	List<SupplierShiporderDTO> SupplierShiporder(TvwsApiSuppliershiporder suppliersso);
	/**供应商退厂信息*/
	List<SupplierReturnProductDTO> SupplierReturnProduct(TvwsApiRtv supplierrtv);
	
	
	
	/**跨库订单*/
	List<WhtransferorderDTO> Whtransferorder(TvwsApiWhtransferorder whtransferorder);
	
	
}
