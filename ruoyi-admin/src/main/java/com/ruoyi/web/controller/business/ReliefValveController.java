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
import com.ruoyi.ecloud.domain.ReliefValve;
import com.ruoyi.ecloud.service.IReliefValveService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 泄压阀信息Controller
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
@RestController
@RequestMapping("/ecloud/valve")
public class ReliefValveController extends BaseController
{
    @Autowired
    private IReliefValveService reliefValveService;

    /**
     * 查询泄压阀信息列表
     */
    @PreAuthorize("@ss.hasPermi('ecloud:valve:list')")
    @GetMapping("/list")
    public TableDataInfo list(ReliefValve reliefValve)
    {
        startPage();
        List<ReliefValve> list = reliefValveService.selectReliefValveList(reliefValve);
        return getDataTable(list);
    }

    /**
     * 导出泄压阀信息列表
     */
    @PreAuthorize("@ss.hasPermi('ecloud:valve:export')")
    @Log(title = "泄压阀信息", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(ReliefValve reliefValve)
    {
        List<ReliefValve> list = reliefValveService.selectReliefValveList(reliefValve);
        ExcelUtil<ReliefValve> util = new ExcelUtil<ReliefValve>(ReliefValve.class);
        return util.exportExcel(list, "valve");
    }

    /**
     * 获取泄压阀信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:valve:query')")
    @GetMapping(value = "/{reliefValveId}")
    public AjaxResult getInfo(@PathVariable("reliefValveId") String reliefValveId)
    {
        return AjaxResult.success(reliefValveService.selectReliefValveById(reliefValveId));
    }

    /**
     * 新增泄压阀信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:valve:add')")
    @Log(title = "泄压阀信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ReliefValve reliefValve)
    {
        return toAjax(reliefValveService.insertReliefValve(reliefValve));
    }

    /**
     * 修改泄压阀信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:valve:edit')")
    @Log(title = "泄压阀信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ReliefValve reliefValve)
    {
        return toAjax(reliefValveService.updateReliefValve(reliefValve));
    }

    /**
     * 删除泄压阀信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:valve:remove')")
    @Log(title = "泄压阀信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{reliefValveIds}")
    public AjaxResult remove(@PathVariable String[] reliefValveIds)
    {
        return toAjax(reliefValveService.deleteReliefValveByIds(reliefValveIds));
    }
}
