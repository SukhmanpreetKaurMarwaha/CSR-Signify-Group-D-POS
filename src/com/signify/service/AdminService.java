/**
 * 
 */
package com.signify.service;

/**
 * @author Tejaswini.S.J
 *
 */
public class AdminService 
{
      public void addProfessor(String name,String department,String designation)
      {
    	  System.out.println("Professor added");
      }
      public void assignCourse(int studentId,String courseCode)
      {
    	  System.out.println("course assigned");
      }
      public void approveStudent(int studentId,String courseCode)
      {
    	  System.out.println("student approved");
      }
}
