package com.ruoyi.ecloud.service;

import java.util.List;
import com.ruoyi.ecloud.domain.WaterValveReal;

/**
 * 补水阀门实时运行信息Service接口
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
public interface IWaterValveRealService 
{
    /**
     * 查询补水阀门实时运行信息
     * 
     * @param waterValveId 补水阀门实时运行信息ID
     * @return 补水阀门实时运行信息
     */
    public WaterValveReal selectWaterValveRealById(String waterValveId);

    /**
     * 查询补水阀门实时运行信息列表
     * 
     * @param waterValveReal 补水阀门实时运行信息
     * @return 补水阀门实时运行信息集合
     */
    public List<WaterValveReal> selectWaterValveRealList(WaterValveReal waterValveReal);

    /**
     * 新增补水阀门实时运行信息
     * 
     * @param waterValveReal 补水阀门实时运行信息
     * @return 结果
     */
    public int insertWaterValveReal(WaterValveReal waterValveReal);

    /**
     * 修改补水阀门实时运行信息
     * 
     * @param waterValveReal 补水阀门实时运行信息
     * @return 结果
     */
    public int updateWaterValveReal(WaterValveReal waterValveReal);

    /**
     * 批量删除补水阀门实时运行信息
     * 
     * @param waterValveIds 需要删除的补水阀门实时运行信息ID
     * @return 结果
     */
    public int deleteWaterValveRealByIds(String[] waterValveIds);

    /**
     * 删除补水阀门实时运行信息信息
     * 
     * @param waterValveId 补水阀门实时运行信息ID
     * @return 结果
     */
    public int deleteWaterValveRealById(String waterValveId);
}
