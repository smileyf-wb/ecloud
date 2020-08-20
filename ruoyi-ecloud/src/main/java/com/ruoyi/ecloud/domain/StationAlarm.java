package com.ruoyi.ecloud.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 热力站点异常信息对象 c_station_alarm
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
public class StationAlarm extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    @Excel(name = "ID")
    private String id;

    /** STATION_ID */
    @Excel(name = "STATION_ID")
    private Long stationId;

    /** 一次供水温度异常 */
    @Excel(name = "一次供水温度异常")
    private Long onceWaterTAlarm;

    /** 二次供水温度异常 */
    @Excel(name = "二次供水温度异常")
    private Long secondWaterTAlarm;

    /** 一次回水温度异常 */
    @Excel(name = "一次回水温度异常")
    private Long onceBackWaterTAlarm;

    /** 二次回水温度异常 */
    @Excel(name = "二次回水温度异常")
    private Long secondBackWaterTAlarm;

    /** 一次供水压力异常 */
    @Excel(name = "一次供水压力异常")
    private Long onceWaterPAlarm;

    /** 一次回水压力异常 */
    @Excel(name = "一次回水压力异常")
    private Long onceBackWaterPAlarm;

    /** 二次供水压力异常 */
    @Excel(name = "二次供水压力异常")
    private Long secondWaterPAlarm;

    /** 二次回水压力异常 */
    @Excel(name = "二次回水压力异常")
    private Long secondBackWaterPAlarm;

    /** 瞬时流量异常 */
    @Excel(name = "瞬时流量异常")
    private Long instantaneousWaterAlarm;

    /** 瞬时热量异常 */
    @Excel(name = "瞬时热量异常")
    private Long instantaneousHeatAlarm;

    /** 瞬时补水异常 */
    @Excel(name = "瞬时补水异常")
    private Long itnstantaneousAddWaterAlarm;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setStationId(Long stationId) 
    {
        this.stationId = stationId;
    }

    public Long getStationId() 
    {
        return stationId;
    }
    public void setOnceWaterTAlarm(Long onceWaterTAlarm) 
    {
        this.onceWaterTAlarm = onceWaterTAlarm;
    }

    public Long getOnceWaterTAlarm() 
    {
        return onceWaterTAlarm;
    }
    public void setSecondWaterTAlarm(Long secondWaterTAlarm) 
    {
        this.secondWaterTAlarm = secondWaterTAlarm;
    }

    public Long getSecondWaterTAlarm() 
    {
        return secondWaterTAlarm;
    }
    public void setOnceBackWaterTAlarm(Long onceBackWaterTAlarm) 
    {
        this.onceBackWaterTAlarm = onceBackWaterTAlarm;
    }

    public Long getOnceBackWaterTAlarm() 
    {
        return onceBackWaterTAlarm;
    }
    public void setSecondBackWaterTAlarm(Long secondBackWaterTAlarm) 
    {
        this.secondBackWaterTAlarm = secondBackWaterTAlarm;
    }

    public Long getSecondBackWaterTAlarm() 
    {
        return secondBackWaterTAlarm;
    }
    public void setOnceWaterPAlarm(Long onceWaterPAlarm) 
    {
        this.onceWaterPAlarm = onceWaterPAlarm;
    }

    public Long getOnceWaterPAlarm() 
    {
        return onceWaterPAlarm;
    }
    public void setOnceBackWaterPAlarm(Long onceBackWaterPAlarm) 
    {
        this.onceBackWaterPAlarm = onceBackWaterPAlarm;
    }

    public Long getOnceBackWaterPAlarm() 
    {
        return onceBackWaterPAlarm;
    }
    public void setSecondWaterPAlarm(Long secondWaterPAlarm) 
    {
        this.secondWaterPAlarm = secondWaterPAlarm;
    }

    public Long getSecondWaterPAlarm() 
    {
        return secondWaterPAlarm;
    }
    public void setSecondBackWaterPAlarm(Long secondBackWaterPAlarm) 
    {
        this.secondBackWaterPAlarm = secondBackWaterPAlarm;
    }

    public Long getSecondBackWaterPAlarm() 
    {
        return secondBackWaterPAlarm;
    }
    public void setInstantaneousWaterAlarm(Long instantaneousWaterAlarm) 
    {
        this.instantaneousWaterAlarm = instantaneousWaterAlarm;
    }

    public Long getInstantaneousWaterAlarm() 
    {
        return instantaneousWaterAlarm;
    }
    public void setInstantaneousHeatAlarm(Long instantaneousHeatAlarm) 
    {
        this.instantaneousHeatAlarm = instantaneousHeatAlarm;
    }

    public Long getInstantaneousHeatAlarm() 
    {
        return instantaneousHeatAlarm;
    }
    public void setItnstantaneousAddWaterAlarm(Long itnstantaneousAddWaterAlarm) 
    {
        this.itnstantaneousAddWaterAlarm = itnstantaneousAddWaterAlarm;
    }

    public Long getItnstantaneousAddWaterAlarm() 
    {
        return itnstantaneousAddWaterAlarm;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("stationId", getStationId())
            .append("onceWaterTAlarm", getOnceWaterTAlarm())
            .append("secondWaterTAlarm", getSecondWaterTAlarm())
            .append("onceBackWaterTAlarm", getOnceBackWaterTAlarm())
            .append("secondBackWaterTAlarm", getSecondBackWaterTAlarm())
            .append("onceWaterPAlarm", getOnceWaterPAlarm())
            .append("onceBackWaterPAlarm", getOnceBackWaterPAlarm())
            .append("secondWaterPAlarm", getSecondWaterPAlarm())
            .append("secondBackWaterPAlarm", getSecondBackWaterPAlarm())
            .append("instantaneousWaterAlarm", getInstantaneousWaterAlarm())
            .append("instantaneousHeatAlarm", getInstantaneousHeatAlarm())
            .append("itnstantaneousAddWaterAlarm", getItnstantaneousAddWaterAlarm())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
