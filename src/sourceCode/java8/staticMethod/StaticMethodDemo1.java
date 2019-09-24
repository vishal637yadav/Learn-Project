package sourceCode.java8.staticMethod;

interface Sayable
{
	default void defaultMethod()
	{
		System.out.println("defaultMethod called!!");
	}
	void apstractMethod(int a);
	
	static void staticMethod()
	{
		System.out.println("staticMethod()");
	}
	
}

public class StaticMethodDemo1 
{

	public static void main(String[] args)
	{
		//Using Lambda providing body of abstract method.
		Sayable s = z -> System.out.println("The value of a :"+z);
		s.apstractMethod(34);
		s.defaultMethod();
		Sayable.staticMethod();
		
	}

}
