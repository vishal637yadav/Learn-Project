package sourceCode.java8.methodReference;

@FunctionalInterface
interface SayableInterface
{
	void say();
	int hashCode();
	public String toString();
	boolean equals(Object obj);
}

public class InstanceMethodReference
{
	public void saySomething()
	{
		System.out.println("This is the SaySomething Method Called!!");
	}
	
	public static void main(String[] args)
	{
		System.out.println("This is Main Method()...");
		InstanceMethodReference o = new InstanceMethodReference();
		
		SayableInterface s = o :: saySomething;
		s.say();
		
	}

}
