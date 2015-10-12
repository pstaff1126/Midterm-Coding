package com.cisc181.core;

import java.util.Calendar;
import java.util.Date;


/*
 * comment
 */
public abstract class Person {
	
	private Date DOB;
	private String FirstName;
	private String MiddleName;
	private String LastName;
	private String address;
	private String phone_number;
	private String email_address;

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}

	public String getMiddleName() {
		return MiddleName;
	}

	public void setMiddleName(String MiddleName) {
		this.MiddleName = MiddleName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String LastName) {
		this.LastName = LastName;
	}

	public Date getDOB() throws PersonException {
		
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 1915);
		c.set(Calendar.MONTH, Calendar.JANUARY);
		c.set(Calendar.DAY_OF_MONTH, 1);
		Date date = c.getTime();
		if (DOB.after(date)) {
			return(this.DOB);
		}
		else {
			throw new PersonException(this);
		}
		
	}

	public void setDOB(Date DOB) {
		this.DOB = DOB;
	}

	public void setAddress(String newAddress) {
		address = newAddress;
	}

	public String getAddress() {
		return address;
	}

	public void setPhone(String newPhone_number) {
		phone_number = newPhone_number;
	}
	/*
	 * Instead of using one regex, I found it easier to check for a couple of different ones
	 * The first 4 if and else ifs check for various, valid phone number inputs
	 */
	public String getPhone() throws PersonException {
		
        if (this.phone_number.matches("\\d{10}")){
        	return this.phone_number;
        }
        
        else if(phone_number.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}")){
        	return this.phone_number;
        }
        
        else if(phone_number.matches("\\d{3}-\\d{3}-\\d{4}\\s(x|(ext))\\d{3,5}")) {
        	return this.phone_number;
        }
       
        else if(phone_number.matches("\\(\\d{3}\\)-\\d{3}-\\d{4}")) {
        	return this.phone_number;
        }
        
        else {
        	throw new PersonException(this.phone_number);
        }
         
    }

	public void setEmail(String newEmail) {
		email_address = newEmail;
	}

	public String getEmail() {
		return email_address;
	}

	/*
	 * Constructors No Arg Constructor
	 */
	public Person() {

	}

	/*
	 * Constructors Constructor with arguments
	 */

	public Person(String FirstName, String MiddleName, String LastName,
			Date DOB, String Address, String Phone_number, String Email) {
		this.FirstName = FirstName;
		this.MiddleName = MiddleName;
		this.LastName = LastName;
		this.DOB = DOB;
		this.address = Address;
		this.phone_number = Phone_number;
		this.email_address = Email;
		
	}
	
	public void PrintName() {
		System.out.println(this.FirstName + ' ' + this.MiddleName + ' '
				+ this.LastName);
	}

	public void PrintDOB() {
		System.out.println(this.DOB);
	}

	public int PrintAge() {
		Calendar today = Calendar.getInstance();
		Calendar birthDate = Calendar.getInstance();

		int age = 0;
		birthDate.setTime(this.DOB);
		if (birthDate.after(today)) {
			throw new IllegalArgumentException("Can't be born in the future");
		}
		age = today.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);

		// If birth date is greater than todays date (after 2 days adjustment of
		// leap year) then decrement age one year
		if ((birthDate.get(Calendar.DAY_OF_YEAR)
				- today.get(Calendar.DAY_OF_YEAR) > 3)
				|| (birthDate.get(Calendar.MONTH) > today.get(Calendar.MONTH))) {
			age--;

			// If birth date and todays date are of same month and birth day of
			// month is greater than todays day of month then decrement age
		} else if ((birthDate.get(Calendar.MONTH) == today.get(Calendar.MONTH))
				&& (birthDate.get(Calendar.DAY_OF_MONTH) > today
						.get(Calendar.DAY_OF_MONTH))) {
			age--;
		}

		System.out.println("age is " + age);

		return age;

	}
	public static void main(String args[]) {
		
	}
}