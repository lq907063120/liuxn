package com.liuxn.utls;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * 关于一些BigDecimal类型的工具类
 * create by Administrator
 * 2018/2/28 14:18
 **/
public class ComputationUtils {

   private static final DecimalFormat df = new DecimalFormat();

    /**
     * 四舍五入，保留两位。不足两位时，用0补全
     * @param b
     * @param pattern 保留位数，例： 0.00（俩位） 0.000（三位）
     * @return
     */
    public static String roundHalfUp(BigDecimal b,String pattern) {
        String result = "0.00" ;
        if (b != null) {
            df.applyPattern(pattern);
            result =df.format(b.doubleValue());
        } else {
            result =  "0.00";
        }
        return result;
    }


    /**
     * 获取百分比（四舍五入）
     * @param mult1
     * @param pattern 列：0-10%; 0.0-10.0%; 0.00-10.00%
     * @return
     */
    public static String multAndPercentage(BigDecimal mult1,String pattern){
        df.applyPattern(pattern);
        BigDecimal mult2 = new BigDecimal(100);
        BigDecimal multiply = mult1.multiply(mult2);
        String format = df.format(multiply);
        return format+"%";
    }



    public static void main(String[] args) {
        Double d = 0.554548;
        BigDecimal bigDecimal =  new BigDecimal(d.doubleValue());
        String s = multAndPercentage(bigDecimal,"0.00");
        System.out.println(s);
        System.out.println("--------------------------------");
        String s1 = roundHalfUp(bigDecimal, "0.00");
        System.out.println(s1);
    }
}
