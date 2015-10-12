package com.cisc181.core;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;
public class StudentTest {
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() {
		ArrayList<Course> course= new ArrayList<Course>();
		ArrayList<Semester> semester= new ArrayList<Semester>();
		ArrayList<Section> section= new ArrayList<Section>();
		ArrayList<Student> students= new ArrayList<Student>();
		Course course1= new Course(UUID.fromString("CISC181"),"Programming 2",4);
		Course course2= new Course(UUID.fromString("Math451"),"Abstract Algebra",4);
		Course course3= new Course(UUID.fromString("Engl280"),"Type of Literature",4);
		Semester sem1=new Semester(UUID.fromString("Cisc181"),new Date (8), new Date (12));
		Semester sem2=new Semester(UUID.fromString("Cisc181"),new Date (1), new Date (5));
		Section sec1=new Section(UUID.fromString("Cisc181"),UUID.fromString("Fall2015"),UUID.fromString("010"),400);
		Section sec2=new Section(UUID.fromString("Cisc181"),UUID.fromString("Spring2015"),UUID.fromString("010"),401);
		Section sec3=new Section(UUID.fromString("Math451"),UUID.fromString("Fall2015"),UUID.fromString("010"),401);
		Section sec4=new Section(UUID.fromString("Math451"),UUID.fromString("Spring2015"),UUID.fromString("010"),400);
		Section sec5=new Section(UUID.fromString("Engl280"),UUID.fromString("Fall2015"),UUID.fromString("010"),403);
		Section sec6=new Section(UUID.fromString("Engl280"),UUID.fromString("Spring2015"),UUID.fromString("010"),404);
		Student s1= new Student("Pat","james","Stafford", new Date (1993),eMajor.CHEM,"2 Cedar Ln","3027536332","pstaff");
		Student s2= new Student("Abbie","Jane","Stapple", new Date (1992),eMajor.CHEM,"3 Cedar Ln","3027536332","jstap");
		Student s3= new Student("Rod","E","White", new Date (1994),eMajor.NURSING,"4 Cedar Ln","3027536332","rwhite");
		Student s4= new Student("Art","E","Lange", new Date (1996),eMajor.COMPSI,"5 Cedar Ln","3027536332","alange");
		Student s5= new Student("Sharon","F","Cox", new Date (1991),eMajor.COMPSI,"6 Cedar Ln","3027536332","scox");
		Student s6= new Student("Eaton","L","Beater", new Date (1989),eMajor.BUSINESS,"7 Cedar Ln","3027536332","ebeat");
		Student s7= new Student("Clint","K","Ross", new Date (1990),eMajor.BUSINESS,"8 Cedar Ln","3027536332","cross");
		Student s8= new Student("Suzy","Sun","Summers", new Date (1988),eMajor.PHYSICS,"9 Cedar Ln","3027536332","ssum");
		Student s9= new Student("Tayne","Fayne","Train", new Date (1982),eMajor.PHYSICS,"10 Cedar Ln","3027536332","TAYNE");
		Student s10= new Student("Tim","Tiny","Tom", new Date (1944),eMajor.NURSING,"11 Cedar Ln","3027536332","tinytim");
		course.add(course1);
		course.add(course2);
		course.add(course3);
		semester.add(sem1);
		semester.add(sem2);
		section.add(sec1);
		section.add(sec2);
		section.add(sec3);
		section.add(sec4);
		section.add(sec5);
		section.add(sec6);
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		students.add(s6);
		students.add(s7);
		students.add(s8);
		students.add(s9);
		students.add(s10);
		ArrayList<Enrollment> enroll=new ArrayList<Enrollment>();
		for(int i=0; i<students.size(); i++) {
			for(int j=0; j<section.size(); j++) {
				Enrollment l=new Enrollment(section.get(j).getSectionID(),UUID.fromString(students.get(i).getLastName()));
				enroll.add(l);
			}
			
		}
		enroll.get(0).setGrade(98);
		enroll.get(1).setGrade(80);
		enroll.get(2).setGrade(78);
		enroll.get(3).setGrade(100);
		enroll.get(4).setGrade(91);
		enroll.get(5).setGrade(65);
		enroll.get(6).setGrade(42);
		enroll.get(7).setGrade(77);
		enroll.get(8).setGrade(90);
		enroll.get(9).setGrade(79);
		int sum=0;
		for (int i=0;i<enroll.size(); i++) {
			sum+=enroll.get(i).getGrade();
		}
		double average=sum/enroll.size();
		
		
	}
	

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}
	@Test
	public void testAverage() {
		ArrayList<Course> course= new ArrayList<Course>();
		ArrayList<Semester> semester= new ArrayList<Semester>();
		ArrayList<Section> section= new ArrayList<Section>();
		ArrayList<Student> students= new ArrayList<Student>();
		Course course1= new Course(UUID.fromString("Cisc181"),"Programming 2",4);
		Course course2= new Course(UUID.fromString("Math451"),"Abstract Algebra",4);
		Course course3= new Course(UUID.fromString("Engl280"),"Type of Literature",4);
		Semester sem1=new Semester(UUID.fromString("Cisc181"),new Date (8), new Date (12));
		Semester sem2=new Semester(UUID.fromString("Cisc181"),new Date (1), new Date (5));
		Section sec1=new Section(UUID.fromString("Cisc181"),UUID.fromString("Fall2015"),UUID.fromString("010"),400);
		Section sec2=new Section(UUID.fromString("Cisc181"),UUID.fromString("Spring2015"),UUID.fromString("010"),401);
		Section sec3=new Section(UUID.fromString("Math451"),UUID.fromString("Fall2015"),UUID.fromString("010"),401);
		Section sec4=new Section(UUID.fromString("Math451"),UUID.fromString("Spring2015"),UUID.fromString("010"),400);
		Section sec5=new Section(UUID.fromString("Engl280"),UUID.fromString("Fall2015"),UUID.fromString("010"),403);
		Section sec6=new Section(UUID.fromString("Engl280"),UUID.fromString("Spring2015"),UUID.fromString("010"),404);
		Student s1= new Student("Pat","james","Stafford", new Date (1993),eMajor.CHEM,"2 Cedar Ln","3027536332","pstaff");
		Student s2= new Student("Abbie","Jane","Stapple", new Date (1992),eMajor.CHEM,"3 Cedar Ln","3027536332","jstap");
		Student s3= new Student("Rod","E","White", new Date (1994),eMajor.NURSING,"4 Cedar Ln","3027536332","rwhite");
		Student s4= new Student("Art","E","Lange", new Date (1996),eMajor.COMPSI,"5 Cedar Ln","3027536332","alange");
		Student s5= new Student("Sharon","F","Cox", new Date (1991),eMajor.COMPSI,"6 Cedar Ln","3027536332","scox");
		Student s6= new Student("Eaton","L","Beater", new Date (1989),eMajor.BUSINESS,"7 Cedar Ln","3027536332","ebeat");
		Student s7= new Student("Clint","K","Ross", new Date (1990),eMajor.BUSINESS,"8 Cedar Ln","3027536332","cross");
		Student s8= new Student("Suzy","Sun","Summers", new Date (1988),eMajor.PHYSICS,"9 Cedar Ln","3027536332","ssum");
		Student s9= new Student("Tayne","Fayne","Train", new Date (1982),eMajor.PHYSICS,"10 Cedar Ln","3027536332","TAYNE");
		Student s10= new Student("Tim","Tiny","Tom", new Date (1944),eMajor.NURSING,"11 Cedar Ln","3027536332","tinytim");
		course.add(course1);
		course.add(course2);
		course.add(course3);
		semester.add(sem1);
		semester.add(sem2);
		section.add(sec1);
		section.add(sec2);
		section.add(sec3);
		section.add(sec4);
		section.add(sec5);
		section.add(sec6);
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		students.add(s6);
		students.add(s7);
		students.add(s8);
		students.add(s9);
		students.add(s10);
		ArrayList<Enrollment> enroll=new ArrayList<Enrollment>();
		for(int i=0; i<students.size(); i++) {
			for(int j=0; j<section.size(); j++) {
				Enrollment l=new Enrollment(section.get(j).getSectionID(),UUID.fromString(students.get(i).getLastName()));
				enroll.add(l);
			}
			
		}
		enroll.get(0).setGrade(98);
		enroll.get(1).setGrade(80);
		enroll.get(2).setGrade(78);
		enroll.get(3).setGrade(100);
		enroll.get(4).setGrade(91);
		enroll.get(5).setGrade(65);
		enroll.get(6).setGrade(42);
		enroll.get(7).setGrade(77);
		enroll.get(8).setGrade(90);
		enroll.get(9).setGrade(79);
		int sum=0;
		for (int i=0;i<enroll.size(); i++) {
			sum+=enroll.get(i).getGrade();
		}
		double average=sum/enroll.size();
		
		
	
		assertTrue(average==80);
		s1.setMajor(eMajor.BUSINESS);
	}
	
}
