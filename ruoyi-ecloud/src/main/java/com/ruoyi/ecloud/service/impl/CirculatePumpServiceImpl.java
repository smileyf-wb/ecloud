package com.ruoyi.ecloud.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ecloud.mapper.CirculatePumpMapper;
import com.ruoyi.ecloud.domain.CirculatePump;
import com.ruoyi.ecloud.service.ICirculatePumpService;

/**
 * 循环泵l历史运行信息Service业务层处理
 * 
 * @author zhaojie
 * @date 2020-08-17
 */
@Service
public class CirculatePumpServiceImpl implements ICirculatePumpService 
{
    @Autowired
    private CirculatePumpMapper circulatePumpMapper;

    /**
     * 查询循环泵l历史运行信息
     * 
     * @param circulatePumpId 循环泵l历史运行信息ID
     * @return 循环泵l历史运行信息
     */
    @Override
    public CirculatePump selectCirculatePumpById(String circulatePumpId)
    {
        return circulatePumpMapper.selectCirculatePumpById(circulatePumpId);
    }

    /**
     * 查询循环泵l历史运行信息列表
     * 
     * @param circulatePump 循环泵l历史运行信息
     * @return 循环泵l历史运行信息
     */
    @Override
    public List<CirculatePump> selectCirculatePumpList(CirculatePump circulatePump)
    {
        return circulatePumpMapper.selectCirculatePumpList(circulatePump);
    }

    /**
     * 新增循环泵l历史运行信息
     * 
     * @param circulatePump 循环泵l历史运行信息
     * @return 结果
     */
    @Override
    public int insertCirculatePump(CirculatePump circulatePump)
    {
        return circulatePumpMapper.insertCirculatePump(circulatePump);
    }

    /**
     * 修改循环泵l历史运行信息
     * 
     * @param circulatePump 循环泵l历史运行信息
     * @return 结果
     */
    @Override
    public int updateCirculatePump(CirculatePump circulatePump)
    {
        circulatePump.setUpdateTime(DateUtils.getNowDate());
        return circulatePumpMapper.updateCirculatePump(circulatePump);
    }

    /**
     * 批量删除循环泵l历史运行信息
     * 
     * @param circulatePumpIds 需要删除的循环泵l历史运行信息ID
     * @return 结果
     */
    @Override
    public int deleteCirculatePumpByIds(String[] circulatePumpIds)
    {
        return circulatePumpMapper.deleteCirculatePumpByIds(circulatePumpIds);
    }

    /**
     * 删除循环泵l历史运行信息信息
     * 
     * @param circulatePumpId 循环泵l历史运行信息ID
     * @return 结果
     */
    @Override
    public int deleteCirculatePumpById(String circulatePumpId)
    {
        return circulatePumpMapper.deleteCirculatePumpById(circulatePumpId);
    }
}
