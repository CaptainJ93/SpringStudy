package com.best1.api.service.chm;

import java.util.List;

import com.best1.api.entity.chm.PgmProduct;
import com.best1.api.entity.chm.Programdetail;
import com.best1.api.entity.chm.TchmWebchannelproductsel;

public interface PgmManageService {
	/**
	 * 
	 * 返回节目信息
	 * 
	 * **/
	public List<PgmProduct> selectPgmProduct(PgmProduct pgminfo);

	/** 上架 **/
	public TchmWebchannelproductsel webProductSelectionable(PgmProduct pgminfo)
			throws Exception;

	public List<Programdetail> programDetailInfo(Programdetail programdetail);

	int createTape(Long nfmpgmscheduleid, Long nfmsubchannelid,String tapename, Long productid,
			 String fathertapename, String childtapename, Long createdby);
	
	public List<Programdetail> livenFmProgProductInfo(Programdetail programdetail);
}
