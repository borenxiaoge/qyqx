package qyqx.org.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccBookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccBookExample() {
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

        public Criteria andAccBookIdIsNull() {
            addCriterion("acc_book_id is null");
            return (Criteria) this;
        }

        public Criteria andAccBookIdIsNotNull() {
            addCriterion("acc_book_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccBookIdEqualTo(String value) {
            addCriterion("acc_book_id =", value, "accBookId");
            return (Criteria) this;
        }

        public Criteria andAccBookIdNotEqualTo(String value) {
            addCriterion("acc_book_id <>", value, "accBookId");
            return (Criteria) this;
        }

        public Criteria andAccBookIdGreaterThan(String value) {
            addCriterion("acc_book_id >", value, "accBookId");
            return (Criteria) this;
        }

        public Criteria andAccBookIdGreaterThanOrEqualTo(String value) {
            addCriterion("acc_book_id >=", value, "accBookId");
            return (Criteria) this;
        }

        public Criteria andAccBookIdLessThan(String value) {
            addCriterion("acc_book_id <", value, "accBookId");
            return (Criteria) this;
        }

        public Criteria andAccBookIdLessThanOrEqualTo(String value) {
            addCriterion("acc_book_id <=", value, "accBookId");
            return (Criteria) this;
        }

        public Criteria andAccBookIdLike(String value) {
            addCriterion("acc_book_id like", value, "accBookId");
            return (Criteria) this;
        }

        public Criteria andAccBookIdNotLike(String value) {
            addCriterion("acc_book_id not like", value, "accBookId");
            return (Criteria) this;
        }

        public Criteria andAccBookIdIn(List<String> values) {
            addCriterion("acc_book_id in", values, "accBookId");
            return (Criteria) this;
        }

        public Criteria andAccBookIdNotIn(List<String> values) {
            addCriterion("acc_book_id not in", values, "accBookId");
            return (Criteria) this;
        }

        public Criteria andAccBookIdBetween(String value1, String value2) {
            addCriterion("acc_book_id between", value1, value2, "accBookId");
            return (Criteria) this;
        }

        public Criteria andAccBookIdNotBetween(String value1, String value2) {
            addCriterion("acc_book_id not between", value1, value2, "accBookId");
            return (Criteria) this;
        }

        public Criteria andAccBookNameIsNull() {
            addCriterion("acc_book_name is null");
            return (Criteria) this;
        }

        public Criteria andAccBookNameIsNotNull() {
            addCriterion("acc_book_name is not null");
            return (Criteria) this;
        }

        public Criteria andAccBookNameEqualTo(String value) {
            addCriterion("acc_book_name =", value, "accBookName");
            return (Criteria) this;
        }

        public Criteria andAccBookNameNotEqualTo(String value) {
            addCriterion("acc_book_name <>", value, "accBookName");
            return (Criteria) this;
        }

        public Criteria andAccBookNameGreaterThan(String value) {
            addCriterion("acc_book_name >", value, "accBookName");
            return (Criteria) this;
        }

        public Criteria andAccBookNameGreaterThanOrEqualTo(String value) {
            addCriterion("acc_book_name >=", value, "accBookName");
            return (Criteria) this;
        }

        public Criteria andAccBookNameLessThan(String value) {
            addCriterion("acc_book_name <", value, "accBookName");
            return (Criteria) this;
        }

        public Criteria andAccBookNameLessThanOrEqualTo(String value) {
            addCriterion("acc_book_name <=", value, "accBookName");
            return (Criteria) this;
        }

        public Criteria andAccBookNameLike(String value) {
            addCriterion("acc_book_name like", value, "accBookName");
            return (Criteria) this;
        }

        public Criteria andAccBookNameNotLike(String value) {
            addCriterion("acc_book_name not like", value, "accBookName");
            return (Criteria) this;
        }

        public Criteria andAccBookNameIn(List<String> values) {
            addCriterion("acc_book_name in", values, "accBookName");
            return (Criteria) this;
        }

        public Criteria andAccBookNameNotIn(List<String> values) {
            addCriterion("acc_book_name not in", values, "accBookName");
            return (Criteria) this;
        }

        public Criteria andAccBookNameBetween(String value1, String value2) {
            addCriterion("acc_book_name between", value1, value2, "accBookName");
            return (Criteria) this;
        }

        public Criteria andAccBookNameNotBetween(String value1, String value2) {
            addCriterion("acc_book_name not between", value1, value2, "accBookName");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNull() {
            addCriterion("open_id is null");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNotNull() {
            addCriterion("open_id is not null");
            return (Criteria) this;
        }

        public Criteria andOpenIdEqualTo(String value) {
            addCriterion("open_id =", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotEqualTo(String value) {
            addCriterion("open_id <>", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThan(String value) {
            addCriterion("open_id >", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("open_id >=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThan(String value) {
            addCriterion("open_id <", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThanOrEqualTo(String value) {
            addCriterion("open_id <=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLike(String value) {
            addCriterion("open_id like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotLike(String value) {
            addCriterion("open_id not like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdIn(List<String> values) {
            addCriterion("open_id in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotIn(List<String> values) {
            addCriterion("open_id not in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdBetween(String value1, String value2) {
            addCriterion("open_id between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotBetween(String value1, String value2) {
            addCriterion("open_id not between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andLastUpTimeIsNull() {
            addCriterion("last_up_time is null");
            return (Criteria) this;
        }

        public Criteria andLastUpTimeIsNotNull() {
            addCriterion("last_up_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpTimeEqualTo(Date value) {
            addCriterion("last_up_time =", value, "lastUpTime");
            return (Criteria) this;
        }

        public Criteria andLastUpTimeNotEqualTo(Date value) {
            addCriterion("last_up_time <>", value, "lastUpTime");
            return (Criteria) this;
        }

        public Criteria andLastUpTimeGreaterThan(Date value) {
            addCriterion("last_up_time >", value, "lastUpTime");
            return (Criteria) this;
        }

        public Criteria andLastUpTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_up_time >=", value, "lastUpTime");
            return (Criteria) this;
        }

        public Criteria andLastUpTimeLessThan(Date value) {
            addCriterion("last_up_time <", value, "lastUpTime");
            return (Criteria) this;
        }

        public Criteria andLastUpTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_up_time <=", value, "lastUpTime");
            return (Criteria) this;
        }

        public Criteria andLastUpTimeIn(List<Date> values) {
            addCriterion("last_up_time in", values, "lastUpTime");
            return (Criteria) this;
        }

        public Criteria andLastUpTimeNotIn(List<Date> values) {
            addCriterion("last_up_time not in", values, "lastUpTime");
            return (Criteria) this;
        }

        public Criteria andLastUpTimeBetween(Date value1, Date value2) {
            addCriterion("last_up_time between", value1, value2, "lastUpTime");
            return (Criteria) this;
        }

        public Criteria andLastUpTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_up_time not between", value1, value2, "lastUpTime");
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