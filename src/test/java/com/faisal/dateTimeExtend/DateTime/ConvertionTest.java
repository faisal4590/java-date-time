package com.faisal.dateTimeExtend.DateTime;

import static org.junit.Assert.*;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;
import java.util.*;

import org.junit.Test;

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
		
		LocalTime lt = LocalTime.of(5, 35, 15);
		
		String TimeValueString = "5:35:15";
	    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	    Time time =  (Time) sdf.parse(TimeValueString);
	    
	    //assertEquals(time, Convertion.convertLocalTimeToTime(lt));
	    
	    System.out.println(time);
 	}
	


}
