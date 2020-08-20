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
import com.ruoyi.ecloud.domain.ElectricityMeter;
import com.ruoyi.ecloud.service.IElectricityMeterService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 电表历史运行信息Controller
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
@RestController
@RequestMapping("/ecloud/meter")
public class ElectricityMeterController extends BaseController
{
    @Autowired
    private IElectricityMeterService electricityMeterService;

    /**
     * 查询电表历史运行信息列表
     */
    @PreAuthorize("@ss.hasPermi('ecloud:meter:list')")
    @GetMapping("/list")
    public TableDataInfo list(ElectricityMeter electricityMeter)
    {
        startPage();
        List<ElectricityMeter> list = electricityMeterService.selectElectricityMeterList(electricityMeter);
        return getDataTable(list);
    }

    /**
     * 导出电表历史运行信息列表
     */
    @PreAuthorize("@ss.hasPermi('ecloud:meter:export')")
    @Log(title = "电表历史运行信息", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(ElectricityMeter electricityMeter)
    {
        List<ElectricityMeter> list = electricityMeterService.selectElectricityMeterList(electricityMeter);
        ExcelUtil<ElectricityMeter> util = new ExcelUtil<ElectricityMeter>(ElectricityMeter.class);
        return util.exportExcel(list, "meter");
    }

    /**
     * 获取电表历史运行信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:meter:query')")
    @GetMapping(value = "/{meterId}")
    public AjaxResult getInfo(@PathVariable("meterId") String meterId)
    {
        return AjaxResult.success(electricityMeterService.selectElectricityMeterById(meterId));
    }

    /**
     * 新增电表历史运行信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:meter:add')")
    @Log(title = "电表历史运行信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ElectricityMeter electricityMeter)
    {
        return toAjax(electricityMeterService.insertElectricityMeter(electricityMeter));
    }

    /**
     * 修改电表历史运行信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:meter:edit')")
    @Log(title = "电表历史运行信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ElectricityMeter electricityMeter)
    {
        return toAjax(electricityMeterService.updateElectricityMeter(electricityMeter));
    }

    /**
     * 删除电表历史运行信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:meter:remove')")
    @Log(title = "电表历史运行信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{meterIds}")
    public AjaxResult remove(@PathVariable String[] meterIds)
    {
        return toAjax(electricityMeterService.deleteElectricityMeterByIds(meterIds));
    }
}
