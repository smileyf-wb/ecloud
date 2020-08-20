package com.ruoyi.ecloud.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import java.util.List;

/**
 * 热力站点对象 c_station
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
public class Station extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** PK_STATION_ID */
    private String pkStationId;

    /*PROJECCT_ID 项目编号*/
    private String projectId;

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
    private Long firstBackWaterT;

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

    /*循环泵运行信息*/
    private List<CirculatePump> circulatePumpList;

    /*补水泵运行信息*/
    private List<WaterPump> waterPumpList;

    /*电动阀门运行信息*/
    private List<ElectricValve> electricValvesList;

    /*卸压阀门运行信息*/
    private  List<ReliefValve> reliefValveList;

    /*补水阀门运行信息*/
    private List<WaterValve> waterValveList;

    /*热表运行信息*/
    private List<HeatMeter> heatMeterList;

    /*电表运行信息*/
    private List<ElectricityMeter> electricityMeters;

    /*补水箱运行信息*/
    private List<Cmt> cmtList;

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
    public void setFirstBackWaterT(Long firstBackWaterT) 
    {
        this.firstBackWaterT = firstBackWaterT;
    }

    public Long getFirstBackWaterT() 
    {
        return firstBackWaterT;
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
            .append("firstBackWaterT", getFirstBackWaterT())
            .append("firstBackWaterP", getFirstBackWaterP())
            .append("secondWaterT", getSecondWaterT())
            .append("secondWaterP", getSecondWaterP())
            .append("secondBackWaterT", getSecondBackWaterT())
            .append("secondBackWaterP", getSecondBackWaterP())
            .append("compensatioCalculation", getCompensatioCalculation())
            .append("updateTime", getUpdateTime())
            .append("communication", getCommunication())
            .append("firstBackWaterT02", getFirstBackWaterT02())
            .append("projectId",getProjectId())
                .toString();
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public List<CirculatePump> getCirculatePumpList() {
        return circulatePumpList;
    }

    public void setCirculatePumpList(List<CirculatePump> circulatePumpList) {
        this.circulatePumpList = circulatePumpList;
    }

    public List<WaterPump> getWaterPumpList() {
        return waterPumpList;
    }

    public void setWaterPumpList(List<WaterPump> waterPumpList) {
        this.waterPumpList = waterPumpList;
    }

    public List<ElectricValve> getElectricValvesList() {
        return electricValvesList;
    }

    public void setElectricValvesList(List<ElectricValve> electricValvesList) {
        this.electricValvesList = electricValvesList;
    }

    public List<ReliefValve> getReliefValveList() {
        return reliefValveList;
    }

    public void setReliefValveList(List<ReliefValve> reliefValveList) {
        this.reliefValveList = reliefValveList;
    }

    public List<WaterValve> getWaterValveList() {
        return waterValveList;
    }

    public void setWaterValveList(List<WaterValve> waterValveList) {
        this.waterValveList = waterValveList;
    }

    public List<HeatMeter> getHeatMeterList() {
        return heatMeterList;
    }

    public void setHeatMeterList(List<HeatMeter> heatMeterList) {
        this.heatMeterList = heatMeterList;
    }

    public List<ElectricityMeter> getElectricityMeters() {
        return electricityMeters;
    }

    public void setElectricityMeters(List<ElectricityMeter> electricityMeters) {
        this.electricityMeters = electricityMeters;
    }

    public List<Cmt> getCmtList() {
        return cmtList;
    }

    public void setCmtList(List<Cmt> cmtList) {
        this.cmtList = cmtList;
    }
}
