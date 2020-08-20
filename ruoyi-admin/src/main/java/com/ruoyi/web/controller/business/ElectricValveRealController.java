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
import com.ruoyi.ecloud.domain.ElectricValveReal;
import com.ruoyi.ecloud.service.IElectricValveRealService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 电动阀门实时运行信息Controller
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
@RestController
@RequestMapping("/ecloud/real")
public class ElectricValveRealController extends BaseController
{
    @Autowired
    private IElectricValveRealService electricValveRealService;

    /**
     * 查询电动阀门实时运行信息列表
     */
    @PreAuthorize("@ss.hasPermi('ecloud:real:list')")
    @GetMapping("/list")
    public TableDataInfo list(ElectricValveReal electricValveReal)
    {
        startPage();
        List<ElectricValveReal> list = electricValveRealService.selectElectricValveRealList(electricValveReal);
        return getDataTable(list);
    }

    /**
     * 导出电动阀门实时运行信息列表
     */
    @PreAuthorize("@ss.hasPermi('ecloud:real:export')")
    @Log(title = "电动阀门实时运行信息", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(ElectricValveReal electricValveReal)
    {
        List<ElectricValveReal> list = electricValveRealService.selectElectricValveRealList(electricValveReal);
        ExcelUtil<ElectricValveReal> util = new ExcelUtil<ElectricValveReal>(ElectricValveReal.class);
        return util.exportExcel(list, "real");
    }

    /**
     * 获取电动阀门实时运行信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:real:query')")
    @GetMapping(value = "/{electricValveId}")
    public AjaxResult getInfo(@PathVariable("electricValveId") String electricValveId)
    {
        return AjaxResult.success(electricValveRealService.selectElectricValveRealById(electricValveId));
    }

    /**
     * 新增电动阀门实时运行信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:real:add')")
    @Log(title = "电动阀门实时运行信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ElectricValveReal electricValveReal)
    {
        return toAjax(electricValveRealService.insertElectricValveReal(electricValveReal));
    }

    /**
     * 修改电动阀门实时运行信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:real:edit')")
    @Log(title = "电动阀门实时运行信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ElectricValveReal electricValveReal)
    {
        return toAjax(electricValveRealService.updateElectricValveReal(electricValveReal));
    }

    /**
     * 删除电动阀门实时运行信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:real:remove')")
    @Log(title = "电动阀门实时运行信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{electricValveIds}")
    public AjaxResult remove(@PathVariable String[] electricValveIds)
    {
        return toAjax(electricValveRealService.deleteElectricValveRealByIds(electricValveIds));
    }
}
