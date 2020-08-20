package com.ruoyi.ecloud.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 电表运行信息对象 c_electricity_meter_real
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
public class ElectricityMeterReal extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 电表3相电压 */
    @Excel(name = "电表3相电压")
    private Long ua;

    /** $column.columnComment */
    @Excel(name = "电表3相电压")
    private Long ub;

    /** $column.columnComment */
    @Excel(name = "电表3相电压")
    private Long uc;

    /** 3相电流 */
    @Excel(name = "3相电流")
    private Long ia;

    /** $column.columnComment */
    @Excel(name = "3相电流")
    private Long ic;

    /** $column.columnComment */
    @Excel(name = "3相电流")
    private Long ib;

    /** 电表功率 */
    @Excel(name = "电表功率")
    private Long power;

    /** $column.columnComment */
    @Excel(name = "电表功率")
    private String stationId;

    /** 电表编号 */
    private String meterId;

    public void setUa(Long ua) 
    {
        this.ua = ua;
    }

    public Long getUa() 
    {
        return ua;
    }
    public void setUb(Long ub) 
    {
        this.ub = ub;
    }

    public Long getUb() 
    {
        return ub;
    }
    public void setUc(Long uc) 
    {
        this.uc = uc;
    }

    public Long getUc() 
    {
        return uc;
    }
    public void setIa(Long ia) 
    {
        this.ia = ia;
    }

    public Long getIa() 
    {
        return ia;
    }
    public void setIc(Long ic) 
    {
        this.ic = ic;
    }

    public Long getIc() 
    {
        return ic;
    }
    public void setIb(Long ib) 
    {
        this.ib = ib;
    }

    public Long getIb() 
    {
        return ib;
    }
    public void setPower(Long power) 
    {
        this.power = power;
    }

    public Long getPower() 
    {
        return power;
    }
    public void setStationId(String stationId) 
    {
        this.stationId = stationId;
    }

    public String getStationId() 
    {
        return stationId;
    }
    public void setMeterId(String meterId) 
    {
        this.meterId = meterId;
    }

    public String getMeterId() 
    {
        return meterId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("ua", getUa())
            .append("ub", getUb())
            .append("uc", getUc())
            .append("ia", getIa())
            .append("ic", getIc())
            .append("ib", getIb())
            .append("power", getPower())
            .append("stationId", getStationId())
            .append("meterId", getMeterId())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
