package com.best1.api.entity.scm.spm;

import java.util.ArrayList;
import java.util.List;

public class TscmSpmscmproductExample {
    
    protected String orderByClause;

   
    protected boolean distinct;

 
    protected List<Criteria> oredCriteria;

   
    public TscmSpmscmproductExample() {
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

        public Criteria andSequencenoIsNull() {
            addCriterion("SEQUENCENO is null");
            return (Criteria) this;
        }

        public Criteria andSequencenoIsNotNull() {
            addCriterion("SEQUENCENO is not null");
            return (Criteria) this;
        }

        public Criteria andSequencenoEqualTo(Long value) {
            addCriterion("SEQUENCENO =", value, "sequenceno");
            return (Criteria) this;
        }

        public Criteria andSequencenoNotEqualTo(Long value) {
            addCriterion("SEQUENCENO <>", value, "sequenceno");
            return (Criteria) this;
        }

        public Criteria andSequencenoGreaterThan(Long value) {
            addCriterion("SEQUENCENO >", value, "sequenceno");
            return (Criteria) this;
        }

        public Criteria andSequencenoGreaterThanOrEqualTo(Long value) {
            addCriterion("SEQUENCENO >=", value, "sequenceno");
            return (Criteria) this;
        }

        public Criteria andSequencenoLessThan(Long value) {
            addCriterion("SEQUENCENO <", value, "sequenceno");
            return (Criteria) this;
        }

        public Criteria andSequencenoLessThanOrEqualTo(Long value) {
            addCriterion("SEQUENCENO <=", value, "sequenceno");
            return (Criteria) this;
        }

        public Criteria andSequencenoIn(List<Long> values) {
            addCriterion("SEQUENCENO in", values, "sequenceno");
            return (Criteria) this;
        }

        public Criteria andSequencenoNotIn(List<Long> values) {
            addCriterion("SEQUENCENO not in", values, "sequenceno");
            return (Criteria) this;
        }

        public Criteria andSequencenoBetween(Long value1, Long value2) {
            addCriterion("SEQUENCENO between", value1, value2, "sequenceno");
            return (Criteria) this;
        }

        public Criteria andSequencenoNotBetween(Long value1, Long value2) {
            addCriterion("SEQUENCENO not between", value1, value2, "sequenceno");
            return (Criteria) this;
        }

        public Criteria andSpmproductidIsNull() {
            addCriterion("SPMPRODUCTID is null");
            return (Criteria) this;
        }

        public Criteria andSpmproductidIsNotNull() {
            addCriterion("SPMPRODUCTID is not null");
            return (Criteria) this;
        }

        public Criteria andSpmproductidEqualTo(Long value) {
            addCriterion("SPMPRODUCTID =", value, "spmproductid");
            return (Criteria) this;
        }

        public Criteria andSpmproductidNotEqualTo(Long value) {
            addCriterion("SPMPRODUCTID <>", value, "spmproductid");
            return (Criteria) this;
        }

        public Criteria andSpmproductidGreaterThan(Long value) {
            addCriterion("SPMPRODUCTID >", value, "spmproductid");
            return (Criteria) this;
        }

        public Criteria andSpmproductidGreaterThanOrEqualTo(Long value) {
            addCriterion("SPMPRODUCTID >=", value, "spmproductid");
            return (Criteria) this;
        }

        public Criteria andSpmproductidLessThan(Long value) {
            addCriterion("SPMPRODUCTID <", value, "spmproductid");
            return (Criteria) this;
        }

        public Criteria andSpmproductidLessThanOrEqualTo(Long value) {
            addCriterion("SPMPRODUCTID <=", value, "spmproductid");
            return (Criteria) this;
        }

        public Criteria andSpmproductidIn(List<Long> values) {
            addCriterion("SPMPRODUCTID in", values, "spmproductid");
            return (Criteria) this;
        }

        public Criteria andSpmproductidNotIn(List<Long> values) {
            addCriterion("SPMPRODUCTID not in", values, "spmproductid");
            return (Criteria) this;
        }

        public Criteria andSpmproductidBetween(Long value1, Long value2) {
            addCriterion("SPMPRODUCTID between", value1, value2, "spmproductid");
            return (Criteria) this;
        }

        public Criteria andSpmproductidNotBetween(Long value1, Long value2) {
            addCriterion("SPMPRODUCTID not between", value1, value2, "spmproductid");
            return (Criteria) this;
        }

        public Criteria andScmproductidIsNull() {
            addCriterion("SCMPRODUCTID is null");
            return (Criteria) this;
        }

        public Criteria andScmproductidIsNotNull() {
            addCriterion("SCMPRODUCTID is not null");
            return (Criteria) this;
        }

        public Criteria andScmproductidEqualTo(Long value) {
            addCriterion("SCMPRODUCTID =", value, "scmproductid");
            return (Criteria) this;
        }

        public Criteria andScmproductidNotEqualTo(Long value) {
            addCriterion("SCMPRODUCTID <>", value, "scmproductid");
            return (Criteria) this;
        }

        public Criteria andScmproductidGreaterThan(Long value) {
            addCriterion("SCMPRODUCTID >", value, "scmproductid");
            return (Criteria) this;
        }

        public Criteria andScmproductidGreaterThanOrEqualTo(Long value) {
            addCriterion("SCMPRODUCTID >=", value, "scmproductid");
            return (Criteria) this;
        }

        public Criteria andScmproductidLessThan(Long value) {
            addCriterion("SCMPRODUCTID <", value, "scmproductid");
            return (Criteria) this;
        }

        public Criteria andScmproductidLessThanOrEqualTo(Long value) {
            addCriterion("SCMPRODUCTID <=", value, "scmproductid");
            return (Criteria) this;
        }

        public Criteria andScmproductidIn(List<Long> values) {
            addCriterion("SCMPRODUCTID in", values, "scmproductid");
            return (Criteria) this;
        }

        public Criteria andScmproductidNotIn(List<Long> values) {
            addCriterion("SCMPRODUCTID not in", values, "scmproductid");
            return (Criteria) this;
        }

        public Criteria andScmproductidBetween(Long value1, Long value2) {
            addCriterion("SCMPRODUCTID between", value1, value2, "scmproductid");
            return (Criteria) this;
        }

        public Criteria andScmproductidNotBetween(Long value1, Long value2) {
            addCriterion("SCMPRODUCTID not between", value1, value2, "scmproductid");
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