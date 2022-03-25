/**
 * 
 */
package com.greatlearning.model;

/**
 * @author Shreyas
 *
 */
public class HrDepartment extends SuperDepartment{

	
	public String departmentName() {
		String str = "HR Department";
		return str;
	}
	
	public String getTodaysWork() {
		String str = "Fill Today's Worksheet and Mark your Attendance";
		return str;
	}
	
	public String getWorkDeadline() {
		String str = "Complete by EOD";
		return str;
	}
	
	public String doActivity() {
		String str = "Team Lunch";
		return str;
	}
	
	
	
}
