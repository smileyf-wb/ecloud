package com.ruoyi.ecloud.service;

import java.util.List;
import com.ruoyi.ecloud.domain.ReliefValveReal;

/**
 * 泄压阀实时信息Service接口
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
public interface IReliefValveRealService 
{
    /**
     * 查询泄压阀实时信息
     * 
     * @param reliefValveId 泄压阀实时信息ID
     * @return 泄压阀实时信息
     */
    public ReliefValveReal selectReliefValveRealById(String reliefValveId);

    /**
     * 查询泄压阀实时信息列表
     * 
     * @param reliefValveReal 泄压阀实时信息
     * @return 泄压阀实时信息集合
     */
    public List<ReliefValveReal> selectReliefValveRealList(ReliefValveReal reliefValveReal);

    /**
     * 新增泄压阀实时信息
     * 
     * @param reliefValveReal 泄压阀实时信息
     * @return 结果
     */
    public int insertReliefValveReal(ReliefValveReal reliefValveReal);

    /**
     * 修改泄压阀实时信息
     * 
     * @param reliefValveReal 泄压阀实时信息
     * @return 结果
     */
    public int updateReliefValveReal(ReliefValveReal reliefValveReal);

    /**
     * 批量删除泄压阀实时信息
     * 
     * @param reliefValveIds 需要删除的泄压阀实时信息ID
     * @return 结果
     */
    public int deleteReliefValveRealByIds(String[] reliefValveIds);

    /**
     * 删除泄压阀实时信息信息
     * 
     * @param reliefValveId 泄压阀实时信息ID
     * @return 结果
     */
    public int deleteReliefValveRealById(String reliefValveId);
}
