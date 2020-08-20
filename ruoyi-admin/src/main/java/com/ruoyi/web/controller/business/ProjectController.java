package com.ruoyi.web.controller.business;

import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.ecloud.domain.Project;
import com.ruoyi.ecloud.service.IProjectService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 项目信息Controller
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
@RestController
@RequestMapping("/ecloud/project")
public class ProjectController extends BaseController
{
    @Autowired
    private IProjectService projectService;

    /**
     * 查询项目信息列表
     */
    @PreAuthorize("@ss.hasPermi('ecloud:project:list')")
    @GetMapping("/list")
    public TableDataInfo list(Project project)
    {
        startPage();
        List<Project> list = projectService.selectProjectList(project);
        return getDataTable(list);
    }

    /**
     * 导出项目信息列表
     */
    @PreAuthorize("@ss.hasPermi('ecloud:project:export')")
    @Log(title = "项目信息", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(Project project)
    {
        List<Project> list = projectService.selectProjectList(project);
        ExcelUtil<Project> util = new ExcelUtil<Project>(Project.class);
        return util.exportExcel(list, "project");
    }

    /**
     * 获取项目信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:project:query')")
    @GetMapping(value = "/{pkProjectId}")
    public AjaxResult getInfo(@PathVariable("pkProjectId") String pkProjectId)
    {
        return AjaxResult.success(projectService.selectProjectById(pkProjectId));
    }

    /**
     * 新增项目信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:project:add')")
    @Log(title = "项目信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Project project)
    {
        return toAjax(projectService.insertProject(project));
    }

    /**
     * 修改项目信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:project:edit')")
    @Log(title = "项目信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Project project)
    {
        return toAjax(projectService.updateProject(project));
    }

    /**
     * 删除项目信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:project:remove')")
    @Log(title = "项目信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{pkProjectIds}")
    public AjaxResult remove(@PathVariable String[] pkProjectIds)
    {
        return toAjax(projectService.deleteProjectByIds(pkProjectIds));
    }
}
