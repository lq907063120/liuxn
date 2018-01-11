package com.liuxn;

import java.math.BigDecimal;

/**
 * create by lxn
 * 2018/1/11 15:02
 */
public class Test {
    public static void main(String[] args) {
        BigDecimal b = BigDecimal.valueOf(2);
        BigDecimal b1 = BigDecimal.valueOf(14);
        BigDecimal multiply = b1.multiply(b);
        System.out.println(multiply);
    }
}
