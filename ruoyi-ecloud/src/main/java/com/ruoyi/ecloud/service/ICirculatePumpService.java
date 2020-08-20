package com.ruoyi.ecloud.service;

import java.util.List;
import com.ruoyi.ecloud.domain.CirculatePump;

/**
 * 循环泵l历史运行信息Service接口
 * 
 * @author zhaojie
 * @date 2020-08-17
 */
public interface ICirculatePumpService 
{
    /**
     * 查询循环泵l历史运行信息
     * 
     * @param circulatePumpId 循环泵l历史运行信息ID
     * @return 循环泵l历史运行信息
     */
    public CirculatePump selectCirculatePumpById(String circulatePumpId);

    /**
     * 查询循环泵l历史运行信息列表
     * 
     * @param circulatePump 循环泵l历史运行信息
     * @return 循环泵l历史运行信息集合
     */
    public List<CirculatePump> selectCirculatePumpList(CirculatePump circulatePump);

    /**
     * 新增循环泵l历史运行信息
     * 
     * @param circulatePump 循环泵l历史运行信息
     * @return 结果
     */
    public int insertCirculatePump(CirculatePump circulatePump);

    /**
     * 修改循环泵l历史运行信息
     * 
     * @param circulatePump 循环泵l历史运行信息
     * @return 结果
     */
    public int updateCirculatePump(CirculatePump circulatePump);

    /**
     * 批量删除循环泵l历史运行信息
     * 
     * @param circulatePumpIds 需要删除的循环泵l历史运行信息ID
     * @return 结果
     */
    public int deleteCirculatePumpByIds(String[] circulatePumpIds);

    /**
     * 删除循环泵l历史运行信息信息
     * 
     * @param circulatePumpId 循环泵l历史运行信息ID
     * @return 结果
     */
    public int deleteCirculatePumpById(String circulatePumpId);
}
