package com.ruoyi.ecloud.mapper;

import java.util.List;
import com.ruoyi.ecloud.domain.TimeModel;

/**
 * 定时模式Mapper接口
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
public interface TimeModelMapper 
{
    /**
     * 查询定时模式
     * 
     * @param timeModelId 定时模式ID
     * @return 定时模式
     */
    public TimeModel selectTimeModelById(String timeModelId);

    /**
     * 查询定时模式列表
     * 
     * @param timeModel 定时模式
     * @return 定时模式集合
     */
    public List<TimeModel> selectTimeModelList(TimeModel timeModel);

    /**
     * 新增定时模式
     * 
     * @param timeModel 定时模式
     * @return 结果
     */
    public int insertTimeModel(TimeModel timeModel);

    /**
     * 修改定时模式
     * 
     * @param timeModel 定时模式
     * @return 结果
     */
    public int updateTimeModel(TimeModel timeModel);

    /**
     * 删除定时模式
     * 
     * @param timeModelId 定时模式ID
     * @return 结果
     */
    public int deleteTimeModelById(String timeModelId);

    /**
     * 批量删除定时模式
     * 
     * @param timeModelIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteTimeModelByIds(String[] timeModelIds);
}
