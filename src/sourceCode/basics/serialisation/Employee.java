package sourceCode.basics.serialisation;

import java.io.Serializable;

public class Employee implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static int empIdSeq;
	
	private final int empId;
	private String empName;
	private int empAge;
	private transient int empAccNo;
	
	public Employee(String empName, int empAge, int empAccNo)
	{
		super();
		this.empId = ++empIdSeq;
		this.empName = empName;
		this.empAge = empAge;
		this.empAccNo = empAccNo;
	}
	


}