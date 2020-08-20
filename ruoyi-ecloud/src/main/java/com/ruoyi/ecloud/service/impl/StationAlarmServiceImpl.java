package com.ruoyi.ecloud.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ecloud.mapper.StationAlarmMapper;
import com.ruoyi.ecloud.domain.StationAlarm;
import com.ruoyi.ecloud.service.IStationAlarmService;

/**
 * 热力站点异常信息Service业务层处理
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
@Service
public class StationAlarmServiceImpl implements IStationAlarmService 
{
    @Autowired
    private StationAlarmMapper stationAlarmMapper;

    /**
     * 查询热力站点异常信息
     * 
     * @param id 热力站点异常信息ID
     * @return 热力站点异常信息
     */
    @Override
    public StationAlarm selectStationAlarmById(String id)
    {
        return stationAlarmMapper.selectStationAlarmById(id);
    }

    /**
     * 查询热力站点异常信息列表
     * 
     * @param stationAlarm 热力站点异常信息
     * @return 热力站点异常信息
     */
    @Override
    public List<StationAlarm> selectStationAlarmList(StationAlarm stationAlarm)
    {
        return stationAlarmMapper.selectStationAlarmList(stationAlarm);
    }

    /**
     * 新增热力站点异常信息
     * 
     * @param stationAlarm 热力站点异常信息
     * @return 结果
     */
    @Override
    public int insertStationAlarm(StationAlarm stationAlarm)
    {
        return stationAlarmMapper.insertStationAlarm(stationAlarm);
    }

    /**
     * 修改热力站点异常信息
     * 
     * @param stationAlarm 热力站点异常信息
     * @return 结果
     */
    @Override
    public int updateStationAlarm(StationAlarm stationAlarm)
    {
        stationAlarm.setUpdateTime(DateUtils.getNowDate());
        return stationAlarmMapper.updateStationAlarm(stationAlarm);
    }

    /**
     * 批量删除热力站点异常信息
     * 
     * @param ids 需要删除的热力站点异常信息ID
     * @return 结果
     */
    @Override
    public int deleteStationAlarmByIds(String[] ids)
    {
        return stationAlarmMapper.deleteStationAlarmByIds(ids);
    }

    /**
     * 删除热力站点异常信息信息
     * 
     * @param id 热力站点异常信息ID
     * @return 结果
     */
    @Override
    public int deleteStationAlarmById(String id)
    {
        return stationAlarmMapper.deleteStationAlarmById(id);
    }
}
