package com.ruoyi.ecloud.service;

import java.util.List;
import com.ruoyi.ecloud.domain.Project;

/**
 * 项目信息Service接口
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
public interface IProjectService 
{
    /**
     * 查询项目信息
     * 
     * @param pkProjectId 项目信息ID
     * @return 项目信息
     */
    public Project selectProjectById(String pkProjectId);

    /**
     * 查询项目信息列表
     * 
     * @param project 项目信息
     * @return 项目信息集合
     */
    public List<Project> selectProjectList(Project project);

    /**
     * 新增项目信息
     * 
     * @param project 项目信息
     * @return 结果
     */
    public int insertProject(Project project);

    /**
     * 修改项目信息
     * 
     * @param project 项目信息
     * @return 结果
     */
    public int updateProject(Project project);

    /**
     * 批量删除项目信息
     * 
     * @param pkProjectIds 需要删除的项目信息ID
     * @return 结果
     */
    public int deleteProjectByIds(String[] pkProjectIds);

    /**
     * 删除项目信息信息
     * 
     * @param pkProjectId 项目信息ID
     * @return 结果
     */
    public int deleteProjectById(String pkProjectId);
}
