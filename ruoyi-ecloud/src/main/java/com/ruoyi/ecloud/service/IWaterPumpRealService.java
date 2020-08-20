package com.ruoyi.ecloud.service;

import java.util.List;
import com.ruoyi.ecloud.domain.WaterPumpReal;

/**
 * 补水泵实时运行信息Service接口
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
public interface IWaterPumpRealService 
{
    /**
     * 查询补水泵实时运行信息
     * 
     * @param waterPumpId 补水泵实时运行信息ID
     * @return 补水泵实时运行信息
     */
    public WaterPumpReal selectWaterPumpRealById(String waterPumpId);

    /**
     * 查询补水泵实时运行信息列表
     * 
     * @param waterPumpReal 补水泵实时运行信息
     * @return 补水泵实时运行信息集合
     */
    public List<WaterPumpReal> selectWaterPumpRealList(WaterPumpReal waterPumpReal);

    /**
     * 新增补水泵实时运行信息
     * 
     * @param waterPumpReal 补水泵实时运行信息
     * @return 结果
     */
    public int insertWaterPumpReal(WaterPumpReal waterPumpReal);

    /**
     * 修改补水泵实时运行信息
     * 
     * @param waterPumpReal 补水泵实时运行信息
     * @return 结果
     */
    public int updateWaterPumpReal(WaterPumpReal waterPumpReal);

    /**
     * 批量删除补水泵实时运行信息
     * 
     * @param waterPumpIds 需要删除的补水泵实时运行信息ID
     * @return 结果
     */
    public int deleteWaterPumpRealByIds(String[] waterPumpIds);

    /**
     * 删除补水泵实时运行信息信息
     * 
     * @param waterPumpId 补水泵实时运行信息ID
     * @return 结果
     */
    public int deleteWaterPumpRealById(String waterPumpId);
}
