package com.best1.api.entity.crm;

import java.util.ArrayList;
import java.util.List;

public class TcrmContactreferencedetailsExample {
  
    protected String orderByClause;

  
    protected boolean distinct;

   
    protected List<Criteria> oredCriteria;

   
    public TcrmContactreferencedetailsExample() {
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

        public Criteria andContactreferenceidIsNull() {
            addCriterion("CONTACTREFERENCEID is null");
            return (Criteria) this;
        }

        public Criteria andContactreferenceidIsNotNull() {
            addCriterion("CONTACTREFERENCEID is not null");
            return (Criteria) this;
        }

        public Criteria andContactreferenceidEqualTo(Long value) {
            addCriterion("CONTACTREFERENCEID =", value, "contactreferenceid");
            return (Criteria) this;
        }

        public Criteria andContactreferenceidNotEqualTo(Long value) {
            addCriterion("CONTACTREFERENCEID <>", value, "contactreferenceid");
            return (Criteria) this;
        }

        public Criteria andContactreferenceidGreaterThan(Long value) {
            addCriterion("CONTACTREFERENCEID >", value, "contactreferenceid");
            return (Criteria) this;
        }

        public Criteria andContactreferenceidGreaterThanOrEqualTo(Long value) {
            addCriterion("CONTACTREFERENCEID >=", value, "contactreferenceid");
            return (Criteria) this;
        }

        public Criteria andContactreferenceidLessThan(Long value) {
            addCriterion("CONTACTREFERENCEID <", value, "contactreferenceid");
            return (Criteria) this;
        }

        public Criteria andContactreferenceidLessThanOrEqualTo(Long value) {
            addCriterion("CONTACTREFERENCEID <=", value, "contactreferenceid");
            return (Criteria) this;
        }

        public Criteria andContactreferenceidIn(List<Long> values) {
            addCriterion("CONTACTREFERENCEID in", values, "contactreferenceid");
            return (Criteria) this;
        }

        public Criteria andContactreferenceidNotIn(List<Long> values) {
            addCriterion("CONTACTREFERENCEID not in", values, "contactreferenceid");
            return (Criteria) this;
        }

        public Criteria andContactreferenceidBetween(Long value1, Long value2) {
            addCriterion("CONTACTREFERENCEID between", value1, value2, "contactreferenceid");
            return (Criteria) this;
        }

        public Criteria andContactreferenceidNotBetween(Long value1, Long value2) {
            addCriterion("CONTACTREFERENCEID not between", value1, value2, "contactreferenceid");
            return (Criteria) this;
        }

        public Criteria andContactidIsNull() {
            addCriterion("CONTACTID is null");
            return (Criteria) this;
        }

        public Criteria andContactidIsNotNull() {
            addCriterion("CONTACTID is not null");
            return (Criteria) this;
        }

        public Criteria andContactidEqualTo(Long value) {
            addCriterion("CONTACTID =", value, "contactid");
            return (Criteria) this;
        }

        public Criteria andContactidNotEqualTo(Long value) {
            addCriterion("CONTACTID <>", value, "contactid");
            return (Criteria) this;
        }

        public Criteria andContactidGreaterThan(Long value) {
            addCriterion("CONTACTID >", value, "contactid");
            return (Criteria) this;
        }

        public Criteria andContactidGreaterThanOrEqualTo(Long value) {
            addCriterion("CONTACTID >=", value, "contactid");
            return (Criteria) this;
        }

        public Criteria andContactidLessThan(Long value) {
            addCriterion("CONTACTID <", value, "contactid");
            return (Criteria) this;
        }

        public Criteria andContactidLessThanOrEqualTo(Long value) {
            addCriterion("CONTACTID <=", value, "contactid");
            return (Criteria) this;
        }

        public Criteria andContactidIn(List<Long> values) {
            addCriterion("CONTACTID in", values, "contactid");
            return (Criteria) this;
        }

        public Criteria andContactidNotIn(List<Long> values) {
            addCriterion("CONTACTID not in", values, "contactid");
            return (Criteria) this;
        }

        public Criteria andContactidBetween(Long value1, Long value2) {
            addCriterion("CONTACTID between", value1, value2, "contactid");
            return (Criteria) this;
        }

        public Criteria andContactidNotBetween(Long value1, Long value2) {
            addCriterion("CONTACTID not between", value1, value2, "contactid");
            return (Criteria) this;
        }

        public Criteria andReferencevalueIsNull() {
            addCriterion("REFERENCEVALUE is null");
            return (Criteria) this;
        }

        public Criteria andReferencevalueIsNotNull() {
            addCriterion("REFERENCEVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andReferencevalueEqualTo(Long value) {
            addCriterion("REFERENCEVALUE =", value, "referencevalue");
            return (Criteria) this;
        }

        public Criteria andReferencevalueNotEqualTo(Long value) {
            addCriterion("REFERENCEVALUE <>", value, "referencevalue");
            return (Criteria) this;
        }

        public Criteria andReferencevalueGreaterThan(Long value) {
            addCriterion("REFERENCEVALUE >", value, "referencevalue");
            return (Criteria) this;
        }

        public Criteria andReferencevalueGreaterThanOrEqualTo(Long value) {
            addCriterion("REFERENCEVALUE >=", value, "referencevalue");
            return (Criteria) this;
        }

        public Criteria andReferencevalueLessThan(Long value) {
            addCriterion("REFERENCEVALUE <", value, "referencevalue");
            return (Criteria) this;
        }

        public Criteria andReferencevalueLessThanOrEqualTo(Long value) {
            addCriterion("REFERENCEVALUE <=", value, "referencevalue");
            return (Criteria) this;
        }

        public Criteria andReferencevalueIn(List<Long> values) {
            addCriterion("REFERENCEVALUE in", values, "referencevalue");
            return (Criteria) this;
        }

        public Criteria andReferencevalueNotIn(List<Long> values) {
            addCriterion("REFERENCEVALUE not in", values, "referencevalue");
            return (Criteria) this;
        }

        public Criteria andReferencevalueBetween(Long value1, Long value2) {
            addCriterion("REFERENCEVALUE between", value1, value2, "referencevalue");
            return (Criteria) this;
        }

        public Criteria andReferencevalueNotBetween(Long value1, Long value2) {
            addCriterion("REFERENCEVALUE not between", value1, value2, "referencevalue");
            return (Criteria) this;
        }

        public Criteria andReferencetypeIsNull() {
            addCriterion("REFERENCETYPE is null");
            return (Criteria) this;
        }

        public Criteria andReferencetypeIsNotNull() {
            addCriterion("REFERENCETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andReferencetypeEqualTo(Integer value) {
            addCriterion("REFERENCETYPE =", value, "referencetype");
            return (Criteria) this;
        }

        public Criteria andReferencetypeNotEqualTo(Integer value) {
            addCriterion("REFERENCETYPE <>", value, "referencetype");
            return (Criteria) this;
        }

        public Criteria andReferencetypeGreaterThan(Integer value) {
            addCriterion("REFERENCETYPE >", value, "referencetype");
            return (Criteria) this;
        }

        public Criteria andReferencetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("REFERENCETYPE >=", value, "referencetype");
            return (Criteria) this;
        }

        public Criteria andReferencetypeLessThan(Integer value) {
            addCriterion("REFERENCETYPE <", value, "referencetype");
            return (Criteria) this;
        }

        public Criteria andReferencetypeLessThanOrEqualTo(Integer value) {
            addCriterion("REFERENCETYPE <=", value, "referencetype");
            return (Criteria) this;
        }

        public Criteria andReferencetypeIn(List<Integer> values) {
            addCriterion("REFERENCETYPE in", values, "referencetype");
            return (Criteria) this;
        }

        public Criteria andReferencetypeNotIn(List<Integer> values) {
            addCriterion("REFERENCETYPE not in", values, "referencetype");
            return (Criteria) this;
        }

        public Criteria andReferencetypeBetween(Integer value1, Integer value2) {
            addCriterion("REFERENCETYPE between", value1, value2, "referencetype");
            return (Criteria) this;
        }

        public Criteria andReferencetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("REFERENCETYPE not between", value1, value2, "referencetype");
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