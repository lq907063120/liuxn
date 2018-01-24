package com.liuxn.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * create by lxn
 * 2018/1/24 16:36
 */
public class TestLogger {

    private static Logger logger = LoggerFactory.getLogger(TestLogger.class);


    public static void main(String[] args) {
        //获取当前类全限定名
        String name = logger.getName();
        System.out.println(name);

    }
}
