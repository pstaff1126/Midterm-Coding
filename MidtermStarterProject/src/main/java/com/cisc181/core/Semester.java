package com.cisc181.core;

import java.util.UUID;
import java.util.Date;
public class Semester {
	private UUID CourseID;
	private Date StartDate;
	private Date EndDate;
	
	Semester(UUID courseid, Date startdate, Date enddate) {
		this.CourseID=courseid;
		this.StartDate=startdate;
		this.EndDate=enddate;
	}
	public Date getEndDate() {
		return EndDate;
	}
	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}
	public Date getStartDate() {
		return StartDate;
	}
	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}
	public UUID getCourseID() {
		return CourseID;
	}
	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	}
	public static void main(String args[]) {
		
	}

}
