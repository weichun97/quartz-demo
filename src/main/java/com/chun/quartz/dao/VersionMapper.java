package com.chun.quartz.dao;

import com.chun.quartz.model.Version;
import java.util.List;

public interface VersionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table version
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table version
     *
     * @mbg.generated
     */
    int insert(Version record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table version
     *
     * @mbg.generated
     */
    Version selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table version
     *
     * @mbg.generated
     */
    List<Version> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table version
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Version record);
}