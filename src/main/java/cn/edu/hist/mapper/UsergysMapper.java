package cn.edu.hist.mapper;

import cn.edu.hist.model.Usergys;

public interface UsergysMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usergys
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usergys
     *
     * @mbggenerated
     */
    int insert(Usergys record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usergys
     *
     * @mbggenerated
     */
    int insertSelective(Usergys record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usergys
     *
     * @mbggenerated
     */
    Usergys selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usergys
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Usergys record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usergys
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(Usergys record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usergys
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Usergys record);
}