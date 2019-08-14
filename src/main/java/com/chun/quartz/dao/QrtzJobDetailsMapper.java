package com.chun.quartz.dao;

import com.chun.quartz.model.QrtzJobDetails;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QrtzJobDetailsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_job_details
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("schedName") String schedName, @Param("jobName") String jobName, @Param("jobGroup") String jobGroup);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_job_details
     *
     * @mbg.generated
     */
    int insert(QrtzJobDetails record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_job_details
     *
     * @mbg.generated
     */
    QrtzJobDetails selectByPrimaryKey(@Param("schedName") String schedName, @Param("jobName") String jobName, @Param("jobGroup") String jobGroup);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_job_details
     *
     * @mbg.generated
     */
    List<QrtzJobDetails> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_job_details
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(QrtzJobDetails record);
}