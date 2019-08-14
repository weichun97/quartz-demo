package com.chun.quartz.model;

import java.io.Serializable;

public class QrtzCronTriggers implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column qrtz_cron_triggers.SCHED_NAME
     *
     * @mbg.generated
     */
    private String schedName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column qrtz_cron_triggers.TRIGGER_NAME
     *
     * @mbg.generated
     */
    private String triggerName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column qrtz_cron_triggers.TRIGGER_GROUP
     *
     * @mbg.generated
     */
    private String triggerGroup;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column qrtz_cron_triggers.CRON_EXPRESSION
     *
     * @mbg.generated
     */
    private String cronExpression;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column qrtz_cron_triggers.TIME_ZONE_ID
     *
     * @mbg.generated
     */
    private String timeZoneId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table qrtz_cron_triggers
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column qrtz_cron_triggers.SCHED_NAME
     *
     * @return the value of qrtz_cron_triggers.SCHED_NAME
     *
     * @mbg.generated
     */
    public String getSchedName() {
        return schedName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column qrtz_cron_triggers.SCHED_NAME
     *
     * @param schedName the value for qrtz_cron_triggers.SCHED_NAME
     *
     * @mbg.generated
     */
    public void setSchedName(String schedName) {
        this.schedName = schedName == null ? null : schedName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column qrtz_cron_triggers.TRIGGER_NAME
     *
     * @return the value of qrtz_cron_triggers.TRIGGER_NAME
     *
     * @mbg.generated
     */
    public String getTriggerName() {
        return triggerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column qrtz_cron_triggers.TRIGGER_NAME
     *
     * @param triggerName the value for qrtz_cron_triggers.TRIGGER_NAME
     *
     * @mbg.generated
     */
    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName == null ? null : triggerName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column qrtz_cron_triggers.TRIGGER_GROUP
     *
     * @return the value of qrtz_cron_triggers.TRIGGER_GROUP
     *
     * @mbg.generated
     */
    public String getTriggerGroup() {
        return triggerGroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column qrtz_cron_triggers.TRIGGER_GROUP
     *
     * @param triggerGroup the value for qrtz_cron_triggers.TRIGGER_GROUP
     *
     * @mbg.generated
     */
    public void setTriggerGroup(String triggerGroup) {
        this.triggerGroup = triggerGroup == null ? null : triggerGroup.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column qrtz_cron_triggers.CRON_EXPRESSION
     *
     * @return the value of qrtz_cron_triggers.CRON_EXPRESSION
     *
     * @mbg.generated
     */
    public String getCronExpression() {
        return cronExpression;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column qrtz_cron_triggers.CRON_EXPRESSION
     *
     * @param cronExpression the value for qrtz_cron_triggers.CRON_EXPRESSION
     *
     * @mbg.generated
     */
    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression == null ? null : cronExpression.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column qrtz_cron_triggers.TIME_ZONE_ID
     *
     * @return the value of qrtz_cron_triggers.TIME_ZONE_ID
     *
     * @mbg.generated
     */
    public String getTimeZoneId() {
        return timeZoneId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column qrtz_cron_triggers.TIME_ZONE_ID
     *
     * @param timeZoneId the value for qrtz_cron_triggers.TIME_ZONE_ID
     *
     * @mbg.generated
     */
    public void setTimeZoneId(String timeZoneId) {
        this.timeZoneId = timeZoneId == null ? null : timeZoneId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_cron_triggers
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", schedName=").append(schedName);
        sb.append(", triggerName=").append(triggerName);
        sb.append(", triggerGroup=").append(triggerGroup);
        sb.append(", cronExpression=").append(cronExpression);
        sb.append(", timeZoneId=").append(timeZoneId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}