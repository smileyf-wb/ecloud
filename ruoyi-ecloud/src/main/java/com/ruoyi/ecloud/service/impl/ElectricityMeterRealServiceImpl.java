package com.ruoyi.ecloud.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ecloud.mapper.ElectricityMeterRealMapper;
import com.ruoyi.ecloud.domain.ElectricityMeterReal;
import com.ruoyi.ecloud.service.IElectricityMeterRealService;

/**
 * 电表运行信息Service业务层处理
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
@Service
public class ElectricityMeterRealServiceImpl implements IElectricityMeterRealService 
{
    @Autowired
    private ElectricityMeterRealMapper electricityMeterRealMapper;

    /**
     * 查询电表运行信息
     * 
     * @param meterId 电表运行信息ID
     * @return 电表运行信息
     */
    @Override
    public ElectricityMeterReal selectElectricityMeterRealById(String meterId)
    {
        return electricityMeterRealMapper.selectElectricityMeterRealById(meterId);
    }

    /**
     * 查询电表运行信息列表
     * 
     * @param electricityMeterReal 电表运行信息
     * @return 电表运行信息
     */
    @Override
    public List<ElectricityMeterReal> selectElectricityMeterRealList(ElectricityMeterReal electricityMeterReal)
    {
        return electricityMeterRealMapper.selectElectricityMeterRealList(electricityMeterReal);
    }

    /**
     * 新增电表运行信息
     * 
     * @param electricityMeterReal 电表运行信息
     * @return 结果
     */
    @Override
    public int insertElectricityMeterReal(ElectricityMeterReal electricityMeterReal)
    {
        return electricityMeterRealMapper.insertElectricityMeterReal(electricityMeterReal);
    }

    /**
     * 修改电表运行信息
     * 
     * @param electricityMeterReal 电表运行信息
     * @return 结果
     */
    @Override
    public int updateElectricityMeterReal(ElectricityMeterReal electricityMeterReal)
    {
        electricityMeterReal.setUpdateTime(DateUtils.getNowDate());
        return electricityMeterRealMapper.updateElectricityMeterReal(electricityMeterReal);
    }

    /**
     * 批量删除电表运行信息
     * 
     * @param meterIds 需要删除的电表运行信息ID
     * @return 结果
     */
    @Override
    public int deleteElectricityMeterRealByIds(String[] meterIds)
    {
        return electricityMeterRealMapper.deleteElectricityMeterRealByIds(meterIds);
    }

    /**
     * 删除电表运行信息信息
     * 
     * @param meterId 电表运行信息ID
     * @return 结果
     */
    @Override
    public int deleteElectricityMeterRealById(String meterId)
    {
        return electricityMeterRealMapper.deleteElectricityMeterRealById(meterId);
    }
}
