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
import com.ruoyi.ecloud.domain.Cmt;
import com.ruoyi.ecloud.service.ICmtService;
import com.ruoyi.common.utils.poi.ExcelUtil;

/**
 * 补水箱运行信息Controller
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
@RestController
@RequestMapping("/ecloud/cmt")
public class CmtController extends BaseController
{
    @Autowired
    private ICmtService cmtService;

    /**
     * 查询补水箱运行信息列表
     */
    @PreAuthorize("@ss.hasPermi('ecloud:cmt:list')")
    @GetMapping("/list")
    public AjaxResult list(Cmt cmt)
    {
        List<Cmt> list = cmtService.selectCmtList(cmt);
        return AjaxResult.success(list);
    }

    /**
     * 导出补水箱运行信息列表
     */
    @PreAuthorize("@ss.hasPermi('ecloud:cmt:export')")
    @Log(title = "补水箱运行信息", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(Cmt cmt)
    {
        List<Cmt> list = cmtService.selectCmtList(cmt);
        ExcelUtil<Cmt> util = new ExcelUtil<Cmt>(Cmt.class);
        return util.exportExcel(list, "cmt");
    }

    /**
     * 获取补水箱运行信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:cmt:query')")
    @GetMapping(value = "/{cmtId}")
    public AjaxResult getInfo(@PathVariable("cmtId") String cmtId)
    {
        return AjaxResult.success(cmtService.selectCmtById(cmtId));
    }

    /**
     * 新增补水箱运行信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:cmt:add')")
    @Log(title = "补水箱运行信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Cmt cmt)
    {
        return toAjax(cmtService.insertCmt(cmt));
    }

    /**
     * 修改补水箱运行信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:cmt:edit')")
    @Log(title = "补水箱运行信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Cmt cmt)
    {
        return toAjax(cmtService.updateCmt(cmt));
    }

    /**
     * 删除补水箱运行信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:cmt:remove')")
    @Log(title = "补水箱运行信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{cmtIds}")
    public AjaxResult remove(@PathVariable String[] cmtIds)
    {
        return toAjax(cmtService.deleteCmtByIds(cmtIds));
    }
}
