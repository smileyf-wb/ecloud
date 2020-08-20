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
import com.ruoyi.ecloud.domain.SecondWaterTSet;
import com.ruoyi.ecloud.service.ISecondWaterTSetService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 二次温度设置Controller
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
@RestController
@RequestMapping("/ecloud/set")
public class SecondWaterTSetController extends BaseController
{
    @Autowired
    private ISecondWaterTSetService secondWaterTSetService;

    /**
     * 查询二次温度设置列表
     */
    @PreAuthorize("@ss.hasPermi('ecloud:set:list')")
    @GetMapping("/list")
    public TableDataInfo list(SecondWaterTSet secondWaterTSet)
    {
        startPage();
        List<SecondWaterTSet> list = secondWaterTSetService.selectSecondWaterTSetList(secondWaterTSet);
        return getDataTable(list);
    }

    /**
     * 导出二次温度设置列表
     */
    @PreAuthorize("@ss.hasPermi('ecloud:set:export')")
    @Log(title = "二次温度设置", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(SecondWaterTSet secondWaterTSet)
    {
        List<SecondWaterTSet> list = secondWaterTSetService.selectSecondWaterTSetList(secondWaterTSet);
        ExcelUtil<SecondWaterTSet> util = new ExcelUtil<SecondWaterTSet>(SecondWaterTSet.class);
        return util.exportExcel(list, "set");
    }

    /**
     * 获取二次温度设置详细信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:set:query')")
    @GetMapping(value = "/{climateCompensationtId}")
    public AjaxResult getInfo(@PathVariable("climateCompensationtId") String climateCompensationtId)
    {
        return AjaxResult.success(secondWaterTSetService.selectSecondWaterTSetById(climateCompensationtId));
    }

    /**
     * 新增二次温度设置
     */
    @PreAuthorize("@ss.hasPermi('ecloud:set:add')")
    @Log(title = "二次温度设置", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SecondWaterTSet secondWaterTSet)
    {
        return toAjax(secondWaterTSetService.insertSecondWaterTSet(secondWaterTSet));
    }

    /**
     * 修改二次温度设置
     */
    @PreAuthorize("@ss.hasPermi('ecloud:set:edit')")
    @Log(title = "二次温度设置", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SecondWaterTSet secondWaterTSet)
    {
        return toAjax(secondWaterTSetService.updateSecondWaterTSet(secondWaterTSet));
    }

    /**
     * 删除二次温度设置
     */
    @PreAuthorize("@ss.hasPermi('ecloud:set:remove')")
    @Log(title = "二次温度设置", businessType = BusinessType.DELETE)
	@DeleteMapping("/{climateCompensationtIds}")
    public AjaxResult remove(@PathVariable String[] climateCompensationtIds)
    {
        return toAjax(secondWaterTSetService.deleteSecondWaterTSetByIds(climateCompensationtIds));
    }
}
