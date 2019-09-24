package sourceCode.clone.deepCopy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CloneDeepCopyDemo
{

	public static void main(String[] args) throws CloneNotSupportedException
	{
		List<String> employmentDetails = new ArrayList<String>();
		Collections.addAll(employmentDetails,"Indus","Mastercard");
		
		Employee a = new Employee(1,"Vishal",new Address("Pune","Mahrastra","India"),employmentDetails);
		
		System.out.println("a :"+a);
		System.out.println(a instanceof Object);
		Employee b = a.clone();
		//Object b = (Object)a.clone();
		
		System.out.println("Before a :"+a);
		System.out.println("Before b :"+b);
		b.empId = 43;
		b.empName = "Rakesh";
		System.out.println("-----------------------------------------------");
		System.out.println("After a :"+a);
		System.out.println("After b :"+b);
		Employee c = b.clone();
		System.out.println("Before b :"+b);
		System.out.println("Before c :"+c);
		System.out.println("-----------------------------------------------");
		c.empName="Sachin";
		System.out.println("After b :"+b);
		System.out.println("After c :"+c);
		
		System.out.println("-------Changing the Value of Address --------Objet a");
		a.empAddress.setCity("Naasik");
		System.out.println("After Changing Address :a :"+a);
		System.out.println("After Changing Address :b :"+b);
		System.out.println("After Changing Address :c :"+c);
		System.out.println("-------Changing the Value of Address --------Objet b");
		b.empAddress.setCity("Mumbai");
		System.out.println("After Changing Address :a :"+a);
		System.out.println("After Changing Address :b :"+b);
		System.out.println("After Changing Address :c :"+c);
		a.empEmploymentDetails.add("Intellect");
		System.out.println("-----------After Changing Address :a :"+a);
		System.out.println("After Changing Address :b :"+b);
		System.out.println("After Changing Address :c :"+c);
		
	}

}

class Employee implements Cloneable
{ 
	int empId;
	String empName;
	Address empAddress;
	List<String> empEmploymentDetails ;
	
	@Override
	protected Employee clone() throws CloneNotSupportedException
	{
		Employee employee = (Employee)super.clone();
		//employee.empAddress = new Address();
		employee.empAddress = employee.empAddress.clone();
		employee.empEmploymentDetails = new ArrayList<>();
		
		return  employee;
	}
	
	public Employee(){}
	
	public Employee(int empId, String empName,Address empAddress,List<String> empEmploymentDetails)
	{
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddress =empAddress;
		this.empEmploymentDetails = empEmploymentDetails;
	}

	@Override
	public String toString()
	{
		return "Employee [empId=" + empId + ", empName=" + empName+ ", empAddress=" + empAddress+ ", empEmploymentDetails=" + empEmploymentDetails + "]";
	}
	
}

class Address implements Cloneable
{
	String city;
	String state;
	String country;
	
	@Override
	protected Address clone() throws CloneNotSupportedException
	{
		return (Address) super.clone();
	}
	
	public Address(String city, String state, String country)
	{
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	@Override
	public String toString()
	{
		return "Address [city=" + city + ", state=" + state + ", country="
				+ country + "]";
	}
	
	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public String getState()
	{
		return state;
	}

	public void setState(String state)
	{
		this.state = state;
	}

	public String getCountry()
	{
		return country;
	}

	public void setCountry(String country)
	{
		this.country = country;
	}

	public Address(){}
}