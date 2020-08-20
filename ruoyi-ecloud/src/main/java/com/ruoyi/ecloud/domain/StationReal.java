package com.ruoyi.ecloud.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 热力站点实时对象 c_station_real
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
public class StationReal extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** PK_STATION_ID */
    private String pkStationId;

    /** 站点名称 */
    @Excel(name = "站点名称")
    private String stationName;

    /** 一次供水温度 */
    @Excel(name = "一次供水温度")
    private Long firstWaterT;

    /** 一次供水压力 */
    @Excel(name = "一次供水压力")
    private Long firstWaterP;

    /** 一次回水温度 */
    @Excel(name = "一次回水温度")
    private Long firstBackWaterTt;

    /** 一次回水压力 */
    @Excel(name = "一次回水压力")
    private Long firstBackWaterP;

    /** 二次供水温度 */
    @Excel(name = "二次供水温度")
    private Long secondWaterT;

    /** 二次供水压力 */
    @Excel(name = "二次供水压力")
    private Long secondWaterP;

    /** 二次回水温度 */
    @Excel(name = "二次回水温度")
    private Long secondBackWaterT;

    /** 二次回水压力 */
    @Excel(name = "二次回水压力")
    private Long secondBackWaterP;

    /** 补偿温度 */
    @Excel(name = "补偿温度")
    private Long compensatioCalculation;

    /** 通讯故障 */
    @Excel(name = "通讯故障")
    private String communication;

    /** 供水压力（过滤网后） */
    @Excel(name = "供水压力", readConverterExp = "过=滤网后")
    private Long firstBackWaterT02;

    public void setPkStationId(String pkStationId) 
    {
        this.pkStationId = pkStationId;
    }

    public String getPkStationId() 
    {
        return pkStationId;
    }
    public void setStationName(String stationName) 
    {
        this.stationName = stationName;
    }

    public String getStationName() 
    {
        return stationName;
    }
    public void setFirstWaterT(Long firstWaterT) 
    {
        this.firstWaterT = firstWaterT;
    }

    public Long getFirstWaterT() 
    {
        return firstWaterT;
    }
    public void setFirstWaterP(Long firstWaterP) 
    {
        this.firstWaterP = firstWaterP;
    }

    public Long getFirstWaterP() 
    {
        return firstWaterP;
    }
    public void setFirstBackWaterTt(Long firstBackWaterTt) 
    {
        this.firstBackWaterTt = firstBackWaterTt;
    }

    public Long getFirstBackWaterTt() 
    {
        return firstBackWaterTt;
    }
    public void setFirstBackWaterP(Long firstBackWaterP) 
    {
        this.firstBackWaterP = firstBackWaterP;
    }

    public Long getFirstBackWaterP() 
    {
        return firstBackWaterP;
    }
    public void setSecondWaterT(Long secondWaterT) 
    {
        this.secondWaterT = secondWaterT;
    }

    public Long getSecondWaterT() 
    {
        return secondWaterT;
    }
    public void setSecondWaterP(Long secondWaterP) 
    {
        this.secondWaterP = secondWaterP;
    }

    public Long getSecondWaterP() 
    {
        return secondWaterP;
    }
    public void setSecondBackWaterT(Long secondBackWaterT) 
    {
        this.secondBackWaterT = secondBackWaterT;
    }

    public Long getSecondBackWaterT() 
    {
        return secondBackWaterT;
    }
    public void setSecondBackWaterP(Long secondBackWaterP) 
    {
        this.secondBackWaterP = secondBackWaterP;
    }

    public Long getSecondBackWaterP() 
    {
        return secondBackWaterP;
    }
    public void setCompensatioCalculation(Long compensatioCalculation) 
    {
        this.compensatioCalculation = compensatioCalculation;
    }

    public Long getCompensatioCalculation() 
    {
        return compensatioCalculation;
    }
    public void setCommunication(String communication) 
    {
        this.communication = communication;
    }

    public String getCommunication() 
    {
        return communication;
    }
    public void setFirstBackWaterT02(Long firstBackWaterT02) 
    {
        this.firstBackWaterT02 = firstBackWaterT02;
    }

    public Long getFirstBackWaterT02() 
    {
        return firstBackWaterT02;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("pkStationId", getPkStationId())
            .append("stationName", getStationName())
            .append("firstWaterT", getFirstWaterT())
            .append("firstWaterP", getFirstWaterP())
            .append("firstBackWaterTt", getFirstBackWaterTt())
            .append("firstBackWaterP", getFirstBackWaterP())
            .append("secondWaterT", getSecondWaterT())
            .append("secondWaterP", getSecondWaterP())
            .append("secondBackWaterT", getSecondBackWaterT())
            .append("secondBackWaterP", getSecondBackWaterP())
            .append("compensatioCalculation", getCompensatioCalculation())
            .append("updateTime", getUpdateTime())
            .append("communication", getCommunication())
            .append("firstBackWaterT02", getFirstBackWaterT02())
            .toString();
    }
}
