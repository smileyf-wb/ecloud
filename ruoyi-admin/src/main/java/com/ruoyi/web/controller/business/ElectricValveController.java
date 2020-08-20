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
import com.ruoyi.ecloud.domain.ElectricValve;
import com.ruoyi.ecloud.service.IElectricValveService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 电动阀运行信息Controller
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
@RestController
@RequestMapping("/ecloud/valve")
public class ElectricValveController extends BaseController
{
    @Autowired
    private IElectricValveService electricValveService;

    /**
     * 查询电动阀运行信息列表
     */
    @PreAuthorize("@ss.hasPermi('ecloud:valve:list')")
    @GetMapping("/list")
    public TableDataInfo list(ElectricValve electricValve)
    {
        startPage();
        List<ElectricValve> list = electricValveService.selectElectricValveList(electricValve);
        return getDataTable(list);
    }

    /**
     * 导出电动阀运行信息列表
     */
    @PreAuthorize("@ss.hasPermi('ecloud:valve:export')")
    @Log(title = "电动阀运行信息", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(ElectricValve electricValve)
    {
        List<ElectricValve> list = electricValveService.selectElectricValveList(electricValve);
        ExcelUtil<ElectricValve> util = new ExcelUtil<ElectricValve>(ElectricValve.class);
        return util.exportExcel(list, "valve");
    }

    /**
     * 获取电动阀运行信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:valve:query')")
    @GetMapping(value = "/{electricValveId}")
    public AjaxResult getInfo(@PathVariable("electricValveId") String electricValveId)
    {
        return AjaxResult.success(electricValveService.selectElectricValveById(electricValveId));
    }

    /**
     * 新增电动阀运行信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:valve:add')")
    @Log(title = "电动阀运行信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ElectricValve electricValve)
    {
        return toAjax(electricValveService.insertElectricValve(electricValve));
    }

    /**
     * 修改电动阀运行信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:valve:edit')")
    @Log(title = "电动阀运行信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ElectricValve electricValve)
    {
        return toAjax(electricValveService.updateElectricValve(electricValve));
    }

    /**
     * 删除电动阀运行信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:valve:remove')")
    @Log(title = "电动阀运行信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{electricValveIds}")
    public AjaxResult remove(@PathVariable String[] electricValveIds)
    {
        return toAjax(electricValveService.deleteElectricValveByIds(electricValveIds));
    }
}
