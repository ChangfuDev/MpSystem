package cn.edu.hist.mapper;

import cn.edu.hist.model.BssSysDeploynode;

public interface BssSysDeploynodeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bss_sys_deploynode
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String nodeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bss_sys_deploynode
     *
     * @mbggenerated
     */
    int insert(BssSysDeploynode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bss_sys_deploynode
     *
     * @mbggenerated
     */
    int insertSelective(BssSysDeploynode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bss_sys_deploynode
     *
     * @mbggenerated
     */
    BssSysDeploynode selectByPrimaryKey(String nodeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bss_sys_deploynode
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(BssSysDeploynode record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bss_sys_deploynode
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(BssSysDeploynode record);
}