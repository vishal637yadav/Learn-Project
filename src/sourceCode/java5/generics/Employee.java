package sourceCode.java5.generics;

public class Employee
{
	protected int empId;
	protected String empFstName;
	protected String empLstName;
	protected String deptId;
	protected String empSkillType;
	protected String empSkillSet;
	
	//public Employee(){}
	public Employee(int empId, String empFstName, String empLstName,
			String deptId)
	{
		super();
		this.empId = empId;
		this.empFstName = empFstName;
		this.empLstName = empLstName;
		this.deptId = deptId;
	}
	
	@Override
	public String toString()
	{
		return "Employee [empId=" + empId + ", empFstName=" + empFstName
				+ ", empLstName=" + empLstName + ", deptId=" + deptId
				+ ", empSkillType=" + empSkillType + ", empSkillSet="
				+ empSkillSet + "]";
	}
}
