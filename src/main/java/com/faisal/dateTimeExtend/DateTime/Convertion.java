package com.faisal.dateTimeExtend.DateTime;

import java.util.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;

public class Convertion {

	Date date;
	
	public static LocalTime convertCalanderTimeToLocalTime(Calendar cal)
	{
		LocalTime time =LocalTime.of(cal.get(Calendar.HOUR),cal.get(Calendar.MINUTE),cal.get(Calendar.SECOND));
		return time;
		
	}
	
	public static LocalDate convertCalanderToLocalDate(Calendar cal) {
		LocalDate date = LocalDate.of(cal.get(Calendar.YEAR),
		        cal.get(Calendar.MONTH),
		        cal.get(Calendar.DAY_OF_MONTH));
		return date;
		
		
	}
	
	public static LocalDate ConvertDateToLocalDate(Date date)
	{	
		return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	}
	
	public static Date convertLocalDateToDate(LocalDate ld)
	{
		return Date.from(ld.atStartOfDay(ZoneId.systemDefault()).toInstant());
	}
	
	public static LocalTime convertTimeToLocalTime(Date time)
	{
		return Instant.ofEpochMilli(time.getTime()).atZone(ZoneId.systemDefault()).toLocalTime();
	}
}
