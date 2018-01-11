package com.liuxn.entity.raw.mapper;


import com.liuxn.entity.raw.model.CmsUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * create by lxn
 * 2018/1/11 15:06
 */
@ContextConfiguration(locations = { "classpath*:mybatis/*.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class CmsUserMapperTest {
    @Autowired
    private CmsUserMapper cmsUserMapper;

    @Test
    public void selectByPrimaryKey() throws Exception {
        CmsUser cmsUser = cmsUserMapper.selectByPrimaryKey(1);
        System.out.println(cmsUser.toString());

    }

}