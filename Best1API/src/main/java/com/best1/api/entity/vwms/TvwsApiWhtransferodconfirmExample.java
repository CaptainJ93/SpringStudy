package com.best1.api.entity.vwms;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TvwsApiWhtransferodconfirmExample {
  
    protected String orderByClause;

    protected boolean distinct;


    protected List<Criteria> oredCriteria;

  
    public TvwsApiWhtransferodconfirmExample() {
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

        public Criteria andInterwhorderidIsNull() {
            addCriterion("INTERWHORDERID is null");
            return (Criteria) this;
        }

        public Criteria andInterwhorderidIsNotNull() {
            addCriterion("INTERWHORDERID is not null");
            return (Criteria) this;
        }

        public Criteria andInterwhorderidEqualTo(Long value) {
            addCriterion("INTERWHORDERID =", value, "interwhorderid");
            return (Criteria) this;
        }

        public Criteria andInterwhorderidNotEqualTo(Long value) {
            addCriterion("INTERWHORDERID <>", value, "interwhorderid");
            return (Criteria) this;
        }

        public Criteria andInterwhorderidGreaterThan(Long value) {
            addCriterion("INTERWHORDERID >", value, "interwhorderid");
            return (Criteria) this;
        }

        public Criteria andInterwhorderidGreaterThanOrEqualTo(Long value) {
            addCriterion("INTERWHORDERID >=", value, "interwhorderid");
            return (Criteria) this;
        }

        public Criteria andInterwhorderidLessThan(Long value) {
            addCriterion("INTERWHORDERID <", value, "interwhorderid");
            return (Criteria) this;
        }

        public Criteria andInterwhorderidLessThanOrEqualTo(Long value) {
            addCriterion("INTERWHORDERID <=", value, "interwhorderid");
            return (Criteria) this;
        }

        public Criteria andInterwhorderidIn(List<Long> values) {
            addCriterion("INTERWHORDERID in", values, "interwhorderid");
            return (Criteria) this;
        }

        public Criteria andInterwhorderidNotIn(List<Long> values) {
            addCriterion("INTERWHORDERID not in", values, "interwhorderid");
            return (Criteria) this;
        }

        public Criteria andInterwhorderidBetween(Long value1, Long value2) {
            addCriterion("INTERWHORDERID between", value1, value2, "interwhorderid");
            return (Criteria) this;
        }

        public Criteria andInterwhorderidNotBetween(Long value1, Long value2) {
            addCriterion("INTERWHORDERID not between", value1, value2, "interwhorderid");
            return (Criteria) this;
        }

        public Criteria andFromwarehouseidIsNull() {
            addCriterion("FROMWAREHOUSEID is null");
            return (Criteria) this;
        }

        public Criteria andFromwarehouseidIsNotNull() {
            addCriterion("FROMWAREHOUSEID is not null");
            return (Criteria) this;
        }

        public Criteria andFromwarehouseidEqualTo(Long value) {
            addCriterion("FROMWAREHOUSEID =", value, "fromwarehouseid");
            return (Criteria) this;
        }

        public Criteria andFromwarehouseidNotEqualTo(Long value) {
            addCriterion("FROMWAREHOUSEID <>", value, "fromwarehouseid");
            return (Criteria) this;
        }

        public Criteria andFromwarehouseidGreaterThan(Long value) {
            addCriterion("FROMWAREHOUSEID >", value, "fromwarehouseid");
            return (Criteria) this;
        }

        public Criteria andFromwarehouseidGreaterThanOrEqualTo(Long value) {
            addCriterion("FROMWAREHOUSEID >=", value, "fromwarehouseid");
            return (Criteria) this;
        }

        public Criteria andFromwarehouseidLessThan(Long value) {
            addCriterion("FROMWAREHOUSEID <", value, "fromwarehouseid");
            return (Criteria) this;
        }

        public Criteria andFromwarehouseidLessThanOrEqualTo(Long value) {
            addCriterion("FROMWAREHOUSEID <=", value, "fromwarehouseid");
            return (Criteria) this;
        }

        public Criteria andFromwarehouseidIn(List<Long> values) {
            addCriterion("FROMWAREHOUSEID in", values, "fromwarehouseid");
            return (Criteria) this;
        }

        public Criteria andFromwarehouseidNotIn(List<Long> values) {
            addCriterion("FROMWAREHOUSEID not in", values, "fromwarehouseid");
            return (Criteria) this;
        }

        public Criteria andFromwarehouseidBetween(Long value1, Long value2) {
            addCriterion("FROMWAREHOUSEID between", value1, value2, "fromwarehouseid");
            return (Criteria) this;
        }

        public Criteria andFromwarehouseidNotBetween(Long value1, Long value2) {
            addCriterion("FROMWAREHOUSEID not between", value1, value2, "fromwarehouseid");
            return (Criteria) this;
        }

        public Criteria andTowarehouseidIsNull() {
            addCriterion("TOWAREHOUSEID is null");
            return (Criteria) this;
        }

        public Criteria andTowarehouseidIsNotNull() {
            addCriterion("TOWAREHOUSEID is not null");
            return (Criteria) this;
        }

        public Criteria andTowarehouseidEqualTo(Long value) {
            addCriterion("TOWAREHOUSEID =", value, "towarehouseid");
            return (Criteria) this;
        }

        public Criteria andTowarehouseidNotEqualTo(Long value) {
            addCriterion("TOWAREHOUSEID <>", value, "towarehouseid");
            return (Criteria) this;
        }

        public Criteria andTowarehouseidGreaterThan(Long value) {
            addCriterion("TOWAREHOUSEID >", value, "towarehouseid");
            return (Criteria) this;
        }

        public Criteria andTowarehouseidGreaterThanOrEqualTo(Long value) {
            addCriterion("TOWAREHOUSEID >=", value, "towarehouseid");
            return (Criteria) this;
        }

        public Criteria andTowarehouseidLessThan(Long value) {
            addCriterion("TOWAREHOUSEID <", value, "towarehouseid");
            return (Criteria) this;
        }

        public Criteria andTowarehouseidLessThanOrEqualTo(Long value) {
            addCriterion("TOWAREHOUSEID <=", value, "towarehouseid");
            return (Criteria) this;
        }

        public Criteria andTowarehouseidIn(List<Long> values) {
            addCriterion("TOWAREHOUSEID in", values, "towarehouseid");
            return (Criteria) this;
        }

        public Criteria andTowarehouseidNotIn(List<Long> values) {
            addCriterion("TOWAREHOUSEID not in", values, "towarehouseid");
            return (Criteria) this;
        }

        public Criteria andTowarehouseidBetween(Long value1, Long value2) {
            addCriterion("TOWAREHOUSEID between", value1, value2, "towarehouseid");
            return (Criteria) this;
        }

        public Criteria andTowarehouseidNotBetween(Long value1, Long value2) {
            addCriterion("TOWAREHOUSEID not between", value1, value2, "towarehouseid");
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

        public Criteria andTransferorderqtyIsNull() {
            addCriterion("TRANSFERORDERQTY is null");
            return (Criteria) this;
        }

        public Criteria andTransferorderqtyIsNotNull() {
            addCriterion("TRANSFERORDERQTY is not null");
            return (Criteria) this;
        }

        public Criteria andTransferorderqtyEqualTo(Long value) {
            addCriterion("TRANSFERORDERQTY =", value, "transferorderqty");
            return (Criteria) this;
        }

        public Criteria andTransferorderqtyNotEqualTo(Long value) {
            addCriterion("TRANSFERORDERQTY <>", value, "transferorderqty");
            return (Criteria) this;
        }

        public Criteria andTransferorderqtyGreaterThan(Long value) {
            addCriterion("TRANSFERORDERQTY >", value, "transferorderqty");
            return (Criteria) this;
        }

        public Criteria andTransferorderqtyGreaterThanOrEqualTo(Long value) {
            addCriterion("TRANSFERORDERQTY >=", value, "transferorderqty");
            return (Criteria) this;
        }

        public Criteria andTransferorderqtyLessThan(Long value) {
            addCriterion("TRANSFERORDERQTY <", value, "transferorderqty");
            return (Criteria) this;
        }

        public Criteria andTransferorderqtyLessThanOrEqualTo(Long value) {
            addCriterion("TRANSFERORDERQTY <=", value, "transferorderqty");
            return (Criteria) this;
        }

        public Criteria andTransferorderqtyIn(List<Long> values) {
            addCriterion("TRANSFERORDERQTY in", values, "transferorderqty");
            return (Criteria) this;
        }

        public Criteria andTransferorderqtyNotIn(List<Long> values) {
            addCriterion("TRANSFERORDERQTY not in", values, "transferorderqty");
            return (Criteria) this;
        }

        public Criteria andTransferorderqtyBetween(Long value1, Long value2) {
            addCriterion("TRANSFERORDERQTY between", value1, value2, "transferorderqty");
            return (Criteria) this;
        }

        public Criteria andTransferorderqtyNotBetween(Long value1, Long value2) {
            addCriterion("TRANSFERORDERQTY not between", value1, value2, "transferorderqty");
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

        public Criteria andReceiveddateIsNull() {
            addCriterion("RECEIVEDDATE is null");
            return (Criteria) this;
        }

        public Criteria andReceiveddateIsNotNull() {
            addCriterion("RECEIVEDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveddateEqualTo(Date value) {
            addCriterion("RECEIVEDDATE =", value, "receiveddate");
            return (Criteria) this;
        }

        public Criteria andReceiveddateNotEqualTo(Date value) {
            addCriterion("RECEIVEDDATE <>", value, "receiveddate");
            return (Criteria) this;
        }

        public Criteria andReceiveddateGreaterThan(Date value) {
            addCriterion("RECEIVEDDATE >", value, "receiveddate");
            return (Criteria) this;
        }

        public Criteria andReceiveddateGreaterThanOrEqualTo(Date value) {
            addCriterion("RECEIVEDDATE >=", value, "receiveddate");
            return (Criteria) this;
        }

        public Criteria andReceiveddateLessThan(Date value) {
            addCriterion("RECEIVEDDATE <", value, "receiveddate");
            return (Criteria) this;
        }

        public Criteria andReceiveddateLessThanOrEqualTo(Date value) {
            addCriterion("RECEIVEDDATE <=", value, "receiveddate");
            return (Criteria) this;
        }

        public Criteria andReceiveddateIn(List<Date> values) {
            addCriterion("RECEIVEDDATE in", values, "receiveddate");
            return (Criteria) this;
        }

        public Criteria andReceiveddateNotIn(List<Date> values) {
            addCriterion("RECEIVEDDATE not in", values, "receiveddate");
            return (Criteria) this;
        }

        public Criteria andReceiveddateBetween(Date value1, Date value2) {
            addCriterion("RECEIVEDDATE between", value1, value2, "receiveddate");
            return (Criteria) this;
        }

        public Criteria andReceiveddateNotBetween(Date value1, Date value2) {
            addCriterion("RECEIVEDDATE not between", value1, value2, "receiveddate");
            return (Criteria) this;
        }

        public Criteria andMessagetypeIsNull() {
            addCriterion("MESSAGETYPE is null");
            return (Criteria) this;
        }

        public Criteria andMessagetypeIsNotNull() {
            addCriterion("MESSAGETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMessagetypeEqualTo(String value) {
            addCriterion("MESSAGETYPE =", value, "messagetype");
            return (Criteria) this;
        }

        public Criteria andMessagetypeNotEqualTo(String value) {
            addCriterion("MESSAGETYPE <>", value, "messagetype");
            return (Criteria) this;
        }

        public Criteria andMessagetypeGreaterThan(String value) {
            addCriterion("MESSAGETYPE >", value, "messagetype");
            return (Criteria) this;
        }

        public Criteria andMessagetypeGreaterThanOrEqualTo(String value) {
            addCriterion("MESSAGETYPE >=", value, "messagetype");
            return (Criteria) this;
        }

        public Criteria andMessagetypeLessThan(String value) {
            addCriterion("MESSAGETYPE <", value, "messagetype");
            return (Criteria) this;
        }

        public Criteria andMessagetypeLessThanOrEqualTo(String value) {
            addCriterion("MESSAGETYPE <=", value, "messagetype");
            return (Criteria) this;
        }

        public Criteria andMessagetypeLike(String value) {
            addCriterion("MESSAGETYPE like", value, "messagetype");
            return (Criteria) this;
        }

        public Criteria andMessagetypeNotLike(String value) {
            addCriterion("MESSAGETYPE not like", value, "messagetype");
            return (Criteria) this;
        }

        public Criteria andMessagetypeIn(List<String> values) {
            addCriterion("MESSAGETYPE in", values, "messagetype");
            return (Criteria) this;
        }

        public Criteria andMessagetypeNotIn(List<String> values) {
            addCriterion("MESSAGETYPE not in", values, "messagetype");
            return (Criteria) this;
        }

        public Criteria andMessagetypeBetween(String value1, String value2) {
            addCriterion("MESSAGETYPE between", value1, value2, "messagetype");
            return (Criteria) this;
        }

        public Criteria andMessagetypeNotBetween(String value1, String value2) {
            addCriterion("MESSAGETYPE not between", value1, value2, "messagetype");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("REASON is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("REASON is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("REASON =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("REASON <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("REASON >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("REASON >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("REASON <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("REASON <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("REASON like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("REASON not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("REASON in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("REASON not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("REASON between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("REASON not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andShippedproducttypeIsNull() {
            addCriterion("SHIPPEDPRODUCTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andShippedproducttypeIsNotNull() {
            addCriterion("SHIPPEDPRODUCTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andShippedproducttypeEqualTo(String value) {
            addCriterion("SHIPPEDPRODUCTTYPE =", value, "shippedproducttype");
            return (Criteria) this;
        }

        public Criteria andShippedproducttypeNotEqualTo(String value) {
            addCriterion("SHIPPEDPRODUCTTYPE <>", value, "shippedproducttype");
            return (Criteria) this;
        }

        public Criteria andShippedproducttypeGreaterThan(String value) {
            addCriterion("SHIPPEDPRODUCTTYPE >", value, "shippedproducttype");
            return (Criteria) this;
        }

        public Criteria andShippedproducttypeGreaterThanOrEqualTo(String value) {
            addCriterion("SHIPPEDPRODUCTTYPE >=", value, "shippedproducttype");
            return (Criteria) this;
        }

        public Criteria andShippedproducttypeLessThan(String value) {
            addCriterion("SHIPPEDPRODUCTTYPE <", value, "shippedproducttype");
            return (Criteria) this;
        }

        public Criteria andShippedproducttypeLessThanOrEqualTo(String value) {
            addCriterion("SHIPPEDPRODUCTTYPE <=", value, "shippedproducttype");
            return (Criteria) this;
        }

        public Criteria andShippedproducttypeLike(String value) {
            addCriterion("SHIPPEDPRODUCTTYPE like", value, "shippedproducttype");
            return (Criteria) this;
        }

        public Criteria andShippedproducttypeNotLike(String value) {
            addCriterion("SHIPPEDPRODUCTTYPE not like", value, "shippedproducttype");
            return (Criteria) this;
        }

        public Criteria andShippedproducttypeIn(List<String> values) {
            addCriterion("SHIPPEDPRODUCTTYPE in", values, "shippedproducttype");
            return (Criteria) this;
        }

        public Criteria andShippedproducttypeNotIn(List<String> values) {
            addCriterion("SHIPPEDPRODUCTTYPE not in", values, "shippedproducttype");
            return (Criteria) this;
        }

        public Criteria andShippedproducttypeBetween(String value1, String value2) {
            addCriterion("SHIPPEDPRODUCTTYPE between", value1, value2, "shippedproducttype");
            return (Criteria) this;
        }

        public Criteria andShippedproducttypeNotBetween(String value1, String value2) {
            addCriterion("SHIPPEDPRODUCTTYPE not between", value1, value2, "shippedproducttype");
            return (Criteria) this;
        }

        public Criteria andTransferstatusIsNull() {
            addCriterion("TRANSFERSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andTransferstatusIsNotNull() {
            addCriterion("TRANSFERSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andTransferstatusEqualTo(Integer value) {
            addCriterion("TRANSFERSTATUS =", value, "transferstatus");
            return (Criteria) this;
        }

        public Criteria andTransferstatusNotEqualTo(Integer value) {
            addCriterion("TRANSFERSTATUS <>", value, "transferstatus");
            return (Criteria) this;
        }

        public Criteria andTransferstatusGreaterThan(Integer value) {
            addCriterion("TRANSFERSTATUS >", value, "transferstatus");
            return (Criteria) this;
        }

        public Criteria andTransferstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("TRANSFERSTATUS >=", value, "transferstatus");
            return (Criteria) this;
        }

        public Criteria andTransferstatusLessThan(Integer value) {
            addCriterion("TRANSFERSTATUS <", value, "transferstatus");
            return (Criteria) this;
        }

        public Criteria andTransferstatusLessThanOrEqualTo(Integer value) {
            addCriterion("TRANSFERSTATUS <=", value, "transferstatus");
            return (Criteria) this;
        }

        public Criteria andTransferstatusIn(List<Integer> values) {
            addCriterion("TRANSFERSTATUS in", values, "transferstatus");
            return (Criteria) this;
        }

        public Criteria andTransferstatusNotIn(List<Integer> values) {
            addCriterion("TRANSFERSTATUS not in", values, "transferstatus");
            return (Criteria) this;
        }

        public Criteria andTransferstatusBetween(Integer value1, Integer value2) {
            addCriterion("TRANSFERSTATUS between", value1, value2, "transferstatus");
            return (Criteria) this;
        }

        public Criteria andTransferstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("TRANSFERSTATUS not between", value1, value2, "transferstatus");
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