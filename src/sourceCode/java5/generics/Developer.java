package sourceCode.java5.generics;

public class Developer extends Employee
{
	public Developer(int empId, String empFstName, String empLstName,
			String deptId)
	{
		super(empId,empFstName,empLstName,deptId);
		this.empSkillType = "TechnicalSkills";
	}

	@Override
	public String toString()
	{
		return "Developer [empId=" + empId + ", empFstName=" + empFstName
				+ ", empLstName=" + empLstName + ", deptId=" + deptId
				+ ", empSkillType=" + empSkillType + ", empSkillSet="
				+ empSkillSet + "]";
	}
}
