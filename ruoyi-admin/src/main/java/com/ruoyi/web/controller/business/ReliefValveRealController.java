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
import com.ruoyi.ecloud.domain.ReliefValveReal;
import com.ruoyi.ecloud.service.IReliefValveRealService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 泄压阀实时信息Controller
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
@RestController
@RequestMapping("/ecloud/real")
public class ReliefValveRealController extends BaseController
{
    @Autowired
    private IReliefValveRealService reliefValveRealService;

    /**
     * 查询泄压阀实时信息列表
     */
    @PreAuthorize("@ss.hasPermi('ecloud:real:list')")
    @GetMapping("/list")
    public TableDataInfo list(ReliefValveReal reliefValveReal)
    {
        startPage();
        List<ReliefValveReal> list = reliefValveRealService.selectReliefValveRealList(reliefValveReal);
        return getDataTable(list);
    }

    /**
     * 导出泄压阀实时信息列表
     */
    @PreAuthorize("@ss.hasPermi('ecloud:real:export')")
    @Log(title = "泄压阀实时信息", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(ReliefValveReal reliefValveReal)
    {
        List<ReliefValveReal> list = reliefValveRealService.selectReliefValveRealList(reliefValveReal);
        ExcelUtil<ReliefValveReal> util = new ExcelUtil<ReliefValveReal>(ReliefValveReal.class);
        return util.exportExcel(list, "real");
    }

    /**
     * 获取泄压阀实时信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:real:query')")
    @GetMapping(value = "/{reliefValveId}")
    public AjaxResult getInfo(@PathVariable("reliefValveId") String reliefValveId)
    {
        return AjaxResult.success(reliefValveRealService.selectReliefValveRealById(reliefValveId));
    }

    /**
     * 新增泄压阀实时信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:real:add')")
    @Log(title = "泄压阀实时信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ReliefValveReal reliefValveReal)
    {
        return toAjax(reliefValveRealService.insertReliefValveReal(reliefValveReal));
    }

    /**
     * 修改泄压阀实时信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:real:edit')")
    @Log(title = "泄压阀实时信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ReliefValveReal reliefValveReal)
    {
        return toAjax(reliefValveRealService.updateReliefValveReal(reliefValveReal));
    }

    /**
     * 删除泄压阀实时信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:real:remove')")
    @Log(title = "泄压阀实时信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{reliefValveIds}")
    public AjaxResult remove(@PathVariable String[] reliefValveIds)
    {
        return toAjax(reliefValveRealService.deleteReliefValveRealByIds(reliefValveIds));
    }
}
