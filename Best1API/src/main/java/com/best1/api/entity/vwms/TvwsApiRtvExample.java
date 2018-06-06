package com.best1.api.entity.vwms;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TvwsApiRtvExample {
 
    protected String orderByClause;

   
    protected boolean distinct;

   
    protected List<Criteria> oredCriteria;

   
    public TvwsApiRtvExample() {
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

        public Criteria andReturnordercreatedateIsNull() {
            addCriterion("RETURNORDERCREATEDATE is null");
            return (Criteria) this;
        }

        public Criteria andReturnordercreatedateIsNotNull() {
            addCriterion("RETURNORDERCREATEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andReturnordercreatedateEqualTo(Date value) {
            addCriterion("RETURNORDERCREATEDATE =", value, "returnordercreatedate");
            return (Criteria) this;
        }

        public Criteria andReturnordercreatedateNotEqualTo(Date value) {
            addCriterion("RETURNORDERCREATEDATE <>", value, "returnordercreatedate");
            return (Criteria) this;
        }

        public Criteria andReturnordercreatedateGreaterThan(Date value) {
            addCriterion("RETURNORDERCREATEDATE >", value, "returnordercreatedate");
            return (Criteria) this;
        }

        public Criteria andReturnordercreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("RETURNORDERCREATEDATE >=", value, "returnordercreatedate");
            return (Criteria) this;
        }

        public Criteria andReturnordercreatedateLessThan(Date value) {
            addCriterion("RETURNORDERCREATEDATE <", value, "returnordercreatedate");
            return (Criteria) this;
        }

        public Criteria andReturnordercreatedateLessThanOrEqualTo(Date value) {
            addCriterion("RETURNORDERCREATEDATE <=", value, "returnordercreatedate");
            return (Criteria) this;
        }

        public Criteria andReturnordercreatedateIn(List<Date> values) {
            addCriterion("RETURNORDERCREATEDATE in", values, "returnordercreatedate");
            return (Criteria) this;
        }

        public Criteria andReturnordercreatedateNotIn(List<Date> values) {
            addCriterion("RETURNORDERCREATEDATE not in", values, "returnordercreatedate");
            return (Criteria) this;
        }

        public Criteria andReturnordercreatedateBetween(Date value1, Date value2) {
            addCriterion("RETURNORDERCREATEDATE between", value1, value2, "returnordercreatedate");
            return (Criteria) this;
        }

        public Criteria andReturnordercreatedateNotBetween(Date value1, Date value2) {
            addCriterion("RETURNORDERCREATEDATE not between", value1, value2, "returnordercreatedate");
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

        public Criteria andNormalquantityIsNull() {
            addCriterion("NORMALQUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andNormalquantityIsNotNull() {
            addCriterion("NORMALQUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andNormalquantityEqualTo(Long value) {
            addCriterion("NORMALQUANTITY =", value, "normalquantity");
            return (Criteria) this;
        }

        public Criteria andNormalquantityNotEqualTo(Long value) {
            addCriterion("NORMALQUANTITY <>", value, "normalquantity");
            return (Criteria) this;
        }

        public Criteria andNormalquantityGreaterThan(Long value) {
            addCriterion("NORMALQUANTITY >", value, "normalquantity");
            return (Criteria) this;
        }

        public Criteria andNormalquantityGreaterThanOrEqualTo(Long value) {
            addCriterion("NORMALQUANTITY >=", value, "normalquantity");
            return (Criteria) this;
        }

        public Criteria andNormalquantityLessThan(Long value) {
            addCriterion("NORMALQUANTITY <", value, "normalquantity");
            return (Criteria) this;
        }

        public Criteria andNormalquantityLessThanOrEqualTo(Long value) {
            addCriterion("NORMALQUANTITY <=", value, "normalquantity");
            return (Criteria) this;
        }

        public Criteria andNormalquantityIn(List<Long> values) {
            addCriterion("NORMALQUANTITY in", values, "normalquantity");
            return (Criteria) this;
        }

        public Criteria andNormalquantityNotIn(List<Long> values) {
            addCriterion("NORMALQUANTITY not in", values, "normalquantity");
            return (Criteria) this;
        }

        public Criteria andNormalquantityBetween(Long value1, Long value2) {
            addCriterion("NORMALQUANTITY between", value1, value2, "normalquantity");
            return (Criteria) this;
        }

        public Criteria andNormalquantityNotBetween(Long value1, Long value2) {
            addCriterion("NORMALQUANTITY not between", value1, value2, "normalquantity");
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

        public Criteria andPlannedpickupdateIsNull() {
            addCriterion("PLANNEDPICKUPDATE is null");
            return (Criteria) this;
        }

        public Criteria andPlannedpickupdateIsNotNull() {
            addCriterion("PLANNEDPICKUPDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPlannedpickupdateEqualTo(Date value) {
            addCriterion("PLANNEDPICKUPDATE =", value, "plannedpickupdate");
            return (Criteria) this;
        }

        public Criteria andPlannedpickupdateNotEqualTo(Date value) {
            addCriterion("PLANNEDPICKUPDATE <>", value, "plannedpickupdate");
            return (Criteria) this;
        }

        public Criteria andPlannedpickupdateGreaterThan(Date value) {
            addCriterion("PLANNEDPICKUPDATE >", value, "plannedpickupdate");
            return (Criteria) this;
        }

        public Criteria andPlannedpickupdateGreaterThanOrEqualTo(Date value) {
            addCriterion("PLANNEDPICKUPDATE >=", value, "plannedpickupdate");
            return (Criteria) this;
        }

        public Criteria andPlannedpickupdateLessThan(Date value) {
            addCriterion("PLANNEDPICKUPDATE <", value, "plannedpickupdate");
            return (Criteria) this;
        }

        public Criteria andPlannedpickupdateLessThanOrEqualTo(Date value) {
            addCriterion("PLANNEDPICKUPDATE <=", value, "plannedpickupdate");
            return (Criteria) this;
        }

        public Criteria andPlannedpickupdateIn(List<Date> values) {
            addCriterion("PLANNEDPICKUPDATE in", values, "plannedpickupdate");
            return (Criteria) this;
        }

        public Criteria andPlannedpickupdateNotIn(List<Date> values) {
            addCriterion("PLANNEDPICKUPDATE not in", values, "plannedpickupdate");
            return (Criteria) this;
        }

        public Criteria andPlannedpickupdateBetween(Date value1, Date value2) {
            addCriterion("PLANNEDPICKUPDATE between", value1, value2, "plannedpickupdate");
            return (Criteria) this;
        }

        public Criteria andPlannedpickupdateNotBetween(Date value1, Date value2) {
            addCriterion("PLANNEDPICKUPDATE not between", value1, value2, "plannedpickupdate");
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
     * This class corresponds to the database table ET1_CHINA.TVWS_API_RTV
     *
     * @mbggenerated do_not_delete_during_merge Sun Aug 28 14:52:24 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ET1_CHINA.TVWS_API_RTV
     *
     * @mbggenerated Sun Aug 28 14:52:24 CST 2016
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