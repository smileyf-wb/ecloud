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
import com.ruoyi.ecloud.domain.StationReal;
import com.ruoyi.ecloud.service.IStationRealService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 热力站点实时Controller
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
@RestController
@RequestMapping("/ecloud/real")
public class StationRealController extends BaseController
{
    @Autowired
    private IStationRealService stationRealService;

    /**
     * 查询热力站点实时列表
     */
    @PreAuthorize("@ss.hasPermi('ecloud:real:list')")
    @GetMapping("/list")
    public TableDataInfo list(StationReal stationReal)
    {
        startPage();
        List<StationReal> list = stationRealService.selectStationRealList(stationReal);
        return getDataTable(list);
    }

    /**
     * 导出热力站点实时列表
     */
    @PreAuthorize("@ss.hasPermi('ecloud:real:export')")
    @Log(title = "热力站点实时", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(StationReal stationReal)
    {
        List<StationReal> list = stationRealService.selectStationRealList(stationReal);
        ExcelUtil<StationReal> util = new ExcelUtil<StationReal>(StationReal.class);
        return util.exportExcel(list, "real");
    }

    /**
     * 获取热力站点实时详细信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:real:query')")
    @GetMapping(value = "/{pkStationId}")
    public AjaxResult getInfo(@PathVariable("pkStationId") String pkStationId)
    {
        return AjaxResult.success(stationRealService.selectStationRealById(pkStationId));
    }

    /**
     * 新增热力站点实时
     */
    @PreAuthorize("@ss.hasPermi('ecloud:real:add')")
    @Log(title = "热力站点实时", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody StationReal stationReal)
    {
        return toAjax(stationRealService.insertStationReal(stationReal));
    }

    /**
     * 修改热力站点实时
     */
    @PreAuthorize("@ss.hasPermi('ecloud:real:edit')")
    @Log(title = "热力站点实时", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody StationReal stationReal)
    {
        return toAjax(stationRealService.updateStationReal(stationReal));
    }

    /**
     * 删除热力站点实时
     */
    @PreAuthorize("@ss.hasPermi('ecloud:real:remove')")
    @Log(title = "热力站点实时", businessType = BusinessType.DELETE)
	@DeleteMapping("/{pkStationIds}")
    public AjaxResult remove(@PathVariable String[] pkStationIds)
    {
        return toAjax(stationRealService.deleteStationRealByIds(pkStationIds));
    }
}
