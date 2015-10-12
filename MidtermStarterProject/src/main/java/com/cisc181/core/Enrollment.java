package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	private Enrollment(){
		
	}
	Enrollment(UUID studentid, UUID sectionid) {
		this.StudentID=studentid;
		this.SectionID=sectionid;
		this.EnrollmentID=java.util.UUID.randomUUID();
	}
	public void setGrade(double grade) {
		this.Grade=grade;
	}
	public double getGrade() {
		return this.Grade;
	}
	public static void main(String args[]) {
		
	}
}
