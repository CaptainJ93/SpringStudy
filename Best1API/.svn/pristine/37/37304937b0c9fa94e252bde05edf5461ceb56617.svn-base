package com.best1.api.service.vwms.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.javasimon.aop.Monitored;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.best1.api.entity.vwms.TvwsApiCsowhole;
import com.best1.api.entity.vwms.TvwsApiProductdetail;
import com.best1.api.entity.vwms.TvwsApiProductdetailExample;
import com.best1.api.entity.vwms.TvwsApiProductmaster;
import com.best1.api.entity.vwms.TvwsApiProductmasterExample;
import com.best1.api.entity.vwms.TvwsApiRtv;
import com.best1.api.entity.vwms.TvwsApiRtvExample;
import com.best1.api.entity.vwms.TvwsApiSrowhole;
import com.best1.api.entity.vwms.TvwsApiSuppliershiporder;
import com.best1.api.entity.vwms.TvwsApiSuppliershiporderExample;
import com.best1.api.entity.vwms.TvwsApiSuppliermaster;
import com.best1.api.entity.vwms.TvwsApiSuppliermasterExample;
import com.best1.api.entity.vwms.TvwsApiWhtransferorder;
import com.best1.api.entity.vwms.TvwsApiWhtransferorderExample;
import com.best1.api.mapper.vwms.TvwsApiCsowholeMapper;
import com.best1.api.mapper.vwms.TvwsApiProductdetailMapper;
import com.best1.api.mapper.vwms.TvwsApiProductmasterMapper;
import com.best1.api.mapper.vwms.TvwsApiRtvMapper;
import com.best1.api.mapper.vwms.TvwsApiSrowholeMapper;
import com.best1.api.mapper.vwms.TvwsApiSuppliershiporderMapper;
import com.best1.api.mapper.vwms.TvwsApiSuppliermasterMapper;
import com.best1.api.mapper.vwms.TvwsApiWhtransferorderMapper;
import com.best1.api.service.vwms.VwmsOutputService;
import com.best1.api.utils.IOAFDomainConstants;
import com.best1.api.utils.bean.BeanMapper;
import com.best1.api.webservice.soap.response.dto.vwms.ApiCsowholeDTO;
import com.best1.api.webservice.soap.response.dto.vwms.ProductdetailDTO;
import com.best1.api.webservice.soap.response.dto.vwms.ProductmasterDTO;
import com.best1.api.webservice.soap.response.dto.vwms.ApiSrowholeDTO;
import com.best1.api.webservice.soap.response.dto.vwms.SupplierReturnProductDTO;
import com.best1.api.webservice.soap.response.dto.vwms.SupplierShiporderDTO;
import com.best1.api.webservice.soap.response.dto.vwms.SuppliermasterDTO;
import com.best1.api.webservice.soap.response.dto.vwms.CustomerShiporderDTO;
import com.best1.api.webservice.soap.response.dto.vwms.CustomerShiporderDetailDTO;
import com.best1.api.webservice.soap.response.dto.vwms.ReturnProductsDTO;
import com.best1.api.webservice.soap.response.dto.vwms.ReturnProductsDetailDTO;
import com.best1.api.webservice.soap.response.dto.vwms.WhtransferorderDTO;
 

@Component
@Transactional
@Monitored
public class VwmsOutputServiceImpl implements VwmsOutputService {

	private static Logger logger = LoggerFactory
			.getLogger(VwmsOutputServiceImpl.class);

	@Autowired
	private TvwsApiCsowholeMapper csowholeMapperDAO;

	@Autowired
	private TvwsApiSrowholeMapper srowholeMapperDAO;

	@Autowired
	private TvwsApiProductdetailMapper productdetailMapperDAO;

	@Autowired
	private TvwsApiProductmasterMapper productmasterMapperDAO;

	@Autowired
	private TvwsApiSuppliermasterMapper suppliermasterMapperDAO;
	
	@Autowired
	private TvwsApiRtvMapper  supplierrtvMapperDAO;

	@Autowired
	private TvwsApiSuppliershiporderMapper  supplierssoMapperDAO;
	
