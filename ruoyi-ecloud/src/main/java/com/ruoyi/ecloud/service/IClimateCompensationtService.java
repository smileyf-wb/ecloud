package com.ruoyi.ecloud.service;

import java.util.List;
import com.ruoyi.ecloud.domain.ClimateCompensationt;

/**
 * 气候补偿参数下发信息Service接口
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
public interface IClimateCompensationtService 
{
    /**
     * 查询气候补偿参数下发信息
     * 
     * @param climateCompensationtId 气候补偿参数下发信息ID
     * @return 气候补偿参数下发信息
     */
    public ClimateCompensationt selectClimateCompensationtById(String climateCompensationtId);

    /**
     * 查询气候补偿参数下发信息列表
     * 
     * @param climateCompensationt 气候补偿参数下发信息
     * @return 气候补偿参数下发信息集合
     */
    public List<ClimateCompensationt> selectClimateCompensationtList(ClimateCompensationt climateCompensationt);

    /**
     * 新增气候补偿参数下发信息
     * 
     * @param climateCompensationt 气候补偿参数下发信息
     * @return 结果
     */
    public int insertClimateCompensationt(ClimateCompensationt climateCompensationt);

    /**
     * 修改气候补偿参数下发信息
     * 
     * @param climateCompensationt 气候补偿参数下发信息
     * @return 结果
     */
    public int updateClimateCompensationt(ClimateCompensationt climateCompensationt);

    /**
     * 批量删除气候补偿参数下发信息
     * 
     * @param climateCompensationtIds 需要删除的气候补偿参数下发信息ID
     * @return 结果
     */
    public int deleteClimateCompensationtByIds(String[] climateCompensationtIds);

    /**
     * 删除气候补偿参数下发信息信息
     * 
     * @param climateCompensationtId 气候补偿参数下发信息ID
     * @return 结果
     */
    public int deleteClimateCompensationtById(String climateCompensationtId);
}
