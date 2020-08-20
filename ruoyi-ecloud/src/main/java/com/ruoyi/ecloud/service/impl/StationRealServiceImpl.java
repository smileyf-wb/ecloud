package com.ruoyi.ecloud.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ecloud.mapper.StationRealMapper;
import com.ruoyi.ecloud.domain.StationReal;
import com.ruoyi.ecloud.service.IStationRealService;

/**
 * 热力站点实时Service业务层处理
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
@Service
public class StationRealServiceImpl implements IStationRealService 
{
    @Autowired
    private StationRealMapper stationRealMapper;

    /**
     * 查询热力站点实时
     * 
     * @param pkStationId 热力站点实时ID
     * @return 热力站点实时
     */
    @Override
    public StationReal selectStationRealById(String pkStationId)
    {
        return stationRealMapper.selectStationRealById(pkStationId);
    }

    /**
     * 查询热力站点实时列表
     * 
     * @param stationReal 热力站点实时
     * @return 热力站点实时
     */
    @Override
    public List<StationReal> selectStationRealList(StationReal stationReal)
    {
        return stationRealMapper.selectStationRealList(stationReal);
    }

    /**
     * 新增热力站点实时
     * 
     * @param stationReal 热力站点实时
     * @return 结果
     */
    @Override
    public int insertStationReal(StationReal stationReal)
    {
        return stationRealMapper.insertStationReal(stationReal);
    }

    /**
     * 修改热力站点实时
     * 
     * @param stationReal 热力站点实时
     * @return 结果
     */
    @Override
    public int updateStationReal(StationReal stationReal)
    {
        stationReal.setUpdateTime(DateUtils.getNowDate());
        return stationRealMapper.updateStationReal(stationReal);
    }

    /**
     * 批量删除热力站点实时
     * 
     * @param pkStationIds 需要删除的热力站点实时ID
     * @return 结果
     */
    @Override
    public int deleteStationRealByIds(String[] pkStationIds)
    {
        return stationRealMapper.deleteStationRealByIds(pkStationIds);
    }

    /**
     * 删除热力站点实时信息
     * 
     * @param pkStationId 热力站点实时ID
     * @return 结果
     */
    @Override
    public int deleteStationRealById(String pkStationId)
    {
        return stationRealMapper.deleteStationRealById(pkStationId);
    }
}
