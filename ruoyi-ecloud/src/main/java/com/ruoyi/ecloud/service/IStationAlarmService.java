package com.ruoyi.ecloud.service;

import java.util.List;
import com.ruoyi.ecloud.domain.StationAlarm;

/**
 * 热力站点异常信息Service接口
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
public interface IStationAlarmService 
{
    /**
     * 查询热力站点异常信息
     * 
     * @param id 热力站点异常信息ID
     * @return 热力站点异常信息
     */
    public StationAlarm selectStationAlarmById(String id);

    /**
     * 查询热力站点异常信息列表
     * 
     * @param stationAlarm 热力站点异常信息
     * @return 热力站点异常信息集合
     */
    public List<StationAlarm> selectStationAlarmList(StationAlarm stationAlarm);

    /**
     * 新增热力站点异常信息
     * 
     * @param stationAlarm 热力站点异常信息
     * @return 结果
     */
    public int insertStationAlarm(StationAlarm stationAlarm);

    /**
     * 修改热力站点异常信息
     * 
     * @param stationAlarm 热力站点异常信息
     * @return 结果
     */
    public int updateStationAlarm(StationAlarm stationAlarm);

    /**
     * 批量删除热力站点异常信息
     * 
     * @param ids 需要删除的热力站点异常信息ID
     * @return 结果
     */
    public int deleteStationAlarmByIds(String[] ids);

    /**
     * 删除热力站点异常信息信息
     * 
     * @param id 热力站点异常信息ID
     * @return 结果
     */
    public int deleteStationAlarmById(String id);
}
