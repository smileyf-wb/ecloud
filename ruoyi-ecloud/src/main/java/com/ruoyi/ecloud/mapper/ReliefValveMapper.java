package com.ruoyi.ecloud.mapper;

import java.util.List;
import com.ruoyi.ecloud.domain.ReliefValve;

/**
 * 泄压阀信息Mapper接口
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
public interface ReliefValveMapper 
{
    /**
     * 查询泄压阀信息
     * 
     * @param reliefValveId 泄压阀信息ID
     * @return 泄压阀信息
     */
    public ReliefValve selectReliefValveById(String reliefValveId);

    /**
     * 查询泄压阀信息列表
     * 
     * @param reliefValve 泄压阀信息
     * @return 泄压阀信息集合
     */
    public List<ReliefValve> selectReliefValveList(ReliefValve reliefValve);

    /**
     * 新增泄压阀信息
     * 
     * @param reliefValve 泄压阀信息
     * @return 结果
     */
    public int insertReliefValve(ReliefValve reliefValve);

    /**
     * 修改泄压阀信息
     * 
     * @param reliefValve 泄压阀信息
     * @return 结果
     */
    public int updateReliefValve(ReliefValve reliefValve);

    /**
     * 删除泄压阀信息
     * 
     * @param reliefValveId 泄压阀信息ID
     * @return 结果
     */
    public int deleteReliefValveById(String reliefValveId);

    /**
     * 批量删除泄压阀信息
     * 
     * @param reliefValveIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteReliefValveByIds(String[] reliefValveIds);
}
