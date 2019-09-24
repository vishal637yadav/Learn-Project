package sourceCode.basics.java_ref_type;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class JavaReferencesTypes
{

	public static void main(String[] args)
	{
		//strongReference();
		//weakReference();
		//softReference();
		phantomReference();
	}

	public static void strongReference()
	{
		System.out.println("Strong Reference");
		//Strong Refernece
		Employee emp = new Employee(12, "Vishal");
		System.out.println(emp);
		
		emp = null;//after this line now emp Object is Eligible for GC
		
		System.out.println(emp);
	}
	
	public static void weakReference()
	{
		System.out.println("Strong Reference");
		//Strong Refernece
		Employee emp = new Employee(12, "Vishal");
		System.out.println(emp);
		
		WeakReference<Employee> weakRef = new WeakReference<Employee>(emp);
		System.out.println("weakRef.get() : "+weakRef.get());
		
		emp = null;//after this line now emp Object is Eligible for GC
		System.gc();
		System.out.println(emp);
		System.out.println("weakRef.get() :"+weakRef.get());
		
	}
	
	public static void softReference()
	{
		System.out.println("Soft Reference");
		//Soft Refernece
		Employee emp = new Employee(12, "Vishal");
		System.out.println(emp);
		
		SoftReference<Employee> softRef = new SoftReference<Employee>(emp);
		
		System.out.println("weakRef.get() : "+softRef.get());
		
		emp = null;//after this line now emp Object is Eligible for GC
		System.gc();
		System.out.println(emp);
		System.out.println("weakRef.get() :"+softRef.get());
		
	}
	
	public static void phantomReference()
	{
		System.out.println("Soft Reference");
		//Soft Refernece
		Employee emp = new Employee(12, "Vishal");
		System.out.println(emp);
		
		ReferenceQueue<Employee> refQueue = new ReferenceQueue<Employee>();
		PhantomReference<Employee> phantomRef = new PhantomReference<Employee>(emp, refQueue);
		
		System.out.println("weakRef.get() : "+phantomRef.get());
		
		emp = null;//after this line now emp Object is Eligible for GC
		System.gc();
		System.out.println(emp);
		System.out.println("phantomRef.get() :"+phantomRef.get());
		
	}
}


class Employee
{
	int empId;
	String empName;
	
	public Employee(int empId, String empName)
	{
		super();
		this.empId = empId;
		this.empName = empName;
	}

	@Override
	public String toString()
	{
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	
}