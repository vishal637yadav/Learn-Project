package sourceCode.java5.generics;

public class JavaDeveloper extends Developer
{
	public JavaDeveloper(int empId, String empFstName, String empLstName,
			String deptId)
	{
		super(empId,empFstName,empLstName,deptId);
		this.empSkillSet = "Core Java,Spring,Hibernate";
	}
}
