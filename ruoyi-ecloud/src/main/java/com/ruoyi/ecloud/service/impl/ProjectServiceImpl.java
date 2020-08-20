package com.ruoyi.ecloud.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ecloud.mapper.ProjectMapper;
import com.ruoyi.ecloud.domain.Project;
import com.ruoyi.ecloud.service.IProjectService;

/**
 * 项目信息Service业务层处理
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
@Service
public class ProjectServiceImpl implements IProjectService 
{
    @Autowired
    private ProjectMapper projectMapper;

    /**
     * 查询项目信息
     * 
     * @param pkProjectId 项目信息ID
     * @return 项目信息
     */
    @Override
    public Project selectProjectById(String pkProjectId)
    {
        return projectMapper.selectProjectById(pkProjectId);
    }

    /**
     * 查询项目信息列表
     * 
     * @param project 项目信息
     * @return 项目信息
     */
    @Override
    public List<Project> selectProjectList(Project project)
    {
        return projectMapper.selectProjectList(project);
    }

    /**
     * 新增项目信息
     * 
     * @param project 项目信息
     * @return 结果
     */
    @Override
    public int insertProject(Project project)
    {
        return projectMapper.insertProject(project);
    }

    /**
     * 修改项目信息
     * 
     * @param project 项目信息
     * @return 结果
     */
    @Override
    public int updateProject(Project project)
    {
        return projectMapper.updateProject(project);
    }

    /**
     * 批量删除项目信息
     * 
     * @param pkProjectIds 需要删除的项目信息ID
     * @return 结果
     */
    @Override
    public int deleteProjectByIds(String[] pkProjectIds)
    {
        return projectMapper.deleteProjectByIds(pkProjectIds);
    }

    /**
     * 删除项目信息信息
     * 
     * @param pkProjectId 项目信息ID
     * @return 结果
     */
    @Override
    public int deleteProjectById(String pkProjectId)
    {
        return projectMapper.deleteProjectById(pkProjectId);
    }
}
