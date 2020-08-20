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
import com.ruoyi.ecloud.domain.ClimateCompensationt;
import com.ruoyi.ecloud.service.IClimateCompensationtService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 气候补偿参数下发信息Controller
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
@RestController
@RequestMapping("/ecloud/compensationt")
public class ClimateCompensationtController extends BaseController
{
    @Autowired
    private IClimateCompensationtService climateCompensationtService;

    /**
     * 查询气候补偿参数下发信息列表
     */
    @PreAuthorize("@ss.hasPermi('ecloud:compensationt:list')")
    @GetMapping("/list")
    public TableDataInfo list(ClimateCompensationt climateCompensationt)
    {
        startPage();
        List<ClimateCompensationt> list = climateCompensationtService.selectClimateCompensationtList(climateCompensationt);
        return getDataTable(list);
    }

    /**
     * 导出气候补偿参数下发信息列表
     */
    @PreAuthorize("@ss.hasPermi('ecloud:compensationt:export')")
    @Log(title = "气候补偿参数下发信息", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(ClimateCompensationt climateCompensationt)
    {
        List<ClimateCompensationt> list = climateCompensationtService.selectClimateCompensationtList(climateCompensationt);
        ExcelUtil<ClimateCompensationt> util = new ExcelUtil<ClimateCompensationt>(ClimateCompensationt.class);
        return util.exportExcel(list, "compensationt");
    }

    /**
     * 获取气候补偿参数下发信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:compensationt:query')")
    @GetMapping(value = "/{climateCompensationtId}")
    public AjaxResult getInfo(@PathVariable("climateCompensationtId") String climateCompensationtId)
    {
        return AjaxResult.success(climateCompensationtService.selectClimateCompensationtById(climateCompensationtId));
    }

    /**
     * 新增气候补偿参数下发信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:compensationt:add')")
    @Log(title = "气候补偿参数下发信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ClimateCompensationt climateCompensationt)
    {
        return toAjax(climateCompensationtService.insertClimateCompensationt(climateCompensationt));
    }

    /**
     * 修改气候补偿参数下发信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:compensationt:edit')")
    @Log(title = "气候补偿参数下发信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ClimateCompensationt climateCompensationt)
    {
        return toAjax(climateCompensationtService.updateClimateCompensationt(climateCompensationt));
    }

    /**
     * 删除气候补偿参数下发信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:compensationt:remove')")
    @Log(title = "气候补偿参数下发信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{climateCompensationtIds}")
    public AjaxResult remove(@PathVariable String[] climateCompensationtIds)
    {
        return toAjax(climateCompensationtService.deleteClimateCompensationtByIds(climateCompensationtIds));
    }
}
