package qyqx.org.data.mapper;

import qyqx.org.data.po.AccType;
import qyqx.org.data.po.AccTypeExample;
import qyqx.org.data.po.AccTypeExample.Criteria;
import qyqx.org.data.po.AccTypeExample.Criterion;

import java.util.List;
import java.util.Map;

import static org.apache.ibatis.jdbc.SqlBuilder.*;

public class AccTypeSqlProvider {

    public String countByExample(AccTypeExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("acc_type");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(AccTypeExample example) {
        BEGIN();
        DELETE_FROM("acc_type");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(AccType record) {
        BEGIN();
        INSERT_INTO("acc_type");
        
        if (record.getAccTypeId() != null) {
            VALUES("acc_type_id", "#{accTypeId,jdbcType=VARCHAR}");
        }
        
        if (record.getAccTypeName() != null) {
            VALUES("acc_type_name", "#{accTypeName,jdbcType=VARCHAR}");
        }
        
        if (record.getTrdType() != null) {
            VALUES("trd_type", "#{trdType,jdbcType=INTEGER}");
        }
        
        if (record.getAccBookId() != null) {
            VALUES("acc_book_id", "#{accBookId,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            VALUES("user_id", "#{userId,jdbcType=VARCHAR}");
        }
        
        if (record.getDiyFlag() != null) {
            VALUES("diy_flag", "#{diyFlag,jdbcType=CHAR}");
        }
        
        if (record.getIconPath() != null) {
            VALUES("icon_path", "#{iconPath,jdbcType=VARCHAR}");
        }
        
        if (record.getLastUpTime() != null) {
            VALUES("last_up_time", "#{lastUpTime,jdbcType=TIMESTAMP}");
        }
        
        return SQL();
    }

    public String selectByExample(AccTypeExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("acc_type_id");
        } else {
            SELECT("acc_type_id");
        }
        SELECT("acc_type_name");
        SELECT("trd_type");
        SELECT("acc_book_id");
        SELECT("user_id");
        SELECT("diy_flag");
        SELECT("icon_path");
        SELECT("last_up_time");
        FROM("acc_type");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        AccType record = (AccType) parameter.get("record");
        AccTypeExample example = (AccTypeExample) parameter.get("example");
        
        BEGIN();
        UPDATE("acc_type");
        
        if (record.getAccTypeId() != null) {
            SET("acc_type_id = #{record.accTypeId,jdbcType=VARCHAR}");
        }
        
        if (record.getAccTypeName() != null) {
            SET("acc_type_name = #{record.accTypeName,jdbcType=VARCHAR}");
        }
        
        if (record.getTrdType() != null) {
            SET("trd_type = #{record.trdType,jdbcType=INTEGER}");
        }
        
        if (record.getAccBookId() != null) {
            SET("acc_book_id = #{record.accBookId,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            SET("user_id = #{record.userId,jdbcType=VARCHAR}");
        }
        
        if (record.getDiyFlag() != null) {
            SET("diy_flag = #{record.diyFlag,jdbcType=CHAR}");
        }
        
        if (record.getIconPath() != null) {
            SET("icon_path = #{record.iconPath,jdbcType=VARCHAR}");
        }
        
        if (record.getLastUpTime() != null) {
            SET("last_up_time = #{record.lastUpTime,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("acc_type");
        
        SET("acc_type_id = #{record.accTypeId,jdbcType=VARCHAR}");
        SET("acc_type_name = #{record.accTypeName,jdbcType=VARCHAR}");
        SET("trd_type = #{record.trdType,jdbcType=INTEGER}");
        SET("acc_book_id = #{record.accBookId,jdbcType=VARCHAR}");
        SET("user_id = #{record.userId,jdbcType=VARCHAR}");
        SET("diy_flag = #{record.diyFlag,jdbcType=CHAR}");
        SET("icon_path = #{record.iconPath,jdbcType=VARCHAR}");
        SET("last_up_time = #{record.lastUpTime,jdbcType=TIMESTAMP}");
        
        AccTypeExample example = (AccTypeExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(AccType record) {
        BEGIN();
        UPDATE("acc_type");
        
        if (record.getAccTypeName() != null) {
            SET("acc_type_name = #{accTypeName,jdbcType=VARCHAR}");
        }
        
        if (record.getTrdType() != null) {
            SET("trd_type = #{trdType,jdbcType=INTEGER}");
        }
        
        if (record.getAccBookId() != null) {
            SET("acc_book_id = #{accBookId,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            SET("user_id = #{userId,jdbcType=VARCHAR}");
        }
        
        if (record.getDiyFlag() != null) {
            SET("diy_flag = #{diyFlag,jdbcType=CHAR}");
        }
        
        if (record.getIconPath() != null) {
            SET("icon_path = #{iconPath,jdbcType=VARCHAR}");
        }
        
        if (record.getLastUpTime() != null) {
            SET("last_up_time = #{lastUpTime,jdbcType=TIMESTAMP}");
        }
        
        WHERE("acc_type_id = #{accTypeId,jdbcType=VARCHAR}");
        
        return SQL();
    }

    protected void applyWhere(AccTypeExample example, boolean includeExamplePhrase) {
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