package com.faisal.dateTimeExtend.DateTime;

import java.util.Date;
import java.sql.Time;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
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
	
	public static Time convertLocalTimeToTime(LocalTime localTime) 
	{
		return Time.valueOf(localTime);
	}
	
	public static OffsetDateTime  convertLocalDateToOffsetDate(LocalDateTime ldt)
	{
		return OffsetDateTime.of(ldt, ZoneOffset.UTC);
	}
	
	public static LocalDateTime convertCalanderToLocalDateTime(Calendar cal) {
		return LocalDateTime.of(cal.get(Calendar.YEAR),
		        cal.get(Calendar.MONTH),
		        cal.get(Calendar.DAY_OF_MONTH),
		        cal.get(Calendar.HOUR),
		        cal.get(Calendar.MINUTE),
		        cal.get(Calendar.SECOND));
		
	}
	
	public static Instant convertOffsetDateTimeToInstant(OffsetDateTime odt)
	{
		return odt.toInstant();
	}
	
	public static LocalDate convertOffsetDateTimeToLocalDate(OffsetDateTime odt)
	{
		return odt.toLocalDate();
	}
	
	public static LocalDateTime convertOffsetDateTimeToLocalDateTime(OffsetDateTime odt)
	{
		return odt.toLocalDateTime();
	}
	
	public static OffsetDateTime convertLocalDateTimeToOffsetDateTime(LocalDateTime date)
	{
		return date.atOffset(ZoneOffset.ofHours(6));	
	}
	
	public static LocalTime convertOffsetDateTimeToLocalTime(OffsetDateTime odt)
	{
		return odt.toLocalTime();
	}
	
	public static OffsetTime convertOffsetDateTimeToOffsetTime(OffsetDateTime odt)
	{
		return odt.toOffsetTime();
	}
}
