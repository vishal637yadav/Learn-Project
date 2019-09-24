package sourceCode.basics.compareObj;

import java.util.*;  

class Student
{
	Number rollNo;
	String name;
	int age;
	
	public Student(int rollNo,String name,int age)
	{
		this.rollNo	=	rollNo;
		this.name 	= 	name;
		this.age 	= 	age;
	}

	public Number getRollNo()
	{
		return rollNo;
	}

	public void setRollNo(Number rollNo)
	{
		this.rollNo = rollNo;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}
	
}

class StudentAgeComparator implements Comparator<Student>
{  
	public int compare(Student s1,Student s2)
	{  
		if(s1.age==s2.age)  
			return 0;  
		else if(s1.age>s2.age)  
			return 1;  
		else  
			return -1;
	}
}

class StudentNameCompartor implements Comparator<Student>
{
	@Override
	public int compare(Student s1, Student s2) {
		return s1.name.compareTo(s2.name);
	}
	
}
public class ComparatorDemo {

	public static void main(String[] args) {
			
		ArrayList<Student> studuentArray = new ArrayList<>();
		studuentArray.add(new Student(52, "Aabr", 30));
		studuentArray.add(new Student(34, "Anre", 12));
		studuentArray.add(new Student(62, "Anat", 12));
		studuentArray.add(new Student(87, "Abar", 67));
		studuentArray.add(new Student(30, "Abab", 39));
		
		System.out.println("-----Before Sorting ------------------");
		displayStudent(studuentArray);  
		
		System.out.println("Sorting by Name :--");
		Collections.sort(studuentArray, new StudentNameCompartor());
		
		System.out.println("-----After Sorting with StudentName------------------");
		displayStudent(studuentArray);  
		
		System.out.println("Sorting by Age :--");
		Collections.sort(studuentArray, new StudentAgeComparator());
		
		System.out.println("-----After Sorting with StudentAgeComparator---------");
		displayStudent(studuentArray);  
	}
	
	public static void displayStudent(ArrayList<Student> studuentArray)
	{
		for(Student st: studuentArray)
		{  
			System.out.println("rollNo : "+st.rollNo+",name : "+st.name+", age : "+st.age);  
		}
	}
}


