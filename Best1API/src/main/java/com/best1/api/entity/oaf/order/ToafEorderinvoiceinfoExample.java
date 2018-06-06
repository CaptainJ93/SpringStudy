package com.best1.api.entity.oaf.order;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ToafEorderinvoiceinfoExample {
 
    protected String orderByClause;

   
    protected boolean distinct;

    
    protected List<Criteria> oredCriteria;

   
    public ToafEorderinvoiceinfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

   
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    
    public String getOrderByClause() {
        return orderByClause;
    }

  
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    
    public boolean isDistinct() {
        return distinct;
    }

    
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

   
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

   
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

   
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

   
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andEinvoiceinfoidIsNull() {
            addCriterion("EINVOICEINFOID is null");
            return (Criteria) this;
        }

        public Criteria andEinvoiceinfoidIsNotNull() {
            addCriterion("EINVOICEINFOID is not null");
            return (Criteria) this;
        }

        public Criteria andEinvoiceinfoidEqualTo(Long value) {
            addCriterion("EINVOICEINFOID =", value, "einvoiceinfoid");
            return (Criteria) this;
        }

        public Criteria andEinvoiceinfoidNotEqualTo(Long value) {
            addCriterion("EINVOICEINFOID <>", value, "einvoiceinfoid");
            return (Criteria) this;
        }

        public Criteria andEinvoiceinfoidGreaterThan(Long value) {
            addCriterion("EINVOICEINFOID >", value, "einvoiceinfoid");
            return (Criteria) this;
        }

        public Criteria andEinvoiceinfoidGreaterThanOrEqualTo(Long value) {
            addCriterion("EINVOICEINFOID >=", value, "einvoiceinfoid");
            return (Criteria) this;
        }

        public Criteria andEinvoiceinfoidLessThan(Long value) {
            addCriterion("EINVOICEINFOID <", value, "einvoiceinfoid");
            return (Criteria) this;
        }

        public Criteria andEinvoiceinfoidLessThanOrEqualTo(Long value) {
            addCriterion("EINVOICEINFOID <=", value, "einvoiceinfoid");
            return (Criteria) this;
        }

        public Criteria andEinvoiceinfoidIn(List<Long> values) {
            addCriterion("EINVOICEINFOID in", values, "einvoiceinfoid");
            return (Criteria) this;
        }

        public Criteria andEinvoiceinfoidNotIn(List<Long> values) {
            addCriterion("EINVOICEINFOID not in", values, "einvoiceinfoid");
            return (Criteria) this;
        }

        public Criteria andEinvoiceinfoidBetween(Long value1, Long value2) {
            addCriterion("EINVOICEINFOID between", value1, value2, "einvoiceinfoid");
            return (Criteria) this;
        }

        public Criteria andEinvoiceinfoidNotBetween(Long value1, Long value2) {
            addCriterion("EINVOICEINFOID not between", value1, value2, "einvoiceinfoid");
            return (Criteria) this;
        }

        public Criteria andInvoiceinfoidIsNull() {
            addCriterion("INVOICEINFOID is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceinfoidIsNotNull() {
            addCriterion("INVOICEINFOID is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceinfoidEqualTo(Long value) {
            addCriterion("INVOICEINFOID =", value, "invoiceinfoid");
            return (Criteria) this;
        }

        public Criteria andInvoiceinfoidNotEqualTo(Long value) {
            addCriterion("INVOICEINFOID <>", value, "invoiceinfoid");
            return (Criteria) this;
        }

        public Criteria andInvoiceinfoidGreaterThan(Long value) {
            addCriterion("INVOICEINFOID >", value, "invoiceinfoid");
            return (Criteria) this;
        }

        public Criteria andInvoiceinfoidGreaterThanOrEqualTo(Long value) {
            addCriterion("INVOICEINFOID >=", value, "invoiceinfoid");
            return (Criteria) this;
        }

        public Criteria andInvoiceinfoidLessThan(Long value) {
            addCriterion("INVOICEINFOID <", value, "invoiceinfoid");
            return (Criteria) this;
        }

        public Criteria andInvoiceinfoidLessThanOrEqualTo(Long value) {
            addCriterion("INVOICEINFOID <=", value, "invoiceinfoid");
            return (Criteria) this;
        }

        public Criteria andInvoiceinfoidIn(List<Long> values) {
            addCriterion("INVOICEINFOID in", values, "invoiceinfoid");
            return (Criteria) this;
        }

        public Criteria andInvoiceinfoidNotIn(List<Long> values) {
            addCriterion("INVOICEINFOID not in", values, "invoiceinfoid");
            return (Criteria) this;
        }

        public Criteria andInvoiceinfoidBetween(Long value1, Long value2) {
            addCriterion("INVOICEINFOID between", value1, value2, "invoiceinfoid");
            return (Criteria) this;
        }

        public Criteria andInvoiceinfoidNotBetween(Long value1, Long value2) {
            addCriterion("INVOICEINFOID not between", value1, value2, "invoiceinfoid");
            return (Criteria) this;
        }

        public Criteria andDzfphmIsNull() {
            addCriterion("DZFPHM is null");
            return (Criteria) this;
        }

        public Criteria andDzfphmIsNotNull() {
            addCriterion("DZFPHM is not null");
            return (Criteria) this;
        }

        public Criteria andDzfphmEqualTo(String value) {
            addCriterion("DZFPHM =", value, "dzfphm");
            return (Criteria) this;
        }

        public Criteria andDzfphmNotEqualTo(String value) {
            addCriterion("DZFPHM <>", value, "dzfphm");
            return (Criteria) this;
        }

        public Criteria andDzfphmGreaterThan(String value) {
            addCriterion("DZFPHM >", value, "dzfphm");
            return (Criteria) this;
        }

        public Criteria andDzfphmGreaterThanOrEqualTo(String value) {
            addCriterion("DZFPHM >=", value, "dzfphm");
            return (Criteria) this;
        }

        public Criteria andDzfphmLessThan(String value) {
            addCriterion("DZFPHM <", value, "dzfphm");
            return (Criteria) this;
        }

        public Criteria andDzfphmLessThanOrEqualTo(String value) {
            addCriterion("DZFPHM <=", value, "dzfphm");
            return (Criteria) this;
        }

        public Criteria andDzfphmLike(String value) {
            addCriterion("DZFPHM like", value, "dzfphm");
            return (Criteria) this;
        }

        public Criteria andDzfphmNotLike(String value) {
            addCriterion("DZFPHM not like", value, "dzfphm");
            return (Criteria) this;
        }

        public Criteria andDzfphmIn(List<String> values) {
            addCriterion("DZFPHM in", values, "dzfphm");
            return (Criteria) this;
        }

        public Criteria andDzfphmNotIn(List<String> values) {
            addCriterion("DZFPHM not in", values, "dzfphm");
            return (Criteria) this;
        }

        public Criteria andDzfphmBetween(String value1, String value2) {
            addCriterion("DZFPHM between", value1, value2, "dzfphm");
            return (Criteria) this;
        }

        public Criteria andDzfphmNotBetween(String value1, String value2) {
            addCriterion("DZFPHM not between", value1, value2, "dzfphm");
            return (Criteria) this;
        }

        public Criteria andFpdmIsNull() {
            addCriterion("FPDM is null");
            return (Criteria) this;
        }

        public Criteria andFpdmIsNotNull() {
            addCriterion("FPDM is not null");
            return (Criteria) this;
        }

        public Criteria andFpdmEqualTo(String value) {
            addCriterion("FPDM =", value, "fpdm");
            return (Criteria) this;
        }

        public Criteria andFpdmNotEqualTo(String value) {
            addCriterion("FPDM <>", value, "fpdm");
            return (Criteria) this;
        }

        public Criteria andFpdmGreaterThan(String value) {
            addCriterion("FPDM >", value, "fpdm");
            return (Criteria) this;
        }

        public Criteria andFpdmGreaterThanOrEqualTo(String value) {
            addCriterion("FPDM >=", value, "fpdm");
            return (Criteria) this;
        }

        public Criteria andFpdmLessThan(String value) {
            addCriterion("FPDM <", value, "fpdm");
            return (Criteria) this;
        }

        public Criteria andFpdmLessThanOrEqualTo(String value) {
            addCriterion("FPDM <=", value, "fpdm");
            return (Criteria) this;
        }

        public Criteria andFpdmLike(String value) {
            addCriterion("FPDM like", value, "fpdm");
            return (Criteria) this;
        }

        public Criteria andFpdmNotLike(String value) {
            addCriterion("FPDM not like", value, "fpdm");
            return (Criteria) this;
        }

        public Criteria andFpdmIn(List<String> values) {
            addCriterion("FPDM in", values, "fpdm");
            return (Criteria) this;
        }

        public Criteria andFpdmNotIn(List<String> values) {
            addCriterion("FPDM not in", values, "fpdm");
            return (Criteria) this;
        }

        public Criteria andFpdmBetween(String value1, String value2) {
            addCriterion("FPDM between", value1, value2, "fpdm");
            return (Criteria) this;
        }

        public Criteria andFpdmNotBetween(String value1, String value2) {
            addCriterion("FPDM not between", value1, value2, "fpdm");
            return (Criteria) this;
        }

        public Criteria andFphmIsNull() {
            addCriterion("FPHM is null");
            return (Criteria) this;
        }

        public Criteria andFphmIsNotNull() {
            addCriterion("FPHM is not null");
            return (Criteria) this;
        }

        public Criteria andFphmEqualTo(String value) {
            addCriterion("FPHM =", value, "fphm");
            return (Criteria) this;
        }

        public Criteria andFphmNotEqualTo(String value) {
            addCriterion("FPHM <>", value, "fphm");
            return (Criteria) this;
        }

        public Criteria andFphmGreaterThan(String value) {
            addCriterion("FPHM >", value, "fphm");
            return (Criteria) this;
        }

        public Criteria andFphmGreaterThanOrEqualTo(String value) {
            addCriterion("FPHM >=", value, "fphm");
            return (Criteria) this;
        }

        public Criteria andFphmLessThan(String value) {
            addCriterion("FPHM <", value, "fphm");
            return (Criteria) this;
        }

        public Criteria andFphmLessThanOrEqualTo(String value) {
            addCriterion("FPHM <=", value, "fphm");
            return (Criteria) this;
        }

        public Criteria andFphmLike(String value) {
            addCriterion("FPHM like", value, "fphm");
            return (Criteria) this;
        }

        public Criteria andFphmNotLike(String value) {
            addCriterion("FPHM not like", value, "fphm");
            return (Criteria) this;
        }

        public Criteria andFphmIn(List<String> values) {
            addCriterion("FPHM in", values, "fphm");
            return (Criteria) this;
        }

        public Criteria andFphmNotIn(List<String> values) {
            addCriterion("FPHM not in", values, "fphm");
            return (Criteria) this;
        }

        public Criteria andFphmBetween(String value1, String value2) {
            addCriterion("FPHM between", value1, value2, "fphm");
            return (Criteria) this;
        }

        public Criteria andFphmNotBetween(String value1, String value2) {
            addCriterion("FPHM not between", value1, value2, "fphm");
            return (Criteria) this;
        }

        public Criteria andInvoicepdfIsNull() {
            addCriterion("INVOICEPDF is null");
            return (Criteria) this;
        }

        public Criteria andInvoicepdfIsNotNull() {
            addCriterion("INVOICEPDF is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicepdfEqualTo(String value) {
            addCriterion("INVOICEPDF =", value, "invoicepdf");
            return (Criteria) this;
        }

        public Criteria andInvoicepdfNotEqualTo(String value) {
            addCriterion("INVOICEPDF <>", value, "invoicepdf");
            return (Criteria) this;
        }

        public Criteria andInvoicepdfGreaterThan(String value) {
            addCriterion("INVOICEPDF >", value, "invoicepdf");
            return (Criteria) this;
        }

        public Criteria andInvoicepdfGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICEPDF >=", value, "invoicepdf");
            return (Criteria) this;
        }

        public Criteria andInvoicepdfLessThan(String value) {
            addCriterion("INVOICEPDF <", value, "invoicepdf");
            return (Criteria) this;
        }

        public Criteria andInvoicepdfLessThanOrEqualTo(String value) {
            addCriterion("INVOICEPDF <=", value, "invoicepdf");
            return (Criteria) this;
        }

        public Criteria andInvoicepdfLike(String value) {
            addCriterion("INVOICEPDF like", value, "invoicepdf");
            return (Criteria) this;
        }

        public Criteria andInvoicepdfNotLike(String value) {
            addCriterion("INVOICEPDF not like", value, "invoicepdf");
            return (Criteria) this;
        }

        public Criteria andInvoicepdfIn(List<String> values) {
            addCriterion("INVOICEPDF in", values, "invoicepdf");
            return (Criteria) this;
        }

        public Criteria andInvoicepdfNotIn(List<String> values) {
            addCriterion("INVOICEPDF not in", values, "invoicepdf");
            return (Criteria) this;
        }

        public Criteria andInvoicepdfBetween(String value1, String value2) {
            addCriterion("INVOICEPDF between", value1, value2, "invoicepdf");
            return (Criteria) this;
        }

        public Criteria andInvoicepdfNotBetween(String value1, String value2) {
            addCriterion("INVOICEPDF not between", value1, value2, "invoicepdf");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIsNull() {
            addCriterion("CREATEDBY is null");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIsNotNull() {
            addCriterion("CREATEDBY is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedbyEqualTo(Long value) {
            addCriterion("CREATEDBY =", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotEqualTo(Long value) {
            addCriterion("CREATEDBY <>", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyGreaterThan(Long value) {
            addCriterion("CREATEDBY >", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyGreaterThanOrEqualTo(Long value) {
            addCriterion("CREATEDBY >=", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyLessThan(Long value) {
            addCriterion("CREATEDBY <", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyLessThanOrEqualTo(Long value) {
            addCriterion("CREATEDBY <=", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIn(List<Long> values) {
            addCriterion("CREATEDBY in", values, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotIn(List<Long> values) {
            addCriterion("CREATEDBY not in", values, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyBetween(Long value1, Long value2) {
            addCriterion("CREATEDBY between", value1, value2, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotBetween(Long value1, Long value2) {
            addCriterion("CREATEDBY not between", value1, value2, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedtimestampIsNull() {
            addCriterion("CREATEDTIMESTAMP is null");
            return (Criteria) this;
        }

        public Criteria andCreatedtimestampIsNotNull() {
            addCriterion("CREATEDTIMESTAMP is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedtimestampEqualTo(Date value) {
            addCriterion("CREATEDTIMESTAMP =", value, "createdtimestamp");
            return (Criteria) this;
        }

        public Criteria andCreatedtimestampNotEqualTo(Date value) {
            addCriterion("CREATEDTIMESTAMP <>", value, "createdtimestamp");
            return (Criteria) this;
        }

        public Criteria andCreatedtimestampGreaterThan(Date value) {
            addCriterion("CREATEDTIMESTAMP >", value, "createdtimestamp");
            return (Criteria) this;
        }

        public Criteria andCreatedtimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATEDTIMESTAMP >=", value, "createdtimestamp");
            return (Criteria) this;
        }

        public Criteria andCreatedtimestampLessThan(Date value) {
            addCriterion("CREATEDTIMESTAMP <", value, "createdtimestamp");
            return (Criteria) this;
        }

        public Criteria andCreatedtimestampLessThanOrEqualTo(Date value) {
            addCriterion("CREATEDTIMESTAMP <=", value, "createdtimestamp");
            return (Criteria) this;
        }

        public Criteria andCreatedtimestampIn(List<Date> values) {
            addCriterion("CREATEDTIMESTAMP in", values, "createdtimestamp");
            return (Criteria) this;
        }

        public Criteria andCreatedtimestampNotIn(List<Date> values) {
            addCriterion("CREATEDTIMESTAMP not in", values, "createdtimestamp");
            return (Criteria) this;
        }

        public Criteria andCreatedtimestampBetween(Date value1, Date value2) {
            addCriterion("CREATEDTIMESTAMP between", value1, value2, "createdtimestamp");
            return (Criteria) this;
        }

        public Criteria andCreatedtimestampNotBetween(Date value1, Date value2) {
            addCriterion("CREATEDTIMESTAMP not between", value1, value2, "createdtimestamp");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyIsNull() {
            addCriterion("LASTMODIFIEDBY is null");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyIsNotNull() {
            addCriterion("LASTMODIFIEDBY is not null");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyEqualTo(Long value) {
            addCriterion("LASTMODIFIEDBY =", value, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyNotEqualTo(Long value) {
            addCriterion("LASTMODIFIEDBY <>", value, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyGreaterThan(Long value) {
            addCriterion("LASTMODIFIEDBY >", value, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyGreaterThanOrEqualTo(Long value) {
            addCriterion("LASTMODIFIEDBY >=", value, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyLessThan(Long value) {
            addCriterion("LASTMODIFIEDBY <", value, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyLessThanOrEqualTo(Long value) {
            addCriterion("LASTMODIFIEDBY <=", value, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyIn(List<Long> values) {
            addCriterion("LASTMODIFIEDBY in", values, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyNotIn(List<Long> values) {
            addCriterion("LASTMODIFIEDBY not in", values, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyBetween(Long value1, Long value2) {
            addCriterion("LASTMODIFIEDBY between", value1, value2, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyNotBetween(Long value1, Long value2) {
            addCriterion("LASTMODIFIEDBY not between", value1, value2, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedtimestampIsNull() {
            addCriterion("LASTMODIFIEDTIMESTAMP is null");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedtimestampIsNotNull() {
            addCriterion("LASTMODIFIEDTIMESTAMP is not null");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedtimestampEqualTo(Date value) {
            addCriterion("LASTMODIFIEDTIMESTAMP =", value, "lastmodifiedtimestamp");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedtimestampNotEqualTo(Date value) {
            addCriterion("LASTMODIFIEDTIMESTAMP <>", value, "lastmodifiedtimestamp");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedtimestampGreaterThan(Date value) {
            addCriterion("LASTMODIFIEDTIMESTAMP >", value, "lastmodifiedtimestamp");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedtimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("LASTMODIFIEDTIMESTAMP >=", value, "lastmodifiedtimestamp");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedtimestampLessThan(Date value) {
            addCriterion("LASTMODIFIEDTIMESTAMP <", value, "lastmodifiedtimestamp");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedtimestampLessThanOrEqualTo(Date value) {
            addCriterion("LASTMODIFIEDTIMESTAMP <=", value, "lastmodifiedtimestamp");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedtimestampIn(List<Date> values) {
            addCriterion("LASTMODIFIEDTIMESTAMP in", values, "lastmodifiedtimestamp");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedtimestampNotIn(List<Date> values) {
            addCriterion("LASTMODIFIEDTIMESTAMP not in", values, "lastmodifiedtimestamp");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedtimestampBetween(Date value1, Date value2) {
            addCriterion("LASTMODIFIEDTIMESTAMP between", value1, value2, "lastmodifiedtimestamp");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedtimestampNotBetween(Date value1, Date value2) {
            addCriterion("LASTMODIFIEDTIMESTAMP not between", value1, value2, "lastmodifiedtimestamp");
            return (Criteria) this;
        }

        public Criteria andKprqIsNull() {
            addCriterion("KPRQ is null");
            return (Criteria) this;
        }

        public Criteria andKprqIsNotNull() {
            addCriterion("KPRQ is not null");
            return (Criteria) this;
        }

        public Criteria andKprqEqualTo(String value) {
            addCriterion("KPRQ =", value, "kprq");
            return (Criteria) this;
        }

        public Criteria andKprqNotEqualTo(String value) {
            addCriterion("KPRQ <>", value, "kprq");
            return (Criteria) this;
        }

        public Criteria andKprqGreaterThan(String value) {
            addCriterion("KPRQ >", value, "kprq");
            return (Criteria) this;
        }

        public Criteria andKprqGreaterThanOrEqualTo(String value) {
            addCriterion("KPRQ >=", value, "kprq");
            return (Criteria) this;
        }

        public Criteria andKprqLessThan(String value) {
            addCriterion("KPRQ <", value, "kprq");
            return (Criteria) this;
        }

        public Criteria andKprqLessThanOrEqualTo(String value) {
            addCriterion("KPRQ <=", value, "kprq");
            return (Criteria) this;
        }

        public Criteria andKprqLike(String value) {
            addCriterion("KPRQ like", value, "kprq");
            return (Criteria) this;
        }

        public Criteria andKprqNotLike(String value) {
            addCriterion("KPRQ not like", value, "kprq");
            return (Criteria) this;
        }

        public Criteria andKprqIn(List<String> values) {
            addCriterion("KPRQ in", values, "kprq");
            return (Criteria) this;
        }

        public Criteria andKprqNotIn(List<String> values) {
            addCriterion("KPRQ not in", values, "kprq");
            return (Criteria) this;
        }

        public Criteria andKprqBetween(String value1, String value2) {
            addCriterion("KPRQ between", value1, value2, "kprq");
            return (Criteria) this;
        }

        public Criteria andKprqNotBetween(String value1, String value2) {
            addCriterion("KPRQ not between", value1, value2, "kprq");
            return (Criteria) this;
        }

        public Criteria andEinvoiceinfostatusIsNull() {
            addCriterion("EINVOICEINFOSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andEinvoiceinfostatusIsNotNull() {
            addCriterion("EINVOICEINFOSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andEinvoiceinfostatusEqualTo(Integer value) {
            addCriterion("EINVOICEINFOSTATUS =", value, "einvoiceinfostatus");
            return (Criteria) this;
        }

        public Criteria andEinvoiceinfostatusNotEqualTo(Integer value) {
            addCriterion("EINVOICEINFOSTATUS <>", value, "einvoiceinfostatus");
            return (Criteria) this;
        }

        public Criteria andEinvoiceinfostatusGreaterThan(Integer value) {
            addCriterion("EINVOICEINFOSTATUS >", value, "einvoiceinfostatus");
            return (Criteria) this;
        }

        public Criteria andEinvoiceinfostatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("EINVOICEINFOSTATUS >=", value, "einvoiceinfostatus");
            return (Criteria) this;
        }

        public Criteria andEinvoiceinfostatusLessThan(Integer value) {
            addCriterion("EINVOICEINFOSTATUS <", value, "einvoiceinfostatus");
            return (Criteria) this;
        }

        public Criteria andEinvoiceinfostatusLessThanOrEqualTo(Integer value) {
            addCriterion("EINVOICEINFOSTATUS <=", value, "einvoiceinfostatus");
            return (Criteria) this;
        }

        public Criteria andEinvoiceinfostatusIn(List<Integer> values) {
            addCriterion("EINVOICEINFOSTATUS in", values, "einvoiceinfostatus");
            return (Criteria) this;
        }

        public Criteria andEinvoiceinfostatusNotIn(List<Integer> values) {
            addCriterion("EINVOICEINFOSTATUS not in", values, "einvoiceinfostatus");
            return (Criteria) this;
        }

        public Criteria andEinvoiceinfostatusBetween(Integer value1, Integer value2) {
            addCriterion("EINVOICEINFOSTATUS between", value1, value2, "einvoiceinfostatus");
            return (Criteria) this;
        }

        public Criteria andEinvoiceinfostatusNotBetween(Integer value1, Integer value2) {
            addCriterion("EINVOICEINFOSTATUS not between", value1, value2, "einvoiceinfostatus");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ET1_CHINA.TOAF_EORDERINVOICEINFO
     *
     * @mbggenerated do_not_delete_during_merge Thu Jul 28 13:28:02 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ET1_CHINA.TOAF_EORDERINVOICEINFO
     *
     * @mbggenerated Thu Jul 28 13:28:02 CST 2016
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}