package com.ruoyi.web.controller.business;

import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
import com.ruoyi.ecloud.domain.CirculatePumpReal;
import com.ruoyi.ecloud.service.ICirculatePumpRealService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 循环泵实时运行信息Controller
 * 
 * @author smile
 * @date 2020-08-17
 */
@Api("循环泵运行信息查询")
@RestController
@RequestMapping("/ecloud/pump/real")
public class CirculatePumpRealController extends BaseController
{
    @Autowired
    private ICirculatePumpRealService circulatePumpRealService;

    /**
     * 查询循环泵实时运行信息列表
     */
    @ApiOperation("查询循环泵实时运行信息列表")
    @PreAuthorize("@ss.hasPermi('ecloud:pump:list')")
    @GetMapping("/list")
    public TableDataInfo list(CirculatePumpReal circulatePumpReal)
    {
        startPage();
        List<CirculatePumpReal> list = circulatePumpRealService.selectCirculatePumpRealList(circulatePumpReal);
        return getDataTable(list);
    }

    /**
     * 导出循环泵实时运行信息列表
     */
    @PreAuthorize("@ss.hasPermi('ecloud:pump:export')")
    @Log(title = "循环泵实时运行信息", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(CirculatePumpReal circulatePumpReal)
    {
        List<CirculatePumpReal> list = circulatePumpRealService.selectCirculatePumpRealList(circulatePumpReal);
        ExcelUtil<CirculatePumpReal> util = new ExcelUtil<CirculatePumpReal>(CirculatePumpReal.class);
        return util.exportExcel(list, "pump");
    }

    /**
     * 获取循环泵实时运行信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:pump:query')")
    @GetMapping(value = "/{circulatePumpId}")
    public AjaxResult getInfo(@PathVariable("circulatePumpId") String circulatePumpId)
    {
        return AjaxResult.success(circulatePumpRealService.selectCirculatePumpRealById(circulatePumpId));
    }

    /**
     * 新增循环泵实时运行信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:pump:add')")
    @Log(title = "循环泵实时运行信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CirculatePumpReal circulatePumpReal)
    {
        return toAjax(circulatePumpRealService.insertCirculatePumpReal(circulatePumpReal));
    }

    /**
     * 修改循环泵实时运行信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:pump:edit')")
    @Log(title = "循环泵实时运行信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CirculatePumpReal circulatePumpReal)
    {
        return toAjax(circulatePumpRealService.updateCirculatePumpReal(circulatePumpReal));
    }

    /**
     * 删除循环泵实时运行信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:pump:remove')")
    @Log(title = "循环泵实时运行信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{circulatePumpIds}")
    public AjaxResult remove(@PathVariable String[] circulatePumpIds)
    {
        return toAjax(circulatePumpRealService.deleteCirculatePumpRealByIds(circulatePumpIds));
    }
}
