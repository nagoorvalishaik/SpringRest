package com.student.Exceptions;

public class InvalidAgeException extends Exception{
	
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public InvalidAgeException()
	{
		super();
	}

	@Override
	public String toString() {
		return "Minimum age should be above 16,"+age;
	}
	
	
	
}
