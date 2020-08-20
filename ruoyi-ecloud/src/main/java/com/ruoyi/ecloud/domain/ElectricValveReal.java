package com.ruoyi.ecloud.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 电动阀门实时运行信息对象 c_electric_valve_real
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
public class ElectricValveReal extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 电动阀编号 */
    private String electricValveId;

    /** 站点编号 */
    @Excel(name = "站点编号")
    private String stationId;

    /** 阀门反馈 */
    @Excel(name = "阀门反馈")
    private String valveFeedBack;

    /** 阀门输出 */
    @Excel(name = "阀门输出")
    private String valveOutput;

    /** 控制模式 */
    @Excel(name = "控制模式")
    private Long controlModel;

    /** 手动输出 */
    @Excel(name = "手动输出")
    private Long manualOutput;

    /** 设置温度 */
    @Excel(name = "设置温度")
    private Long setT;

    /** P,阀门微分调节 */
    @Excel(name = "P,阀门微分调节")
    private Long p;

    /** I，阀门微分调节 */
    @Excel(name = "I，阀门微分调节")
    private Long i;

    /** D，阀门微分调节 */
    @Excel(name = "D，阀门微分调节")
    private Long d;

    /** 最大开度 */
    @Excel(name = "最大开度")
    private Long maxOpen;

    /** 最小开度 */
    @Excel(name = "最小开度")
    private Long minOpen;

    public void setElectricValveId(String electricValveId) 
    {
        this.electricValveId = electricValveId;
    }

    public String getElectricValveId() 
    {
        return electricValveId;
    }
    public void setStationId(String stationId) 
    {
        this.stationId = stationId;
    }

    public String getStationId() 
    {
        return stationId;
    }
    public void setValveFeedBack(String valveFeedBack) 
    {
        this.valveFeedBack = valveFeedBack;
    }

    public String getValveFeedBack() 
    {
        return valveFeedBack;
    }
    public void setValveOutput(String valveOutput) 
    {
        this.valveOutput = valveOutput;
    }

    public String getValveOutput() 
    {
        return valveOutput;
    }
    public void setControlModel(Long controlModel) 
    {
        this.controlModel = controlModel;
    }

    public Long getControlModel() 
    {
        return controlModel;
    }
    public void setManualOutput(Long manualOutput) 
    {
        this.manualOutput = manualOutput;
    }

    public Long getManualOutput() 
    {
        return manualOutput;
    }
    public void setSetT(Long setT) 
    {
        this.setT = setT;
    }

    public Long getSetT() 
    {
        return setT;
    }
    public void setP(Long p) 
    {
        this.p = p;
    }

    public Long getP() 
    {
        return p;
    }
    public void setI(Long i) 
    {
        this.i = i;
    }

    public Long getI() 
    {
        return i;
    }
    public void setD(Long d) 
    {
        this.d = d;
    }

    public Long getD() 
    {
        return d;
    }
    public void setMaxOpen(Long maxOpen) 
    {
        this.maxOpen = maxOpen;
    }

    public Long getMaxOpen() 
    {
        return maxOpen;
    }
    public void setMinOpen(Long minOpen) 
    {
        this.minOpen = minOpen;
    }

    public Long getMinOpen() 
    {
        return minOpen;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("electricValveId", getElectricValveId())
            .append("stationId", getStationId())
            .append("valveFeedBack", getValveFeedBack())
            .append("valveOutput", getValveOutput())
            .append("controlModel", getControlModel())
            .append("manualOutput", getManualOutput())
            .append("setT", getSetT())
            .append("p", getP())
            .append("i", getI())
            .append("d", getD())
            .append("maxOpen", getMaxOpen())
            .append("minOpen", getMinOpen())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
