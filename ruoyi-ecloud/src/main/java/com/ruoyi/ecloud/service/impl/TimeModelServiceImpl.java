package com.ruoyi.ecloud.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ecloud.mapper.TimeModelMapper;
import com.ruoyi.ecloud.domain.TimeModel;
import com.ruoyi.ecloud.service.ITimeModelService;

/**
 * 定时模式Service业务层处理
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
@Service
public class TimeModelServiceImpl implements ITimeModelService 
{
    @Autowired
    private TimeModelMapper timeModelMapper;

    /**
     * 查询定时模式
     * 
     * @param timeModelId 定时模式ID
     * @return 定时模式
     */
    @Override
    public TimeModel selectTimeModelById(String timeModelId)
    {
        return timeModelMapper.selectTimeModelById(timeModelId);
    }

    /**
     * 查询定时模式列表
     * 
     * @param timeModel 定时模式
     * @return 定时模式
     */
    @Override
    public List<TimeModel> selectTimeModelList(TimeModel timeModel)
    {
        return timeModelMapper.selectTimeModelList(timeModel);
    }

    /**
     * 新增定时模式
     * 
     * @param timeModel 定时模式
     * @return 结果
     */
    @Override
    public int insertTimeModel(TimeModel timeModel)
    {
        return timeModelMapper.insertTimeModel(timeModel);
    }

    /**
     * 修改定时模式
     * 
     * @param timeModel 定时模式
     * @return 结果
     */
    @Override
    public int updateTimeModel(TimeModel timeModel)
    {
        return timeModelMapper.updateTimeModel(timeModel);
    }

    /**
     * 批量删除定时模式
     * 
     * @param timeModelIds 需要删除的定时模式ID
     * @return 结果
     */
    @Override
    public int deleteTimeModelByIds(String[] timeModelIds)
    {
        return timeModelMapper.deleteTimeModelByIds(timeModelIds);
    }

    /**
     * 删除定时模式信息
     * 
     * @param timeModelId 定时模式ID
     * @return 结果
     */
    @Override
    public int deleteTimeModelById(String timeModelId)
    {
        return timeModelMapper.deleteTimeModelById(timeModelId);
    }
}
