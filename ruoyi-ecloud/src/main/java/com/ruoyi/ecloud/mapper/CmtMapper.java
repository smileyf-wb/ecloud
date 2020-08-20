package com.ruoyi.ecloud.mapper;

import java.util.List;
import com.ruoyi.ecloud.domain.Cmt;

/**
 * 补水箱运行信息Mapper接口
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
public interface CmtMapper 
{
    /**
     * 查询补水箱运行信息
     * 
     * @param cmtId 补水箱运行信息ID
     * @return 补水箱运行信息
     */
    public Cmt selectCmtById(String cmtId);

    /**
     * 查询补水箱运行信息列表
     * 
     * @param cmt 补水箱运行信息
     * @return 补水箱运行信息集合
     */
    public List<Cmt> selectCmtList(Cmt cmt);

    /**
     * 新增补水箱运行信息
     * 
     * @param cmt 补水箱运行信息
     * @return 结果
     */
    public int insertCmt(Cmt cmt);

    /**
     * 修改补水箱运行信息
     * 
     * @param cmt 补水箱运行信息
     * @return 结果
     */
    public int updateCmt(Cmt cmt);

    /**
     * 删除补水箱运行信息
     * 
     * @param cmtId 补水箱运行信息ID
     * @return 结果
     */
    public int deleteCmtById(String cmtId);

    /**
     * 批量删除补水箱运行信息
     * 
     * @param cmtIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteCmtByIds(String[] cmtIds);
}
