package com.ruoyi.ecloud.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ecloud.mapper.SecondWaterTSetMapper;
import com.ruoyi.ecloud.domain.SecondWaterTSet;
import com.ruoyi.ecloud.service.ISecondWaterTSetService;

/**
 * 二次温度设置Service业务层处理
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
@Service
public class SecondWaterTSetServiceImpl implements ISecondWaterTSetService 
{
    @Autowired
    private SecondWaterTSetMapper secondWaterTSetMapper;

    /**
     * 查询二次温度设置
     * 
     * @param climateCompensationtId 二次温度设置ID
     * @return 二次温度设置
     */
    @Override
    public SecondWaterTSet selectSecondWaterTSetById(String climateCompensationtId)
    {
        return secondWaterTSetMapper.selectSecondWaterTSetById(climateCompensationtId);
    }

    /**
     * 查询二次温度设置列表
     * 
     * @param secondWaterTSet 二次温度设置
     * @return 二次温度设置
     */
    @Override
    public List<SecondWaterTSet> selectSecondWaterTSetList(SecondWaterTSet secondWaterTSet)
    {
        return secondWaterTSetMapper.selectSecondWaterTSetList(secondWaterTSet);
    }

    /**
     * 新增二次温度设置
     * 
     * @param secondWaterTSet 二次温度设置
     * @return 结果
     */
    @Override
    public int insertSecondWaterTSet(SecondWaterTSet secondWaterTSet)
    {
        return secondWaterTSetMapper.insertSecondWaterTSet(secondWaterTSet);
    }

    /**
     * 修改二次温度设置
     * 
     * @param secondWaterTSet 二次温度设置
     * @return 结果
     */
    @Override
    public int updateSecondWaterTSet(SecondWaterTSet secondWaterTSet)
    {
        return secondWaterTSetMapper.updateSecondWaterTSet(secondWaterTSet);
    }

    /**
     * 批量删除二次温度设置
     * 
     * @param climateCompensationtIds 需要删除的二次温度设置ID
     * @return 结果
     */
    @Override
    public int deleteSecondWaterTSetByIds(String[] climateCompensationtIds)
    {
        return secondWaterTSetMapper.deleteSecondWaterTSetByIds(climateCompensationtIds);
    }

    /**
     * 删除二次温度设置信息
     * 
     * @param climateCompensationtId 二次温度设置ID
     * @return 结果
     */
    @Override
    public int deleteSecondWaterTSetById(String climateCompensationtId)
    {
        return secondWaterTSetMapper.deleteSecondWaterTSetById(climateCompensationtId);
    }
}
