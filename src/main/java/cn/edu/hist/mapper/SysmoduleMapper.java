package cn.edu.hist.mapper;

import cn.edu.hist.model.Sysmodule;

public interface SysmoduleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysmodule
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String moduleid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysmodule
     *
     * @mbggenerated
     */
    int insert(Sysmodule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysmodule
     *
     * @mbggenerated
     */
    int insertSelective(Sysmodule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysmodule
     *
     * @mbggenerated
     */
    Sysmodule selectByPrimaryKey(String moduleid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysmodule
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Sysmodule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysmodule
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Sysmodule record);
}