package com.best1.api.service.chm.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.javasimon.aop.Monitored;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.best1.api.entity.chm.PgmProduct;
import com.best1.api.entity.chm.Programdetail;
import com.best1.api.entity.chm.TchmNfmtapecreation;
import com.best1.api.entity.chm.TchmNfmtapecreationExample;
import com.best1.api.entity.chm.TchmNfmtapedefinition;
import com.best1.api.entity.chm.TchmNfmtapedefinitionExample;
import com.best1.api.entity.chm.TchmWebchannelproductsel;
import com.best1.api.entity.chm.TchmWebchannelproductselExample;
import com.best1.api.entity.scm.product.TscmProduct;
import com.best1.api.entity.scm.product.TscmProductlogistic;
import com.best1.api.mapper.chm.PgmProductInfoMapper;
import com.best1.api.mapper.chm.TchmNfmtapecreationMapper;
import com.best1.api.mapper.chm.TchmNfmtapedefinitionMapper;
import com.best1.api.mapper.chm.TchmWebchannelproductselMapper;
import com.best1.api.service.chm.PgmManageService;
import com.best1.api.service.scm.ProductManageSerevice;
import com.best1.api.utils.APIConstant;
import com.best1.api.utils.ConfigInfo;
import com.best1.api.utils.ConnectET1Util;
import com.best1.api.utils.DateUtil;
import com.best1.api.utils.IOAFConstants;
import com.best1.api.utils.SCMConstant;

@Component
@Transactional
@Monitored
public class PgmManageServiceImpl implements PgmManageService {
	private static Logger logger = LoggerFactory
			.getLogger(PgmManageServiceImpl.class);
	@Autowired
	private PgmProductInfoMapper pgmproductDAO;

	@Autowired
	private TchmWebchannelproductselMapper productselDAO;

	@Autowired
	private ConfigInfo configInfo;

	@Autowired
	private ProductManageSerevice productManageSerevice;

	@Autowired
	private TchmNfmtapedefinitionMapper nfmtapedefinitionMapperDAO;

	@Autowired
	private TchmNfmtapecreationMapper nfmtapecreationMapperDAO;

