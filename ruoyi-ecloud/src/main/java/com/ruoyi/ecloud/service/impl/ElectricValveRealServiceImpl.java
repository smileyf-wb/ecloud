package com.ruoyi.ecloud.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ecloud.mapper.ElectricValveRealMapper;
import com.ruoyi.ecloud.domain.ElectricValveReal;
import com.ruoyi.ecloud.service.IElectricValveRealService;

/**
 * 电动阀门实时运行信息Service业务层处理
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
@Service
public class ElectricValveRealServiceImpl implements IElectricValveRealService 
{
    @Autowired
    private ElectricValveRealMapper electricValveRealMapper;

    /**
     * 查询电动阀门实时运行信息
     * 
     * @param electricValveId 电动阀门实时运行信息ID
     * @return 电动阀门实时运行信息
     */
    @Override
    public ElectricValveReal selectElectricValveRealById(String electricValveId)
    {
        return electricValveRealMapper.selectElectricValveRealById(electricValveId);
    }

    /**
     * 查询电动阀门实时运行信息列表
     * 
     * @param electricValveReal 电动阀门实时运行信息
     * @return 电动阀门实时运行信息
     */
    @Override
    public List<ElectricValveReal> selectElectricValveRealList(ElectricValveReal electricValveReal)
    {
        return electricValveRealMapper.selectElectricValveRealList(electricValveReal);
    }

    /**
     * 新增电动阀门实时运行信息
     * 
     * @param electricValveReal 电动阀门实时运行信息
     * @return 结果
     */
    @Override
    public int insertElectricValveReal(ElectricValveReal electricValveReal)
    {
        return electricValveRealMapper.insertElectricValveReal(electricValveReal);
    }

    /**
     * 修改电动阀门实时运行信息
     * 
     * @param electricValveReal 电动阀门实时运行信息
     * @return 结果
     */
    @Override
    public int updateElectricValveReal(ElectricValveReal electricValveReal)
    {
        electricValveReal.setUpdateTime(DateUtils.getNowDate());
        return electricValveRealMapper.updateElectricValveReal(electricValveReal);
    }

    /**
     * 批量删除电动阀门实时运行信息
     * 
     * @param electricValveIds 需要删除的电动阀门实时运行信息ID
     * @return 结果
     */
    @Override
    public int deleteElectricValveRealByIds(String[] electricValveIds)
    {
        return electricValveRealMapper.deleteElectricValveRealByIds(electricValveIds);
    }

    /**
     * 删除电动阀门实时运行信息信息
     * 
     * @param electricValveId 电动阀门实时运行信息ID
     * @return 结果
     */
    @Override
    public int deleteElectricValveRealById(String electricValveId)
    {
        return electricValveRealMapper.deleteElectricValveRealById(electricValveId);
    }
}
