package com.ruoyi.ecloud.mapper;

import java.util.List;
import com.ruoyi.ecloud.domain.ElectricValveReal;

/**
 * 电动阀门实时运行信息Mapper接口
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
public interface ElectricValveRealMapper 
{
    /**
     * 查询电动阀门实时运行信息
     * 
     * @param electricValveId 电动阀门实时运行信息ID
     * @return 电动阀门实时运行信息
     */
    public ElectricValveReal selectElectricValveRealById(String electricValveId);

    /**
     * 查询电动阀门实时运行信息列表
     * 
     * @param electricValveReal 电动阀门实时运行信息
     * @return 电动阀门实时运行信息集合
     */
    public List<ElectricValveReal> selectElectricValveRealList(ElectricValveReal electricValveReal);

    /**
     * 新增电动阀门实时运行信息
     * 
     * @param electricValveReal 电动阀门实时运行信息
     * @return 结果
     */
    public int insertElectricValveReal(ElectricValveReal electricValveReal);

    /**
     * 修改电动阀门实时运行信息
     * 
     * @param electricValveReal 电动阀门实时运行信息
     * @return 结果
     */
    public int updateElectricValveReal(ElectricValveReal electricValveReal);

    /**
     * 删除电动阀门实时运行信息
     * 
     * @param electricValveId 电动阀门实时运行信息ID
     * @return 结果
     */
    public int deleteElectricValveRealById(String electricValveId);

    /**
     * 批量删除电动阀门实时运行信息
     * 
     * @param electricValveIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteElectricValveRealByIds(String[] electricValveIds);
}
