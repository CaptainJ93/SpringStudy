package com.best1.api.entity.scm.supplier;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TscmSupplierpendingExample {
  
    protected String orderByClause;

  
    protected boolean distinct;

   
    protected List<Criteria> oredCriteria;

    public TscmSupplierpendingExample() {
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

        public Criteria andSupplierrecordidIsNull() {
            addCriterion("SUPPLIERRECORDID is null");
            return (Criteria) this;
        }

        public Criteria andSupplierrecordidIsNotNull() {
            addCriterion("SUPPLIERRECORDID is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierrecordidEqualTo(Long value) {
            addCriterion("SUPPLIERRECORDID =", value, "supplierrecordid");
            return (Criteria) this;
        }

        public Criteria andSupplierrecordidNotEqualTo(Long value) {
            addCriterion("SUPPLIERRECORDID <>", value, "supplierrecordid");
            return (Criteria) this;
        }

        public Criteria andSupplierrecordidGreaterThan(Long value) {
            addCriterion("SUPPLIERRECORDID >", value, "supplierrecordid");
            return (Criteria) this;
        }

        public Criteria andSupplierrecordidGreaterThanOrEqualTo(Long value) {
            addCriterion("SUPPLIERRECORDID >=", value, "supplierrecordid");
            return (Criteria) this;
        }

        public Criteria andSupplierrecordidLessThan(Long value) {
            addCriterion("SUPPLIERRECORDID <", value, "supplierrecordid");
            return (Criteria) this;
        }

        public Criteria andSupplierrecordidLessThanOrEqualTo(Long value) {
            addCriterion("SUPPLIERRECORDID <=", value, "supplierrecordid");
            return (Criteria) this;
        }

        public Criteria andSupplierrecordidIn(List<Long> values) {
            addCriterion("SUPPLIERRECORDID in", values, "supplierrecordid");
            return (Criteria) this;
        }

        public Criteria andSupplierrecordidNotIn(List<Long> values) {
            addCriterion("SUPPLIERRECORDID not in", values, "supplierrecordid");
            return (Criteria) this;
        }

        public Criteria andSupplierrecordidBetween(Long value1, Long value2) {
            addCriterion("SUPPLIERRECORDID between", value1, value2, "supplierrecordid");
            return (Criteria) this;
        }

        public Criteria andSupplierrecordidNotBetween(Long value1, Long value2) {
            addCriterion("SUPPLIERRECORDID not between", value1, value2, "supplierrecordid");
            return (Criteria) this;
        }

        public Criteria andSupplieridIsNull() {
            addCriterion("SUPPLIERID is null");
            return (Criteria) this;
        }

        public Criteria andSupplieridIsNotNull() {
            addCriterion("SUPPLIERID is not null");
            return (Criteria) this;
        }

        public Criteria andSupplieridEqualTo(Long value) {
            addCriterion("SUPPLIERID =", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotEqualTo(Long value) {
            addCriterion("SUPPLIERID <>", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridGreaterThan(Long value) {
            addCriterion("SUPPLIERID >", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridGreaterThanOrEqualTo(Long value) {
            addCriterion("SUPPLIERID >=", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridLessThan(Long value) {
            addCriterion("SUPPLIERID <", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridLessThanOrEqualTo(Long value) {
            addCriterion("SUPPLIERID <=", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridIn(List<Long> values) {
            addCriterion("SUPPLIERID in", values, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotIn(List<Long> values) {
            addCriterion("SUPPLIERID not in", values, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridBetween(Long value1, Long value2) {
            addCriterion("SUPPLIERID between", value1, value2, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotBetween(Long value1, Long value2) {
            addCriterion("SUPPLIERID not between", value1, value2, "supplierid");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("VERSION is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Integer value) {
            addCriterion("VERSION =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Integer value) {
            addCriterion("VERSION <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Integer value) {
            addCriterion("VERSION >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("VERSION >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Integer value) {
            addCriterion("VERSION <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Integer value) {
            addCriterion("VERSION <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Integer> values) {
            addCriterion("VERSION in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Integer> values) {
            addCriterion("VERSION not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Integer value1, Integer value2) {
            addCriterion("VERSION between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("VERSION not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andAssigneduseridIsNull() {
            addCriterion("ASSIGNEDUSERID is null");
            return (Criteria) this;
        }

        public Criteria andAssigneduseridIsNotNull() {
            addCriterion("ASSIGNEDUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andAssigneduseridEqualTo(Long value) {
            addCriterion("ASSIGNEDUSERID =", value, "assigneduserid");
            return (Criteria) this;
        }

        public Criteria andAssigneduseridNotEqualTo(Long value) {
            addCriterion("ASSIGNEDUSERID <>", value, "assigneduserid");
            return (Criteria) this;
        }

        public Criteria andAssigneduseridGreaterThan(Long value) {
            addCriterion("ASSIGNEDUSERID >", value, "assigneduserid");
            return (Criteria) this;
        }

        public Criteria andAssigneduseridGreaterThanOrEqualTo(Long value) {
            addCriterion("ASSIGNEDUSERID >=", value, "assigneduserid");
            return (Criteria) this;
        }

        public Criteria andAssigneduseridLessThan(Long value) {
            addCriterion("ASSIGNEDUSERID <", value, "assigneduserid");
            return (Criteria) this;
        }

        public Criteria andAssigneduseridLessThanOrEqualTo(Long value) {
            addCriterion("ASSIGNEDUSERID <=", value, "assigneduserid");
            return (Criteria) this;
        }

        public Criteria andAssigneduseridIn(List<Long> values) {
            addCriterion("ASSIGNEDUSERID in", values, "assigneduserid");
            return (Criteria) this;
        }

        public Criteria andAssigneduseridNotIn(List<Long> values) {
            addCriterion("ASSIGNEDUSERID not in", values, "assigneduserid");
            return (Criteria) this;
        }

        public Criteria andAssigneduseridBetween(Long value1, Long value2) {
            addCriterion("ASSIGNEDUSERID between", value1, value2, "assigneduserid");
            return (Criteria) this;
        }

        public Criteria andAssigneduseridNotBetween(Long value1, Long value2) {
            addCriterion("ASSIGNEDUSERID not between", value1, value2, "assigneduserid");
            return (Criteria) this;
        }

        public Criteria andApprovalstatusIsNull() {
            addCriterion("APPROVALSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andApprovalstatusIsNotNull() {
            addCriterion("APPROVALSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalstatusEqualTo(Integer value) {
            addCriterion("APPROVALSTATUS =", value, "approvalstatus");
            return (Criteria) this;
        }

        public Criteria andApprovalstatusNotEqualTo(Integer value) {
            addCriterion("APPROVALSTATUS <>", value, "approvalstatus");
            return (Criteria) this;
        }

        public Criteria andApprovalstatusGreaterThan(Integer value) {
            addCriterion("APPROVALSTATUS >", value, "approvalstatus");
            return (Criteria) this;
        }

        public Criteria andApprovalstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("APPROVALSTATUS >=", value, "approvalstatus");
            return (Criteria) this;
        }

        public Criteria andApprovalstatusLessThan(Integer value) {
            addCriterion("APPROVALSTATUS <", value, "approvalstatus");
            return (Criteria) this;
        }

        public Criteria andApprovalstatusLessThanOrEqualTo(Integer value) {
            addCriterion("APPROVALSTATUS <=", value, "approvalstatus");
            return (Criteria) this;
        }

        public Criteria andApprovalstatusIn(List<Integer> values) {
            addCriterion("APPROVALSTATUS in", values, "approvalstatus");
            return (Criteria) this;
        }

        public Criteria andApprovalstatusNotIn(List<Integer> values) {
            addCriterion("APPROVALSTATUS not in", values, "approvalstatus");
            return (Criteria) this;
        }

        public Criteria andApprovalstatusBetween(Integer value1, Integer value2) {
            addCriterion("APPROVALSTATUS between", value1, value2, "approvalstatus");
            return (Criteria) this;
        }

        public Criteria andApprovalstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("APPROVALSTATUS not between", value1, value2, "approvalstatus");
            return (Criteria) this;
        }

        public Criteria andPreferredcontactmethodIsNull() {
            addCriterion("PREFERREDCONTACTMETHOD is null");
            return (Criteria) this;
        }

        public Criteria andPreferredcontactmethodIsNotNull() {
            addCriterion("PREFERREDCONTACTMETHOD is not null");
            return (Criteria) this;
        }

        public Criteria andPreferredcontactmethodEqualTo(Integer value) {
            addCriterion("PREFERREDCONTACTMETHOD =", value, "preferredcontactmethod");
            return (Criteria) this;
        }

        public Criteria andPreferredcontactmethodNotEqualTo(Integer value) {
            addCriterion("PREFERREDCONTACTMETHOD <>", value, "preferredcontactmethod");
            return (Criteria) this;
        }

        public Criteria andPreferredcontactmethodGreaterThan(Integer value) {
            addCriterion("PREFERREDCONTACTMETHOD >", value, "preferredcontactmethod");
            return (Criteria) this;
        }

        public Criteria andPreferredcontactmethodGreaterThanOrEqualTo(Integer value) {
            addCriterion("PREFERREDCONTACTMETHOD >=", value, "preferredcontactmethod");
            return (Criteria) this;
        }

        public Criteria andPreferredcontactmethodLessThan(Integer value) {
            addCriterion("PREFERREDCONTACTMETHOD <", value, "preferredcontactmethod");
            return (Criteria) this;
        }

        public Criteria andPreferredcontactmethodLessThanOrEqualTo(Integer value) {
            addCriterion("PREFERREDCONTACTMETHOD <=", value, "preferredcontactmethod");
            return (Criteria) this;
        }

        public Criteria andPreferredcontactmethodIn(List<Integer> values) {
            addCriterion("PREFERREDCONTACTMETHOD in", values, "preferredcontactmethod");
            return (Criteria) this;
        }

        public Criteria andPreferredcontactmethodNotIn(List<Integer> values) {
            addCriterion("PREFERREDCONTACTMETHOD not in", values, "preferredcontactmethod");
            return (Criteria) this;
        }

        public Criteria andPreferredcontactmethodBetween(Integer value1, Integer value2) {
            addCriterion("PREFERREDCONTACTMETHOD between", value1, value2, "preferredcontactmethod");
            return (Criteria) this;
        }

        public Criteria andPreferredcontactmethodNotBetween(Integer value1, Integer value2) {
            addCriterion("PREFERREDCONTACTMETHOD not between", value1, value2, "preferredcontactmethod");
            return (Criteria) this;
        }

        public Criteria andNoofemployeesIsNull() {
            addCriterion("NOOFEMPLOYEES is null");
            return (Criteria) this;
        }

        public Criteria andNoofemployeesIsNotNull() {
            addCriterion("NOOFEMPLOYEES is not null");
            return (Criteria) this;
        }

        public Criteria andNoofemployeesEqualTo(Integer value) {
            addCriterion("NOOFEMPLOYEES =", value, "noofemployees");
            return (Criteria) this;
        }

        public Criteria andNoofemployeesNotEqualTo(Integer value) {
            addCriterion("NOOFEMPLOYEES <>", value, "noofemployees");
            return (Criteria) this;
        }

        public Criteria andNoofemployeesGreaterThan(Integer value) {
            addCriterion("NOOFEMPLOYEES >", value, "noofemployees");
            return (Criteria) this;
        }

        public Criteria andNoofemployeesGreaterThanOrEqualTo(Integer value) {
            addCriterion("NOOFEMPLOYEES >=", value, "noofemployees");
            return (Criteria) this;
        }

        public Criteria andNoofemployeesLessThan(Integer value) {
            addCriterion("NOOFEMPLOYEES <", value, "noofemployees");
            return (Criteria) this;
        }

        public Criteria andNoofemployeesLessThanOrEqualTo(Integer value) {
            addCriterion("NOOFEMPLOYEES <=", value, "noofemployees");
            return (Criteria) this;
        }

        public Criteria andNoofemployeesIn(List<Integer> values) {
            addCriterion("NOOFEMPLOYEES in", values, "noofemployees");
            return (Criteria) this;
        }

        public Criteria andNoofemployeesNotIn(List<Integer> values) {
            addCriterion("NOOFEMPLOYEES not in", values, "noofemployees");
            return (Criteria) this;
        }

        public Criteria andNoofemployeesBetween(Integer value1, Integer value2) {
            addCriterion("NOOFEMPLOYEES between", value1, value2, "noofemployees");
            return (Criteria) this;
        }

        public Criteria andNoofemployeesNotBetween(Integer value1, Integer value2) {
            addCriterion("NOOFEMPLOYEES not between", value1, value2, "noofemployees");
            return (Criteria) this;
        }

        public Criteria andNoofproductsdealtIsNull() {
            addCriterion("NOOFPRODUCTSDEALT is null");
            return (Criteria) this;
        }

        public Criteria andNoofproductsdealtIsNotNull() {
            addCriterion("NOOFPRODUCTSDEALT is not null");
            return (Criteria) this;
        }

        public Criteria andNoofproductsdealtEqualTo(Long value) {
            addCriterion("NOOFPRODUCTSDEALT =", value, "noofproductsdealt");
            return (Criteria) this;
        }

        public Criteria andNoofproductsdealtNotEqualTo(Long value) {
            addCriterion("NOOFPRODUCTSDEALT <>", value, "noofproductsdealt");
            return (Criteria) this;
        }

        public Criteria andNoofproductsdealtGreaterThan(Long value) {
            addCriterion("NOOFPRODUCTSDEALT >", value, "noofproductsdealt");
            return (Criteria) this;
        }

        public Criteria andNoofproductsdealtGreaterThanOrEqualTo(Long value) {
            addCriterion("NOOFPRODUCTSDEALT >=", value, "noofproductsdealt");
            return (Criteria) this;
        }

        public Criteria andNoofproductsdealtLessThan(Long value) {
            addCriterion("NOOFPRODUCTSDEALT <", value, "noofproductsdealt");
            return (Criteria) this;
        }

        public Criteria andNoofproductsdealtLessThanOrEqualTo(Long value) {
            addCriterion("NOOFPRODUCTSDEALT <=", value, "noofproductsdealt");
            return (Criteria) this;
        }

        public Criteria andNoofproductsdealtIn(List<Long> values) {
            addCriterion("NOOFPRODUCTSDEALT in", values, "noofproductsdealt");
            return (Criteria) this;
        }

        public Criteria andNoofproductsdealtNotIn(List<Long> values) {
            addCriterion("NOOFPRODUCTSDEALT not in", values, "noofproductsdealt");
            return (Criteria) this;
        }

        public Criteria andNoofproductsdealtBetween(Long value1, Long value2) {
            addCriterion("NOOFPRODUCTSDEALT between", value1, value2, "noofproductsdealt");
            return (Criteria) this;
        }

        public Criteria andNoofproductsdealtNotBetween(Long value1, Long value2) {
            addCriterion("NOOFPRODUCTSDEALT not between", value1, value2, "noofproductsdealt");
            return (Criteria) this;
        }

        public Criteria andTurnoverpreviousyearIsNull() {
            addCriterion("TURNOVERPREVIOUSYEAR is null");
            return (Criteria) this;
        }

        public Criteria andTurnoverpreviousyearIsNotNull() {
            addCriterion("TURNOVERPREVIOUSYEAR is not null");
            return (Criteria) this;
        }

        public Criteria andTurnoverpreviousyearEqualTo(Long value) {
            addCriterion("TURNOVERPREVIOUSYEAR =", value, "turnoverpreviousyear");
            return (Criteria) this;
        }

        public Criteria andTurnoverpreviousyearNotEqualTo(Long value) {
            addCriterion("TURNOVERPREVIOUSYEAR <>", value, "turnoverpreviousyear");
            return (Criteria) this;
        }

        public Criteria andTurnoverpreviousyearGreaterThan(Long value) {
            addCriterion("TURNOVERPREVIOUSYEAR >", value, "turnoverpreviousyear");
            return (Criteria) this;
        }

        public Criteria andTurnoverpreviousyearGreaterThanOrEqualTo(Long value) {
            addCriterion("TURNOVERPREVIOUSYEAR >=", value, "turnoverpreviousyear");
            return (Criteria) this;
        }

        public Criteria andTurnoverpreviousyearLessThan(Long value) {
            addCriterion("TURNOVERPREVIOUSYEAR <", value, "turnoverpreviousyear");
            return (Criteria) this;
        }

        public Criteria andTurnoverpreviousyearLessThanOrEqualTo(Long value) {
            addCriterion("TURNOVERPREVIOUSYEAR <=", value, "turnoverpreviousyear");
            return (Criteria) this;
        }

        public Criteria andTurnoverpreviousyearIn(List<Long> values) {
            addCriterion("TURNOVERPREVIOUSYEAR in", values, "turnoverpreviousyear");
            return (Criteria) this;
        }

        public Criteria andTurnoverpreviousyearNotIn(List<Long> values) {
            addCriterion("TURNOVERPREVIOUSYEAR not in", values, "turnoverpreviousyear");
            return (Criteria) this;
        }

        public Criteria andTurnoverpreviousyearBetween(Long value1, Long value2) {
            addCriterion("TURNOVERPREVIOUSYEAR between", value1, value2, "turnoverpreviousyear");
            return (Criteria) this;
        }

        public Criteria andTurnoverpreviousyearNotBetween(Long value1, Long value2) {
            addCriterion("TURNOVERPREVIOUSYEAR not between", value1, value2, "turnoverpreviousyear");
            return (Criteria) this;
        }

        public Criteria andRevenuegeneratedIsNull() {
            addCriterion("REVENUEGENERATED is null");
            return (Criteria) this;
        }

        public Criteria andRevenuegeneratedIsNotNull() {
            addCriterion("REVENUEGENERATED is not null");
            return (Criteria) this;
        }

        public Criteria andRevenuegeneratedEqualTo(Long value) {
            addCriterion("REVENUEGENERATED =", value, "revenuegenerated");
            return (Criteria) this;
        }

        public Criteria andRevenuegeneratedNotEqualTo(Long value) {
            addCriterion("REVENUEGENERATED <>", value, "revenuegenerated");
            return (Criteria) this;
        }

        public Criteria andRevenuegeneratedGreaterThan(Long value) {
            addCriterion("REVENUEGENERATED >", value, "revenuegenerated");
            return (Criteria) this;
        }

        public Criteria andRevenuegeneratedGreaterThanOrEqualTo(Long value) {
            addCriterion("REVENUEGENERATED >=", value, "revenuegenerated");
            return (Criteria) this;
        }

        public Criteria andRevenuegeneratedLessThan(Long value) {
            addCriterion("REVENUEGENERATED <", value, "revenuegenerated");
            return (Criteria) this;
        }

        public Criteria andRevenuegeneratedLessThanOrEqualTo(Long value) {
            addCriterion("REVENUEGENERATED <=", value, "revenuegenerated");
            return (Criteria) this;
        }

        public Criteria andRevenuegeneratedIn(List<Long> values) {
            addCriterion("REVENUEGENERATED in", values, "revenuegenerated");
            return (Criteria) this;
        }

        public Criteria andRevenuegeneratedNotIn(List<Long> values) {
            addCriterion("REVENUEGENERATED not in", values, "revenuegenerated");
            return (Criteria) this;
        }

        public Criteria andRevenuegeneratedBetween(Long value1, Long value2) {
            addCriterion("REVENUEGENERATED between", value1, value2, "revenuegenerated");
            return (Criteria) this;
        }

        public Criteria andRevenuegeneratedNotBetween(Long value1, Long value2) {
            addCriterion("REVENUEGENERATED not between", value1, value2, "revenuegenerated");
            return (Criteria) this;
        }

        public Criteria andHassignedcontractIsNull() {
            addCriterion("HASSIGNEDCONTRACT is null");
            return (Criteria) this;
        }

        public Criteria andHassignedcontractIsNotNull() {
            addCriterion("HASSIGNEDCONTRACT is not null");
            return (Criteria) this;
        }

        public Criteria andHassignedcontractEqualTo(String value) {
            addCriterion("HASSIGNEDCONTRACT =", value, "hassignedcontract");
            return (Criteria) this;
        }

        public Criteria andHassignedcontractNotEqualTo(String value) {
            addCriterion("HASSIGNEDCONTRACT <>", value, "hassignedcontract");
            return (Criteria) this;
        }

        public Criteria andHassignedcontractGreaterThan(String value) {
            addCriterion("HASSIGNEDCONTRACT >", value, "hassignedcontract");
            return (Criteria) this;
        }

        public Criteria andHassignedcontractGreaterThanOrEqualTo(String value) {
            addCriterion("HASSIGNEDCONTRACT >=", value, "hassignedcontract");
            return (Criteria) this;
        }

        public Criteria andHassignedcontractLessThan(String value) {
            addCriterion("HASSIGNEDCONTRACT <", value, "hassignedcontract");
            return (Criteria) this;
        }

        public Criteria andHassignedcontractLessThanOrEqualTo(String value) {
            addCriterion("HASSIGNEDCONTRACT <=", value, "hassignedcontract");
            return (Criteria) this;
        }

        public Criteria andHassignedcontractLike(String value) {
            addCriterion("HASSIGNEDCONTRACT like", value, "hassignedcontract");
            return (Criteria) this;
        }

        public Criteria andHassignedcontractNotLike(String value) {
            addCriterion("HASSIGNEDCONTRACT not like", value, "hassignedcontract");
            return (Criteria) this;
        }

        public Criteria andHassignedcontractIn(List<String> values) {
            addCriterion("HASSIGNEDCONTRACT in", values, "hassignedcontract");
            return (Criteria) this;
        }

        public Criteria andHassignedcontractNotIn(List<String> values) {
            addCriterion("HASSIGNEDCONTRACT not in", values, "hassignedcontract");
            return (Criteria) this;
        }

        public Criteria andHassignedcontractBetween(String value1, String value2) {
            addCriterion("HASSIGNEDCONTRACT between", value1, value2, "hassignedcontract");
            return (Criteria) this;
        }

        public Criteria andHassignedcontractNotBetween(String value1, String value2) {
            addCriterion("HASSIGNEDCONTRACT not between", value1, value2, "hassignedcontract");
            return (Criteria) this;
        }

        public Criteria andSuppliernameIsNull() {
            addCriterion("SUPPLIERNAME is null");
            return (Criteria) this;
        }

        public Criteria andSuppliernameIsNotNull() {
            addCriterion("SUPPLIERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andSuppliernameEqualTo(String value) {
            addCriterion("SUPPLIERNAME =", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotEqualTo(String value) {
            addCriterion("SUPPLIERNAME <>", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameGreaterThan(String value) {
            addCriterion("SUPPLIERNAME >", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIERNAME >=", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameLessThan(String value) {
            addCriterion("SUPPLIERNAME <", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIERNAME <=", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameLike(String value) {
            addCriterion("SUPPLIERNAME like", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotLike(String value) {
            addCriterion("SUPPLIERNAME not like", value, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameIn(List<String> values) {
            addCriterion("SUPPLIERNAME in", values, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotIn(List<String> values) {
            addCriterion("SUPPLIERNAME not in", values, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameBetween(String value1, String value2) {
            addCriterion("SUPPLIERNAME between", value1, value2, "suppliername");
            return (Criteria) this;
        }

        public Criteria andSuppliernameNotBetween(String value1, String value2) {
            addCriterion("SUPPLIERNAME not between", value1, value2, "suppliername");
            return (Criteria) this;
        }

        public Criteria andDefaultproductnameIsNull() {
            addCriterion("DEFAULTPRODUCTNAME is null");
            return (Criteria) this;
        }

        public Criteria andDefaultproductnameIsNotNull() {
            addCriterion("DEFAULTPRODUCTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultproductnameEqualTo(Long value) {
            addCriterion("DEFAULTPRODUCTNAME =", value, "defaultproductname");
            return (Criteria) this;
        }

        public Criteria andDefaultproductnameNotEqualTo(Long value) {
            addCriterion("DEFAULTPRODUCTNAME <>", value, "defaultproductname");
            return (Criteria) this;
        }

        public Criteria andDefaultproductnameGreaterThan(Long value) {
            addCriterion("DEFAULTPRODUCTNAME >", value, "defaultproductname");
            return (Criteria) this;
        }

        public Criteria andDefaultproductnameGreaterThanOrEqualTo(Long value) {
            addCriterion("DEFAULTPRODUCTNAME >=", value, "defaultproductname");
            return (Criteria) this;
        }

        public Criteria andDefaultproductnameLessThan(Long value) {
            addCriterion("DEFAULTPRODUCTNAME <", value, "defaultproductname");
            return (Criteria) this;
        }

        public Criteria andDefaultproductnameLessThanOrEqualTo(Long value) {
            addCriterion("DEFAULTPRODUCTNAME <=", value, "defaultproductname");
            return (Criteria) this;
        }

        public Criteria andDefaultproductnameIn(List<Long> values) {
            addCriterion("DEFAULTPRODUCTNAME in", values, "defaultproductname");
            return (Criteria) this;
        }

        public Criteria andDefaultproductnameNotIn(List<Long> values) {
            addCriterion("DEFAULTPRODUCTNAME not in", values, "defaultproductname");
            return (Criteria) this;
        }

        public Criteria andDefaultproductnameBetween(Long value1, Long value2) {
            addCriterion("DEFAULTPRODUCTNAME between", value1, value2, "defaultproductname");
            return (Criteria) this;
        }

        public Criteria andDefaultproductnameNotBetween(Long value1, Long value2) {
            addCriterion("DEFAULTPRODUCTNAME not between", value1, value2, "defaultproductname");
            return (Criteria) this;
        }

        public Criteria andContactpersonIsNull() {
            addCriterion("CONTACTPERSON is null");
            return (Criteria) this;
        }

        public Criteria andContactpersonIsNotNull() {
            addCriterion("CONTACTPERSON is not null");
            return (Criteria) this;
        }

        public Criteria andContactpersonEqualTo(String value) {
            addCriterion("CONTACTPERSON =", value, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactpersonNotEqualTo(String value) {
            addCriterion("CONTACTPERSON <>", value, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactpersonGreaterThan(String value) {
            addCriterion("CONTACTPERSON >", value, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactpersonGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACTPERSON >=", value, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactpersonLessThan(String value) {
            addCriterion("CONTACTPERSON <", value, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactpersonLessThanOrEqualTo(String value) {
            addCriterion("CONTACTPERSON <=", value, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactpersonLike(String value) {
            addCriterion("CONTACTPERSON like", value, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactpersonNotLike(String value) {
            addCriterion("CONTACTPERSON not like", value, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactpersonIn(List<String> values) {
            addCriterion("CONTACTPERSON in", values, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactpersonNotIn(List<String> values) {
            addCriterion("CONTACTPERSON not in", values, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactpersonBetween(String value1, String value2) {
            addCriterion("CONTACTPERSON between", value1, value2, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactpersonNotBetween(String value1, String value2) {
            addCriterion("CONTACTPERSON not between", value1, value2, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactpersonroleIsNull() {
            addCriterion("CONTACTPERSONROLE is null");
            return (Criteria) this;
        }

        public Criteria andContactpersonroleIsNotNull() {
            addCriterion("CONTACTPERSONROLE is not null");
            return (Criteria) this;
        }

        public Criteria andContactpersonroleEqualTo(String value) {
            addCriterion("CONTACTPERSONROLE =", value, "contactpersonrole");
            return (Criteria) this;
        }

        public Criteria andContactpersonroleNotEqualTo(String value) {
            addCriterion("CONTACTPERSONROLE <>", value, "contactpersonrole");
            return (Criteria) this;
        }

        public Criteria andContactpersonroleGreaterThan(String value) {
            addCriterion("CONTACTPERSONROLE >", value, "contactpersonrole");
            return (Criteria) this;
        }

        public Criteria andContactpersonroleGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACTPERSONROLE >=", value, "contactpersonrole");
            return (Criteria) this;
        }

        public Criteria andContactpersonroleLessThan(String value) {
            addCriterion("CONTACTPERSONROLE <", value, "contactpersonrole");
            return (Criteria) this;
        }

        public Criteria andContactpersonroleLessThanOrEqualTo(String value) {
            addCriterion("CONTACTPERSONROLE <=", value, "contactpersonrole");
            return (Criteria) this;
        }

        public Criteria andContactpersonroleLike(String value) {
            addCriterion("CONTACTPERSONROLE like", value, "contactpersonrole");
            return (Criteria) this;
        }

        public Criteria andContactpersonroleNotLike(String value) {
            addCriterion("CONTACTPERSONROLE not like", value, "contactpersonrole");
            return (Criteria) this;
        }

        public Criteria andContactpersonroleIn(List<String> values) {
            addCriterion("CONTACTPERSONROLE in", values, "contactpersonrole");
            return (Criteria) this;
        }

        public Criteria andContactpersonroleNotIn(List<String> values) {
            addCriterion("CONTACTPERSONROLE not in", values, "contactpersonrole");
            return (Criteria) this;
        }

        public Criteria andContactpersonroleBetween(String value1, String value2) {
            addCriterion("CONTACTPERSONROLE between", value1, value2, "contactpersonrole");
            return (Criteria) this;
        }

        public Criteria andContactpersonroleNotBetween(String value1, String value2) {
            addCriterion("CONTACTPERSONROLE not between", value1, value2, "contactpersonrole");
            return (Criteria) this;
        }

        public Criteria andContactdepartmentIsNull() {
            addCriterion("CONTACTDEPARTMENT is null");
            return (Criteria) this;
        }

        public Criteria andContactdepartmentIsNotNull() {
            addCriterion("CONTACTDEPARTMENT is not null");
            return (Criteria) this;
        }

        public Criteria andContactdepartmentEqualTo(String value) {
            addCriterion("CONTACTDEPARTMENT =", value, "contactdepartment");
            return (Criteria) this;
        }

        public Criteria andContactdepartmentNotEqualTo(String value) {
            addCriterion("CONTACTDEPARTMENT <>", value, "contactdepartment");
            return (Criteria) this;
        }

        public Criteria andContactdepartmentGreaterThan(String value) {
            addCriterion("CONTACTDEPARTMENT >", value, "contactdepartment");
            return (Criteria) this;
        }

        public Criteria andContactdepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACTDEPARTMENT >=", value, "contactdepartment");
            return (Criteria) this;
        }

        public Criteria andContactdepartmentLessThan(String value) {
            addCriterion("CONTACTDEPARTMENT <", value, "contactdepartment");
            return (Criteria) this;
        }

        public Criteria andContactdepartmentLessThanOrEqualTo(String value) {
            addCriterion("CONTACTDEPARTMENT <=", value, "contactdepartment");
            return (Criteria) this;
        }

        public Criteria andContactdepartmentLike(String value) {
            addCriterion("CONTACTDEPARTMENT like", value, "contactdepartment");
            return (Criteria) this;
        }

        public Criteria andContactdepartmentNotLike(String value) {
            addCriterion("CONTACTDEPARTMENT not like", value, "contactdepartment");
            return (Criteria) this;
        }

        public Criteria andContactdepartmentIn(List<String> values) {
            addCriterion("CONTACTDEPARTMENT in", values, "contactdepartment");
            return (Criteria) this;
        }

        public Criteria andContactdepartmentNotIn(List<String> values) {
            addCriterion("CONTACTDEPARTMENT not in", values, "contactdepartment");
            return (Criteria) this;
        }

        public Criteria andContactdepartmentBetween(String value1, String value2) {
            addCriterion("CONTACTDEPARTMENT between", value1, value2, "contactdepartment");
            return (Criteria) this;
        }

        public Criteria andContactdepartmentNotBetween(String value1, String value2) {
            addCriterion("CONTACTDEPARTMENT not between", value1, value2, "contactdepartment");
            return (Criteria) this;
        }

        public Criteria andContactpersonemailidIsNull() {
            addCriterion("CONTACTPERSONEMAILID is null");
            return (Criteria) this;
        }

        public Criteria andContactpersonemailidIsNotNull() {
            addCriterion("CONTACTPERSONEMAILID is not null");
            return (Criteria) this;
        }

        public Criteria andContactpersonemailidEqualTo(String value) {
            addCriterion("CONTACTPERSONEMAILID =", value, "contactpersonemailid");
            return (Criteria) this;
        }

        public Criteria andContactpersonemailidNotEqualTo(String value) {
            addCriterion("CONTACTPERSONEMAILID <>", value, "contactpersonemailid");
            return (Criteria) this;
        }

        public Criteria andContactpersonemailidGreaterThan(String value) {
            addCriterion("CONTACTPERSONEMAILID >", value, "contactpersonemailid");
            return (Criteria) this;
        }

        public Criteria andContactpersonemailidGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACTPERSONEMAILID >=", value, "contactpersonemailid");
            return (Criteria) this;
        }

        public Criteria andContactpersonemailidLessThan(String value) {
            addCriterion("CONTACTPERSONEMAILID <", value, "contactpersonemailid");
            return (Criteria) this;
        }

        public Criteria andContactpersonemailidLessThanOrEqualTo(String value) {
            addCriterion("CONTACTPERSONEMAILID <=", value, "contactpersonemailid");
            return (Criteria) this;
        }

        public Criteria andContactpersonemailidLike(String value) {
            addCriterion("CONTACTPERSONEMAILID like", value, "contactpersonemailid");
            return (Criteria) this;
        }

        public Criteria andContactpersonemailidNotLike(String value) {
            addCriterion("CONTACTPERSONEMAILID not like", value, "contactpersonemailid");
            return (Criteria) this;
        }

        public Criteria andContactpersonemailidIn(List<String> values) {
            addCriterion("CONTACTPERSONEMAILID in", values, "contactpersonemailid");
            return (Criteria) this;
        }

        public Criteria andContactpersonemailidNotIn(List<String> values) {
            addCriterion("CONTACTPERSONEMAILID not in", values, "contactpersonemailid");
            return (Criteria) this;
        }

        public Criteria andContactpersonemailidBetween(String value1, String value2) {
            addCriterion("CONTACTPERSONEMAILID between", value1, value2, "contactpersonemailid");
            return (Criteria) this;
        }

        public Criteria andContactpersonemailidNotBetween(String value1, String value2) {
            addCriterion("CONTACTPERSONEMAILID not between", value1, value2, "contactpersonemailid");
            return (Criteria) this;
        }

        public Criteria andRegistrationdonebyIsNull() {
            addCriterion("REGISTRATIONDONEBY is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationdonebyIsNotNull() {
            addCriterion("REGISTRATIONDONEBY is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationdonebyEqualTo(String value) {
            addCriterion("REGISTRATIONDONEBY =", value, "registrationdoneby");
            return (Criteria) this;
        }

        public Criteria andRegistrationdonebyNotEqualTo(String value) {
            addCriterion("REGISTRATIONDONEBY <>", value, "registrationdoneby");
            return (Criteria) this;
        }

        public Criteria andRegistrationdonebyGreaterThan(String value) {
            addCriterion("REGISTRATIONDONEBY >", value, "registrationdoneby");
            return (Criteria) this;
        }

        public Criteria andRegistrationdonebyGreaterThanOrEqualTo(String value) {
            addCriterion("REGISTRATIONDONEBY >=", value, "registrationdoneby");
            return (Criteria) this;
        }

        public Criteria andRegistrationdonebyLessThan(String value) {
            addCriterion("REGISTRATIONDONEBY <", value, "registrationdoneby");
            return (Criteria) this;
        }

        public Criteria andRegistrationdonebyLessThanOrEqualTo(String value) {
            addCriterion("REGISTRATIONDONEBY <=", value, "registrationdoneby");
            return (Criteria) this;
        }

        public Criteria andRegistrationdonebyLike(String value) {
            addCriterion("REGISTRATIONDONEBY like", value, "registrationdoneby");
            return (Criteria) this;
        }

        public Criteria andRegistrationdonebyNotLike(String value) {
            addCriterion("REGISTRATIONDONEBY not like", value, "registrationdoneby");
            return (Criteria) this;
        }

        public Criteria andRegistrationdonebyIn(List<String> values) {
            addCriterion("REGISTRATIONDONEBY in", values, "registrationdoneby");
            return (Criteria) this;
        }

        public Criteria andRegistrationdonebyNotIn(List<String> values) {
            addCriterion("REGISTRATIONDONEBY not in", values, "registrationdoneby");
            return (Criteria) this;
        }

        public Criteria andRegistrationdonebyBetween(String value1, String value2) {
            addCriterion("REGISTRATIONDONEBY between", value1, value2, "registrationdoneby");
            return (Criteria) this;
        }

        public Criteria andRegistrationdonebyNotBetween(String value1, String value2) {
            addCriterion("REGISTRATIONDONEBY not between", value1, value2, "registrationdoneby");
            return (Criteria) this;
        }

        public Criteria andSuppliercompanynameIsNull() {
            addCriterion("SUPPLIERCOMPANYNAME is null");
            return (Criteria) this;
        }

        public Criteria andSuppliercompanynameIsNotNull() {
            addCriterion("SUPPLIERCOMPANYNAME is not null");
            return (Criteria) this;
        }

        public Criteria andSuppliercompanynameEqualTo(String value) {
            addCriterion("SUPPLIERCOMPANYNAME =", value, "suppliercompanyname");
            return (Criteria) this;
        }

        public Criteria andSuppliercompanynameNotEqualTo(String value) {
            addCriterion("SUPPLIERCOMPANYNAME <>", value, "suppliercompanyname");
            return (Criteria) this;
        }

        public Criteria andSuppliercompanynameGreaterThan(String value) {
            addCriterion("SUPPLIERCOMPANYNAME >", value, "suppliercompanyname");
            return (Criteria) this;
        }

        public Criteria andSuppliercompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIERCOMPANYNAME >=", value, "suppliercompanyname");
            return (Criteria) this;
        }

        public Criteria andSuppliercompanynameLessThan(String value) {
            addCriterion("SUPPLIERCOMPANYNAME <", value, "suppliercompanyname");
            return (Criteria) this;
        }

        public Criteria andSuppliercompanynameLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIERCOMPANYNAME <=", value, "suppliercompanyname");
            return (Criteria) this;
        }

        public Criteria andSuppliercompanynameLike(String value) {
            addCriterion("SUPPLIERCOMPANYNAME like", value, "suppliercompanyname");
            return (Criteria) this;
        }

        public Criteria andSuppliercompanynameNotLike(String value) {
            addCriterion("SUPPLIERCOMPANYNAME not like", value, "suppliercompanyname");
            return (Criteria) this;
        }

        public Criteria andSuppliercompanynameIn(List<String> values) {
            addCriterion("SUPPLIERCOMPANYNAME in", values, "suppliercompanyname");
            return (Criteria) this;
        }

        public Criteria andSuppliercompanynameNotIn(List<String> values) {
            addCriterion("SUPPLIERCOMPANYNAME not in", values, "suppliercompanyname");
            return (Criteria) this;
        }

        public Criteria andSuppliercompanynameBetween(String value1, String value2) {
            addCriterion("SUPPLIERCOMPANYNAME between", value1, value2, "suppliercompanyname");
            return (Criteria) this;
        }

        public Criteria andSuppliercompanynameNotBetween(String value1, String value2) {
            addCriterion("SUPPLIERCOMPANYNAME not between", value1, value2, "suppliercompanyname");
            return (Criteria) this;
        }

        public Criteria andCompanyhomepageIsNull() {
            addCriterion("COMPANYHOMEPAGE is null");
            return (Criteria) this;
        }

        public Criteria andCompanyhomepageIsNotNull() {
            addCriterion("COMPANYHOMEPAGE is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyhomepageEqualTo(String value) {
            addCriterion("COMPANYHOMEPAGE =", value, "companyhomepage");
            return (Criteria) this;
        }

        public Criteria andCompanyhomepageNotEqualTo(String value) {
            addCriterion("COMPANYHOMEPAGE <>", value, "companyhomepage");
            return (Criteria) this;
        }

        public Criteria andCompanyhomepageGreaterThan(String value) {
            addCriterion("COMPANYHOMEPAGE >", value, "companyhomepage");
            return (Criteria) this;
        }

        public Criteria andCompanyhomepageGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANYHOMEPAGE >=", value, "companyhomepage");
            return (Criteria) this;
        }

        public Criteria andCompanyhomepageLessThan(String value) {
            addCriterion("COMPANYHOMEPAGE <", value, "companyhomepage");
            return (Criteria) this;
        }

        public Criteria andCompanyhomepageLessThanOrEqualTo(String value) {
            addCriterion("COMPANYHOMEPAGE <=", value, "companyhomepage");
            return (Criteria) this;
        }

        public Criteria andCompanyhomepageLike(String value) {
            addCriterion("COMPANYHOMEPAGE like", value, "companyhomepage");
            return (Criteria) this;
        }

        public Criteria andCompanyhomepageNotLike(String value) {
            addCriterion("COMPANYHOMEPAGE not like", value, "companyhomepage");
            return (Criteria) this;
        }

        public Criteria andCompanyhomepageIn(List<String> values) {
            addCriterion("COMPANYHOMEPAGE in", values, "companyhomepage");
            return (Criteria) this;
        }

        public Criteria andCompanyhomepageNotIn(List<String> values) {
            addCriterion("COMPANYHOMEPAGE not in", values, "companyhomepage");
            return (Criteria) this;
        }

        public Criteria andCompanyhomepageBetween(String value1, String value2) {
            addCriterion("COMPANYHOMEPAGE between", value1, value2, "companyhomepage");
            return (Criteria) this;
        }

        public Criteria andCompanyhomepageNotBetween(String value1, String value2) {
            addCriterion("COMPANYHOMEPAGE not between", value1, value2, "companyhomepage");
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

        public Criteria andPaymentdayIsNull() {
            addCriterion("PAYMENTDAY is null");
            return (Criteria) this;
        }

        public Criteria andPaymentdayIsNotNull() {
            addCriterion("PAYMENTDAY is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentdayEqualTo(Integer value) {
            addCriterion("PAYMENTDAY =", value, "paymentday");
            return (Criteria) this;
        }

        public Criteria andPaymentdayNotEqualTo(Integer value) {
            addCriterion("PAYMENTDAY <>", value, "paymentday");
            return (Criteria) this;
        }

        public Criteria andPaymentdayGreaterThan(Integer value) {
            addCriterion("PAYMENTDAY >", value, "paymentday");
            return (Criteria) this;
        }

        public Criteria andPaymentdayGreaterThanOrEqualTo(Integer value) {
            addCriterion("PAYMENTDAY >=", value, "paymentday");
            return (Criteria) this;
        }

        public Criteria andPaymentdayLessThan(Integer value) {
            addCriterion("PAYMENTDAY <", value, "paymentday");
            return (Criteria) this;
        }

        public Criteria andPaymentdayLessThanOrEqualTo(Integer value) {
            addCriterion("PAYMENTDAY <=", value, "paymentday");
            return (Criteria) this;
        }

        public Criteria andPaymentdayIn(List<Integer> values) {
            addCriterion("PAYMENTDAY in", values, "paymentday");
            return (Criteria) this;
        }

        public Criteria andPaymentdayNotIn(List<Integer> values) {
            addCriterion("PAYMENTDAY not in", values, "paymentday");
            return (Criteria) this;
        }

        public Criteria andPaymentdayBetween(Integer value1, Integer value2) {
            addCriterion("PAYMENTDAY between", value1, value2, "paymentday");
            return (Criteria) this;
        }

        public Criteria andPaymentdayNotBetween(Integer value1, Integer value2) {
            addCriterion("PAYMENTDAY not between", value1, value2, "paymentday");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodIsNull() {
            addCriterion("PAYMENTMETHOD is null");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodIsNotNull() {
            addCriterion("PAYMENTMETHOD is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodEqualTo(Integer value) {
            addCriterion("PAYMENTMETHOD =", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodNotEqualTo(Integer value) {
            addCriterion("PAYMENTMETHOD <>", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodGreaterThan(Integer value) {
            addCriterion("PAYMENTMETHOD >", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodGreaterThanOrEqualTo(Integer value) {
            addCriterion("PAYMENTMETHOD >=", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodLessThan(Integer value) {
            addCriterion("PAYMENTMETHOD <", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodLessThanOrEqualTo(Integer value) {
            addCriterion("PAYMENTMETHOD <=", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodIn(List<Integer> values) {
            addCriterion("PAYMENTMETHOD in", values, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodNotIn(List<Integer> values) {
            addCriterion("PAYMENTMETHOD not in", values, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodBetween(Integer value1, Integer value2) {
            addCriterion("PAYMENTMETHOD between", value1, value2, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodNotBetween(Integer value1, Integer value2) {
            addCriterion("PAYMENTMETHOD not between", value1, value2, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andMaxloadqtyIsNull() {
            addCriterion("MAXLOADQTY is null");
            return (Criteria) this;
        }

        public Criteria andMaxloadqtyIsNotNull() {
            addCriterion("MAXLOADQTY is not null");
            return (Criteria) this;
        }

        public Criteria andMaxloadqtyEqualTo(Long value) {
            addCriterion("MAXLOADQTY =", value, "maxloadqty");
            return (Criteria) this;
        }

        public Criteria andMaxloadqtyNotEqualTo(Long value) {
            addCriterion("MAXLOADQTY <>", value, "maxloadqty");
            return (Criteria) this;
        }

        public Criteria andMaxloadqtyGreaterThan(Long value) {
            addCriterion("MAXLOADQTY >", value, "maxloadqty");
            return (Criteria) this;
        }

        public Criteria andMaxloadqtyGreaterThanOrEqualTo(Long value) {
            addCriterion("MAXLOADQTY >=", value, "maxloadqty");
            return (Criteria) this;
        }

        public Criteria andMaxloadqtyLessThan(Long value) {
            addCriterion("MAXLOADQTY <", value, "maxloadqty");
            return (Criteria) this;
        }

        public Criteria andMaxloadqtyLessThanOrEqualTo(Long value) {
            addCriterion("MAXLOADQTY <=", value, "maxloadqty");
            return (Criteria) this;
        }

        public Criteria andMaxloadqtyIn(List<Long> values) {
            addCriterion("MAXLOADQTY in", values, "maxloadqty");
            return (Criteria) this;
        }

        public Criteria andMaxloadqtyNotIn(List<Long> values) {
            addCriterion("MAXLOADQTY not in", values, "maxloadqty");
            return (Criteria) this;
        }

        public Criteria andMaxloadqtyBetween(Long value1, Long value2) {
            addCriterion("MAXLOADQTY between", value1, value2, "maxloadqty");
            return (Criteria) this;
        }

        public Criteria andMaxloadqtyNotBetween(Long value1, Long value2) {
            addCriterion("MAXLOADQTY not between", value1, value2, "maxloadqty");
            return (Criteria) this;
        }

        public Criteria andSupplierlevelIsNull() {
            addCriterion("SUPPLIERLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andSupplierlevelIsNotNull() {
            addCriterion("SUPPLIERLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierlevelEqualTo(Integer value) {
            addCriterion("SUPPLIERLEVEL =", value, "supplierlevel");
            return (Criteria) this;
        }

        public Criteria andSupplierlevelNotEqualTo(Integer value) {
            addCriterion("SUPPLIERLEVEL <>", value, "supplierlevel");
            return (Criteria) this;
        }

        public Criteria andSupplierlevelGreaterThan(Integer value) {
            addCriterion("SUPPLIERLEVEL >", value, "supplierlevel");
            return (Criteria) this;
        }

        public Criteria andSupplierlevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("SUPPLIERLEVEL >=", value, "supplierlevel");
            return (Criteria) this;
        }

        public Criteria andSupplierlevelLessThan(Integer value) {
            addCriterion("SUPPLIERLEVEL <", value, "supplierlevel");
            return (Criteria) this;
        }

        public Criteria andSupplierlevelLessThanOrEqualTo(Integer value) {
            addCriterion("SUPPLIERLEVEL <=", value, "supplierlevel");
            return (Criteria) this;
        }

        public Criteria andSupplierlevelIn(List<Integer> values) {
            addCriterion("SUPPLIERLEVEL in", values, "supplierlevel");
            return (Criteria) this;
        }

        public Criteria andSupplierlevelNotIn(List<Integer> values) {
            addCriterion("SUPPLIERLEVEL not in", values, "supplierlevel");
            return (Criteria) this;
        }

        public Criteria andSupplierlevelBetween(Integer value1, Integer value2) {
            addCriterion("SUPPLIERLEVEL between", value1, value2, "supplierlevel");
            return (Criteria) this;
        }

        public Criteria andSupplierlevelNotBetween(Integer value1, Integer value2) {
            addCriterion("SUPPLIERLEVEL not between", value1, value2, "supplierlevel");
            return (Criteria) this;
        }

        public Criteria andGroupidIsNull() {
            addCriterion("GROUPID is null");
            return (Criteria) this;
        }

        public Criteria andGroupidIsNotNull() {
            addCriterion("GROUPID is not null");
            return (Criteria) this;
        }

        public Criteria andGroupidEqualTo(Long value) {
            addCriterion("GROUPID =", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotEqualTo(Long value) {
            addCriterion("GROUPID <>", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThan(Long value) {
            addCriterion("GROUPID >", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThanOrEqualTo(Long value) {
            addCriterion("GROUPID >=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThan(Long value) {
            addCriterion("GROUPID <", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThanOrEqualTo(Long value) {
            addCriterion("GROUPID <=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidIn(List<Long> values) {
            addCriterion("GROUPID in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotIn(List<Long> values) {
            addCriterion("GROUPID not in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidBetween(Long value1, Long value2) {
            addCriterion("GROUPID between", value1, value2, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotBetween(Long value1, Long value2) {
            addCriterion("GROUPID not between", value1, value2, "groupid");
            return (Criteria) this;
        }

        public Criteria andPermissiongrantstatusIsNull() {
            addCriterion("PERMISSIONGRANTSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andPermissiongrantstatusIsNotNull() {
            addCriterion("PERMISSIONGRANTSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andPermissiongrantstatusEqualTo(Integer value) {
            addCriterion("PERMISSIONGRANTSTATUS =", value, "permissiongrantstatus");
            return (Criteria) this;
        }

        public Criteria andPermissiongrantstatusNotEqualTo(Integer value) {
            addCriterion("PERMISSIONGRANTSTATUS <>", value, "permissiongrantstatus");
            return (Criteria) this;
        }

        public Criteria andPermissiongrantstatusGreaterThan(Integer value) {
            addCriterion("PERMISSIONGRANTSTATUS >", value, "permissiongrantstatus");
            return (Criteria) this;
        }

        public Criteria andPermissiongrantstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("PERMISSIONGRANTSTATUS >=", value, "permissiongrantstatus");
            return (Criteria) this;
        }

        public Criteria andPermissiongrantstatusLessThan(Integer value) {
            addCriterion("PERMISSIONGRANTSTATUS <", value, "permissiongrantstatus");
            return (Criteria) this;
        }

        public Criteria andPermissiongrantstatusLessThanOrEqualTo(Integer value) {
            addCriterion("PERMISSIONGRANTSTATUS <=", value, "permissiongrantstatus");
            return (Criteria) this;
        }

        public Criteria andPermissiongrantstatusIn(List<Integer> values) {
            addCriterion("PERMISSIONGRANTSTATUS in", values, "permissiongrantstatus");
            return (Criteria) this;
        }

        public Criteria andPermissiongrantstatusNotIn(List<Integer> values) {
            addCriterion("PERMISSIONGRANTSTATUS not in", values, "permissiongrantstatus");
            return (Criteria) this;
        }

        public Criteria andPermissiongrantstatusBetween(Integer value1, Integer value2) {
            addCriterion("PERMISSIONGRANTSTATUS between", value1, value2, "permissiongrantstatus");
            return (Criteria) this;
        }

        public Criteria andPermissiongrantstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("PERMISSIONGRANTSTATUS not between", value1, value2, "permissiongrantstatus");
            return (Criteria) this;
        }

        public Criteria andHascodIsNull() {
            addCriterion("HASCOD is null");
            return (Criteria) this;
        }

        public Criteria andHascodIsNotNull() {
            addCriterion("HASCOD is not null");
            return (Criteria) this;
        }

        public Criteria andHascodEqualTo(String value) {
            addCriterion("HASCOD =", value, "hascod");
            return (Criteria) this;
        }

        public Criteria andHascodNotEqualTo(String value) {
            addCriterion("HASCOD <>", value, "hascod");
            return (Criteria) this;
        }

        public Criteria andHascodGreaterThan(String value) {
            addCriterion("HASCOD >", value, "hascod");
            return (Criteria) this;
        }

        public Criteria andHascodGreaterThanOrEqualTo(String value) {
            addCriterion("HASCOD >=", value, "hascod");
            return (Criteria) this;
        }

        public Criteria andHascodLessThan(String value) {
            addCriterion("HASCOD <", value, "hascod");
            return (Criteria) this;
        }

        public Criteria andHascodLessThanOrEqualTo(String value) {
            addCriterion("HASCOD <=", value, "hascod");
            return (Criteria) this;
        }

        public Criteria andHascodLike(String value) {
            addCriterion("HASCOD like", value, "hascod");
            return (Criteria) this;
        }

        public Criteria andHascodNotLike(String value) {
            addCriterion("HASCOD not like", value, "hascod");
            return (Criteria) this;
        }

        public Criteria andHascodIn(List<String> values) {
            addCriterion("HASCOD in", values, "hascod");
            return (Criteria) this;
        }

        public Criteria andHascodNotIn(List<String> values) {
            addCriterion("HASCOD not in", values, "hascod");
            return (Criteria) this;
        }

        public Criteria andHascodBetween(String value1, String value2) {
            addCriterion("HASCOD between", value1, value2, "hascod");
            return (Criteria) this;
        }

        public Criteria andHascodNotBetween(String value1, String value2) {
            addCriterion("HASCOD not between", value1, value2, "hascod");
            return (Criteria) this;
        }

        public Criteria andIshistoryIsNull() {
            addCriterion("ISHISTORY is null");
            return (Criteria) this;
        }

        public Criteria andIshistoryIsNotNull() {
            addCriterion("ISHISTORY is not null");
            return (Criteria) this;
        }

        public Criteria andIshistoryEqualTo(String value) {
            addCriterion("ISHISTORY =", value, "ishistory");
            return (Criteria) this;
        }

        public Criteria andIshistoryNotEqualTo(String value) {
            addCriterion("ISHISTORY <>", value, "ishistory");
            return (Criteria) this;
        }

        public Criteria andIshistoryGreaterThan(String value) {
            addCriterion("ISHISTORY >", value, "ishistory");
            return (Criteria) this;
        }

        public Criteria andIshistoryGreaterThanOrEqualTo(String value) {
            addCriterion("ISHISTORY >=", value, "ishistory");
            return (Criteria) this;
        }

        public Criteria andIshistoryLessThan(String value) {
            addCriterion("ISHISTORY <", value, "ishistory");
            return (Criteria) this;
        }

        public Criteria andIshistoryLessThanOrEqualTo(String value) {
            addCriterion("ISHISTORY <=", value, "ishistory");
            return (Criteria) this;
        }

        public Criteria andIshistoryLike(String value) {
            addCriterion("ISHISTORY like", value, "ishistory");
            return (Criteria) this;
        }

        public Criteria andIshistoryNotLike(String value) {
            addCriterion("ISHISTORY not like", value, "ishistory");
            return (Criteria) this;
        }

        public Criteria andIshistoryIn(List<String> values) {
            addCriterion("ISHISTORY in", values, "ishistory");
            return (Criteria) this;
        }

        public Criteria andIshistoryNotIn(List<String> values) {
            addCriterion("ISHISTORY not in", values, "ishistory");
            return (Criteria) this;
        }

        public Criteria andIshistoryBetween(String value1, String value2) {
            addCriterion("ISHISTORY between", value1, value2, "ishistory");
            return (Criteria) this;
        }

        public Criteria andIshistoryNotBetween(String value1, String value2) {
            addCriterion("ISHISTORY not between", value1, value2, "ishistory");
            return (Criteria) this;
        }

        public Criteria andFoundationdayIsNull() {
            addCriterion("FOUNDATIONDAY is null");
            return (Criteria) this;
        }

        public Criteria andFoundationdayIsNotNull() {
            addCriterion("FOUNDATIONDAY is not null");
            return (Criteria) this;
        }

        public Criteria andFoundationdayEqualTo(Date value) {
            addCriterion("FOUNDATIONDAY =", value, "foundationday");
            return (Criteria) this;
        }

        public Criteria andFoundationdayNotEqualTo(Date value) {
            addCriterion("FOUNDATIONDAY <>", value, "foundationday");
            return (Criteria) this;
        }

        public Criteria andFoundationdayGreaterThan(Date value) {
            addCriterion("FOUNDATIONDAY >", value, "foundationday");
            return (Criteria) this;
        }

        public Criteria andFoundationdayGreaterThanOrEqualTo(Date value) {
            addCriterion("FOUNDATIONDAY >=", value, "foundationday");
            return (Criteria) this;
        }

        public Criteria andFoundationdayLessThan(Date value) {
            addCriterion("FOUNDATIONDAY <", value, "foundationday");
            return (Criteria) this;
        }

        public Criteria andFoundationdayLessThanOrEqualTo(Date value) {
            addCriterion("FOUNDATIONDAY <=", value, "foundationday");
            return (Criteria) this;
        }

        public Criteria andFoundationdayIn(List<Date> values) {
            addCriterion("FOUNDATIONDAY in", values, "foundationday");
            return (Criteria) this;
        }

        public Criteria andFoundationdayNotIn(List<Date> values) {
            addCriterion("FOUNDATIONDAY not in", values, "foundationday");
            return (Criteria) this;
        }

        public Criteria andFoundationdayBetween(Date value1, Date value2) {
            addCriterion("FOUNDATIONDAY between", value1, value2, "foundationday");
            return (Criteria) this;
        }

        public Criteria andFoundationdayNotBetween(Date value1, Date value2) {
            addCriterion("FOUNDATIONDAY not between", value1, value2, "foundationday");
            return (Criteria) this;
        }

        public Criteria andPermissiongrantdateIsNull() {
            addCriterion("PERMISSIONGRANTDATE is null");
            return (Criteria) this;
        }

        public Criteria andPermissiongrantdateIsNotNull() {
            addCriterion("PERMISSIONGRANTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPermissiongrantdateEqualTo(Date value) {
            addCriterion("PERMISSIONGRANTDATE =", value, "permissiongrantdate");
            return (Criteria) this;
        }

        public Criteria andPermissiongrantdateNotEqualTo(Date value) {
            addCriterion("PERMISSIONGRANTDATE <>", value, "permissiongrantdate");
            return (Criteria) this;
        }

        public Criteria andPermissiongrantdateGreaterThan(Date value) {
            addCriterion("PERMISSIONGRANTDATE >", value, "permissiongrantdate");
            return (Criteria) this;
        }

        public Criteria andPermissiongrantdateGreaterThanOrEqualTo(Date value) {
            addCriterion("PERMISSIONGRANTDATE >=", value, "permissiongrantdate");
            return (Criteria) this;
        }

        public Criteria andPermissiongrantdateLessThan(Date value) {
            addCriterion("PERMISSIONGRANTDATE <", value, "permissiongrantdate");
            return (Criteria) this;
        }

        public Criteria andPermissiongrantdateLessThanOrEqualTo(Date value) {
            addCriterion("PERMISSIONGRANTDATE <=", value, "permissiongrantdate");
            return (Criteria) this;
        }

        public Criteria andPermissiongrantdateIn(List<Date> values) {
            addCriterion("PERMISSIONGRANTDATE in", values, "permissiongrantdate");
            return (Criteria) this;
        }

        public Criteria andPermissiongrantdateNotIn(List<Date> values) {
            addCriterion("PERMISSIONGRANTDATE not in", values, "permissiongrantdate");
            return (Criteria) this;
        }

        public Criteria andPermissiongrantdateBetween(Date value1, Date value2) {
            addCriterion("PERMISSIONGRANTDATE between", value1, value2, "permissiongrantdate");
            return (Criteria) this;
        }

        public Criteria andPermissiongrantdateNotBetween(Date value1, Date value2) {
            addCriterion("PERMISSIONGRANTDATE not between", value1, value2, "permissiongrantdate");
            return (Criteria) this;
        }

        public Criteria andContactpersonnamefinanceIsNull() {
            addCriterion("CONTACTPERSONNAMEFINANCE is null");
            return (Criteria) this;
        }

        public Criteria andContactpersonnamefinanceIsNotNull() {
            addCriterion("CONTACTPERSONNAMEFINANCE is not null");
            return (Criteria) this;
        }

        public Criteria andContactpersonnamefinanceEqualTo(String value) {
            addCriterion("CONTACTPERSONNAMEFINANCE =", value, "contactpersonnamefinance");
            return (Criteria) this;
        }

        public Criteria andContactpersonnamefinanceNotEqualTo(String value) {
            addCriterion("CONTACTPERSONNAMEFINANCE <>", value, "contactpersonnamefinance");
            return (Criteria) this;
        }

        public Criteria andContactpersonnamefinanceGreaterThan(String value) {
            addCriterion("CONTACTPERSONNAMEFINANCE >", value, "contactpersonnamefinance");
            return (Criteria) this;
        }

        public Criteria andContactpersonnamefinanceGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACTPERSONNAMEFINANCE >=", value, "contactpersonnamefinance");
            return (Criteria) this;
        }

        public Criteria andContactpersonnamefinanceLessThan(String value) {
            addCriterion("CONTACTPERSONNAMEFINANCE <", value, "contactpersonnamefinance");
            return (Criteria) this;
        }

        public Criteria andContactpersonnamefinanceLessThanOrEqualTo(String value) {
            addCriterion("CONTACTPERSONNAMEFINANCE <=", value, "contactpersonnamefinance");
            return (Criteria) this;
        }

        public Criteria andContactpersonnamefinanceLike(String value) {
            addCriterion("CONTACTPERSONNAMEFINANCE like", value, "contactpersonnamefinance");
            return (Criteria) this;
        }

        public Criteria andContactpersonnamefinanceNotLike(String value) {
            addCriterion("CONTACTPERSONNAMEFINANCE not like", value, "contactpersonnamefinance");
            return (Criteria) this;
        }

        public Criteria andContactpersonnamefinanceIn(List<String> values) {
            addCriterion("CONTACTPERSONNAMEFINANCE in", values, "contactpersonnamefinance");
            return (Criteria) this;
        }

        public Criteria andContactpersonnamefinanceNotIn(List<String> values) {
            addCriterion("CONTACTPERSONNAMEFINANCE not in", values, "contactpersonnamefinance");
            return (Criteria) this;
        }

        public Criteria andContactpersonnamefinanceBetween(String value1, String value2) {
            addCriterion("CONTACTPERSONNAMEFINANCE between", value1, value2, "contactpersonnamefinance");
            return (Criteria) this;
        }

        public Criteria andContactpersonnamefinanceNotBetween(String value1, String value2) {
            addCriterion("CONTACTPERSONNAMEFINANCE not between", value1, value2, "contactpersonnamefinance");
            return (Criteria) this;
        }

        public Criteria andContactpersonnamelogisticsIsNull() {
            addCriterion("CONTACTPERSONNAMELOGISTICS is null");
            return (Criteria) this;
        }

        public Criteria andContactpersonnamelogisticsIsNotNull() {
            addCriterion("CONTACTPERSONNAMELOGISTICS is not null");
            return (Criteria) this;
        }

        public Criteria andContactpersonnamelogisticsEqualTo(String value) {
            addCriterion("CONTACTPERSONNAMELOGISTICS =", value, "contactpersonnamelogistics");
            return (Criteria) this;
        }

        public Criteria andContactpersonnamelogisticsNotEqualTo(String value) {
            addCriterion("CONTACTPERSONNAMELOGISTICS <>", value, "contactpersonnamelogistics");
            return (Criteria) this;
        }

        public Criteria andContactpersonnamelogisticsGreaterThan(String value) {
            addCriterion("CONTACTPERSONNAMELOGISTICS >", value, "contactpersonnamelogistics");
            return (Criteria) this;
        }

        public Criteria andContactpersonnamelogisticsGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACTPERSONNAMELOGISTICS >=", value, "contactpersonnamelogistics");
            return (Criteria) this;
        }

        public Criteria andContactpersonnamelogisticsLessThan(String value) {
            addCriterion("CONTACTPERSONNAMELOGISTICS <", value, "contactpersonnamelogistics");
            return (Criteria) this;
        }

        public Criteria andContactpersonnamelogisticsLessThanOrEqualTo(String value) {
            addCriterion("CONTACTPERSONNAMELOGISTICS <=", value, "contactpersonnamelogistics");
            return (Criteria) this;
        }

        public Criteria andContactpersonnamelogisticsLike(String value) {
            addCriterion("CONTACTPERSONNAMELOGISTICS like", value, "contactpersonnamelogistics");
            return (Criteria) this;
        }

        public Criteria andContactpersonnamelogisticsNotLike(String value) {
            addCriterion("CONTACTPERSONNAMELOGISTICS not like", value, "contactpersonnamelogistics");
            return (Criteria) this;
        }

        public Criteria andContactpersonnamelogisticsIn(List<String> values) {
            addCriterion("CONTACTPERSONNAMELOGISTICS in", values, "contactpersonnamelogistics");
            return (Criteria) this;
        }

        public Criteria andContactpersonnamelogisticsNotIn(List<String> values) {
            addCriterion("CONTACTPERSONNAMELOGISTICS not in", values, "contactpersonnamelogistics");
            return (Criteria) this;
        }

        public Criteria andContactpersonnamelogisticsBetween(String value1, String value2) {
            addCriterion("CONTACTPERSONNAMELOGISTICS between", value1, value2, "contactpersonnamelogistics");
            return (Criteria) this;
        }

        public Criteria andContactpersonnamelogisticsNotBetween(String value1, String value2) {
            addCriterion("CONTACTPERSONNAMELOGISTICS not between", value1, value2, "contactpersonnamelogistics");
            return (Criteria) this;
        }

        public Criteria andRepresentativenameIsNull() {
            addCriterion("REPRESENTATIVENAME is null");
            return (Criteria) this;
        }

        public Criteria andRepresentativenameIsNotNull() {
            addCriterion("REPRESENTATIVENAME is not null");
            return (Criteria) this;
        }

        public Criteria andRepresentativenameEqualTo(String value) {
            addCriterion("REPRESENTATIVENAME =", value, "representativename");
            return (Criteria) this;
        }

        public Criteria andRepresentativenameNotEqualTo(String value) {
            addCriterion("REPRESENTATIVENAME <>", value, "representativename");
            return (Criteria) this;
        }

        public Criteria andRepresentativenameGreaterThan(String value) {
            addCriterion("REPRESENTATIVENAME >", value, "representativename");
            return (Criteria) this;
        }

        public Criteria andRepresentativenameGreaterThanOrEqualTo(String value) {
            addCriterion("REPRESENTATIVENAME >=", value, "representativename");
            return (Criteria) this;
        }

        public Criteria andRepresentativenameLessThan(String value) {
            addCriterion("REPRESENTATIVENAME <", value, "representativename");
            return (Criteria) this;
        }

        public Criteria andRepresentativenameLessThanOrEqualTo(String value) {
            addCriterion("REPRESENTATIVENAME <=", value, "representativename");
            return (Criteria) this;
        }

        public Criteria andRepresentativenameLike(String value) {
            addCriterion("REPRESENTATIVENAME like", value, "representativename");
            return (Criteria) this;
        }

        public Criteria andRepresentativenameNotLike(String value) {
            addCriterion("REPRESENTATIVENAME not like", value, "representativename");
            return (Criteria) this;
        }

        public Criteria andRepresentativenameIn(List<String> values) {
            addCriterion("REPRESENTATIVENAME in", values, "representativename");
            return (Criteria) this;
        }

        public Criteria andRepresentativenameNotIn(List<String> values) {
            addCriterion("REPRESENTATIVENAME not in", values, "representativename");
            return (Criteria) this;
        }

        public Criteria andRepresentativenameBetween(String value1, String value2) {
            addCriterion("REPRESENTATIVENAME between", value1, value2, "representativename");
            return (Criteria) this;
        }

        public Criteria andRepresentativenameNotBetween(String value1, String value2) {
            addCriterion("REPRESENTATIVENAME not between", value1, value2, "representativename");
            return (Criteria) this;
        }

        public Criteria andAccountholdernameIsNull() {
            addCriterion("ACCOUNTHOLDERNAME is null");
            return (Criteria) this;
        }

        public Criteria andAccountholdernameIsNotNull() {
            addCriterion("ACCOUNTHOLDERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andAccountholdernameEqualTo(String value) {
            addCriterion("ACCOUNTHOLDERNAME =", value, "accountholdername");
            return (Criteria) this;
        }

        public Criteria andAccountholdernameNotEqualTo(String value) {
            addCriterion("ACCOUNTHOLDERNAME <>", value, "accountholdername");
            return (Criteria) this;
        }

        public Criteria andAccountholdernameGreaterThan(String value) {
            addCriterion("ACCOUNTHOLDERNAME >", value, "accountholdername");
            return (Criteria) this;
        }

        public Criteria andAccountholdernameGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNTHOLDERNAME >=", value, "accountholdername");
            return (Criteria) this;
        }

        public Criteria andAccountholdernameLessThan(String value) {
            addCriterion("ACCOUNTHOLDERNAME <", value, "accountholdername");
            return (Criteria) this;
        }

        public Criteria andAccountholdernameLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNTHOLDERNAME <=", value, "accountholdername");
            return (Criteria) this;
        }

        public Criteria andAccountholdernameLike(String value) {
            addCriterion("ACCOUNTHOLDERNAME like", value, "accountholdername");
            return (Criteria) this;
        }

        public Criteria andAccountholdernameNotLike(String value) {
            addCriterion("ACCOUNTHOLDERNAME not like", value, "accountholdername");
            return (Criteria) this;
        }

        public Criteria andAccountholdernameIn(List<String> values) {
            addCriterion("ACCOUNTHOLDERNAME in", values, "accountholdername");
            return (Criteria) this;
        }

        public Criteria andAccountholdernameNotIn(List<String> values) {
            addCriterion("ACCOUNTHOLDERNAME not in", values, "accountholdername");
            return (Criteria) this;
        }

        public Criteria andAccountholdernameBetween(String value1, String value2) {
            addCriterion("ACCOUNTHOLDERNAME between", value1, value2, "accountholdername");
            return (Criteria) this;
        }

        public Criteria andAccountholdernameNotBetween(String value1, String value2) {
            addCriterion("ACCOUNTHOLDERNAME not between", value1, value2, "accountholdername");
            return (Criteria) this;
        }

        public Criteria andAccountnoIsNull() {
            addCriterion("ACCOUNTNO is null");
            return (Criteria) this;
        }

        public Criteria andAccountnoIsNotNull() {
            addCriterion("ACCOUNTNO is not null");
            return (Criteria) this;
        }

        public Criteria andAccountnoEqualTo(String value) {
            addCriterion("ACCOUNTNO =", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotEqualTo(String value) {
            addCriterion("ACCOUNTNO <>", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoGreaterThan(String value) {
            addCriterion("ACCOUNTNO >", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNTNO >=", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoLessThan(String value) {
            addCriterion("ACCOUNTNO <", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNTNO <=", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoLike(String value) {
            addCriterion("ACCOUNTNO like", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotLike(String value) {
            addCriterion("ACCOUNTNO not like", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoIn(List<String> values) {
            addCriterion("ACCOUNTNO in", values, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotIn(List<String> values) {
            addCriterion("ACCOUNTNO not in", values, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoBetween(String value1, String value2) {
            addCriterion("ACCOUNTNO between", value1, value2, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotBetween(String value1, String value2) {
            addCriterion("ACCOUNTNO not between", value1, value2, "accountno");
            return (Criteria) this;
        }

        public Criteria andSupervisornameIsNull() {
            addCriterion("SUPERVISORNAME is null");
            return (Criteria) this;
        }

        public Criteria andSupervisornameIsNotNull() {
            addCriterion("SUPERVISORNAME is not null");
            return (Criteria) this;
        }

        public Criteria andSupervisornameEqualTo(String value) {
            addCriterion("SUPERVISORNAME =", value, "supervisorname");
            return (Criteria) this;
        }

        public Criteria andSupervisornameNotEqualTo(String value) {
            addCriterion("SUPERVISORNAME <>", value, "supervisorname");
            return (Criteria) this;
        }

        public Criteria andSupervisornameGreaterThan(String value) {
            addCriterion("SUPERVISORNAME >", value, "supervisorname");
            return (Criteria) this;
        }

        public Criteria andSupervisornameGreaterThanOrEqualTo(String value) {
            addCriterion("SUPERVISORNAME >=", value, "supervisorname");
            return (Criteria) this;
        }

        public Criteria andSupervisornameLessThan(String value) {
            addCriterion("SUPERVISORNAME <", value, "supervisorname");
            return (Criteria) this;
        }

        public Criteria andSupervisornameLessThanOrEqualTo(String value) {
            addCriterion("SUPERVISORNAME <=", value, "supervisorname");
            return (Criteria) this;
        }

        public Criteria andSupervisornameLike(String value) {
            addCriterion("SUPERVISORNAME like", value, "supervisorname");
            return (Criteria) this;
        }

        public Criteria andSupervisornameNotLike(String value) {
            addCriterion("SUPERVISORNAME not like", value, "supervisorname");
            return (Criteria) this;
        }

        public Criteria andSupervisornameIn(List<String> values) {
            addCriterion("SUPERVISORNAME in", values, "supervisorname");
            return (Criteria) this;
        }

        public Criteria andSupervisornameNotIn(List<String> values) {
            addCriterion("SUPERVISORNAME not in", values, "supervisorname");
            return (Criteria) this;
        }

        public Criteria andSupervisornameBetween(String value1, String value2) {
            addCriterion("SUPERVISORNAME between", value1, value2, "supervisorname");
            return (Criteria) this;
        }

        public Criteria andSupervisornameNotBetween(String value1, String value2) {
            addCriterion("SUPERVISORNAME not between", value1, value2, "supervisorname");
            return (Criteria) this;
        }

        public Criteria andOtherdetailsfinanceIsNull() {
            addCriterion("OTHERDETAILSFINANCE is null");
            return (Criteria) this;
        }

        public Criteria andOtherdetailsfinanceIsNotNull() {
            addCriterion("OTHERDETAILSFINANCE is not null");
            return (Criteria) this;
        }

        public Criteria andOtherdetailsfinanceEqualTo(String value) {
            addCriterion("OTHERDETAILSFINANCE =", value, "otherdetailsfinance");
            return (Criteria) this;
        }

        public Criteria andOtherdetailsfinanceNotEqualTo(String value) {
            addCriterion("OTHERDETAILSFINANCE <>", value, "otherdetailsfinance");
            return (Criteria) this;
        }

        public Criteria andOtherdetailsfinanceGreaterThan(String value) {
            addCriterion("OTHERDETAILSFINANCE >", value, "otherdetailsfinance");
            return (Criteria) this;
        }

        public Criteria andOtherdetailsfinanceGreaterThanOrEqualTo(String value) {
            addCriterion("OTHERDETAILSFINANCE >=", value, "otherdetailsfinance");
            return (Criteria) this;
        }

        public Criteria andOtherdetailsfinanceLessThan(String value) {
            addCriterion("OTHERDETAILSFINANCE <", value, "otherdetailsfinance");
            return (Criteria) this;
        }

        public Criteria andOtherdetailsfinanceLessThanOrEqualTo(String value) {
            addCriterion("OTHERDETAILSFINANCE <=", value, "otherdetailsfinance");
            return (Criteria) this;
        }

        public Criteria andOtherdetailsfinanceLike(String value) {
            addCriterion("OTHERDETAILSFINANCE like", value, "otherdetailsfinance");
            return (Criteria) this;
        }

        public Criteria andOtherdetailsfinanceNotLike(String value) {
            addCriterion("OTHERDETAILSFINANCE not like", value, "otherdetailsfinance");
            return (Criteria) this;
        }

        public Criteria andOtherdetailsfinanceIn(List<String> values) {
            addCriterion("OTHERDETAILSFINANCE in", values, "otherdetailsfinance");
            return (Criteria) this;
        }

        public Criteria andOtherdetailsfinanceNotIn(List<String> values) {
            addCriterion("OTHERDETAILSFINANCE not in", values, "otherdetailsfinance");
            return (Criteria) this;
        }

        public Criteria andOtherdetailsfinanceBetween(String value1, String value2) {
            addCriterion("OTHERDETAILSFINANCE between", value1, value2, "otherdetailsfinance");
            return (Criteria) this;
        }

        public Criteria andOtherdetailsfinanceNotBetween(String value1, String value2) {
            addCriterion("OTHERDETAILSFINANCE not between", value1, value2, "otherdetailsfinance");
            return (Criteria) this;
        }

        public Criteria andLogisticdetailsIsNull() {
            addCriterion("LOGISTICDETAILS is null");
            return (Criteria) this;
        }

        public Criteria andLogisticdetailsIsNotNull() {
            addCriterion("LOGISTICDETAILS is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticdetailsEqualTo(String value) {
            addCriterion("LOGISTICDETAILS =", value, "logisticdetails");
            return (Criteria) this;
        }

        public Criteria andLogisticdetailsNotEqualTo(String value) {
            addCriterion("LOGISTICDETAILS <>", value, "logisticdetails");
            return (Criteria) this;
        }

        public Criteria andLogisticdetailsGreaterThan(String value) {
            addCriterion("LOGISTICDETAILS >", value, "logisticdetails");
            return (Criteria) this;
        }

        public Criteria andLogisticdetailsGreaterThanOrEqualTo(String value) {
            addCriterion("LOGISTICDETAILS >=", value, "logisticdetails");
            return (Criteria) this;
        }

        public Criteria andLogisticdetailsLessThan(String value) {
            addCriterion("LOGISTICDETAILS <", value, "logisticdetails");
            return (Criteria) this;
        }

        public Criteria andLogisticdetailsLessThanOrEqualTo(String value) {
            addCriterion("LOGISTICDETAILS <=", value, "logisticdetails");
            return (Criteria) this;
        }

        public Criteria andLogisticdetailsLike(String value) {
            addCriterion("LOGISTICDETAILS like", value, "logisticdetails");
            return (Criteria) this;
        }

        public Criteria andLogisticdetailsNotLike(String value) {
            addCriterion("LOGISTICDETAILS not like", value, "logisticdetails");
            return (Criteria) this;
        }

        public Criteria andLogisticdetailsIn(List<String> values) {
            addCriterion("LOGISTICDETAILS in", values, "logisticdetails");
            return (Criteria) this;
        }

        public Criteria andLogisticdetailsNotIn(List<String> values) {
            addCriterion("LOGISTICDETAILS not in", values, "logisticdetails");
            return (Criteria) this;
        }

        public Criteria andLogisticdetailsBetween(String value1, String value2) {
            addCriterion("LOGISTICDETAILS between", value1, value2, "logisticdetails");
            return (Criteria) this;
        }

        public Criteria andLogisticdetailsNotBetween(String value1, String value2) {
            addCriterion("LOGISTICDETAILS not between", value1, value2, "logisticdetails");
            return (Criteria) this;
        }

        public Criteria andContactpersoncountrycodeIsNull() {
            addCriterion("CONTACTPERSONCOUNTRYCODE is null");
            return (Criteria) this;
        }

        public Criteria andContactpersoncountrycodeIsNotNull() {
            addCriterion("CONTACTPERSONCOUNTRYCODE is not null");
            return (Criteria) this;
        }

        public Criteria andContactpersoncountrycodeEqualTo(String value) {
            addCriterion("CONTACTPERSONCOUNTRYCODE =", value, "contactpersoncountrycode");
            return (Criteria) this;
        }

        public Criteria andContactpersoncountrycodeNotEqualTo(String value) {
            addCriterion("CONTACTPERSONCOUNTRYCODE <>", value, "contactpersoncountrycode");
            return (Criteria) this;
        }

        public Criteria andContactpersoncountrycodeGreaterThan(String value) {
            addCriterion("CONTACTPERSONCOUNTRYCODE >", value, "contactpersoncountrycode");
            return (Criteria) this;
        }

        public Criteria andContactpersoncountrycodeGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACTPERSONCOUNTRYCODE >=", value, "contactpersoncountrycode");
            return (Criteria) this;
        }

        public Criteria andContactpersoncountrycodeLessThan(String value) {
            addCriterion("CONTACTPERSONCOUNTRYCODE <", value, "contactpersoncountrycode");
            return (Criteria) this;
        }

        public Criteria andContactpersoncountrycodeLessThanOrEqualTo(String value) {
            addCriterion("CONTACTPERSONCOUNTRYCODE <=", value, "contactpersoncountrycode");
            return (Criteria) this;
        }

        public Criteria andContactpersoncountrycodeLike(String value) {
            addCriterion("CONTACTPERSONCOUNTRYCODE like", value, "contactpersoncountrycode");
            return (Criteria) this;
        }

        public Criteria andContactpersoncountrycodeNotLike(String value) {
            addCriterion("CONTACTPERSONCOUNTRYCODE not like", value, "contactpersoncountrycode");
            return (Criteria) this;
        }

        public Criteria andContactpersoncountrycodeIn(List<String> values) {
            addCriterion("CONTACTPERSONCOUNTRYCODE in", values, "contactpersoncountrycode");
            return (Criteria) this;
        }

        public Criteria andContactpersoncountrycodeNotIn(List<String> values) {
            addCriterion("CONTACTPERSONCOUNTRYCODE not in", values, "contactpersoncountrycode");
            return (Criteria) this;
        }

        public Criteria andContactpersoncountrycodeBetween(String value1, String value2) {
            addCriterion("CONTACTPERSONCOUNTRYCODE between", value1, value2, "contactpersoncountrycode");
            return (Criteria) this;
        }

        public Criteria andContactpersoncountrycodeNotBetween(String value1, String value2) {
            addCriterion("CONTACTPERSONCOUNTRYCODE not between", value1, value2, "contactpersoncountrycode");
            return (Criteria) this;
        }

        public Criteria andContactpersonareacodeIsNull() {
            addCriterion("CONTACTPERSONAREACODE is null");
            return (Criteria) this;
        }

        public Criteria andContactpersonareacodeIsNotNull() {
            addCriterion("CONTACTPERSONAREACODE is not null");
            return (Criteria) this;
        }

        public Criteria andContactpersonareacodeEqualTo(String value) {
            addCriterion("CONTACTPERSONAREACODE =", value, "contactpersonareacode");
            return (Criteria) this;
        }

        public Criteria andContactpersonareacodeNotEqualTo(String value) {
            addCriterion("CONTACTPERSONAREACODE <>", value, "contactpersonareacode");
            return (Criteria) this;
        }

        public Criteria andContactpersonareacodeGreaterThan(String value) {
            addCriterion("CONTACTPERSONAREACODE >", value, "contactpersonareacode");
            return (Criteria) this;
        }

        public Criteria andContactpersonareacodeGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACTPERSONAREACODE >=", value, "contactpersonareacode");
            return (Criteria) this;
        }

        public Criteria andContactpersonareacodeLessThan(String value) {
            addCriterion("CONTACTPERSONAREACODE <", value, "contactpersonareacode");
            return (Criteria) this;
        }

        public Criteria andContactpersonareacodeLessThanOrEqualTo(String value) {
            addCriterion("CONTACTPERSONAREACODE <=", value, "contactpersonareacode");
            return (Criteria) this;
        }

        public Criteria andContactpersonareacodeLike(String value) {
            addCriterion("CONTACTPERSONAREACODE like", value, "contactpersonareacode");
            return (Criteria) this;
        }

        public Criteria andContactpersonareacodeNotLike(String value) {
            addCriterion("CONTACTPERSONAREACODE not like", value, "contactpersonareacode");
            return (Criteria) this;
        }

        public Criteria andContactpersonareacodeIn(List<String> values) {
            addCriterion("CONTACTPERSONAREACODE in", values, "contactpersonareacode");
            return (Criteria) this;
        }

        public Criteria andContactpersonareacodeNotIn(List<String> values) {
            addCriterion("CONTACTPERSONAREACODE not in", values, "contactpersonareacode");
            return (Criteria) this;
        }

        public Criteria andContactpersonareacodeBetween(String value1, String value2) {
            addCriterion("CONTACTPERSONAREACODE between", value1, value2, "contactpersonareacode");
            return (Criteria) this;
        }

        public Criteria andContactpersonareacodeNotBetween(String value1, String value2) {
            addCriterion("CONTACTPERSONAREACODE not between", value1, value2, "contactpersonareacode");
            return (Criteria) this;
        }

        public Criteria andContactpersonphonenoIsNull() {
            addCriterion("CONTACTPERSONPHONENO is null");
            return (Criteria) this;
        }

        public Criteria andContactpersonphonenoIsNotNull() {
            addCriterion("CONTACTPERSONPHONENO is not null");
            return (Criteria) this;
        }

        public Criteria andContactpersonphonenoEqualTo(String value) {
            addCriterion("CONTACTPERSONPHONENO =", value, "contactpersonphoneno");
            return (Criteria) this;
        }

        public Criteria andContactpersonphonenoNotEqualTo(String value) {
            addCriterion("CONTACTPERSONPHONENO <>", value, "contactpersonphoneno");
            return (Criteria) this;
        }

        public Criteria andContactpersonphonenoGreaterThan(String value) {
            addCriterion("CONTACTPERSONPHONENO >", value, "contactpersonphoneno");
            return (Criteria) this;
        }

        public Criteria andContactpersonphonenoGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACTPERSONPHONENO >=", value, "contactpersonphoneno");
            return (Criteria) this;
        }

        public Criteria andContactpersonphonenoLessThan(String value) {
            addCriterion("CONTACTPERSONPHONENO <", value, "contactpersonphoneno");
            return (Criteria) this;
        }

        public Criteria andContactpersonphonenoLessThanOrEqualTo(String value) {
            addCriterion("CONTACTPERSONPHONENO <=", value, "contactpersonphoneno");
            return (Criteria) this;
        }

        public Criteria andContactpersonphonenoLike(String value) {
            addCriterion("CONTACTPERSONPHONENO like", value, "contactpersonphoneno");
            return (Criteria) this;
        }

        public Criteria andContactpersonphonenoNotLike(String value) {
            addCriterion("CONTACTPERSONPHONENO not like", value, "contactpersonphoneno");
            return (Criteria) this;
        }

        public Criteria andContactpersonphonenoIn(List<String> values) {
            addCriterion("CONTACTPERSONPHONENO in", values, "contactpersonphoneno");
            return (Criteria) this;
        }

        public Criteria andContactpersonphonenoNotIn(List<String> values) {
            addCriterion("CONTACTPERSONPHONENO not in", values, "contactpersonphoneno");
            return (Criteria) this;
        }

        public Criteria andContactpersonphonenoBetween(String value1, String value2) {
            addCriterion("CONTACTPERSONPHONENO between", value1, value2, "contactpersonphoneno");
            return (Criteria) this;
        }

        public Criteria andContactpersonphonenoNotBetween(String value1, String value2) {
            addCriterion("CONTACTPERSONPHONENO not between", value1, value2, "contactpersonphoneno");
            return (Criteria) this;
        }

        public Criteria andContactpersonextensionIsNull() {
            addCriterion("CONTACTPERSONEXTENSION is null");
            return (Criteria) this;
        }

        public Criteria andContactpersonextensionIsNotNull() {
            addCriterion("CONTACTPERSONEXTENSION is not null");
            return (Criteria) this;
        }

        public Criteria andContactpersonextensionEqualTo(String value) {
            addCriterion("CONTACTPERSONEXTENSION =", value, "contactpersonextension");
            return (Criteria) this;
        }

        public Criteria andContactpersonextensionNotEqualTo(String value) {
            addCriterion("CONTACTPERSONEXTENSION <>", value, "contactpersonextension");
            return (Criteria) this;
        }

        public Criteria andContactpersonextensionGreaterThan(String value) {
            addCriterion("CONTACTPERSONEXTENSION >", value, "contactpersonextension");
            return (Criteria) this;
        }

        public Criteria andContactpersonextensionGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACTPERSONEXTENSION >=", value, "contactpersonextension");
            return (Criteria) this;
        }

        public Criteria andContactpersonextensionLessThan(String value) {
            addCriterion("CONTACTPERSONEXTENSION <", value, "contactpersonextension");
            return (Criteria) this;
        }

        public Criteria andContactpersonextensionLessThanOrEqualTo(String value) {
            addCriterion("CONTACTPERSONEXTENSION <=", value, "contactpersonextension");
            return (Criteria) this;
        }

        public Criteria andContactpersonextensionLike(String value) {
            addCriterion("CONTACTPERSONEXTENSION like", value, "contactpersonextension");
            return (Criteria) this;
        }

        public Criteria andContactpersonextensionNotLike(String value) {
            addCriterion("CONTACTPERSONEXTENSION not like", value, "contactpersonextension");
            return (Criteria) this;
        }

        public Criteria andContactpersonextensionIn(List<String> values) {
            addCriterion("CONTACTPERSONEXTENSION in", values, "contactpersonextension");
            return (Criteria) this;
        }

        public Criteria andContactpersonextensionNotIn(List<String> values) {
            addCriterion("CONTACTPERSONEXTENSION not in", values, "contactpersonextension");
            return (Criteria) this;
        }

        public Criteria andContactpersonextensionBetween(String value1, String value2) {
            addCriterion("CONTACTPERSONEXTENSION between", value1, value2, "contactpersonextension");
            return (Criteria) this;
        }

        public Criteria andContactpersonextensionNotBetween(String value1, String value2) {
            addCriterion("CONTACTPERSONEXTENSION not between", value1, value2, "contactpersonextension");
            return (Criteria) this;
        }

        public Criteria andContactpersonfaxcountrycodeIsNull() {
            addCriterion("CONTACTPERSONFAXCOUNTRYCODE is null");
            return (Criteria) this;
        }

        public Criteria andContactpersonfaxcountrycodeIsNotNull() {
            addCriterion("CONTACTPERSONFAXCOUNTRYCODE is not null");
            return (Criteria) this;
        }

        public Criteria andContactpersonfaxcountrycodeEqualTo(String value) {
            addCriterion("CONTACTPERSONFAXCOUNTRYCODE =", value, "contactpersonfaxcountrycode");
            return (Criteria) this;
        }

        public Criteria andContactpersonfaxcountrycodeNotEqualTo(String value) {
            addCriterion("CONTACTPERSONFAXCOUNTRYCODE <>", value, "contactpersonfaxcountrycode");
            return (Criteria) this;
        }

        public Criteria andContactpersonfaxcountrycodeGreaterThan(String value) {
            addCriterion("CONTACTPERSONFAXCOUNTRYCODE >", value, "contactpersonfaxcountrycode");
            return (Criteria) this;
        }

        public Criteria andContactpersonfaxcountrycodeGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACTPERSONFAXCOUNTRYCODE >=", value, "contactpersonfaxcountrycode");
            return (Criteria) this;
        }

        public Criteria andContactpersonfaxcountrycodeLessThan(String value) {
            addCriterion("CONTACTPERSONFAXCOUNTRYCODE <", value, "contactpersonfaxcountrycode");
            return (Criteria) this;
        }

        public Criteria andContactpersonfaxcountrycodeLessThanOrEqualTo(String value) {
            addCriterion("CONTACTPERSONFAXCOUNTRYCODE <=", value, "contactpersonfaxcountrycode");
            return (Criteria) this;
        }

        public Criteria andContactpersonfaxcountrycodeLike(String value) {
            addCriterion("CONTACTPERSONFAXCOUNTRYCODE like", value, "contactpersonfaxcountrycode");
            return (Criteria) this;
        }

        public Criteria andContactpersonfaxcountrycodeNotLike(String value) {
            addCriterion("CONTACTPERSONFAXCOUNTRYCODE not like", value, "contactpersonfaxcountrycode");
            return (Criteria) this;
        }

        public Criteria andContactpersonfaxcountrycodeIn(List<String> values) {
            addCriterion("CONTACTPERSONFAXCOUNTRYCODE in", values, "contactpersonfaxcountrycode");
            return (Criteria) this;
        }

        public Criteria andContactpersonfaxcountrycodeNotIn(List<String> values) {
            addCriterion("CONTACTPERSONFAXCOUNTRYCODE not in", values, "contactpersonfaxcountrycode");
            return (Criteria) this;
        }

        public Criteria andContactpersonfaxcountrycodeBetween(String value1, String value2) {
            addCriterion("CONTACTPERSONFAXCOUNTRYCODE between", value1, value2, "contactpersonfaxcountrycode");
            return (Criteria) this;
        }

        public Criteria andContactpersonfaxcountrycodeNotBetween(String value1, String value2) {
            addCriterion("CONTACTPERSONFAXCOUNTRYCODE not between", value1, value2, "contactpersonfaxcountrycode");
            return (Criteria) this;
        }

        public Criteria andContactpersonfaxareacodeIsNull() {
            addCriterion("CONTACTPERSONFAXAREACODE is null");
            return (Criteria) this;
        }

        public Criteria andContactpersonfaxareacodeIsNotNull() {
            addCriterion("CONTACTPERSONFAXAREACODE is not null");
            return (Criteria) this;
        }

        public Criteria andContactpersonfaxareacodeEqualTo(String value) {
            addCriterion("CONTACTPERSONFAXAREACODE =", value, "contactpersonfaxareacode");
            return (Criteria) this;
        }

        public Criteria andContactpersonfaxareacodeNotEqualTo(String value) {
            addCriterion("CONTACTPERSONFAXAREACODE <>", value, "contactpersonfaxareacode");
            return (Criteria) this;
        }

        public Criteria andContactpersonfaxareacodeGreaterThan(String value) {
            addCriterion("CONTACTPERSONFAXAREACODE >", value, "contactpersonfaxareacode");
            return (Criteria) this;
        }

        public Criteria andContactpersonfaxareacodeGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACTPERSONFAXAREACODE >=", value, "contactpersonfaxareacode");
            return (Criteria) this;
        }

        public Criteria andContactpersonfaxareacodeLessThan(String value) {
            addCriterion("CONTACTPERSONFAXAREACODE <", value, "contactpersonfaxareacode");
            return (Criteria) this;
        }

        public Criteria andContactpersonfaxareacodeLessThanOrEqualTo(String value) {
            addCriterion("CONTACTPERSONFAXAREACODE <=", value, "contactpersonfaxareacode");
            return (Criteria) this;
        }

        public Criteria andContactpersonfaxareacodeLike(String value) {
            addCriterion("CONTACTPERSONFAXAREACODE like", value, "contactpersonfaxareacode");
            return (Criteria) this;
        }

        public Criteria andContactpersonfaxareacodeNotLike(String value) {
            addCriterion("CONTACTPERSONFAXAREACODE not like", value, "contactpersonfaxareacode");
            return (Criteria) this;
        }

        public Criteria andContactpersonfaxareacodeIn(List<String> values) {
            addCriterion("CONTACTPERSONFAXAREACODE in", values, "contactpersonfaxareacode");
            return (Criteria) this;
        }

        public Criteria andContactpersonfaxareacodeNotIn(List<String> values) {
            addCriterion("CONTACTPERSONFAXAREACODE not in", values, "contactpersonfaxareacode");
            return (Criteria) this;
        }

        public Criteria andContactpersonfaxareacodeBetween(String value1, String value2) {
            addCriterion("CONTACTPERSONFAXAREACODE between", value1, value2, "contactpersonfaxareacode");
            return (Criteria) this;
        }

        public Criteria andContactpersonfaxareacodeNotBetween(String value1, String value2) {
            addCriterion("CONTACTPERSONFAXAREACODE not between", value1, value2, "contactpersonfaxareacode");
            return (Criteria) this;
        }

        public Criteria andContactpersonfaxnoIsNull() {
            addCriterion("CONTACTPERSONFAXNO is null");
            return (Criteria) this;
        }

        public Criteria andContactpersonfaxnoIsNotNull() {
            addCriterion("CONTACTPERSONFAXNO is not null");
            return (Criteria) this;
        }

        public Criteria andContactpersonfaxnoEqualTo(String value) {
            addCriterion("CONTACTPERSONFAXNO =", value, "contactpersonfaxno");
            return (Criteria) this;
        }

        public Criteria andContactpersonfaxnoNotEqualTo(String value) {
            addCriterion("CONTACTPERSONFAXNO <>", value, "contactpersonfaxno");
            return (Criteria) this;
        }

        public Criteria andContactpersonfaxnoGreaterThan(String value) {
            addCriterion("CONTACTPERSONFAXNO >", value, "contactpersonfaxno");
            return (Criteria) this;
        }

        public Criteria andContactpersonfaxnoGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACTPERSONFAXNO >=", value, "contactpersonfaxno");
            return (Criteria) this;
        }

        public Criteria andContactpersonfaxnoLessThan(String value) {
            addCriterion("CONTACTPERSONFAXNO <", value, "contactpersonfaxno");
            return (Criteria) this;
        }

        public Criteria andContactpersonfaxnoLessThanOrEqualTo(String value) {
            addCriterion("CONTACTPERSONFAXNO <=", value, "contactpersonfaxno");
            return (Criteria) this;
        }

        public Criteria andContactpersonfaxnoLike(String value) {
            addCriterion("CONTACTPERSONFAXNO like", value, "contactpersonfaxno");
            return (Criteria) this;
        }

        public Criteria andContactpersonfaxnoNotLike(String value) {
            addCriterion("CONTACTPERSONFAXNO not like", value, "contactpersonfaxno");
            return (Criteria) this;
        }

        public Criteria andContactpersonfaxnoIn(List<String> values) {
            addCriterion("CONTACTPERSONFAXNO in", values, "contactpersonfaxno");
            return (Criteria) this;
        }

        public Criteria andContactpersonfaxnoNotIn(List<String> values) {
            addCriterion("CONTACTPERSONFAXNO not in", values, "contactpersonfaxno");
            return (Criteria) this;
        }

        public Criteria andContactpersonfaxnoBetween(String value1, String value2) {
            addCriterion("CONTACTPERSONFAXNO between", value1, value2, "contactpersonfaxno");
            return (Criteria) this;
        }

        public Criteria andContactpersonfaxnoNotBetween(String value1, String value2) {
            addCriterion("CONTACTPERSONFAXNO not between", value1, value2, "contactpersonfaxno");
            return (Criteria) this;
        }

        public Criteria andTargetuseridIsNull() {
            addCriterion("TARGETUSERID is null");
            return (Criteria) this;
        }

        public Criteria andTargetuseridIsNotNull() {
            addCriterion("TARGETUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andTargetuseridEqualTo(Long value) {
            addCriterion("TARGETUSERID =", value, "targetuserid");
            return (Criteria) this;
        }

        public Criteria andTargetuseridNotEqualTo(Long value) {
            addCriterion("TARGETUSERID <>", value, "targetuserid");
            return (Criteria) this;
        }

        public Criteria andTargetuseridGreaterThan(Long value) {
            addCriterion("TARGETUSERID >", value, "targetuserid");
            return (Criteria) this;
        }

        public Criteria andTargetuseridGreaterThanOrEqualTo(Long value) {
            addCriterion("TARGETUSERID >=", value, "targetuserid");
            return (Criteria) this;
        }

        public Criteria andTargetuseridLessThan(Long value) {
            addCriterion("TARGETUSERID <", value, "targetuserid");
            return (Criteria) this;
        }

        public Criteria andTargetuseridLessThanOrEqualTo(Long value) {
            addCriterion("TARGETUSERID <=", value, "targetuserid");
            return (Criteria) this;
        }

        public Criteria andTargetuseridIn(List<Long> values) {
            addCriterion("TARGETUSERID in", values, "targetuserid");
            return (Criteria) this;
        }

        public Criteria andTargetuseridNotIn(List<Long> values) {
            addCriterion("TARGETUSERID not in", values, "targetuserid");
            return (Criteria) this;
        }

        public Criteria andTargetuseridBetween(Long value1, Long value2) {
            addCriterion("TARGETUSERID between", value1, value2, "targetuserid");
            return (Criteria) this;
        }

        public Criteria andTargetuseridNotBetween(Long value1, Long value2) {
            addCriterion("TARGETUSERID not between", value1, value2, "targetuserid");
            return (Criteria) this;
        }

        public Criteria andContactpersonmobilenoIsNull() {
            addCriterion("CONTACTPERSONMOBILENO is null");
            return (Criteria) this;
        }

        public Criteria andContactpersonmobilenoIsNotNull() {
            addCriterion("CONTACTPERSONMOBILENO is not null");
            return (Criteria) this;
        }

        public Criteria andContactpersonmobilenoEqualTo(String value) {
            addCriterion("CONTACTPERSONMOBILENO =", value, "contactpersonmobileno");
            return (Criteria) this;
        }

        public Criteria andContactpersonmobilenoNotEqualTo(String value) {
            addCriterion("CONTACTPERSONMOBILENO <>", value, "contactpersonmobileno");
            return (Criteria) this;
        }

        public Criteria andContactpersonmobilenoGreaterThan(String value) {
            addCriterion("CONTACTPERSONMOBILENO >", value, "contactpersonmobileno");
            return (Criteria) this;
        }

        public Criteria andContactpersonmobilenoGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACTPERSONMOBILENO >=", value, "contactpersonmobileno");
            return (Criteria) this;
        }

        public Criteria andContactpersonmobilenoLessThan(String value) {
            addCriterion("CONTACTPERSONMOBILENO <", value, "contactpersonmobileno");
            return (Criteria) this;
        }

        public Criteria andContactpersonmobilenoLessThanOrEqualTo(String value) {
            addCriterion("CONTACTPERSONMOBILENO <=", value, "contactpersonmobileno");
            return (Criteria) this;
        }

        public Criteria andContactpersonmobilenoLike(String value) {
            addCriterion("CONTACTPERSONMOBILENO like", value, "contactpersonmobileno");
            return (Criteria) this;
        }

        public Criteria andContactpersonmobilenoNotLike(String value) {
            addCriterion("CONTACTPERSONMOBILENO not like", value, "contactpersonmobileno");
            return (Criteria) this;
        }

        public Criteria andContactpersonmobilenoIn(List<String> values) {
            addCriterion("CONTACTPERSONMOBILENO in", values, "contactpersonmobileno");
            return (Criteria) this;
        }

        public Criteria andContactpersonmobilenoNotIn(List<String> values) {
            addCriterion("CONTACTPERSONMOBILENO not in", values, "contactpersonmobileno");
            return (Criteria) this;
        }

        public Criteria andContactpersonmobilenoBetween(String value1, String value2) {
            addCriterion("CONTACTPERSONMOBILENO between", value1, value2, "contactpersonmobileno");
            return (Criteria) this;
        }

        public Criteria andContactpersonmobilenoNotBetween(String value1, String value2) {
            addCriterion("CONTACTPERSONMOBILENO not between", value1, value2, "contactpersonmobileno");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNull() {
            addCriterion("COMMENTS is null");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNotNull() {
            addCriterion("COMMENTS is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsEqualTo(String value) {
            addCriterion("COMMENTS =", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotEqualTo(String value) {
            addCriterion("COMMENTS <>", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThan(String value) {
            addCriterion("COMMENTS >", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThanOrEqualTo(String value) {
            addCriterion("COMMENTS >=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThan(String value) {
            addCriterion("COMMENTS <", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThanOrEqualTo(String value) {
            addCriterion("COMMENTS <=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLike(String value) {
            addCriterion("COMMENTS like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotLike(String value) {
            addCriterion("COMMENTS not like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsIn(List<String> values) {
            addCriterion("COMMENTS in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotIn(List<String> values) {
            addCriterion("COMMENTS not in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsBetween(String value1, String value2) {
            addCriterion("COMMENTS between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotBetween(String value1, String value2) {
            addCriterion("COMMENTS not between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andBankidIsNull() {
            addCriterion("BANKID is null");
            return (Criteria) this;
        }

        public Criteria andBankidIsNotNull() {
            addCriterion("BANKID is not null");
            return (Criteria) this;
        }

        public Criteria andBankidEqualTo(Long value) {
            addCriterion("BANKID =", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotEqualTo(Long value) {
            addCriterion("BANKID <>", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidGreaterThan(Long value) {
            addCriterion("BANKID >", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidGreaterThanOrEqualTo(Long value) {
            addCriterion("BANKID >=", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidLessThan(Long value) {
            addCriterion("BANKID <", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidLessThanOrEqualTo(Long value) {
            addCriterion("BANKID <=", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidIn(List<Long> values) {
            addCriterion("BANKID in", values, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotIn(List<Long> values) {
            addCriterion("BANKID not in", values, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidBetween(Long value1, Long value2) {
            addCriterion("BANKID between", value1, value2, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotBetween(Long value1, Long value2) {
            addCriterion("BANKID not between", value1, value2, "bankid");
            return (Criteria) this;
        }

        public Criteria andProductdetailsIsNull() {
            addCriterion("PRODUCTDETAILS is null");
            return (Criteria) this;
        }

        public Criteria andProductdetailsIsNotNull() {
            addCriterion("PRODUCTDETAILS is not null");
            return (Criteria) this;
        }

        public Criteria andProductdetailsEqualTo(String value) {
            addCriterion("PRODUCTDETAILS =", value, "productdetails");
            return (Criteria) this;
        }

        public Criteria andProductdetailsNotEqualTo(String value) {
            addCriterion("PRODUCTDETAILS <>", value, "productdetails");
            return (Criteria) this;
        }

        public Criteria andProductdetailsGreaterThan(String value) {
            addCriterion("PRODUCTDETAILS >", value, "productdetails");
            return (Criteria) this;
        }

        public Criteria andProductdetailsGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCTDETAILS >=", value, "productdetails");
            return (Criteria) this;
        }

        public Criteria andProductdetailsLessThan(String value) {
            addCriterion("PRODUCTDETAILS <", value, "productdetails");
            return (Criteria) this;
        }

        public Criteria andProductdetailsLessThanOrEqualTo(String value) {
            addCriterion("PRODUCTDETAILS <=", value, "productdetails");
            return (Criteria) this;
        }

        public Criteria andProductdetailsLike(String value) {
            addCriterion("PRODUCTDETAILS like", value, "productdetails");
            return (Criteria) this;
        }

        public Criteria andProductdetailsNotLike(String value) {
            addCriterion("PRODUCTDETAILS not like", value, "productdetails");
            return (Criteria) this;
        }

        public Criteria andProductdetailsIn(List<String> values) {
            addCriterion("PRODUCTDETAILS in", values, "productdetails");
            return (Criteria) this;
        }

        public Criteria andProductdetailsNotIn(List<String> values) {
            addCriterion("PRODUCTDETAILS not in", values, "productdetails");
            return (Criteria) this;
        }

        public Criteria andProductdetailsBetween(String value1, String value2) {
            addCriterion("PRODUCTDETAILS between", value1, value2, "productdetails");
            return (Criteria) this;
        }

        public Criteria andProductdetailsNotBetween(String value1, String value2) {
            addCriterion("PRODUCTDETAILS not between", value1, value2, "productdetails");
            return (Criteria) this;
        }

        public Criteria andSupplierregnoIsNull() {
            addCriterion("SUPPLIERREGNO is null");
            return (Criteria) this;
        }

        public Criteria andSupplierregnoIsNotNull() {
            addCriterion("SUPPLIERREGNO is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierregnoEqualTo(String value) {
            addCriterion("SUPPLIERREGNO =", value, "supplierregno");
            return (Criteria) this;
        }

        public Criteria andSupplierregnoNotEqualTo(String value) {
            addCriterion("SUPPLIERREGNO <>", value, "supplierregno");
            return (Criteria) this;
        }

        public Criteria andSupplierregnoGreaterThan(String value) {
            addCriterion("SUPPLIERREGNO >", value, "supplierregno");
            return (Criteria) this;
        }

        public Criteria andSupplierregnoGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIERREGNO >=", value, "supplierregno");
            return (Criteria) this;
        }

        public Criteria andSupplierregnoLessThan(String value) {
            addCriterion("SUPPLIERREGNO <", value, "supplierregno");
            return (Criteria) this;
        }

        public Criteria andSupplierregnoLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIERREGNO <=", value, "supplierregno");
            return (Criteria) this;
        }

        public Criteria andSupplierregnoLike(String value) {
            addCriterion("SUPPLIERREGNO like", value, "supplierregno");
            return (Criteria) this;
        }

        public Criteria andSupplierregnoNotLike(String value) {
            addCriterion("SUPPLIERREGNO not like", value, "supplierregno");
            return (Criteria) this;
        }

        public Criteria andSupplierregnoIn(List<String> values) {
            addCriterion("SUPPLIERREGNO in", values, "supplierregno");
            return (Criteria) this;
        }

        public Criteria andSupplierregnoNotIn(List<String> values) {
            addCriterion("SUPPLIERREGNO not in", values, "supplierregno");
            return (Criteria) this;
        }

        public Criteria andSupplierregnoBetween(String value1, String value2) {
            addCriterion("SUPPLIERREGNO between", value1, value2, "supplierregno");
            return (Criteria) this;
        }

        public Criteria andSupplierregnoNotBetween(String value1, String value2) {
            addCriterion("SUPPLIERREGNO not between", value1, value2, "supplierregno");
            return (Criteria) this;
        }

        public Criteria andWithPkiIsNull() {
            addCriterion("WITH_PKI is null");
            return (Criteria) this;
        }

        public Criteria andWithPkiIsNotNull() {
            addCriterion("WITH_PKI is not null");
            return (Criteria) this;
        }

        public Criteria andWithPkiEqualTo(Integer value) {
            addCriterion("WITH_PKI =", value, "withPki");
            return (Criteria) this;
        }

        public Criteria andWithPkiNotEqualTo(Integer value) {
            addCriterion("WITH_PKI <>", value, "withPki");
            return (Criteria) this;
        }

        public Criteria andWithPkiGreaterThan(Integer value) {
            addCriterion("WITH_PKI >", value, "withPki");
            return (Criteria) this;
        }

        public Criteria andWithPkiGreaterThanOrEqualTo(Integer value) {
            addCriterion("WITH_PKI >=", value, "withPki");
            return (Criteria) this;
        }

        public Criteria andWithPkiLessThan(Integer value) {
            addCriterion("WITH_PKI <", value, "withPki");
            return (Criteria) this;
        }

        public Criteria andWithPkiLessThanOrEqualTo(Integer value) {
            addCriterion("WITH_PKI <=", value, "withPki");
            return (Criteria) this;
        }

        public Criteria andWithPkiIn(List<Integer> values) {
            addCriterion("WITH_PKI in", values, "withPki");
            return (Criteria) this;
        }

        public Criteria andWithPkiNotIn(List<Integer> values) {
            addCriterion("WITH_PKI not in", values, "withPki");
            return (Criteria) this;
        }

        public Criteria andWithPkiBetween(Integer value1, Integer value2) {
            addCriterion("WITH_PKI between", value1, value2, "withPki");
            return (Criteria) this;
        }

        public Criteria andWithPkiNotBetween(Integer value1, Integer value2) {
            addCriterion("WITH_PKI not between", value1, value2, "withPki");
            return (Criteria) this;
        }

        public Criteria andIgnoreseminarIsNull() {
            addCriterion("IGNORESEMINAR is null");
            return (Criteria) this;
        }

        public Criteria andIgnoreseminarIsNotNull() {
            addCriterion("IGNORESEMINAR is not null");
            return (Criteria) this;
        }

        public Criteria andIgnoreseminarEqualTo(String value) {
            addCriterion("IGNORESEMINAR =", value, "ignoreseminar");
            return (Criteria) this;
        }

        public Criteria andIgnoreseminarNotEqualTo(String value) {
            addCriterion("IGNORESEMINAR <>", value, "ignoreseminar");
            return (Criteria) this;
        }

        public Criteria andIgnoreseminarGreaterThan(String value) {
            addCriterion("IGNORESEMINAR >", value, "ignoreseminar");
            return (Criteria) this;
        }

        public Criteria andIgnoreseminarGreaterThanOrEqualTo(String value) {
            addCriterion("IGNORESEMINAR >=", value, "ignoreseminar");
            return (Criteria) this;
        }

        public Criteria andIgnoreseminarLessThan(String value) {
            addCriterion("IGNORESEMINAR <", value, "ignoreseminar");
            return (Criteria) this;
        }

        public Criteria andIgnoreseminarLessThanOrEqualTo(String value) {
            addCriterion("IGNORESEMINAR <=", value, "ignoreseminar");
            return (Criteria) this;
        }

        public Criteria andIgnoreseminarLike(String value) {
            addCriterion("IGNORESEMINAR like", value, "ignoreseminar");
            return (Criteria) this;
        }

        public Criteria andIgnoreseminarNotLike(String value) {
            addCriterion("IGNORESEMINAR not like", value, "ignoreseminar");
            return (Criteria) this;
        }

        public Criteria andIgnoreseminarIn(List<String> values) {
            addCriterion("IGNORESEMINAR in", values, "ignoreseminar");
            return (Criteria) this;
        }

        public Criteria andIgnoreseminarNotIn(List<String> values) {
            addCriterion("IGNORESEMINAR not in", values, "ignoreseminar");
            return (Criteria) this;
        }

        public Criteria andIgnoreseminarBetween(String value1, String value2) {
            addCriterion("IGNORESEMINAR between", value1, value2, "ignoreseminar");
            return (Criteria) this;
        }

        public Criteria andIgnoreseminarNotBetween(String value1, String value2) {
            addCriterion("IGNORESEMINAR not between", value1, value2, "ignoreseminar");
            return (Criteria) this;
        }
    }

 
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

 
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