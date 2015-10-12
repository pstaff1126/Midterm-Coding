/**
 * 
 */
package com.cisc181.core;

import static org.junit.Assert.*;
import java.util.Date;
import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import com.cisc181.eNums.eTitle;

/**
 * @author Dad
 *
 */
public class Employee_Test {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
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
	public void test() throws PersonException {
		double sum=0;
		ArrayList<Staff> staff=new ArrayList<Staff>();
		Staff a= new Staff("Pat","James","Stafford",new Date (1993),"2 Cedar Ln","1023456789","myemail1","1-2 PM",5,100000000,new Date(2014),eTitle.SIR);
		// invalid age
		Staff b= new Staff("Mike","Jon","Staple",new Date(1842),"2 Cedar Ln","1023456781","myemail2","1-2 PM",4,200000000,new Date(2001),eTitle.DOCTOR);
		Staff c= new Staff("Patricia","Jill","Stanford",new Date(1981),"2 Cedar Ln","1023456782","myemail3","1-2 PM",3,300000000,new Date(2002),eTitle.PROFESSOR);
		Staff d= new Staff("Mike","Jon","Staple",new Date(1916),"2 Cedar Ln","1023456783","myemail4","1-2 PM",2,400000000,new Date(2012),eTitle.PROFESSOR);
		//invalid phone number
		Staff e= new Staff("Aemon","Brian","Donald",new Date(1965),"2 Cedar Ln","10234567","myemail5","1-2 PM",1,500000000,new Date(1998),eTitle.PROFESSOR);
		staff.add(a);
		staff.add(b);
		staff.add(c);
		staff.add(d);
		staff.add(e);
		for (int i=0; i<staff.size(); i++) {
			sum+=staff.get(i).getSalary();
		}
		long average=(long) (sum/staff.size());
		assertEquals(average,300000000);
		}
	
	@Test
	public void TestPersonException() {
		Throwable e=null;
		Staff b= new Staff("Mike","Jon","Staple",new Date(1842),"2 Cedar Ln","1023456781","myemail2","1-2 PM",4,200000000,new Date(2001),eTitle.DOCTOR);
		try {
			b.getDOB();
		} catch (PersonException ex) {
			e=ex;
		}
		assertTrue(e instanceof PersonException);
		
	}
	@Test
	public void TestPhoneException() {
		Staff e= new Staff("Aemon","Brian","Donald",new Date(1965),"2 Cedar Ln","10234567","myemail5","1-2 PM",1,500000000,new Date(1998),eTitle.PROFESSOR);
		Throwable a=null;
		try {
			e.getPhone();
		} catch(PersonException ex) {
			a=ex;
		}
		assertTrue(a instanceof PersonException);
	}
}