	@Override
	public List<PgmProduct> selectPgmProduct(PgmProduct pgminfo) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put(APIConstant.SP_DATE, pgminfo.getStarttime());
		paramMap.put(APIConstant.SP_DAYS, pgminfo.getDays());
		paramMap.put(APIConstant.SP_SUBID, pgminfo.getSubchannelid());
		pgmproductDAO.pgmInfo(paramMap);
		List<PgmProduct> pgms = (List<PgmProduct>) paramMap
				.get(APIConstant.SP_RI_INFO);
		return pgms;
	}

	@Override
	public TchmWebchannelproductsel webProductSelectionable(PgmProduct pgminfo)
			throws Exception {
		TchmWebchannelproductsel productsel = new TchmWebchannelproductsel();
		TscmProduct product = new TscmProduct();
		product.setProductid(pgminfo.getProductid());
		List<TscmProduct> products = productManageSerevice
				.selectInfoByProduct(product);
		if (products != null && products.size() > 0) {
			TchmWebchannelproductselExample example = new TchmWebchannelproductselExample();
			TchmWebchannelproductselExample.Criteria criteria = example
					.createCriteria();
			criteria.andProductidEqualTo(pgminfo.getProductid());
			criteria.andColourcodeEqualTo(pgminfo.getColourcode());
			criteria.andColourclassEqualTo(pgminfo.getColourclass());
			criteria.andStylecodeEqualTo(pgminfo.getStylecode());
			criteria.andStyleclassEqualTo(pgminfo.getStyleclass());
			List<TchmWebchannelproductsel> productsels = productselDAO
					.selectByExample(example);
			if (productsels != null && productsels.size() > 0) {
				productsel.setRtncode(APIConstant.RTNCODE_FAIL);// 已上架
			} else {
				if (pgminfo.getPlannedquantity() > APIConstant.MAXPLANNEDQUANTITY) {
					productsel.setRtncode(APIConstant.PLANNEDQUANTITYTOOLARGE);
				} else {
					product = products.get(0);
					pgminfo.setProductname(product.getProductname1() + "_"
							+ product.getProductname2());
					pgminfo.setCostprice(product.getCostprice());
					pgminfo.setSellingprice(product.getSellingprice());
					pgminfo.setLclasscode(product.getLclasscode());
					pgminfo.setMclasscode(product.getMclasscode());
					pgminfo.setSclasscode(product.getSclasscode());
					pgminfo.setMdid(product.getMdid());
					pgminfo.setMxavailableqty(product.getMaximumquantity());
					pgminfo.setProducttype(product.getProducttype());

					TscmProductlogistic logistic = new TscmProductlogistic();
					logistic.setProductid(pgminfo.getProductid());
					List<TscmProductlogistic> logistics = productManageSerevice
							.selectProductLogisticProduct(logistic);
					if (logistics != null && logistics.size() > 0) {
						logistic = logistics.get(0);
						pgminfo.setSalestype(logistic.getSalestype());
						pgminfo.setDeliverytype(logistic.getDeliverytype());
					}

					pgminfo.setProductversion(SCMConstant.SCM_PRODUCT_START_VERSION);
					String erpwsurl = configInfo.getErpws();
					String apiType = APIConstant.WEB_PRODUCT_SELECTION_APITYPE;
					String WSType = configInfo
							.getErp_web_product_selection_ws_name();
					String beanName = APIConstant.WEB_PRODUCT_SELECTION_BEANNAME;
					String retk = ConnectET1Util.erpReturnResult(erpwsurl,
							apiType, WSType, beanName, new PgmProduct(),
							pgminfo);
					if (retk != null) {
						if (retk.equals(APIConstant.RETURN_SUCCESS_FROM_ET1)) {
							criteria.andProductidEqualTo(pgminfo.getProductid());
							criteria.andColourcodeEqualTo(pgminfo
									.getColourcode());
							criteria.andColourclassEqualTo(pgminfo
									.getColourclass());
							criteria.andStylecodeEqualTo(pgminfo.getStylecode());
							criteria.andStyleclassEqualTo(pgminfo
									.getStyleclass());
							productsels = productselDAO
									.selectByExample(example);
							productsel = productsels.get(0);
							productsel.setRtncode(APIConstant.RTNCODE_OK);// 上架成功
						} else {
							productsel
									.setRtncode(APIConstant.RTNCODE_INFEASIBLE);// 不可上架
							productsel.setRtnmsg(retk);
						}
					}
				}
			}
		} else {
			productsel.setRtncode(APIConstant.RTNCODE_NO_DATA);// productid无效
		}
		return productsel;
	}

	@Override
	public List<Programdetail> programDetailInfo(Programdetail programdetail) {
		programdetail.setStatus(IOAFConstants.ACTIVE_STATUS);
		if(programdetail.getPgmstatus()!=null){
		programdetail.setPgmstatus(IOAFConstants.PGM_STATUS);
		}
		programdetail.setProductselectionstatus(APIConstant.STATUSAPPROVED);
		return pgmproductDAO.programDetailInfo(programdetail);
	}

	@Override
	public int createTape(Long nfmpgmscheduleid, Long nfmsubchannelid,String tapename,
			Long productid,  String fathertapename,
			String childtapename, Long createdby) {

		TchmNfmtapedefinitionExample example = new TchmNfmtapedefinitionExample();

		TchmNfmtapedefinitionExample.Criteria criteria = example
				.createCriteria();
		criteria.andFathertapenameEqualTo(fathertapename);
		criteria.andTapetypeEqualTo(APIConstant.PGM_ON_LINVE);
		if (nfmtapedefinitionMapperDAO.countByExample(example) == 0) {
			TchmNfmtapedefinition record = new TchmNfmtapedefinition();
			record.setNfmsubchannelid(nfmsubchannelid);
			record.setTapetype(APIConstant.PGM_ON_LINVE);
			record.setTapestatus(APIConstant.TAPESTATUS_NEW);
			record.setContentstatus(APIConstant.CONTENTSTATUS_PROTECTED);
			record.setOverwritingnumber(APIConstant.TAPE_OVERWRITINGNUMBER);
			record.setStatus(APIConstant.ACTIVE_STATUS);
			record.setTaperetentionperiod(DateUtil.getTodayTime());
			record.setTapedeadline(DateUtil.getTodayTime());
			record.setLastmodifiedby(createdby);
			record.setCreatedby(createdby);
			record.setCreatedtimestamp(DateUtil.getTodayTime());
			record.setLastmodifiedtimestamp(DateUtil.getTodayTime());
			record.setTapename(tapename);
			record.setFathertapename(fathertapename);
			record.setChildtapename(childtapename);
			nfmtapedefinitionMapperDAO.insertSelective(record);
		}
		example.clear();
		criteria = example.createCriteria();
		criteria.andChildtapenameEqualTo(childtapename);
		criteria.andTapetypeEqualTo(APIConstant.PGM_ON_TAPE);
		
		
		if (nfmtapedefinitionMapperDAO.countByExample(example) == 0) {
			TchmNfmtapedefinition record = new TchmNfmtapedefinition();
			record.setNfmsubchannelid(nfmsubchannelid);
			record.setTapetype(APIConstant.PGM_ON_TAPE);
			record.setTapestatus(APIConstant.TAPESTATUS_NEW);
			record.setContentstatus(APIConstant.CONTENTSTATUS_PROTECTED);
			record.setOverwritingnumber(APIConstant.TAPE_OVERWRITINGNUMBER);
			record.setStatus(APIConstant.ACTIVE_STATUS);
			record.setTaperetentionperiod(DateUtil.getTodayTime());
			record.setTapedeadline(DateUtil.getTodayTime());
			record.setLastmodifiedby(createdby);
			record.setCreatedby(createdby);
			record.setCreatedtimestamp(DateUtil.getTodayTime());
			record.setLastmodifiedtimestamp(DateUtil.getTodayTime());
			record.setTapename(tapename);
			record.setFathertapename(fathertapename);
			record.setChildtapename(childtapename);
			nfmtapedefinitionMapperDAO.insertSelective(record);
		}
		example.clear();
		criteria = example.createCriteria();
		criteria.andFathertapenameEqualTo(fathertapename);
		criteria.andTapetypeEqualTo(APIConstant.PGM_ON_LINVE);
		List<TchmNfmtapedefinition>  fathertape=nfmtapedefinitionMapperDAO.selectByExample(example);
		Long tapeid=null;
		Long childtapeid=null;
		if(fathertape!=null&&fathertape.size()>0)
		{
		tapeid=fathertape.get(0).getTapeid();
		example.clear();
		criteria = example.createCriteria();
		criteria.andFathertapenameEqualTo(fathertapename);
		criteria.andTapetypeEqualTo(APIConstant.PGM_ON_TAPE);
		List<TchmNfmtapedefinition>  childtape=nfmtapedefinitionMapperDAO.selectByExample(example);
		
		if(childtape!=null&&childtape.size()>0)
			childtapeid=childtape.get(0).getTapeid();
		TchmNfmtapecreation tapecreationupdate =new TchmNfmtapecreation();
		tapecreationupdate.setStatus(APIConstant.INACTIVE_STATUS);
		tapecreationupdate.setLastmodifiedby(createdby);
		tapecreationupdate.setLastmodifiedtimestamp(DateUtil.getTodayTime());
		TchmNfmtapecreationExample tapeExample=new TchmNfmtapecreationExample();
		TchmNfmtapecreationExample.Criteria tapeCriteria=tapeExample.createCriteria();
		tapeCriteria.andNfmpgmscheduleidEqualTo(nfmpgmscheduleid);
		nfmtapecreationMapperDAO.updateByExampleSelective(tapecreationupdate, tapeExample);
		TchmNfmtapecreation tapecreation =new TchmNfmtapecreation();
		tapecreation.setTapeid(tapeid);
		tapecreation.setTapecreationdate(DateUtil.getTodayTime());
		tapecreation.setTapecreationtime(DateUtil.getTodayTime());
		tapecreation.setNfmpgmscheduleid(nfmpgmscheduleid);
		tapecreation.setStatus(APIConstant.ACTIVE_STATUS);
		tapecreation.setLastmodifiedby(createdby);
		tapecreation.setCreatedby(createdby);
		tapecreation.setCreatedtimestamp(DateUtil.getTodayTime());
		tapecreation.setLastmodifiedtimestamp(DateUtil.getTodayTime());
		tapecreation.setChildtapeid(childtapeid);
		tapecreation.setProductid(productid);
		nfmtapecreationMapperDAO.insertSelective(tapecreation);
		}
		return APIConstant.RTNCODE_OK;
	}

	@Override
	public List<Programdetail> livenFmProgProductInfo(
			Programdetail programdetail) {
		return pgmproductDAO.livenfmProgproductInfo(programdetail);
	}

}
