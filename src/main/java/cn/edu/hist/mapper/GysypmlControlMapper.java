package cn.edu.hist.mapper;

import cn.edu.hist.model.GysypmlControl;

public interface GysypmlControlMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gysypml_control
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gysypml_control
     *
     * @mbggenerated
     */
    int insert(GysypmlControl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gysypml_control
     *
     * @mbggenerated
     */
    int insertSelective(GysypmlControl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gysypml_control
     *
     * @mbggenerated
     */
    GysypmlControl selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gysypml_control
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(GysypmlControl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gysypml_control
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(GysypmlControl record);
}