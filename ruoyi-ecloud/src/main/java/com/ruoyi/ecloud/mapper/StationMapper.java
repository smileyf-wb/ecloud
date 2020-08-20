package com.ruoyi.ecloud.mapper;

import java.util.List;
import com.ruoyi.ecloud.domain.Station;

/**
 * 热力站点Mapper接口
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
public interface StationMapper 
{
    /**
     * 查询热力站点
     * 
     * @param pkStationId 热力站点ID
     * @return 热力站点
     */
    public Station selectStationById(String pkStationId);

    /**
     * 查询热力站点列表
     * 
     * @param station 热力站点
     * @return 热力站点集合
     */
    public List<Station> selectStationList(Station station);

    /**
     * 新增热力站点
     * 
     * @param station 热力站点
     * @return 结果
     */
    public int insertStation(Station station);

    /**
     * 修改热力站点
     * 
     * @param station 热力站点
     * @return 结果
     */
    public int updateStation(Station station);

    /**
     * 删除热力站点
     * 
     * @param pkStationId 热力站点ID
     * @return 结果
     */
    public int deleteStationById(String pkStationId);

    /**
     * 批量删除热力站点
     * 
     * @param pkStationIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteStationByIds(String[] pkStationIds);
}
