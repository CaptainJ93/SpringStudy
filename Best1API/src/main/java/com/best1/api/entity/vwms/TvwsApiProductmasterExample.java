package com.best1.api.entity.vwms;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TvwsApiProductmasterExample {
 
    protected String orderByClause;

   
    protected boolean distinct;

    
    protected List<Criteria> oredCriteria;

  
    public TvwsApiProductmasterExample() {
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

        public Criteria andProductnameIsNull() {
            addCriterion("PRODUCTNAME is null");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNotNull() {
            addCriterion("PRODUCTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andProductnameEqualTo(String value) {
            addCriterion("PRODUCTNAME =", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotEqualTo(String value) {
            addCriterion("PRODUCTNAME <>", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThan(String value) {
            addCriterion("PRODUCTNAME >", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCTNAME >=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThan(String value) {
            addCriterion("PRODUCTNAME <", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThanOrEqualTo(String value) {
            addCriterion("PRODUCTNAME <=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLike(String value) {
            addCriterion("PRODUCTNAME like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotLike(String value) {
            addCriterion("PRODUCTNAME not like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameIn(List<String> values) {
            addCriterion("PRODUCTNAME in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotIn(List<String> values) {
            addCriterion("PRODUCTNAME not in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameBetween(String value1, String value2) {
            addCriterion("PRODUCTNAME between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotBetween(String value1, String value2) {
            addCriterion("PRODUCTNAME not between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andCostpriceIsNull() {
            addCriterion("COSTPRICE is null");
            return (Criteria) this;
        }

        public Criteria andCostpriceIsNotNull() {
            addCriterion("COSTPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andCostpriceEqualTo(BigDecimal value) {
            addCriterion("COSTPRICE =", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceNotEqualTo(BigDecimal value) {
            addCriterion("COSTPRICE <>", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceGreaterThan(BigDecimal value) {
            addCriterion("COSTPRICE >", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COSTPRICE >=", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceLessThan(BigDecimal value) {
            addCriterion("COSTPRICE <", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COSTPRICE <=", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceIn(List<BigDecimal> values) {
            addCriterion("COSTPRICE in", values, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceNotIn(List<BigDecimal> values) {
            addCriterion("COSTPRICE not in", values, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COSTPRICE between", value1, value2, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COSTPRICE not between", value1, value2, "costprice");
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

        public Criteria andWeightafterpackingIsNull() {
            addCriterion("WEIGHTAFTERPACKING is null");
            return (Criteria) this;
        }

        public Criteria andWeightafterpackingIsNotNull() {
            addCriterion("WEIGHTAFTERPACKING is not null");
            return (Criteria) this;
        }

        public Criteria andWeightafterpackingEqualTo(BigDecimal value) {
            addCriterion("WEIGHTAFTERPACKING =", value, "weightafterpacking");
            return (Criteria) this;
        }

        public Criteria andWeightafterpackingNotEqualTo(BigDecimal value) {
            addCriterion("WEIGHTAFTERPACKING <>", value, "weightafterpacking");
            return (Criteria) this;
        }

        public Criteria andWeightafterpackingGreaterThan(BigDecimal value) {
            addCriterion("WEIGHTAFTERPACKING >", value, "weightafterpacking");
            return (Criteria) this;
        }

        public Criteria andWeightafterpackingGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WEIGHTAFTERPACKING >=", value, "weightafterpacking");
            return (Criteria) this;
        }

        public Criteria andWeightafterpackingLessThan(BigDecimal value) {
            addCriterion("WEIGHTAFTERPACKING <", value, "weightafterpacking");
            return (Criteria) this;
        }

        public Criteria andWeightafterpackingLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WEIGHTAFTERPACKING <=", value, "weightafterpacking");
            return (Criteria) this;
        }

        public Criteria andWeightafterpackingIn(List<BigDecimal> values) {
            addCriterion("WEIGHTAFTERPACKING in", values, "weightafterpacking");
            return (Criteria) this;
        }

        public Criteria andWeightafterpackingNotIn(List<BigDecimal> values) {
            addCriterion("WEIGHTAFTERPACKING not in", values, "weightafterpacking");
            return (Criteria) this;
        }

        public Criteria andWeightafterpackingBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WEIGHTAFTERPACKING between", value1, value2, "weightafterpacking");
            return (Criteria) this;
        }

        public Criteria andWeightafterpackingNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WEIGHTAFTERPACKING not between", value1, value2, "weightafterpacking");
            return (Criteria) this;
        }

        public Criteria andLengthafterpackingIsNull() {
            addCriterion("LENGTHAFTERPACKING is null");
            return (Criteria) this;
        }

        public Criteria andLengthafterpackingIsNotNull() {
            addCriterion("LENGTHAFTERPACKING is not null");
            return (Criteria) this;
        }

        public Criteria andLengthafterpackingEqualTo(BigDecimal value) {
            addCriterion("LENGTHAFTERPACKING =", value, "lengthafterpacking");
            return (Criteria) this;
        }

        public Criteria andLengthafterpackingNotEqualTo(BigDecimal value) {
            addCriterion("LENGTHAFTERPACKING <>", value, "lengthafterpacking");
            return (Criteria) this;
        }

        public Criteria andLengthafterpackingGreaterThan(BigDecimal value) {
            addCriterion("LENGTHAFTERPACKING >", value, "lengthafterpacking");
            return (Criteria) this;
        }

        public Criteria andLengthafterpackingGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LENGTHAFTERPACKING >=", value, "lengthafterpacking");
            return (Criteria) this;
        }

        public Criteria andLengthafterpackingLessThan(BigDecimal value) {
            addCriterion("LENGTHAFTERPACKING <", value, "lengthafterpacking");
            return (Criteria) this;
        }

        public Criteria andLengthafterpackingLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LENGTHAFTERPACKING <=", value, "lengthafterpacking");
            return (Criteria) this;
        }

        public Criteria andLengthafterpackingIn(List<BigDecimal> values) {
            addCriterion("LENGTHAFTERPACKING in", values, "lengthafterpacking");
            return (Criteria) this;
        }

        public Criteria andLengthafterpackingNotIn(List<BigDecimal> values) {
            addCriterion("LENGTHAFTERPACKING not in", values, "lengthafterpacking");
            return (Criteria) this;
        }

        public Criteria andLengthafterpackingBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LENGTHAFTERPACKING between", value1, value2, "lengthafterpacking");
            return (Criteria) this;
        }

        public Criteria andLengthafterpackingNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LENGTHAFTERPACKING not between", value1, value2, "lengthafterpacking");
            return (Criteria) this;
        }

        public Criteria andHeightafterpackingIsNull() {
            addCriterion("HEIGHTAFTERPACKING is null");
            return (Criteria) this;
        }

        public Criteria andHeightafterpackingIsNotNull() {
            addCriterion("HEIGHTAFTERPACKING is not null");
            return (Criteria) this;
        }

        public Criteria andHeightafterpackingEqualTo(BigDecimal value) {
            addCriterion("HEIGHTAFTERPACKING =", value, "heightafterpacking");
            return (Criteria) this;
        }

        public Criteria andHeightafterpackingNotEqualTo(BigDecimal value) {
            addCriterion("HEIGHTAFTERPACKING <>", value, "heightafterpacking");
            return (Criteria) this;
        }

        public Criteria andHeightafterpackingGreaterThan(BigDecimal value) {
            addCriterion("HEIGHTAFTERPACKING >", value, "heightafterpacking");
            return (Criteria) this;
        }

        public Criteria andHeightafterpackingGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HEIGHTAFTERPACKING >=", value, "heightafterpacking");
            return (Criteria) this;
        }

        public Criteria andHeightafterpackingLessThan(BigDecimal value) {
            addCriterion("HEIGHTAFTERPACKING <", value, "heightafterpacking");
            return (Criteria) this;
        }

        public Criteria andHeightafterpackingLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HEIGHTAFTERPACKING <=", value, "heightafterpacking");
            return (Criteria) this;
        }

        public Criteria andHeightafterpackingIn(List<BigDecimal> values) {
            addCriterion("HEIGHTAFTERPACKING in", values, "heightafterpacking");
            return (Criteria) this;
        }

        public Criteria andHeightafterpackingNotIn(List<BigDecimal> values) {
            addCriterion("HEIGHTAFTERPACKING not in", values, "heightafterpacking");
            return (Criteria) this;
        }

        public Criteria andHeightafterpackingBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HEIGHTAFTERPACKING between", value1, value2, "heightafterpacking");
            return (Criteria) this;
        }

        public Criteria andHeightafterpackingNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HEIGHTAFTERPACKING not between", value1, value2, "heightafterpacking");
            return (Criteria) this;
        }

        public Criteria andWidthafterpackingIsNull() {
            addCriterion("WIDTHAFTERPACKING is null");
            return (Criteria) this;
        }

        public Criteria andWidthafterpackingIsNotNull() {
            addCriterion("WIDTHAFTERPACKING is not null");
            return (Criteria) this;
        }

        public Criteria andWidthafterpackingEqualTo(BigDecimal value) {
            addCriterion("WIDTHAFTERPACKING =", value, "widthafterpacking");
            return (Criteria) this;
        }

        public Criteria andWidthafterpackingNotEqualTo(BigDecimal value) {
            addCriterion("WIDTHAFTERPACKING <>", value, "widthafterpacking");
            return (Criteria) this;
        }

        public Criteria andWidthafterpackingGreaterThan(BigDecimal value) {
            addCriterion("WIDTHAFTERPACKING >", value, "widthafterpacking");
            return (Criteria) this;
        }

        public Criteria andWidthafterpackingGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WIDTHAFTERPACKING >=", value, "widthafterpacking");
            return (Criteria) this;
        }

        public Criteria andWidthafterpackingLessThan(BigDecimal value) {
            addCriterion("WIDTHAFTERPACKING <", value, "widthafterpacking");
            return (Criteria) this;
        }

        public Criteria andWidthafterpackingLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WIDTHAFTERPACKING <=", value, "widthafterpacking");
            return (Criteria) this;
        }

        public Criteria andWidthafterpackingIn(List<BigDecimal> values) {
            addCriterion("WIDTHAFTERPACKING in", values, "widthafterpacking");
            return (Criteria) this;
        }

        public Criteria andWidthafterpackingNotIn(List<BigDecimal> values) {
            addCriterion("WIDTHAFTERPACKING not in", values, "widthafterpacking");
            return (Criteria) this;
        }

        public Criteria andWidthafterpackingBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WIDTHAFTERPACKING between", value1, value2, "widthafterpacking");
            return (Criteria) this;
        }

        public Criteria andWidthafterpackingNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WIDTHAFTERPACKING not between", value1, value2, "widthafterpacking");
            return (Criteria) this;
        }

        public Criteria andConsolidationallowedIsNull() {
            addCriterion("CONSOLIDATIONALLOWED is null");
            return (Criteria) this;
        }

        public Criteria andConsolidationallowedIsNotNull() {
            addCriterion("CONSOLIDATIONALLOWED is not null");
            return (Criteria) this;
        }

        public Criteria andConsolidationallowedEqualTo(String value) {
            addCriterion("CONSOLIDATIONALLOWED =", value, "consolidationallowed");
            return (Criteria) this;
        }

        public Criteria andConsolidationallowedNotEqualTo(String value) {
            addCriterion("CONSOLIDATIONALLOWED <>", value, "consolidationallowed");
            return (Criteria) this;
        }

        public Criteria andConsolidationallowedGreaterThan(String value) {
            addCriterion("CONSOLIDATIONALLOWED >", value, "consolidationallowed");
            return (Criteria) this;
        }

        public Criteria andConsolidationallowedGreaterThanOrEqualTo(String value) {
            addCriterion("CONSOLIDATIONALLOWED >=", value, "consolidationallowed");
            return (Criteria) this;
        }

        public Criteria andConsolidationallowedLessThan(String value) {
            addCriterion("CONSOLIDATIONALLOWED <", value, "consolidationallowed");
            return (Criteria) this;
        }

        public Criteria andConsolidationallowedLessThanOrEqualTo(String value) {
            addCriterion("CONSOLIDATIONALLOWED <=", value, "consolidationallowed");
            return (Criteria) this;
        }

        public Criteria andConsolidationallowedLike(String value) {
            addCriterion("CONSOLIDATIONALLOWED like", value, "consolidationallowed");
            return (Criteria) this;
        }

        public Criteria andConsolidationallowedNotLike(String value) {
            addCriterion("CONSOLIDATIONALLOWED not like", value, "consolidationallowed");
            return (Criteria) this;
        }

        public Criteria andConsolidationallowedIn(List<String> values) {
            addCriterion("CONSOLIDATIONALLOWED in", values, "consolidationallowed");
            return (Criteria) this;
        }

        public Criteria andConsolidationallowedNotIn(List<String> values) {
            addCriterion("CONSOLIDATIONALLOWED not in", values, "consolidationallowed");
            return (Criteria) this;
        }

        public Criteria andConsolidationallowedBetween(String value1, String value2) {
            addCriterion("CONSOLIDATIONALLOWED between", value1, value2, "consolidationallowed");
            return (Criteria) this;
        }

        public Criteria andConsolidationallowedNotBetween(String value1, String value2) {
            addCriterion("CONSOLIDATIONALLOWED not between", value1, value2, "consolidationallowed");
            return (Criteria) this;
        }

        public Criteria andMdnameIsNull() {
            addCriterion("MDNAME is null");
            return (Criteria) this;
        }

        public Criteria andMdnameIsNotNull() {
            addCriterion("MDNAME is not null");
            return (Criteria) this;
        }

        public Criteria andMdnameEqualTo(String value) {
            addCriterion("MDNAME =", value, "mdname");
            return (Criteria) this;
        }

        public Criteria andMdnameNotEqualTo(String value) {
            addCriterion("MDNAME <>", value, "mdname");
            return (Criteria) this;
        }

        public Criteria andMdnameGreaterThan(String value) {
            addCriterion("MDNAME >", value, "mdname");
            return (Criteria) this;
        }

        public Criteria andMdnameGreaterThanOrEqualTo(String value) {
            addCriterion("MDNAME >=", value, "mdname");
            return (Criteria) this;
        }

        public Criteria andMdnameLessThan(String value) {
            addCriterion("MDNAME <", value, "mdname");
            return (Criteria) this;
        }

        public Criteria andMdnameLessThanOrEqualTo(String value) {
            addCriterion("MDNAME <=", value, "mdname");
            return (Criteria) this;
        }

        public Criteria andMdnameLike(String value) {
            addCriterion("MDNAME like", value, "mdname");
            return (Criteria) this;
        }

        public Criteria andMdnameNotLike(String value) {
            addCriterion("MDNAME not like", value, "mdname");
            return (Criteria) this;
        }

        public Criteria andMdnameIn(List<String> values) {
            addCriterion("MDNAME in", values, "mdname");
            return (Criteria) this;
        }

        public Criteria andMdnameNotIn(List<String> values) {
            addCriterion("MDNAME not in", values, "mdname");
            return (Criteria) this;
        }

        public Criteria andMdnameBetween(String value1, String value2) {
            addCriterion("MDNAME between", value1, value2, "mdname");
            return (Criteria) this;
        }

        public Criteria andMdnameNotBetween(String value1, String value2) {
            addCriterion("MDNAME not between", value1, value2, "mdname");
            return (Criteria) this;
        }

        public Criteria andManameIsNull() {
            addCriterion("MANAME is null");
            return (Criteria) this;
        }

        public Criteria andManameIsNotNull() {
            addCriterion("MANAME is not null");
            return (Criteria) this;
        }

        public Criteria andManameEqualTo(String value) {
            addCriterion("MANAME =", value, "maname");
            return (Criteria) this;
        }

        public Criteria andManameNotEqualTo(String value) {
            addCriterion("MANAME <>", value, "maname");
            return (Criteria) this;
        }

        public Criteria andManameGreaterThan(String value) {
            addCriterion("MANAME >", value, "maname");
            return (Criteria) this;
        }

        public Criteria andManameGreaterThanOrEqualTo(String value) {
            addCriterion("MANAME >=", value, "maname");
            return (Criteria) this;
        }

        public Criteria andManameLessThan(String value) {
            addCriterion("MANAME <", value, "maname");
            return (Criteria) this;
        }

        public Criteria andManameLessThanOrEqualTo(String value) {
            addCriterion("MANAME <=", value, "maname");
            return (Criteria) this;
        }

        public Criteria andManameLike(String value) {
            addCriterion("MANAME like", value, "maname");
            return (Criteria) this;
        }

        public Criteria andManameNotLike(String value) {
            addCriterion("MANAME not like", value, "maname");
            return (Criteria) this;
        }

        public Criteria andManameIn(List<String> values) {
            addCriterion("MANAME in", values, "maname");
            return (Criteria) this;
        }

        public Criteria andManameNotIn(List<String> values) {
            addCriterion("MANAME not in", values, "maname");
            return (Criteria) this;
        }

        public Criteria andManameBetween(String value1, String value2) {
            addCriterion("MANAME between", value1, value2, "maname");
            return (Criteria) this;
        }

        public Criteria andManameNotBetween(String value1, String value2) {
            addCriterion("MANAME not between", value1, value2, "maname");
            return (Criteria) this;
        }

        public Criteria andProductstatusIsNull() {
            addCriterion("PRODUCTSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andProductstatusIsNotNull() {
            addCriterion("PRODUCTSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andProductstatusEqualTo(Integer value) {
            addCriterion("PRODUCTSTATUS =", value, "productstatus");
            return (Criteria) this;
        }

        public Criteria andProductstatusNotEqualTo(Integer value) {
            addCriterion("PRODUCTSTATUS <>", value, "productstatus");
            return (Criteria) this;
        }

        public Criteria andProductstatusGreaterThan(Integer value) {
            addCriterion("PRODUCTSTATUS >", value, "productstatus");
            return (Criteria) this;
        }

        public Criteria andProductstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRODUCTSTATUS >=", value, "productstatus");
            return (Criteria) this;
        }

        public Criteria andProductstatusLessThan(Integer value) {
            addCriterion("PRODUCTSTATUS <", value, "productstatus");
            return (Criteria) this;
        }

        public Criteria andProductstatusLessThanOrEqualTo(Integer value) {
            addCriterion("PRODUCTSTATUS <=", value, "productstatus");
            return (Criteria) this;
        }

        public Criteria andProductstatusIn(List<Integer> values) {
            addCriterion("PRODUCTSTATUS in", values, "productstatus");
            return (Criteria) this;
        }

        public Criteria andProductstatusNotIn(List<Integer> values) {
            addCriterion("PRODUCTSTATUS not in", values, "productstatus");
            return (Criteria) this;
        }

        public Criteria andProductstatusBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCTSTATUS between", value1, value2, "productstatus");
            return (Criteria) this;
        }

        public Criteria andProductstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCTSTATUS not between", value1, value2, "productstatus");
            return (Criteria) this;
        }

        public Criteria andProductcategoryIsNull() {
            addCriterion("PRODUCTCATEGORY is null");
            return (Criteria) this;
        }

        public Criteria andProductcategoryIsNotNull() {
            addCriterion("PRODUCTCATEGORY is not null");
            return (Criteria) this;
        }

        public Criteria andProductcategoryEqualTo(Integer value) {
            addCriterion("PRODUCTCATEGORY =", value, "productcategory");
            return (Criteria) this;
        }

        public Criteria andProductcategoryNotEqualTo(Integer value) {
            addCriterion("PRODUCTCATEGORY <>", value, "productcategory");
            return (Criteria) this;
        }

        public Criteria andProductcategoryGreaterThan(Integer value) {
            addCriterion("PRODUCTCATEGORY >", value, "productcategory");
            return (Criteria) this;
        }

        public Criteria andProductcategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRODUCTCATEGORY >=", value, "productcategory");
            return (Criteria) this;
        }

        public Criteria andProductcategoryLessThan(Integer value) {
            addCriterion("PRODUCTCATEGORY <", value, "productcategory");
            return (Criteria) this;
        }

        public Criteria andProductcategoryLessThanOrEqualTo(Integer value) {
            addCriterion("PRODUCTCATEGORY <=", value, "productcategory");
            return (Criteria) this;
        }

        public Criteria andProductcategoryIn(List<Integer> values) {
            addCriterion("PRODUCTCATEGORY in", values, "productcategory");
            return (Criteria) this;
        }

        public Criteria andProductcategoryNotIn(List<Integer> values) {
            addCriterion("PRODUCTCATEGORY not in", values, "productcategory");
            return (Criteria) this;
        }

        public Criteria andProductcategoryBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCTCATEGORY between", value1, value2, "productcategory");
            return (Criteria) this;
        }

        public Criteria andProductcategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCTCATEGORY not between", value1, value2, "productcategory");
            return (Criteria) this;
        }

        public Criteria andDeliverytypeIsNull() {
            addCriterion("DELIVERYTYPE is null");
            return (Criteria) this;
        }

        public Criteria andDeliverytypeIsNotNull() {
            addCriterion("DELIVERYTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverytypeEqualTo(Integer value) {
            addCriterion("DELIVERYTYPE =", value, "deliverytype");
            return (Criteria) this;
        }

        public Criteria andDeliverytypeNotEqualTo(Integer value) {
            addCriterion("DELIVERYTYPE <>", value, "deliverytype");
            return (Criteria) this;
        }

        public Criteria andDeliverytypeGreaterThan(Integer value) {
            addCriterion("DELIVERYTYPE >", value, "deliverytype");
            return (Criteria) this;
        }

        public Criteria andDeliverytypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("DELIVERYTYPE >=", value, "deliverytype");
            return (Criteria) this;
        }

        public Criteria andDeliverytypeLessThan(Integer value) {
            addCriterion("DELIVERYTYPE <", value, "deliverytype");
            return (Criteria) this;
        }

        public Criteria andDeliverytypeLessThanOrEqualTo(Integer value) {
            addCriterion("DELIVERYTYPE <=", value, "deliverytype");
            return (Criteria) this;
        }

        public Criteria andDeliverytypeIn(List<Integer> values) {
            addCriterion("DELIVERYTYPE in", values, "deliverytype");
            return (Criteria) this;
        }

        public Criteria andDeliverytypeNotIn(List<Integer> values) {
            addCriterion("DELIVERYTYPE not in", values, "deliverytype");
            return (Criteria) this;
        }

        public Criteria andDeliverytypeBetween(Integer value1, Integer value2) {
            addCriterion("DELIVERYTYPE between", value1, value2, "deliverytype");
            return (Criteria) this;
        }

        public Criteria andDeliverytypeNotBetween(Integer value1, Integer value2) {
            addCriterion("DELIVERYTYPE not between", value1, value2, "deliverytype");
            return (Criteria) this;
        }

        public Criteria andStoragetypeIsNull() {
            addCriterion("STORAGETYPE is null");
            return (Criteria) this;
        }

        public Criteria andStoragetypeIsNotNull() {
            addCriterion("STORAGETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andStoragetypeEqualTo(Integer value) {
            addCriterion("STORAGETYPE =", value, "storagetype");
            return (Criteria) this;
        }

        public Criteria andStoragetypeNotEqualTo(Integer value) {
            addCriterion("STORAGETYPE <>", value, "storagetype");
            return (Criteria) this;
        }

        public Criteria andStoragetypeGreaterThan(Integer value) {
            addCriterion("STORAGETYPE >", value, "storagetype");
            return (Criteria) this;
        }

        public Criteria andStoragetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("STORAGETYPE >=", value, "storagetype");
            return (Criteria) this;
        }

        public Criteria andStoragetypeLessThan(Integer value) {
            addCriterion("STORAGETYPE <", value, "storagetype");
            return (Criteria) this;
        }

        public Criteria andStoragetypeLessThanOrEqualTo(Integer value) {
            addCriterion("STORAGETYPE <=", value, "storagetype");
            return (Criteria) this;
        }

        public Criteria andStoragetypeIn(List<Integer> values) {
            addCriterion("STORAGETYPE in", values, "storagetype");
            return (Criteria) this;
        }

        public Criteria andStoragetypeNotIn(List<Integer> values) {
            addCriterion("STORAGETYPE not in", values, "storagetype");
            return (Criteria) this;
        }

        public Criteria andStoragetypeBetween(Integer value1, Integer value2) {
            addCriterion("STORAGETYPE between", value1, value2, "storagetype");
            return (Criteria) this;
        }

        public Criteria andStoragetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("STORAGETYPE not between", value1, value2, "storagetype");
            return (Criteria) this;
        }

        public Criteria andLclasscodeIsNull() {
            addCriterion("LCLASSCODE is null");
            return (Criteria) this;
        }

        public Criteria andLclasscodeIsNotNull() {
            addCriterion("LCLASSCODE is not null");
            return (Criteria) this;
        }

        public Criteria andLclasscodeEqualTo(Long value) {
            addCriterion("LCLASSCODE =", value, "lclasscode");
            return (Criteria) this;
        }

        public Criteria andLclasscodeNotEqualTo(Long value) {
            addCriterion("LCLASSCODE <>", value, "lclasscode");
            return (Criteria) this;
        }

        public Criteria andLclasscodeGreaterThan(Long value) {
            addCriterion("LCLASSCODE >", value, "lclasscode");
            return (Criteria) this;
        }

        public Criteria andLclasscodeGreaterThanOrEqualTo(Long value) {
            addCriterion("LCLASSCODE >=", value, "lclasscode");
            return (Criteria) this;
        }

        public Criteria andLclasscodeLessThan(Long value) {
            addCriterion("LCLASSCODE <", value, "lclasscode");
            return (Criteria) this;
        }

        public Criteria andLclasscodeLessThanOrEqualTo(Long value) {
            addCriterion("LCLASSCODE <=", value, "lclasscode");
            return (Criteria) this;
        }

        public Criteria andLclasscodeIn(List<Long> values) {
            addCriterion("LCLASSCODE in", values, "lclasscode");
            return (Criteria) this;
        }

        public Criteria andLclasscodeNotIn(List<Long> values) {
            addCriterion("LCLASSCODE not in", values, "lclasscode");
            return (Criteria) this;
        }

        public Criteria andLclasscodeBetween(Long value1, Long value2) {
            addCriterion("LCLASSCODE between", value1, value2, "lclasscode");
            return (Criteria) this;
        }

        public Criteria andLclasscodeNotBetween(Long value1, Long value2) {
            addCriterion("LCLASSCODE not between", value1, value2, "lclasscode");
            return (Criteria) this;
        }

        public Criteria andMclasscodeIsNull() {
            addCriterion("MCLASSCODE is null");
            return (Criteria) this;
        }

        public Criteria andMclasscodeIsNotNull() {
            addCriterion("MCLASSCODE is not null");
            return (Criteria) this;
        }

        public Criteria andMclasscodeEqualTo(Long value) {
            addCriterion("MCLASSCODE =", value, "mclasscode");
            return (Criteria) this;
        }

        public Criteria andMclasscodeNotEqualTo(Long value) {
            addCriterion("MCLASSCODE <>", value, "mclasscode");
            return (Criteria) this;
        }

        public Criteria andMclasscodeGreaterThan(Long value) {
            addCriterion("MCLASSCODE >", value, "mclasscode");
            return (Criteria) this;
        }

        public Criteria andMclasscodeGreaterThanOrEqualTo(Long value) {
            addCriterion("MCLASSCODE >=", value, "mclasscode");
            return (Criteria) this;
        }

        public Criteria andMclasscodeLessThan(Long value) {
            addCriterion("MCLASSCODE <", value, "mclasscode");
            return (Criteria) this;
        }

        public Criteria andMclasscodeLessThanOrEqualTo(Long value) {
            addCriterion("MCLASSCODE <=", value, "mclasscode");
            return (Criteria) this;
        }

        public Criteria andMclasscodeIn(List<Long> values) {
            addCriterion("MCLASSCODE in", values, "mclasscode");
            return (Criteria) this;
        }

        public Criteria andMclasscodeNotIn(List<Long> values) {
            addCriterion("MCLASSCODE not in", values, "mclasscode");
            return (Criteria) this;
        }

        public Criteria andMclasscodeBetween(Long value1, Long value2) {
            addCriterion("MCLASSCODE between", value1, value2, "mclasscode");
            return (Criteria) this;
        }

        public Criteria andMclasscodeNotBetween(Long value1, Long value2) {
            addCriterion("MCLASSCODE not between", value1, value2, "mclasscode");
            return (Criteria) this;
        }

        public Criteria andSclasscodeIsNull() {
            addCriterion("SCLASSCODE is null");
            return (Criteria) this;
        }

        public Criteria andSclasscodeIsNotNull() {
            addCriterion("SCLASSCODE is not null");
            return (Criteria) this;
        }

        public Criteria andSclasscodeEqualTo(Long value) {
            addCriterion("SCLASSCODE =", value, "sclasscode");
            return (Criteria) this;
        }

        public Criteria andSclasscodeNotEqualTo(Long value) {
            addCriterion("SCLASSCODE <>", value, "sclasscode");
            return (Criteria) this;
        }

        public Criteria andSclasscodeGreaterThan(Long value) {
            addCriterion("SCLASSCODE >", value, "sclasscode");
            return (Criteria) this;
        }

        public Criteria andSclasscodeGreaterThanOrEqualTo(Long value) {
            addCriterion("SCLASSCODE >=", value, "sclasscode");
            return (Criteria) this;
        }

        public Criteria andSclasscodeLessThan(Long value) {
            addCriterion("SCLASSCODE <", value, "sclasscode");
            return (Criteria) this;
        }

        public Criteria andSclasscodeLessThanOrEqualTo(Long value) {
            addCriterion("SCLASSCODE <=", value, "sclasscode");
            return (Criteria) this;
        }

        public Criteria andSclasscodeIn(List<Long> values) {
            addCriterion("SCLASSCODE in", values, "sclasscode");
            return (Criteria) this;
        }

        public Criteria andSclasscodeNotIn(List<Long> values) {
            addCriterion("SCLASSCODE not in", values, "sclasscode");
            return (Criteria) this;
        }

        public Criteria andSclasscodeBetween(Long value1, Long value2) {
            addCriterion("SCLASSCODE between", value1, value2, "sclasscode");
            return (Criteria) this;
        }

        public Criteria andSclasscodeNotBetween(Long value1, Long value2) {
            addCriterion("SCLASSCODE not between", value1, value2, "sclasscode");
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

        public Criteria andMdidIsNull() {
            addCriterion("MDID is null");
            return (Criteria) this;
        }

        public Criteria andMdidIsNotNull() {
            addCriterion("MDID is not null");
            return (Criteria) this;
        }

        public Criteria andMdidEqualTo(Long value) {
            addCriterion("MDID =", value, "mdid");
            return (Criteria) this;
        }

        public Criteria andMdidNotEqualTo(Long value) {
            addCriterion("MDID <>", value, "mdid");
            return (Criteria) this;
        }

        public Criteria andMdidGreaterThan(Long value) {
            addCriterion("MDID >", value, "mdid");
            return (Criteria) this;
        }

        public Criteria andMdidGreaterThanOrEqualTo(Long value) {
            addCriterion("MDID >=", value, "mdid");
            return (Criteria) this;
        }

        public Criteria andMdidLessThan(Long value) {
            addCriterion("MDID <", value, "mdid");
            return (Criteria) this;
        }

        public Criteria andMdidLessThanOrEqualTo(Long value) {
            addCriterion("MDID <=", value, "mdid");
            return (Criteria) this;
        }

        public Criteria andMdidIn(List<Long> values) {
            addCriterion("MDID in", values, "mdid");
            return (Criteria) this;
        }

        public Criteria andMdidNotIn(List<Long> values) {
            addCriterion("MDID not in", values, "mdid");
            return (Criteria) this;
        }

        public Criteria andMdidBetween(Long value1, Long value2) {
            addCriterion("MDID between", value1, value2, "mdid");
            return (Criteria) this;
        }

        public Criteria andMdidNotBetween(Long value1, Long value2) {
            addCriterion("MDID not between", value1, value2, "mdid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidIsNull() {
            addCriterion("PURCHASEID is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseidIsNotNull() {
            addCriterion("PURCHASEID is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseidEqualTo(Long value) {
            addCriterion("PURCHASEID =", value, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidNotEqualTo(Long value) {
            addCriterion("PURCHASEID <>", value, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidGreaterThan(Long value) {
            addCriterion("PURCHASEID >", value, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidGreaterThanOrEqualTo(Long value) {
            addCriterion("PURCHASEID >=", value, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidLessThan(Long value) {
            addCriterion("PURCHASEID <", value, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidLessThanOrEqualTo(Long value) {
            addCriterion("PURCHASEID <=", value, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidIn(List<Long> values) {
            addCriterion("PURCHASEID in", values, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidNotIn(List<Long> values) {
            addCriterion("PURCHASEID not in", values, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidBetween(Long value1, Long value2) {
            addCriterion("PURCHASEID between", value1, value2, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidNotBetween(Long value1, Long value2) {
            addCriterion("PURCHASEID not between", value1, value2, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andSellingpriceIsNull() {
            addCriterion("SELLINGPRICE is null");
            return (Criteria) this;
        }

        public Criteria andSellingpriceIsNotNull() {
            addCriterion("SELLINGPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andSellingpriceEqualTo(BigDecimal value) {
            addCriterion("SELLINGPRICE =", value, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andSellingpriceNotEqualTo(BigDecimal value) {
            addCriterion("SELLINGPRICE <>", value, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andSellingpriceGreaterThan(BigDecimal value) {
            addCriterion("SELLINGPRICE >", value, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andSellingpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SELLINGPRICE >=", value, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andSellingpriceLessThan(BigDecimal value) {
            addCriterion("SELLINGPRICE <", value, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andSellingpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SELLINGPRICE <=", value, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andSellingpriceIn(List<BigDecimal> values) {
            addCriterion("SELLINGPRICE in", values, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andSellingpriceNotIn(List<BigDecimal> values) {
            addCriterion("SELLINGPRICE not in", values, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andSellingpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SELLINGPRICE between", value1, value2, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andSellingpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SELLINGPRICE not between", value1, value2, "sellingprice");
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
     * This class corresponds to the database table ET1_CHINA.TVWS_API_PRODUCTMASTER
     *
     * @mbggenerated do_not_delete_during_merge Wed Aug 24 09:14:15 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ET1_CHINA.TVWS_API_PRODUCTMASTER
     *
     * @mbggenerated Wed Aug 24 09:14:15 CST 2016
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