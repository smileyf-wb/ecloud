package com.ruoyi.ecloud.service;

import java.util.List;
import com.ruoyi.ecloud.domain.ElectricValveReal;

/**
 * 电动阀门实时运行信息Service接口
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
public interface IElectricValveRealService 
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
     * 批量删除电动阀门实时运行信息
     * 
     * @param electricValveIds 需要删除的电动阀门实时运行信息ID
     * @return 结果
     */
    public int deleteElectricValveRealByIds(String[] electricValveIds);

    /**
     * 删除电动阀门实时运行信息信息
     * 
     * @param electricValveId 电动阀门实时运行信息ID
     * @return 结果
     */
    public int deleteElectricValveRealById(String electricValveId);
}
