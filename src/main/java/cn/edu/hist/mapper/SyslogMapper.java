package cn.edu.hist.mapper;

import cn.edu.hist.model.Syslog;

public interface SyslogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table syslog
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table syslog
     *
     * @mbggenerated
     */
    int insert(Syslog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table syslog
     *
     * @mbggenerated
     */
    int insertSelective(Syslog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table syslog
     *
     * @mbggenerated
     */
    Syslog selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table syslog
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Syslog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table syslog
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Syslog record);
}