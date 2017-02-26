package net.me.dev.people;

public abstract class Person {
	protected String firstName = "";
	protected String lastName = "";
	
	public Person() {}
	
	public Person(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFullName(){
		return this.firstName+" "+this.lastName;
	}
}
