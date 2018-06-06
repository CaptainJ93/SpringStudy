package com.best1.api.webservice.soap.response.dto.scm;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "productwarehouse")
public class ProductwarehouseDTO {
	  private Long productwarehouseid;

	    private Long productid;

	    private Long warehouseid;

	    private Long createdby;

	    private Date createdtimestamp;

	    private Long lastmodifiedby;
	    
	    private Date lastmodifiedtimestamp;

		public Long getProductwarehouseid() {
			return productwarehouseid;
		}

		public void setProductwarehouseid(Long productwarehouseid) {
			this.productwarehouseid = productwarehouseid;
		}

		public Long getProductid() {
			return productid;
		}

		public void setProductid(Long productid) {
			this.productid = productid;
		}

		public Long getWarehouseid() {
			return warehouseid;
		}

		public void setWarehouseid(Long warehouseid) {
			this.warehouseid = warehouseid;
		}

		public Long getCreatedby() {
			return createdby;
		}

		public void setCreatedby(Long createdby) {
			this.createdby = createdby;
		}

		public Date getCreatedtimestamp() {
			return createdtimestamp;
		}

		public void setCreatedtimestamp(Date createdtimestamp) {
			this.createdtimestamp = createdtimestamp;
		}

		public Long getLastmodifiedby() {
			return lastmodifiedby;
		}

		public void setLastmodifiedby(Long lastmodifiedby) {
			this.lastmodifiedby = lastmodifiedby;
		}

		public Date getLastmodifiedtimestamp() {
			return lastmodifiedtimestamp;
		}

		public void setLastmodifiedtimestamp(Date lastmodifiedtimestamp) {
			this.lastmodifiedtimestamp = lastmodifiedtimestamp;
		}
	    
}
