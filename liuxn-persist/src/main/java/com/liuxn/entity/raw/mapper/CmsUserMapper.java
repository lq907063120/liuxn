package com.liuxn.entity.raw.mapper;

import com.liuxn.manager.entity.CmsUser;
import com.liuxn.manager.entity.CmsUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsUserMapper {
    int countByExample(CmsUserExample example);

    int deleteByExample(CmsUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CmsUser record);

    int insertSelective(CmsUser record);

    List<CmsUser> selectByExample(CmsUserExample example);

    CmsUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CmsUser record, @Param("example") CmsUserExample example);

    int updateByExample(@Param("record") CmsUser record, @Param("example") CmsUserExample example);

    int updateByPrimaryKeySelective(CmsUser record);

    int updateByPrimaryKey(CmsUser record);
}