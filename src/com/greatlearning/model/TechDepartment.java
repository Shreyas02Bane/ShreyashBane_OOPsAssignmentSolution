/**
 * 
 */
package com.greatlearning.model;

/**
 * @author Shreyas
 *
 */
public class TechDepartment extends SuperDepartment{

	
	public String departmentName() {
		String str = "Tech Department";
		return str;
	}
	
	public String getTodaysWork() {
		String str = "Complete coding of Module 1";
		return str;
	}
	
	public String getWorkDeadline() {
		String str = "Complete by EOD";
		return str;
	}
	
	public String getTechStackInformation() {
		String str = "Core JAVA";
		return str;
	}
	
}
