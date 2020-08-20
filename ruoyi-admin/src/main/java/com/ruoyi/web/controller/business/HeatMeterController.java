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
import com.ruoyi.ecloud.domain.HeatMeter;
import com.ruoyi.ecloud.service.IHeatMeterService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 热表信息Controller
 * 
 * @author ruoyi
 * @date 2020-08-18
 */
@RestController
@RequestMapping("/ecloud/meter")
public class HeatMeterController extends BaseController
{
    @Autowired
    private IHeatMeterService heatMeterService;

    /**
     * 查询热表信息列表
     */
    @PreAuthorize("@ss.hasPermi('ecloud:meter:list')")
    @GetMapping("/list")
    public TableDataInfo list(HeatMeter heatMeter)
    {
        startPage();
        List<HeatMeter> list = heatMeterService.selectHeatMeterList(heatMeter);
        return getDataTable(list);
    }

    /**
     * 导出热表信息列表
     */
    @PreAuthorize("@ss.hasPermi('ecloud:meter:export')")
    @Log(title = "热表信息", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(HeatMeter heatMeter)
    {
        List<HeatMeter> list = heatMeterService.selectHeatMeterList(heatMeter);
        ExcelUtil<HeatMeter> util = new ExcelUtil<HeatMeter>(HeatMeter.class);
        return util.exportExcel(list, "meter");
    }

    /**
     * 获取热表信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:meter:query')")
    @GetMapping(value = "/{heatMeterId}")
    public AjaxResult getInfo(@PathVariable("heatMeterId") String heatMeterId)
    {
        return AjaxResult.success(heatMeterService.selectHeatMeterById(heatMeterId));
    }

    /**
     * 新增热表信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:meter:add')")
    @Log(title = "热表信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HeatMeter heatMeter)
    {
        return toAjax(heatMeterService.insertHeatMeter(heatMeter));
    }

    /**
     * 修改热表信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:meter:edit')")
    @Log(title = "热表信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HeatMeter heatMeter)
    {
        return toAjax(heatMeterService.updateHeatMeter(heatMeter));
    }

    /**
     * 删除热表信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:meter:remove')")
    @Log(title = "热表信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{heatMeterIds}")
    public AjaxResult remove(@PathVariable String[] heatMeterIds)
    {
        return toAjax(heatMeterService.deleteHeatMeterByIds(heatMeterIds));
    }
}
