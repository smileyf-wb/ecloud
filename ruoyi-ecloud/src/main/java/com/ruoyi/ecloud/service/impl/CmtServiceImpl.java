package com.ruoyi.ecloud.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ecloud.mapper.CmtMapper;
import com.ruoyi.ecloud.domain.Cmt;
import com.ruoyi.ecloud.service.ICmtService;

/**
 * 补水箱运行信息Service业务层处理
 * 
 * @author zhaojie
 * @date 2020-08-18
 */
@Service
public class CmtServiceImpl implements ICmtService 
{
    @Autowired
    private CmtMapper cmtMapper;

    /**
     * 查询补水箱运行信息
     * 
     * @param cmtId 补水箱运行信息ID
     * @return 补水箱运行信息
     */
    @Override
    public Cmt selectCmtById(String cmtId)
    {
        return cmtMapper.selectCmtById(cmtId);
    }

    /**
     * 查询补水箱运行信息列表
     * 
     * @param cmt 补水箱运行信息
     * @return 补水箱运行信息
     */
    @Override
    public List<Cmt> selectCmtList(Cmt cmt)
    {
        return cmtMapper.selectCmtList(cmt);
    }

    /**
     * 新增补水箱运行信息
     * 
     * @param cmt 补水箱运行信息
     * @return 结果
     */
    @Override
    public int insertCmt(Cmt cmt)
    {
        return cmtMapper.insertCmt(cmt);
    }

    /**
     * 修改补水箱运行信息
     * 
     * @param cmt 补水箱运行信息
     * @return 结果
     */
    @Override
    public int updateCmt(Cmt cmt)
    {
        return cmtMapper.updateCmt(cmt);
    }

    /**
     * 批量删除补水箱运行信息
     * 
     * @param cmtIds 需要删除的补水箱运行信息ID
     * @return 结果
     */
    @Override
    public int deleteCmtByIds(String[] cmtIds)
    {
        return cmtMapper.deleteCmtByIds(cmtIds);
    }

    /**
     * 删除补水箱运行信息信息
     * 
     * @param cmtId 补水箱运行信息ID
     * @return 结果
     */
    @Override
    public int deleteCmtById(String cmtId)
    {
        return cmtMapper.deleteCmtById(cmtId);
    }
}
