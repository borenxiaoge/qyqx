package qyqx.org.data.mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import qyqx.org.data.po.AccType;
import qyqx.org.data.po.AccTypeExample;

import java.util.List;

public interface AccTypeMapper {
    @SelectProvider(type=AccTypeSqlProvider.class, method="countByExample")
    int countByExample(AccTypeExample example);

    @DeleteProvider(type=AccTypeSqlProvider.class, method="deleteByExample")
    int deleteByExample(AccTypeExample example);

    @Delete({
        "delete from acc_type",
        "where acc_type_id = #{accTypeId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String accTypeId);

    @Insert({
        "insert into acc_type (acc_type_id, acc_type_name, ",
        "trd_type, acc_book_id, ",
        "user_id, diy_flag, icon_path, ",
        "last_up_time)",
        "values (#{accTypeId,jdbcType=VARCHAR}, #{accTypeName,jdbcType=VARCHAR}, ",
        "#{trdType,jdbcType=INTEGER}, #{accBookId,jdbcType=VARCHAR}, ",
        "#{userId,jdbcType=VARCHAR}, #{diyFlag,jdbcType=CHAR}, #{iconPath,jdbcType=VARCHAR}, ",
        "#{lastUpTime,jdbcType=TIMESTAMP})"
    })
    int insert(AccType record);

    @InsertProvider(type=AccTypeSqlProvider.class, method="insertSelective")
    int insertSelective(AccType record);

    @SelectProvider(type=AccTypeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="acc_type_id", property="accTypeId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="acc_type_name", property="accTypeName", jdbcType=JdbcType.VARCHAR),
        @Result(column="trd_type", property="trdType", jdbcType=JdbcType.INTEGER),
        @Result(column="acc_book_id", property="accBookId", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="diy_flag", property="diyFlag", jdbcType=JdbcType.CHAR),
        @Result(column="icon_path", property="iconPath", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_up_time", property="lastUpTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<AccType> selectByExample(AccTypeExample example);

    @Select({
        "select",
        "acc_type_id, acc_type_name, trd_type, acc_book_id, user_id, diy_flag, icon_path, ",
        "last_up_time",
        "from acc_type",
        "where acc_type_id = #{accTypeId,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="acc_type_id", property="accTypeId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="acc_type_name", property="accTypeName", jdbcType=JdbcType.VARCHAR),
        @Result(column="trd_type", property="trdType", jdbcType=JdbcType.INTEGER),
        @Result(column="acc_book_id", property="accBookId", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="diy_flag", property="diyFlag", jdbcType=JdbcType.CHAR),
        @Result(column="icon_path", property="iconPath", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_up_time", property="lastUpTime", jdbcType=JdbcType.TIMESTAMP)
    })
    AccType selectByPrimaryKey(String accTypeId);

    @UpdateProvider(type=AccTypeSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") AccType record, @Param("example") AccTypeExample example);

    @UpdateProvider(type=AccTypeSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") AccType record, @Param("example") AccTypeExample example);

    @UpdateProvider(type=AccTypeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(AccType record);

    @Update({
        "update acc_type",
        "set acc_type_name = #{accTypeName,jdbcType=VARCHAR},",
          "trd_type = #{trdType,jdbcType=INTEGER},",
          "acc_book_id = #{accBookId,jdbcType=VARCHAR},",
          "user_id = #{userId,jdbcType=VARCHAR},",
          "diy_flag = #{diyFlag,jdbcType=CHAR},",
          "icon_path = #{iconPath,jdbcType=VARCHAR},",
          "last_up_time = #{lastUpTime,jdbcType=TIMESTAMP}",
        "where acc_type_id = #{accTypeId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(AccType record);
}