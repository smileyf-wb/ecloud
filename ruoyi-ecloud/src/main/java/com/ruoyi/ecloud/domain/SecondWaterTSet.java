package com.ruoyi.ecloud.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 二次温度设置对象 c_second_water_t_set
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
public class SecondWaterTSet extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** CLIMATE_COMPENSATIONT_ID */
    private String climateCompensationtId;

    /** 室外温度 */
    @Excel(name = "室外温度")
    private Long outdoorT;

    /** 二次供水温度 */
    @Excel(name = "二次供水温度")
    private Long secondWaterT;

    /** $column.columnComment */
    @Excel(name = "二次供水温度")
    private String stationId;

    public void setClimateCompensationtId(String climateCompensationtId) 
    {
        this.climateCompensationtId = climateCompensationtId;
    }

    public String getClimateCompensationtId() 
    {
        return climateCompensationtId;
    }
    public void setOutdoorT(Long outdoorT) 
    {
        this.outdoorT = outdoorT;
    }

    public Long getOutdoorT() 
    {
        return outdoorT;
    }
    public void setSecondWaterT(Long secondWaterT) 
    {
        this.secondWaterT = secondWaterT;
    }

    public Long getSecondWaterT() 
    {
        return secondWaterT;
    }
    public void setStationId(String stationId) 
    {
        this.stationId = stationId;
    }

    public String getStationId() 
    {
        return stationId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("climateCompensationtId", getClimateCompensationtId())
            .append("outdoorT", getOutdoorT())
            .append("secondWaterT", getSecondWaterT())
            .append("stationId", getStationId())
            .toString();
    }
}
