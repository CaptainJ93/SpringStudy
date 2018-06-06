package com.best1.api.entity.vwms;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TvwsApiCsowholeConfirmExample {

    protected String orderByClause;

 
    protected boolean distinct;


    protected List<Criteria> oredCriteria;

 
    public TvwsApiCsowholeConfirmExample() {
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

        public Criteria andShiporderidIsNull() {
            addCriterion("SHIPORDERID is null");
            return (Criteria) this;
        }

        public Criteria andShiporderidIsNotNull() {
            addCriterion("SHIPORDERID is not null");
            return (Criteria) this;
        }

        public Criteria andShiporderidEqualTo(Long value) {
            addCriterion("SHIPORDERID =", value, "shiporderid");
            return (Criteria) this;
        }

        public Criteria andShiporderidNotEqualTo(Long value) {
            addCriterion("SHIPORDERID <>", value, "shiporderid");
            return (Criteria) this;
        }

        public Criteria andShiporderidGreaterThan(Long value) {
            addCriterion("SHIPORDERID >", value, "shiporderid");
            return (Criteria) this;
        }

        public Criteria andShiporderidGreaterThanOrEqualTo(Long value) {
            addCriterion("SHIPORDERID >=", value, "shiporderid");
            return (Criteria) this;
        }

        public Criteria andShiporderidLessThan(Long value) {
            addCriterion("SHIPORDERID <", value, "shiporderid");
            return (Criteria) this;
        }

        public Criteria andShiporderidLessThanOrEqualTo(Long value) {
            addCriterion("SHIPORDERID <=", value, "shiporderid");
            return (Criteria) this;
        }

        public Criteria andShiporderidIn(List<Long> values) {
            addCriterion("SHIPORDERID in", values, "shiporderid");
            return (Criteria) this;
        }

        public Criteria andShiporderidNotIn(List<Long> values) {
            addCriterion("SHIPORDERID not in", values, "shiporderid");
            return (Criteria) this;
        }

        public Criteria andShiporderidBetween(Long value1, Long value2) {
            addCriterion("SHIPORDERID between", value1, value2, "shiporderid");
            return (Criteria) this;
        }

        public Criteria andShiporderidNotBetween(Long value1, Long value2) {
            addCriterion("SHIPORDERID not between", value1, value2, "shiporderid");
            return (Criteria) this;
        }

        public Criteria andShipordersequenceIsNull() {
            addCriterion("SHIPORDERSEQUENCE is null");
            return (Criteria) this;
        }

        public Criteria andShipordersequenceIsNotNull() {
            addCriterion("SHIPORDERSEQUENCE is not null");
            return (Criteria) this;
        }

        public Criteria andShipordersequenceEqualTo(Integer value) {
            addCriterion("SHIPORDERSEQUENCE =", value, "shipordersequence");
            return (Criteria) this;
        }

        public Criteria andShipordersequenceNotEqualTo(Integer value) {
            addCriterion("SHIPORDERSEQUENCE <>", value, "shipordersequence");
            return (Criteria) this;
        }

        public Criteria andShipordersequenceGreaterThan(Integer value) {
            addCriterion("SHIPORDERSEQUENCE >", value, "shipordersequence");
            return (Criteria) this;
        }

        public Criteria andShipordersequenceGreaterThanOrEqualTo(Integer value) {
            addCriterion("SHIPORDERSEQUENCE >=", value, "shipordersequence");
            return (Criteria) this;
        }

        public Criteria andShipordersequenceLessThan(Integer value) {
            addCriterion("SHIPORDERSEQUENCE <", value, "shipordersequence");
            return (Criteria) this;
        }

        public Criteria andShipordersequenceLessThanOrEqualTo(Integer value) {
            addCriterion("SHIPORDERSEQUENCE <=", value, "shipordersequence");
            return (Criteria) this;
        }

        public Criteria andShipordersequenceIn(List<Integer> values) {
            addCriterion("SHIPORDERSEQUENCE in", values, "shipordersequence");
            return (Criteria) this;
        }

        public Criteria andShipordersequenceNotIn(List<Integer> values) {
            addCriterion("SHIPORDERSEQUENCE not in", values, "shipordersequence");
            return (Criteria) this;
        }

        public Criteria andShipordersequenceBetween(Integer value1, Integer value2) {
            addCriterion("SHIPORDERSEQUENCE between", value1, value2, "shipordersequence");
            return (Criteria) this;
        }

        public Criteria andShipordersequenceNotBetween(Integer value1, Integer value2) {
            addCriterion("SHIPORDERSEQUENCE not between", value1, value2, "shipordersequence");
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

        public Criteria andProductquantityIsNull() {
            addCriterion("PRODUCTQUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andProductquantityIsNotNull() {
            addCriterion("PRODUCTQUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andProductquantityEqualTo(Long value) {
            addCriterion("PRODUCTQUANTITY =", value, "productquantity");
            return (Criteria) this;
        }

        public Criteria andProductquantityNotEqualTo(Long value) {
            addCriterion("PRODUCTQUANTITY <>", value, "productquantity");
            return (Criteria) this;
        }

        public Criteria andProductquantityGreaterThan(Long value) {
            addCriterion("PRODUCTQUANTITY >", value, "productquantity");
            return (Criteria) this;
        }

        public Criteria andProductquantityGreaterThanOrEqualTo(Long value) {
            addCriterion("PRODUCTQUANTITY >=", value, "productquantity");
            return (Criteria) this;
        }

        public Criteria andProductquantityLessThan(Long value) {
            addCriterion("PRODUCTQUANTITY <", value, "productquantity");
            return (Criteria) this;
        }

        public Criteria andProductquantityLessThanOrEqualTo(Long value) {
            addCriterion("PRODUCTQUANTITY <=", value, "productquantity");
            return (Criteria) this;
        }

        public Criteria andProductquantityIn(List<Long> values) {
            addCriterion("PRODUCTQUANTITY in", values, "productquantity");
            return (Criteria) this;
        }

        public Criteria andProductquantityNotIn(List<Long> values) {
            addCriterion("PRODUCTQUANTITY not in", values, "productquantity");
            return (Criteria) this;
        }

        public Criteria andProductquantityBetween(Long value1, Long value2) {
            addCriterion("PRODUCTQUANTITY between", value1, value2, "productquantity");
            return (Criteria) this;
        }

        public Criteria andProductquantityNotBetween(Long value1, Long value2) {
            addCriterion("PRODUCTQUANTITY not between", value1, value2, "productquantity");
            return (Criteria) this;
        }

        public Criteria andIntransitquantityIsNull() {
            addCriterion("INTRANSITQUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andIntransitquantityIsNotNull() {
            addCriterion("INTRANSITQUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andIntransitquantityEqualTo(Long value) {
            addCriterion("INTRANSITQUANTITY =", value, "intransitquantity");
            return (Criteria) this;
        }

        public Criteria andIntransitquantityNotEqualTo(Long value) {
            addCriterion("INTRANSITQUANTITY <>", value, "intransitquantity");
            return (Criteria) this;
        }

        public Criteria andIntransitquantityGreaterThan(Long value) {
            addCriterion("INTRANSITQUANTITY >", value, "intransitquantity");
            return (Criteria) this;
        }

        public Criteria andIntransitquantityGreaterThanOrEqualTo(Long value) {
            addCriterion("INTRANSITQUANTITY >=", value, "intransitquantity");
            return (Criteria) this;
        }

        public Criteria andIntransitquantityLessThan(Long value) {
            addCriterion("INTRANSITQUANTITY <", value, "intransitquantity");
            return (Criteria) this;
        }

        public Criteria andIntransitquantityLessThanOrEqualTo(Long value) {
            addCriterion("INTRANSITQUANTITY <=", value, "intransitquantity");
            return (Criteria) this;
        }

        public Criteria andIntransitquantityIn(List<Long> values) {
            addCriterion("INTRANSITQUANTITY in", values, "intransitquantity");
            return (Criteria) this;
        }

        public Criteria andIntransitquantityNotIn(List<Long> values) {
            addCriterion("INTRANSITQUANTITY not in", values, "intransitquantity");
            return (Criteria) this;
        }

        public Criteria andIntransitquantityBetween(Long value1, Long value2) {
            addCriterion("INTRANSITQUANTITY between", value1, value2, "intransitquantity");
            return (Criteria) this;
        }

        public Criteria andIntransitquantityNotBetween(Long value1, Long value2) {
            addCriterion("INTRANSITQUANTITY not between", value1, value2, "intransitquantity");
            return (Criteria) this;
        }

        public Criteria andActualshippeddateIsNull() {
            addCriterion("ACTUALSHIPPEDDATE is null");
            return (Criteria) this;
        }

        public Criteria andActualshippeddateIsNotNull() {
            addCriterion("ACTUALSHIPPEDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andActualshippeddateEqualTo(Date value) {
            addCriterion("ACTUALSHIPPEDDATE =", value, "actualshippeddate");
            return (Criteria) this;
        }

        public Criteria andActualshippeddateNotEqualTo(Date value) {
            addCriterion("ACTUALSHIPPEDDATE <>", value, "actualshippeddate");
            return (Criteria) this;
        }

        public Criteria andActualshippeddateGreaterThan(Date value) {
            addCriterion("ACTUALSHIPPEDDATE >", value, "actualshippeddate");
            return (Criteria) this;
        }

        public Criteria andActualshippeddateGreaterThanOrEqualTo(Date value) {
            addCriterion("ACTUALSHIPPEDDATE >=", value, "actualshippeddate");
            return (Criteria) this;
        }

        public Criteria andActualshippeddateLessThan(Date value) {
            addCriterion("ACTUALSHIPPEDDATE <", value, "actualshippeddate");
            return (Criteria) this;
        }

        public Criteria andActualshippeddateLessThanOrEqualTo(Date value) {
            addCriterion("ACTUALSHIPPEDDATE <=", value, "actualshippeddate");
            return (Criteria) this;
        }

        public Criteria andActualshippeddateIn(List<Date> values) {
            addCriterion("ACTUALSHIPPEDDATE in", values, "actualshippeddate");
            return (Criteria) this;
        }

        public Criteria andActualshippeddateNotIn(List<Date> values) {
            addCriterion("ACTUALSHIPPEDDATE not in", values, "actualshippeddate");
            return (Criteria) this;
        }

        public Criteria andActualshippeddateBetween(Date value1, Date value2) {
            addCriterion("ACTUALSHIPPEDDATE between", value1, value2, "actualshippeddate");
            return (Criteria) this;
        }

        public Criteria andActualshippeddateNotBetween(Date value1, Date value2) {
            addCriterion("ACTUALSHIPPEDDATE not between", value1, value2, "actualshippeddate");
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

        public Criteria andCsostatusIsNull() {
            addCriterion("CSOSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andCsostatusIsNotNull() {
            addCriterion("CSOSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCsostatusEqualTo(Integer value) {
            addCriterion("CSOSTATUS =", value, "csostatus");
            return (Criteria) this;
        }

        public Criteria andCsostatusNotEqualTo(Integer value) {
            addCriterion("CSOSTATUS <>", value, "csostatus");
            return (Criteria) this;
        }

        public Criteria andCsostatusGreaterThan(Integer value) {
            addCriterion("CSOSTATUS >", value, "csostatus");
            return (Criteria) this;
        }

        public Criteria andCsostatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("CSOSTATUS >=", value, "csostatus");
            return (Criteria) this;
        }

        public Criteria andCsostatusLessThan(Integer value) {
            addCriterion("CSOSTATUS <", value, "csostatus");
            return (Criteria) this;
        }

        public Criteria andCsostatusLessThanOrEqualTo(Integer value) {
            addCriterion("CSOSTATUS <=", value, "csostatus");
            return (Criteria) this;
        }

        public Criteria andCsostatusIn(List<Integer> values) {
            addCriterion("CSOSTATUS in", values, "csostatus");
            return (Criteria) this;
        }

        public Criteria andCsostatusNotIn(List<Integer> values) {
            addCriterion("CSOSTATUS not in", values, "csostatus");
            return (Criteria) this;
        }

        public Criteria andCsostatusBetween(Integer value1, Integer value2) {
            addCriterion("CSOSTATUS between", value1, value2, "csostatus");
            return (Criteria) this;
        }

        public Criteria andCsostatusNotBetween(Integer value1, Integer value2) {
            addCriterion("CSOSTATUS not between", value1, value2, "csostatus");
            return (Criteria) this;
        }

        public Criteria andDeliveryareaIsNull() {
            addCriterion("DELIVERYAREA is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryareaIsNotNull() {
            addCriterion("DELIVERYAREA is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryareaEqualTo(String value) {
            addCriterion("DELIVERYAREA =", value, "deliveryarea");
            return (Criteria) this;
        }

        public Criteria andDeliveryareaNotEqualTo(String value) {
            addCriterion("DELIVERYAREA <>", value, "deliveryarea");
            return (Criteria) this;
        }

        public Criteria andDeliveryareaGreaterThan(String value) {
            addCriterion("DELIVERYAREA >", value, "deliveryarea");
            return (Criteria) this;
        }

        public Criteria andDeliveryareaGreaterThanOrEqualTo(String value) {
            addCriterion("DELIVERYAREA >=", value, "deliveryarea");
            return (Criteria) this;
        }

        public Criteria andDeliveryareaLessThan(String value) {
            addCriterion("DELIVERYAREA <", value, "deliveryarea");
            return (Criteria) this;
        }

        public Criteria andDeliveryareaLessThanOrEqualTo(String value) {
            addCriterion("DELIVERYAREA <=", value, "deliveryarea");
            return (Criteria) this;
        }

        public Criteria andDeliveryareaLike(String value) {
            addCriterion("DELIVERYAREA like", value, "deliveryarea");
            return (Criteria) this;
        }

        public Criteria andDeliveryareaNotLike(String value) {
            addCriterion("DELIVERYAREA not like", value, "deliveryarea");
            return (Criteria) this;
        }

        public Criteria andDeliveryareaIn(List<String> values) {
            addCriterion("DELIVERYAREA in", values, "deliveryarea");
            return (Criteria) this;
        }

        public Criteria andDeliveryareaNotIn(List<String> values) {
            addCriterion("DELIVERYAREA not in", values, "deliveryarea");
            return (Criteria) this;
        }

        public Criteria andDeliveryareaBetween(String value1, String value2) {
            addCriterion("DELIVERYAREA between", value1, value2, "deliveryarea");
            return (Criteria) this;
        }

        public Criteria andDeliveryareaNotBetween(String value1, String value2) {
            addCriterion("DELIVERYAREA not between", value1, value2, "deliveryarea");
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