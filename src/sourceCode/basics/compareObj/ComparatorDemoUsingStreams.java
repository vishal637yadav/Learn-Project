package sourceCode.basics.compareObj;

import java.util.ArrayList;

public class ComparatorDemoUsingStreams
{

	public static void main(String[] args)
	{
		ArrayList<Student> studuentArray = new ArrayList<>();
		studuentArray.add(new Student(52, "Aabr", 30));
		studuentArray.add(new Student(34, "Anre", 12));
		studuentArray.add(new Student(62, "Anat", 12));
		studuentArray.add(new Student(87, "Abar", 67));
		studuentArray.add(new Student(30, "Abab", 39));
		
		System.out.println("-----Before Sorting ------------------");
		studuentArray.forEach(st ->System.out.println("rollNo : "+st.rollNo+",name : "+st.name+", age : "+st.age) );
		
		studuentArray.sort((Student s1,Student s2)->s1.getAge()-s2.getAge());
		System.out.println("-----After Sorting Age------------------");
		//ComparatorDemo.displayStudent(studuentArray);
		studuentArray.forEach(st ->System.out.println("rollNo : "+st.rollNo+",name : "+st.name+", age : "+st.age) );
		
		System.out.println("-----After Sorting Name------------------");
		studuentArray.sort((Student s1,Student s2)->s1.name.compareTo(s2.getName()));
		studuentArray.forEach(st ->System.out.println("rollNo : "+st.rollNo+",name : "+st.name+", age : "+st.age) );
		
		
	}

}
