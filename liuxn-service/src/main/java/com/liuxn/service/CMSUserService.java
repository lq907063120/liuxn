package com.liuxn.service;

import com.liuxn.entity.raw.model.CmsUser;
import org.springframework.stereotype.Service;

/**
 * create by lxn
 * 2018/1/11 14:52
 */
public interface CMSUserService {

    CmsUser selectByPrimaryKey(Integer id);

}
