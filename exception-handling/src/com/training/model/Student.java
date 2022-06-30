package com.training.model;

import com.training.exception.RangeCheckException;

public class Student {
	
	private int rollNumber;
	private String firstName;
	private double markScored;
	public Student() {
		super();
	}
	public Student(int rollNumber, String firstName, double markScored) throws RangeCheckException {
		super();
		if(markScored<0) {
			// throw Exceptio here
		} else {
		this.rollNumber = rollNumber;
		this.firstName = firstName;
		this.markScored = markScored;
		}
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public double getMarkScored() {
		return markScored;
	}
	public void setMarkScored(double markScored) {
		if(markScored<0) {
			
			try {
				// throw Exception here  and catch exception in the catch block
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
		  this.markScored = markScored;
		}
	}
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", firstName=" + firstName + ", markScored=" + markScored + "]";
	}
	
	

}
