package com.ruoyi.ecloud.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ecloud.mapper.HeatMeterRealMapper;
import com.ruoyi.ecloud.domain.HeatMeterReal;
import com.ruoyi.ecloud.service.IHeatMeterRealService;

/**
 * 热表实时信息Service业务层处理
 * 
 * @author ecloud
 * @date 2020-08-18
 */
@Service
public class HeatMeterRealServiceImpl implements IHeatMeterRealService 
{
    @Autowired
    private HeatMeterRealMapper heatMeterRealMapper;

    /**
     * 查询热表实时信息
     * 
     * @param heatMeterId 热表实时信息ID
     * @return 热表实时信息
     */
    @Override
    public HeatMeterReal selectHeatMeterRealById(String heatMeterId)
    {
        return heatMeterRealMapper.selectHeatMeterRealById(heatMeterId);
    }

    /**
     * 查询热表实时信息列表
     * 
     * @param heatMeterReal 热表实时信息
     * @return 热表实时信息
     */
    @Override
    public List<HeatMeterReal> selectHeatMeterRealList(HeatMeterReal heatMeterReal)
    {
        return heatMeterRealMapper.selectHeatMeterRealList(heatMeterReal);
    }

    /**
     * 新增热表实时信息
     * 
     * @param heatMeterReal 热表实时信息
     * @return 结果
     */
    @Override
    public int insertHeatMeterReal(HeatMeterReal heatMeterReal)
    {
        return heatMeterRealMapper.insertHeatMeterReal(heatMeterReal);
    }

    /**
     * 修改热表实时信息
     * 
     * @param heatMeterReal 热表实时信息
     * @return 结果
     */
    @Override
    public int updateHeatMeterReal(HeatMeterReal heatMeterReal)
    {
        heatMeterReal.setUpdateTime(DateUtils.getNowDate());
        return heatMeterRealMapper.updateHeatMeterReal(heatMeterReal);
    }

    /**
     * 批量删除热表实时信息
     * 
     * @param heatMeterIds 需要删除的热表实时信息ID
     * @return 结果
     */
    @Override
    public int deleteHeatMeterRealByIds(String[] heatMeterIds)
    {
        return heatMeterRealMapper.deleteHeatMeterRealByIds(heatMeterIds);
    }

    /**
     * 删除热表实时信息信息
     * 
     * @param heatMeterId 热表实时信息ID
     * @return 结果
     */
    @Override
    public int deleteHeatMeterRealById(String heatMeterId)
    {
        return heatMeterRealMapper.deleteHeatMeterRealById(heatMeterId);
    }
}
