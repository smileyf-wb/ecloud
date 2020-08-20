package com.ruoyi.ecloud.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 循环泵l历史运行信息对象 c_circulate_pump
 * 
 * @author zhaojie
 * @date 2020-08-17
 */
public class CirculatePump extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 循环泵编号 */
    private String circulatePumpId;

    /** 循环泵状态 */
    @Excel(name = "循环泵状态")
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

    /** 供水压力 */
    @Excel(name = "供水压力")
    private Long waterP;

    /** 回水压力 */
    @Excel(name = "回水压力")
    private Long backWaterP;

    /** 供水高限 */
    @Excel(name = "供水高限")
    private Long waterMax;

    /** 回水底限 */
    @Excel(name = "回水底限")
    private Long backWaterMin;

    /** 断电运行 */
    @Excel(name = "断电运行")
    private Long powerOffOperation;

    /** 站点编号 */
    @Excel(name = "站点编号")
    private String stationId;

    /** 频率设置 */
    @Excel(name = "频率设置")
    private Long rateSet;

    /** 白天频率设置 */
    @Excel(name = "白天频率设置")
    private Long dayModel;

    /** 夜晚频率设置 */
    @Excel(name = "夜晚频率设置")
    private Long neightModel;

    /** 假日频率设置 */
    @Excel(name = "假日频率设置")
    private Long holidayModel;

    public void setCirculatePumpId(String circulatePumpId) 
    {
        this.circulatePumpId = circulatePumpId;
    }

    public String getCirculatePumpId() 
    {
        return circulatePumpId;
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
    public void setWaterP(Long waterP) 
    {
        this.waterP = waterP;
    }

    public Long getWaterP() 
    {
        return waterP;
    }
    public void setBackWaterP(Long backWaterP) 
    {
        this.backWaterP = backWaterP;
    }

    public Long getBackWaterP() 
    {
        return backWaterP;
    }
    public void setWaterMax(Long waterMax) 
    {
        this.waterMax = waterMax;
    }

    public Long getWaterMax() 
    {
        return waterMax;
    }
    public void setBackWaterMin(Long backWaterMin) 
    {
        this.backWaterMin = backWaterMin;
    }

    public Long getBackWaterMin() 
    {
        return backWaterMin;
    }
    public void setPowerOffOperation(Long powerOffOperation) 
    {
        this.powerOffOperation = powerOffOperation;
    }

    public Long getPowerOffOperation() 
    {
        return powerOffOperation;
    }
    public void setStationId(String stationId)
    {
        this.stationId = stationId;
    }

    public String getStationId()
    {
        return stationId;
    }
    public void setRateSet(Long rateSet) 
    {
        this.rateSet = rateSet;
    }

    public Long getRateSet() 
    {
        return rateSet;
    }
    public void setDayModel(Long dayModel) 
    {
        this.dayModel = dayModel;
    }

    public Long getDayModel() 
    {
        return dayModel;
    }
    public void setNeightModel(Long neightModel) 
    {
        this.neightModel = neightModel;
    }

    public Long getNeightModel() 
    {
        return neightModel;
    }
    public void setHolidayModel(Long holidayModel) 
    {
        this.holidayModel = holidayModel;
    }

    public Long getHolidayModel() 
    {
        return holidayModel;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("circulatePumpId", getCirculatePumpId())
            .append("runStatus", getRunStatus())
            .append("runModel", getRunModel())
            .append("controlOrder", getControlOrder())
            .append("rateOutput", getRateOutput())
            .append("rateFeedBack", getRateFeedBack())
            .append("runTime", getRunTime())
            .append("waterP", getWaterP())
            .append("backWaterP", getBackWaterP())
            .append("waterMax", getWaterMax())
            .append("backWaterMin", getBackWaterMin())
            .append("powerOffOperation", getPowerOffOperation())
            .append("stationId", getStationId())
            .append("updateTime", getUpdateTime())
            .append("rateSet", getRateSet())
            .append("dayModel", getDayModel())
            .append("neightModel", getNeightModel())
            .append("holidayModel", getHolidayModel())
            .toString();
    }
}
