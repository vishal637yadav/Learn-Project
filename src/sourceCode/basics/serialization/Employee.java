package sourceCode.basics.serialization;

import java.io.Serializable;

public class Employee implements Serializable
{

	//private static final long serialVersionUID = 5216252452408793989L;

	private int empId;
	private String empName;
	private String empEmailId;
	private String password;
	private double salary;
	
	public Employee(int empId, String empName, String empEmailId,
			String password)
	{
		super();
		this.empId = empId;
		this.empName = empName;
		this.empEmailId = empEmailId;
		this.password = password;
	}
	
	@Override
	public String toString()
	{
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", empEmailId=" + empEmailId + ", password=" + password + "]";
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
	public String getEmpEmailId()
	{
		return empEmailId;
	}
	public void setEmpEmailId(String empEmailId)
	{
		this.empEmailId = empEmailId;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	
}
