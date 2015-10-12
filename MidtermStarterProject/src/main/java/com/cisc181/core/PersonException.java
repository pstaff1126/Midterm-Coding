package com.cisc181.core;

public class PersonException extends Exception {
	private Person A;
	public  PersonException(Person a) {
		super("Too Old");
	}
	public Person getA() {
		return A;
	}
	/*
	 * I overloaded PersonException to have different
	 * problems thrown to the same exception class
	 */
	public PersonException(String phone_number) {
		super("Invalid Phone Number");
	}
	

}
