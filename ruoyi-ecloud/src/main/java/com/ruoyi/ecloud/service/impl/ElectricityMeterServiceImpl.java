package com.ruoyi.ecloud.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ecloud.mapper.ElectricityMeterMapper;
import com.ruoyi.ecloud.domain.ElectricityMeter;
import com.ruoyi.ecloud.service.IElectricityMeterService;

/**
 * 电表历史运行信息Service业务层处理
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
@Service
public class ElectricityMeterServiceImpl implements IElectricityMeterService 
{
    @Autowired
    private ElectricityMeterMapper electricityMeterMapper;

    /**
     * 查询电表历史运行信息
     * 
     * @param meterId 电表历史运行信息ID
     * @return 电表历史运行信息
     */
    @Override
    public ElectricityMeter selectElectricityMeterById(String meterId)
    {
        return electricityMeterMapper.selectElectricityMeterById(meterId);
    }

    /**
     * 查询电表历史运行信息列表
     * 
     * @param electricityMeter 电表历史运行信息
     * @return 电表历史运行信息
     */
    @Override
    public List<ElectricityMeter> selectElectricityMeterList(ElectricityMeter electricityMeter)
    {
        return electricityMeterMapper.selectElectricityMeterList(electricityMeter);
    }

    /**
     * 新增电表历史运行信息
     * 
     * @param electricityMeter 电表历史运行信息
     * @return 结果
     */
    @Override
    public int insertElectricityMeter(ElectricityMeter electricityMeter)
    {
        return electricityMeterMapper.insertElectricityMeter(electricityMeter);
    }

    /**
     * 修改电表历史运行信息
     * 
     * @param electricityMeter 电表历史运行信息
     * @return 结果
     */
    @Override
    public int updateElectricityMeter(ElectricityMeter electricityMeter)
    {
        electricityMeter.setUpdateTime(DateUtils.getNowDate());
        return electricityMeterMapper.updateElectricityMeter(electricityMeter);
    }

    /**
     * 批量删除电表历史运行信息
     * 
     * @param meterIds 需要删除的电表历史运行信息ID
     * @return 结果
     */
    @Override
    public int deleteElectricityMeterByIds(String[] meterIds)
    {
        return electricityMeterMapper.deleteElectricityMeterByIds(meterIds);
    }

    /**
     * 删除电表历史运行信息信息
     * 
     * @param meterId 电表历史运行信息ID
     * @return 结果
     */
    @Override
    public int deleteElectricityMeterById(String meterId)
    {
        return electricityMeterMapper.deleteElectricityMeterById(meterId);
    }
}
