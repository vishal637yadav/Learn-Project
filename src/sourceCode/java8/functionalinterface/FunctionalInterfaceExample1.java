package sourceCode.java8.functionalinterface;

@FunctionalInterface
interface sayable
{
	void say(String msg);
}

public class FunctionalInterfaceExample1 implements sayable
{
	public void say(String a)
	{
		System.out.println("this void say(String a) method"+a);
	}
}
