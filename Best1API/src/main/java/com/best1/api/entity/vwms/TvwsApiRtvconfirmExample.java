package com.best1.api.entity.vwms;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TvwsApiRtvconfirmExample {

    protected String orderByClause;

 
    protected boolean distinct;

    protected List<Criteria> oredCriteria;


    public TvwsApiRtvconfirmExample() {
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

        public Criteria andRtvorderidIsNull() {
            addCriterion("RTVORDERID is null");
            return (Criteria) this;
        }

        public Criteria andRtvorderidIsNotNull() {
            addCriterion("RTVORDERID is not null");
            return (Criteria) this;
        }

        public Criteria andRtvorderidEqualTo(Long value) {
            addCriterion("RTVORDERID =", value, "rtvorderid");
            return (Criteria) this;
        }

        public Criteria andRtvorderidNotEqualTo(Long value) {
            addCriterion("RTVORDERID <>", value, "rtvorderid");
            return (Criteria) this;
        }

        public Criteria andRtvorderidGreaterThan(Long value) {
            addCriterion("RTVORDERID >", value, "rtvorderid");
            return (Criteria) this;
        }

        public Criteria andRtvorderidGreaterThanOrEqualTo(Long value) {
            addCriterion("RTVORDERID >=", value, "rtvorderid");
            return (Criteria) this;
        }

        public Criteria andRtvorderidLessThan(Long value) {
            addCriterion("RTVORDERID <", value, "rtvorderid");
            return (Criteria) this;
        }

        public Criteria andRtvorderidLessThanOrEqualTo(Long value) {
            addCriterion("RTVORDERID <=", value, "rtvorderid");
            return (Criteria) this;
        }

        public Criteria andRtvorderidIn(List<Long> values) {
            addCriterion("RTVORDERID in", values, "rtvorderid");
            return (Criteria) this;
        }

        public Criteria andRtvorderidNotIn(List<Long> values) {
            addCriterion("RTVORDERID not in", values, "rtvorderid");
            return (Criteria) this;
        }

        public Criteria andRtvorderidBetween(Long value1, Long value2) {
            addCriterion("RTVORDERID between", value1, value2, "rtvorderid");
            return (Criteria) this;
        }

        public Criteria andRtvorderidNotBetween(Long value1, Long value2) {
            addCriterion("RTVORDERID not between", value1, value2, "rtvorderid");
            return (Criteria) this;
        }

        public Criteria andRtvordersequenceIsNull() {
            addCriterion("RTVORDERSEQUENCE is null");
            return (Criteria) this;
        }

        public Criteria andRtvordersequenceIsNotNull() {
            addCriterion("RTVORDERSEQUENCE is not null");
            return (Criteria) this;
        }

        public Criteria andRtvordersequenceEqualTo(Integer value) {
            addCriterion("RTVORDERSEQUENCE =", value, "rtvordersequence");
            return (Criteria) this;
        }

        public Criteria andRtvordersequenceNotEqualTo(Integer value) {
            addCriterion("RTVORDERSEQUENCE <>", value, "rtvordersequence");
            return (Criteria) this;
        }

        public Criteria andRtvordersequenceGreaterThan(Integer value) {
            addCriterion("RTVORDERSEQUENCE >", value, "rtvordersequence");
            return (Criteria) this;
        }

        public Criteria andRtvordersequenceGreaterThanOrEqualTo(Integer value) {
            addCriterion("RTVORDERSEQUENCE >=", value, "rtvordersequence");
            return (Criteria) this;
        }

        public Criteria andRtvordersequenceLessThan(Integer value) {
            addCriterion("RTVORDERSEQUENCE <", value, "rtvordersequence");
            return (Criteria) this;
        }

        public Criteria andRtvordersequenceLessThanOrEqualTo(Integer value) {
            addCriterion("RTVORDERSEQUENCE <=", value, "rtvordersequence");
            return (Criteria) this;
        }

        public Criteria andRtvordersequenceIn(List<Integer> values) {
            addCriterion("RTVORDERSEQUENCE in", values, "rtvordersequence");
            return (Criteria) this;
        }

        public Criteria andRtvordersequenceNotIn(List<Integer> values) {
            addCriterion("RTVORDERSEQUENCE not in", values, "rtvordersequence");
            return (Criteria) this;
        }

        public Criteria andRtvordersequenceBetween(Integer value1, Integer value2) {
            addCriterion("RTVORDERSEQUENCE between", value1, value2, "rtvordersequence");
            return (Criteria) this;
        }

        public Criteria andRtvordersequenceNotBetween(Integer value1, Integer value2) {
            addCriterion("RTVORDERSEQUENCE not between", value1, value2, "rtvordersequence");
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

        public Criteria andDamagedquantityIsNull() {
            addCriterion("DAMAGEDQUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andDamagedquantityIsNotNull() {
            addCriterion("DAMAGEDQUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andDamagedquantityEqualTo(Long value) {
            addCriterion("DAMAGEDQUANTITY =", value, "damagedquantity");
            return (Criteria) this;
        }

        public Criteria andDamagedquantityNotEqualTo(Long value) {
            addCriterion("DAMAGEDQUANTITY <>", value, "damagedquantity");
            return (Criteria) this;
        }

        public Criteria andDamagedquantityGreaterThan(Long value) {
            addCriterion("DAMAGEDQUANTITY >", value, "damagedquantity");
            return (Criteria) this;
        }

        public Criteria andDamagedquantityGreaterThanOrEqualTo(Long value) {
            addCriterion("DAMAGEDQUANTITY >=", value, "damagedquantity");
            return (Criteria) this;
        }

        public Criteria andDamagedquantityLessThan(Long value) {
            addCriterion("DAMAGEDQUANTITY <", value, "damagedquantity");
            return (Criteria) this;
        }

        public Criteria andDamagedquantityLessThanOrEqualTo(Long value) {
            addCriterion("DAMAGEDQUANTITY <=", value, "damagedquantity");
            return (Criteria) this;
        }

        public Criteria andDamagedquantityIn(List<Long> values) {
            addCriterion("DAMAGEDQUANTITY in", values, "damagedquantity");
            return (Criteria) this;
        }

        public Criteria andDamagedquantityNotIn(List<Long> values) {
            addCriterion("DAMAGEDQUANTITY not in", values, "damagedquantity");
            return (Criteria) this;
        }

        public Criteria andDamagedquantityBetween(Long value1, Long value2) {
            addCriterion("DAMAGEDQUANTITY between", value1, value2, "damagedquantity");
            return (Criteria) this;
        }

        public Criteria andDamagedquantityNotBetween(Long value1, Long value2) {
            addCriterion("DAMAGEDQUANTITY not between", value1, value2, "damagedquantity");
            return (Criteria) this;
        }

        public Criteria andReturnquantityIsNull() {
            addCriterion("RETURNQUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andReturnquantityIsNotNull() {
            addCriterion("RETURNQUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andReturnquantityEqualTo(Long value) {
            addCriterion("RETURNQUANTITY =", value, "returnquantity");
            return (Criteria) this;
        }

        public Criteria andReturnquantityNotEqualTo(Long value) {
            addCriterion("RETURNQUANTITY <>", value, "returnquantity");
            return (Criteria) this;
        }

        public Criteria andReturnquantityGreaterThan(Long value) {
            addCriterion("RETURNQUANTITY >", value, "returnquantity");
            return (Criteria) this;
        }

        public Criteria andReturnquantityGreaterThanOrEqualTo(Long value) {
            addCriterion("RETURNQUANTITY >=", value, "returnquantity");
            return (Criteria) this;
        }

        public Criteria andReturnquantityLessThan(Long value) {
            addCriterion("RETURNQUANTITY <", value, "returnquantity");
            return (Criteria) this;
        }

        public Criteria andReturnquantityLessThanOrEqualTo(Long value) {
            addCriterion("RETURNQUANTITY <=", value, "returnquantity");
            return (Criteria) this;
        }

        public Criteria andReturnquantityIn(List<Long> values) {
            addCriterion("RETURNQUANTITY in", values, "returnquantity");
            return (Criteria) this;
        }

        public Criteria andReturnquantityNotIn(List<Long> values) {
            addCriterion("RETURNQUANTITY not in", values, "returnquantity");
            return (Criteria) this;
        }

        public Criteria andReturnquantityBetween(Long value1, Long value2) {
            addCriterion("RETURNQUANTITY between", value1, value2, "returnquantity");
            return (Criteria) this;
        }

        public Criteria andReturnquantityNotBetween(Long value1, Long value2) {
            addCriterion("RETURNQUANTITY not between", value1, value2, "returnquantity");
            return (Criteria) this;
        }

        public Criteria andReturnquantitypickedIsNull() {
            addCriterion("RETURNQUANTITYPICKED is null");
            return (Criteria) this;
        }

        public Criteria andReturnquantitypickedIsNotNull() {
            addCriterion("RETURNQUANTITYPICKED is not null");
            return (Criteria) this;
        }

        public Criteria andReturnquantitypickedEqualTo(Long value) {
            addCriterion("RETURNQUANTITYPICKED =", value, "returnquantitypicked");
            return (Criteria) this;
        }

        public Criteria andReturnquantitypickedNotEqualTo(Long value) {
            addCriterion("RETURNQUANTITYPICKED <>", value, "returnquantitypicked");
            return (Criteria) this;
        }

        public Criteria andReturnquantitypickedGreaterThan(Long value) {
            addCriterion("RETURNQUANTITYPICKED >", value, "returnquantitypicked");
            return (Criteria) this;
        }

        public Criteria andReturnquantitypickedGreaterThanOrEqualTo(Long value) {
            addCriterion("RETURNQUANTITYPICKED >=", value, "returnquantitypicked");
            return (Criteria) this;
        }

        public Criteria andReturnquantitypickedLessThan(Long value) {
            addCriterion("RETURNQUANTITYPICKED <", value, "returnquantitypicked");
            return (Criteria) this;
        }

        public Criteria andReturnquantitypickedLessThanOrEqualTo(Long value) {
            addCriterion("RETURNQUANTITYPICKED <=", value, "returnquantitypicked");
            return (Criteria) this;
        }

        public Criteria andReturnquantitypickedIn(List<Long> values) {
            addCriterion("RETURNQUANTITYPICKED in", values, "returnquantitypicked");
            return (Criteria) this;
        }

        public Criteria andReturnquantitypickedNotIn(List<Long> values) {
            addCriterion("RETURNQUANTITYPICKED not in", values, "returnquantitypicked");
            return (Criteria) this;
        }

        public Criteria andReturnquantitypickedBetween(Long value1, Long value2) {
            addCriterion("RETURNQUANTITYPICKED between", value1, value2, "returnquantitypicked");
            return (Criteria) this;
        }

        public Criteria andReturnquantitypickedNotBetween(Long value1, Long value2) {
            addCriterion("RETURNQUANTITYPICKED not between", value1, value2, "returnquantitypicked");
            return (Criteria) this;
        }

        public Criteria andDamagedquantitypickedIsNull() {
            addCriterion("DAMAGEDQUANTITYPICKED is null");
            return (Criteria) this;
        }

        public Criteria andDamagedquantitypickedIsNotNull() {
            addCriterion("DAMAGEDQUANTITYPICKED is not null");
            return (Criteria) this;
        }

        public Criteria andDamagedquantitypickedEqualTo(Long value) {
            addCriterion("DAMAGEDQUANTITYPICKED =", value, "damagedquantitypicked");
            return (Criteria) this;
        }

        public Criteria andDamagedquantitypickedNotEqualTo(Long value) {
            addCriterion("DAMAGEDQUANTITYPICKED <>", value, "damagedquantitypicked");
            return (Criteria) this;
        }

        public Criteria andDamagedquantitypickedGreaterThan(Long value) {
            addCriterion("DAMAGEDQUANTITYPICKED >", value, "damagedquantitypicked");
            return (Criteria) this;
        }

        public Criteria andDamagedquantitypickedGreaterThanOrEqualTo(Long value) {
            addCriterion("DAMAGEDQUANTITYPICKED >=", value, "damagedquantitypicked");
            return (Criteria) this;
        }

        public Criteria andDamagedquantitypickedLessThan(Long value) {
            addCriterion("DAMAGEDQUANTITYPICKED <", value, "damagedquantitypicked");
            return (Criteria) this;
        }

        public Criteria andDamagedquantitypickedLessThanOrEqualTo(Long value) {
            addCriterion("DAMAGEDQUANTITYPICKED <=", value, "damagedquantitypicked");
            return (Criteria) this;
        }

        public Criteria andDamagedquantitypickedIn(List<Long> values) {
            addCriterion("DAMAGEDQUANTITYPICKED in", values, "damagedquantitypicked");
            return (Criteria) this;
        }

        public Criteria andDamagedquantitypickedNotIn(List<Long> values) {
            addCriterion("DAMAGEDQUANTITYPICKED not in", values, "damagedquantitypicked");
            return (Criteria) this;
        }

        public Criteria andDamagedquantitypickedBetween(Long value1, Long value2) {
            addCriterion("DAMAGEDQUANTITYPICKED between", value1, value2, "damagedquantitypicked");
            return (Criteria) this;
        }

        public Criteria andDamagedquantitypickedNotBetween(Long value1, Long value2) {
            addCriterion("DAMAGEDQUANTITYPICKED not between", value1, value2, "damagedquantitypicked");
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

        public Criteria andReturnorderconfirmdateIsNull() {
            addCriterion("RETURNORDERCONFIRMDATE is null");
            return (Criteria) this;
        }

        public Criteria andReturnorderconfirmdateIsNotNull() {
            addCriterion("RETURNORDERCONFIRMDATE is not null");
            return (Criteria) this;
        }

        public Criteria andReturnorderconfirmdateEqualTo(Date value) {
            addCriterion("RETURNORDERCONFIRMDATE =", value, "returnorderconfirmdate");
            return (Criteria) this;
        }

        public Criteria andReturnorderconfirmdateNotEqualTo(Date value) {
            addCriterion("RETURNORDERCONFIRMDATE <>", value, "returnorderconfirmdate");
            return (Criteria) this;
        }

        public Criteria andReturnorderconfirmdateGreaterThan(Date value) {
            addCriterion("RETURNORDERCONFIRMDATE >", value, "returnorderconfirmdate");
            return (Criteria) this;
        }

        public Criteria andReturnorderconfirmdateGreaterThanOrEqualTo(Date value) {
            addCriterion("RETURNORDERCONFIRMDATE >=", value, "returnorderconfirmdate");
            return (Criteria) this;
        }

        public Criteria andReturnorderconfirmdateLessThan(Date value) {
            addCriterion("RETURNORDERCONFIRMDATE <", value, "returnorderconfirmdate");
            return (Criteria) this;
        }

        public Criteria andReturnorderconfirmdateLessThanOrEqualTo(Date value) {
            addCriterion("RETURNORDERCONFIRMDATE <=", value, "returnorderconfirmdate");
            return (Criteria) this;
        }

        public Criteria andReturnorderconfirmdateIn(List<Date> values) {
            addCriterion("RETURNORDERCONFIRMDATE in", values, "returnorderconfirmdate");
            return (Criteria) this;
        }

        public Criteria andReturnorderconfirmdateNotIn(List<Date> values) {
            addCriterion("RETURNORDERCONFIRMDATE not in", values, "returnorderconfirmdate");
            return (Criteria) this;
        }

        public Criteria andReturnorderconfirmdateBetween(Date value1, Date value2) {
            addCriterion("RETURNORDERCONFIRMDATE between", value1, value2, "returnorderconfirmdate");
            return (Criteria) this;
        }

        public Criteria andReturnorderconfirmdateNotBetween(Date value1, Date value2) {
            addCriterion("RETURNORDERCONFIRMDATE not between", value1, value2, "returnorderconfirmdate");
            return (Criteria) this;
        }

        public Criteria andForcecloseflagIsNull() {
            addCriterion("FORCECLOSEFLAG is null");
            return (Criteria) this;
        }

        public Criteria andForcecloseflagIsNotNull() {
            addCriterion("FORCECLOSEFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andForcecloseflagEqualTo(String value) {
            addCriterion("FORCECLOSEFLAG =", value, "forcecloseflag");
            return (Criteria) this;
        }

        public Criteria andForcecloseflagNotEqualTo(String value) {
            addCriterion("FORCECLOSEFLAG <>", value, "forcecloseflag");
            return (Criteria) this;
        }

        public Criteria andForcecloseflagGreaterThan(String value) {
            addCriterion("FORCECLOSEFLAG >", value, "forcecloseflag");
            return (Criteria) this;
        }

        public Criteria andForcecloseflagGreaterThanOrEqualTo(String value) {
            addCriterion("FORCECLOSEFLAG >=", value, "forcecloseflag");
            return (Criteria) this;
        }

        public Criteria andForcecloseflagLessThan(String value) {
            addCriterion("FORCECLOSEFLAG <", value, "forcecloseflag");
            return (Criteria) this;
        }

        public Criteria andForcecloseflagLessThanOrEqualTo(String value) {
            addCriterion("FORCECLOSEFLAG <=", value, "forcecloseflag");
            return (Criteria) this;
        }

        public Criteria andForcecloseflagLike(String value) {
            addCriterion("FORCECLOSEFLAG like", value, "forcecloseflag");
            return (Criteria) this;
        }

        public Criteria andForcecloseflagNotLike(String value) {
            addCriterion("FORCECLOSEFLAG not like", value, "forcecloseflag");
            return (Criteria) this;
        }

        public Criteria andForcecloseflagIn(List<String> values) {
            addCriterion("FORCECLOSEFLAG in", values, "forcecloseflag");
            return (Criteria) this;
        }

        public Criteria andForcecloseflagNotIn(List<String> values) {
            addCriterion("FORCECLOSEFLAG not in", values, "forcecloseflag");
            return (Criteria) this;
        }

        public Criteria andForcecloseflagBetween(String value1, String value2) {
            addCriterion("FORCECLOSEFLAG between", value1, value2, "forcecloseflag");
            return (Criteria) this;
        }

        public Criteria andForcecloseflagNotBetween(String value1, String value2) {
            addCriterion("FORCECLOSEFLAG not between", value1, value2, "forcecloseflag");
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