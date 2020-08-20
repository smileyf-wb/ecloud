package com.ruoyi.ecloud.service;

import java.util.List;
import com.ruoyi.ecloud.domain.HeatMeterReal;

/**
 * 热表实时信息Service接口
 * 
 * @author ecloud
 * @date 2020-08-18
 */
public interface IHeatMeterRealService 
{
    /**
     * 查询热表实时信息
     * 
     * @param heatMeterId 热表实时信息ID
     * @return 热表实时信息
     */
    public HeatMeterReal selectHeatMeterRealById(String heatMeterId);

    /**
     * 查询热表实时信息列表
     * 
     * @param heatMeterReal 热表实时信息
     * @return 热表实时信息集合
     */
    public List<HeatMeterReal> selectHeatMeterRealList(HeatMeterReal heatMeterReal);

    /**
     * 新增热表实时信息
     * 
     * @param heatMeterReal 热表实时信息
     * @return 结果
     */
    public int insertHeatMeterReal(HeatMeterReal heatMeterReal);

    /**
     * 修改热表实时信息
     * 
     * @param heatMeterReal 热表实时信息
     * @return 结果
     */
    public int updateHeatMeterReal(HeatMeterReal heatMeterReal);

    /**
     * 批量删除热表实时信息
     * 
     * @param heatMeterIds 需要删除的热表实时信息ID
     * @return 结果
     */
    public int deleteHeatMeterRealByIds(String[] heatMeterIds);

    /**
     * 删除热表实时信息信息
     * 
     * @param heatMeterId 热表实时信息ID
     * @return 结果
     */
    public int deleteHeatMeterRealById(String heatMeterId);
}
