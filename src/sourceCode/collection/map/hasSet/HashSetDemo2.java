package sourceCode.collection.map.hasSet;

import java.util.HashSet;

public class HashSetDemo2
{

	public static void main(String[] args)
	{
		Employee e1 = new Employee(12, "Vishal");
		Employee e2 = new Employee(12, "Vishal");
		//Employee e2 = e1;
		//System.out.println("e1.hashCode() :"+e1.hashCode());
		//System.out.println("e2.hashCode() :"+e2.hashCode());
		//System.out.println("e1.equals(e2) :"+e1.equals(e2));
		
		HashSet<Employee> hs = new HashSet<Employee>();
		hs.add(e1);
		hs.add(e2);
		System.out.println("hs.size(): "+hs.size());
		

	}

}
