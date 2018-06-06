package com.best1.api.entity.vwms;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TvwsApiReturnorderconfirmExample {
  
    protected String orderByClause;

   
    protected boolean distinct;

   
    protected List<Criteria> oredCriteria;

   
    public TvwsApiReturnorderconfirmExample() {
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

        public Criteria andWarehouseidIsNull() {
            addCriterion("WAREHOUSEID is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseidIsNotNull() {
            addCriterion("WAREHOUSEID is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseidEqualTo(Long value) {
            addCriterion("WAREHOUSEID =", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidNotEqualTo(Long value) {
            addCriterion("WAREHOUSEID <>", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidGreaterThan(Long value) {
            addCriterion("WAREHOUSEID >", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidGreaterThanOrEqualTo(Long value) {
            addCriterion("WAREHOUSEID >=", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidLessThan(Long value) {
            addCriterion("WAREHOUSEID <", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidLessThanOrEqualTo(Long value) {
            addCriterion("WAREHOUSEID <=", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidIn(List<Long> values) {
            addCriterion("WAREHOUSEID in", values, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidNotIn(List<Long> values) {
            addCriterion("WAREHOUSEID not in", values, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidBetween(Long value1, Long value2) {
            addCriterion("WAREHOUSEID between", value1, value2, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidNotBetween(Long value1, Long value2) {
            addCriterion("WAREHOUSEID not between", value1, value2, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andReturnorderidIsNull() {
            addCriterion("RETURNORDERID is null");
            return (Criteria) this;
        }

        public Criteria andReturnorderidIsNotNull() {
            addCriterion("RETURNORDERID is not null");
            return (Criteria) this;
        }

        public Criteria andReturnorderidEqualTo(Long value) {
            addCriterion("RETURNORDERID =", value, "returnorderid");
            return (Criteria) this;
        }

        public Criteria andReturnorderidNotEqualTo(Long value) {
            addCriterion("RETURNORDERID <>", value, "returnorderid");
            return (Criteria) this;
        }

        public Criteria andReturnorderidGreaterThan(Long value) {
            addCriterion("RETURNORDERID >", value, "returnorderid");
            return (Criteria) this;
        }

        public Criteria andReturnorderidGreaterThanOrEqualTo(Long value) {
            addCriterion("RETURNORDERID >=", value, "returnorderid");
            return (Criteria) this;
        }

        public Criteria andReturnorderidLessThan(Long value) {
            addCriterion("RETURNORDERID <", value, "returnorderid");
            return (Criteria) this;
        }

        public Criteria andReturnorderidLessThanOrEqualTo(Long value) {
            addCriterion("RETURNORDERID <=", value, "returnorderid");
            return (Criteria) this;
        }

        public Criteria andReturnorderidIn(List<Long> values) {
            addCriterion("RETURNORDERID in", values, "returnorderid");
            return (Criteria) this;
        }

        public Criteria andReturnorderidNotIn(List<Long> values) {
            addCriterion("RETURNORDERID not in", values, "returnorderid");
            return (Criteria) this;
        }

        public Criteria andReturnorderidBetween(Long value1, Long value2) {
            addCriterion("RETURNORDERID between", value1, value2, "returnorderid");
            return (Criteria) this;
        }

        public Criteria andReturnorderidNotBetween(Long value1, Long value2) {
            addCriterion("RETURNORDERID not between", value1, value2, "returnorderid");
            return (Criteria) this;
        }

        public Criteria andReturnordersequenceIsNull() {
            addCriterion("RETURNORDERSEQUENCE is null");
            return (Criteria) this;
        }

        public Criteria andReturnordersequenceIsNotNull() {
            addCriterion("RETURNORDERSEQUENCE is not null");
            return (Criteria) this;
        }

        public Criteria andReturnordersequenceEqualTo(Integer value) {
            addCriterion("RETURNORDERSEQUENCE =", value, "returnordersequence");
            return (Criteria) this;
        }

        public Criteria andReturnordersequenceNotEqualTo(Integer value) {
            addCriterion("RETURNORDERSEQUENCE <>", value, "returnordersequence");
            return (Criteria) this;
        }

        public Criteria andReturnordersequenceGreaterThan(Integer value) {
            addCriterion("RETURNORDERSEQUENCE >", value, "returnordersequence");
            return (Criteria) this;
        }

        public Criteria andReturnordersequenceGreaterThanOrEqualTo(Integer value) {
            addCriterion("RETURNORDERSEQUENCE >=", value, "returnordersequence");
            return (Criteria) this;
        }

        public Criteria andReturnordersequenceLessThan(Integer value) {
            addCriterion("RETURNORDERSEQUENCE <", value, "returnordersequence");
            return (Criteria) this;
        }

        public Criteria andReturnordersequenceLessThanOrEqualTo(Integer value) {
            addCriterion("RETURNORDERSEQUENCE <=", value, "returnordersequence");
            return (Criteria) this;
        }

        public Criteria andReturnordersequenceIn(List<Integer> values) {
            addCriterion("RETURNORDERSEQUENCE in", values, "returnordersequence");
            return (Criteria) this;
        }

        public Criteria andReturnordersequenceNotIn(List<Integer> values) {
            addCriterion("RETURNORDERSEQUENCE not in", values, "returnordersequence");
            return (Criteria) this;
        }

        public Criteria andReturnordersequenceBetween(Integer value1, Integer value2) {
            addCriterion("RETURNORDERSEQUENCE between", value1, value2, "returnordersequence");
            return (Criteria) this;
        }

        public Criteria andReturnordersequenceNotBetween(Integer value1, Integer value2) {
            addCriterion("RETURNORDERSEQUENCE not between", value1, value2, "returnordersequence");
            return (Criteria) this;
        }

        public Criteria andProductidIsNull() {
            addCriterion("PRODUCTID is null");
            return (Criteria) this;
        }

        public Criteria andProductidIsNotNull() {
            addCriterion("PRODUCTID is not null");
            return (Criteria) this;
        }

        public Criteria andProductidEqualTo(Long value) {
            addCriterion("PRODUCTID =", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotEqualTo(Long value) {
            addCriterion("PRODUCTID <>", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThan(Long value) {
            addCriterion("PRODUCTID >", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThanOrEqualTo(Long value) {
            addCriterion("PRODUCTID >=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThan(Long value) {
            addCriterion("PRODUCTID <", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThanOrEqualTo(Long value) {
            addCriterion("PRODUCTID <=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidIn(List<Long> values) {
            addCriterion("PRODUCTID in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotIn(List<Long> values) {
            addCriterion("PRODUCTID not in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidBetween(Long value1, Long value2) {
            addCriterion("PRODUCTID between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotBetween(Long value1, Long value2) {
            addCriterion("PRODUCTID not between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductversionIsNull() {
            addCriterion("PRODUCTVERSION is null");
            return (Criteria) this;
        }

        public Criteria andProductversionIsNotNull() {
            addCriterion("PRODUCTVERSION is not null");
            return (Criteria) this;
        }

        public Criteria andProductversionEqualTo(Integer value) {
            addCriterion("PRODUCTVERSION =", value, "productversion");
            return (Criteria) this;
        }

        public Criteria andProductversionNotEqualTo(Integer value) {
            addCriterion("PRODUCTVERSION <>", value, "productversion");
            return (Criteria) this;
        }

        public Criteria andProductversionGreaterThan(Integer value) {
            addCriterion("PRODUCTVERSION >", value, "productversion");
            return (Criteria) this;
        }

        public Criteria andProductversionGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRODUCTVERSION >=", value, "productversion");
            return (Criteria) this;
        }

        public Criteria andProductversionLessThan(Integer value) {
            addCriterion("PRODUCTVERSION <", value, "productversion");
            return (Criteria) this;
        }

        public Criteria andProductversionLessThanOrEqualTo(Integer value) {
            addCriterion("PRODUCTVERSION <=", value, "productversion");
            return (Criteria) this;
        }

        public Criteria andProductversionIn(List<Integer> values) {
            addCriterion("PRODUCTVERSION in", values, "productversion");
            return (Criteria) this;
        }

        public Criteria andProductversionNotIn(List<Integer> values) {
            addCriterion("PRODUCTVERSION not in", values, "productversion");
            return (Criteria) this;
        }

        public Criteria andProductversionBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCTVERSION between", value1, value2, "productversion");
            return (Criteria) this;
        }

        public Criteria andProductversionNotBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCTVERSION not between", value1, value2, "productversion");
            return (Criteria) this;
        }

        public Criteria andColourcodeIsNull() {
            addCriterion("COLOURCODE is null");
            return (Criteria) this;
        }

        public Criteria andColourcodeIsNotNull() {
            addCriterion("COLOURCODE is not null");
            return (Criteria) this;
        }

        public Criteria andColourcodeEqualTo(Integer value) {
            addCriterion("COLOURCODE =", value, "colourcode");
            return (Criteria) this;
        }

        public Criteria andColourcodeNotEqualTo(Integer value) {
            addCriterion("COLOURCODE <>", value, "colourcode");
            return (Criteria) this;
        }

        public Criteria andColourcodeGreaterThan(Integer value) {
            addCriterion("COLOURCODE >", value, "colourcode");
            return (Criteria) this;
        }

        public Criteria andColourcodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("COLOURCODE >=", value, "colourcode");
            return (Criteria) this;
        }

        public Criteria andColourcodeLessThan(Integer value) {
            addCriterion("COLOURCODE <", value, "colourcode");
            return (Criteria) this;
        }

        public Criteria andColourcodeLessThanOrEqualTo(Integer value) {
            addCriterion("COLOURCODE <=", value, "colourcode");
            return (Criteria) this;
        }

        public Criteria andColourcodeIn(List<Integer> values) {
            addCriterion("COLOURCODE in", values, "colourcode");
            return (Criteria) this;
        }

        public Criteria andColourcodeNotIn(List<Integer> values) {
            addCriterion("COLOURCODE not in", values, "colourcode");
            return (Criteria) this;
        }

        public Criteria andColourcodeBetween(Integer value1, Integer value2) {
            addCriterion("COLOURCODE between", value1, value2, "colourcode");
            return (Criteria) this;
        }

        public Criteria andColourcodeNotBetween(Integer value1, Integer value2) {
            addCriterion("COLOURCODE not between", value1, value2, "colourcode");
            return (Criteria) this;
        }

        public Criteria andColourclassIsNull() {
            addCriterion("COLOURCLASS is null");
            return (Criteria) this;
        }

        public Criteria andColourclassIsNotNull() {
            addCriterion("COLOURCLASS is not null");
            return (Criteria) this;
        }

        public Criteria andColourclassEqualTo(Integer value) {
            addCriterion("COLOURCLASS =", value, "colourclass");
            return (Criteria) this;
        }

        public Criteria andColourclassNotEqualTo(Integer value) {
            addCriterion("COLOURCLASS <>", value, "colourclass");
            return (Criteria) this;
        }

        public Criteria andColourclassGreaterThan(Integer value) {
            addCriterion("COLOURCLASS >", value, "colourclass");
            return (Criteria) this;
        }

        public Criteria andColourclassGreaterThanOrEqualTo(Integer value) {
            addCriterion("COLOURCLASS >=", value, "colourclass");
            return (Criteria) this;
        }

        public Criteria andColourclassLessThan(Integer value) {
            addCriterion("COLOURCLASS <", value, "colourclass");
            return (Criteria) this;
        }

        public Criteria andColourclassLessThanOrEqualTo(Integer value) {
            addCriterion("COLOURCLASS <=", value, "colourclass");
            return (Criteria) this;
        }

        public Criteria andColourclassIn(List<Integer> values) {
            addCriterion("COLOURCLASS in", values, "colourclass");
            return (Criteria) this;
        }

        public Criteria andColourclassNotIn(List<Integer> values) {
            addCriterion("COLOURCLASS not in", values, "colourclass");
            return (Criteria) this;
        }

        public Criteria andColourclassBetween(Integer value1, Integer value2) {
            addCriterion("COLOURCLASS between", value1, value2, "colourclass");
            return (Criteria) this;
        }

        public Criteria andColourclassNotBetween(Integer value1, Integer value2) {
            addCriterion("COLOURCLASS not between", value1, value2, "colourclass");
            return (Criteria) this;
        }

        public Criteria andStylecodeIsNull() {
            addCriterion("STYLECODE is null");
            return (Criteria) this;
        }

        public Criteria andStylecodeIsNotNull() {
            addCriterion("STYLECODE is not null");
            return (Criteria) this;
        }

        public Criteria andStylecodeEqualTo(Integer value) {
            addCriterion("STYLECODE =", value, "stylecode");
            return (Criteria) this;
        }

        public Criteria andStylecodeNotEqualTo(Integer value) {
            addCriterion("STYLECODE <>", value, "stylecode");
            return (Criteria) this;
        }

        public Criteria andStylecodeGreaterThan(Integer value) {
            addCriterion("STYLECODE >", value, "stylecode");
            return (Criteria) this;
        }

        public Criteria andStylecodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("STYLECODE >=", value, "stylecode");
            return (Criteria) this;
        }

        public Criteria andStylecodeLessThan(Integer value) {
            addCriterion("STYLECODE <", value, "stylecode");
            return (Criteria) this;
        }

        public Criteria andStylecodeLessThanOrEqualTo(Integer value) {
            addCriterion("STYLECODE <=", value, "stylecode");
            return (Criteria) this;
        }

        public Criteria andStylecodeIn(List<Integer> values) {
            addCriterion("STYLECODE in", values, "stylecode");
            return (Criteria) this;
        }

        public Criteria andStylecodeNotIn(List<Integer> values) {
            addCriterion("STYLECODE not in", values, "stylecode");
            return (Criteria) this;
        }

        public Criteria andStylecodeBetween(Integer value1, Integer value2) {
            addCriterion("STYLECODE between", value1, value2, "stylecode");
            return (Criteria) this;
        }

        public Criteria andStylecodeNotBetween(Integer value1, Integer value2) {
            addCriterion("STYLECODE not between", value1, value2, "stylecode");
            return (Criteria) this;
        }

        public Criteria andStyleclassIsNull() {
            addCriterion("STYLECLASS is null");
            return (Criteria) this;
        }

        public Criteria andStyleclassIsNotNull() {
            addCriterion("STYLECLASS is not null");
            return (Criteria) this;
        }

        public Criteria andStyleclassEqualTo(Integer value) {
            addCriterion("STYLECLASS =", value, "styleclass");
            return (Criteria) this;
        }

        public Criteria andStyleclassNotEqualTo(Integer value) {
            addCriterion("STYLECLASS <>", value, "styleclass");
            return (Criteria) this;
        }

        public Criteria andStyleclassGreaterThan(Integer value) {
            addCriterion("STYLECLASS >", value, "styleclass");
            return (Criteria) this;
        }

        public Criteria andStyleclassGreaterThanOrEqualTo(Integer value) {
            addCriterion("STYLECLASS >=", value, "styleclass");
            return (Criteria) this;
        }

        public Criteria andStyleclassLessThan(Integer value) {
            addCriterion("STYLECLASS <", value, "styleclass");
            return (Criteria) this;
        }

        public Criteria andStyleclassLessThanOrEqualTo(Integer value) {
            addCriterion("STYLECLASS <=", value, "styleclass");
            return (Criteria) this;
        }

        public Criteria andStyleclassIn(List<Integer> values) {
            addCriterion("STYLECLASS in", values, "styleclass");
            return (Criteria) this;
        }

        public Criteria andStyleclassNotIn(List<Integer> values) {
            addCriterion("STYLECLASS not in", values, "styleclass");
            return (Criteria) this;
        }

        public Criteria andStyleclassBetween(Integer value1, Integer value2) {
            addCriterion("STYLECLASS between", value1, value2, "styleclass");
            return (Criteria) this;
        }

        public Criteria andStyleclassNotBetween(Integer value1, Integer value2) {
            addCriterion("STYLECLASS not between", value1, value2, "styleclass");
            return (Criteria) this;
        }

        public Criteria andRequestquantityIsNull() {
            addCriterion("REQUESTQUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andRequestquantityIsNotNull() {
            addCriterion("REQUESTQUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andRequestquantityEqualTo(Long value) {
            addCriterion("REQUESTQUANTITY =", value, "requestquantity");
            return (Criteria) this;
        }

        public Criteria andRequestquantityNotEqualTo(Long value) {
            addCriterion("REQUESTQUANTITY <>", value, "requestquantity");
            return (Criteria) this;
        }

        public Criteria andRequestquantityGreaterThan(Long value) {
            addCriterion("REQUESTQUANTITY >", value, "requestquantity");
            return (Criteria) this;
        }

        public Criteria andRequestquantityGreaterThanOrEqualTo(Long value) {
            addCriterion("REQUESTQUANTITY >=", value, "requestquantity");
            return (Criteria) this;
        }

        public Criteria andRequestquantityLessThan(Long value) {
            addCriterion("REQUESTQUANTITY <", value, "requestquantity");
            return (Criteria) this;
        }

        public Criteria andRequestquantityLessThanOrEqualTo(Long value) {
            addCriterion("REQUESTQUANTITY <=", value, "requestquantity");
            return (Criteria) this;
        }

        public Criteria andRequestquantityIn(List<Long> values) {
            addCriterion("REQUESTQUANTITY in", values, "requestquantity");
            return (Criteria) this;
        }

        public Criteria andRequestquantityNotIn(List<Long> values) {
            addCriterion("REQUESTQUANTITY not in", values, "requestquantity");
            return (Criteria) this;
        }

        public Criteria andRequestquantityBetween(Long value1, Long value2) {
            addCriterion("REQUESTQUANTITY between", value1, value2, "requestquantity");
            return (Criteria) this;
        }

        public Criteria andRequestquantityNotBetween(Long value1, Long value2) {
            addCriterion("REQUESTQUANTITY not between", value1, value2, "requestquantity");
            return (Criteria) this;
        }

        public Criteria andReceivedquantityIsNull() {
            addCriterion("RECEIVEDQUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andReceivedquantityIsNotNull() {
            addCriterion("RECEIVEDQUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andReceivedquantityEqualTo(Long value) {
            addCriterion("RECEIVEDQUANTITY =", value, "receivedquantity");
            return (Criteria) this;
        }

        public Criteria andReceivedquantityNotEqualTo(Long value) {
            addCriterion("RECEIVEDQUANTITY <>", value, "receivedquantity");
            return (Criteria) this;
        }

        public Criteria andReceivedquantityGreaterThan(Long value) {
            addCriterion("RECEIVEDQUANTITY >", value, "receivedquantity");
            return (Criteria) this;
        }

        public Criteria andReceivedquantityGreaterThanOrEqualTo(Long value) {
            addCriterion("RECEIVEDQUANTITY >=", value, "receivedquantity");
            return (Criteria) this;
        }

        public Criteria andReceivedquantityLessThan(Long value) {
            addCriterion("RECEIVEDQUANTITY <", value, "receivedquantity");
            return (Criteria) this;
        }

        public Criteria andReceivedquantityLessThanOrEqualTo(Long value) {
            addCriterion("RECEIVEDQUANTITY <=", value, "receivedquantity");
            return (Criteria) this;
        }

        public Criteria andReceivedquantityIn(List<Long> values) {
            addCriterion("RECEIVEDQUANTITY in", values, "receivedquantity");
            return (Criteria) this;
        }

        public Criteria andReceivedquantityNotIn(List<Long> values) {
            addCriterion("RECEIVEDQUANTITY not in", values, "receivedquantity");
            return (Criteria) this;
        }

        public Criteria andReceivedquantityBetween(Long value1, Long value2) {
            addCriterion("RECEIVEDQUANTITY between", value1, value2, "receivedquantity");
            return (Criteria) this;
        }

        public Criteria andReceivedquantityNotBetween(Long value1, Long value2) {
            addCriterion("RECEIVEDQUANTITY not between", value1, value2, "receivedquantity");
            return (Criteria) this;
        }

        public Criteria andReturntowarehousedateIsNull() {
            addCriterion("RETURNTOWAREHOUSEDATE is null");
            return (Criteria) this;
        }

        public Criteria andReturntowarehousedateIsNotNull() {
            addCriterion("RETURNTOWAREHOUSEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andReturntowarehousedateEqualTo(Date value) {
            addCriterion("RETURNTOWAREHOUSEDATE =", value, "returntowarehousedate");
            return (Criteria) this;
        }

        public Criteria andReturntowarehousedateNotEqualTo(Date value) {
            addCriterion("RETURNTOWAREHOUSEDATE <>", value, "returntowarehousedate");
            return (Criteria) this;
        }

        public Criteria andReturntowarehousedateGreaterThan(Date value) {
            addCriterion("RETURNTOWAREHOUSEDATE >", value, "returntowarehousedate");
            return (Criteria) this;
        }

        public Criteria andReturntowarehousedateGreaterThanOrEqualTo(Date value) {
            addCriterion("RETURNTOWAREHOUSEDATE >=", value, "returntowarehousedate");
            return (Criteria) this;
        }

        public Criteria andReturntowarehousedateLessThan(Date value) {
            addCriterion("RETURNTOWAREHOUSEDATE <", value, "returntowarehousedate");
            return (Criteria) this;
        }

        public Criteria andReturntowarehousedateLessThanOrEqualTo(Date value) {
            addCriterion("RETURNTOWAREHOUSEDATE <=", value, "returntowarehousedate");
            return (Criteria) this;
        }

        public Criteria andReturntowarehousedateIn(List<Date> values) {
            addCriterion("RETURNTOWAREHOUSEDATE in", values, "returntowarehousedate");
            return (Criteria) this;
        }

        public Criteria andReturntowarehousedateNotIn(List<Date> values) {
            addCriterion("RETURNTOWAREHOUSEDATE not in", values, "returntowarehousedate");
            return (Criteria) this;
        }

        public Criteria andReturntowarehousedateBetween(Date value1, Date value2) {
            addCriterion("RETURNTOWAREHOUSEDATE between", value1, value2, "returntowarehousedate");
            return (Criteria) this;
        }

        public Criteria andReturntowarehousedateNotBetween(Date value1, Date value2) {
            addCriterion("RETURNTOWAREHOUSEDATE not between", value1, value2, "returntowarehousedate");
            return (Criteria) this;
        }

        public Criteria andSelectedcarrierIsNull() {
            addCriterion("SELECTEDCARRIER is null");
            return (Criteria) this;
        }

        public Criteria andSelectedcarrierIsNotNull() {
            addCriterion("SELECTEDCARRIER is not null");
            return (Criteria) this;
        }

        public Criteria andSelectedcarrierEqualTo(Long value) {
            addCriterion("SELECTEDCARRIER =", value, "selectedcarrier");
            return (Criteria) this;
        }

        public Criteria andSelectedcarrierNotEqualTo(Long value) {
            addCriterion("SELECTEDCARRIER <>", value, "selectedcarrier");
            return (Criteria) this;
        }

        public Criteria andSelectedcarrierGreaterThan(Long value) {
            addCriterion("SELECTEDCARRIER >", value, "selectedcarrier");
            return (Criteria) this;
        }

        public Criteria andSelectedcarrierGreaterThanOrEqualTo(Long value) {
            addCriterion("SELECTEDCARRIER >=", value, "selectedcarrier");
            return (Criteria) this;
        }

        public Criteria andSelectedcarrierLessThan(Long value) {
            addCriterion("SELECTEDCARRIER <", value, "selectedcarrier");
            return (Criteria) this;
        }

        public Criteria andSelectedcarrierLessThanOrEqualTo(Long value) {
            addCriterion("SELECTEDCARRIER <=", value, "selectedcarrier");
            return (Criteria) this;
        }

        public Criteria andSelectedcarrierIn(List<Long> values) {
            addCriterion("SELECTEDCARRIER in", values, "selectedcarrier");
            return (Criteria) this;
        }

        public Criteria andSelectedcarrierNotIn(List<Long> values) {
            addCriterion("SELECTEDCARRIER not in", values, "selectedcarrier");
            return (Criteria) this;
        }

        public Criteria andSelectedcarrierBetween(Long value1, Long value2) {
            addCriterion("SELECTEDCARRIER between", value1, value2, "selectedcarrier");
            return (Criteria) this;
        }

        public Criteria andSelectedcarrierNotBetween(Long value1, Long value2) {
            addCriterion("SELECTEDCARRIER not between", value1, value2, "selectedcarrier");
            return (Criteria) this;
        }

        public Criteria andMissingpartsflagIsNull() {
            addCriterion("MISSINGPARTSFLAG is null");
            return (Criteria) this;
        }

        public Criteria andMissingpartsflagIsNotNull() {
            addCriterion("MISSINGPARTSFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andMissingpartsflagEqualTo(String value) {
            addCriterion("MISSINGPARTSFLAG =", value, "missingpartsflag");
            return (Criteria) this;
        }

        public Criteria andMissingpartsflagNotEqualTo(String value) {
            addCriterion("MISSINGPARTSFLAG <>", value, "missingpartsflag");
            return (Criteria) this;
        }

        public Criteria andMissingpartsflagGreaterThan(String value) {
            addCriterion("MISSINGPARTSFLAG >", value, "missingpartsflag");
            return (Criteria) this;
        }

        public Criteria andMissingpartsflagGreaterThanOrEqualTo(String value) {
            addCriterion("MISSINGPARTSFLAG >=", value, "missingpartsflag");
            return (Criteria) this;
        }

        public Criteria andMissingpartsflagLessThan(String value) {
            addCriterion("MISSINGPARTSFLAG <", value, "missingpartsflag");
            return (Criteria) this;
        }

        public Criteria andMissingpartsflagLessThanOrEqualTo(String value) {
            addCriterion("MISSINGPARTSFLAG <=", value, "missingpartsflag");
            return (Criteria) this;
        }

        public Criteria andMissingpartsflagLike(String value) {
            addCriterion("MISSINGPARTSFLAG like", value, "missingpartsflag");
            return (Criteria) this;
        }

        public Criteria andMissingpartsflagNotLike(String value) {
            addCriterion("MISSINGPARTSFLAG not like", value, "missingpartsflag");
            return (Criteria) this;
        }

        public Criteria andMissingpartsflagIn(List<String> values) {
            addCriterion("MISSINGPARTSFLAG in", values, "missingpartsflag");
            return (Criteria) this;
        }

        public Criteria andMissingpartsflagNotIn(List<String> values) {
            addCriterion("MISSINGPARTSFLAG not in", values, "missingpartsflag");
            return (Criteria) this;
        }

        public Criteria andMissingpartsflagBetween(String value1, String value2) {
            addCriterion("MISSINGPARTSFLAG between", value1, value2, "missingpartsflag");
            return (Criteria) this;
        }

        public Criteria andMissingpartsflagNotBetween(String value1, String value2) {
            addCriterion("MISSINGPARTSFLAG not between", value1, value2, "missingpartsflag");
            return (Criteria) this;
        }

        public Criteria andMissingidIsNull() {
            addCriterion("MISSINGID is null");
            return (Criteria) this;
        }

        public Criteria andMissingidIsNotNull() {
            addCriterion("MISSINGID is not null");
            return (Criteria) this;
        }

        public Criteria andMissingidEqualTo(String value) {
            addCriterion("MISSINGID =", value, "missingid");
            return (Criteria) this;
        }

        public Criteria andMissingidNotEqualTo(String value) {
            addCriterion("MISSINGID <>", value, "missingid");
            return (Criteria) this;
        }

        public Criteria andMissingidGreaterThan(String value) {
            addCriterion("MISSINGID >", value, "missingid");
            return (Criteria) this;
        }

        public Criteria andMissingidGreaterThanOrEqualTo(String value) {
            addCriterion("MISSINGID >=", value, "missingid");
            return (Criteria) this;
        }

        public Criteria andMissingidLessThan(String value) {
            addCriterion("MISSINGID <", value, "missingid");
            return (Criteria) this;
        }

        public Criteria andMissingidLessThanOrEqualTo(String value) {
            addCriterion("MISSINGID <=", value, "missingid");
            return (Criteria) this;
        }

        public Criteria andMissingidLike(String value) {
            addCriterion("MISSINGID like", value, "missingid");
            return (Criteria) this;
        }

        public Criteria andMissingidNotLike(String value) {
            addCriterion("MISSINGID not like", value, "missingid");
            return (Criteria) this;
        }

        public Criteria andMissingidIn(List<String> values) {
            addCriterion("MISSINGID in", values, "missingid");
            return (Criteria) this;
        }

        public Criteria andMissingidNotIn(List<String> values) {
            addCriterion("MISSINGID not in", values, "missingid");
            return (Criteria) this;
        }

        public Criteria andMissingidBetween(String value1, String value2) {
            addCriterion("MISSINGID between", value1, value2, "missingid");
            return (Criteria) this;
        }

        public Criteria andMissingidNotBetween(String value1, String value2) {
            addCriterion("MISSINGID not between", value1, value2, "missingid");
            return (Criteria) this;
        }

        public Criteria andProductpartnotesIsNull() {
            addCriterion("PRODUCTPARTNOTES is null");
            return (Criteria) this;
        }

        public Criteria andProductpartnotesIsNotNull() {
            addCriterion("PRODUCTPARTNOTES is not null");
            return (Criteria) this;
        }

        public Criteria andProductpartnotesEqualTo(String value) {
            addCriterion("PRODUCTPARTNOTES =", value, "productpartnotes");
            return (Criteria) this;
        }

        public Criteria andProductpartnotesNotEqualTo(String value) {
            addCriterion("PRODUCTPARTNOTES <>", value, "productpartnotes");
            return (Criteria) this;
        }

        public Criteria andProductpartnotesGreaterThan(String value) {
            addCriterion("PRODUCTPARTNOTES >", value, "productpartnotes");
            return (Criteria) this;
        }

        public Criteria andProductpartnotesGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCTPARTNOTES >=", value, "productpartnotes");
            return (Criteria) this;
        }

        public Criteria andProductpartnotesLessThan(String value) {
            addCriterion("PRODUCTPARTNOTES <", value, "productpartnotes");
            return (Criteria) this;
        }

        public Criteria andProductpartnotesLessThanOrEqualTo(String value) {
            addCriterion("PRODUCTPARTNOTES <=", value, "productpartnotes");
            return (Criteria) this;
        }

        public Criteria andProductpartnotesLike(String value) {
            addCriterion("PRODUCTPARTNOTES like", value, "productpartnotes");
            return (Criteria) this;
        }

        public Criteria andProductpartnotesNotLike(String value) {
            addCriterion("PRODUCTPARTNOTES not like", value, "productpartnotes");
            return (Criteria) this;
        }

        public Criteria andProductpartnotesIn(List<String> values) {
            addCriterion("PRODUCTPARTNOTES in", values, "productpartnotes");
            return (Criteria) this;
        }

        public Criteria andProductpartnotesNotIn(List<String> values) {
            addCriterion("PRODUCTPARTNOTES not in", values, "productpartnotes");
            return (Criteria) this;
        }

        public Criteria andProductpartnotesBetween(String value1, String value2) {
            addCriterion("PRODUCTPARTNOTES between", value1, value2, "productpartnotes");
            return (Criteria) this;
        }

        public Criteria andProductpartnotesNotBetween(String value1, String value2) {
            addCriterion("PRODUCTPARTNOTES not between", value1, value2, "productpartnotes");
            return (Criteria) this;
        }

        public Criteria andDeliverynumberIsNull() {
            addCriterion("DELIVERYNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andDeliverynumberIsNotNull() {
            addCriterion("DELIVERYNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverynumberEqualTo(String value) {
            addCriterion("DELIVERYNUMBER =", value, "deliverynumber");
            return (Criteria) this;
        }

        public Criteria andDeliverynumberNotEqualTo(String value) {
            addCriterion("DELIVERYNUMBER <>", value, "deliverynumber");
            return (Criteria) this;
        }

        public Criteria andDeliverynumberGreaterThan(String value) {
            addCriterion("DELIVERYNUMBER >", value, "deliverynumber");
            return (Criteria) this;
        }

        public Criteria andDeliverynumberGreaterThanOrEqualTo(String value) {
            addCriterion("DELIVERYNUMBER >=", value, "deliverynumber");
            return (Criteria) this;
        }

        public Criteria andDeliverynumberLessThan(String value) {
            addCriterion("DELIVERYNUMBER <", value, "deliverynumber");
            return (Criteria) this;
        }

        public Criteria andDeliverynumberLessThanOrEqualTo(String value) {
            addCriterion("DELIVERYNUMBER <=", value, "deliverynumber");
            return (Criteria) this;
        }

        public Criteria andDeliverynumberLike(String value) {
            addCriterion("DELIVERYNUMBER like", value, "deliverynumber");
            return (Criteria) this;
        }

        public Criteria andDeliverynumberNotLike(String value) {
            addCriterion("DELIVERYNUMBER not like", value, "deliverynumber");
            return (Criteria) this;
        }

        public Criteria andDeliverynumberIn(List<String> values) {
            addCriterion("DELIVERYNUMBER in", values, "deliverynumber");
            return (Criteria) this;
        }

        public Criteria andDeliverynumberNotIn(List<String> values) {
            addCriterion("DELIVERYNUMBER not in", values, "deliverynumber");
            return (Criteria) this;
        }

        public Criteria andDeliverynumberBetween(String value1, String value2) {
            addCriterion("DELIVERYNUMBER between", value1, value2, "deliverynumber");
            return (Criteria) this;
        }

        public Criteria andDeliverynumberNotBetween(String value1, String value2) {
            addCriterion("DELIVERYNUMBER not between", value1, value2, "deliverynumber");
            return (Criteria) this;
        }

        public Criteria andNotesIsNull() {
            addCriterion("NOTES is null");
            return (Criteria) this;
        }

        public Criteria andNotesIsNotNull() {
            addCriterion("NOTES is not null");
            return (Criteria) this;
        }

        public Criteria andNotesEqualTo(String value) {
            addCriterion("NOTES =", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotEqualTo(String value) {
            addCriterion("NOTES <>", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThan(String value) {
            addCriterion("NOTES >", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThanOrEqualTo(String value) {
            addCriterion("NOTES >=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThan(String value) {
            addCriterion("NOTES <", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThanOrEqualTo(String value) {
            addCriterion("NOTES <=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLike(String value) {
            addCriterion("NOTES like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotLike(String value) {
            addCriterion("NOTES not like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesIn(List<String> values) {
            addCriterion("NOTES in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotIn(List<String> values) {
            addCriterion("NOTES not in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesBetween(String value1, String value2) {
            addCriterion("NOTES between", value1, value2, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotBetween(String value1, String value2) {
            addCriterion("NOTES not between", value1, value2, "notes");
            return (Criteria) this;
        }

        public Criteria andOrderstatusIsNull() {
            addCriterion("ORDERSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andOrderstatusIsNotNull() {
            addCriterion("ORDERSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andOrderstatusEqualTo(Integer value) {
            addCriterion("ORDERSTATUS =", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotEqualTo(Integer value) {
            addCriterion("ORDERSTATUS <>", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusGreaterThan(Integer value) {
            addCriterion("ORDERSTATUS >", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORDERSTATUS >=", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusLessThan(Integer value) {
            addCriterion("ORDERSTATUS <", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusLessThanOrEqualTo(Integer value) {
            addCriterion("ORDERSTATUS <=", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusIn(List<Integer> values) {
            addCriterion("ORDERSTATUS in", values, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotIn(List<Integer> values) {
            addCriterion("ORDERSTATUS not in", values, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusBetween(Integer value1, Integer value2) {
            addCriterion("ORDERSTATUS between", value1, value2, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("ORDERSTATUS not between", value1, value2, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andRecordcreatedtimeIsNull() {
            addCriterion("RECORDCREATEDTIME is null");
            return (Criteria) this;
        }

        public Criteria andRecordcreatedtimeIsNotNull() {
            addCriterion("RECORDCREATEDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andRecordcreatedtimeEqualTo(Date value) {
            addCriterion("RECORDCREATEDTIME =", value, "recordcreatedtime");
            return (Criteria) this;
        }

        public Criteria andRecordcreatedtimeNotEqualTo(Date value) {
            addCriterion("RECORDCREATEDTIME <>", value, "recordcreatedtime");
            return (Criteria) this;
        }

        public Criteria andRecordcreatedtimeGreaterThan(Date value) {
            addCriterion("RECORDCREATEDTIME >", value, "recordcreatedtime");
            return (Criteria) this;
        }

        public Criteria andRecordcreatedtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RECORDCREATEDTIME >=", value, "recordcreatedtime");
            return (Criteria) this;
        }

        public Criteria andRecordcreatedtimeLessThan(Date value) {
            addCriterion("RECORDCREATEDTIME <", value, "recordcreatedtime");
            return (Criteria) this;
        }

        public Criteria andRecordcreatedtimeLessThanOrEqualTo(Date value) {
            addCriterion("RECORDCREATEDTIME <=", value, "recordcreatedtime");
            return (Criteria) this;
        }

        public Criteria andRecordcreatedtimeIn(List<Date> values) {
            addCriterion("RECORDCREATEDTIME in", values, "recordcreatedtime");
            return (Criteria) this;
        }

        public Criteria andRecordcreatedtimeNotIn(List<Date> values) {
            addCriterion("RECORDCREATEDTIME not in", values, "recordcreatedtime");
            return (Criteria) this;
        }

        public Criteria andRecordcreatedtimeBetween(Date value1, Date value2) {
            addCriterion("RECORDCREATEDTIME between", value1, value2, "recordcreatedtime");
            return (Criteria) this;
        }

        public Criteria andRecordcreatedtimeNotBetween(Date value1, Date value2) {
            addCriterion("RECORDCREATEDTIME not between", value1, value2, "recordcreatedtime");
            return (Criteria) this;
        }

        public Criteria andRecordstatusIsNull() {
            addCriterion("RECORDSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andRecordstatusIsNotNull() {
            addCriterion("RECORDSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andRecordstatusEqualTo(Integer value) {
            addCriterion("RECORDSTATUS =", value, "recordstatus");
            return (Criteria) this;
        }

        public Criteria andRecordstatusNotEqualTo(Integer value) {
            addCriterion("RECORDSTATUS <>", value, "recordstatus");
            return (Criteria) this;
        }

        public Criteria andRecordstatusGreaterThan(Integer value) {
            addCriterion("RECORDSTATUS >", value, "recordstatus");
            return (Criteria) this;
        }

        public Criteria andRecordstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("RECORDSTATUS >=", value, "recordstatus");
            return (Criteria) this;
        }

        public Criteria andRecordstatusLessThan(Integer value) {
            addCriterion("RECORDSTATUS <", value, "recordstatus");
            return (Criteria) this;
        }

        public Criteria andRecordstatusLessThanOrEqualTo(Integer value) {
            addCriterion("RECORDSTATUS <=", value, "recordstatus");
            return (Criteria) this;
        }

        public Criteria andRecordstatusIn(List<Integer> values) {
            addCriterion("RECORDSTATUS in", values, "recordstatus");
            return (Criteria) this;
        }

        public Criteria andRecordstatusNotIn(List<Integer> values) {
            addCriterion("RECORDSTATUS not in", values, "recordstatus");
            return (Criteria) this;
        }

        public Criteria andRecordstatusBetween(Integer value1, Integer value2) {
            addCriterion("RECORDSTATUS between", value1, value2, "recordstatus");
            return (Criteria) this;
        }

        public Criteria andRecordstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("RECORDSTATUS not between", value1, value2, "recordstatus");
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