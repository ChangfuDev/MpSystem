package cn.edu.hist.mapper;

import cn.edu.hist.model.Yyypml;

public interface YyypmlMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyypml
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyypml
     *
     * @mbggenerated
     */
    int insert(Yyypml record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyypml
     *
     * @mbggenerated
     */
    int insertSelective(Yyypml record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyypml
     *
     * @mbggenerated
     */
    Yyypml selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyypml
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Yyypml record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyypml
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Yyypml record);
}