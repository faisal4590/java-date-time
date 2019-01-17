package com.faisal.dateTimeExtend.DateTime;

import static org.junit.Assert.*;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

import javax.swing.text.DateFormatter;

import java.util.*;

import org.junit.Test;
import java.util.TimeZone;
public class ConvertionTest {

	@Test
	public void calendarDateTolocalDateTest() {
		Calendar cal = Calendar.getInstance();
		cal.set(2022, Calendar.FEBRUARY+1, 16);
		LocalDate a = Convertion.convertCalanderToLocalDate(cal);
		
		assertEquals(LocalDate.of(2022, Month.FEBRUARY, 16), a);
	}
	
	@Test
	public void calendarTimeToLocalTime()
	{
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR, 3);
		cal.set(Calendar.MINUTE, 41);
		cal.set(Calendar.SECOND, 50);
		
		LocalTime a = Convertion.convertCalanderTimeToLocalTime(cal);
		assertEquals(LocalTime.of(3, 41, 50), a);
	}
	
	
	
	@Test
	public void dateToLocalDate() throws ParseException
	{
		String dateValueString = "Thu, Jan 16 2019 23:37:50";
	    SimpleDateFormat sdf = new SimpleDateFormat("E, MMM dd yyyy HH:mm:ss");
	    Date date =  sdf.parse(dateValueString);
	    
	    assertEquals(LocalDate.of(2019, Month.JANUARY, 16), Convertion.ConvertDateToLocalDate(date));
	    
	}
	
	@Test
	public void localDateToDate() throws ParseException
	{
		LocalDate ld = LocalDate.of(2019, 1, 16);
		
		String dateValueString = "Thu, Jan 16 2019";
	    SimpleDateFormat sdf = new SimpleDateFormat("E, MMM dd yyyy");
	    Date date =  sdf.parse(dateValueString);
		assertEquals(date, Convertion.convertLocalDateToDate(ld));
	}
	
	@Test
	public void timeToLocalTime() throws ParseException
	{
		String dateValueString = "Thu, Mar 20 2019 5:35:15";
	    SimpleDateFormat sdf = new SimpleDateFormat("E, MMM dd yyyy HH:mm:ss");
	    Date date =  sdf.parse(dateValueString);
	    
	    assertEquals(LocalTime.of(5,35,15), Convertion.convertTimeToLocalTime(date));
	    
	    //System.out.println(Convertion.convertTimeToLocalTime(date));
	}
	
	@Test
	public void LocalTimeToTime() throws ParseException
	{
		//incomplete
		
		/*
		
		LocalTime lt = LocalTime.of(5, 35, 15);
		
		String TimeValueString = "5:35:15";
	    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	    Time time =  (Time) sdf.parse(TimeValueString);
	    
	    //assertEquals(time, Convertion.convertLocalTimeToTime(lt));
	    
	    System.out.println(time);
	    
	    */
 	}
	
	
	@Test
	public void DateToOffsetDate()
	{
		Calendar cal = Calendar.getInstance();
		ZoneOffset offset = ZoneOffset.ofHoursMinutes(1, 30);
		OffsetDateTime dateTime1=OffsetDateTime.of(LocalDateTime.of(2019, 01, 12, 05, 45),
				ZoneOffset.ofHoursMinutes(6, 30));
		//assertNotEquals(dateTime1,Convertion.DateToOffsetDateTime(cal, offset));
		//System.out.println(dateTime1);
	}
	
	@Test
	public void offsetDateToInstant()
	{
		OffsetDateTime offsetDateTime = OffsetDateTime.of(2014, 12, 03, 10, 15, 30, 0,
				ZoneOffset.ofHours(+6));
		Instant in1 = Instant.parse("2014-12-03T04:15:30.00Z");
		//System.out.println("offsetDateTime = " + Instant.parse("2014-12-03T10:15:30.00Z"));
		assertEquals(in1, Convertion.convertOffsetDateTimeToInstant(offsetDateTime));
		
	}
	
	@Test
	public void offsetDateTimeToLocalDate()
	{
		OffsetDateTime offsetDateTime = OffsetDateTime.of(2014, 12, 03, 10, 15, 30, 0,
				ZoneOffset.ofHours(+6));
		
		assertEquals(LocalDate.of(2014, 12, 03), Convertion.convertOffsetDateTimeToLocalDate(offsetDateTime));
	}
	
	
	
	@Test
	public void offsetDateTimeToLocalDateTime()
	{
		OffsetDateTime offsetDateTime = OffsetDateTime.of(2014, 12, 03, 10, 15, 30, 0,
				ZoneOffset.ofHours(+6));
		
		assertEquals(LocalDateTime.of(2014, 12, 03,10,15,30), Convertion.convertOffsetDateTimeToLocalDateTime(offsetDateTime));
	}
	
	@Test
	public void localDateTimeToOffsetDateTime() {
		
		LocalDateTime date=LocalDateTime.of(2014, 12,3,10,15,30);
		assertEquals(OffsetDateTime.of(2014, 12, 03, 10, 15, 30, 0,
				ZoneOffset.ofHours(+6)), Convertion.convertLocalDateTimeToOffsetDateTime(date));
		
	}
	
	@Test
	public void offsetDateTimeToLocalTime()
	{
		OffsetDateTime offsetDateTime = OffsetDateTime.of(2014, 12, 03, 10, 15, 30, 0,
				ZoneOffset.ofHours(+6));
		
		assertEquals(LocalTime.of(10, 15, 30), Convertion.convertOffsetDateTimeToLocalTime(offsetDateTime));
	}
	
	@Test
	public void offsetDateTimeToOffsetTime()
	{
		OffsetDateTime offsetDateTime = OffsetDateTime.of(2014, 12, 03, 10, 15, 30, 0,
				ZoneOffset.ofHours(+6));
		
		assertEquals(OffsetTime.of(10, 15,30,0, ZoneOffset.ofHours(6)), Convertion.convertOffsetDateTimeToOffsetTime(offsetDateTime));
	}
	
	
	@Test
	public void caldateTimeTolocalDateTimetest() {
		Calendar cal = Calendar.getInstance();
		cal.set(2022, Calendar.FEBRUARY + 1, 16);
		cal.set(Calendar.HOUR, 3);
		cal.set(Calendar.MINUTE, 30);
		cal.set(Calendar.SECOND, 50);
		assertEquals(LocalDateTime.of(2022, Month.FEBRUARY, 16,3,30,50), Convertion.convertCalanderToLocalDateTime(cal));
	}
	

}
