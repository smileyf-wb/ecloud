package com.ruoyi.web.controller.business;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.ecloud.domain.CirculatePump;
import com.ruoyi.ecloud.service.ICirculatePumpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 循环泵l历史运行信息Controller
 * 
 * @author zhaojie
 * @date 2020-08-17
 */
@RestController
@RequestMapping("/ecloud/pump")
public class CirculatePumpController extends BaseController
{
    @Autowired
    private ICirculatePumpService circulatePumpService;

    /**
     * 查询循环泵运行信息列表
     */
    @PreAuthorize("@ss.hasPermi('ecloud:pump:list')")
    @GetMapping("/list")
    public TableDataInfo list(CirculatePump circulatePump)
    {
        startPage();
        List<CirculatePump> list = circulatePumpService.selectCirculatePumpList(circulatePump);
        return getDataTable(list);
    }

    /**
     * 导出循环泵运行信息列表
     */
    @PreAuthorize("@ss.hasPermi('ecloud:pump:export')")
    @Log(title = "循环泵运行信息", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(CirculatePump circulatePump)
    {
        List<CirculatePump> list = circulatePumpService.selectCirculatePumpList(circulatePump);
        ExcelUtil<CirculatePump> util = new ExcelUtil<CirculatePump>(CirculatePump.class);
        return util.exportExcel(list, "pump");
    }

    /**
     * 获取循环泵运行信息详细信息
     */
    //@PreAuthorize("@ss.hasPermi('ecloud:pump:query')")
    @GetMapping(value = "/{circulatePumpId}")
    public AjaxResult getInfo(@PathVariable("circulatePumpId") String circulatePumpId)
    {
        System.out.println("circulatePumpId:"+circulatePumpId);
        return AjaxResult.success(circulatePumpService.selectCirculatePumpById(circulatePumpId));
    }

    /**
     * 新增循环泵运行信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:pump:add')")
    @Log(title = "循环泵运行信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CirculatePump circulatePump)
    {
        return toAjax(circulatePumpService.insertCirculatePump(circulatePump));
    }

    /**
     * 修改循环泵运行信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:pump:edit')")
    @Log(title = "循环泵l历史运行信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CirculatePump circulatePump)
    {
        return toAjax(circulatePumpService.updateCirculatePump(circulatePump));
    }

    /**
     * 删除循环泵运行信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:pump:remove')")
    @Log(title = "循环泵l历史运行信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{circulatePumpIds}")
    public AjaxResult remove(@PathVariable String[] circulatePumpIds)
    {
        return toAjax(circulatePumpService.deleteCirculatePumpByIds(circulatePumpIds));
    }
}
