package cn.edu.hist.mapper;

import cn.edu.hist.model.Sysrolemodule;
import org.apache.ibatis.annotations.Param;

public interface SysrolemoduleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysrolemodule
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(@Param("roleid") String roleid, @Param("moduleid") String moduleid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysrolemodule
     *
     * @mbggenerated
     */
    int insert(Sysrolemodule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysrolemodule
     *
     * @mbggenerated
     */
    int insertSelective(Sysrolemodule record);
}