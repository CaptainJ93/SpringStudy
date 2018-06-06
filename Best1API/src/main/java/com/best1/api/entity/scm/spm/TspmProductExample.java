package com.best1.api.entity.scm.spm;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TspmProductExample {

    protected String orderByClause;


    protected boolean distinct;

    protected List<Criteria> oredCriteria;

  
    public TspmProductExample() {
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

        public Criteria andManufacturernameIsNull() {
            addCriterion("MANUFACTURERNAME is null");
            return (Criteria) this;
        }

        public Criteria andManufacturernameIsNotNull() {
            addCriterion("MANUFACTURERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturernameEqualTo(String value) {
            addCriterion("MANUFACTURERNAME =", value, "manufacturername");
            return (Criteria) this;
        }

        public Criteria andManufacturernameNotEqualTo(String value) {
            addCriterion("MANUFACTURERNAME <>", value, "manufacturername");
            return (Criteria) this;
        }

        public Criteria andManufacturernameGreaterThan(String value) {
            addCriterion("MANUFACTURERNAME >", value, "manufacturername");
            return (Criteria) this;
        }

        public Criteria andManufacturernameGreaterThanOrEqualTo(String value) {
            addCriterion("MANUFACTURERNAME >=", value, "manufacturername");
            return (Criteria) this;
        }

        public Criteria andManufacturernameLessThan(String value) {
            addCriterion("MANUFACTURERNAME <", value, "manufacturername");
            return (Criteria) this;
        }

        public Criteria andManufacturernameLessThanOrEqualTo(String value) {
            addCriterion("MANUFACTURERNAME <=", value, "manufacturername");
            return (Criteria) this;
        }

        public Criteria andManufacturernameLike(String value) {
            addCriterion("MANUFACTURERNAME like", value, "manufacturername");
            return (Criteria) this;
        }

        public Criteria andManufacturernameNotLike(String value) {
            addCriterion("MANUFACTURERNAME not like", value, "manufacturername");
            return (Criteria) this;
        }

        public Criteria andManufacturernameIn(List<String> values) {
            addCriterion("MANUFACTURERNAME in", values, "manufacturername");
            return (Criteria) this;
        }

        public Criteria andManufacturernameNotIn(List<String> values) {
            addCriterion("MANUFACTURERNAME not in", values, "manufacturername");
            return (Criteria) this;
        }

        public Criteria andManufacturernameBetween(String value1, String value2) {
            addCriterion("MANUFACTURERNAME between", value1, value2, "manufacturername");
            return (Criteria) this;
        }

        public Criteria andManufacturernameNotBetween(String value1, String value2) {
            addCriterion("MANUFACTURERNAME not between", value1, value2, "manufacturername");
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

        public Criteria andMaximumquantityIsNull() {
            addCriterion("MAXIMUMQUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andMaximumquantityIsNotNull() {
            addCriterion("MAXIMUMQUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andMaximumquantityEqualTo(Long value) {
            addCriterion("MAXIMUMQUANTITY =", value, "maximumquantity");
            return (Criteria) this;
        }

        public Criteria andMaximumquantityNotEqualTo(Long value) {
            addCriterion("MAXIMUMQUANTITY <>", value, "maximumquantity");
            return (Criteria) this;
        }

        public Criteria andMaximumquantityGreaterThan(Long value) {
            addCriterion("MAXIMUMQUANTITY >", value, "maximumquantity");
            return (Criteria) this;
        }

        public Criteria andMaximumquantityGreaterThanOrEqualTo(Long value) {
            addCriterion("MAXIMUMQUANTITY >=", value, "maximumquantity");
            return (Criteria) this;
        }

        public Criteria andMaximumquantityLessThan(Long value) {
            addCriterion("MAXIMUMQUANTITY <", value, "maximumquantity");
            return (Criteria) this;
        }

        public Criteria andMaximumquantityLessThanOrEqualTo(Long value) {
            addCriterion("MAXIMUMQUANTITY <=", value, "maximumquantity");
            return (Criteria) this;
        }

        public Criteria andMaximumquantityIn(List<Long> values) {
            addCriterion("MAXIMUMQUANTITY in", values, "maximumquantity");
            return (Criteria) this;
        }

        public Criteria andMaximumquantityNotIn(List<Long> values) {
            addCriterion("MAXIMUMQUANTITY not in", values, "maximumquantity");
            return (Criteria) this;
        }

        public Criteria andMaximumquantityBetween(Long value1, Long value2) {
            addCriterion("MAXIMUMQUANTITY between", value1, value2, "maximumquantity");
            return (Criteria) this;
        }

        public Criteria andMaximumquantityNotBetween(Long value1, Long value2) {
            addCriterion("MAXIMUMQUANTITY not between", value1, value2, "maximumquantity");
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

        public Criteria andRealsupplieridIsNull() {
            addCriterion("REALSUPPLIERID is null");
            return (Criteria) this;
        }

        public Criteria andRealsupplieridIsNotNull() {
            addCriterion("REALSUPPLIERID is not null");
            return (Criteria) this;
        }

        public Criteria andRealsupplieridEqualTo(Long value) {
            addCriterion("REALSUPPLIERID =", value, "realsupplierid");
            return (Criteria) this;
        }

        public Criteria andRealsupplieridNotEqualTo(Long value) {
            addCriterion("REALSUPPLIERID <>", value, "realsupplierid");
            return (Criteria) this;
        }

        public Criteria andRealsupplieridGreaterThan(Long value) {
            addCriterion("REALSUPPLIERID >", value, "realsupplierid");
            return (Criteria) this;
        }

        public Criteria andRealsupplieridGreaterThanOrEqualTo(Long value) {
            addCriterion("REALSUPPLIERID >=", value, "realsupplierid");
            return (Criteria) this;
        }

        public Criteria andRealsupplieridLessThan(Long value) {
            addCriterion("REALSUPPLIERID <", value, "realsupplierid");
            return (Criteria) this;
        }

        public Criteria andRealsupplieridLessThanOrEqualTo(Long value) {
            addCriterion("REALSUPPLIERID <=", value, "realsupplierid");
            return (Criteria) this;
        }

        public Criteria andRealsupplieridIn(List<Long> values) {
            addCriterion("REALSUPPLIERID in", values, "realsupplierid");
            return (Criteria) this;
        }

        public Criteria andRealsupplieridNotIn(List<Long> values) {
            addCriterion("REALSUPPLIERID not in", values, "realsupplierid");
            return (Criteria) this;
        }

        public Criteria andRealsupplieridBetween(Long value1, Long value2) {
            addCriterion("REALSUPPLIERID between", value1, value2, "realsupplierid");
            return (Criteria) this;
        }

        public Criteria andRealsupplieridNotBetween(Long value1, Long value2) {
            addCriterion("REALSUPPLIERID not between", value1, value2, "realsupplierid");
            return (Criteria) this;
        }

        public Criteria andRealsuppliernameIsNull() {
            addCriterion("REALSUPPLIERNAME is null");
            return (Criteria) this;
        }

        public Criteria andRealsuppliernameIsNotNull() {
            addCriterion("REALSUPPLIERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andRealsuppliernameEqualTo(String value) {
            addCriterion("REALSUPPLIERNAME =", value, "realsuppliername");
            return (Criteria) this;
        }

        public Criteria andRealsuppliernameNotEqualTo(String value) {
            addCriterion("REALSUPPLIERNAME <>", value, "realsuppliername");
            return (Criteria) this;
        }

        public Criteria andRealsuppliernameGreaterThan(String value) {
            addCriterion("REALSUPPLIERNAME >", value, "realsuppliername");
            return (Criteria) this;
        }

        public Criteria andRealsuppliernameGreaterThanOrEqualTo(String value) {
            addCriterion("REALSUPPLIERNAME >=", value, "realsuppliername");
            return (Criteria) this;
        }

        public Criteria andRealsuppliernameLessThan(String value) {
            addCriterion("REALSUPPLIERNAME <", value, "realsuppliername");
            return (Criteria) this;
        }

        public Criteria andRealsuppliernameLessThanOrEqualTo(String value) {
            addCriterion("REALSUPPLIERNAME <=", value, "realsuppliername");
            return (Criteria) this;
        }

        public Criteria andRealsuppliernameLike(String value) {
            addCriterion("REALSUPPLIERNAME like", value, "realsuppliername");
            return (Criteria) this;
        }

        public Criteria andRealsuppliernameNotLike(String value) {
            addCriterion("REALSUPPLIERNAME not like", value, "realsuppliername");
            return (Criteria) this;
        }

        public Criteria andRealsuppliernameIn(List<String> values) {
            addCriterion("REALSUPPLIERNAME in", values, "realsuppliername");
            return (Criteria) this;
        }

        public Criteria andRealsuppliernameNotIn(List<String> values) {
            addCriterion("REALSUPPLIERNAME not in", values, "realsuppliername");
            return (Criteria) this;
        }

        public Criteria andRealsuppliernameBetween(String value1, String value2) {
            addCriterion("REALSUPPLIERNAME between", value1, value2, "realsuppliername");
            return (Criteria) this;
        }

        public Criteria andRealsuppliernameNotBetween(String value1, String value2) {
            addCriterion("REALSUPPLIERNAME not between", value1, value2, "realsuppliername");
            return (Criteria) this;
        }

        public Criteria andProductname1IsNull() {
            addCriterion("PRODUCTNAME1 is null");
            return (Criteria) this;
        }

        public Criteria andProductname1IsNotNull() {
            addCriterion("PRODUCTNAME1 is not null");
            return (Criteria) this;
        }

        public Criteria andProductname1EqualTo(String value) {
            addCriterion("PRODUCTNAME1 =", value, "productname1");
            return (Criteria) this;
        }

        public Criteria andProductname1NotEqualTo(String value) {
            addCriterion("PRODUCTNAME1 <>", value, "productname1");
            return (Criteria) this;
        }

        public Criteria andProductname1GreaterThan(String value) {
            addCriterion("PRODUCTNAME1 >", value, "productname1");
            return (Criteria) this;
        }

        public Criteria andProductname1GreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCTNAME1 >=", value, "productname1");
            return (Criteria) this;
        }

        public Criteria andProductname1LessThan(String value) {
            addCriterion("PRODUCTNAME1 <", value, "productname1");
            return (Criteria) this;
        }

        public Criteria andProductname1LessThanOrEqualTo(String value) {
            addCriterion("PRODUCTNAME1 <=", value, "productname1");
            return (Criteria) this;
        }

        public Criteria andProductname1Like(String value) {
            addCriterion("PRODUCTNAME1 like", value, "productname1");
            return (Criteria) this;
        }

        public Criteria andProductname1NotLike(String value) {
            addCriterion("PRODUCTNAME1 not like", value, "productname1");
            return (Criteria) this;
        }

        public Criteria andProductname1In(List<String> values) {
            addCriterion("PRODUCTNAME1 in", values, "productname1");
            return (Criteria) this;
        }

        public Criteria andProductname1NotIn(List<String> values) {
            addCriterion("PRODUCTNAME1 not in", values, "productname1");
            return (Criteria) this;
        }

        public Criteria andProductname1Between(String value1, String value2) {
            addCriterion("PRODUCTNAME1 between", value1, value2, "productname1");
            return (Criteria) this;
        }

        public Criteria andProductname1NotBetween(String value1, String value2) {
            addCriterion("PRODUCTNAME1 not between", value1, value2, "productname1");
            return (Criteria) this;
        }

        public Criteria andProductname2IsNull() {
            addCriterion("PRODUCTNAME2 is null");
            return (Criteria) this;
        }

        public Criteria andProductname2IsNotNull() {
            addCriterion("PRODUCTNAME2 is not null");
            return (Criteria) this;
        }

        public Criteria andProductname2EqualTo(String value) {
            addCriterion("PRODUCTNAME2 =", value, "productname2");
            return (Criteria) this;
        }

        public Criteria andProductname2NotEqualTo(String value) {
            addCriterion("PRODUCTNAME2 <>", value, "productname2");
            return (Criteria) this;
        }

        public Criteria andProductname2GreaterThan(String value) {
            addCriterion("PRODUCTNAME2 >", value, "productname2");
            return (Criteria) this;
        }

        public Criteria andProductname2GreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCTNAME2 >=", value, "productname2");
            return (Criteria) this;
        }

        public Criteria andProductname2LessThan(String value) {
            addCriterion("PRODUCTNAME2 <", value, "productname2");
            return (Criteria) this;
        }

        public Criteria andProductname2LessThanOrEqualTo(String value) {
            addCriterion("PRODUCTNAME2 <=", value, "productname2");
            return (Criteria) this;
        }

        public Criteria andProductname2Like(String value) {
            addCriterion("PRODUCTNAME2 like", value, "productname2");
            return (Criteria) this;
        }

        public Criteria andProductname2NotLike(String value) {
            addCriterion("PRODUCTNAME2 not like", value, "productname2");
            return (Criteria) this;
        }

        public Criteria andProductname2In(List<String> values) {
            addCriterion("PRODUCTNAME2 in", values, "productname2");
            return (Criteria) this;
        }

        public Criteria andProductname2NotIn(List<String> values) {
            addCriterion("PRODUCTNAME2 not in", values, "productname2");
            return (Criteria) this;
        }

        public Criteria andProductname2Between(String value1, String value2) {
            addCriterion("PRODUCTNAME2 between", value1, value2, "productname2");
            return (Criteria) this;
        }

        public Criteria andProductname2NotBetween(String value1, String value2) {
            addCriterion("PRODUCTNAME2 not between", value1, value2, "productname2");
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

        public Criteria andLeadtimeIsNull() {
            addCriterion("LEADTIME is null");
            return (Criteria) this;
        }

        public Criteria andLeadtimeIsNotNull() {
            addCriterion("LEADTIME is not null");
            return (Criteria) this;
        }

        public Criteria andLeadtimeEqualTo(Integer value) {
            addCriterion("LEADTIME =", value, "leadtime");
            return (Criteria) this;
        }

        public Criteria andLeadtimeNotEqualTo(Integer value) {
            addCriterion("LEADTIME <>", value, "leadtime");
            return (Criteria) this;
        }

        public Criteria andLeadtimeGreaterThan(Integer value) {
            addCriterion("LEADTIME >", value, "leadtime");
            return (Criteria) this;
        }

        public Criteria andLeadtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("LEADTIME >=", value, "leadtime");
            return (Criteria) this;
        }

        public Criteria andLeadtimeLessThan(Integer value) {
            addCriterion("LEADTIME <", value, "leadtime");
            return (Criteria) this;
        }

        public Criteria andLeadtimeLessThanOrEqualTo(Integer value) {
            addCriterion("LEADTIME <=", value, "leadtime");
            return (Criteria) this;
        }

        public Criteria andLeadtimeIn(List<Integer> values) {
            addCriterion("LEADTIME in", values, "leadtime");
            return (Criteria) this;
        }

        public Criteria andLeadtimeNotIn(List<Integer> values) {
            addCriterion("LEADTIME not in", values, "leadtime");
            return (Criteria) this;
        }

        public Criteria andLeadtimeBetween(Integer value1, Integer value2) {
            addCriterion("LEADTIME between", value1, value2, "leadtime");
            return (Criteria) this;
        }

        public Criteria andLeadtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("LEADTIME not between", value1, value2, "leadtime");
            return (Criteria) this;
        }

        public Criteria andEconomicorderquantityIsNull() {
            addCriterion("ECONOMICORDERQUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andEconomicorderquantityIsNotNull() {
            addCriterion("ECONOMICORDERQUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andEconomicorderquantityEqualTo(Long value) {
            addCriterion("ECONOMICORDERQUANTITY =", value, "economicorderquantity");
            return (Criteria) this;
        }

        public Criteria andEconomicorderquantityNotEqualTo(Long value) {
            addCriterion("ECONOMICORDERQUANTITY <>", value, "economicorderquantity");
            return (Criteria) this;
        }

        public Criteria andEconomicorderquantityGreaterThan(Long value) {
            addCriterion("ECONOMICORDERQUANTITY >", value, "economicorderquantity");
            return (Criteria) this;
        }

        public Criteria andEconomicorderquantityGreaterThanOrEqualTo(Long value) {
            addCriterion("ECONOMICORDERQUANTITY >=", value, "economicorderquantity");
            return (Criteria) this;
        }

        public Criteria andEconomicorderquantityLessThan(Long value) {
            addCriterion("ECONOMICORDERQUANTITY <", value, "economicorderquantity");
            return (Criteria) this;
        }

        public Criteria andEconomicorderquantityLessThanOrEqualTo(Long value) {
            addCriterion("ECONOMICORDERQUANTITY <=", value, "economicorderquantity");
            return (Criteria) this;
        }

        public Criteria andEconomicorderquantityIn(List<Long> values) {
            addCriterion("ECONOMICORDERQUANTITY in", values, "economicorderquantity");
            return (Criteria) this;
        }

        public Criteria andEconomicorderquantityNotIn(List<Long> values) {
            addCriterion("ECONOMICORDERQUANTITY not in", values, "economicorderquantity");
            return (Criteria) this;
        }

        public Criteria andEconomicorderquantityBetween(Long value1, Long value2) {
            addCriterion("ECONOMICORDERQUANTITY between", value1, value2, "economicorderquantity");
            return (Criteria) this;
        }

        public Criteria andEconomicorderquantityNotBetween(Long value1, Long value2) {
            addCriterion("ECONOMICORDERQUANTITY not between", value1, value2, "economicorderquantity");
            return (Criteria) this;
        }

        public Criteria andMaximumdiscountquantityIsNull() {
            addCriterion("MAXIMUMDISCOUNTQUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andMaximumdiscountquantityIsNotNull() {
            addCriterion("MAXIMUMDISCOUNTQUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andMaximumdiscountquantityEqualTo(Long value) {
            addCriterion("MAXIMUMDISCOUNTQUANTITY =", value, "maximumdiscountquantity");
            return (Criteria) this;
        }

        public Criteria andMaximumdiscountquantityNotEqualTo(Long value) {
            addCriterion("MAXIMUMDISCOUNTQUANTITY <>", value, "maximumdiscountquantity");
            return (Criteria) this;
        }

        public Criteria andMaximumdiscountquantityGreaterThan(Long value) {
            addCriterion("MAXIMUMDISCOUNTQUANTITY >", value, "maximumdiscountquantity");
            return (Criteria) this;
        }

        public Criteria andMaximumdiscountquantityGreaterThanOrEqualTo(Long value) {
            addCriterion("MAXIMUMDISCOUNTQUANTITY >=", value, "maximumdiscountquantity");
            return (Criteria) this;
        }

        public Criteria andMaximumdiscountquantityLessThan(Long value) {
            addCriterion("MAXIMUMDISCOUNTQUANTITY <", value, "maximumdiscountquantity");
            return (Criteria) this;
        }

        public Criteria andMaximumdiscountquantityLessThanOrEqualTo(Long value) {
            addCriterion("MAXIMUMDISCOUNTQUANTITY <=", value, "maximumdiscountquantity");
            return (Criteria) this;
        }

        public Criteria andMaximumdiscountquantityIn(List<Long> values) {
            addCriterion("MAXIMUMDISCOUNTQUANTITY in", values, "maximumdiscountquantity");
            return (Criteria) this;
        }

        public Criteria andMaximumdiscountquantityNotIn(List<Long> values) {
            addCriterion("MAXIMUMDISCOUNTQUANTITY not in", values, "maximumdiscountquantity");
            return (Criteria) this;
        }

        public Criteria andMaximumdiscountquantityBetween(Long value1, Long value2) {
            addCriterion("MAXIMUMDISCOUNTQUANTITY between", value1, value2, "maximumdiscountquantity");
            return (Criteria) this;
        }

        public Criteria andMaximumdiscountquantityNotBetween(Long value1, Long value2) {
            addCriterion("MAXIMUMDISCOUNTQUANTITY not between", value1, value2, "maximumdiscountquantity");
            return (Criteria) this;
        }

        public Criteria andQuantityprocessedperdayIsNull() {
            addCriterion("QUANTITYPROCESSEDPERDAY is null");
            return (Criteria) this;
        }

        public Criteria andQuantityprocessedperdayIsNotNull() {
            addCriterion("QUANTITYPROCESSEDPERDAY is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityprocessedperdayEqualTo(Long value) {
            addCriterion("QUANTITYPROCESSEDPERDAY =", value, "quantityprocessedperday");
            return (Criteria) this;
        }

        public Criteria andQuantityprocessedperdayNotEqualTo(Long value) {
            addCriterion("QUANTITYPROCESSEDPERDAY <>", value, "quantityprocessedperday");
            return (Criteria) this;
        }

        public Criteria andQuantityprocessedperdayGreaterThan(Long value) {
            addCriterion("QUANTITYPROCESSEDPERDAY >", value, "quantityprocessedperday");
            return (Criteria) this;
        }

        public Criteria andQuantityprocessedperdayGreaterThanOrEqualTo(Long value) {
            addCriterion("QUANTITYPROCESSEDPERDAY >=", value, "quantityprocessedperday");
            return (Criteria) this;
        }

        public Criteria andQuantityprocessedperdayLessThan(Long value) {
            addCriterion("QUANTITYPROCESSEDPERDAY <", value, "quantityprocessedperday");
            return (Criteria) this;
        }

        public Criteria andQuantityprocessedperdayLessThanOrEqualTo(Long value) {
            addCriterion("QUANTITYPROCESSEDPERDAY <=", value, "quantityprocessedperday");
            return (Criteria) this;
        }

        public Criteria andQuantityprocessedperdayIn(List<Long> values) {
            addCriterion("QUANTITYPROCESSEDPERDAY in", values, "quantityprocessedperday");
            return (Criteria) this;
        }

        public Criteria andQuantityprocessedperdayNotIn(List<Long> values) {
            addCriterion("QUANTITYPROCESSEDPERDAY not in", values, "quantityprocessedperday");
            return (Criteria) this;
        }

        public Criteria andQuantityprocessedperdayBetween(Long value1, Long value2) {
            addCriterion("QUANTITYPROCESSEDPERDAY between", value1, value2, "quantityprocessedperday");
            return (Criteria) this;
        }

        public Criteria andQuantityprocessedperdayNotBetween(Long value1, Long value2) {
            addCriterion("QUANTITYPROCESSEDPERDAY not between", value1, value2, "quantityprocessedperday");
            return (Criteria) this;
        }

        public Criteria andWidthbeforepackingIsNull() {
            addCriterion("WIDTHBEFOREPACKING is null");
            return (Criteria) this;
        }

        public Criteria andWidthbeforepackingIsNotNull() {
            addCriterion("WIDTHBEFOREPACKING is not null");
            return (Criteria) this;
        }

        public Criteria andWidthbeforepackingEqualTo(BigDecimal value) {
            addCriterion("WIDTHBEFOREPACKING =", value, "widthbeforepacking");
            return (Criteria) this;
        }

        public Criteria andWidthbeforepackingNotEqualTo(BigDecimal value) {
            addCriterion("WIDTHBEFOREPACKING <>", value, "widthbeforepacking");
            return (Criteria) this;
        }

        public Criteria andWidthbeforepackingGreaterThan(BigDecimal value) {
            addCriterion("WIDTHBEFOREPACKING >", value, "widthbeforepacking");
            return (Criteria) this;
        }

        public Criteria andWidthbeforepackingGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WIDTHBEFOREPACKING >=", value, "widthbeforepacking");
            return (Criteria) this;
        }

        public Criteria andWidthbeforepackingLessThan(BigDecimal value) {
            addCriterion("WIDTHBEFOREPACKING <", value, "widthbeforepacking");
            return (Criteria) this;
        }

        public Criteria andWidthbeforepackingLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WIDTHBEFOREPACKING <=", value, "widthbeforepacking");
            return (Criteria) this;
        }

        public Criteria andWidthbeforepackingIn(List<BigDecimal> values) {
            addCriterion("WIDTHBEFOREPACKING in", values, "widthbeforepacking");
            return (Criteria) this;
        }

        public Criteria andWidthbeforepackingNotIn(List<BigDecimal> values) {
            addCriterion("WIDTHBEFOREPACKING not in", values, "widthbeforepacking");
            return (Criteria) this;
        }

        public Criteria andWidthbeforepackingBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WIDTHBEFOREPACKING between", value1, value2, "widthbeforepacking");
            return (Criteria) this;
        }

        public Criteria andWidthbeforepackingNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WIDTHBEFOREPACKING not between", value1, value2, "widthbeforepacking");
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

        public Criteria andHeightbeforepackingIsNull() {
            addCriterion("HEIGHTBEFOREPACKING is null");
            return (Criteria) this;
        }

        public Criteria andHeightbeforepackingIsNotNull() {
            addCriterion("HEIGHTBEFOREPACKING is not null");
            return (Criteria) this;
        }

        public Criteria andHeightbeforepackingEqualTo(BigDecimal value) {
            addCriterion("HEIGHTBEFOREPACKING =", value, "heightbeforepacking");
            return (Criteria) this;
        }

        public Criteria andHeightbeforepackingNotEqualTo(BigDecimal value) {
            addCriterion("HEIGHTBEFOREPACKING <>", value, "heightbeforepacking");
            return (Criteria) this;
        }

        public Criteria andHeightbeforepackingGreaterThan(BigDecimal value) {
            addCriterion("HEIGHTBEFOREPACKING >", value, "heightbeforepacking");
            return (Criteria) this;
        }

        public Criteria andHeightbeforepackingGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HEIGHTBEFOREPACKING >=", value, "heightbeforepacking");
            return (Criteria) this;
        }

        public Criteria andHeightbeforepackingLessThan(BigDecimal value) {
            addCriterion("HEIGHTBEFOREPACKING <", value, "heightbeforepacking");
            return (Criteria) this;
        }

        public Criteria andHeightbeforepackingLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HEIGHTBEFOREPACKING <=", value, "heightbeforepacking");
            return (Criteria) this;
        }

        public Criteria andHeightbeforepackingIn(List<BigDecimal> values) {
            addCriterion("HEIGHTBEFOREPACKING in", values, "heightbeforepacking");
            return (Criteria) this;
        }

        public Criteria andHeightbeforepackingNotIn(List<BigDecimal> values) {
            addCriterion("HEIGHTBEFOREPACKING not in", values, "heightbeforepacking");
            return (Criteria) this;
        }

        public Criteria andHeightbeforepackingBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HEIGHTBEFOREPACKING between", value1, value2, "heightbeforepacking");
            return (Criteria) this;
        }

        public Criteria andHeightbeforepackingNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HEIGHTBEFOREPACKING not between", value1, value2, "heightbeforepacking");
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

        public Criteria andLengthbeforepackingIsNull() {
            addCriterion("LENGTHBEFOREPACKING is null");
            return (Criteria) this;
        }

        public Criteria andLengthbeforepackingIsNotNull() {
            addCriterion("LENGTHBEFOREPACKING is not null");
            return (Criteria) this;
        }

        public Criteria andLengthbeforepackingEqualTo(BigDecimal value) {
            addCriterion("LENGTHBEFOREPACKING =", value, "lengthbeforepacking");
            return (Criteria) this;
        }

        public Criteria andLengthbeforepackingNotEqualTo(BigDecimal value) {
            addCriterion("LENGTHBEFOREPACKING <>", value, "lengthbeforepacking");
            return (Criteria) this;
        }

        public Criteria andLengthbeforepackingGreaterThan(BigDecimal value) {
            addCriterion("LENGTHBEFOREPACKING >", value, "lengthbeforepacking");
            return (Criteria) this;
        }

        public Criteria andLengthbeforepackingGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LENGTHBEFOREPACKING >=", value, "lengthbeforepacking");
            return (Criteria) this;
        }

        public Criteria andLengthbeforepackingLessThan(BigDecimal value) {
            addCriterion("LENGTHBEFOREPACKING <", value, "lengthbeforepacking");
            return (Criteria) this;
        }

        public Criteria andLengthbeforepackingLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LENGTHBEFOREPACKING <=", value, "lengthbeforepacking");
            return (Criteria) this;
        }

        public Criteria andLengthbeforepackingIn(List<BigDecimal> values) {
            addCriterion("LENGTHBEFOREPACKING in", values, "lengthbeforepacking");
            return (Criteria) this;
        }

        public Criteria andLengthbeforepackingNotIn(List<BigDecimal> values) {
            addCriterion("LENGTHBEFOREPACKING not in", values, "lengthbeforepacking");
            return (Criteria) this;
        }

        public Criteria andLengthbeforepackingBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LENGTHBEFOREPACKING between", value1, value2, "lengthbeforepacking");
            return (Criteria) this;
        }

        public Criteria andLengthbeforepackingNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LENGTHBEFOREPACKING not between", value1, value2, "lengthbeforepacking");
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

        public Criteria andWeightbeforepackingIsNull() {
            addCriterion("WEIGHTBEFOREPACKING is null");
            return (Criteria) this;
        }

        public Criteria andWeightbeforepackingIsNotNull() {
            addCriterion("WEIGHTBEFOREPACKING is not null");
            return (Criteria) this;
        }

        public Criteria andWeightbeforepackingEqualTo(BigDecimal value) {
            addCriterion("WEIGHTBEFOREPACKING =", value, "weightbeforepacking");
            return (Criteria) this;
        }

        public Criteria andWeightbeforepackingNotEqualTo(BigDecimal value) {
            addCriterion("WEIGHTBEFOREPACKING <>", value, "weightbeforepacking");
            return (Criteria) this;
        }

        public Criteria andWeightbeforepackingGreaterThan(BigDecimal value) {
            addCriterion("WEIGHTBEFOREPACKING >", value, "weightbeforepacking");
            return (Criteria) this;
        }

        public Criteria andWeightbeforepackingGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WEIGHTBEFOREPACKING >=", value, "weightbeforepacking");
            return (Criteria) this;
        }

        public Criteria andWeightbeforepackingLessThan(BigDecimal value) {
            addCriterion("WEIGHTBEFOREPACKING <", value, "weightbeforepacking");
            return (Criteria) this;
        }

        public Criteria andWeightbeforepackingLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WEIGHTBEFOREPACKING <=", value, "weightbeforepacking");
            return (Criteria) this;
        }

        public Criteria andWeightbeforepackingIn(List<BigDecimal> values) {
            addCriterion("WEIGHTBEFOREPACKING in", values, "weightbeforepacking");
            return (Criteria) this;
        }

        public Criteria andWeightbeforepackingNotIn(List<BigDecimal> values) {
            addCriterion("WEIGHTBEFOREPACKING not in", values, "weightbeforepacking");
            return (Criteria) this;
        }

        public Criteria andWeightbeforepackingBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WEIGHTBEFOREPACKING between", value1, value2, "weightbeforepacking");
            return (Criteria) this;
        }

        public Criteria andWeightbeforepackingNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WEIGHTBEFOREPACKING not between", value1, value2, "weightbeforepacking");
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

        public Criteria andWarrantyperiodIsNull() {
            addCriterion("WARRANTYPERIOD is null");
            return (Criteria) this;
        }

        public Criteria andWarrantyperiodIsNotNull() {
            addCriterion("WARRANTYPERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andWarrantyperiodEqualTo(Integer value) {
            addCriterion("WARRANTYPERIOD =", value, "warrantyperiod");
            return (Criteria) this;
        }

        public Criteria andWarrantyperiodNotEqualTo(Integer value) {
            addCriterion("WARRANTYPERIOD <>", value, "warrantyperiod");
            return (Criteria) this;
        }

        public Criteria andWarrantyperiodGreaterThan(Integer value) {
            addCriterion("WARRANTYPERIOD >", value, "warrantyperiod");
            return (Criteria) this;
        }

        public Criteria andWarrantyperiodGreaterThanOrEqualTo(Integer value) {
            addCriterion("WARRANTYPERIOD >=", value, "warrantyperiod");
            return (Criteria) this;
        }

        public Criteria andWarrantyperiodLessThan(Integer value) {
            addCriterion("WARRANTYPERIOD <", value, "warrantyperiod");
            return (Criteria) this;
        }

        public Criteria andWarrantyperiodLessThanOrEqualTo(Integer value) {
            addCriterion("WARRANTYPERIOD <=", value, "warrantyperiod");
            return (Criteria) this;
        }

        public Criteria andWarrantyperiodIn(List<Integer> values) {
            addCriterion("WARRANTYPERIOD in", values, "warrantyperiod");
            return (Criteria) this;
        }

        public Criteria andWarrantyperiodNotIn(List<Integer> values) {
            addCriterion("WARRANTYPERIOD not in", values, "warrantyperiod");
            return (Criteria) this;
        }

        public Criteria andWarrantyperiodBetween(Integer value1, Integer value2) {
            addCriterion("WARRANTYPERIOD between", value1, value2, "warrantyperiod");
            return (Criteria) this;
        }

        public Criteria andWarrantyperiodNotBetween(Integer value1, Integer value2) {
            addCriterion("WARRANTYPERIOD not between", value1, value2, "warrantyperiod");
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

        public Criteria andMarketpriceIsNull() {
            addCriterion("MARKETPRICE is null");
            return (Criteria) this;
        }

        public Criteria andMarketpriceIsNotNull() {
            addCriterion("MARKETPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andMarketpriceEqualTo(BigDecimal value) {
            addCriterion("MARKETPRICE =", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceNotEqualTo(BigDecimal value) {
            addCriterion("MARKETPRICE <>", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceGreaterThan(BigDecimal value) {
            addCriterion("MARKETPRICE >", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MARKETPRICE >=", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceLessThan(BigDecimal value) {
            addCriterion("MARKETPRICE <", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MARKETPRICE <=", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceIn(List<BigDecimal> values) {
            addCriterion("MARKETPRICE in", values, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceNotIn(List<BigDecimal> values) {
            addCriterion("MARKETPRICE not in", values, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MARKETPRICE between", value1, value2, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MARKETPRICE not between", value1, value2, "marketprice");
            return (Criteria) this;
        }

        public Criteria andShippingpriceIsNull() {
            addCriterion("SHIPPINGPRICE is null");
            return (Criteria) this;
        }

        public Criteria andShippingpriceIsNotNull() {
            addCriterion("SHIPPINGPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andShippingpriceEqualTo(BigDecimal value) {
            addCriterion("SHIPPINGPRICE =", value, "shippingprice");
            return (Criteria) this;
        }

        public Criteria andShippingpriceNotEqualTo(BigDecimal value) {
            addCriterion("SHIPPINGPRICE <>", value, "shippingprice");
            return (Criteria) this;
        }

        public Criteria andShippingpriceGreaterThan(BigDecimal value) {
            addCriterion("SHIPPINGPRICE >", value, "shippingprice");
            return (Criteria) this;
        }

        public Criteria andShippingpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SHIPPINGPRICE >=", value, "shippingprice");
            return (Criteria) this;
        }

        public Criteria andShippingpriceLessThan(BigDecimal value) {
            addCriterion("SHIPPINGPRICE <", value, "shippingprice");
            return (Criteria) this;
        }

        public Criteria andShippingpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SHIPPINGPRICE <=", value, "shippingprice");
            return (Criteria) this;
        }

        public Criteria andShippingpriceIn(List<BigDecimal> values) {
            addCriterion("SHIPPINGPRICE in", values, "shippingprice");
            return (Criteria) this;
        }

        public Criteria andShippingpriceNotIn(List<BigDecimal> values) {
            addCriterion("SHIPPINGPRICE not in", values, "shippingprice");
            return (Criteria) this;
        }

        public Criteria andShippingpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHIPPINGPRICE between", value1, value2, "shippingprice");
            return (Criteria) this;
        }

        public Criteria andShippingpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHIPPINGPRICE not between", value1, value2, "shippingprice");
            return (Criteria) this;
        }

        public Criteria andOffshoredeliveryIsNull() {
            addCriterion("OFFSHOREDELIVERY is null");
            return (Criteria) this;
        }

        public Criteria andOffshoredeliveryIsNotNull() {
            addCriterion("OFFSHOREDELIVERY is not null");
            return (Criteria) this;
        }

        public Criteria andOffshoredeliveryEqualTo(String value) {
            addCriterion("OFFSHOREDELIVERY =", value, "offshoredelivery");
            return (Criteria) this;
        }

        public Criteria andOffshoredeliveryNotEqualTo(String value) {
            addCriterion("OFFSHOREDELIVERY <>", value, "offshoredelivery");
            return (Criteria) this;
        }

        public Criteria andOffshoredeliveryGreaterThan(String value) {
            addCriterion("OFFSHOREDELIVERY >", value, "offshoredelivery");
            return (Criteria) this;
        }

        public Criteria andOffshoredeliveryGreaterThanOrEqualTo(String value) {
            addCriterion("OFFSHOREDELIVERY >=", value, "offshoredelivery");
            return (Criteria) this;
        }

        public Criteria andOffshoredeliveryLessThan(String value) {
            addCriterion("OFFSHOREDELIVERY <", value, "offshoredelivery");
            return (Criteria) this;
        }

        public Criteria andOffshoredeliveryLessThanOrEqualTo(String value) {
            addCriterion("OFFSHOREDELIVERY <=", value, "offshoredelivery");
            return (Criteria) this;
        }

        public Criteria andOffshoredeliveryLike(String value) {
            addCriterion("OFFSHOREDELIVERY like", value, "offshoredelivery");
            return (Criteria) this;
        }

        public Criteria andOffshoredeliveryNotLike(String value) {
            addCriterion("OFFSHOREDELIVERY not like", value, "offshoredelivery");
            return (Criteria) this;
        }

        public Criteria andOffshoredeliveryIn(List<String> values) {
            addCriterion("OFFSHOREDELIVERY in", values, "offshoredelivery");
            return (Criteria) this;
        }

        public Criteria andOffshoredeliveryNotIn(List<String> values) {
            addCriterion("OFFSHOREDELIVERY not in", values, "offshoredelivery");
            return (Criteria) this;
        }

        public Criteria andOffshoredeliveryBetween(String value1, String value2) {
            addCriterion("OFFSHOREDELIVERY between", value1, value2, "offshoredelivery");
            return (Criteria) this;
        }

        public Criteria andOffshoredeliveryNotBetween(String value1, String value2) {
            addCriterion("OFFSHOREDELIVERY not between", value1, value2, "offshoredelivery");
            return (Criteria) this;
        }

        public Criteria andGiftpackageIsNull() {
            addCriterion("GIFTPACKAGE is null");
            return (Criteria) this;
        }

        public Criteria andGiftpackageIsNotNull() {
            addCriterion("GIFTPACKAGE is not null");
            return (Criteria) this;
        }

        public Criteria andGiftpackageEqualTo(String value) {
            addCriterion("GIFTPACKAGE =", value, "giftpackage");
            return (Criteria) this;
        }

        public Criteria andGiftpackageNotEqualTo(String value) {
            addCriterion("GIFTPACKAGE <>", value, "giftpackage");
            return (Criteria) this;
        }

        public Criteria andGiftpackageGreaterThan(String value) {
            addCriterion("GIFTPACKAGE >", value, "giftpackage");
            return (Criteria) this;
        }

        public Criteria andGiftpackageGreaterThanOrEqualTo(String value) {
            addCriterion("GIFTPACKAGE >=", value, "giftpackage");
            return (Criteria) this;
        }

        public Criteria andGiftpackageLessThan(String value) {
            addCriterion("GIFTPACKAGE <", value, "giftpackage");
            return (Criteria) this;
        }

        public Criteria andGiftpackageLessThanOrEqualTo(String value) {
            addCriterion("GIFTPACKAGE <=", value, "giftpackage");
            return (Criteria) this;
        }

        public Criteria andGiftpackageLike(String value) {
            addCriterion("GIFTPACKAGE like", value, "giftpackage");
            return (Criteria) this;
        }

        public Criteria andGiftpackageNotLike(String value) {
            addCriterion("GIFTPACKAGE not like", value, "giftpackage");
            return (Criteria) this;
        }

        public Criteria andGiftpackageIn(List<String> values) {
            addCriterion("GIFTPACKAGE in", values, "giftpackage");
            return (Criteria) this;
        }

        public Criteria andGiftpackageNotIn(List<String> values) {
            addCriterion("GIFTPACKAGE not in", values, "giftpackage");
            return (Criteria) this;
        }

        public Criteria andGiftpackageBetween(String value1, String value2) {
            addCriterion("GIFTPACKAGE between", value1, value2, "giftpackage");
            return (Criteria) this;
        }

        public Criteria andGiftpackageNotBetween(String value1, String value2) {
            addCriterion("GIFTPACKAGE not between", value1, value2, "giftpackage");
            return (Criteria) this;
        }

        public Criteria andUsermanualIsNull() {
            addCriterion("USERMANUAL is null");
            return (Criteria) this;
        }

        public Criteria andUsermanualIsNotNull() {
            addCriterion("USERMANUAL is not null");
            return (Criteria) this;
        }

        public Criteria andUsermanualEqualTo(String value) {
            addCriterion("USERMANUAL =", value, "usermanual");
            return (Criteria) this;
        }

        public Criteria andUsermanualNotEqualTo(String value) {
            addCriterion("USERMANUAL <>", value, "usermanual");
            return (Criteria) this;
        }

        public Criteria andUsermanualGreaterThan(String value) {
            addCriterion("USERMANUAL >", value, "usermanual");
            return (Criteria) this;
        }

        public Criteria andUsermanualGreaterThanOrEqualTo(String value) {
            addCriterion("USERMANUAL >=", value, "usermanual");
            return (Criteria) this;
        }

        public Criteria andUsermanualLessThan(String value) {
            addCriterion("USERMANUAL <", value, "usermanual");
            return (Criteria) this;
        }

        public Criteria andUsermanualLessThanOrEqualTo(String value) {
            addCriterion("USERMANUAL <=", value, "usermanual");
            return (Criteria) this;
        }

        public Criteria andUsermanualLike(String value) {
            addCriterion("USERMANUAL like", value, "usermanual");
            return (Criteria) this;
        }

        public Criteria andUsermanualNotLike(String value) {
            addCriterion("USERMANUAL not like", value, "usermanual");
            return (Criteria) this;
        }

        public Criteria andUsermanualIn(List<String> values) {
            addCriterion("USERMANUAL in", values, "usermanual");
            return (Criteria) this;
        }

        public Criteria andUsermanualNotIn(List<String> values) {
            addCriterion("USERMANUAL not in", values, "usermanual");
            return (Criteria) this;
        }

        public Criteria andUsermanualBetween(String value1, String value2) {
            addCriterion("USERMANUAL between", value1, value2, "usermanual");
            return (Criteria) this;
        }

        public Criteria andUsermanualNotBetween(String value1, String value2) {
            addCriterion("USERMANUAL not between", value1, value2, "usermanual");
            return (Criteria) this;
        }

        public Criteria andWarrantyIsNull() {
            addCriterion("WARRANTY is null");
            return (Criteria) this;
        }

        public Criteria andWarrantyIsNotNull() {
            addCriterion("WARRANTY is not null");
            return (Criteria) this;
        }

        public Criteria andWarrantyEqualTo(String value) {
            addCriterion("WARRANTY =", value, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyNotEqualTo(String value) {
            addCriterion("WARRANTY <>", value, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyGreaterThan(String value) {
            addCriterion("WARRANTY >", value, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyGreaterThanOrEqualTo(String value) {
            addCriterion("WARRANTY >=", value, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyLessThan(String value) {
            addCriterion("WARRANTY <", value, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyLessThanOrEqualTo(String value) {
            addCriterion("WARRANTY <=", value, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyLike(String value) {
            addCriterion("WARRANTY like", value, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyNotLike(String value) {
            addCriterion("WARRANTY not like", value, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyIn(List<String> values) {
            addCriterion("WARRANTY in", values, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyNotIn(List<String> values) {
            addCriterion("WARRANTY not in", values, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyBetween(String value1, String value2) {
            addCriterion("WARRANTY between", value1, value2, "warranty");
            return (Criteria) this;
        }

        public Criteria andWarrantyNotBetween(String value1, String value2) {
            addCriterion("WARRANTY not between", value1, value2, "warranty");
            return (Criteria) this;
        }

        public Criteria andBrandnameIsNull() {
            addCriterion("BRANDNAME is null");
            return (Criteria) this;
        }

        public Criteria andBrandnameIsNotNull() {
            addCriterion("BRANDNAME is not null");
            return (Criteria) this;
        }

        public Criteria andBrandnameEqualTo(String value) {
            addCriterion("BRANDNAME =", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameNotEqualTo(String value) {
            addCriterion("BRANDNAME <>", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameGreaterThan(String value) {
            addCriterion("BRANDNAME >", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameGreaterThanOrEqualTo(String value) {
            addCriterion("BRANDNAME >=", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameLessThan(String value) {
            addCriterion("BRANDNAME <", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameLessThanOrEqualTo(String value) {
            addCriterion("BRANDNAME <=", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameLike(String value) {
            addCriterion("BRANDNAME like", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameNotLike(String value) {
            addCriterion("BRANDNAME not like", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameIn(List<String> values) {
            addCriterion("BRANDNAME in", values, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameNotIn(List<String> values) {
            addCriterion("BRANDNAME not in", values, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameBetween(String value1, String value2) {
            addCriterion("BRANDNAME between", value1, value2, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameNotBetween(String value1, String value2) {
            addCriterion("BRANDNAME not between", value1, value2, "brandname");
            return (Criteria) this;
        }

        public Criteria andManufacturingplaceIsNull() {
            addCriterion("MANUFACTURINGPLACE is null");
            return (Criteria) this;
        }

        public Criteria andManufacturingplaceIsNotNull() {
            addCriterion("MANUFACTURINGPLACE is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturingplaceEqualTo(String value) {
            addCriterion("MANUFACTURINGPLACE =", value, "manufacturingplace");
            return (Criteria) this;
        }

        public Criteria andManufacturingplaceNotEqualTo(String value) {
            addCriterion("MANUFACTURINGPLACE <>", value, "manufacturingplace");
            return (Criteria) this;
        }

        public Criteria andManufacturingplaceGreaterThan(String value) {
            addCriterion("MANUFACTURINGPLACE >", value, "manufacturingplace");
            return (Criteria) this;
        }

        public Criteria andManufacturingplaceGreaterThanOrEqualTo(String value) {
            addCriterion("MANUFACTURINGPLACE >=", value, "manufacturingplace");
            return (Criteria) this;
        }

        public Criteria andManufacturingplaceLessThan(String value) {
            addCriterion("MANUFACTURINGPLACE <", value, "manufacturingplace");
            return (Criteria) this;
        }

        public Criteria andManufacturingplaceLessThanOrEqualTo(String value) {
            addCriterion("MANUFACTURINGPLACE <=", value, "manufacturingplace");
            return (Criteria) this;
        }

        public Criteria andManufacturingplaceLike(String value) {
            addCriterion("MANUFACTURINGPLACE like", value, "manufacturingplace");
            return (Criteria) this;
        }

        public Criteria andManufacturingplaceNotLike(String value) {
            addCriterion("MANUFACTURINGPLACE not like", value, "manufacturingplace");
            return (Criteria) this;
        }

        public Criteria andManufacturingplaceIn(List<String> values) {
            addCriterion("MANUFACTURINGPLACE in", values, "manufacturingplace");
            return (Criteria) this;
        }

        public Criteria andManufacturingplaceNotIn(List<String> values) {
            addCriterion("MANUFACTURINGPLACE not in", values, "manufacturingplace");
            return (Criteria) this;
        }

        public Criteria andManufacturingplaceBetween(String value1, String value2) {
            addCriterion("MANUFACTURINGPLACE between", value1, value2, "manufacturingplace");
            return (Criteria) this;
        }

        public Criteria andManufacturingplaceNotBetween(String value1, String value2) {
            addCriterion("MANUFACTURINGPLACE not between", value1, value2, "manufacturingplace");
            return (Criteria) this;
        }

        public Criteria andNotesfordeliveryIsNull() {
            addCriterion("NOTESFORDELIVERY is null");
            return (Criteria) this;
        }

        public Criteria andNotesfordeliveryIsNotNull() {
            addCriterion("NOTESFORDELIVERY is not null");
            return (Criteria) this;
        }

        public Criteria andNotesfordeliveryEqualTo(String value) {
            addCriterion("NOTESFORDELIVERY =", value, "notesfordelivery");
            return (Criteria) this;
        }

        public Criteria andNotesfordeliveryNotEqualTo(String value) {
            addCriterion("NOTESFORDELIVERY <>", value, "notesfordelivery");
            return (Criteria) this;
        }

        public Criteria andNotesfordeliveryGreaterThan(String value) {
            addCriterion("NOTESFORDELIVERY >", value, "notesfordelivery");
            return (Criteria) this;
        }

        public Criteria andNotesfordeliveryGreaterThanOrEqualTo(String value) {
            addCriterion("NOTESFORDELIVERY >=", value, "notesfordelivery");
            return (Criteria) this;
        }

        public Criteria andNotesfordeliveryLessThan(String value) {
            addCriterion("NOTESFORDELIVERY <", value, "notesfordelivery");
            return (Criteria) this;
        }

        public Criteria andNotesfordeliveryLessThanOrEqualTo(String value) {
            addCriterion("NOTESFORDELIVERY <=", value, "notesfordelivery");
            return (Criteria) this;
        }

        public Criteria andNotesfordeliveryLike(String value) {
            addCriterion("NOTESFORDELIVERY like", value, "notesfordelivery");
            return (Criteria) this;
        }

        public Criteria andNotesfordeliveryNotLike(String value) {
            addCriterion("NOTESFORDELIVERY not like", value, "notesfordelivery");
            return (Criteria) this;
        }

        public Criteria andNotesfordeliveryIn(List<String> values) {
            addCriterion("NOTESFORDELIVERY in", values, "notesfordelivery");
            return (Criteria) this;
        }

        public Criteria andNotesfordeliveryNotIn(List<String> values) {
            addCriterion("NOTESFORDELIVERY not in", values, "notesfordelivery");
            return (Criteria) this;
        }

        public Criteria andNotesfordeliveryBetween(String value1, String value2) {
            addCriterion("NOTESFORDELIVERY between", value1, value2, "notesfordelivery");
            return (Criteria) this;
        }

        public Criteria andNotesfordeliveryNotBetween(String value1, String value2) {
            addCriterion("NOTESFORDELIVERY not between", value1, value2, "notesfordelivery");
            return (Criteria) this;
        }

        public Criteria andProductimagepathIsNull() {
            addCriterion("PRODUCTIMAGEPATH is null");
            return (Criteria) this;
        }

        public Criteria andProductimagepathIsNotNull() {
            addCriterion("PRODUCTIMAGEPATH is not null");
            return (Criteria) this;
        }

        public Criteria andProductimagepathEqualTo(String value) {
            addCriterion("PRODUCTIMAGEPATH =", value, "productimagepath");
            return (Criteria) this;
        }

        public Criteria andProductimagepathNotEqualTo(String value) {
            addCriterion("PRODUCTIMAGEPATH <>", value, "productimagepath");
            return (Criteria) this;
        }

        public Criteria andProductimagepathGreaterThan(String value) {
            addCriterion("PRODUCTIMAGEPATH >", value, "productimagepath");
            return (Criteria) this;
        }

        public Criteria andProductimagepathGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCTIMAGEPATH >=", value, "productimagepath");
            return (Criteria) this;
        }

        public Criteria andProductimagepathLessThan(String value) {
            addCriterion("PRODUCTIMAGEPATH <", value, "productimagepath");
            return (Criteria) this;
        }

        public Criteria andProductimagepathLessThanOrEqualTo(String value) {
            addCriterion("PRODUCTIMAGEPATH <=", value, "productimagepath");
            return (Criteria) this;
        }

        public Criteria andProductimagepathLike(String value) {
            addCriterion("PRODUCTIMAGEPATH like", value, "productimagepath");
            return (Criteria) this;
        }

        public Criteria andProductimagepathNotLike(String value) {
            addCriterion("PRODUCTIMAGEPATH not like", value, "productimagepath");
            return (Criteria) this;
        }

        public Criteria andProductimagepathIn(List<String> values) {
            addCriterion("PRODUCTIMAGEPATH in", values, "productimagepath");
            return (Criteria) this;
        }

        public Criteria andProductimagepathNotIn(List<String> values) {
            addCriterion("PRODUCTIMAGEPATH not in", values, "productimagepath");
            return (Criteria) this;
        }

        public Criteria andProductimagepathBetween(String value1, String value2) {
            addCriterion("PRODUCTIMAGEPATH between", value1, value2, "productimagepath");
            return (Criteria) this;
        }

        public Criteria andProductimagepathNotBetween(String value1, String value2) {
            addCriterion("PRODUCTIMAGEPATH not between", value1, value2, "productimagepath");
            return (Criteria) this;
        }

        public Criteria andBoxidIsNull() {
            addCriterion("BOXID is null");
            return (Criteria) this;
        }

        public Criteria andBoxidIsNotNull() {
            addCriterion("BOXID is not null");
            return (Criteria) this;
        }

        public Criteria andBoxidEqualTo(String value) {
            addCriterion("BOXID =", value, "boxid");
            return (Criteria) this;
        }

        public Criteria andBoxidNotEqualTo(String value) {
            addCriterion("BOXID <>", value, "boxid");
            return (Criteria) this;
        }

        public Criteria andBoxidGreaterThan(String value) {
            addCriterion("BOXID >", value, "boxid");
            return (Criteria) this;
        }

        public Criteria andBoxidGreaterThanOrEqualTo(String value) {
            addCriterion("BOXID >=", value, "boxid");
            return (Criteria) this;
        }

        public Criteria andBoxidLessThan(String value) {
            addCriterion("BOXID <", value, "boxid");
            return (Criteria) this;
        }

        public Criteria andBoxidLessThanOrEqualTo(String value) {
            addCriterion("BOXID <=", value, "boxid");
            return (Criteria) this;
        }

        public Criteria andBoxidLike(String value) {
            addCriterion("BOXID like", value, "boxid");
            return (Criteria) this;
        }

        public Criteria andBoxidNotLike(String value) {
            addCriterion("BOXID not like", value, "boxid");
            return (Criteria) this;
        }

        public Criteria andBoxidIn(List<String> values) {
            addCriterion("BOXID in", values, "boxid");
            return (Criteria) this;
        }

        public Criteria andBoxidNotIn(List<String> values) {
            addCriterion("BOXID not in", values, "boxid");
            return (Criteria) this;
        }

        public Criteria andBoxidBetween(String value1, String value2) {
            addCriterion("BOXID between", value1, value2, "boxid");
            return (Criteria) this;
        }

        public Criteria andBoxidNotBetween(String value1, String value2) {
            addCriterion("BOXID not between", value1, value2, "boxid");
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

        public Criteria andReturntypeIsNull() {
            addCriterion("RETURNTYPE is null");
            return (Criteria) this;
        }

        public Criteria andReturntypeIsNotNull() {
            addCriterion("RETURNTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andReturntypeEqualTo(Integer value) {
            addCriterion("RETURNTYPE =", value, "returntype");
            return (Criteria) this;
        }

        public Criteria andReturntypeNotEqualTo(Integer value) {
            addCriterion("RETURNTYPE <>", value, "returntype");
            return (Criteria) this;
        }

        public Criteria andReturntypeGreaterThan(Integer value) {
            addCriterion("RETURNTYPE >", value, "returntype");
            return (Criteria) this;
        }

        public Criteria andReturntypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("RETURNTYPE >=", value, "returntype");
            return (Criteria) this;
        }

        public Criteria andReturntypeLessThan(Integer value) {
            addCriterion("RETURNTYPE <", value, "returntype");
            return (Criteria) this;
        }

        public Criteria andReturntypeLessThanOrEqualTo(Integer value) {
            addCriterion("RETURNTYPE <=", value, "returntype");
            return (Criteria) this;
        }

        public Criteria andReturntypeIn(List<Integer> values) {
            addCriterion("RETURNTYPE in", values, "returntype");
            return (Criteria) this;
        }

        public Criteria andReturntypeNotIn(List<Integer> values) {
            addCriterion("RETURNTYPE not in", values, "returntype");
            return (Criteria) this;
        }

        public Criteria andReturntypeBetween(Integer value1, Integer value2) {
            addCriterion("RETURNTYPE between", value1, value2, "returntype");
            return (Criteria) this;
        }

        public Criteria andReturntypeNotBetween(Integer value1, Integer value2) {
            addCriterion("RETURNTYPE not between", value1, value2, "returntype");
            return (Criteria) this;
        }

        public Criteria andSubdeliverytypeIsNull() {
            addCriterion("SUBDELIVERYTYPE is null");
            return (Criteria) this;
        }

        public Criteria andSubdeliverytypeIsNotNull() {
            addCriterion("SUBDELIVERYTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSubdeliverytypeEqualTo(Integer value) {
            addCriterion("SUBDELIVERYTYPE =", value, "subdeliverytype");
            return (Criteria) this;
        }

        public Criteria andSubdeliverytypeNotEqualTo(Integer value) {
            addCriterion("SUBDELIVERYTYPE <>", value, "subdeliverytype");
            return (Criteria) this;
        }

        public Criteria andSubdeliverytypeGreaterThan(Integer value) {
            addCriterion("SUBDELIVERYTYPE >", value, "subdeliverytype");
            return (Criteria) this;
        }

        public Criteria andSubdeliverytypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("SUBDELIVERYTYPE >=", value, "subdeliverytype");
            return (Criteria) this;
        }

        public Criteria andSubdeliverytypeLessThan(Integer value) {
            addCriterion("SUBDELIVERYTYPE <", value, "subdeliverytype");
            return (Criteria) this;
        }

        public Criteria andSubdeliverytypeLessThanOrEqualTo(Integer value) {
            addCriterion("SUBDELIVERYTYPE <=", value, "subdeliverytype");
            return (Criteria) this;
        }

        public Criteria andSubdeliverytypeIn(List<Integer> values) {
            addCriterion("SUBDELIVERYTYPE in", values, "subdeliverytype");
            return (Criteria) this;
        }

        public Criteria andSubdeliverytypeNotIn(List<Integer> values) {
            addCriterion("SUBDELIVERYTYPE not in", values, "subdeliverytype");
            return (Criteria) this;
        }

        public Criteria andSubdeliverytypeBetween(Integer value1, Integer value2) {
            addCriterion("SUBDELIVERYTYPE between", value1, value2, "subdeliverytype");
            return (Criteria) this;
        }

        public Criteria andSubdeliverytypeNotBetween(Integer value1, Integer value2) {
            addCriterion("SUBDELIVERYTYPE not between", value1, value2, "subdeliverytype");
            return (Criteria) this;
        }

        public Criteria andSubreturntypeIsNull() {
            addCriterion("SUBRETURNTYPE is null");
            return (Criteria) this;
        }

        public Criteria andSubreturntypeIsNotNull() {
            addCriterion("SUBRETURNTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSubreturntypeEqualTo(Integer value) {
            addCriterion("SUBRETURNTYPE =", value, "subreturntype");
            return (Criteria) this;
        }

        public Criteria andSubreturntypeNotEqualTo(Integer value) {
            addCriterion("SUBRETURNTYPE <>", value, "subreturntype");
            return (Criteria) this;
        }

        public Criteria andSubreturntypeGreaterThan(Integer value) {
            addCriterion("SUBRETURNTYPE >", value, "subreturntype");
            return (Criteria) this;
        }

        public Criteria andSubreturntypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("SUBRETURNTYPE >=", value, "subreturntype");
            return (Criteria) this;
        }

        public Criteria andSubreturntypeLessThan(Integer value) {
            addCriterion("SUBRETURNTYPE <", value, "subreturntype");
            return (Criteria) this;
        }

        public Criteria andSubreturntypeLessThanOrEqualTo(Integer value) {
            addCriterion("SUBRETURNTYPE <=", value, "subreturntype");
            return (Criteria) this;
        }

        public Criteria andSubreturntypeIn(List<Integer> values) {
            addCriterion("SUBRETURNTYPE in", values, "subreturntype");
            return (Criteria) this;
        }

        public Criteria andSubreturntypeNotIn(List<Integer> values) {
            addCriterion("SUBRETURNTYPE not in", values, "subreturntype");
            return (Criteria) this;
        }

        public Criteria andSubreturntypeBetween(Integer value1, Integer value2) {
            addCriterion("SUBRETURNTYPE between", value1, value2, "subreturntype");
            return (Criteria) this;
        }

        public Criteria andSubreturntypeNotBetween(Integer value1, Integer value2) {
            addCriterion("SUBRETURNTYPE not between", value1, value2, "subreturntype");
            return (Criteria) this;
        }

        public Criteria andSalestypeIsNull() {
            addCriterion("SALESTYPE is null");
            return (Criteria) this;
        }

        public Criteria andSalestypeIsNotNull() {
            addCriterion("SALESTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSalestypeEqualTo(Integer value) {
            addCriterion("SALESTYPE =", value, "salestype");
            return (Criteria) this;
        }

        public Criteria andSalestypeNotEqualTo(Integer value) {
            addCriterion("SALESTYPE <>", value, "salestype");
            return (Criteria) this;
        }

        public Criteria andSalestypeGreaterThan(Integer value) {
            addCriterion("SALESTYPE >", value, "salestype");
            return (Criteria) this;
        }

        public Criteria andSalestypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("SALESTYPE >=", value, "salestype");
            return (Criteria) this;
        }

        public Criteria andSalestypeLessThan(Integer value) {
            addCriterion("SALESTYPE <", value, "salestype");
            return (Criteria) this;
        }

        public Criteria andSalestypeLessThanOrEqualTo(Integer value) {
            addCriterion("SALESTYPE <=", value, "salestype");
            return (Criteria) this;
        }

        public Criteria andSalestypeIn(List<Integer> values) {
            addCriterion("SALESTYPE in", values, "salestype");
            return (Criteria) this;
        }

        public Criteria andSalestypeNotIn(List<Integer> values) {
            addCriterion("SALESTYPE not in", values, "salestype");
            return (Criteria) this;
        }

        public Criteria andSalestypeBetween(Integer value1, Integer value2) {
            addCriterion("SALESTYPE between", value1, value2, "salestype");
            return (Criteria) this;
        }

        public Criteria andSalestypeNotBetween(Integer value1, Integer value2) {
            addCriterion("SALESTYPE not between", value1, value2, "salestype");
            return (Criteria) this;
        }

        public Criteria andCommisiontypeIsNull() {
            addCriterion("COMMISIONTYPE is null");
            return (Criteria) this;
        }

        public Criteria andCommisiontypeIsNotNull() {
            addCriterion("COMMISIONTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCommisiontypeEqualTo(Integer value) {
            addCriterion("COMMISIONTYPE =", value, "commisiontype");
            return (Criteria) this;
        }

        public Criteria andCommisiontypeNotEqualTo(Integer value) {
            addCriterion("COMMISIONTYPE <>", value, "commisiontype");
            return (Criteria) this;
        }

        public Criteria andCommisiontypeGreaterThan(Integer value) {
            addCriterion("COMMISIONTYPE >", value, "commisiontype");
            return (Criteria) this;
        }

        public Criteria andCommisiontypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("COMMISIONTYPE >=", value, "commisiontype");
            return (Criteria) this;
        }

        public Criteria andCommisiontypeLessThan(Integer value) {
            addCriterion("COMMISIONTYPE <", value, "commisiontype");
            return (Criteria) this;
        }

        public Criteria andCommisiontypeLessThanOrEqualTo(Integer value) {
            addCriterion("COMMISIONTYPE <=", value, "commisiontype");
            return (Criteria) this;
        }

        public Criteria andCommisiontypeIn(List<Integer> values) {
            addCriterion("COMMISIONTYPE in", values, "commisiontype");
            return (Criteria) this;
        }

        public Criteria andCommisiontypeNotIn(List<Integer> values) {
            addCriterion("COMMISIONTYPE not in", values, "commisiontype");
            return (Criteria) this;
        }

        public Criteria andCommisiontypeBetween(Integer value1, Integer value2) {
            addCriterion("COMMISIONTYPE between", value1, value2, "commisiontype");
            return (Criteria) this;
        }

        public Criteria andCommisiontypeNotBetween(Integer value1, Integer value2) {
            addCriterion("COMMISIONTYPE not between", value1, value2, "commisiontype");
            return (Criteria) this;
        }

        public Criteria andCommissionrateIsNull() {
            addCriterion("COMMISSIONRATE is null");
            return (Criteria) this;
        }

        public Criteria andCommissionrateIsNotNull() {
            addCriterion("COMMISSIONRATE is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionrateEqualTo(BigDecimal value) {
            addCriterion("COMMISSIONRATE =", value, "commissionrate");
            return (Criteria) this;
        }

        public Criteria andCommissionrateNotEqualTo(BigDecimal value) {
            addCriterion("COMMISSIONRATE <>", value, "commissionrate");
            return (Criteria) this;
        }

        public Criteria andCommissionrateGreaterThan(BigDecimal value) {
            addCriterion("COMMISSIONRATE >", value, "commissionrate");
            return (Criteria) this;
        }

        public Criteria andCommissionrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COMMISSIONRATE >=", value, "commissionrate");
            return (Criteria) this;
        }

        public Criteria andCommissionrateLessThan(BigDecimal value) {
            addCriterion("COMMISSIONRATE <", value, "commissionrate");
            return (Criteria) this;
        }

        public Criteria andCommissionrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COMMISSIONRATE <=", value, "commissionrate");
            return (Criteria) this;
        }

        public Criteria andCommissionrateIn(List<BigDecimal> values) {
            addCriterion("COMMISSIONRATE in", values, "commissionrate");
            return (Criteria) this;
        }

        public Criteria andCommissionrateNotIn(List<BigDecimal> values) {
            addCriterion("COMMISSIONRATE not in", values, "commissionrate");
            return (Criteria) this;
        }

        public Criteria andCommissionrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMMISSIONRATE between", value1, value2, "commissionrate");
            return (Criteria) this;
        }

        public Criteria andCommissionrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMMISSIONRATE not between", value1, value2, "commissionrate");
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

        public Criteria andPotypeIsNull() {
            addCriterion("POTYPE is null");
            return (Criteria) this;
        }

        public Criteria andPotypeIsNotNull() {
            addCriterion("POTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPotypeEqualTo(Integer value) {
            addCriterion("POTYPE =", value, "potype");
            return (Criteria) this;
        }

        public Criteria andPotypeNotEqualTo(Integer value) {
            addCriterion("POTYPE <>", value, "potype");
            return (Criteria) this;
        }

        public Criteria andPotypeGreaterThan(Integer value) {
            addCriterion("POTYPE >", value, "potype");
            return (Criteria) this;
        }

        public Criteria andPotypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("POTYPE >=", value, "potype");
            return (Criteria) this;
        }

        public Criteria andPotypeLessThan(Integer value) {
            addCriterion("POTYPE <", value, "potype");
            return (Criteria) this;
        }

        public Criteria andPotypeLessThanOrEqualTo(Integer value) {
            addCriterion("POTYPE <=", value, "potype");
            return (Criteria) this;
        }

        public Criteria andPotypeIn(List<Integer> values) {
            addCriterion("POTYPE in", values, "potype");
            return (Criteria) this;
        }

        public Criteria andPotypeNotIn(List<Integer> values) {
            addCriterion("POTYPE not in", values, "potype");
            return (Criteria) this;
        }

        public Criteria andPotypeBetween(Integer value1, Integer value2) {
            addCriterion("POTYPE between", value1, value2, "potype");
            return (Criteria) this;
        }

        public Criteria andPotypeNotBetween(Integer value1, Integer value2) {
            addCriterion("POTYPE not between", value1, value2, "potype");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNull() {
            addCriterion("COMPANYID is null");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNotNull() {
            addCriterion("COMPANYID is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyidEqualTo(Long value) {
            addCriterion("COMPANYID =", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotEqualTo(Long value) {
            addCriterion("COMPANYID <>", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThan(Long value) {
            addCriterion("COMPANYID >", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThanOrEqualTo(Long value) {
            addCriterion("COMPANYID >=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThan(Long value) {
            addCriterion("COMPANYID <", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThanOrEqualTo(Long value) {
            addCriterion("COMPANYID <=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidIn(List<Long> values) {
            addCriterion("COMPANYID in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotIn(List<Long> values) {
            addCriterion("COMPANYID not in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidBetween(Long value1, Long value2) {
            addCriterion("COMPANYID between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotBetween(Long value1, Long value2) {
            addCriterion("COMPANYID not between", value1, value2, "companyid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ET1_CHINA.TSPM_PRODUCT
     *
     * @mbggenerated do_not_delete_during_merge Fri Oct 24 13:36:29 CST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ET1_CHINA.TSPM_PRODUCT
     *
     * @mbggenerated Fri Oct 24 13:36:29 CST 2014
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