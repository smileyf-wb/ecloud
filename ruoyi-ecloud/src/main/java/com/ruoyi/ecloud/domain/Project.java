package com.ruoyi.ecloud.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 项目信息对象 c_project
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
public class Project extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** PK_PROJECT_ID */
    private String pkProjectId;

    /** 项目名称 */
    @Excel(name = "项目名称")
    private String projectName;

    /** 站点编号 */
    @Excel(name = "站点编号")
    private String projectStationId;

    public void setPkProjectId(String pkProjectId) 
    {
        this.pkProjectId = pkProjectId;
    }

    public String getPkProjectId() 
    {
        return pkProjectId;
    }
    public void setProjectName(String projectName) 
    {
        this.projectName = projectName;
    }

    public String getProjectName() 
    {
        return projectName;
    }
    public void setProjectStationId(String projectStationId) 
    {
        this.projectStationId = projectStationId;
    }

    public String getProjectStationId() 
    {
        return projectStationId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("pkProjectId", getPkProjectId())
            .append("projectName", getProjectName())
            .append("projectStationId", getProjectStationId())
            .toString();
    }
}
