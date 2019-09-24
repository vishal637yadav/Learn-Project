package sourceCode.designPattern.prototype;

public class PrototypeDemo
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("-----------This is Main Method----------------");
		EmployeeRecords er = new EmployeeRecords(34, "Visha", 3000);
		EmployeeRecords er2 = (EmployeeRecords)er.getClone();
		
		System.out.println(er);
		er.show();
		System.out.println(er2);
		er2.show();
		System.out.println("-----------This is Main Method----------------");
		
	}
}

interface Prototype
{
	public Prototype getClone();
}

class EmployeeRecords implements Prototype
{
	int empId;
	String name;
	int salary;
	
	public EmployeeRecords()
	{
		this.empId = 23;
		this.name = "Ramesh";
	}
	
	public EmployeeRecords(int empId, String name,int salary)
	{
		this();
		this.salary = 500500;
	}
	
	@Override
	public Prototype getClone()
	{
		//Set the current State of the Object
		return new EmployeeRecords(empId,name,salary);
	}
	public void show()
	{
		System.out.println("[ "+this.empId+", "+this.name+", "+salary+" ]");
	}
}