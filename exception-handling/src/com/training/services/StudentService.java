package com.training.services;

import com.training.model.Student;

public class StudentService  {

	
	private Student student;

	public StudentService() {
		super();
	}

	public StudentService(Student student) {
		super();
		this.student = student;
	}
	
	public String sendDetails() {
	
		String name =null;
		try {
		name=	 this.student.getFirstName();

		} catch (NullPointerException e) {

			System.err.println("Student Object Is not passed check Again");
		}
		return name;
	}

	public String findRank() throws Exception {
		
		String grade ="A";
		
		if(this.student.getMarkScored()>90) {
			
			grade ="O";
		}
		
		return grade;
	}
}
