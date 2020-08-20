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
import com.ruoyi.ecloud.domain.WaterPump;
import com.ruoyi.ecloud.service.IWaterPumpService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 补水泵运行信息Controller
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
@RestController
@RequestMapping("/ecloud/pump")
public class WaterPumpController extends BaseController
{
    @Autowired
    private IWaterPumpService waterPumpService;

    /**
     * 查询补水泵运行信息列表
     */
    @PreAuthorize("@ss.hasPermi('ecloud:pump:list')")
    @GetMapping("/list")
    public TableDataInfo list(WaterPump waterPump)
    {
        startPage();
        List<WaterPump> list = waterPumpService.selectWaterPumpList(waterPump);
        return getDataTable(list);
    }

    /**
     * 导出补水泵运行信息列表
     */
    @PreAuthorize("@ss.hasPermi('ecloud:pump:export')")
    @Log(title = "补水泵运行信息", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(WaterPump waterPump)
    {
        List<WaterPump> list = waterPumpService.selectWaterPumpList(waterPump);
        ExcelUtil<WaterPump> util = new ExcelUtil<WaterPump>(WaterPump.class);
        return util.exportExcel(list, "pump");
    }

    /**
     * 获取补水泵运行信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:pump:query')")
    @GetMapping(value = "/{waterPumpId}")
    public AjaxResult getInfo(@PathVariable("waterPumpId") String waterPumpId)
    {
        return AjaxResult.success(waterPumpService.selectWaterPumpById(waterPumpId));
    }

    /**
     * 新增补水泵运行信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:pump:add')")
    @Log(title = "补水泵运行信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody WaterPump waterPump)
    {
        return toAjax(waterPumpService.insertWaterPump(waterPump));
    }

    /**
     * 修改补水泵运行信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:pump:edit')")
    @Log(title = "补水泵运行信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody WaterPump waterPump)
    {
        return toAjax(waterPumpService.updateWaterPump(waterPump));
    }

    /**
     * 删除补水泵运行信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:pump:remove')")
    @Log(title = "补水泵运行信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{waterPumpIds}")
    public AjaxResult remove(@PathVariable String[] waterPumpIds)
    {
        return toAjax(waterPumpService.deleteWaterPumpByIds(waterPumpIds));
    }
}
