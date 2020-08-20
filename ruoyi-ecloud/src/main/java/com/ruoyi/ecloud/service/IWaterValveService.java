package com.ruoyi.ecloud.service;

import java.util.List;
import com.ruoyi.ecloud.domain.WaterValve;

/**
 * 补水阀门运行信息Service接口
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
public interface IWaterValveService 
{
    /**
     * 查询补水阀门运行信息
     * 
     * @param waterValveId 补水阀门运行信息ID
     * @return 补水阀门运行信息
     */
    public WaterValve selectWaterValveById(String waterValveId);

    /**
     * 查询补水阀门运行信息列表
     * 
     * @param waterValve 补水阀门运行信息
     * @return 补水阀门运行信息集合
     */
    public List<WaterValve> selectWaterValveList(WaterValve waterValve);

    /**
     * 新增补水阀门运行信息
     * 
     * @param waterValve 补水阀门运行信息
     * @return 结果
     */
    public int insertWaterValve(WaterValve waterValve);

    /**
     * 修改补水阀门运行信息
     * 
     * @param waterValve 补水阀门运行信息
     * @return 结果
     */
    public int updateWaterValve(WaterValve waterValve);

    /**
     * 批量删除补水阀门运行信息
     * 
     * @param waterValveIds 需要删除的补水阀门运行信息ID
     * @return 结果
     */
    public int deleteWaterValveByIds(String[] waterValveIds);

    /**
     * 删除补水阀门运行信息信息
     * 
     * @param waterValveId 补水阀门运行信息ID
     * @return 结果
     */
    public int deleteWaterValveById(String waterValveId);
}
