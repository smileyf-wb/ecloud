package com.ruoyi.ecloud.mapper;

import java.util.List;
import com.ruoyi.ecloud.domain.StationReal;

/**
 * 热力站点实时Mapper接口
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
public interface StationRealMapper 
{
    /**
     * 查询热力站点实时
     * 
     * @param pkStationId 热力站点实时ID
     * @return 热力站点实时
     */
    public StationReal selectStationRealById(String pkStationId);

    /**
     * 查询热力站点实时列表
     * 
     * @param stationReal 热力站点实时
     * @return 热力站点实时集合
     */
    public List<StationReal> selectStationRealList(StationReal stationReal);

    /**
     * 新增热力站点实时
     * 
     * @param stationReal 热力站点实时
     * @return 结果
     */
    public int insertStationReal(StationReal stationReal);

    /**
     * 修改热力站点实时
     * 
     * @param stationReal 热力站点实时
     * @return 结果
     */
    public int updateStationReal(StationReal stationReal);

    /**
     * 删除热力站点实时
     * 
     * @param pkStationId 热力站点实时ID
     * @return 结果
     */
    public int deleteStationRealById(String pkStationId);

    /**
     * 批量删除热力站点实时
     * 
     * @param pkStationIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteStationRealByIds(String[] pkStationIds);
}
