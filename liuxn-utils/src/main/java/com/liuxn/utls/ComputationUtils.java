package com.liuxn.utls;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.NumberFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 关于一些BigDecimal类型的工具类
 * create by lxn
 * 2018/2/28 14:18
 **/
public class ComputationUtils {

    private static Logger logger = LoggerFactory.getLogger(ComputationUtils.class);

    private static final DecimalFormat df = new DecimalFormat();

    /**
     * 货币格式化
     */
    private static final NumberFormat currency = NumberFormat.getCurrencyInstance();

    /**
     * 百分比格式化
     */
    private static final  NumberFormat percent = NumberFormat.getPercentInstance();

    /**
     * 四舍五入。不足两位时，用0补全
     *
     * @param b
     * @param pattern 保留位数，例： 0.00（俩位） 0.000（三位）
     * @return
     */
    public static String roundHalfUp(BigDecimal b, String pattern) {
        String result = "0.00";
        if (b != null) {
            df.applyPattern(pattern);
            result = df.format(b.doubleValue());
        }
        logger.info(MessageFormat.format("四舍五入：{0} ,保留小数位数模板：{1}", result, pattern));
        return result;
    }


    /**
     * 获取百分比（四舍五入）
     *
     * @param mult1
     * @param pattern 列：0-10%; 0.0-10.0%; 0.00-10.00%
     * @return
     */
    public static String multAndPercentage(BigDecimal mult1, String pattern) {
        String result = "0%";
        if (mult1 != null) {
            df.applyPattern(pattern);
            BigDecimal mult2 = new BigDecimal(100);
            BigDecimal multiply = mult1.multiply(mult2);
            result = df.format(multiply) + "%";
        }
        logger.info(MessageFormat.format("四舍五入百分比：{0} ,保留小数位数模板：{1}", result, pattern));
        return result;
    }


    /**
     *  得到货币金额（四舍五入）
     * @param b 转换的数
     * @param i 保留小数的位数
     * @return
     */
    public static String getCurrency(BigDecimal b,int i) {
        String result = "￥0";
        if (b != null) {
            currency.setMaximumFractionDigits(i);
            result = currency.format(b);
        }
        logger.info(MessageFormat.format("人民币：{0} , 保留小数位：{1}位",result,i));
        return result;
    }

    /**
     * 获取百分比
     * @param b
     * @param i 保留小数的位数
     * @return
     */
    public static String getPercent(BigDecimal b,int i){
        String result = "0%";
        if(b!=null){
            percent.setMaximumFractionDigits(i);
            result = percent.format(b);
        }
        logger.info(MessageFormat.format("百分比：{0} ,保留小数位：{1}位",result,i));
        return result;
    }

    public static void main(String[] args) {
        Double d = 0.554548;
        BigDecimal bigDecimal = new BigDecimal(d.doubleValue());
        multAndPercentage(bigDecimal, "0.00");
        roundHalfUp(bigDecimal, "0.00");
        getCurrency(bigDecimal,3);
        getPercent(bigDecimal, 1);
    }
}
