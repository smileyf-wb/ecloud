package com.ruoyi.ecloud.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 热表实时信息对象 c_heat_meter_real
 * 
 * @author ecloud
 * @date 2020-08-18
 */
public class HeatMeterReal extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 热表编号 */
    private String heatMeterId;

    /** 热表供水温度 */
    @Excel(name = "热表供水温度")
    private Long waterT;

    /** 热表回水温度 */
    @Excel(name = "热表回水温度")
    private Long backWaterT;

    /** 瞬时流量 */
    @Excel(name = "瞬时流量")
    private Long instantaneousWater;

    /** 瞬时热量 */
    @Excel(name = "瞬时热量")
    private Long instantaneousHeat;

    /** 累计流量 */
    @Excel(name = "累计流量")
    private Long totalWater;

    /** 累计热量 */
    @Excel(name = "累计热量")
    private Long totalHeat;

    /** 站点编号 */
    @Excel(name = "站点编号")
    private Long stationId;

    /** 热表通讯状态 */
    @Excel(name = "热表通讯状态")
    private Long communicationStatus;

    /** 热表类型 */
    @Excel(name = "热表类型")
    private Long meterType;

    public void setHeatMeterId(String heatMeterId) 
    {
        this.heatMeterId = heatMeterId;
    }

    public String getHeatMeterId() 
    {
        return heatMeterId;
    }
    public void setWaterT(Long waterT) 
    {
        this.waterT = waterT;
    }

    public Long getWaterT() 
    {
        return waterT;
    }
    public void setBackWaterT(Long backWaterT) 
    {
        this.backWaterT = backWaterT;
    }

    public Long getBackWaterT() 
    {
        return backWaterT;
    }
    public void setInstantaneousWater(Long instantaneousWater) 
    {
        this.instantaneousWater = instantaneousWater;
    }

    public Long getInstantaneousWater() 
    {
        return instantaneousWater;
    }
    public void setInstantaneousHeat(Long instantaneousHeat) 
    {
        this.instantaneousHeat = instantaneousHeat;
    }

    public Long getInstantaneousHeat() 
    {
        return instantaneousHeat;
    }
    public void setTotalWater(Long totalWater) 
    {
        this.totalWater = totalWater;
    }

    public Long getTotalWater() 
    {
        return totalWater;
    }
    public void setTotalHeat(Long totalHeat) 
    {
        this.totalHeat = totalHeat;
    }

    public Long getTotalHeat() 
    {
        return totalHeat;
    }
    public void setStationId(Long stationId) 
    {
        this.stationId = stationId;
    }

    public Long getStationId() 
    {
        return stationId;
    }
    public void setCommunicationStatus(Long communicationStatus) 
    {
        this.communicationStatus = communicationStatus;
    }

    public Long getCommunicationStatus() 
    {
        return communicationStatus;
    }
    public void setMeterType(Long meterType) 
    {
        this.meterType = meterType;
    }

    public Long getMeterType() 
    {
        return meterType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("heatMeterId", getHeatMeterId())
            .append("waterT", getWaterT())
            .append("backWaterT", getBackWaterT())
            .append("instantaneousWater", getInstantaneousWater())
            .append("instantaneousHeat", getInstantaneousHeat())
            .append("totalWater", getTotalWater())
            .append("totalHeat", getTotalHeat())
            .append("stationId", getStationId())
            .append("updateTime", getUpdateTime())
            .append("communicationStatus", getCommunicationStatus())
            .append("meterType", getMeterType())
            .toString();
    }
}
