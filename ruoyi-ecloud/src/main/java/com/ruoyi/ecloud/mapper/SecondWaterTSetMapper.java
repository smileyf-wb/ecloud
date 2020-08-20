package com.ruoyi.ecloud.mapper;

import java.util.List;
import com.ruoyi.ecloud.domain.SecondWaterTSet;

/**
 * 二次温度设置Mapper接口
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
public interface SecondWaterTSetMapper 
{
    /**
     * 查询二次温度设置
     * 
     * @param climateCompensationtId 二次温度设置ID
     * @return 二次温度设置
     */
    public SecondWaterTSet selectSecondWaterTSetById(String climateCompensationtId);

    /**
     * 查询二次温度设置列表
     * 
     * @param secondWaterTSet 二次温度设置
     * @return 二次温度设置集合
     */
    public List<SecondWaterTSet> selectSecondWaterTSetList(SecondWaterTSet secondWaterTSet);

    /**
     * 新增二次温度设置
     * 
     * @param secondWaterTSet 二次温度设置
     * @return 结果
     */
    public int insertSecondWaterTSet(SecondWaterTSet secondWaterTSet);

    /**
     * 修改二次温度设置
     * 
     * @param secondWaterTSet 二次温度设置
     * @return 结果
     */
    public int updateSecondWaterTSet(SecondWaterTSet secondWaterTSet);

    /**
     * 删除二次温度设置
     * 
     * @param climateCompensationtId 二次温度设置ID
     * @return 结果
     */
    public int deleteSecondWaterTSetById(String climateCompensationtId);

    /**
     * 批量删除二次温度设置
     * 
     * @param climateCompensationtIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteSecondWaterTSetByIds(String[] climateCompensationtIds);
}
