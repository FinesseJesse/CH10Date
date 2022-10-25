/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mydate;

/**
 *
 * @author jswai
 */
import java.util.GregorianCalendar;

// Implement NewClass class
public class NewClass {
	// Data Fields
	private int year;
	private int month;
	private int day;

	/** Creates a NewClass object for the current date */
	NewClass() {
		GregorianCalendar calander = new GregorianCalendar();
		year = calander.get(GregorianCalendar.YEAR);
		month = calander.get(GregorianCalendar.MONTH);
		day = calander.get(GregorianCalendar.DAY_OF_MONTH);
	}

	/** Creates a NewClass object with a specified elapsed time
	*	 since midnight, January 1, 1970, in milliseconds */
	NewClass(long elapsedTime) {
		setDate(elapsedTime);
	}

	/** Creates a NewClass object with the 
	*   specified year, month, and day */
	NewClass(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	/** Return year */
	public int getYear() {
		return year;
	}

	/** Return month */
	public String getMonth() {
		String m = String.valueOf(month + 1);
		return (month < 10 ? "0" + m : m);
	}

	/** Return day */
	public String getDay() {
		String d = String.valueOf(day);
		return (day < 10 ? "0" + d : d);
	}

	/** Sets a new date for the object using the elapsed time */
	public void setDate(long elapsedTime) {
		GregorianCalendar calander = new GregorianCalendar();
		calander.setTimeInMillis(elapsedTime);
		year = calander.get(GregorianCalendar.YEAR);
		month = calander.get(GregorianCalendar.MONTH);
		day = calander.get(GregorianCalendar.DAY_OF_MONTH);
	} 
}
    
