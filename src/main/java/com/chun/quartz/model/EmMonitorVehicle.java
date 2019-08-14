package com.chun.quartz.model;

import java.io.Serializable;
import java.util.Date;

public class EmMonitorVehicle implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column em_monitor_vehicle.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column em_monitor_vehicle.type
     *
     * @mbg.generated
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column em_monitor_vehicle.vg_name
     *
     * @mbg.generated
     */
    private String vgName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column em_monitor_vehicle.no
     *
     * @mbg.generated
     */
    private String no;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column em_monitor_vehicle.remark
     *
     * @mbg.generated
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column em_monitor_vehicle.brand_no
     *
     * @mbg.generated
     */
    private String brandNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column em_monitor_vehicle.deptname
     *
     * @mbg.generated
     */
    private String deptname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column em_monitor_vehicle.sim_no
     *
     * @mbg.generated
     */
    private String simNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column em_monitor_vehicle.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table em_monitor_vehicle
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column em_monitor_vehicle.id
     *
     * @return the value of em_monitor_vehicle.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column em_monitor_vehicle.id
     *
     * @param id the value for em_monitor_vehicle.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column em_monitor_vehicle.type
     *
     * @return the value of em_monitor_vehicle.type
     *
     * @mbg.generated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column em_monitor_vehicle.type
     *
     * @param type the value for em_monitor_vehicle.type
     *
     * @mbg.generated
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column em_monitor_vehicle.vg_name
     *
     * @return the value of em_monitor_vehicle.vg_name
     *
     * @mbg.generated
     */
    public String getVgName() {
        return vgName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column em_monitor_vehicle.vg_name
     *
     * @param vgName the value for em_monitor_vehicle.vg_name
     *
     * @mbg.generated
     */
    public void setVgName(String vgName) {
        this.vgName = vgName == null ? null : vgName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column em_monitor_vehicle.no
     *
     * @return the value of em_monitor_vehicle.no
     *
     * @mbg.generated
     */
    public String getNo() {
        return no;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column em_monitor_vehicle.no
     *
     * @param no the value for em_monitor_vehicle.no
     *
     * @mbg.generated
     */
    public void setNo(String no) {
        this.no = no == null ? null : no.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column em_monitor_vehicle.remark
     *
     * @return the value of em_monitor_vehicle.remark
     *
     * @mbg.generated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column em_monitor_vehicle.remark
     *
     * @param remark the value for em_monitor_vehicle.remark
     *
     * @mbg.generated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column em_monitor_vehicle.brand_no
     *
     * @return the value of em_monitor_vehicle.brand_no
     *
     * @mbg.generated
     */
    public String getBrandNo() {
        return brandNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column em_monitor_vehicle.brand_no
     *
     * @param brandNo the value for em_monitor_vehicle.brand_no
     *
     * @mbg.generated
     */
    public void setBrandNo(String brandNo) {
        this.brandNo = brandNo == null ? null : brandNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column em_monitor_vehicle.deptname
     *
     * @return the value of em_monitor_vehicle.deptname
     *
     * @mbg.generated
     */
    public String getDeptname() {
        return deptname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column em_monitor_vehicle.deptname
     *
     * @param deptname the value for em_monitor_vehicle.deptname
     *
     * @mbg.generated
     */
    public void setDeptname(String deptname) {
        this.deptname = deptname == null ? null : deptname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column em_monitor_vehicle.sim_no
     *
     * @return the value of em_monitor_vehicle.sim_no
     *
     * @mbg.generated
     */
    public String getSimNo() {
        return simNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column em_monitor_vehicle.sim_no
     *
     * @param simNo the value for em_monitor_vehicle.sim_no
     *
     * @mbg.generated
     */
    public void setSimNo(String simNo) {
        this.simNo = simNo == null ? null : simNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column em_monitor_vehicle.create_time
     *
     * @return the value of em_monitor_vehicle.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column em_monitor_vehicle.create_time
     *
     * @param createTime the value for em_monitor_vehicle.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table em_monitor_vehicle
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", type=").append(type);
        sb.append(", vgName=").append(vgName);
        sb.append(", no=").append(no);
        sb.append(", remark=").append(remark);
        sb.append(", brandNo=").append(brandNo);
        sb.append(", deptname=").append(deptname);
        sb.append(", simNo=").append(simNo);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}