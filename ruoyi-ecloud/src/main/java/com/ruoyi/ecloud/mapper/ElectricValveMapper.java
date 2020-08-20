package com.ruoyi.ecloud.mapper;

import java.util.List;
import com.ruoyi.ecloud.domain.ElectricValve;

/**
 * 电动阀运行信息Mapper接口
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
public interface ElectricValveMapper 
{
    /**
     * 查询电动阀运行信息
     * 
     * @param electricValveId 电动阀运行信息ID
     * @return 电动阀运行信息
     */
    public ElectricValve selectElectricValveById(String electricValveId);

    /**
     * 查询电动阀运行信息列表
     * 
     * @param electricValve 电动阀运行信息
     * @return 电动阀运行信息集合
     */
    public List<ElectricValve> selectElectricValveList(ElectricValve electricValve);

    /**
     * 新增电动阀运行信息
     * 
     * @param electricValve 电动阀运行信息
     * @return 结果
     */
    public int insertElectricValve(ElectricValve electricValve);

    /**
     * 修改电动阀运行信息
     * 
     * @param electricValve 电动阀运行信息
     * @return 结果
     */
    public int updateElectricValve(ElectricValve electricValve);

    /**
     * 删除电动阀运行信息
     * 
     * @param electricValveId 电动阀运行信息ID
     * @return 结果
     */
    public int deleteElectricValveById(String electricValveId);

    /**
     * 批量删除电动阀运行信息
     * 
     * @param electricValveIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteElectricValveByIds(String[] electricValveIds);
}
