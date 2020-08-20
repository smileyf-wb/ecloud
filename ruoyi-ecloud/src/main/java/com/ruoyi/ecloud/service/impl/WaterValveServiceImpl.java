package com.ruoyi.ecloud.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ecloud.mapper.WaterValveMapper;
import com.ruoyi.ecloud.domain.WaterValve;
import com.ruoyi.ecloud.service.IWaterValveService;

/**
 * 补水阀门运行信息Service业务层处理
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
@Service
public class WaterValveServiceImpl implements IWaterValveService 
{
    @Autowired
    private WaterValveMapper waterValveMapper;

    /**
     * 查询补水阀门运行信息
     * 
     * @param waterValveId 补水阀门运行信息ID
     * @return 补水阀门运行信息
     */
    @Override
    public WaterValve selectWaterValveById(String waterValveId)
    {
        return waterValveMapper.selectWaterValveById(waterValveId);
    }

    /**
     * 查询补水阀门运行信息列表
     * 
     * @param waterValve 补水阀门运行信息
     * @return 补水阀门运行信息
     */
    @Override
    public List<WaterValve> selectWaterValveList(WaterValve waterValve)
    {
        return waterValveMapper.selectWaterValveList(waterValve);
    }

    /**
     * 新增补水阀门运行信息
     * 
     * @param waterValve 补水阀门运行信息
     * @return 结果
     */
    @Override
    public int insertWaterValve(WaterValve waterValve)
    {
        return waterValveMapper.insertWaterValve(waterValve);
    }

    /**
     * 修改补水阀门运行信息
     * 
     * @param waterValve 补水阀门运行信息
     * @return 结果
     */
    @Override
    public int updateWaterValve(WaterValve waterValve)
    {
        waterValve.setUpdateTime(DateUtils.getNowDate());
        return waterValveMapper.updateWaterValve(waterValve);
    }

    /**
     * 批量删除补水阀门运行信息
     * 
     * @param waterValveIds 需要删除的补水阀门运行信息ID
     * @return 结果
     */
    @Override
    public int deleteWaterValveByIds(String[] waterValveIds)
    {
        return waterValveMapper.deleteWaterValveByIds(waterValveIds);
    }

    /**
     * 删除补水阀门运行信息信息
     * 
     * @param waterValveId 补水阀门运行信息ID
     * @return 结果
     */
    @Override
    public int deleteWaterValveById(String waterValveId)
    {
        return waterValveMapper.deleteWaterValveById(waterValveId);
    }
}
