package com.ruoyi.ecloud.mapper;

import java.util.List;
import com.ruoyi.ecloud.domain.ElectricityMeterReal;

/**
 * 电表运行信息Mapper接口
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
public interface ElectricityMeterRealMapper 
{
    /**
     * 查询电表运行信息
     * 
     * @param meterId 电表运行信息ID
     * @return 电表运行信息
     */
    public ElectricityMeterReal selectElectricityMeterRealById(String meterId);

    /**
     * 查询电表运行信息列表
     * 
     * @param electricityMeterReal 电表运行信息
     * @return 电表运行信息集合
     */
    public List<ElectricityMeterReal> selectElectricityMeterRealList(ElectricityMeterReal electricityMeterReal);

    /**
     * 新增电表运行信息
     * 
     * @param electricityMeterReal 电表运行信息
     * @return 结果
     */
    public int insertElectricityMeterReal(ElectricityMeterReal electricityMeterReal);

    /**
     * 修改电表运行信息
     * 
     * @param electricityMeterReal 电表运行信息
     * @return 结果
     */
    public int updateElectricityMeterReal(ElectricityMeterReal electricityMeterReal);

    /**
     * 删除电表运行信息
     * 
     * @param meterId 电表运行信息ID
     * @return 结果
     */
    public int deleteElectricityMeterRealById(String meterId);

    /**
     * 批量删除电表运行信息
     * 
     * @param meterIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteElectricityMeterRealByIds(String[] meterIds);
}
