package com.ruoyi.ecloud.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 补水泵实时运行信息对象 c_water_pump_real
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
public class WaterPumpReal extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 补水泵编号 */
    private String waterPumpId;

    /** 运行状态 */
    @Excel(name = "运行状态")
    private Long runStatus;

    /** 运行模式 */
    @Excel(name = "运行模式")
    private Long runModel;

    /** 控制命令 */
    @Excel(name = "控制命令")
    private Long controlOrder;

    /** 频率输出 */
    @Excel(name = "频率输出")
    private Long rateOutput;

    /** 频率反馈 */
    @Excel(name = "频率反馈")
    private Long rateFeedBack;

    /** 运行时间 */
    @Excel(name = "运行时间")
    private Long runTime;

    /** 回水压力 */
    @Excel(name = "回水压力")
    private Long backWaterP;

    /** 控制模式 */
    @Excel(name = "控制模式")
    private Long controlModel;

    /** 频率 */
    @Excel(name = "频率")
    private Long frequency;

    /** 高限 */
    @Excel(name = "高限")
    private Long upperLimit;

    /** 低限 */
    @Excel(name = "低限")
    private Long lowLimit;

    /** 倒泵时间 */
    @Excel(name = "倒泵时间")
    private Long preversingTime;

    /** 站点编号 */
    @Excel(name = "站点编号")
    private Long stationId;

    public void setWaterPumpId(String waterPumpId) 
    {
        this.waterPumpId = waterPumpId;
    }

    public String getWaterPumpId() 
    {
        return waterPumpId;
    }
    public void setRunStatus(Long runStatus) 
    {
        this.runStatus = runStatus;
    }

    public Long getRunStatus() 
    {
        return runStatus;
    }
    public void setRunModel(Long runModel) 
    {
        this.runModel = runModel;
    }

    public Long getRunModel() 
    {
        return runModel;
    }
    public void setControlOrder(Long controlOrder) 
    {
        this.controlOrder = controlOrder;
    }

    public Long getControlOrder() 
    {
        return controlOrder;
    }
    public void setRateOutput(Long rateOutput) 
    {
        this.rateOutput = rateOutput;
    }

    public Long getRateOutput() 
    {
        return rateOutput;
    }
    public void setRateFeedBack(Long rateFeedBack) 
    {
        this.rateFeedBack = rateFeedBack;
    }

    public Long getRateFeedBack() 
    {
        return rateFeedBack;
    }
    public void setRunTime(Long runTime) 
    {
        this.runTime = runTime;
    }

    public Long getRunTime() 
    {
        return runTime;
    }
    public void setBackWaterP(Long backWaterP) 
    {
        this.backWaterP = backWaterP;
    }

    public Long getBackWaterP() 
    {
        return backWaterP;
    }
    public void setControlModel(Long controlModel) 
    {
        this.controlModel = controlModel;
    }

    public Long getControlModel() 
    {
        return controlModel;
    }
    public void setFrequency(Long frequency) 
    {
        this.frequency = frequency;
    }

    public Long getFrequency() 
    {
        return frequency;
    }
    public void setUpperLimit(Long upperLimit) 
    {
        this.upperLimit = upperLimit;
    }

    public Long getUpperLimit() 
    {
        return upperLimit;
    }
    public void setLowLimit(Long lowLimit) 
    {
        this.lowLimit = lowLimit;
    }

    public Long getLowLimit() 
    {
        return lowLimit;
    }
    public void setPreversingTime(Long preversingTime) 
    {
        this.preversingTime = preversingTime;
    }

    public Long getPreversingTime() 
    {
        return preversingTime;
    }
    public void setStationId(Long stationId) 
    {
        this.stationId = stationId;
    }

    public Long getStationId() 
    {
        return stationId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("waterPumpId", getWaterPumpId())
            .append("runStatus", getRunStatus())
            .append("runModel", getRunModel())
            .append("controlOrder", getControlOrder())
            .append("rateOutput", getRateOutput())
            .append("rateFeedBack", getRateFeedBack())
            .append("runTime", getRunTime())
            .append("backWaterP", getBackWaterP())
            .append("controlModel", getControlModel())
            .append("frequency", getFrequency())
            .append("upperLimit", getUpperLimit())
            .append("lowLimit", getLowLimit())
            .append("preversingTime", getPreversingTime())
            .append("stationId", getStationId())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
