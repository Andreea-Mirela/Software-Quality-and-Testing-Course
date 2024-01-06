package ro.ase.csie.cts.seminar2;

import java.text.DateFormatSymbols;
import java.util.Locale;
//principiile KISS, etc de completat
public class CalendarUtil {
	
	public String weekDay(int day) throws IncorectDayException {
		if(day==1) 
			return "Sunday";
		else if(day==2) 
			return "Monday";
		else if(day==3) 
			return "Tuesday";
		else if(day==4) 
			return "Wednesday";
		else if(day==5) 
			return "Thursday";
		else if(day==6) 
			return "Friday";
		else if(day==7) 
			return "Saturday";
		throw new IncorectDayException("Only 7 days in a week");
					
	}
	
	public String weekDay2(int day) throws IncorectDayException {
		switch(day) {
			case 1: 
				return "Sunday";
			case 2:
				return "Monday";
			case 3:
				return "Tuesday";
			case 4:
				return "Wednesday";
			case 5:
				return "Thursday";
			case 6:
				return "Friday";
			case 7:
				return "Saturday";
				default: 
					throw new IncorectDayException("Only 7 days in a week");
		}
			
	}
	
	public String weekDay3(int day) throws IncorectDayException{
        String[] weekDays = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        if(day<=0||day>7)
        	throw new IncorectDayException("Only 7 days in a week");
        return weekDays[day-1];
    }
		
	//de obicei e o idee proasta sa returnezi null
	// ex System.out.println(cu.weekDay3(9).toUpperCase()); va returna o exceptie
	
	 public String weekDay4(int day) throws IncorectDayException {
	        if (day <= 0 || day > 7){
	            throw new IncorectDayException("Only 7 days in a week");
	        }
	       String[] days =  new DateFormatSymbols().getWeekdays();//fac arrayul de zile dintr o clasa deja existenta in java

	        return days[day];
	    }
}
