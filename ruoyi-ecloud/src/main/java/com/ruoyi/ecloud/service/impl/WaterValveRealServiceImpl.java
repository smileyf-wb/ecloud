package com.ruoyi.ecloud.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ecloud.mapper.WaterValveRealMapper;
import com.ruoyi.ecloud.domain.WaterValveReal;
import com.ruoyi.ecloud.service.IWaterValveRealService;

/**
 * 补水阀门实时运行信息Service业务层处理
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
@Service
public class WaterValveRealServiceImpl implements IWaterValveRealService 
{
    @Autowired
    private WaterValveRealMapper waterValveRealMapper;

    /**
     * 查询补水阀门实时运行信息
     * 
     * @param waterValveId 补水阀门实时运行信息ID
     * @return 补水阀门实时运行信息
     */
    @Override
    public WaterValveReal selectWaterValveRealById(String waterValveId)
    {
        return waterValveRealMapper.selectWaterValveRealById(waterValveId);
    }

    /**
     * 查询补水阀门实时运行信息列表
     * 
     * @param waterValveReal 补水阀门实时运行信息
     * @return 补水阀门实时运行信息
     */
    @Override
    public List<WaterValveReal> selectWaterValveRealList(WaterValveReal waterValveReal)
    {
        return waterValveRealMapper.selectWaterValveRealList(waterValveReal);
    }

    /**
     * 新增补水阀门实时运行信息
     * 
     * @param waterValveReal 补水阀门实时运行信息
     * @return 结果
     */
    @Override
    public int insertWaterValveReal(WaterValveReal waterValveReal)
    {
        return waterValveRealMapper.insertWaterValveReal(waterValveReal);
    }

    /**
     * 修改补水阀门实时运行信息
     * 
     * @param waterValveReal 补水阀门实时运行信息
     * @return 结果
     */
    @Override
    public int updateWaterValveReal(WaterValveReal waterValveReal)
    {
        waterValveReal.setUpdateTime(DateUtils.getNowDate());
        return waterValveRealMapper.updateWaterValveReal(waterValveReal);
    }

    /**
     * 批量删除补水阀门实时运行信息
     * 
     * @param waterValveIds 需要删除的补水阀门实时运行信息ID
     * @return 结果
     */
    @Override
    public int deleteWaterValveRealByIds(String[] waterValveIds)
    {
        return waterValveRealMapper.deleteWaterValveRealByIds(waterValveIds);
    }

    /**
     * 删除补水阀门实时运行信息信息
     * 
     * @param waterValveId 补水阀门实时运行信息ID
     * @return 结果
     */
    @Override
    public int deleteWaterValveRealById(String waterValveId)
    {
        return waterValveRealMapper.deleteWaterValveRealById(waterValveId);
    }
}
