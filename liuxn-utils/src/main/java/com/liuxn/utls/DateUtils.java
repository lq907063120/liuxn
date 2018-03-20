package com.liuxn.utls;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

/**
 * 关于时间的一些操作
 * create by lxn
 * 2018/3/1 15:57
 **/
public class DateUtils {

    private static Logger logger = LoggerFactory.getLogger(ComputationUtils.class);

    private static final String formatPattern_0 = "yyyy-MM-dd HH:mm:ss";
    private static final String formatPattern_1 = "yyyy-MM-dd HH:mm";
    private static final String formatPattern_2 = "yyyy-MM-dd";
    private static final String formatPattern_3 = "yyyy年MM月dd日 HH时mm分ss秒";
    private static final String formatPattern_4 = "yyyy年MM月dd日 HH时mm分";
    private static final String formatPattern_5 = "yyyy年MM月dd日";

    private static final Calendar cal = Calendar.getInstance();


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
    }

    /**
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


    /**
     * 获取时间戳
     *
     * @param date
     * @return
     */
    public static long formatToTimestamp(Date date) {
        long time = 0L;
        if (date != null) {
            time = date.getTime();
        }
        return time;
    }

    /**
     * 时间戳转换成时间
     *
     * @param l
     * @return yyyy-MM-dd HH:mm:ss
     */
    public static String longFormatDate(long l) {
        String format = "";
        if (l > 0L) {
            format = formatToDate_0(new Date(l));
        }
        return format;
    }

    /**
     * 时间比较
     *
     * @param d1
     * @param d2
     * @return d1 < d2 true
     */
    public static boolean oneIsLtTwoOfDate(Date d1, Date d2) {
        Boolean result = false;
        if (d1 != null && d2 != null) {
            if (d1.getTime() < d2.getTime()) {
                result = true;
            }
        }
        logger.info(MessageFormat.format("[{0}]早于[{1}] ,result:[{2}]", d1, d2, result));
        return result;
    }


    /**
     * 获取所在的年份
     *
     * @param date
     * @return year
     */
    public static String getYear(Date date) {
        int year = -1;
        if (date != null) {
            cal.setTime(date);
            year = cal.get(Calendar.YEAR);
        }
        logger.info(MessageFormat.format("从[{0}]中获取年份：[{1}]", date, String.valueOf(year)));
        return String.valueOf(year);
    }

    /**
     * 获取所在月份
     *
     * @param date
     * @return
     */
    public static int getMonth(Date date) {
        int month = -1;
        if (date != null) {
            cal.setTime(date);
            month = cal.get(Calendar.MONTH) + 1;
        }
        logger.info(MessageFormat.format("从[{0}]中获取月份：[{1}]", date, month));
        return month;
    }

    /**
     * 获取所在月的几号
     *
     * @param date
     * @return
     */
    public static int getDayOfMonth(Date date) {
        int day = -1;
        if (date != null) {
            cal.setTime(date);
            day = cal.get(Calendar.DAY_OF_MONTH);
        }
        logger.info(MessageFormat.format("从[{0}]月中获第[{1}]天", date, day));
        return day;
    }

    public static int getDayOfYear(Date date) {
        int days = -1;
        if (date != null) {
            cal.setTime(date);
            days = cal.get(Calendar.DAY_OF_YEAR);
        }
        logger.info(MessageFormat.format("[{0}]位于[{1}]年的第[{2}]天", formatToDate_2(date), getYear(date), days));
        return days;
    }

    /**
     * 获取当前时间的前几天
     *
     * @param i int
     * @return yyyy-MM-dd HH:mm:ss
     */
    public static String getLtOfCurrentDate(int i) {

        return null;
    }

    /**
     * 获取时间差
     * @param d1 java.util.Date
     * @param d2 java.util.Date
     *           d1 < d2
     * @return *天*时*分钟*秒
     */
    public static String getD1andD2Subtraction(Date d1, Date d2) {

        if (d1 == null || d2 == null) {
            throw new NullPointerException(MessageFormat.format("[{0}],[{1}] 为空", d1, d2));
        }
        logger.info(""+d1);
        logger.info(""+d2);
        long l, day, min, sec, hour;
        String result = "";
        if (oneIsLtTwoOfDate(d1, d2)) {
            //相差毫秒
            l = d2.getTime() - d1.getTime();
            day = l / (24 * 60 * 60 * 1000);//天
            hour = (l / (60 * 60 * 1000) - day * 24);//小时
            min = ((l / (60 * 1000)) - day * 24 * 60 - hour * 60);//分钟
            sec = (l / 1000 - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60);//秒
            long[] times = {day, hour, min, sec};
            System.out.println( Arrays.toString(times) );
            if (sec != 0) {
                result = sec + "秒";
            }
            if (min != 0) {
                result = min + "分钟" + result;
            }
            if (hour != 0) {
                result = hour + "小时" + result;
            }
            if (day != 0) {
                result = day + "天" + result;
            }
        } else {
            throw new RuntimeException(MessageFormat.format("[{0}]晚于[{1}]", d1, d2));
        }
        logger.info(result);
        return result;
    }

    public static void main(String[] args) throws Exception {
//        Date date = new Date();
//        String format = formatToDate_0(date);
//        System.out.println(format);
//        String s = formatToDate_1(date);
//        System.out.println(s);
//        String s1 = formatToDate_2(date);
//        System.out.println(s1);
//        String s3 = formatToDate_3(date);
//        System.out.println(s3);
//        String s4 = formatToDate_4(date);
//        System.out.println(s4);
//        String s5 = formatToDate_5(date);
//        System.out.println(s5);
//        long l = formatToTimestamp(date);
//        System.out.println(l);
//        long l1 = System.currentTimeMillis();
//        String s2 = longFormatDate(l1);
//        System.out.println(s2);
        String da1 = "2018-01-01 12:00:00";
        String da2 = "2018-01-02 12:12:12";
        sdf.applyPattern(formatPattern_0);
//        oneIsLtTwoOfDate(sdf.parse(da1), sdf.parse(da2));
//        getYear(date);
//        getMonth(date);
//        getDayOfMonth(date);
//        getDayOfYear(date);
        getD1andD2Subtraction(sdf.parse(da1), sdf.parse(da2));


    }
}
