package com.ruoyi.ecloud.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ecloud.mapper.ReliefValveMapper;
import com.ruoyi.ecloud.domain.ReliefValve;
import com.ruoyi.ecloud.service.IReliefValveService;

/**
 * 泄压阀信息Service业务层处理
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
@Service
public class ReliefValveServiceImpl implements IReliefValveService 
{
    @Autowired
    private ReliefValveMapper reliefValveMapper;

    /**
     * 查询泄压阀信息
     * 
     * @param reliefValveId 泄压阀信息ID
     * @return 泄压阀信息
     */
    @Override
    public ReliefValve selectReliefValveById(String reliefValveId)
    {
        return reliefValveMapper.selectReliefValveById(reliefValveId);
    }

    /**
     * 查询泄压阀信息列表
     * 
     * @param reliefValve 泄压阀信息
     * @return 泄压阀信息
     */
    @Override
    public List<ReliefValve> selectReliefValveList(ReliefValve reliefValve)
    {
        return reliefValveMapper.selectReliefValveList(reliefValve);
    }

    /**
     * 新增泄压阀信息
     * 
     * @param reliefValve 泄压阀信息
     * @return 结果
     */
    @Override
    public int insertReliefValve(ReliefValve reliefValve)
    {
        return reliefValveMapper.insertReliefValve(reliefValve);
    }

    /**
     * 修改泄压阀信息
     * 
     * @param reliefValve 泄压阀信息
     * @return 结果
     */
    @Override
    public int updateReliefValve(ReliefValve reliefValve)
    {
        reliefValve.setUpdateTime(DateUtils.getNowDate());
        return reliefValveMapper.updateReliefValve(reliefValve);
    }

    /**
     * 批量删除泄压阀信息
     * 
     * @param reliefValveIds 需要删除的泄压阀信息ID
     * @return 结果
     */
    @Override
    public int deleteReliefValveByIds(String[] reliefValveIds)
    {
        return reliefValveMapper.deleteReliefValveByIds(reliefValveIds);
    }

    /**
     * 删除泄压阀信息信息
     * 
     * @param reliefValveId 泄压阀信息ID
     * @return 结果
     */
    @Override
    public int deleteReliefValveById(String reliefValveId)
    {
        return reliefValveMapper.deleteReliefValveById(reliefValveId);
    }
}
