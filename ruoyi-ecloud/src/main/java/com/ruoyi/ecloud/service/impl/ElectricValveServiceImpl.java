package com.ruoyi.ecloud.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ecloud.mapper.ElectricValveMapper;
import com.ruoyi.ecloud.domain.ElectricValve;
import com.ruoyi.ecloud.service.IElectricValveService;

/**
 * 电动阀运行信息Service业务层处理
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
@Service
public class ElectricValveServiceImpl implements IElectricValveService 
{
    @Autowired
    private ElectricValveMapper electricValveMapper;

    /**
     * 查询电动阀运行信息
     * 
     * @param electricValveId 电动阀运行信息ID
     * @return 电动阀运行信息
     */
    @Override
    public ElectricValve selectElectricValveById(String electricValveId)
    {
        return electricValveMapper.selectElectricValveById(electricValveId);
    }

    /**
     * 查询电动阀运行信息列表
     * 
     * @param electricValve 电动阀运行信息
     * @return 电动阀运行信息
     */
    @Override
    public List<ElectricValve> selectElectricValveList(ElectricValve electricValve)
    {
        return electricValveMapper.selectElectricValveList(electricValve);
    }

    /**
     * 新增电动阀运行信息
     * 
     * @param electricValve 电动阀运行信息
     * @return 结果
     */
    @Override
    public int insertElectricValve(ElectricValve electricValve)
    {
        return electricValveMapper.insertElectricValve(electricValve);
    }

    /**
     * 修改电动阀运行信息
     * 
     * @param electricValve 电动阀运行信息
     * @return 结果
     */
    @Override
    public int updateElectricValve(ElectricValve electricValve)
    {
        electricValve.setUpdateTime(DateUtils.getNowDate());
        return electricValveMapper.updateElectricValve(electricValve);
    }

    /**
     * 批量删除电动阀运行信息
     * 
     * @param electricValveIds 需要删除的电动阀运行信息ID
     * @return 结果
     */
    @Override
    public int deleteElectricValveByIds(String[] electricValveIds)
    {
        return electricValveMapper.deleteElectricValveByIds(electricValveIds);
    }

    /**
     * 删除电动阀运行信息信息
     * 
     * @param electricValveId 电动阀运行信息ID
     * @return 结果
     */
    @Override
    public int deleteElectricValveById(String electricValveId)
    {
        return electricValveMapper.deleteElectricValveById(electricValveId);
    }
}
