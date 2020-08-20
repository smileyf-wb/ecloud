package com.ruoyi.ecloud.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ecloud.mapper.CirculatePumpRealMapper;
import com.ruoyi.ecloud.domain.CirculatePumpReal;
import com.ruoyi.ecloud.service.ICirculatePumpRealService;

/**
 * 循环泵实时运行信息Service业务层处理
 * 
 * @author smile
 * @date 2020-08-17
 */
@Service
public class CirculatePumpRealServiceImpl implements ICirculatePumpRealService 
{
    @Autowired
    private CirculatePumpRealMapper circulatePumpRealMapper;

    /**
     * 查询循环泵实时运行信息
     * 
     * @param circulatePumpId 循环泵实时运行信息ID
     * @return 循环泵实时运行信息
     */
    @Override
    public CirculatePumpReal selectCirculatePumpRealById(String circulatePumpId)
    {
        return circulatePumpRealMapper.selectCirculatePumpRealById(circulatePumpId);
    }

    /**
     * 查询循环泵实时运行信息列表
     * 
     * @param circulatePumpReal 循环泵实时运行信息
     * @return 循环泵实时运行信息
     */
    @Override
    public List<CirculatePumpReal> selectCirculatePumpRealList(CirculatePumpReal circulatePumpReal)
    {
        return circulatePumpRealMapper.selectCirculatePumpRealList(circulatePumpReal);
    }

    /**
     * 新增循环泵实时运行信息
     * 
     * @param circulatePumpReal 循环泵实时运行信息
     * @return 结果
     */
    @Override
    public int insertCirculatePumpReal(CirculatePumpReal circulatePumpReal)
    {
        return circulatePumpRealMapper.insertCirculatePumpReal(circulatePumpReal);
    }

    /**
     * 修改循环泵实时运行信息
     * 
     * @param circulatePumpReal 循环泵实时运行信息
     * @return 结果
     */
    @Override
    public int updateCirculatePumpReal(CirculatePumpReal circulatePumpReal)
    {
        circulatePumpReal.setUpdateTime(DateUtils.getNowDate());
        return circulatePumpRealMapper.updateCirculatePumpReal(circulatePumpReal);
    }

    /**
     * 批量删除循环泵实时运行信息
     * 
     * @param circulatePumpIds 需要删除的循环泵实时运行信息ID
     * @return 结果
     */
    @Override
    public int deleteCirculatePumpRealByIds(String[] circulatePumpIds)
    {
        return circulatePumpRealMapper.deleteCirculatePumpRealByIds(circulatePumpIds);
    }

    /**
     * 删除循环泵实时运行信息信息
     * 
     * @param circulatePumpId 循环泵实时运行信息ID
     * @return 结果
     */
    @Override
    public int deleteCirculatePumpRealById(String circulatePumpId)
    {
        return circulatePumpRealMapper.deleteCirculatePumpRealById(circulatePumpId);
    }
}
