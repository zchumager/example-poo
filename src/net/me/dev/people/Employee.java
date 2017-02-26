package net.me.dev.people;

import net.me.dev.places.Location;

public class Employee extends Person {
	
	private Location location = null;
	private String department = "";
	private Employee manager = null;
	private boolean isManager = false;
	private double salary = 0.0;
	private int performance = 0;
	private double bonus = 0.0;
	
	public Employee() {
		super();
	}
	
	public Employee(String firstName, String lastName) {
		super(firstName, lastName);
	}
	
	public void setLocation(Location location) {
		this.location = location;
	}
	
	public Location getLocation() {
		return location;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public Employee getManager() {
		return manager;
	}

	public void setManager(Employee manager) {
		this.manager = manager;
	}

	public void assignManagement(boolean management){
		this.isManager = management;
	}
	public boolean isManager() {
		return this.isManager;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}

	public void setPerformance(int performance) {
		this.performance = performance;
	}

	public int getPerformance() {
		return performance;
	}

	public double calculateBonus() {
		if(this.performance == 1) {
			this.bonus = this.salary;
		} else if(this.performance > 1 && this.performance <= 5) {
			this.bonus = (this.salary / 2);
		} else if(this.performance > 5 && this.performance <= 7) {
			this.bonus = (this.salary * 0.1);
		}
		
		return this.bonus;
	}
}
