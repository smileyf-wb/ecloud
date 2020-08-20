package com.ruoyi.web.controller.business;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

import com.fasterxml.jackson.core.JsonParser;
import com.ruoyi.ecloud.domain.*;
import com.ruoyi.ecloud.service.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
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
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

import javax.annotation.Resource;

/**
 * 热力站点Controller
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
@RestController
@RequestMapping("/ecloud/station")
public class StationController extends BaseController
{
    @Autowired
    private IStationService stationService;

    /**
     * 循环泵操作类
     */
    @Autowired
    private ICirculatePumpService circulatePumpService;

    /*补水泵操作类*/
    @Autowired
    private IWaterPumpService waterPumpService;

    /*泄压阀操作类*/
    @Autowired
    private IReliefValveService reliefValveService;

    /*补水阀操作类*/
    @Autowired
    private IWaterValveService waterValveService;

    /*电动阀操作类*/
    @Autowired
    private IElectricValveService electricValveService;

    /*热表操作类*/
    @Autowired
    private IHeatMeterService heatMeterService;

    /*水箱操作类*/
    @Autowired
    private ICmtService cmtService;

    /*电表操作类*/
    @Autowired
    private IElectricityMeterService electricityMeterService;

    @Qualifier("threadPoolTaskExecutor")
   private ThreadPoolTaskExecutor threadPoolTaskExecutor;
    /**
     * 查询热力站点列表
     */
    @PreAuthorize("@ss.hasPermi('ecloud:station:list')")
    @GetMapping("/list")
    public TableDataInfo list(Station station)
    {
        startPage();
        List<Station> list = stationService.selectStationList(station);
        return getDataTable(list);
    }

    /**
     * 导出热力站点列表
     */
    @PreAuthorize("@ss.hasPermi('ecloud:station:export')")
    @Log(title = "热力站点", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(Station station)
    {
        List<Station> list = stationService.selectStationList(station);
        ExcelUtil<Station> util = new ExcelUtil<Station>(Station.class);
        return util.exportExcel(list, "station");
    }

    /**
     * 获取热力站点详细信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:station:query')")
    @GetMapping(value = "/{pkStationId}")
    public AjaxResult getInfo(@PathVariable("pkStationId") String pkStationId)
    {
        return AjaxResult.success(stationService.selectStationById(pkStationId));
    }

    /**
     * 新增热力站点
     */
    @PreAuthorize("@ss.hasPermi('ecloud:station:add')")
    @Log(title = "热力站点", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Station station)
    {
        return toAjax(stationService.insertStation(station));
    }

    /**
     * 修改热力站点
     */
    @PreAuthorize("@ss.hasPermi('ecloud:station:edit')")
    @Log(title = "热力站点", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Station station)
    {
        return toAjax(stationService.updateStation(station));
    }

    /**
     * 删除热力站点
     */
    @PreAuthorize("@ss.hasPermi('ecloud:station:remove')")
    @Log(title = "热力站点", businessType = BusinessType.DELETE)
	@DeleteMapping("/{pkStationIds}")
    public AjaxResult remove(@PathVariable String[] pkStationIds)
    {
        return toAjax(stationService.deleteStationByIds(pkStationIds));
    }

    /**
     * 热力站点运行信息
     */
    @PreAuthorize("@ss.hasPermi('ecloud:station:runInfo')")
    @Log(title = "热力站点运行信息", businessType = BusinessType.OTHER)
    @DeleteMapping("/{runInfo}")
    public AjaxResult stationRunInfo(@PathVariable String pkStationIds)
    {
        CirculatePump circulatePump = new CirculatePump();
        circulatePump.setStationId(pkStationIds);

        WaterPump waterPump = new WaterPump();
        waterPump.setStationId(pkStationIds);

        ReliefValve reliefValve = new ReliefValve();
        reliefValve.setStationId(pkStationIds);

        WaterValve waterValve = new WaterValve();
        waterValve.setStationId(pkStationIds);

        ElectricValve electricValve = new ElectricValve();
        electricValve.setStationId(pkStationIds);

        HeatMeter heatMeter = new HeatMeter();
        heatMeter.setStationId(pkStationIds);

        ElectricityMeter electricityMeter = new ElectricityMeter();
        electricityMeter.setStationId(pkStationIds);

        Cmt cmt = new Cmt();
        cmt.setStationId(pkStationIds);

        Station station = null;
        List<CirculatePump> circulatePumpList= null;
        List<WaterPump> waterPumpList=null;
        List<ReliefValve> reliefValveList = null;
        List<WaterValve> waterValveList =  null;
        List<ElectricValve> electricValveList =null;
        List<HeatMeter> heatMeterList =null;
        List<ElectricityMeter> electricityMeterList =null;
        List<Cmt>  cmtList = null;
        try {
             Future<Station> stationFuture=   threadPoolTaskExecutor.submit(new Callable<Station>() {
              @Override
              public Station call() throws Exception {
                  return stationService.selectStationById(pkStationIds);
              }
          });
             station = stationFuture.get();
             if(station == null)
             {
                 station = new Station();
             }
            Future<List<CirculatePump>> circulatePumpFuture= threadPoolTaskExecutor.submit(new Callable<List<CirculatePump>>() {
                 @Override
                 public List<CirculatePump> call() throws Exception {
                     return circulatePumpService.selectCirculatePumpList(circulatePump);
                 }
             });
            circulatePumpList = circulatePumpFuture.get();

            Future<List<WaterPump>> waterPumpFuture = threadPoolTaskExecutor.submit(new Callable<List<WaterPump>>() {
                @Override
                public List<WaterPump> call() throws Exception {
                    return waterPumpService.selectWaterPumpList(waterPump);
                }
            });
            waterPumpList = waterPumpFuture.get();

            Future<List<WaterValve>> waterValveFuture = threadPoolTaskExecutor.submit(new Callable<List<WaterValve>>() {
                @Override
                public List<WaterValve> call() throws Exception {
                    return waterValveService.selectWaterValveList(waterValve);
                }
            });
            waterValveList = waterValveFuture.get();

            Future<List<ReliefValve>> relieValveFuture = threadPoolTaskExecutor.submit(new Callable<List<ReliefValve>>() {
                @Override
                public List<ReliefValve> call() throws Exception {
                    return reliefValveService.selectReliefValveList(reliefValve);
                }
            });
            reliefValveList = relieValveFuture.get();

            Future<List<ElectricValve>> electriValveFuture = threadPoolTaskExecutor.submit(new Callable<List<ElectricValve>>() {
                @Override
                public List<ElectricValve> call() throws Exception {
                    return electricValveService.selectElectricValveList(electricValve);
                }
            });
            electricValveList = electriValveFuture.get();

            Future<List<HeatMeter>> heatMeterFuture = threadPoolTaskExecutor.submit(new Callable<List<HeatMeter>>() {
                @Override
                public List<HeatMeter> call() throws Exception {
                    return heatMeterService.selectHeatMeterList(heatMeter);
                }
            });
            heatMeterList = heatMeterFuture.get();

            Future<List<ElectricityMeter>> electricMeterFuture = threadPoolTaskExecutor.submit(new Callable<List<ElectricityMeter>>() {
                @Override
                public List<ElectricityMeter> call() throws Exception {
                    return electricityMeterService.selectElectricityMeterList(electricityMeter);
                }
            });
            electricityMeterList = electricMeterFuture.get();

            Future<List<Cmt>> cmtFuture = threadPoolTaskExecutor.submit(new Callable<List<Cmt>>() {
                @Override
                public List<Cmt> call() throws Exception {
                    return cmtService.selectCmtList(cmt);
                }
            });
            cmtList = cmtFuture.get();

            station.setCirculatePumpList(circulatePumpList);
            station.setWaterPumpList(waterPumpList);
            station.setReliefValveList(reliefValveList);
            station.setElectricValvesList(electricValveList);
            station.setWaterValveList(waterValveList);
            station.setHeatMeterList(heatMeterList);
            station.setElectricityMeters(electricityMeterList);
            station.setCmtList(cmtList);
        } catch (Exception e) {
            e.printStackTrace();
           return AjaxResult.error(e.getMessage());
        } finally {
        }
        return AjaxResult.success(station);
    }

}
