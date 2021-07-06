package com.news.util;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	private static final String PATTERN = "yyyy-MM-dd";
	public static Date stringToDate(String source){
		SimpleDateFormat sdf = new SimpleDateFormat(PATTERN);
		try {
			return sdf.parse(source);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	public static String dateToString(Date source){
		SimpleDateFormat sdf = new SimpleDateFormat(PATTERN);
		return sdf.format(source);
	}
	public static java.sql.Date toSqlDate(Date source){
		if(source==null)
			return null;
		return new java.sql.Date(source.getTime());
	}
	public static Timestamp toTimestamp(Date source){
		if(source==null)
			return null;
		return new Timestamp(source.getTime());
	}
}
