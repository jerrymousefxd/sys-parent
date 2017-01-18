package com.eaju.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

	public static void main(String[] args) {
		String time = getCurrentStrDateBySpecifiedFormatType("yyyy-MM-dd HH:mm:ss");
		System.out.println(time);

	}
	
	/**
    * 按特定的日期格式获取当前字符串型日期
    *
    * @param dateFormatType
    * String，日期格式<br>
    * 几种日期格式和测试的结果<br>
    * "yyyy-MM-dd": 2012-08-02<br>
    * "yyyy-MM-dd hh:mm:ss": 2012-08-02 11:27:41<br>
    * "yyyy-MM-dd hh:mm:ss EE": 2012-08-02 11:27:41 星期四<br>
    * "yyyy年MM月dd日 hh:mm:ss EE": 2012年08月02日 11:27:41 星期四<br>
    * @return String 当前字符串型日期
    */
   public static String getCurrentStrDateBySpecifiedFormatType(String dateFormatType) {
       java.text.SimpleDateFormat simformat = new SimpleDateFormat(dateFormatType);
       return simformat.format(new java.util.Date());
   }
   
   /**
    * 按特定的日期格式获取字符串型日期
    * @param dateFormatType
    * String，日期格式<br>
    * 几种日期格式和测试的结果<br>
    * "yyyy-MM-dd": 2012-08-02<br>
    * "yyyy-MM-dd hh:mm:ss": 2012-08-02 11:27:41<br>
    * "yyyy-MM-dd hh:mm:ss EE": 2012-08-02 11:27:41 星期四<br>
    * "yyyy年MM月dd日 hh:mm:ss EE": 2012年08月02日 11:27:41 星期四<br>
    * @return String 字符串型日期
    */
   public static String getStrDate(Date date,String dateFormatType) {
       java.text.SimpleDateFormat simformat = new SimpleDateFormat(dateFormatType);
       return simformat.format(date);
   }

}
