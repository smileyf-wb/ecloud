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
import com.ruoyi.ecloud.domain.WaterPumpReal;
import com.ruoyi.ecloud.service.IWaterPumpRealService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 补水泵实时运行信息Controller
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
@RestController
@RequestMapping("/ecloud/real")
public class WaterPumpRealController extends BaseController
{
    @Autowired
    private IWaterPumpRealService waterPumpRealService;

    /**
     * 查询补水泵实时运行信息列表
     */
    @PreAuthorize("@ss.hasPermi('ecloud:real:list')")
    @GetMapping("/list")
    public TableDataInfo list(WaterPumpReal waterPumpReal)
    {
        startPage();
        List<WaterPumpReal> list = waterPumpRealService.selectWaterPumpRealList(waterPumpReal);
        return getDataTable(list);
    }

    /**
     * 导出补水泵实时运行信息列表
     */
    @PreAuthorize("@ss.hasPermi('ecloud:real:export')")
    @Log(title = "补水泵实时运行信息", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(WaterPumpReal waterPumpReal)
    {
        List<WaterPumpReal> list = waterPumpRealService.selectWaterPumpRealList(waterPumpReal);
        ExcelUtil<WaterPumpReal> util = new ExcelUtil<WaterPumpReal>(WaterPumpReal.class);
        return util.exportExcel(list, "real");
    }

    /**
     * 获取补水泵实时运行信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:real:query')")
    @GetMapping(value = "/{waterPumpId}")
    public AjaxResult getInfo(@PathVariable("waterPumpId") String waterPumpId)
    {
        return AjaxResult.success(waterPumpRealService.selectWaterPumpRealById(waterPumpId));
    }

    /**
     * 新增补水泵实时运行信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:real:add')")
    @Log(title = "补水泵实时运行信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody WaterPumpReal waterPumpReal)
    {
        return toAjax(waterPumpRealService.insertWaterPumpReal(waterPumpReal));
    }

    /**
     * 修改补水泵实时运行信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:real:edit')")
    @Log(title = "补水泵实时运行信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody WaterPumpReal waterPumpReal)
    {
        return toAjax(waterPumpRealService.updateWaterPumpReal(waterPumpReal));
    }

    /**
     * 删除补水泵实时运行信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:real:remove')")
    @Log(title = "补水泵实时运行信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{waterPumpIds}")
    public AjaxResult remove(@PathVariable String[] waterPumpIds)
    {
        return toAjax(waterPumpRealService.deleteWaterPumpRealByIds(waterPumpIds));
    }
}