	@Autowired
	private TvwsApiWhtransferorderMapper whtransferorderMapperDAO;
	@Override
	public List<CustomerShiporderDTO> orderProductDetail(
			TvwsApiCsowhole csowhole) {
		logger.info("出货订单信息");
		logger.info(csowhole.getBatchid());
		logger.info(csowhole.getStartdate());
		logger.info(csowhole.getEnddate());
		List<CustomerShiporderDTO> coswholeobj = null;
		List<TvwsApiCsowhole> csowholes = csowholeMapperDAO
				.selectByCsowhole(csowhole);
		List<ApiCsowholeDTO> csowholedtos = BeanMapper.mapList(csowholes,
				ApiCsowholeDTO.class);
		Map<String, CustomerShiporderDTO> csoTitleMap = new HashMap<String, CustomerShiporderDTO>();

		for (ApiCsowholeDTO csowholedto : csowholedtos) {
			CustomerShiporderDTO csotitle = null;
			logger.info("Title Orderid" + csowholedto.getOrderid());

			if (csowholedto.getIspromotionalproduct().equals("N")
					|| csowholedto.getShipordertype().intValue() == IOAFDomainConstants.ORDER_TYPE_EXCHANGE
					|| csowholedto.getShipordertype().intValue() == IOAFDomainConstants.ORDER_TYPE_REPLACE) {
				csotitle = BeanMapper.map(csowholedto,
						CustomerShiporderDTO.class);
				csoTitleMap.put(
						csotitle.getOrderid() + "_" + csotitle.getItemid(),
						csotitle);

			}

		}
		for (ApiCsowholeDTO csowholedto : csowholedtos) {

			CustomerShiporderDTO csotitle = csoTitleMap
					.get(csowholedto.getOrderid() + "_"
							+ csowholedto.getPromotionrelationseq());
			if (csotitle == null) {
				csotitle = csoTitleMap.get(csowholedto.getOrderid() + "_"
						+ csowholedto.getItemid());

			}

			if (csotitle != null) {
				List<CustomerShiporderDetailDTO> csodetails = csotitle
						.getCsowholedetail();
				CustomerShiporderDetailDTO csodetail = BeanMapper.map(
						csowholedto, CustomerShiporderDetailDTO.class);

				logger.info("csoDetail " + csodetail.getItemid());

				csodetails.add(csodetail);

			}

		}
		coswholeobj = new ArrayList<CustomerShiporderDTO>();
		Iterator<String> it = csoTitleMap.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next().toString();
			coswholeobj.add(csoTitleMap.get(key));
		}
		return coswholeobj;
	}




	@Override
	public List<ReturnProductsDTO> SroWholeDetaile(TvwsApiSrowhole srowhole) {
		logger.info("销退信息");
		logger.info(srowhole.getBatchid());
		logger.info(srowhole.getStartdate());
		logger.info(srowhole.getEnddate());
		List<ReturnProductsDTO> srowholeobj = null;

		List<TvwsApiSrowhole> srowholes = srowholeMapperDAO
				.selectBySrowhole(srowhole);

		List<ApiSrowholeDTO> srowholedtoes = BeanMapper.mapList(srowholes,
				ApiSrowholeDTO.class);

		Map<String, ReturnProductsDTO> sroTitleMap = new HashMap<String, ReturnProductsDTO>();

		for (ApiSrowholeDTO srowholedto : srowholedtoes) {
			ReturnProductsDTO srotitle = null;
			logger.info("Title Returnid" + srowholedto.getReturnid());

			srotitle = BeanMapper.map(srowholedto, ReturnProductsDTO.class);
			sroTitleMap.put(srowholedto.getReturnid().toString(), srotitle);
		}

		for (ApiSrowholeDTO srowholedto : srowholedtoes) {
			logger.info("Title Returnid2" + srowholedto.getReturnid());

			ReturnProductsDTO srotitle = sroTitleMap.get(srowholedto
					.getReturnid().toString());
			if (srotitle != null) {
				List<ReturnProductsDetailDTO> srodetails = srotitle.getSrowholedetails();
		     	ReturnProductsDetailDTO srodetail = BeanMapper.map(srowholedto,
						ReturnProductsDetailDTO.class);

				logger.info("srodetail " + srodetail.getReturnorderid());
				srodetails.add(srodetail);
			}

		}
		srowholeobj = new ArrayList<ReturnProductsDTO>();
		Iterator<String> it = sroTitleMap.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next().toString();
			srowholeobj.add(sroTitleMap.get(key));
		}

		return srowholeobj;
	}

	@Override
	public List<ProductdetailDTO> ProductdetailDTO(
			TvwsApiProductdetail productdetail) {
		TvwsApiProductdetailExample example = new TvwsApiProductdetailExample();
		TvwsApiProductdetailExample.Criteria criteria = example
				.createCriteria();
		criteria.andBatchidEqualTo(productdetail.getBatchid());
		List<TvwsApiProductdetail> productdetails = productdetailMapperDAO
				.selectByExample(example);
		List<ProductdetailDTO> dtoes = BeanMapper.mapList(productdetails,
				ProductdetailDTO.class);
		return dtoes;
	}

	@Override
	public List<ProductmasterDTO> Productmaster(
			TvwsApiProductmaster productmaster) {
		TvwsApiProductmasterExample example = new TvwsApiProductmasterExample();
		TvwsApiProductmasterExample.Criteria criteria = example
				.createCriteria();
		criteria.andBatchidEqualTo(productmaster.getBatchid());
		List<TvwsApiProductmaster> productmasters = productmasterMapperDAO
				.selectByExample(example);
		List<ProductmasterDTO> dtoes = BeanMapper.mapList(productmasters,
				ProductmasterDTO.class);
		return dtoes;
	}

	@Override
	public List<SuppliermasterDTO> Suppliermaster(
			TvwsApiSuppliermaster suppliermaster) {
		TvwsApiSuppliermasterExample example = new TvwsApiSuppliermasterExample();
		TvwsApiSuppliermasterExample.Criteria criteria = example
				.createCriteria();
		criteria.andBatchidEqualTo(suppliermaster.getBatchid());
		List<TvwsApiSuppliermaster> suppliermasters = suppliermasterMapperDAO
				.selectByExample(example);
		List<SuppliermasterDTO> dtoes = BeanMapper.mapList(suppliermasters,
				SuppliermasterDTO.class);
		return dtoes;
	}

	@Override
	public List<SupplierShiporderDTO> SupplierShiporder(TvwsApiSuppliershiporder suppliersso) {
		TvwsApiSuppliershiporderExample example =new TvwsApiSuppliershiporderExample();
		TvwsApiSuppliershiporderExample.Criteria criteria=example.createCriteria();
		criteria.andBatchidEqualTo(suppliersso.getBatchid());
		 List<TvwsApiSuppliershiporder> supplierssoes=supplierssoMapperDAO.selectByExample(example);
		 List<SupplierShiporderDTO> dtoes = BeanMapper.mapList(supplierssoes,
				 SupplierShiporderDTO.class);
			return dtoes;
	}

	@Override
	public List<SupplierReturnProductDTO> SupplierReturnProduct(
			TvwsApiRtv supplierrtv) {
		TvwsApiRtvExample example =new TvwsApiRtvExample();
		TvwsApiRtvExample.Criteria criteria=example.createCriteria();
		criteria.andBatchidEqualTo(supplierrtv.getBatchid());
		 List<TvwsApiRtv> supplierrtves=supplierrtvMapperDAO.selectByExample(example);
		 List<SupplierReturnProductDTO> dtoes = BeanMapper.mapList(supplierrtves,
				 SupplierReturnProductDTO.class);
			return dtoes;
	}

	@Override
	public List<WhtransferorderDTO> Whtransferorder(
			TvwsApiWhtransferorder whtransferorder) {
		TvwsApiWhtransferorderExample example=new TvwsApiWhtransferorderExample();
		TvwsApiWhtransferorderExample.Criteria criteria=example.createCriteria();
		criteria.andBatchidEqualTo(whtransferorder.getBatchid());
		 List<TvwsApiWhtransferorder> whtransferorders=whtransferorderMapperDAO.selectByExample(example);
		 List<WhtransferorderDTO> dtoes = BeanMapper.mapList(whtransferorders,
				 WhtransferorderDTO.class);
		return dtoes;
	}

}
