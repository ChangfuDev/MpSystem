package cn.edu.hist.mapper;

import cn.edu.hist.model.Useryy;

public interface UseryyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table useryy
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table useryy
     *
     * @mbggenerated
     */
    int insert(Useryy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table useryy
     *
     * @mbggenerated
     */
    int insertSelective(Useryy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table useryy
     *
     * @mbggenerated
     */
    Useryy selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table useryy
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Useryy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table useryy
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Useryy record);
}