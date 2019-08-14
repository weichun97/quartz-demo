package com.chun.quartz.dao;

import com.chun.quartz.model.QrtzBlobTriggers;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QrtzBlobTriggersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_blob_triggers
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("schedName") String schedName, @Param("triggerName") String triggerName, @Param("triggerGroup") String triggerGroup);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_blob_triggers
     *
     * @mbg.generated
     */
    int insert(QrtzBlobTriggers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_blob_triggers
     *
     * @mbg.generated
     */
    QrtzBlobTriggers selectByPrimaryKey(@Param("schedName") String schedName, @Param("triggerName") String triggerName, @Param("triggerGroup") String triggerGroup);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_blob_triggers
     *
     * @mbg.generated
     */
    List<QrtzBlobTriggers> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_blob_triggers
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(QrtzBlobTriggers record);
}