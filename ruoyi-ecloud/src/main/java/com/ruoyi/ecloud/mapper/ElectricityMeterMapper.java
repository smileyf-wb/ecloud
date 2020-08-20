package com.ruoyi.ecloud.mapper;

import java.util.List;
import com.ruoyi.ecloud.domain.ElectricityMeter;

/**
 * 电表历史运行信息Mapper接口
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
public interface ElectricityMeterMapper 
{
    /**
     * 查询电表历史运行信息
     * 
     * @param meterId 电表历史运行信息ID
     * @return 电表历史运行信息
     */
    public ElectricityMeter selectElectricityMeterById(String meterId);

    /**
     * 查询电表历史运行信息列表
     * 
     * @param electricityMeter 电表历史运行信息
     * @return 电表历史运行信息集合
     */
    public List<ElectricityMeter> selectElectricityMeterList(ElectricityMeter electricityMeter);

    /**
     * 新增电表历史运行信息
     * 
     * @param electricityMeter 电表历史运行信息
     * @return 结果
     */
    public int insertElectricityMeter(ElectricityMeter electricityMeter);

    /**
     * 修改电表历史运行信息
     * 
     * @param electricityMeter 电表历史运行信息
     * @return 结果
     */
    public int updateElectricityMeter(ElectricityMeter electricityMeter);

    /**
     * 删除电表历史运行信息
     * 
     * @param meterId 电表历史运行信息ID
     * @return 结果
     */
    public int deleteElectricityMeterById(String meterId);

    /**
     * 批量删除电表历史运行信息
     * 
     * @param meterIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteElectricityMeterByIds(String[] meterIds);
}
