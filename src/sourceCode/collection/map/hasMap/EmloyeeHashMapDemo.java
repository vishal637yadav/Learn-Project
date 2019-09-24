package sourceCode.collection.map.hasMap;

import java.util.HashMap;
import java.util.Map;

public class EmloyeeHashMapDemo
{

	public static void main(String[] args)
	{
		Map<Employee,String> empMap = new HashMap<Employee,String>();
		empMap.put(new Employee(23, "Ramesh", "Software Devp"), "Fst");
		empMap.put(new Employee(22, "Ramesh3", "Software Devp"), "wst");
		empMap.put(new Employee(24, "Ramesh", "Software Devp"), "dst");
		empMap.put(new Employee(25, "Ramesh", "Software Devp"), "hst");
		empMap.put(new Employee(26, "Ramesh", "Software Devp"), "gst");
		
		for (Map.Entry<Employee,String> m : empMap.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		System.out.println(empMap.size());

	}

}

class Employee
{
	private int empId;
	private String empName;
	private String empDesg;
	
	public Employee(int empId, String empName, String empDesg)
	{
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDesg = empDesg;
	}
	@Override
	public int hashCode()
	{
/*		final int prime = 31;
		int result = 1;
		result = prime * result + ((empDesg == null) ? 0 : empDesg.hashCode());
		result = prime * result + empId;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		return result;
*/	
	return 16;	
	}
	@Override
	public boolean equals(Object obj)
	{
	/*	
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empDesg == null)
		{
			if (other.empDesg != null)
				return false;
		} else if (!empDesg.equals(other.empDesg))
			return false;
	//	if (empId != other.empId)
	//		return false;
		if (empName == null)
		{
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		return true;
	*/
		return true;
	}
	
	public int getEmpId()
	{
		return empId;
	}
	public void setEmpId(int empId)
	{
		this.empId = empId;
	}
	public String getEmpName()
	{
		return empName;
	}
	public void setEmpName(String empName)
	{
		this.empName = empName;
	}
	public String getEmpDesg()
	{
		return empDesg;
	}
	public void setEmpDesg(String empDesg)
	{
		this.empDesg = empDesg;
	}
}