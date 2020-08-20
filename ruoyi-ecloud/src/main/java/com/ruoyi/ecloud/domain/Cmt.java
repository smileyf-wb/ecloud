package com.ruoyi.ecloud.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.TreeEntity;

/**
 * 补水箱运行信息对象 c_cmt
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
public class Cmt extends TreeEntity
{
    private static final long serialVersionUID = 1L;

    /** 补水箱编号 */
    private String cmtId;

    /** 水箱液位 */
    @Excel(name = "水箱液位")
    private String waterLevel;

    /** 开阀液位 */
    @Excel(name = "开阀液位")
    private String openValveLevel;

    /** 关阀液位 */
    @Excel(name = "关阀液位")
    private String closeValveLevel;

    /** 水位高限 */
    @Excel(name = "水位高限")
    private Long waterLevelMax;

    /** 水位低限 */
    @Excel(name = "水位低限")
    private Long waterLevelMin;

    /** 补水阀门状态控制命令 */
    @Excel(name = "补水阀门状态控制命令")
    private Long valveStatusCmd;

    /** $column.columnComment */
    @Excel(name = "补水阀门状态控制命令")
    private String stationId;

    public void setCmtId(String cmtId) 
    {
        this.cmtId = cmtId;
    }

    public String getCmtId() 
    {
        return cmtId;
    }
    public void setWaterLevel(String waterLevel) 
    {
        this.waterLevel = waterLevel;
    }

    public String getWaterLevel() 
    {
        return waterLevel;
    }
    public void setOpenValveLevel(String openValveLevel) 
    {
        this.openValveLevel = openValveLevel;
    }

    public String getOpenValveLevel() 
    {
        return openValveLevel;
    }
    public void setCloseValveLevel(String closeValveLevel) 
    {
        this.closeValveLevel = closeValveLevel;
    }

    public String getCloseValveLevel() 
    {
        return closeValveLevel;
    }
    public void setWaterLevelMax(Long waterLevelMax) 
    {
        this.waterLevelMax = waterLevelMax;
    }

    public Long getWaterLevelMax() 
    {
        return waterLevelMax;
    }
    public void setWaterLevelMin(Long waterLevelMin) 
    {
        this.waterLevelMin = waterLevelMin;
    }

    public Long getWaterLevelMin() 
    {
        return waterLevelMin;
    }
    public void setValveStatusCmd(Long valveStatusCmd) 
    {
        this.valveStatusCmd = valveStatusCmd;
    }

    public Long getValveStatusCmd() 
    {
        return valveStatusCmd;
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
            .append("cmtId", getCmtId())
            .append("waterLevel", getWaterLevel())
            .append("openValveLevel", getOpenValveLevel())
            .append("closeValveLevel", getCloseValveLevel())
            .append("waterLevelMax", getWaterLevelMax())
            .append("waterLevelMin", getWaterLevelMin())
            .append("valveStatusCmd", getValveStatusCmd())
            .append("stationId", getStationId())
            .toString();
    }
}
