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
import com.ruoyi.ecloud.domain.HeatMeterReal;
import com.ruoyi.ecloud.service.IHeatMeterRealService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 热表实时信息Controller
 * 
 * @author ecloud
 * @date 2020-08-18
 */
@RestController
@RequestMapping("/ecloud/real")
public class HeatMeterRealController extends BaseController
{
    @Autowired
    private IHeatMeterRealService heatMeterRealService;

    /**
     * 查询热表实时信息列表
     */
    @PreAuthorize("@ss.hasPermi('ecloud:real:list')")
    @GetMapping("/list")
    public TableDataInfo list(HeatMeterReal heatMeterReal)
    {
        startPage();
        List<HeatMeterReal> list = heatMeterRealService.selectHeatMeterRealList(heatMeterReal);
        return getDataTable(list);
    }

    /**
     * 导出热表实时信息列表
     */
    @PreAuthorize("@ss.hasPermi('ecloud:real:export')")
    @Log(title = "热表实时信息", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(HeatMeterReal heatMeterReal)
    {
        List<HeatMeterReal> list = heatMeterRealService.selectHeatMeterRealList(heatMeterReal);
        ExcelUtil<HeatMeterReal> util = new ExcelUtil<HeatMeterReal>(HeatMeterReal.class);
        return util.exportExcel(list, "real");
    }

    /**
     * 获取热表实时信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:real:query')")
    @GetMapping(value = "/{heatMeterId}")
    public AjaxResult getInfo(@PathVariable("heatMeterId") String heatMeterId)
    {
        return AjaxResult.success(heatMeterRealService.selectHeatMeterRealById(heatMeterId));
    }

    /**
     * 新增热表实时信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:real:add')")
    @Log(title = "热表实时信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HeatMeterReal heatMeterReal)
    {
        return toAjax(heatMeterRealService.insertHeatMeterReal(heatMeterReal));
    }

    /**
     * 修改热表实时信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:real:edit')")
    @Log(title = "热表实时信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HeatMeterReal heatMeterReal)
    {
        return toAjax(heatMeterRealService.updateHeatMeterReal(heatMeterReal));
    }

    /**
     * 删除热表实时信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:real:remove')")
    @Log(title = "热表实时信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{heatMeterIds}")
    public AjaxResult remove(@PathVariable String[] heatMeterIds)
    {
        return toAjax(heatMeterRealService.deleteHeatMeterRealByIds(heatMeterIds));
    }
}
