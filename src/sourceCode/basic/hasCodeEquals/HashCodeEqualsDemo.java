package sourceCode.basic.hasCodeEquals;

import java.util.HashMap;
import java.util.Map;

public class HashCodeEqualsDemo {

	public static void main(String[] args) {
	
		Employee  emp1 = new Employee(10,"Vishal",new Address(2, "Pune"));
		Employee  emp2 = new Employee(12,"Vishal",new Address(2, "Pune"));
		Employee  emp3 = new Employee(13,"Vishal",new Address(2, "Pune"));
		
		System.out.println("----------------------------");
		System.out.println("emp1 : "+emp1);
		System.out.println("emp2 : "+emp2);
		System.out.println("emp3 : "+emp3);
		System.out.println("----------------------------");
		
		Map<Employee, Address> empMap = new HashMap<Employee, Address>();
		System.out.println("----------------------------");
		System.out.println("empMap :"+empMap);
				
		empMap.put(emp1, new Address(2, "Pune"));
		empMap.put(emp3, new Address(2, "Pune"));
		empMap.put(emp2, new Address(2, "Pune"));
		//empMap.put(null, "fabc");
		
		System.out.println("empMap Size : "+empMap.size());
		System.out.println("empMap.get(emp2) : "+empMap.get(emp2));
		System.out.println("empMap.get(emp3) : "+empMap.get(emp3));
		
		System.out.println("empMap  : "+empMap);
	}
}

class Employee
{
	String empName;
	int empId;
	Address address;
	
	public Employee() {
	}
	public Employee(int empId,String empName,Address address)
	{
		this.empId = empId;
		this.empName  = empName ;
		this.address = address;
	}
	@Override
	public int hashCode() {
		/*
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		return result;
		*/
		return 4;
	}
	@Override
	public boolean equals(Object obj) {
		/*
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empId != other.empId)
			return false;
		
		return true;
		*/
		return true;
	}
}


class Address
{
	int cityId;
	String cityName;
	
	public Address(int cityId,String cityName)
	{
		this.cityId = cityId;
		this.cityName = cityName ;
	}
	
	@Override
	public int hashCode() {
		return 16;
	}
	
	@Override
	public boolean equals(Object obj) {
		return true;
	}
}

