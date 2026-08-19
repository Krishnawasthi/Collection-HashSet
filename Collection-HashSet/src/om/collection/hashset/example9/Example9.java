package om.collection.hashset.example9;

import java.util.HashSet;

class EmployeeDatabse
{
	String empName;
	double salary;
	
	
	public EmployeeDatabse(String empName, double salary) {
		super();
		this.empName = empName;
		this.salary = salary;
	}
	
	public int hashCode() 
	{
		
		return 1002;
		
	}
	
	public boolean equals(Object obj)
	{
		EmployeeDatabse empData = (EmployeeDatabse) obj;
		return this.empName.equals(empData.empName) && this.salary == salary;
	}
	
}



public class Example9 {

	public static void main(String[] args) {
		
	
		HashSet<EmployeeDatabse> database = new HashSet<EmployeeDatabse>();
		
		EmployeeDatabse employee1 = new EmployeeDatabse("ranveer singh", 23203.00);
		EmployeeDatabse employee2 = new EmployeeDatabse("ranveer singh", 23203.00);
		EmployeeDatabse employee3 = new EmployeeDatabse("ranveer singh", 23203.00);
		EmployeeDatabse employee4 = new EmployeeDatabse("ranveer singh", 23203.00);
		
		database.add(employee1);
		database.add(employee2);
		database.add(employee3);
		database.add(employee4);
		
		System.out.println(database);
		
	}

}
