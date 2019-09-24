package sourceCode.java8.staticMethod;

abstract class AbstractClass
{
	public AbstractClass()
	{
		System.out.println("Default constructor AbstractClass!!");
	}
	
	public abstract int add(int a,int b);
	
	public int sub(int a,int b)
	{
		System.out.println("i :"+a+", b :"+b);
		return a-b;
	}
	
	static int multiply(int a,int b)
	{
		return a*b;
	}
}

public class AbstractTest  
{
	public static void main(String[] args)
	{
		AbstractClass a = new AbstractClass()
		{
			public int add(int a,int b)
			{
				System.out.print("i("+a+") + b ("+b+") = ");
				return a+b;
			}
		};
		
		System.out.println(a.add(32, 4));
		
		System.out.println(a.sub(32, 4));
		System.out.println(a.multiply(32, 4));
		System.out.println(AbstractClass.multiply(32, 4));
		
		
	}
}
