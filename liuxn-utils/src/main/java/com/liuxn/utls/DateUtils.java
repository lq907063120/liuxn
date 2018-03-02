package com.liuxn.utls;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 关于时间的一些操作
 * create by lxn
 * 2018/3/1 15:57
 **/
public class DateUtils {

    private static final String formatPattern_0 = "yyyy-MM-dd HH:mm:ss";
    private static final String formatPattern_1 = "yyyy-MM-dd HH:mm";
    private static final String formatPattern_2 = "yyyy-MM-dd";
    private static final String formatPattern_3 = "yyyy年MM月dd日 HH时mm分ss秒";
    private static final String formatPattern_4 = "yyyy年MM月dd日 HH时mm分";
    private static final String formatPattern_5 = "yyyy年MM月dd日";


    private static final SimpleDateFormat sdf = new SimpleDateFormat();

    /**
     * 格式化日期时间(精确到秒)
     *
     * @param date java.util.Date
     * @return yyyy-MM-dd HH:mm:ss
     */
    public static String formatToDate_0(Date date) {
        String format = "";
        if (date != null) {
            sdf.applyPattern(formatPattern_0);
            format = sdf.format(date);
        }
        return format;
    }

    /**
     * 格式化日期时间(精确到分)
     *
     * @param date java.util.Date
     * @return yyyy-MM-dd HH:mm
     */
    public static String formatToDate_1(Date date) {
        String format = "";
        if (date != null) {
            sdf.applyPattern(formatPattern_1);
            format = sdf.format(date);
        }
        return format;
    }

    /**
     * 格式化日期时间
     *
     * @param date java.util.Date
     * @return yyyy-MM-dd
     */
    public static String formatToDate_2(Date date) {
        String format = "";
        if (date != null) {
            sdf.applyPattern(formatPattern_2);
            format = sdf.format(date);
        }
        return format;
    }

    /**
     * 格式化日期
     *
     * @param date java.util.Date
     * @return yyyy年MM月dd HH时mm分ss秒
     */
    public static String formatToDate_3(Date date) {
        String format = "";
        if (date != null) {
            sdf.applyPattern(formatPattern_3);
            format = sdf.format(date);
        }
        return format;
    }

    /**
     * 格式化日期
     *
     * @param date java.util.Date
     * @return yyyy年MM月dd HH时mm分
     */
    public static String formatToDate_4(Date date) {
        String format = "";
        if (date != null) {
            sdf.applyPattern(formatPattern_4);
            format = sdf.format(date);
        }
        return format;
    }    /**
     * 格式化日期
     *
     * @param date java.util.Date
     * @return yyyy年MM月dd
     */
    public static String formatToDate_5(Date date) {
        String format = "";
        if (date != null) {
            sdf.applyPattern(formatPattern_5);
            format = sdf.format(date);
        }
        return format;
    }


    public static long formatToTimestamp(Date date){
        long time = 0L;
        if(date!=null){
             time = date.getTime();
        }
        return time;
    }


    public static void main(String[] args) {
        Date date = new Date();
        String format = formatToDate_0(date);
        System.out.println(format);
        String s = formatToDate_1(date);
        System.out.println(s);
        String s1 = formatToDate_2(date);
        System.out.println(s1);
        String s3 = formatToDate_3(date);
        System.out.println(s3);
        String s4 = formatToDate_4(date);
        System.out.println(s4);
        String s5 = formatToDate_5(date);
        System.out.println(s5);

    }
}
