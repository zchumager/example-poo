package net.me.dev.app;

import net.me.dev.accounts.FannieMae;
import net.me.dev.people.Employee;
import net.me.dev.places.Location;

public class Main {

	public static void main(String args[]) {
		Employee employee = new Employee("Pedro Arnoldo", "Machado Duran");
		Location location = new Location("Mexico", "Coahila", "Saltillo", "Hexaware Mexico");
		Employee manager = new Employee("Julio", "Arriaga");
		
		employee.setLocation(location);
		employee.setDepartment("Development");
		employee.setManager(manager);
		employee.assignManagement(false);
		employee.setSalary(3900.00);
		employee.setPerformance(1);
		
		System.out.println("Employee Full Name: "+employee.getFullName());
		System.out.println("Employee location: "+employee.getLocation().getFullLocation());
		System.out.println("Employe Performance: "+employee.getPerformance());
		System.out.println("Employee Salary: "+employee.getSalary());
		System.out.println("Employee Bonus: "+employee.calculateBonus());
		System.out.println("Employee Department: "+employee.getDepartment());
		System.out.println("Employee Manager "+employee.getManager().getFullName());
		
		FannieMae fannieMae = new FannieMae("Fannie Mae", "Mortage");
		
		System.out.println("The Account Name is: "+fannieMae.getName());
		System.out.println("The Account Bussines is: "+fannieMae.getAccountBusiness());
	}

}
