package com.ruoyi.ecloud.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 泄压阀信息对象 c_relief_valve
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
public class ReliefValve extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 泄压阀编号 */
    private String reliefValveId;

    /** 站点编号 */
    @Excel(name = "站点编号")
    private String stationId;

    /** 阀门状态 */
    @Excel(name = "阀门状态")
    private Long valveStatus;

    /** 开阀压力 */
    @Excel(name = "开阀压力")
    private Long openValveP;

    /** 关阀压力 */
    @Excel(name = "关阀压力")
    private Long closeValveP;

    public void setReliefValveId(String reliefValveId) 
    {
        this.reliefValveId = reliefValveId;
    }

    public String getReliefValveId() 
    {
        return reliefValveId;
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
    public void setOpenValveP(Long openValveP) 
    {
        this.openValveP = openValveP;
    }

    public Long getOpenValveP() 
    {
        return openValveP;
    }
    public void setCloseValveP(Long closeValveP) 
    {
        this.closeValveP = closeValveP;
    }

    public Long getCloseValveP() 
    {
        return closeValveP;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("reliefValveId", getReliefValveId())
            .append("stationId", getStationId())
            .append("valveStatus", getValveStatus())
            .append("openValveP", getOpenValveP())
            .append("closeValveP", getCloseValveP())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
