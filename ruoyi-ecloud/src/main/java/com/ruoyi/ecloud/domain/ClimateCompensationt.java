package com.ruoyi.ecloud.domain;
import org.apache.commons.lang3.builder.ToStringBuilder;

import org.apache.commons.lang3.builder.ToStringStyle;

import com.ruoyi.common.annotation.Excel;

import com.ruoyi.common.core.domain.BaseEntity;



/**

 * 气候补偿参数下发信息对象 c_climate_compensationt

 *

 * @author zhaojie

 * @date 2020-08-18

 */

public class ClimateCompensationt extends BaseEntity

{

    private static final long serialVersionUID = 1L;



    /** CLIMATE_COMPENSATIONT_ID */

    @Excel(name = "CLIMATE_COMPENSATIONT_ID")

    private String climateCompensationtId;



    /** 温度修正值 */

    @Excel(name = "温度修正值")

    private Long tCorrection;



    /** T_ROOM */

    @Excel(name = "T_ROOM")

    private Long tRoom;



    /** T_OFFSET */

    @Excel(name = "T_OFFSET")

    private Long tOffset;



    /** T_SURPLUS */

    @Excel(name = "T_SURPLUS")

    private Long tSurplus;



    /** T_SURPLUSTIME */

    @Excel(name = "T_SURPLUSTIME")

    private Long tSurplustime;



    /** T_HOLIDAY */

    @Excel(name = "T_HOLIDAY")

    private Long tHoliday;



    /** T_EOUTX */

    @Excel(name = "T_EOUTX")

    private Long tEoutx;



    /** T_CHANGERATE */

    @Excel(name = "T_CHANGERATE")

    private Long tChangerate;



    /** T_CYCLE */

    @Excel(name = "T_CYCLE")

    private Long tCycle;



    /** TRA_MAX */

    @Excel(name = "TRA_MAX")

    private Long traMax;



    /** RAMAX */

    @Excel(name = "RAMAX")

    private Long ramax;



    /** RAMIN */

    @Excel(name = "RAMIN")

    private Long ramin;



    /** TWINDA_MAX */

    @Excel(name = "TWINDA_MAX")

    private Long twindaMax;



    /** WIND_MIN */

    @Excel(name = "WIND_MIN")

    private Long windMin;



    /** WIND_MAX */

    @Excel(name = "WIND_MAX")

    private Long windMax;



    /** TWET_MAX */

    @Excel(name = "TWET_MAX")

    private Long twetMax;



    /** TREDUCE_MAX */

    @Excel(name = "TREDUCE_MAX")

    private Long treduceMax;



    public void setClimateCompensationtId(String climateCompensationtId)

    {

        this.climateCompensationtId = climateCompensationtId;

    }



    public String getClimateCompensationtId()

    {

        return climateCompensationtId;

    }

    public void settCorrection(Long tCorrection)

    {

        this.tCorrection = tCorrection;

    }



    public Long gettCorrection()

    {

        return tCorrection;

    }

    public void settRoom(Long tRoom)

    {

        this.tRoom = tRoom;

    }



    public Long gettRoom()

    {

        return tRoom;

    }

    public void settOffset(Long tOffset)

    {

        this.tOffset = tOffset;

    }



    public Long gettOffset()

    {

        return tOffset;

    }

    public void settSurplus(Long tSurplus)

    {

        this.tSurplus = tSurplus;

    }



    public Long gettSurplus()

    {

        return tSurplus;

    }

    public void settSurplustime(Long tSurplustime)

    {

        this.tSurplustime = tSurplustime;

    }



    public Long gettSurplustime()

    {

        return tSurplustime;

    }

    public void settHoliday(Long tHoliday)

    {

        this.tHoliday = tHoliday;

    }



    public Long gettHoliday()

    {

        return tHoliday;

    }

    public void settEoutx(Long tEoutx)

    {

        this.tEoutx = tEoutx;

    }



    public Long gettEoutx()

    {

        return tEoutx;

    }

    public void settChangerate(Long tChangerate)

    {

        this.tChangerate = tChangerate;

    }



    public Long gettChangerate()

    {

        return tChangerate;

    }

    public void settCycle(Long tCycle)

    {

        this.tCycle = tCycle;

    }



    public Long gettCycle()

    {

        return tCycle;

    }

    public void setTraMax(Long traMax)

    {

        this.traMax = traMax;

    }



    public Long getTraMax()

    {

        return traMax;

    }

    public void setRamax(Long ramax)

    {

        this.ramax = ramax;

    }



    public Long getRamax()

    {

        return ramax;

    }

    public void setRamin(Long ramin)

    {

        this.ramin = ramin;

    }



    public Long getRamin()

    {

        return ramin;

    }

    public void setTwindaMax(Long twindaMax)

    {

        this.twindaMax = twindaMax;

    }



    public Long getTwindaMax()

    {

        return twindaMax;

    }

    public void setWindMin(Long windMin)

    {

        this.windMin = windMin;

    }



    public Long getWindMin()

    {

        return windMin;

    }

    public void setWindMax(Long windMax)

    {

        this.windMax = windMax;

    }



    public Long getWindMax()

    {

        return windMax;

    }

    public void setTwetMax(Long twetMax)

    {

        this.twetMax = twetMax;

    }



    public Long getTwetMax()

    {

        return twetMax;

    }

    public void setTreduceMax(Long treduceMax)

    {

        this.treduceMax = treduceMax;

    }



    public Long getTreduceMax()

    {

        return treduceMax;

    }



    @Override

    public String toString() {

        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)

                .append("climateCompensationtId", getClimateCompensationtId())

                .append("tCorrection", gettCorrection())

                .append("tRoom", gettRoom())

                .append("tOffset", gettOffset())

                .append("tSurplus", gettSurplus())

                .append("tSurplustime", gettSurplustime())

                .append("tHoliday", gettHoliday())

                .append("tEoutx", gettEoutx())

                .append("tChangerate", gettChangerate())

                .append("tCycle", gettCycle())

                .append("traMax", getTraMax())

                .append("ramax", getRamax())

                .append("ramin", getRamin())

                .append("twindaMax", getTwindaMax())

                .append("windMin", getWindMin())

                .append("windMax", getWindMax())

                .append("twetMax", getTwetMax())

                .append("treduceMax", getTreduceMax())

                .toString();

    }

}