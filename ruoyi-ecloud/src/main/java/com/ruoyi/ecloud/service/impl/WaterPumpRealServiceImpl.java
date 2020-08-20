package com.ruoyi.ecloud.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ecloud.mapper.WaterPumpRealMapper;
import com.ruoyi.ecloud.domain.WaterPumpReal;
import com.ruoyi.ecloud.service.IWaterPumpRealService;

/**
 * 补水泵实时运行信息Service业务层处理
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
@Service
public class WaterPumpRealServiceImpl implements IWaterPumpRealService 
{
    @Autowired
    private WaterPumpRealMapper waterPumpRealMapper;

    /**
     * 查询补水泵实时运行信息
     * 
     * @param waterPumpId 补水泵实时运行信息ID
     * @return 补水泵实时运行信息
     */
    @Override
    public WaterPumpReal selectWaterPumpRealById(String waterPumpId)
    {
        return waterPumpRealMapper.selectWaterPumpRealById(waterPumpId);
    }

    /**
     * 查询补水泵实时运行信息列表
     * 
     * @param waterPumpReal 补水泵实时运行信息
     * @return 补水泵实时运行信息
     */
    @Override
    public List<WaterPumpReal> selectWaterPumpRealList(WaterPumpReal waterPumpReal)
    {
        return waterPumpRealMapper.selectWaterPumpRealList(waterPumpReal);
    }

    /**
     * 新增补水泵实时运行信息
     * 
     * @param waterPumpReal 补水泵实时运行信息
     * @return 结果
     */
    @Override
    public int insertWaterPumpReal(WaterPumpReal waterPumpReal)
    {
        return waterPumpRealMapper.insertWaterPumpReal(waterPumpReal);
    }

    /**
     * 修改补水泵实时运行信息
     * 
     * @param waterPumpReal 补水泵实时运行信息
     * @return 结果
     */
    @Override
    public int updateWaterPumpReal(WaterPumpReal waterPumpReal)
    {
        waterPumpReal.setUpdateTime(DateUtils.getNowDate());
        return waterPumpRealMapper.updateWaterPumpReal(waterPumpReal);
    }

    /**
     * 批量删除补水泵实时运行信息
     * 
     * @param waterPumpIds 需要删除的补水泵实时运行信息ID
     * @return 结果
     */
    @Override
    public int deleteWaterPumpRealByIds(String[] waterPumpIds)
    {
        return waterPumpRealMapper.deleteWaterPumpRealByIds(waterPumpIds);
    }

    /**
     * 删除补水泵实时运行信息信息
     * 
     * @param waterPumpId 补水泵实时运行信息ID
     * @return 结果
     */
    @Override
    public int deleteWaterPumpRealById(String waterPumpId)
    {
        return waterPumpRealMapper.deleteWaterPumpRealById(waterPumpId);
    }
}
