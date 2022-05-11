package org.student;

import org.department.*;

public class Student extends Department {
	public void studentName() {
		System.out.println("StudentName : rebecca ");
	}
	public void studentDept() {
		System.out.println("StudentDept : computer applications ");
	}
	public void studentID() {
		System.out.println("studentID : 107 ");
	}
	
	
	public static void main(String[] args) 
	{
		 
	Student obj = new Student ();

	 obj.studentName();
	 obj.studentDept();
	 obj.studentID();
	}
}
