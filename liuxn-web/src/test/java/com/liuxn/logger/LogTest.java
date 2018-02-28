package com.liuxn.logger;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * create by lxn
 * 2018/2/8 12:02
 */
//@RunWith(SpringJUnit4ClassRunner.class)
public class LogTest {

    private static final Log log = LogFactory.getLog(LogTest.class);

    public static void main(String[] args) {
        String id = "1";
        log.elapseStart(id);
        int i = 0;
        for (i = 0; i < 100; i++) {
            if (i == 99) {
                System.out.println("循环完毕100次，当前下标[" + i + "]");
            }
        }

        log.elapseEnd("循环完毕100次，当前下标[" + i + "]" + "--", id);
    }

}