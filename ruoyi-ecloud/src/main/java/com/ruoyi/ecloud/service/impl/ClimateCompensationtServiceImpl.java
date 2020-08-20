package com.ruoyi.ecloud.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ecloud.mapper.ClimateCompensationtMapper;
import com.ruoyi.ecloud.domain.ClimateCompensationt;
import com.ruoyi.ecloud.service.IClimateCompensationtService;

/**
 * 气候补偿参数下发信息Service业务层处理
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
@Service
public class ClimateCompensationtServiceImpl implements IClimateCompensationtService 
{
    @Autowired
    private ClimateCompensationtMapper climateCompensationtMapper;

    /**
     * 查询气候补偿参数下发信息
     * 
     * @param climateCompensationtId 气候补偿参数下发信息ID
     * @return 气候补偿参数下发信息
     */
    @Override
    public ClimateCompensationt selectClimateCompensationtById(String climateCompensationtId)
    {
        return climateCompensationtMapper.selectClimateCompensationtById(climateCompensationtId);
    }

    /**
     * 查询气候补偿参数下发信息列表
     * 
     * @param climateCompensationt 气候补偿参数下发信息
     * @return 气候补偿参数下发信息
     */
    @Override
    public List<ClimateCompensationt> selectClimateCompensationtList(ClimateCompensationt climateCompensationt)
    {
        return climateCompensationtMapper.selectClimateCompensationtList(climateCompensationt);
    }

    /**
     * 新增气候补偿参数下发信息
     * 
     * @param climateCompensationt 气候补偿参数下发信息
     * @return 结果
     */
    @Override
    public int insertClimateCompensationt(ClimateCompensationt climateCompensationt)
    {
        return climateCompensationtMapper.insertClimateCompensationt(climateCompensationt);
    }

    /**
     * 修改气候补偿参数下发信息
     * 
     * @param climateCompensationt 气候补偿参数下发信息
     * @return 结果
     */
    @Override
    public int updateClimateCompensationt(ClimateCompensationt climateCompensationt)
    {
        return climateCompensationtMapper.updateClimateCompensationt(climateCompensationt);
    }

    /**
     * 批量删除气候补偿参数下发信息
     * 
     * @param climateCompensationtIds 需要删除的气候补偿参数下发信息ID
     * @return 结果
     */
    @Override
    public int deleteClimateCompensationtByIds(String[] climateCompensationtIds)
    {
        return climateCompensationtMapper.deleteClimateCompensationtByIds(climateCompensationtIds);
    }

    /**
     * 删除气候补偿参数下发信息信息
     * 
     * @param climateCompensationtId 气候补偿参数下发信息ID
     * @return 结果
     */
    @Override
    public int deleteClimateCompensationtById(String climateCompensationtId)
    {
        return climateCompensationtMapper.deleteClimateCompensationtById(climateCompensationtId);
    }
}
