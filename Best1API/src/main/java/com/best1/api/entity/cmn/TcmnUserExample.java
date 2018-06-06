package com.best1.api.entity.cmn;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TcmnUserExample {

    protected String orderByClause;

 
    protected boolean distinct;

   
    protected List<Criteria> oredCriteria;

    public TcmnUserExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("USERID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("USERID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Long value) {
            addCriterion("USERID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Long value) {
            addCriterion("USERID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Long value) {
            addCriterion("USERID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("USERID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Long value) {
            addCriterion("USERID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Long value) {
            addCriterion("USERID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Long> values) {
            addCriterion("USERID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Long> values) {
            addCriterion("USERID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Long value1, Long value2) {
            addCriterion("USERID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Long value1, Long value2) {
            addCriterion("USERID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("LOCATION is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("LOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(Integer value) {
            addCriterion("LOCATION =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(Integer value) {
            addCriterion("LOCATION <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(Integer value) {
            addCriterion("LOCATION >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(Integer value) {
            addCriterion("LOCATION >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(Integer value) {
            addCriterion("LOCATION <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(Integer value) {
            addCriterion("LOCATION <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<Integer> values) {
            addCriterion("LOCATION in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<Integer> values) {
            addCriterion("LOCATION not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(Integer value1, Integer value2) {
            addCriterion("LOCATION between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(Integer value1, Integer value2) {
            addCriterion("LOCATION not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andDefaultroleIsNull() {
            addCriterion("DEFAULTROLE is null");
            return (Criteria) this;
        }

        public Criteria andDefaultroleIsNotNull() {
            addCriterion("DEFAULTROLE is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultroleEqualTo(Long value) {
            addCriterion("DEFAULTROLE =", value, "defaultrole");
            return (Criteria) this;
        }

        public Criteria andDefaultroleNotEqualTo(Long value) {
            addCriterion("DEFAULTROLE <>", value, "defaultrole");
            return (Criteria) this;
        }

        public Criteria andDefaultroleGreaterThan(Long value) {
            addCriterion("DEFAULTROLE >", value, "defaultrole");
            return (Criteria) this;
        }

        public Criteria andDefaultroleGreaterThanOrEqualTo(Long value) {
            addCriterion("DEFAULTROLE >=", value, "defaultrole");
            return (Criteria) this;
        }

        public Criteria andDefaultroleLessThan(Long value) {
            addCriterion("DEFAULTROLE <", value, "defaultrole");
            return (Criteria) this;
        }

        public Criteria andDefaultroleLessThanOrEqualTo(Long value) {
            addCriterion("DEFAULTROLE <=", value, "defaultrole");
            return (Criteria) this;
        }

        public Criteria andDefaultroleIn(List<Long> values) {
            addCriterion("DEFAULTROLE in", values, "defaultrole");
            return (Criteria) this;
        }

        public Criteria andDefaultroleNotIn(List<Long> values) {
            addCriterion("DEFAULTROLE not in", values, "defaultrole");
            return (Criteria) this;
        }

        public Criteria andDefaultroleBetween(Long value1, Long value2) {
            addCriterion("DEFAULTROLE between", value1, value2, "defaultrole");
            return (Criteria) this;
        }

        public Criteria andDefaultroleNotBetween(Long value1, Long value2) {
            addCriterion("DEFAULTROLE not between", value1, value2, "defaultrole");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNull() {
            addCriterion("STARTDATE is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("STARTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(Date value) {
            addCriterion("STARTDATE =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(Date value) {
            addCriterion("STARTDATE <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(Date value) {
            addCriterion("STARTDATE >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("STARTDATE >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(Date value) {
            addCriterion("STARTDATE <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(Date value) {
            addCriterion("STARTDATE <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<Date> values) {
            addCriterion("STARTDATE in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<Date> values) {
            addCriterion("STARTDATE not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(Date value1, Date value2) {
            addCriterion("STARTDATE between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(Date value1, Date value2) {
            addCriterion("STARTDATE not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("ENDDATE is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("ENDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(Date value) {
            addCriterion("ENDDATE =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Date value) {
            addCriterion("ENDDATE <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Date value) {
            addCriterion("ENDDATE >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
            addCriterion("ENDDATE >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Date value) {
            addCriterion("ENDDATE <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Date value) {
            addCriterion("ENDDATE <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<Date> values) {
            addCriterion("ENDDATE in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<Date> values) {
            addCriterion("ENDDATE not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Date value1, Date value2) {
            addCriterion("ENDDATE between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Date value1, Date value2) {
            addCriterion("ENDDATE not between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("USERNAME =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("USERNAME <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("USERNAME >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("USERNAME >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("USERNAME <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("USERNAME <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("USERNAME like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("USERNAME not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("USERNAME in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("USERNAME not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("USERNAME between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("USERNAME not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andEmailidIsNull() {
            addCriterion("EMAILID is null");
            return (Criteria) this;
        }

        public Criteria andEmailidIsNotNull() {
            addCriterion("EMAILID is not null");
            return (Criteria) this;
        }

        public Criteria andEmailidEqualTo(String value) {
            addCriterion("EMAILID =", value, "emailid");
            return (Criteria) this;
        }

        public Criteria andEmailidNotEqualTo(String value) {
            addCriterion("EMAILID <>", value, "emailid");
            return (Criteria) this;
        }

        public Criteria andEmailidGreaterThan(String value) {
            addCriterion("EMAILID >", value, "emailid");
            return (Criteria) this;
        }

        public Criteria andEmailidGreaterThanOrEqualTo(String value) {
            addCriterion("EMAILID >=", value, "emailid");
            return (Criteria) this;
        }

        public Criteria andEmailidLessThan(String value) {
            addCriterion("EMAILID <", value, "emailid");
            return (Criteria) this;
        }

        public Criteria andEmailidLessThanOrEqualTo(String value) {
            addCriterion("EMAILID <=", value, "emailid");
            return (Criteria) this;
        }

        public Criteria andEmailidLike(String value) {
            addCriterion("EMAILID like", value, "emailid");
            return (Criteria) this;
        }

        public Criteria andEmailidNotLike(String value) {
            addCriterion("EMAILID not like", value, "emailid");
            return (Criteria) this;
        }

        public Criteria andEmailidIn(List<String> values) {
            addCriterion("EMAILID in", values, "emailid");
            return (Criteria) this;
        }

        public Criteria andEmailidNotIn(List<String> values) {
            addCriterion("EMAILID not in", values, "emailid");
            return (Criteria) this;
        }

        public Criteria andEmailidBetween(String value1, String value2) {
            addCriterion("EMAILID between", value1, value2, "emailid");
            return (Criteria) this;
        }

        public Criteria andEmailidNotBetween(String value1, String value2) {
            addCriterion("EMAILID not between", value1, value2, "emailid");
            return (Criteria) this;
        }

        public Criteria andUserloginidIsNull() {
            addCriterion("USERLOGINID is null");
            return (Criteria) this;
        }

        public Criteria andUserloginidIsNotNull() {
            addCriterion("USERLOGINID is not null");
            return (Criteria) this;
        }

        public Criteria andUserloginidEqualTo(String value) {
            addCriterion("USERLOGINID =", value, "userloginid");
            return (Criteria) this;
        }

        public Criteria andUserloginidNotEqualTo(String value) {
            addCriterion("USERLOGINID <>", value, "userloginid");
            return (Criteria) this;
        }

        public Criteria andUserloginidGreaterThan(String value) {
            addCriterion("USERLOGINID >", value, "userloginid");
            return (Criteria) this;
        }

        public Criteria andUserloginidGreaterThanOrEqualTo(String value) {
            addCriterion("USERLOGINID >=", value, "userloginid");
            return (Criteria) this;
        }

        public Criteria andUserloginidLessThan(String value) {
            addCriterion("USERLOGINID <", value, "userloginid");
            return (Criteria) this;
        }

        public Criteria andUserloginidLessThanOrEqualTo(String value) {
            addCriterion("USERLOGINID <=", value, "userloginid");
            return (Criteria) this;
        }

        public Criteria andUserloginidLike(String value) {
            addCriterion("USERLOGINID like", value, "userloginid");
            return (Criteria) this;
        }

        public Criteria andUserloginidNotLike(String value) {
            addCriterion("USERLOGINID not like", value, "userloginid");
            return (Criteria) this;
        }

        public Criteria andUserloginidIn(List<String> values) {
            addCriterion("USERLOGINID in", values, "userloginid");
            return (Criteria) this;
        }

        public Criteria andUserloginidNotIn(List<String> values) {
            addCriterion("USERLOGINID not in", values, "userloginid");
            return (Criteria) this;
        }

        public Criteria andUserloginidBetween(String value1, String value2) {
            addCriterion("USERLOGINID between", value1, value2, "userloginid");
            return (Criteria) this;
        }

        public Criteria andUserloginidNotBetween(String value1, String value2) {
            addCriterion("USERLOGINID not between", value1, value2, "userloginid");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andLastpasswordchangedateIsNull() {
            addCriterion("LASTPASSWORDCHANGEDATE is null");
            return (Criteria) this;
        }

        public Criteria andLastpasswordchangedateIsNotNull() {
            addCriterion("LASTPASSWORDCHANGEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastpasswordchangedateEqualTo(Date value) {
            addCriterion("LASTPASSWORDCHANGEDATE =", value, "lastpasswordchangedate");
            return (Criteria) this;
        }

        public Criteria andLastpasswordchangedateNotEqualTo(Date value) {
            addCriterion("LASTPASSWORDCHANGEDATE <>", value, "lastpasswordchangedate");
            return (Criteria) this;
        }

        public Criteria andLastpasswordchangedateGreaterThan(Date value) {
            addCriterion("LASTPASSWORDCHANGEDATE >", value, "lastpasswordchangedate");
            return (Criteria) this;
        }

        public Criteria andLastpasswordchangedateGreaterThanOrEqualTo(Date value) {
            addCriterion("LASTPASSWORDCHANGEDATE >=", value, "lastpasswordchangedate");
            return (Criteria) this;
        }

        public Criteria andLastpasswordchangedateLessThan(Date value) {
            addCriterion("LASTPASSWORDCHANGEDATE <", value, "lastpasswordchangedate");
            return (Criteria) this;
        }

        public Criteria andLastpasswordchangedateLessThanOrEqualTo(Date value) {
            addCriterion("LASTPASSWORDCHANGEDATE <=", value, "lastpasswordchangedate");
            return (Criteria) this;
        }

        public Criteria andLastpasswordchangedateIn(List<Date> values) {
            addCriterion("LASTPASSWORDCHANGEDATE in", values, "lastpasswordchangedate");
            return (Criteria) this;
        }

        public Criteria andLastpasswordchangedateNotIn(List<Date> values) {
            addCriterion("LASTPASSWORDCHANGEDATE not in", values, "lastpasswordchangedate");
            return (Criteria) this;
        }

        public Criteria andLastpasswordchangedateBetween(Date value1, Date value2) {
            addCriterion("LASTPASSWORDCHANGEDATE between", value1, value2, "lastpasswordchangedate");
            return (Criteria) this;
        }

        public Criteria andLastpasswordchangedateNotBetween(Date value1, Date value2) {
            addCriterion("LASTPASSWORDCHANGEDATE not between", value1, value2, "lastpasswordchangedate");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIsNull() {
            addCriterion("DEPARTMENTID is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIsNotNull() {
            addCriterion("DEPARTMENTID is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidEqualTo(Long value) {
            addCriterion("DEPARTMENTID =", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotEqualTo(Long value) {
            addCriterion("DEPARTMENTID <>", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThan(Long value) {
            addCriterion("DEPARTMENTID >", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThanOrEqualTo(Long value) {
            addCriterion("DEPARTMENTID >=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThan(Long value) {
            addCriterion("DEPARTMENTID <", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThanOrEqualTo(Long value) {
            addCriterion("DEPARTMENTID <=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIn(List<Long> values) {
            addCriterion("DEPARTMENTID in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotIn(List<Long> values) {
            addCriterion("DEPARTMENTID not in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidBetween(Long value1, Long value2) {
            addCriterion("DEPARTMENTID between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotBetween(Long value1, Long value2) {
            addCriterion("DEPARTMENTID not between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDesignationidIsNull() {
            addCriterion("DESIGNATIONID is null");
            return (Criteria) this;
        }

        public Criteria andDesignationidIsNotNull() {
            addCriterion("DESIGNATIONID is not null");
            return (Criteria) this;
        }

        public Criteria andDesignationidEqualTo(Long value) {
            addCriterion("DESIGNATIONID =", value, "designationid");
            return (Criteria) this;
        }

        public Criteria andDesignationidNotEqualTo(Long value) {
            addCriterion("DESIGNATIONID <>", value, "designationid");
            return (Criteria) this;
        }

        public Criteria andDesignationidGreaterThan(Long value) {
            addCriterion("DESIGNATIONID >", value, "designationid");
            return (Criteria) this;
        }

        public Criteria andDesignationidGreaterThanOrEqualTo(Long value) {
            addCriterion("DESIGNATIONID >=", value, "designationid");
            return (Criteria) this;
        }

        public Criteria andDesignationidLessThan(Long value) {
            addCriterion("DESIGNATIONID <", value, "designationid");
            return (Criteria) this;
        }

        public Criteria andDesignationidLessThanOrEqualTo(Long value) {
            addCriterion("DESIGNATIONID <=", value, "designationid");
            return (Criteria) this;
        }

        public Criteria andDesignationidIn(List<Long> values) {
            addCriterion("DESIGNATIONID in", values, "designationid");
            return (Criteria) this;
        }

        public Criteria andDesignationidNotIn(List<Long> values) {
            addCriterion("DESIGNATIONID not in", values, "designationid");
            return (Criteria) this;
        }

        public Criteria andDesignationidBetween(Long value1, Long value2) {
            addCriterion("DESIGNATIONID between", value1, value2, "designationid");
            return (Criteria) this;
        }

        public Criteria andDesignationidNotBetween(Long value1, Long value2) {
            addCriterion("DESIGNATIONID not between", value1, value2, "designationid");
            return (Criteria) this;
        }

        public Criteria andMobilenoIsNull() {
            addCriterion("MOBILENO is null");
            return (Criteria) this;
        }

        public Criteria andMobilenoIsNotNull() {
            addCriterion("MOBILENO is not null");
            return (Criteria) this;
        }

        public Criteria andMobilenoEqualTo(String value) {
            addCriterion("MOBILENO =", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoNotEqualTo(String value) {
            addCriterion("MOBILENO <>", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoGreaterThan(String value) {
            addCriterion("MOBILENO >", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILENO >=", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoLessThan(String value) {
            addCriterion("MOBILENO <", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoLessThanOrEqualTo(String value) {
            addCriterion("MOBILENO <=", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoLike(String value) {
            addCriterion("MOBILENO like", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoNotLike(String value) {
            addCriterion("MOBILENO not like", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoIn(List<String> values) {
            addCriterion("MOBILENO in", values, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoNotIn(List<String> values) {
            addCriterion("MOBILENO not in", values, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoBetween(String value1, String value2) {
            addCriterion("MOBILENO between", value1, value2, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoNotBetween(String value1, String value2) {
            addCriterion("MOBILENO not between", value1, value2, "mobileno");
            return (Criteria) this;
        }

        public Criteria andCommunicationmethodIsNull() {
            addCriterion("COMMUNICATIONMETHOD is null");
            return (Criteria) this;
        }

        public Criteria andCommunicationmethodIsNotNull() {
            addCriterion("COMMUNICATIONMETHOD is not null");
            return (Criteria) this;
        }

        public Criteria andCommunicationmethodEqualTo(Integer value) {
            addCriterion("COMMUNICATIONMETHOD =", value, "communicationmethod");
            return (Criteria) this;
        }

        public Criteria andCommunicationmethodNotEqualTo(Integer value) {
            addCriterion("COMMUNICATIONMETHOD <>", value, "communicationmethod");
            return (Criteria) this;
        }

        public Criteria andCommunicationmethodGreaterThan(Integer value) {
            addCriterion("COMMUNICATIONMETHOD >", value, "communicationmethod");
            return (Criteria) this;
        }

        public Criteria andCommunicationmethodGreaterThanOrEqualTo(Integer value) {
            addCriterion("COMMUNICATIONMETHOD >=", value, "communicationmethod");
            return (Criteria) this;
        }

        public Criteria andCommunicationmethodLessThan(Integer value) {
            addCriterion("COMMUNICATIONMETHOD <", value, "communicationmethod");
            return (Criteria) this;
        }

        public Criteria andCommunicationmethodLessThanOrEqualTo(Integer value) {
            addCriterion("COMMUNICATIONMETHOD <=", value, "communicationmethod");
            return (Criteria) this;
        }

        public Criteria andCommunicationmethodIn(List<Integer> values) {
            addCriterion("COMMUNICATIONMETHOD in", values, "communicationmethod");
            return (Criteria) this;
        }

        public Criteria andCommunicationmethodNotIn(List<Integer> values) {
            addCriterion("COMMUNICATIONMETHOD not in", values, "communicationmethod");
            return (Criteria) this;
        }

        public Criteria andCommunicationmethodBetween(Integer value1, Integer value2) {
            addCriterion("COMMUNICATIONMETHOD between", value1, value2, "communicationmethod");
            return (Criteria) this;
        }

        public Criteria andCommunicationmethodNotBetween(Integer value1, Integer value2) {
            addCriterion("COMMUNICATIONMETHOD not between", value1, value2, "communicationmethod");
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