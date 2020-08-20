package com.ruoyi.ecloud.mapper;

import java.util.List;
import com.ruoyi.ecloud.domain.HeatMeter;

/**
 * 热表信息Mapper接口
 * 
 * @author ruoyi
 * @date 2020-08-18
 */
public interface HeatMeterMapper 
{
    /**
     * 查询热表信息
     * 
     * @param heatMeterId 热表信息ID
     * @return 热表信息
     */
    public HeatMeter selectHeatMeterById(String heatMeterId);

    /**
     * 查询热表信息列表
     * 
     * @param heatMeter 热表信息
     * @return 热表信息集合
     */
    public List<HeatMeter> selectHeatMeterList(HeatMeter heatMeter);

    /**
     * 新增热表信息
     * 
     * @param heatMeter 热表信息
     * @return 结果
     */
    public int insertHeatMeter(HeatMeter heatMeter);

    /**
     * 修改热表信息
     * 
     * @param heatMeter 热表信息
     * @return 结果
     */
    public int updateHeatMeter(HeatMeter heatMeter);

    /**
     * 删除热表信息
     * 
     * @param heatMeterId 热表信息ID
     * @return 结果
     */
    public int deleteHeatMeterById(String heatMeterId);

    /**
     * 批量删除热表信息
     * 
     * @param heatMeterIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteHeatMeterByIds(String[] heatMeterIds);
}
