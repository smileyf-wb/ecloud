package com.ruoyi.ecloud.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ecloud.mapper.HeatMeterMapper;
import com.ruoyi.ecloud.domain.HeatMeter;
import com.ruoyi.ecloud.service.IHeatMeterService;

/**
 * 热表信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-08-18
 */
@Service
public class HeatMeterServiceImpl implements IHeatMeterService 
{
    @Autowired
    private HeatMeterMapper heatMeterMapper;

    /**
     * 查询热表信息
     * 
     * @param heatMeterId 热表信息ID
     * @return 热表信息
     */
    @Override
    public HeatMeter selectHeatMeterById(String heatMeterId)
    {
        return heatMeterMapper.selectHeatMeterById(heatMeterId);
    }

    /**
     * 查询热表信息列表
     * 
     * @param heatMeter 热表信息
     * @return 热表信息
     */
    @Override
    public List<HeatMeter> selectHeatMeterList(HeatMeter heatMeter)
    {
        return heatMeterMapper.selectHeatMeterList(heatMeter);
    }

    /**
     * 新增热表信息
     * 
     * @param heatMeter 热表信息
     * @return 结果
     */
    @Override
    public int insertHeatMeter(HeatMeter heatMeter)
    {
        return heatMeterMapper.insertHeatMeter(heatMeter);
    }

    /**
     * 修改热表信息
     * 
     * @param heatMeter 热表信息
     * @return 结果
     */
    @Override
    public int updateHeatMeter(HeatMeter heatMeter)
    {
        heatMeter.setUpdateTime(DateUtils.getNowDate());
        return heatMeterMapper.updateHeatMeter(heatMeter);
    }

    /**
     * 批量删除热表信息
     * 
     * @param heatMeterIds 需要删除的热表信息ID
     * @return 结果
     */
    @Override
    public int deleteHeatMeterByIds(String[] heatMeterIds)
    {
        return heatMeterMapper.deleteHeatMeterByIds(heatMeterIds);
    }

    /**
     * 删除热表信息信息
     * 
     * @param heatMeterId 热表信息ID
     * @return 结果
     */
    @Override
    public int deleteHeatMeterById(String heatMeterId)
    {
        return heatMeterMapper.deleteHeatMeterById(heatMeterId);
    }
}
