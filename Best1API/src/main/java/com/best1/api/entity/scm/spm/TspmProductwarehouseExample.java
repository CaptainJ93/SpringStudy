package com.best1.api.entity.scm.spm;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TspmProductwarehouseExample {
 
    protected String orderByClause;


    protected boolean distinct;

 
    protected List<Criteria> oredCriteria;

   
    public TspmProductwarehouseExample() {
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
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ET1_CHINA.TSPM_PRODUCTWAREHOUSE
     *
     * @mbggenerated do_not_delete_during_merge Fri Oct 24 11:43:08 CST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ET1_CHINA.TSPM_PRODUCTWAREHOUSE
     *
     * @mbggenerated Fri Oct 24 11:43:08 CST 2014
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