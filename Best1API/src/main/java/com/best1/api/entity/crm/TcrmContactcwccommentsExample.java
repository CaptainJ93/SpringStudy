package com.best1.api.entity.crm;

import java.util.ArrayList;
import java.util.List;

public class TcrmContactcwccommentsExample {
    
    protected String orderByClause;

 
    protected boolean distinct;

    protected List<Criteria> oredCriteria;

  
    public TcrmContactcwccommentsExample() {
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

        public Criteria andCallworkcodeidIsNull() {
            addCriterion("CALLWORKCODEID is null");
            return (Criteria) this;
        }

        public Criteria andCallworkcodeidIsNotNull() {
            addCriterion("CALLWORKCODEID is not null");
            return (Criteria) this;
        }

        public Criteria andCallworkcodeidEqualTo(Long value) {
            addCriterion("CALLWORKCODEID =", value, "callworkcodeid");
            return (Criteria) this;
        }

        public Criteria andCallworkcodeidNotEqualTo(Long value) {
            addCriterion("CALLWORKCODEID <>", value, "callworkcodeid");
            return (Criteria) this;
        }

        public Criteria andCallworkcodeidGreaterThan(Long value) {
            addCriterion("CALLWORKCODEID >", value, "callworkcodeid");
            return (Criteria) this;
        }

        public Criteria andCallworkcodeidGreaterThanOrEqualTo(Long value) {
            addCriterion("CALLWORKCODEID >=", value, "callworkcodeid");
            return (Criteria) this;
        }

        public Criteria andCallworkcodeidLessThan(Long value) {
            addCriterion("CALLWORKCODEID <", value, "callworkcodeid");
            return (Criteria) this;
        }

        public Criteria andCallworkcodeidLessThanOrEqualTo(Long value) {
            addCriterion("CALLWORKCODEID <=", value, "callworkcodeid");
            return (Criteria) this;
        }

        public Criteria andCallworkcodeidIn(List<Long> values) {
            addCriterion("CALLWORKCODEID in", values, "callworkcodeid");
            return (Criteria) this;
        }

        public Criteria andCallworkcodeidNotIn(List<Long> values) {
            addCriterion("CALLWORKCODEID not in", values, "callworkcodeid");
            return (Criteria) this;
        }

        public Criteria andCallworkcodeidBetween(Long value1, Long value2) {
            addCriterion("CALLWORKCODEID between", value1, value2, "callworkcodeid");
            return (Criteria) this;
        }

        public Criteria andCallworkcodeidNotBetween(Long value1, Long value2) {
            addCriterion("CALLWORKCODEID not between", value1, value2, "callworkcodeid");
            return (Criteria) this;
        }

        public Criteria andCallworkcodecommentsIsNull() {
            addCriterion("CALLWORKCODECOMMENTS is null");
            return (Criteria) this;
        }

        public Criteria andCallworkcodecommentsIsNotNull() {
            addCriterion("CALLWORKCODECOMMENTS is not null");
            return (Criteria) this;
        }

        public Criteria andCallworkcodecommentsEqualTo(String value) {
            addCriterion("CALLWORKCODECOMMENTS =", value, "callworkcodecomments");
            return (Criteria) this;
        }

        public Criteria andCallworkcodecommentsNotEqualTo(String value) {
            addCriterion("CALLWORKCODECOMMENTS <>", value, "callworkcodecomments");
            return (Criteria) this;
        }

        public Criteria andCallworkcodecommentsGreaterThan(String value) {
            addCriterion("CALLWORKCODECOMMENTS >", value, "callworkcodecomments");
            return (Criteria) this;
        }

        public Criteria andCallworkcodecommentsGreaterThanOrEqualTo(String value) {
            addCriterion("CALLWORKCODECOMMENTS >=", value, "callworkcodecomments");
            return (Criteria) this;
        }

        public Criteria andCallworkcodecommentsLessThan(String value) {
            addCriterion("CALLWORKCODECOMMENTS <", value, "callworkcodecomments");
            return (Criteria) this;
        }

        public Criteria andCallworkcodecommentsLessThanOrEqualTo(String value) {
            addCriterion("CALLWORKCODECOMMENTS <=", value, "callworkcodecomments");
            return (Criteria) this;
        }

        public Criteria andCallworkcodecommentsLike(String value) {
            addCriterion("CALLWORKCODECOMMENTS like", value, "callworkcodecomments");
            return (Criteria) this;
        }

        public Criteria andCallworkcodecommentsNotLike(String value) {
            addCriterion("CALLWORKCODECOMMENTS not like", value, "callworkcodecomments");
            return (Criteria) this;
        }

        public Criteria andCallworkcodecommentsIn(List<String> values) {
            addCriterion("CALLWORKCODECOMMENTS in", values, "callworkcodecomments");
            return (Criteria) this;
        }

        public Criteria andCallworkcodecommentsNotIn(List<String> values) {
            addCriterion("CALLWORKCODECOMMENTS not in", values, "callworkcodecomments");
            return (Criteria) this;
        }

        public Criteria andCallworkcodecommentsBetween(String value1, String value2) {
            addCriterion("CALLWORKCODECOMMENTS between", value1, value2, "callworkcodecomments");
            return (Criteria) this;
        }

        public Criteria andCallworkcodecommentsNotBetween(String value1, String value2) {
            addCriterion("CALLWORKCODECOMMENTS not between", value1, value2, "callworkcodecomments");
            return (Criteria) this;
        }

        public Criteria andCallworkcodenameIsNull() {
            addCriterion("CALLWORKCODENAME is null");
            return (Criteria) this;
        }

        public Criteria andCallworkcodenameIsNotNull() {
            addCriterion("CALLWORKCODENAME is not null");
            return (Criteria) this;
        }

        public Criteria andCallworkcodenameEqualTo(String value) {
            addCriterion("CALLWORKCODENAME =", value, "callworkcodename");
            return (Criteria) this;
        }

        public Criteria andCallworkcodenameNotEqualTo(String value) {
            addCriterion("CALLWORKCODENAME <>", value, "callworkcodename");
            return (Criteria) this;
        }

        public Criteria andCallworkcodenameGreaterThan(String value) {
            addCriterion("CALLWORKCODENAME >", value, "callworkcodename");
            return (Criteria) this;
        }

        public Criteria andCallworkcodenameGreaterThanOrEqualTo(String value) {
            addCriterion("CALLWORKCODENAME >=", value, "callworkcodename");
            return (Criteria) this;
        }

        public Criteria andCallworkcodenameLessThan(String value) {
            addCriterion("CALLWORKCODENAME <", value, "callworkcodename");
            return (Criteria) this;
        }

        public Criteria andCallworkcodenameLessThanOrEqualTo(String value) {
            addCriterion("CALLWORKCODENAME <=", value, "callworkcodename");
            return (Criteria) this;
        }

        public Criteria andCallworkcodenameLike(String value) {
            addCriterion("CALLWORKCODENAME like", value, "callworkcodename");
            return (Criteria) this;
        }

        public Criteria andCallworkcodenameNotLike(String value) {
            addCriterion("CALLWORKCODENAME not like", value, "callworkcodename");
            return (Criteria) this;
        }

        public Criteria andCallworkcodenameIn(List<String> values) {
            addCriterion("CALLWORKCODENAME in", values, "callworkcodename");
            return (Criteria) this;
        }

        public Criteria andCallworkcodenameNotIn(List<String> values) {
            addCriterion("CALLWORKCODENAME not in", values, "callworkcodename");
            return (Criteria) this;
        }

        public Criteria andCallworkcodenameBetween(String value1, String value2) {
            addCriterion("CALLWORKCODENAME between", value1, value2, "callworkcodename");
            return (Criteria) this;
        }

        public Criteria andCallworkcodenameNotBetween(String value1, String value2) {
            addCriterion("CALLWORKCODENAME not between", value1, value2, "callworkcodename");
            return (Criteria) this;
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