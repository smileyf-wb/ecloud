package com.ruoyi.ecloud.service;

import java.util.List;
import com.ruoyi.ecloud.domain.Station;

/**
 * 热力站点Service接口
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
public interface IStationService 
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
     * 批量删除热力站点
     * 
     * @param pkStationIds 需要删除的热力站点ID
     * @return 结果
     */
    public int deleteStationByIds(String[] pkStationIds);

    /**
     * 删除热力站点信息
     * 
     * @param pkStationId 热力站点ID
     * @return 结果
     */
    public int deleteStationById(String pkStationId);
}
