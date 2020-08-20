package com.ruoyi.ecloud.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ecloud.mapper.WaterPumpMapper;
import com.ruoyi.ecloud.domain.WaterPump;
import com.ruoyi.ecloud.service.IWaterPumpService;

/**
 * 补水泵运行信息Service业务层处理
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
@Service
public class WaterPumpServiceImpl implements IWaterPumpService 
{
    @Autowired
    private WaterPumpMapper waterPumpMapper;

    /**
     * 查询补水泵运行信息
     * 
     * @param waterPumpId 补水泵运行信息ID
     * @return 补水泵运行信息
     */
    @Override
    public WaterPump selectWaterPumpById(String waterPumpId)
    {
        return waterPumpMapper.selectWaterPumpById(waterPumpId);
    }

    /**
     * 查询补水泵运行信息列表
     * 
     * @param waterPump 补水泵运行信息
     * @return 补水泵运行信息
     */
    @Override
    public List<WaterPump> selectWaterPumpList(WaterPump waterPump)
    {
        return waterPumpMapper.selectWaterPumpList(waterPump);
    }

    /**
     * 新增补水泵运行信息
     * 
     * @param waterPump 补水泵运行信息
     * @return 结果
     */
    @Override
    public int insertWaterPump(WaterPump waterPump)
    {
        return waterPumpMapper.insertWaterPump(waterPump);
    }

    /**
     * 修改补水泵运行信息
     * 
     * @param waterPump 补水泵运行信息
     * @return 结果
     */
    @Override
    public int updateWaterPump(WaterPump waterPump)
    {
        waterPump.setUpdateTime(DateUtils.getNowDate());
        return waterPumpMapper.updateWaterPump(waterPump);
    }

    /**
     * 批量删除补水泵运行信息
     * 
     * @param waterPumpIds 需要删除的补水泵运行信息ID
     * @return 结果
     */
    @Override
    public int deleteWaterPumpByIds(String[] waterPumpIds)
    {
        return waterPumpMapper.deleteWaterPumpByIds(waterPumpIds);
    }

    /**
     * 删除补水泵运行信息信息
     * 
     * @param waterPumpId 补水泵运行信息ID
     * @return 结果
     */
    @Override
    public int deleteWaterPumpById(String waterPumpId)
    {
        return waterPumpMapper.deleteWaterPumpById(waterPumpId);
    }
}
