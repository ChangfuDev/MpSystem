package cn.edu.hist.mapper;

import cn.edu.hist.model.Sysuser;

public interface SysuserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysuser
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysuser
     *
     * @mbggenerated
     */
    int insert(Sysuser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysuser
     *
     * @mbggenerated
     */
    int insertSelective(Sysuser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysuser
     *
     * @mbggenerated
     */
    Sysuser selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysuser
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Sysuser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysuser
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Sysuser record);
}