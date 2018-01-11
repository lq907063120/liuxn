package com.liuxn.service.impl;

import com.liuxn.entity.raw.mapper.CmsUserMapper;
import com.liuxn.entity.raw.model.CmsUser;
import com.liuxn.service.CMSUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * create by lxn
 * 2018/1/11 14:52
 */
@Service
public class CMSUserServiceImpl implements CMSUserService {

    @Autowired
    private CmsUserMapper cmsUserMapper;


    public CmsUser selectByPrimaryKey(Integer id) {
        return cmsUserMapper.selectByPrimaryKey(id);
    }
}
