/**
 * 
 */
package com.greatlearning.model;

/**
 * @author Shreyas
 *
 */
public class AdminDepartment extends SuperDepartment{

	public String departmentName() {
		String str = "Admin Department";
		return str;
	}
	
	public String getTodaysWork() {
		String str = "Complete your Documents Submission";
		return str;
	}
	
	public String getWorkDeadline() {
		String str = "Complete by EOD";
		return str;
	}
	
	
}
