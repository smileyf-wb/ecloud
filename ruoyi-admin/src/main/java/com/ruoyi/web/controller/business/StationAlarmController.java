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
import com.ruoyi.ecloud.domain.StationAlarm;
import com.ruoyi.ecloud.service.IStationAlarmService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 热力站点异常信息Controller
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
@RestController
@RequestMapping("/ecloud/alarm")
public class StationAlarmController extends BaseController
{
    @Autowired
    private IStationAlarmService stationAlarmService;

    /**
     * 查询热力站点异常信息列表
     */
    @PreAuthorize("@ss.hasPermi('ecloud:alarm:list')")
    @GetMapping("/list")
    public TableDataInfo list(StationAlarm stationAlarm)
    {
        startPage();
        List<StationAlarm> list = stationAlarmService.selectStationAlarmList(stationAlarm);
        return getDataTable(list);
    }

    /**
     * 导出热力站点异常信息列表
     */
    @PreAuthorize("@ss.hasPermi('ecloud:alarm:export')")
    @Log(title = "热力站点异常信息", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(StationAlarm stationAlarm)
    {
        List<StationAlarm> list = stationAlarmService.selectStationAlarmList(stationAlarm);
        ExcelUtil<StationAlarm> util = new ExcelUtil<StationAlarm>(StationAlarm.class);
        return util.exportExcel(list, "alarm");
    }

    /**
     * 获取热力站点异常信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:alarm:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return AjaxResult.success(stationAlarmService.selectStationAlarmById(id));
    }

    /**
     * 新增热力站点异常信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:alarm:add')")
    @Log(title = "热力站点异常信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody StationAlarm stationAlarm)
    {
        return toAjax(stationAlarmService.insertStationAlarm(stationAlarm));
    }

    /**
     * 修改热力站点异常信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:alarm:edit')")
    @Log(title = "热力站点异常信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody StationAlarm stationAlarm)
    {
        return toAjax(stationAlarmService.updateStationAlarm(stationAlarm));
    }

    /**
     * 删除热力站点异常信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:alarm:remove')")
    @Log(title = "热力站点异常信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(stationAlarmService.deleteStationAlarmByIds(ids));
    }
}
