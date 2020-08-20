package com.ruoyi.ecloud.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ecloud.mapper.StationMapper;
import com.ruoyi.ecloud.domain.Station;
import com.ruoyi.ecloud.service.IStationService;

/**
 * 热力站点Service业务层处理
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
@Service
public class StationServiceImpl implements IStationService 
{
    @Autowired
    private StationMapper stationMapper;

    /**
     * 查询热力站点
     * 
     * @param pkStationId 热力站点ID
     * @return 热力站点
     */
    @Override
    public Station selectStationById(String pkStationId)
    {
        return stationMapper.selectStationById(pkStationId);
    }

    /**
     * 查询热力站点列表
     * 
     * @param station 热力站点
     * @return 热力站点
     */
    @Override
    public List<Station> selectStationList(Station station)
    {
        return stationMapper.selectStationList(station);
    }

    /**
     * 新增热力站点
     * 
     * @param station 热力站点
     * @return 结果
     */
    @Override
    public int insertStation(Station station)
    {
        return stationMapper.insertStation(station);
    }

    /**
     * 修改热力站点
     * 
     * @param station 热力站点
     * @return 结果
     */
    @Override
    public int updateStation(Station station)
    {
        station.setUpdateTime(DateUtils.getNowDate());
        return stationMapper.updateStation(station);
    }

    /**
     * 批量删除热力站点
     * 
     * @param pkStationIds 需要删除的热力站点ID
     * @return 结果
     */
    @Override
    public int deleteStationByIds(String[] pkStationIds)
    {
        return stationMapper.deleteStationByIds(pkStationIds);
    }

    /**
     * 删除热力站点信息
     * 
     * @param pkStationId 热力站点ID
     * @return 结果
     */
    @Override
    public int deleteStationById(String pkStationId)
    {
        return stationMapper.deleteStationById(pkStationId);
    }
}
