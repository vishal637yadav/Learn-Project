package sourceCode.java5.generics;

import java.util.ArrayList;

public class GenericsInheritanceSubTypes
{

	public static void main(String[] args)
	{
		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1,"Vipin","Yadav","Dev"));
		empList.add(new Employee(2,"Priyansh","Singh","Dev"));
		empList.add(new Employee(3,"Ramesh","Kumar","Dev"));
		empList.add(new Developer(4,"Ganguali","Tiwari","Dev"));
		empList.add(new JavaDeveloper(5,"Rahul","Divakar","Dev"));
		for(Employee e :empList)
		{
			System.out.println(e);
		}
		System.out.println("--------------------------------------");
		display(empList);
		
		ArrayList<Developer> devList = new ArrayList<>();
		devList.add(new Developer(1,"Vipin","Yadav","Dev"));
		devList.add(new Developer(2,"Priyansh","Singh","Dev"));
		devList.add(new JavaDeveloper(3,"Ramesh","Kumar","Dev"));
		devList.add(new JavaDeveloper(4,"Ganguali","Tiwari","Dev"));
		//display(devList);
		
		
	}
	
	public static void display(ArrayList<Employee> empList)
	{
		for(Employee e :empList)
		{
			System.out.println(e);
		}
	}

}
