package com.best1.api.entity.vwms;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TvwsApiSuppliershiporderExample {
 
    protected String orderByClause;

   
    protected boolean distinct;

    
    protected List<Criteria> oredCriteria;

  
    public TvwsApiSuppliershiporderExample() {
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

        public Criteria andShipordernoIsNull() {
            addCriterion("SHIPORDERNO is null");
            return (Criteria) this;
        }

        public Criteria andShipordernoIsNotNull() {
            addCriterion("SHIPORDERNO is not null");
            return (Criteria) this;
        }

        public Criteria andShipordernoEqualTo(Long value) {
            addCriterion("SHIPORDERNO =", value, "shiporderno");
            return (Criteria) this;
        }

        public Criteria andShipordernoNotEqualTo(Long value) {
            addCriterion("SHIPORDERNO <>", value, "shiporderno");
            return (Criteria) this;
        }

        public Criteria andShipordernoGreaterThan(Long value) {
            addCriterion("SHIPORDERNO >", value, "shiporderno");
            return (Criteria) this;
        }

        public Criteria andShipordernoGreaterThanOrEqualTo(Long value) {
            addCriterion("SHIPORDERNO >=", value, "shiporderno");
            return (Criteria) this;
        }

        public Criteria andShipordernoLessThan(Long value) {
            addCriterion("SHIPORDERNO <", value, "shiporderno");
            return (Criteria) this;
        }

        public Criteria andShipordernoLessThanOrEqualTo(Long value) {
            addCriterion("SHIPORDERNO <=", value, "shiporderno");
            return (Criteria) this;
        }

        public Criteria andShipordernoIn(List<Long> values) {
            addCriterion("SHIPORDERNO in", values, "shiporderno");
            return (Criteria) this;
        }

        public Criteria andShipordernoNotIn(List<Long> values) {
            addCriterion("SHIPORDERNO not in", values, "shiporderno");
            return (Criteria) this;
        }

        public Criteria andShipordernoBetween(Long value1, Long value2) {
            addCriterion("SHIPORDERNO between", value1, value2, "shiporderno");
            return (Criteria) this;
        }

        public Criteria andShipordernoNotBetween(Long value1, Long value2) {
            addCriterion("SHIPORDERNO not between", value1, value2, "shiporderno");
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

        public Criteria andPurchaseordernoIsNull() {
            addCriterion("PURCHASEORDERNO is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseordernoIsNotNull() {
            addCriterion("PURCHASEORDERNO is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseordernoEqualTo(Long value) {
            addCriterion("PURCHASEORDERNO =", value, "purchaseorderno");
            return (Criteria) this;
        }

        public Criteria andPurchaseordernoNotEqualTo(Long value) {
            addCriterion("PURCHASEORDERNO <>", value, "purchaseorderno");
            return (Criteria) this;
        }

        public Criteria andPurchaseordernoGreaterThan(Long value) {
            addCriterion("PURCHASEORDERNO >", value, "purchaseorderno");
            return (Criteria) this;
        }

        public Criteria andPurchaseordernoGreaterThanOrEqualTo(Long value) {
            addCriterion("PURCHASEORDERNO >=", value, "purchaseorderno");
            return (Criteria) this;
        }

        public Criteria andPurchaseordernoLessThan(Long value) {
            addCriterion("PURCHASEORDERNO <", value, "purchaseorderno");
            return (Criteria) this;
        }

        public Criteria andPurchaseordernoLessThanOrEqualTo(Long value) {
            addCriterion("PURCHASEORDERNO <=", value, "purchaseorderno");
            return (Criteria) this;
        }

        public Criteria andPurchaseordernoIn(List<Long> values) {
            addCriterion("PURCHASEORDERNO in", values, "purchaseorderno");
            return (Criteria) this;
        }

        public Criteria andPurchaseordernoNotIn(List<Long> values) {
            addCriterion("PURCHASEORDERNO not in", values, "purchaseorderno");
            return (Criteria) this;
        }

        public Criteria andPurchaseordernoBetween(Long value1, Long value2) {
            addCriterion("PURCHASEORDERNO between", value1, value2, "purchaseorderno");
            return (Criteria) this;
        }

        public Criteria andPurchaseordernoNotBetween(Long value1, Long value2) {
            addCriterion("PURCHASEORDERNO not between", value1, value2, "purchaseorderno");
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

        public Criteria andColordescIsNull() {
            addCriterion("COLORDESC is null");
            return (Criteria) this;
        }

        public Criteria andColordescIsNotNull() {
            addCriterion("COLORDESC is not null");
            return (Criteria) this;
        }

        public Criteria andColordescEqualTo(String value) {
            addCriterion("COLORDESC =", value, "colordesc");
            return (Criteria) this;
        }

        public Criteria andColordescNotEqualTo(String value) {
            addCriterion("COLORDESC <>", value, "colordesc");
            return (Criteria) this;
        }

        public Criteria andColordescGreaterThan(String value) {
            addCriterion("COLORDESC >", value, "colordesc");
            return (Criteria) this;
        }

        public Criteria andColordescGreaterThanOrEqualTo(String value) {
            addCriterion("COLORDESC >=", value, "colordesc");
            return (Criteria) this;
        }

        public Criteria andColordescLessThan(String value) {
            addCriterion("COLORDESC <", value, "colordesc");
            return (Criteria) this;
        }

        public Criteria andColordescLessThanOrEqualTo(String value) {
            addCriterion("COLORDESC <=", value, "colordesc");
            return (Criteria) this;
        }

        public Criteria andColordescLike(String value) {
            addCriterion("COLORDESC like", value, "colordesc");
            return (Criteria) this;
        }

        public Criteria andColordescNotLike(String value) {
            addCriterion("COLORDESC not like", value, "colordesc");
            return (Criteria) this;
        }

        public Criteria andColordescIn(List<String> values) {
            addCriterion("COLORDESC in", values, "colordesc");
            return (Criteria) this;
        }

        public Criteria andColordescNotIn(List<String> values) {
            addCriterion("COLORDESC not in", values, "colordesc");
            return (Criteria) this;
        }

        public Criteria andColordescBetween(String value1, String value2) {
            addCriterion("COLORDESC between", value1, value2, "colordesc");
            return (Criteria) this;
        }

        public Criteria andColordescNotBetween(String value1, String value2) {
            addCriterion("COLORDESC not between", value1, value2, "colordesc");
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

        public Criteria andStyledescIsNull() {
            addCriterion("STYLEDESC is null");
            return (Criteria) this;
        }

        public Criteria andStyledescIsNotNull() {
            addCriterion("STYLEDESC is not null");
            return (Criteria) this;
        }

        public Criteria andStyledescEqualTo(String value) {
            addCriterion("STYLEDESC =", value, "styledesc");
            return (Criteria) this;
        }

        public Criteria andStyledescNotEqualTo(String value) {
            addCriterion("STYLEDESC <>", value, "styledesc");
            return (Criteria) this;
        }

        public Criteria andStyledescGreaterThan(String value) {
            addCriterion("STYLEDESC >", value, "styledesc");
            return (Criteria) this;
        }

        public Criteria andStyledescGreaterThanOrEqualTo(String value) {
            addCriterion("STYLEDESC >=", value, "styledesc");
            return (Criteria) this;
        }

        public Criteria andStyledescLessThan(String value) {
            addCriterion("STYLEDESC <", value, "styledesc");
            return (Criteria) this;
        }

        public Criteria andStyledescLessThanOrEqualTo(String value) {
            addCriterion("STYLEDESC <=", value, "styledesc");
            return (Criteria) this;
        }

        public Criteria andStyledescLike(String value) {
            addCriterion("STYLEDESC like", value, "styledesc");
            return (Criteria) this;
        }

        public Criteria andStyledescNotLike(String value) {
            addCriterion("STYLEDESC not like", value, "styledesc");
            return (Criteria) this;
        }

        public Criteria andStyledescIn(List<String> values) {
            addCriterion("STYLEDESC in", values, "styledesc");
            return (Criteria) this;
        }

        public Criteria andStyledescNotIn(List<String> values) {
            addCriterion("STYLEDESC not in", values, "styledesc");
            return (Criteria) this;
        }

        public Criteria andStyledescBetween(String value1, String value2) {
            addCriterion("STYLEDESC between", value1, value2, "styledesc");
            return (Criteria) this;
        }

        public Criteria andStyledescNotBetween(String value1, String value2) {
            addCriterion("STYLEDESC not between", value1, value2, "styledesc");
            return (Criteria) this;
        }

        public Criteria andShiporderquantityIsNull() {
            addCriterion("SHIPORDERQUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andShiporderquantityIsNotNull() {
            addCriterion("SHIPORDERQUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andShiporderquantityEqualTo(Long value) {
            addCriterion("SHIPORDERQUANTITY =", value, "shiporderquantity");
            return (Criteria) this;
        }

        public Criteria andShiporderquantityNotEqualTo(Long value) {
            addCriterion("SHIPORDERQUANTITY <>", value, "shiporderquantity");
            return (Criteria) this;
        }

        public Criteria andShiporderquantityGreaterThan(Long value) {
            addCriterion("SHIPORDERQUANTITY >", value, "shiporderquantity");
            return (Criteria) this;
        }

        public Criteria andShiporderquantityGreaterThanOrEqualTo(Long value) {
            addCriterion("SHIPORDERQUANTITY >=", value, "shiporderquantity");
            return (Criteria) this;
        }

        public Criteria andShiporderquantityLessThan(Long value) {
            addCriterion("SHIPORDERQUANTITY <", value, "shiporderquantity");
            return (Criteria) this;
        }

        public Criteria andShiporderquantityLessThanOrEqualTo(Long value) {
            addCriterion("SHIPORDERQUANTITY <=", value, "shiporderquantity");
            return (Criteria) this;
        }

        public Criteria andShiporderquantityIn(List<Long> values) {
            addCriterion("SHIPORDERQUANTITY in", values, "shiporderquantity");
            return (Criteria) this;
        }

        public Criteria andShiporderquantityNotIn(List<Long> values) {
            addCriterion("SHIPORDERQUANTITY not in", values, "shiporderquantity");
            return (Criteria) this;
        }

        public Criteria andShiporderquantityBetween(Long value1, Long value2) {
            addCriterion("SHIPORDERQUANTITY between", value1, value2, "shiporderquantity");
            return (Criteria) this;
        }

        public Criteria andShiporderquantityNotBetween(Long value1, Long value2) {
            addCriterion("SHIPORDERQUANTITY not between", value1, value2, "shiporderquantity");
            return (Criteria) this;
        }

        public Criteria andDeliverydateIsNull() {
            addCriterion("DELIVERYDATE is null");
            return (Criteria) this;
        }

        public Criteria andDeliverydateIsNotNull() {
            addCriterion("DELIVERYDATE is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverydateEqualTo(Date value) {
            addCriterion("DELIVERYDATE =", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateNotEqualTo(Date value) {
            addCriterion("DELIVERYDATE <>", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateGreaterThan(Date value) {
            addCriterion("DELIVERYDATE >", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateGreaterThanOrEqualTo(Date value) {
            addCriterion("DELIVERYDATE >=", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateLessThan(Date value) {
            addCriterion("DELIVERYDATE <", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateLessThanOrEqualTo(Date value) {
            addCriterion("DELIVERYDATE <=", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateIn(List<Date> values) {
            addCriterion("DELIVERYDATE in", values, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateNotIn(List<Date> values) {
            addCriterion("DELIVERYDATE not in", values, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateBetween(Date value1, Date value2) {
            addCriterion("DELIVERYDATE between", value1, value2, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateNotBetween(Date value1, Date value2) {
            addCriterion("DELIVERYDATE not between", value1, value2, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDockidIsNull() {
            addCriterion("DOCKID is null");
            return (Criteria) this;
        }

        public Criteria andDockidIsNotNull() {
            addCriterion("DOCKID is not null");
            return (Criteria) this;
        }

        public Criteria andDockidEqualTo(Long value) {
            addCriterion("DOCKID =", value, "dockid");
            return (Criteria) this;
        }

        public Criteria andDockidNotEqualTo(Long value) {
            addCriterion("DOCKID <>", value, "dockid");
            return (Criteria) this;
        }

        public Criteria andDockidGreaterThan(Long value) {
            addCriterion("DOCKID >", value, "dockid");
            return (Criteria) this;
        }

        public Criteria andDockidGreaterThanOrEqualTo(Long value) {
            addCriterion("DOCKID >=", value, "dockid");
            return (Criteria) this;
        }

        public Criteria andDockidLessThan(Long value) {
            addCriterion("DOCKID <", value, "dockid");
            return (Criteria) this;
        }

        public Criteria andDockidLessThanOrEqualTo(Long value) {
            addCriterion("DOCKID <=", value, "dockid");
            return (Criteria) this;
        }

        public Criteria andDockidIn(List<Long> values) {
            addCriterion("DOCKID in", values, "dockid");
            return (Criteria) this;
        }

        public Criteria andDockidNotIn(List<Long> values) {
            addCriterion("DOCKID not in", values, "dockid");
            return (Criteria) this;
        }

        public Criteria andDockidBetween(Long value1, Long value2) {
            addCriterion("DOCKID between", value1, value2, "dockid");
            return (Criteria) this;
        }

        public Criteria andDockidNotBetween(Long value1, Long value2) {
            addCriterion("DOCKID not between", value1, value2, "dockid");
            return (Criteria) this;
        }

        public Criteria andArrivaltimefromhourIsNull() {
            addCriterion("ARRIVALTIMEFROMHOUR is null");
            return (Criteria) this;
        }

        public Criteria andArrivaltimefromhourIsNotNull() {
            addCriterion("ARRIVALTIMEFROMHOUR is not null");
            return (Criteria) this;
        }

        public Criteria andArrivaltimefromhourEqualTo(Integer value) {
            addCriterion("ARRIVALTIMEFROMHOUR =", value, "arrivaltimefromhour");
            return (Criteria) this;
        }

        public Criteria andArrivaltimefromhourNotEqualTo(Integer value) {
            addCriterion("ARRIVALTIMEFROMHOUR <>", value, "arrivaltimefromhour");
            return (Criteria) this;
        }

        public Criteria andArrivaltimefromhourGreaterThan(Integer value) {
            addCriterion("ARRIVALTIMEFROMHOUR >", value, "arrivaltimefromhour");
            return (Criteria) this;
        }

        public Criteria andArrivaltimefromhourGreaterThanOrEqualTo(Integer value) {
            addCriterion("ARRIVALTIMEFROMHOUR >=", value, "arrivaltimefromhour");
            return (Criteria) this;
        }

        public Criteria andArrivaltimefromhourLessThan(Integer value) {
            addCriterion("ARRIVALTIMEFROMHOUR <", value, "arrivaltimefromhour");
            return (Criteria) this;
        }

        public Criteria andArrivaltimefromhourLessThanOrEqualTo(Integer value) {
            addCriterion("ARRIVALTIMEFROMHOUR <=", value, "arrivaltimefromhour");
            return (Criteria) this;
        }

        public Criteria andArrivaltimefromhourIn(List<Integer> values) {
            addCriterion("ARRIVALTIMEFROMHOUR in", values, "arrivaltimefromhour");
            return (Criteria) this;
        }

        public Criteria andArrivaltimefromhourNotIn(List<Integer> values) {
            addCriterion("ARRIVALTIMEFROMHOUR not in", values, "arrivaltimefromhour");
            return (Criteria) this;
        }

        public Criteria andArrivaltimefromhourBetween(Integer value1, Integer value2) {
            addCriterion("ARRIVALTIMEFROMHOUR between", value1, value2, "arrivaltimefromhour");
            return (Criteria) this;
        }

        public Criteria andArrivaltimefromhourNotBetween(Integer value1, Integer value2) {
            addCriterion("ARRIVALTIMEFROMHOUR not between", value1, value2, "arrivaltimefromhour");
            return (Criteria) this;
        }

        public Criteria andArrivaltimefromminIsNull() {
            addCriterion("ARRIVALTIMEFROMMIN is null");
            return (Criteria) this;
        }

        public Criteria andArrivaltimefromminIsNotNull() {
            addCriterion("ARRIVALTIMEFROMMIN is not null");
            return (Criteria) this;
        }

        public Criteria andArrivaltimefromminEqualTo(Integer value) {
            addCriterion("ARRIVALTIMEFROMMIN =", value, "arrivaltimefrommin");
            return (Criteria) this;
        }

        public Criteria andArrivaltimefromminNotEqualTo(Integer value) {
            addCriterion("ARRIVALTIMEFROMMIN <>", value, "arrivaltimefrommin");
            return (Criteria) this;
        }

        public Criteria andArrivaltimefromminGreaterThan(Integer value) {
            addCriterion("ARRIVALTIMEFROMMIN >", value, "arrivaltimefrommin");
            return (Criteria) this;
        }

        public Criteria andArrivaltimefromminGreaterThanOrEqualTo(Integer value) {
            addCriterion("ARRIVALTIMEFROMMIN >=", value, "arrivaltimefrommin");
            return (Criteria) this;
        }

        public Criteria andArrivaltimefromminLessThan(Integer value) {
            addCriterion("ARRIVALTIMEFROMMIN <", value, "arrivaltimefrommin");
            return (Criteria) this;
        }

        public Criteria andArrivaltimefromminLessThanOrEqualTo(Integer value) {
            addCriterion("ARRIVALTIMEFROMMIN <=", value, "arrivaltimefrommin");
            return (Criteria) this;
        }

        public Criteria andArrivaltimefromminIn(List<Integer> values) {
            addCriterion("ARRIVALTIMEFROMMIN in", values, "arrivaltimefrommin");
            return (Criteria) this;
        }

        public Criteria andArrivaltimefromminNotIn(List<Integer> values) {
            addCriterion("ARRIVALTIMEFROMMIN not in", values, "arrivaltimefrommin");
            return (Criteria) this;
        }

        public Criteria andArrivaltimefromminBetween(Integer value1, Integer value2) {
            addCriterion("ARRIVALTIMEFROMMIN between", value1, value2, "arrivaltimefrommin");
            return (Criteria) this;
        }

        public Criteria andArrivaltimefromminNotBetween(Integer value1, Integer value2) {
            addCriterion("ARRIVALTIMEFROMMIN not between", value1, value2, "arrivaltimefrommin");
            return (Criteria) this;
        }

        public Criteria andArrivaltimetohourIsNull() {
            addCriterion("ARRIVALTIMETOHOUR is null");
            return (Criteria) this;
        }

        public Criteria andArrivaltimetohourIsNotNull() {
            addCriterion("ARRIVALTIMETOHOUR is not null");
            return (Criteria) this;
        }

        public Criteria andArrivaltimetohourEqualTo(Integer value) {
            addCriterion("ARRIVALTIMETOHOUR =", value, "arrivaltimetohour");
            return (Criteria) this;
        }

        public Criteria andArrivaltimetohourNotEqualTo(Integer value) {
            addCriterion("ARRIVALTIMETOHOUR <>", value, "arrivaltimetohour");
            return (Criteria) this;
        }

        public Criteria andArrivaltimetohourGreaterThan(Integer value) {
            addCriterion("ARRIVALTIMETOHOUR >", value, "arrivaltimetohour");
            return (Criteria) this;
        }

        public Criteria andArrivaltimetohourGreaterThanOrEqualTo(Integer value) {
            addCriterion("ARRIVALTIMETOHOUR >=", value, "arrivaltimetohour");
            return (Criteria) this;
        }

        public Criteria andArrivaltimetohourLessThan(Integer value) {
            addCriterion("ARRIVALTIMETOHOUR <", value, "arrivaltimetohour");
            return (Criteria) this;
        }

        public Criteria andArrivaltimetohourLessThanOrEqualTo(Integer value) {
            addCriterion("ARRIVALTIMETOHOUR <=", value, "arrivaltimetohour");
            return (Criteria) this;
        }

        public Criteria andArrivaltimetohourIn(List<Integer> values) {
            addCriterion("ARRIVALTIMETOHOUR in", values, "arrivaltimetohour");
            return (Criteria) this;
        }

        public Criteria andArrivaltimetohourNotIn(List<Integer> values) {
            addCriterion("ARRIVALTIMETOHOUR not in", values, "arrivaltimetohour");
            return (Criteria) this;
        }

        public Criteria andArrivaltimetohourBetween(Integer value1, Integer value2) {
            addCriterion("ARRIVALTIMETOHOUR between", value1, value2, "arrivaltimetohour");
            return (Criteria) this;
        }

        public Criteria andArrivaltimetohourNotBetween(Integer value1, Integer value2) {
            addCriterion("ARRIVALTIMETOHOUR not between", value1, value2, "arrivaltimetohour");
            return (Criteria) this;
        }

        public Criteria andArrivaltimetominIsNull() {
            addCriterion("ARRIVALTIMETOMIN is null");
            return (Criteria) this;
        }

        public Criteria andArrivaltimetominIsNotNull() {
            addCriterion("ARRIVALTIMETOMIN is not null");
            return (Criteria) this;
        }

        public Criteria andArrivaltimetominEqualTo(Integer value) {
            addCriterion("ARRIVALTIMETOMIN =", value, "arrivaltimetomin");
            return (Criteria) this;
        }

        public Criteria andArrivaltimetominNotEqualTo(Integer value) {
            addCriterion("ARRIVALTIMETOMIN <>", value, "arrivaltimetomin");
            return (Criteria) this;
        }

        public Criteria andArrivaltimetominGreaterThan(Integer value) {
            addCriterion("ARRIVALTIMETOMIN >", value, "arrivaltimetomin");
            return (Criteria) this;
        }

        public Criteria andArrivaltimetominGreaterThanOrEqualTo(Integer value) {
            addCriterion("ARRIVALTIMETOMIN >=", value, "arrivaltimetomin");
            return (Criteria) this;
        }

        public Criteria andArrivaltimetominLessThan(Integer value) {
            addCriterion("ARRIVALTIMETOMIN <", value, "arrivaltimetomin");
            return (Criteria) this;
        }

        public Criteria andArrivaltimetominLessThanOrEqualTo(Integer value) {
            addCriterion("ARRIVALTIMETOMIN <=", value, "arrivaltimetomin");
            return (Criteria) this;
        }

        public Criteria andArrivaltimetominIn(List<Integer> values) {
            addCriterion("ARRIVALTIMETOMIN in", values, "arrivaltimetomin");
            return (Criteria) this;
        }

        public Criteria andArrivaltimetominNotIn(List<Integer> values) {
            addCriterion("ARRIVALTIMETOMIN not in", values, "arrivaltimetomin");
            return (Criteria) this;
        }

        public Criteria andArrivaltimetominBetween(Integer value1, Integer value2) {
            addCriterion("ARRIVALTIMETOMIN between", value1, value2, "arrivaltimetomin");
            return (Criteria) this;
        }

        public Criteria andArrivaltimetominNotBetween(Integer value1, Integer value2) {
            addCriterion("ARRIVALTIMETOMIN not between", value1, value2, "arrivaltimetomin");
            return (Criteria) this;
        }

        public Criteria andSsordercreationdtIsNull() {
            addCriterion("SSORDERCREATIONDT is null");
            return (Criteria) this;
        }

        public Criteria andSsordercreationdtIsNotNull() {
            addCriterion("SSORDERCREATIONDT is not null");
            return (Criteria) this;
        }

        public Criteria andSsordercreationdtEqualTo(Date value) {
            addCriterion("SSORDERCREATIONDT =", value, "ssordercreationdt");
            return (Criteria) this;
        }

        public Criteria andSsordercreationdtNotEqualTo(Date value) {
            addCriterion("SSORDERCREATIONDT <>", value, "ssordercreationdt");
            return (Criteria) this;
        }

        public Criteria andSsordercreationdtGreaterThan(Date value) {
            addCriterion("SSORDERCREATIONDT >", value, "ssordercreationdt");
            return (Criteria) this;
        }

        public Criteria andSsordercreationdtGreaterThanOrEqualTo(Date value) {
            addCriterion("SSORDERCREATIONDT >=", value, "ssordercreationdt");
            return (Criteria) this;
        }

        public Criteria andSsordercreationdtLessThan(Date value) {
            addCriterion("SSORDERCREATIONDT <", value, "ssordercreationdt");
            return (Criteria) this;
        }

        public Criteria andSsordercreationdtLessThanOrEqualTo(Date value) {
            addCriterion("SSORDERCREATIONDT <=", value, "ssordercreationdt");
            return (Criteria) this;
        }

        public Criteria andSsordercreationdtIn(List<Date> values) {
            addCriterion("SSORDERCREATIONDT in", values, "ssordercreationdt");
            return (Criteria) this;
        }

        public Criteria andSsordercreationdtNotIn(List<Date> values) {
            addCriterion("SSORDERCREATIONDT not in", values, "ssordercreationdt");
            return (Criteria) this;
        }

        public Criteria andSsordercreationdtBetween(Date value1, Date value2) {
            addCriterion("SSORDERCREATIONDT between", value1, value2, "ssordercreationdt");
            return (Criteria) this;
        }

        public Criteria andSsordercreationdtNotBetween(Date value1, Date value2) {
            addCriterion("SSORDERCREATIONDT not between", value1, value2, "ssordercreationdt");
            return (Criteria) this;
        }

        public Criteria andCrossdockflagIsNull() {
            addCriterion("CROSSDOCKFLAG is null");
            return (Criteria) this;
        }

        public Criteria andCrossdockflagIsNotNull() {
            addCriterion("CROSSDOCKFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andCrossdockflagEqualTo(String value) {
            addCriterion("CROSSDOCKFLAG =", value, "crossdockflag");
            return (Criteria) this;
        }

        public Criteria andCrossdockflagNotEqualTo(String value) {
            addCriterion("CROSSDOCKFLAG <>", value, "crossdockflag");
            return (Criteria) this;
        }

        public Criteria andCrossdockflagGreaterThan(String value) {
            addCriterion("CROSSDOCKFLAG >", value, "crossdockflag");
            return (Criteria) this;
        }

        public Criteria andCrossdockflagGreaterThanOrEqualTo(String value) {
            addCriterion("CROSSDOCKFLAG >=", value, "crossdockflag");
            return (Criteria) this;
        }

        public Criteria andCrossdockflagLessThan(String value) {
            addCriterion("CROSSDOCKFLAG <", value, "crossdockflag");
            return (Criteria) this;
        }

        public Criteria andCrossdockflagLessThanOrEqualTo(String value) {
            addCriterion("CROSSDOCKFLAG <=", value, "crossdockflag");
            return (Criteria) this;
        }

        public Criteria andCrossdockflagLike(String value) {
            addCriterion("CROSSDOCKFLAG like", value, "crossdockflag");
            return (Criteria) this;
        }

        public Criteria andCrossdockflagNotLike(String value) {
            addCriterion("CROSSDOCKFLAG not like", value, "crossdockflag");
            return (Criteria) this;
        }

        public Criteria andCrossdockflagIn(List<String> values) {
            addCriterion("CROSSDOCKFLAG in", values, "crossdockflag");
            return (Criteria) this;
        }

        public Criteria andCrossdockflagNotIn(List<String> values) {
            addCriterion("CROSSDOCKFLAG not in", values, "crossdockflag");
            return (Criteria) this;
        }

        public Criteria andCrossdockflagBetween(String value1, String value2) {
            addCriterion("CROSSDOCKFLAG between", value1, value2, "crossdockflag");
            return (Criteria) this;
        }

        public Criteria andCrossdockflagNotBetween(String value1, String value2) {
            addCriterion("CROSSDOCKFLAG not between", value1, value2, "crossdockflag");
            return (Criteria) this;
        }

        public Criteria andSplinstIsNull() {
            addCriterion("SPLINST is null");
            return (Criteria) this;
        }

        public Criteria andSplinstIsNotNull() {
            addCriterion("SPLINST is not null");
            return (Criteria) this;
        }

        public Criteria andSplinstEqualTo(String value) {
            addCriterion("SPLINST =", value, "splinst");
            return (Criteria) this;
        }

        public Criteria andSplinstNotEqualTo(String value) {
            addCriterion("SPLINST <>", value, "splinst");
            return (Criteria) this;
        }

        public Criteria andSplinstGreaterThan(String value) {
            addCriterion("SPLINST >", value, "splinst");
            return (Criteria) this;
        }

        public Criteria andSplinstGreaterThanOrEqualTo(String value) {
            addCriterion("SPLINST >=", value, "splinst");
            return (Criteria) this;
        }

        public Criteria andSplinstLessThan(String value) {
            addCriterion("SPLINST <", value, "splinst");
            return (Criteria) this;
        }

        public Criteria andSplinstLessThanOrEqualTo(String value) {
            addCriterion("SPLINST <=", value, "splinst");
            return (Criteria) this;
        }

        public Criteria andSplinstLike(String value) {
            addCriterion("SPLINST like", value, "splinst");
            return (Criteria) this;
        }

        public Criteria andSplinstNotLike(String value) {
            addCriterion("SPLINST not like", value, "splinst");
            return (Criteria) this;
        }

        public Criteria andSplinstIn(List<String> values) {
            addCriterion("SPLINST in", values, "splinst");
            return (Criteria) this;
        }

        public Criteria andSplinstNotIn(List<String> values) {
            addCriterion("SPLINST not in", values, "splinst");
            return (Criteria) this;
        }

        public Criteria andSplinstBetween(String value1, String value2) {
            addCriterion("SPLINST between", value1, value2, "splinst");
            return (Criteria) this;
        }

        public Criteria andSplinstNotBetween(String value1, String value2) {
            addCriterion("SPLINST not between", value1, value2, "splinst");
            return (Criteria) this;
        }

        public Criteria andIscoordinationmarkIsNull() {
            addCriterion("ISCOORDINATIONMARK is null");
            return (Criteria) this;
        }

        public Criteria andIscoordinationmarkIsNotNull() {
            addCriterion("ISCOORDINATIONMARK is not null");
            return (Criteria) this;
        }

        public Criteria andIscoordinationmarkEqualTo(String value) {
            addCriterion("ISCOORDINATIONMARK =", value, "iscoordinationmark");
            return (Criteria) this;
        }

        public Criteria andIscoordinationmarkNotEqualTo(String value) {
            addCriterion("ISCOORDINATIONMARK <>", value, "iscoordinationmark");
            return (Criteria) this;
        }

        public Criteria andIscoordinationmarkGreaterThan(String value) {
            addCriterion("ISCOORDINATIONMARK >", value, "iscoordinationmark");
            return (Criteria) this;
        }

        public Criteria andIscoordinationmarkGreaterThanOrEqualTo(String value) {
            addCriterion("ISCOORDINATIONMARK >=", value, "iscoordinationmark");
            return (Criteria) this;
        }

        public Criteria andIscoordinationmarkLessThan(String value) {
            addCriterion("ISCOORDINATIONMARK <", value, "iscoordinationmark");
            return (Criteria) this;
        }

        public Criteria andIscoordinationmarkLessThanOrEqualTo(String value) {
            addCriterion("ISCOORDINATIONMARK <=", value, "iscoordinationmark");
            return (Criteria) this;
        }

        public Criteria andIscoordinationmarkLike(String value) {
            addCriterion("ISCOORDINATIONMARK like", value, "iscoordinationmark");
            return (Criteria) this;
        }

        public Criteria andIscoordinationmarkNotLike(String value) {
            addCriterion("ISCOORDINATIONMARK not like", value, "iscoordinationmark");
            return (Criteria) this;
        }

        public Criteria andIscoordinationmarkIn(List<String> values) {
            addCriterion("ISCOORDINATIONMARK in", values, "iscoordinationmark");
            return (Criteria) this;
        }

        public Criteria andIscoordinationmarkNotIn(List<String> values) {
            addCriterion("ISCOORDINATIONMARK not in", values, "iscoordinationmark");
            return (Criteria) this;
        }

        public Criteria andIscoordinationmarkBetween(String value1, String value2) {
            addCriterion("ISCOORDINATIONMARK between", value1, value2, "iscoordinationmark");
            return (Criteria) this;
        }

        public Criteria andIscoordinationmarkNotBetween(String value1, String value2) {
            addCriterion("ISCOORDINATIONMARK not between", value1, value2, "iscoordinationmark");
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

        public Criteria andBatchidIsNull() {
            addCriterion("BATCHID is null");
            return (Criteria) this;
        }

        public Criteria andBatchidIsNotNull() {
            addCriterion("BATCHID is not null");
            return (Criteria) this;
        }

        public Criteria andBatchidEqualTo(String value) {
            addCriterion("BATCHID =", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotEqualTo(String value) {
            addCriterion("BATCHID <>", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidGreaterThan(String value) {
            addCriterion("BATCHID >", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidGreaterThanOrEqualTo(String value) {
            addCriterion("BATCHID >=", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidLessThan(String value) {
            addCriterion("BATCHID <", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidLessThanOrEqualTo(String value) {
            addCriterion("BATCHID <=", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidLike(String value) {
            addCriterion("BATCHID like", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotLike(String value) {
            addCriterion("BATCHID not like", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidIn(List<String> values) {
            addCriterion("BATCHID in", values, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotIn(List<String> values) {
            addCriterion("BATCHID not in", values, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidBetween(String value1, String value2) {
            addCriterion("BATCHID between", value1, value2, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotBetween(String value1, String value2) {
            addCriterion("BATCHID not between", value1, value2, "batchid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ET1_CHINA.TVWS_API_SUPPLIERSHIPORDER
     *
     * @mbggenerated do_not_delete_during_merge Mon Aug 29 16:43:06 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ET1_CHINA.TVWS_API_SUPPLIERSHIPORDER
     *
     * @mbggenerated Mon Aug 29 16:43:06 CST 2016
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