package com.ruoyi.ecloud.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 定时模式对象 c_time_model
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
public class TimeModel extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    private String stationId;

    /** TIME_MODEL_ID */
    @Excel(name = "TIME_MODEL_ID")
    private String timeModelId;

    /** TIME */
    @Excel(name = "TIME")
    private String time;

    /** WEEK */
    @Excel(name = "WEEK")
    private String week;

    /** MODEL */
    @Excel(name = "MODEL")
    private String model;

    public void setTimeModelId(String timeModelId) 
    {
        this.timeModelId = timeModelId;
    }

    public String getTimeModelId() 
    {
        return timeModelId;
    }
    public void setTime(String time) 
    {
        this.time = time;
    }

    public String getTime() 
    {
        return time;
    }
    public void setWeek(String week) 
    {
        this.week = week;
    }

    public String getWeek() 
    {
        return week;
    }
    public void setModel(String model) 
    {
        this.model = model;
    }

    public String getModel() 
    {
        return model;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("timeModelId", getTimeModelId())
            .append("time", getTime())
            .append("week", getWeek())
            .append("model", getModel())
            .toString();
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }
}
