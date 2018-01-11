package com.liuxn.service;

import com.liuxn.entity.raw.model.CmsUser;
import com.liuxn.service.impl.CMSUserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * create by lxn
 * 2018/1/11 16:18
 */
@ContextConfiguration(locations = {"classpath*:spring/*.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class CMSUserServiceTest {
    @Autowired
    private CMSUserServiceImpl cmsUserService;

    @Test
    public void selectByPrimaryKey() throws Exception {
        CmsUser cmsUser = cmsUserService.selectByPrimaryKey(1);
        System.out.println(cmsUser.toString());

    }
}
