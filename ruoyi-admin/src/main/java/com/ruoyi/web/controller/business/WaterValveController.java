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
import com.ruoyi.ecloud.domain.WaterValve;
import com.ruoyi.ecloud.service.IWaterValveService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 补水阀门运行信息Controller
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
@RestController
@RequestMapping("/ecloud/valve")
public class WaterValveController extends BaseController
{
    @Autowired
    private IWaterValveService waterValveService;

    /**
     * 查询补水阀门运行信息列表
     */
    @PreAuthorize("@ss.hasPermi('ecloud:valve:list')")
    @GetMapping("/list")
    public TableDataInfo list(WaterValve waterValve)
    {
        startPage();
        List<WaterValve> list = waterValveService.selectWaterValveList(waterValve);
        return getDataTable(list);
    }

    /**
     * 导出补水阀门运行信息列表
     */
    @PreAuthorize("@ss.hasPermi('ecloud:valve:export')")
    @Log(title = "补水阀门运行信息", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(WaterValve waterValve)
    {
        List<WaterValve> list = waterValveService.selectWaterValveList(waterValve);
        ExcelUtil<WaterValve> util = new ExcelUtil<WaterValve>(WaterValve.class);
        return util.exportExcel(list, "valve");
    }

    /**
     * 获取补水阀门运行信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:valve:query')")
    @GetMapping(value = "/{waterValveId}")
    public AjaxResult getInfo(@PathVariable("waterValveId") String waterValveId)
    {
        return AjaxResult.success(waterValveService.selectWaterValveById(waterValveId));
    }

    /**
     * 新增补水阀门运行信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:valve:add')")
    @Log(title = "补水阀门运行信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody WaterValve waterValve)
    {
        return toAjax(waterValveService.insertWaterValve(waterValve));
    }

    /**
     * 修改补水阀门运行信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:valve:edit')")
    @Log(title = "补水阀门运行信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody WaterValve waterValve)
    {
        return toAjax(waterValveService.updateWaterValve(waterValve));
    }

    /**
     * 删除补水阀门运行信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:valve:remove')")
    @Log(title = "补水阀门运行信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{waterValveIds}")
    public AjaxResult remove(@PathVariable String[] waterValveIds)
    {
        return toAjax(waterValveService.deleteWaterValveByIds(waterValveIds));
    }
}
