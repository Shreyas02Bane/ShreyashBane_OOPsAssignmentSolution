/**
 * 
 */
package com.greatlearning.main;

//importing classes from model package
import com.greatlearning.model.AdminDepartment;
import com.greatlearning.model.HrDepartment;
import com.greatlearning.model.SuperDepartment;
import com.greatlearning.model.TechDepartment;

/**
 * @author Shreyas
 *
 */
public class DriverClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//Creating objects for Admin, HR and Tech Departments
		AdminDepartment admin = new AdminDepartment();
		HrDepartment hr = new HrDepartment();
		TechDepartment tech = new TechDepartment();
		
		
		
		//Printing Admin Department methods
		System.out.println("Welcome to "+admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday()); //Printing String from isTodayAHoliday Method from superclass
		
		
		
		//Printing HR Department methods
		System.out.println("\n\nWelcome to "+hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());//Printing isTodayAHoliday Method from superclass
		
		
		
		//Printing Tech Department methods
		System.out.println("\n\nWelcome to "+tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());//Printing isTodayAHoliday Method from superclass

	}

}
