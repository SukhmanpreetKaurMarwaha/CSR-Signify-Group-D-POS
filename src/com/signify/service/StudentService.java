/**
 * 
 */
package com.signify.service;

/**
 * @author HP
 *
 */
public class StudentService {
	
	public void changePassword(String passwordNew)
	{
		System.out.println("Password Changed");
	}
	
	public void register(int studentId, String branch, int batch)
	{
		System.out.println("Student registered");
	}
	public String viewGradeCard(int studentId )
	{
		return "Card viewed";
	}

}
