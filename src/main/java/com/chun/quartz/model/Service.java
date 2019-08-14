package com.chun.quartz.model;

import java.io.Serializable;

public class Service implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column service.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column service.service_name
     *
     * @mbg.generated
     */
    private String serviceName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column service.service_name_en
     *
     * @mbg.generated
     */
    private String serviceNameEn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table service
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column service.id
     *
     * @return the value of service.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column service.id
     *
     * @param id the value for service.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column service.service_name
     *
     * @return the value of service.service_name
     *
     * @mbg.generated
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column service.service_name
     *
     * @param serviceName the value for service.service_name
     *
     * @mbg.generated
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName == null ? null : serviceName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column service.service_name_en
     *
     * @return the value of service.service_name_en
     *
     * @mbg.generated
     */
    public String getServiceNameEn() {
        return serviceNameEn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column service.service_name_en
     *
     * @param serviceNameEn the value for service.service_name_en
     *
     * @mbg.generated
     */
    public void setServiceNameEn(String serviceNameEn) {
        this.serviceNameEn = serviceNameEn == null ? null : serviceNameEn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table service
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
        sb.append(", serviceName=").append(serviceName);
        sb.append(", serviceNameEn=").append(serviceNameEn);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}