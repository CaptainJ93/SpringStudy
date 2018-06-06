package com.best1.api.entity.scm.supplier;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TscmSupplierdeliverypendingExample {
  
    protected String orderByClause;


    protected boolean distinct;

  
    protected List<Criteria> oredCriteria;

  
    public TscmSupplierdeliverypendingExample() {
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

        public Criteria andDeliverytermIsNull() {
            addCriterion("DELIVERYTERM is null");
            return (Criteria) this;
        }

        public Criteria andDeliverytermIsNotNull() {
            addCriterion("DELIVERYTERM is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverytermEqualTo(Integer value) {
            addCriterion("DELIVERYTERM =", value, "deliveryterm");
            return (Criteria) this;
        }

        public Criteria andDeliverytermNotEqualTo(Integer value) {
            addCriterion("DELIVERYTERM <>", value, "deliveryterm");
            return (Criteria) this;
        }

        public Criteria andDeliverytermGreaterThan(Integer value) {
            addCriterion("DELIVERYTERM >", value, "deliveryterm");
            return (Criteria) this;
        }

        public Criteria andDeliverytermGreaterThanOrEqualTo(Integer value) {
            addCriterion("DELIVERYTERM >=", value, "deliveryterm");
            return (Criteria) this;
        }

        public Criteria andDeliverytermLessThan(Integer value) {
            addCriterion("DELIVERYTERM <", value, "deliveryterm");
            return (Criteria) this;
        }

        public Criteria andDeliverytermLessThanOrEqualTo(Integer value) {
            addCriterion("DELIVERYTERM <=", value, "deliveryterm");
            return (Criteria) this;
        }

        public Criteria andDeliverytermIn(List<Integer> values) {
            addCriterion("DELIVERYTERM in", values, "deliveryterm");
            return (Criteria) this;
        }

        public Criteria andDeliverytermNotIn(List<Integer> values) {
            addCriterion("DELIVERYTERM not in", values, "deliveryterm");
            return (Criteria) this;
        }

        public Criteria andDeliverytermBetween(Integer value1, Integer value2) {
            addCriterion("DELIVERYTERM between", value1, value2, "deliveryterm");
            return (Criteria) this;
        }

        public Criteria andDeliverytermNotBetween(Integer value1, Integer value2) {
            addCriterion("DELIVERYTERM not between", value1, value2, "deliveryterm");
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
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ET1_CHINA.TSCM_SUPPLIERDELIVERYPENDING
     *
     * @mbggenerated do_not_delete_during_merge Fri Oct 17 10:01:25 CST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ET1_CHINA.TSCM_SUPPLIERDELIVERYPENDING
     *
     * @mbggenerated Fri Oct 17 10:01:25 CST 2014
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