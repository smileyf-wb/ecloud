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
import com.ruoyi.ecloud.domain.TimeModel;
import com.ruoyi.ecloud.service.ITimeModelService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 定时模式Controller
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
@RestController
@RequestMapping("/ecloud/model")
public class TimeModelController extends BaseController
{
    @Autowired
    private ITimeModelService timeModelService;

    /**
     * 查询定时模式列表
     */
    @PreAuthorize("@ss.hasPermi('ecloud:model:list')")
    @GetMapping("/list")
    public TableDataInfo list(TimeModel timeModel)
    {
        startPage();
        List<TimeModel> list = timeModelService.selectTimeModelList(timeModel);
        return getDataTable(list);
    }

    /**
     * 导出定时模式列表
     */
    @PreAuthorize("@ss.hasPermi('ecloud:model:export')")
    @Log(title = "定时模式", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(TimeModel timeModel)
    {
        List<TimeModel> list = timeModelService.selectTimeModelList(timeModel);
        ExcelUtil<TimeModel> util = new ExcelUtil<TimeModel>(TimeModel.class);
        return util.exportExcel(list, "model");
    }

    /**
     * 获取定时模式详细信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:model:query')")
    @GetMapping(value = "/{timeModelId}")
    public AjaxResult getInfo(@PathVariable("timeModelId") String timeModelId)
    {
        return AjaxResult.success(timeModelService.selectTimeModelById(timeModelId));
    }

    /**
     * 新增定时模式
     */
    @PreAuthorize("@ss.hasPermi('ecloud:model:add')")
    @Log(title = "定时模式", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TimeModel timeModel)
    {
        return toAjax(timeModelService.insertTimeModel(timeModel));
    }

    /**
     * 修改定时模式
     */
    @PreAuthorize("@ss.hasPermi('ecloud:model:edit')")
    @Log(title = "定时模式", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TimeModel timeModel)
    {
        return toAjax(timeModelService.updateTimeModel(timeModel));
    }

    /**
     * 删除定时模式
     */
    @PreAuthorize("@ss.hasPermi('ecloud:model:remove')")
    @Log(title = "定时模式", businessType = BusinessType.DELETE)
	@DeleteMapping("/{timeModelIds}")
    public AjaxResult remove(@PathVariable String[] timeModelIds)
    {
        return toAjax(timeModelService.deleteTimeModelByIds(timeModelIds));
    }
}
