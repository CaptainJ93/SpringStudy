package com.best1.api.entity.scm.product;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TscmProductattributeExample {
 
    protected String orderByClause;


    protected boolean distinct;

  
    protected List<Criteria> oredCriteria;

  
    public TscmProductattributeExample() {
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

        public Criteria andAttributeidIsNull() {
            addCriterion("ATTRIBUTEID is null");
            return (Criteria) this;
        }

        public Criteria andAttributeidIsNotNull() {
            addCriterion("ATTRIBUTEID is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeidEqualTo(Long value) {
            addCriterion("ATTRIBUTEID =", value, "attributeid");
            return (Criteria) this;
        }

        public Criteria andAttributeidNotEqualTo(Long value) {
            addCriterion("ATTRIBUTEID <>", value, "attributeid");
            return (Criteria) this;
        }

        public Criteria andAttributeidGreaterThan(Long value) {
            addCriterion("ATTRIBUTEID >", value, "attributeid");
            return (Criteria) this;
        }

        public Criteria andAttributeidGreaterThanOrEqualTo(Long value) {
            addCriterion("ATTRIBUTEID >=", value, "attributeid");
            return (Criteria) this;
        }

        public Criteria andAttributeidLessThan(Long value) {
            addCriterion("ATTRIBUTEID <", value, "attributeid");
            return (Criteria) this;
        }

        public Criteria andAttributeidLessThanOrEqualTo(Long value) {
            addCriterion("ATTRIBUTEID <=", value, "attributeid");
            return (Criteria) this;
        }

        public Criteria andAttributeidIn(List<Long> values) {
            addCriterion("ATTRIBUTEID in", values, "attributeid");
            return (Criteria) this;
        }

        public Criteria andAttributeidNotIn(List<Long> values) {
            addCriterion("ATTRIBUTEID not in", values, "attributeid");
            return (Criteria) this;
        }

        public Criteria andAttributeidBetween(Long value1, Long value2) {
            addCriterion("ATTRIBUTEID between", value1, value2, "attributeid");
            return (Criteria) this;
        }

        public Criteria andAttributeidNotBetween(Long value1, Long value2) {
            addCriterion("ATTRIBUTEID not between", value1, value2, "attributeid");
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

        public Criteria andAttributecategoryidIsNull() {
            addCriterion("ATTRIBUTECATEGORYID is null");
            return (Criteria) this;
        }

        public Criteria andAttributecategoryidIsNotNull() {
            addCriterion("ATTRIBUTECATEGORYID is not null");
            return (Criteria) this;
        }

        public Criteria andAttributecategoryidEqualTo(Integer value) {
            addCriterion("ATTRIBUTECATEGORYID =", value, "attributecategoryid");
            return (Criteria) this;
        }

        public Criteria andAttributecategoryidNotEqualTo(Integer value) {
            addCriterion("ATTRIBUTECATEGORYID <>", value, "attributecategoryid");
            return (Criteria) this;
        }

        public Criteria andAttributecategoryidGreaterThan(Integer value) {
            addCriterion("ATTRIBUTECATEGORYID >", value, "attributecategoryid");
            return (Criteria) this;
        }

        public Criteria andAttributecategoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ATTRIBUTECATEGORYID >=", value, "attributecategoryid");
            return (Criteria) this;
        }

        public Criteria andAttributecategoryidLessThan(Integer value) {
            addCriterion("ATTRIBUTECATEGORYID <", value, "attributecategoryid");
            return (Criteria) this;
        }

        public Criteria andAttributecategoryidLessThanOrEqualTo(Integer value) {
            addCriterion("ATTRIBUTECATEGORYID <=", value, "attributecategoryid");
            return (Criteria) this;
        }

        public Criteria andAttributecategoryidIn(List<Integer> values) {
            addCriterion("ATTRIBUTECATEGORYID in", values, "attributecategoryid");
            return (Criteria) this;
        }

        public Criteria andAttributecategoryidNotIn(List<Integer> values) {
            addCriterion("ATTRIBUTECATEGORYID not in", values, "attributecategoryid");
            return (Criteria) this;
        }

        public Criteria andAttributecategoryidBetween(Integer value1, Integer value2) {
            addCriterion("ATTRIBUTECATEGORYID between", value1, value2, "attributecategoryid");
            return (Criteria) this;
        }

        public Criteria andAttributecategoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("ATTRIBUTECATEGORYID not between", value1, value2, "attributecategoryid");
            return (Criteria) this;
        }

        public Criteria andAttributevalueIsNull() {
            addCriterion("ATTRIBUTEVALUE is null");
            return (Criteria) this;
        }

        public Criteria andAttributevalueIsNotNull() {
            addCriterion("ATTRIBUTEVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andAttributevalueEqualTo(Integer value) {
            addCriterion("ATTRIBUTEVALUE =", value, "attributevalue");
            return (Criteria) this;
        }

        public Criteria andAttributevalueNotEqualTo(Integer value) {
            addCriterion("ATTRIBUTEVALUE <>", value, "attributevalue");
            return (Criteria) this;
        }

        public Criteria andAttributevalueGreaterThan(Integer value) {
            addCriterion("ATTRIBUTEVALUE >", value, "attributevalue");
            return (Criteria) this;
        }

        public Criteria andAttributevalueGreaterThanOrEqualTo(Integer value) {
            addCriterion("ATTRIBUTEVALUE >=", value, "attributevalue");
            return (Criteria) this;
        }

        public Criteria andAttributevalueLessThan(Integer value) {
            addCriterion("ATTRIBUTEVALUE <", value, "attributevalue");
            return (Criteria) this;
        }

        public Criteria andAttributevalueLessThanOrEqualTo(Integer value) {
            addCriterion("ATTRIBUTEVALUE <=", value, "attributevalue");
            return (Criteria) this;
        }

        public Criteria andAttributevalueIn(List<Integer> values) {
            addCriterion("ATTRIBUTEVALUE in", values, "attributevalue");
            return (Criteria) this;
        }

        public Criteria andAttributevalueNotIn(List<Integer> values) {
            addCriterion("ATTRIBUTEVALUE not in", values, "attributevalue");
            return (Criteria) this;
        }

        public Criteria andAttributevalueBetween(Integer value1, Integer value2) {
            addCriterion("ATTRIBUTEVALUE between", value1, value2, "attributevalue");
            return (Criteria) this;
        }

        public Criteria andAttributevalueNotBetween(Integer value1, Integer value2) {
            addCriterion("ATTRIBUTEVALUE not between", value1, value2, "attributevalue");
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