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
import com.ruoyi.ecloud.domain.ElectricityMeterReal;
import com.ruoyi.ecloud.service.IElectricityMeterRealService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 电表运行信息Controller
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
@RestController
@RequestMapping("/ecloud/real")
public class ElectricityMeterRealController extends BaseController
{
    @Autowired
    private IElectricityMeterRealService electricityMeterRealService;

    /**
     * 查询电表运行信息列表
     */
    @PreAuthorize("@ss.hasPermi('ecloud:real:list')")
    @GetMapping("/list")
    public TableDataInfo list(ElectricityMeterReal electricityMeterReal)
    {
        startPage();
        List<ElectricityMeterReal> list = electricityMeterRealService.selectElectricityMeterRealList(electricityMeterReal);
        return getDataTable(list);
    }

    /**
     * 导出电表运行信息列表
     */
    @PreAuthorize("@ss.hasPermi('ecloud:real:export')")
    @Log(title = "电表运行信息", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(ElectricityMeterReal electricityMeterReal)
    {
        List<ElectricityMeterReal> list = electricityMeterRealService.selectElectricityMeterRealList(electricityMeterReal);
        ExcelUtil<ElectricityMeterReal> util = new ExcelUtil<ElectricityMeterReal>(ElectricityMeterReal.class);
        return util.exportExcel(list, "real");
    }

    /**
     * 获取电表运行信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:real:query')")
    @GetMapping(value = "/{meterId}")
    public AjaxResult getInfo(@PathVariable("meterId") String meterId)
    {
        return AjaxResult.success(electricityMeterRealService.selectElectricityMeterRealById(meterId));
    }

    /**
     * 新增电表运行信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:real:add')")
    @Log(title = "电表运行信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ElectricityMeterReal electricityMeterReal)
    {
        return toAjax(electricityMeterRealService.insertElectricityMeterReal(electricityMeterReal));
    }

    /**
     * 修改电表运行信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:real:edit')")
    @Log(title = "电表运行信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ElectricityMeterReal electricityMeterReal)
    {
        return toAjax(electricityMeterRealService.updateElectricityMeterReal(electricityMeterReal));
    }

    /**
     * 删除电表运行信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:real:remove')")
    @Log(title = "电表运行信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{meterIds}")
    public AjaxResult remove(@PathVariable String[] meterIds)
    {
        return toAjax(electricityMeterRealService.deleteElectricityMeterRealByIds(meterIds));
    }
}
