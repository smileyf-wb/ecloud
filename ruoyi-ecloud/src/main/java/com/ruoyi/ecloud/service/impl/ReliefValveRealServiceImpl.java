package com.ruoyi.ecloud.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ecloud.mapper.ReliefValveRealMapper;
import com.ruoyi.ecloud.domain.ReliefValveReal;
import com.ruoyi.ecloud.service.IReliefValveRealService;

/**
 * 泄压阀实时信息Service业务层处理
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
@Service
public class ReliefValveRealServiceImpl implements IReliefValveRealService 
{
    @Autowired
    private ReliefValveRealMapper reliefValveRealMapper;

    /**
     * 查询泄压阀实时信息
     * 
     * @param reliefValveId 泄压阀实时信息ID
     * @return 泄压阀实时信息
     */
    @Override
    public ReliefValveReal selectReliefValveRealById(String reliefValveId)
    {
        return reliefValveRealMapper.selectReliefValveRealById(reliefValveId);
    }

    /**
     * 查询泄压阀实时信息列表
     * 
     * @param reliefValveReal 泄压阀实时信息
     * @return 泄压阀实时信息
     */
    @Override
    public List<ReliefValveReal> selectReliefValveRealList(ReliefValveReal reliefValveReal)
    {
        return reliefValveRealMapper.selectReliefValveRealList(reliefValveReal);
    }

    /**
     * 新增泄压阀实时信息
     * 
     * @param reliefValveReal 泄压阀实时信息
     * @return 结果
     */
    @Override
    public int insertReliefValveReal(ReliefValveReal reliefValveReal)
    {
        return reliefValveRealMapper.insertReliefValveReal(reliefValveReal);
    }

    /**
     * 修改泄压阀实时信息
     * 
     * @param reliefValveReal 泄压阀实时信息
     * @return 结果
     */
    @Override
    public int updateReliefValveReal(ReliefValveReal reliefValveReal)
    {
        reliefValveReal.setUpdateTime(DateUtils.getNowDate());
        return reliefValveRealMapper.updateReliefValveReal(reliefValveReal);
    }

    /**
     * 批量删除泄压阀实时信息
     * 
     * @param reliefValveIds 需要删除的泄压阀实时信息ID
     * @return 结果
     */
    @Override
    public int deleteReliefValveRealByIds(String[] reliefValveIds)
    {
        return reliefValveRealMapper.deleteReliefValveRealByIds(reliefValveIds);
    }

    /**
     * 删除泄压阀实时信息信息
     * 
     * @param reliefValveId 泄压阀实时信息ID
     * @return 结果
     */
    @Override
    public int deleteReliefValveRealById(String reliefValveId)
    {
        return reliefValveRealMapper.deleteReliefValveRealById(reliefValveId);
    }
}
