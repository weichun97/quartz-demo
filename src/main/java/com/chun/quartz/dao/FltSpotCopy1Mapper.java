package com.chun.quartz.dao;

import com.chun.quartz.model.FltSpotCopy1;
import java.util.List;

public interface FltSpotCopy1Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table flt_spot_copy1
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table flt_spot_copy1
     *
     * @mbg.generated
     */
    int insert(FltSpotCopy1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table flt_spot_copy1
     *
     * @mbg.generated
     */
    FltSpotCopy1 selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table flt_spot_copy1
     *
     * @mbg.generated
     */
    List<FltSpotCopy1> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table flt_spot_copy1
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FltSpotCopy1 record);
}