package com.ruoyi.ecloud.mapper;

import java.util.List;
import com.ruoyi.ecloud.domain.WaterValve;

/**
 * 补水阀门运行信息Mapper接口
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
public interface WaterValveMapper 
{
    /**
     * 查询补水阀门运行信息
     * 
     * @param waterValveId 补水阀门运行信息ID
     * @return 补水阀门运行信息
     */
    public WaterValve selectWaterValveById(String waterValveId);

    /**
     * 查询补水阀门运行信息列表
     * 
     * @param waterValve 补水阀门运行信息
     * @return 补水阀门运行信息集合
     */
    public List<WaterValve> selectWaterValveList(WaterValve waterValve);

    /**
     * 新增补水阀门运行信息
     * 
     * @param waterValve 补水阀门运行信息
     * @return 结果
     */
    public int insertWaterValve(WaterValve waterValve);

    /**
     * 修改补水阀门运行信息
     * 
     * @param waterValve 补水阀门运行信息
     * @return 结果
     */
    public int updateWaterValve(WaterValve waterValve);

    /**
     * 删除补水阀门运行信息
     * 
     * @param waterValveId 补水阀门运行信息ID
     * @return 结果
     */
    public int deleteWaterValveById(String waterValveId);

    /**
     * 批量删除补水阀门运行信息
     * 
     * @param waterValveIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteWaterValveByIds(String[] waterValveIds);
}
