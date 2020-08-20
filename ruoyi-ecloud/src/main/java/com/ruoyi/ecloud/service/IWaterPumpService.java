package com.ruoyi.ecloud.service;

import java.util.List;
import com.ruoyi.ecloud.domain.WaterPump;

/**
 * 补水泵运行信息Service接口
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
public interface IWaterPumpService 
{
    /**
     * 查询补水泵运行信息
     * 
     * @param waterPumpId 补水泵运行信息ID
     * @return 补水泵运行信息
     */
    public WaterPump selectWaterPumpById(String waterPumpId);

    /**
     * 查询补水泵运行信息列表
     * 
     * @param waterPump 补水泵运行信息
     * @return 补水泵运行信息集合
     */
    public List<WaterPump> selectWaterPumpList(WaterPump waterPump);

    /**
     * 新增补水泵运行信息
     * 
     * @param waterPump 补水泵运行信息
     * @return 结果
     */
    public int insertWaterPump(WaterPump waterPump);

    /**
     * 修改补水泵运行信息
     * 
     * @param waterPump 补水泵运行信息
     * @return 结果
     */
    public int updateWaterPump(WaterPump waterPump);

    /**
     * 批量删除补水泵运行信息
     * 
     * @param waterPumpIds 需要删除的补水泵运行信息ID
     * @return 结果
     */
    public int deleteWaterPumpByIds(String[] waterPumpIds);

    /**
     * 删除补水泵运行信息信息
     * 
     * @param waterPumpId 补水泵运行信息ID
     * @return 结果
     */
    public int deleteWaterPumpById(String waterPumpId);
}
