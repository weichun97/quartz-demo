package com.chun.quartz.dao;

import com.chun.quartz.model.OperationLog;
import java.util.List;

public interface OperationLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_log
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_log
     *
     * @mbg.generated
     */
    int insert(OperationLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_log
     *
     * @mbg.generated
     */
    OperationLog selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_log
     *
     * @mbg.generated
     */
    List<OperationLog> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(OperationLog record);
}