package com.ruoyi.ecloud.mapper;

import java.util.List;
import com.ruoyi.ecloud.domain.CirculatePumpReal;

/**
 * 循环泵实时运行信息Mapper接口
 * 
 * @author smile
 * @date 2020-08-17
 */
public interface CirculatePumpRealMapper 
{
    /**
     * 查询循环泵实时运行信息
     * 
     * @param circulatePumpId 循环泵实时运行信息ID
     * @return 循环泵实时运行信息
     */
    public CirculatePumpReal selectCirculatePumpRealById(String circulatePumpId);

    /**
     * 查询循环泵实时运行信息列表
     * 
     * @param circulatePumpReal 循环泵实时运行信息
     * @return 循环泵实时运行信息集合
     */
    public List<CirculatePumpReal> selectCirculatePumpRealList(CirculatePumpReal circulatePumpReal);

    /**
     * 新增循环泵实时运行信息
     * 
     * @param circulatePumpReal 循环泵实时运行信息
     * @return 结果
     */
    public int insertCirculatePumpReal(CirculatePumpReal circulatePumpReal);

    /**
     * 修改循环泵实时运行信息
     * 
     * @param circulatePumpReal 循环泵实时运行信息
     * @return 结果
     */
    public int updateCirculatePumpReal(CirculatePumpReal circulatePumpReal);

    /**
     * 删除循环泵实时运行信息
     * 
     * @param circulatePumpId 循环泵实时运行信息ID
     * @return 结果
     */
    public int deleteCirculatePumpRealById(String circulatePumpId);

    /**
     * 批量删除循环泵实时运行信息
     * 
     * @param circulatePumpIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteCirculatePumpRealByIds(String[] circulatePumpIds);
}
