package com.best1.api.service.oaf;

import java.util.List;

import com.best1.api.entity.oaf.order.CustomerOrderinvoiceinfo;
import com.best1.api.entity.oaf.order.ToafEorderinvoiceinfo;
import com.best1.api.entity.oaf.order.ToafOrderinvoiceinfo;



public interface InvoiceManageSerevice {
	
	public List<CustomerOrderinvoiceinfo> orderInvoicePrint(CustomerOrderinvoiceinfo orderInvoice);

	public int createEorderinvoice(ToafEorderinvoiceinfo  eorderinvoice) throws Exception;
	
	public int orderInvoiceReturn(CustomerOrderinvoiceinfo orderInvoice);
	
	public List<CustomerOrderinvoiceinfo> InvoiceReturnConfirm(CustomerOrderinvoiceinfo orderInvoice);
	
	public ToafOrderinvoiceinfo orderInvoiceinfo(ToafOrderinvoiceinfo orderinvoiceinfo);
	
	public int orderInvoiceReturnBack(ToafEorderinvoiceinfo  eorderinvoice);
	/**电子发票红冲**/
	public int eorderinvoiceReturn(CustomerOrderinvoiceinfo orderInvoice);
	
	public List<CustomerOrderinvoiceinfo> orderEInvoiceDownload(CustomerOrderinvoiceinfo orderInvoice);

	
}
