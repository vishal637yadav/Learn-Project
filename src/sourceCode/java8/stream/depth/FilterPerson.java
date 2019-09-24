package sourceCode.java8.stream.depth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FilterPerson
{
	
	public static void main(String[] args)
	{
		List<Person> personList = new ArrayList<>();
		personList.add(new Person(12,"Vishal",31));
		Collections.addAll(personList, 
				new Person(13, "Rahul", 13),
				new Person(14, "Rohit", 43),
				new Person(15, "Vijay", 5),
				new Person(16, "Karan", 12),
				new Person(17, "Rakesh", 67),
				new Person(18, "Gaurav", 12),
				new Person(19, "Sachin", 24)
				);
			
		System.out.println(getPersonNameStartWith(personList,"Ra"));
		System.out.println(getPersonAgeLessThan(personList,20));
		
		System.out.println("Sorted List"+personList.stream().sorted().collect(Collectors.toList()));
		
		
	}
	
	public static List<String> getPersonNamesList(List<Person> personList,String filter)
	{
		List<String> personNameList = new ArrayList<>();
		for(Person p : personList)
		{
			if(p.getName().startsWith(filter))
			{
				personNameList.add(p.getName());//performed by .map function.
			}
		}
		return personNameList;
	}
	
	public static List<String> getPersonNameStartWith(List<Person> personList,String filter)
	{
		return personList.stream().filter(p-> p.getName().startsWith(filter)).map(p->p.getName()).collect(Collectors.toList());
	}

	public static List<String> getPersonAgeLessThan(List<Person> personList,int filter)
	{
		return personList.stream().filter(p->p.getAge()<filter).map(e->e.getName()).collect(Collectors.toList());
	}
}
