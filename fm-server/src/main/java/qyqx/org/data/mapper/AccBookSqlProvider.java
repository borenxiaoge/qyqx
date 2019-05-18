package qyqx.org.data.mapper;

import qyqx.org.data.po.AccBook;
import qyqx.org.data.po.AccBookExample;
import qyqx.org.data.po.AccBookExample.Criteria;
import qyqx.org.data.po.AccBookExample.Criterion;

import java.util.List;
import java.util.Map;

import static org.apache.ibatis.jdbc.SqlBuilder.*;

public class AccBookSqlProvider {

    public String countByExample(AccBookExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("acc_book");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(AccBookExample example) {
        BEGIN();
        DELETE_FROM("acc_book");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(AccBook record) {
        BEGIN();
        INSERT_INTO("acc_book");
        
        if (record.getAccBookId() != null) {
            VALUES("acc_book_id", "#{accBookId,jdbcType=VARCHAR}");
        }
        
        if (record.getAccBookName() != null) {
            VALUES("acc_book_name", "#{accBookName,jdbcType=VARCHAR}");
        }
        
        if (record.getOpenId() != null) {
            VALUES("open_id", "#{openId,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            VALUES("user_id", "#{userId,jdbcType=VARCHAR}");
        }
        
        if (record.getLastUpTime() != null) {
            VALUES("last_up_time", "#{lastUpTime,jdbcType=TIMESTAMP}");
        }
        
        return SQL();
    }

    public String selectByExample(AccBookExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("acc_book_id");
        } else {
            SELECT("acc_book_id");
        }
        SELECT("acc_book_name");
        SELECT("open_id");
        SELECT("user_id");
        SELECT("last_up_time");
        FROM("acc_book");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        AccBook record = (AccBook) parameter.get("record");
        AccBookExample example = (AccBookExample) parameter.get("example");
        
        BEGIN();
        UPDATE("acc_book");
        
        if (record.getAccBookId() != null) {
            SET("acc_book_id = #{record.accBookId,jdbcType=VARCHAR}");
        }
        
        if (record.getAccBookName() != null) {
            SET("acc_book_name = #{record.accBookName,jdbcType=VARCHAR}");
        }
        
        if (record.getOpenId() != null) {
            SET("open_id = #{record.openId,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            SET("user_id = #{record.userId,jdbcType=VARCHAR}");
        }
        
        if (record.getLastUpTime() != null) {
            SET("last_up_time = #{record.lastUpTime,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("acc_book");
        
        SET("acc_book_id = #{record.accBookId,jdbcType=VARCHAR}");
        SET("acc_book_name = #{record.accBookName,jdbcType=VARCHAR}");
        SET("open_id = #{record.openId,jdbcType=VARCHAR}");
        SET("user_id = #{record.userId,jdbcType=VARCHAR}");
        SET("last_up_time = #{record.lastUpTime,jdbcType=TIMESTAMP}");
        
        AccBookExample example = (AccBookExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(AccBook record) {
        BEGIN();
        UPDATE("acc_book");
        
        if (record.getAccBookName() != null) {
            SET("acc_book_name = #{accBookName,jdbcType=VARCHAR}");
        }
        
        if (record.getOpenId() != null) {
            SET("open_id = #{openId,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            SET("user_id = #{userId,jdbcType=VARCHAR}");
        }
        
        if (record.getLastUpTime() != null) {
            SET("last_up_time = #{lastUpTime,jdbcType=TIMESTAMP}");
        }
        
        WHERE("acc_book_id = #{accBookId,jdbcType=VARCHAR}");
        
        return SQL();
    }

    protected void applyWhere(AccBookExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            WHERE(sb.toString());
        }
    }
}