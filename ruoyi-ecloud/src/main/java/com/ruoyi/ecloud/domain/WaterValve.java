package com.ruoyi.ecloud.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 补水阀门运行信息对象 c_water_valve
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
public class WaterValve extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 补水阀编号 */
    private String waterValveId;

    /** 站点编号 */
    @Excel(name = "站点编号")
    private String stationId;

    /** 阀门状态 */
    @Excel(name = "阀门状态")
    private Long valveStatus;

    /** 水箱液位 */
    @Excel(name = "水箱液位")
    private Long waterLevel;

    /** 开阀液位 */
    @Excel(name = "开阀液位")
    private Long openValveLevel;

    /** 关阀液位 */
    @Excel(name = "关阀液位")
    private Long closeValveLevel;

    /** 报警高限 */
    @Excel(name = "报警高限")
    private Long alarmUpperLimit;

    /** 报警低限 */
    @Excel(name = "报警低限")
    private Long alarmLowLimit;

    public void setWaterValveId(String waterValveId) 
    {
        this.waterValveId = waterValveId;
    }

    public String getWaterValveId() 
    {
        return waterValveId;
    }
    public void setStationId(String stationId) 
    {
        this.stationId = stationId;
    }

    public String getStationId() 
    {
        return stationId;
    }
    public void setValveStatus(Long valveStatus) 
    {
        this.valveStatus = valveStatus;
    }

    public Long getValveStatus() 
    {
        return valveStatus;
    }
    public void setWaterLevel(Long waterLevel) 
    {
        this.waterLevel = waterLevel;
    }

    public Long getWaterLevel() 
    {
        return waterLevel;
    }
    public void setOpenValveLevel(Long openValveLevel) 
    {
        this.openValveLevel = openValveLevel;
    }

    public Long getOpenValveLevel() 
    {
        return openValveLevel;
    }
    public void setCloseValveLevel(Long closeValveLevel) 
    {
        this.closeValveLevel = closeValveLevel;
    }

    public Long getCloseValveLevel() 
    {
        return closeValveLevel;
    }
    public void setAlarmUpperLimit(Long alarmUpperLimit) 
    {
        this.alarmUpperLimit = alarmUpperLimit;
    }

    public Long getAlarmUpperLimit() 
    {
        return alarmUpperLimit;
    }
    public void setAlarmLowLimit(Long alarmLowLimit) 
    {
        this.alarmLowLimit = alarmLowLimit;
    }

    public Long getAlarmLowLimit() 
    {
        return alarmLowLimit;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("waterValveId", getWaterValveId())
            .append("stationId", getStationId())
            .append("valveStatus", getValveStatus())
            .append("waterLevel", getWaterLevel())
            .append("openValveLevel", getOpenValveLevel())
            .append("closeValveLevel", getCloseValveLevel())
            .append("alarmUpperLimit", getAlarmUpperLimit())
            .append("alarmLowLimit", getAlarmLowLimit())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
