package sourceCode.basics;

abstract class MyAbstractClass
{
	public void doSomething()
	{
		System.out.println("doSomething called no-arguments");
	}

	public abstract void doSomething(int a);
	
	public abstract void doSomething(float a);
	
	public abstract void doSomething(long a);
	
	public abstract void doSomething(String a);

	//public abstract void doSomething(Integer a);

	public abstract void doSomething(Object a);

}

public class AbstractClassAmbigoursMethodCall extends MyAbstractClass
{
	@Override
	public void doSomething(int a)
	{
		System.out.println("doSomething called int-arguments");
	}

	@Override
	public void doSomething(float a)
	{
		System.out.println("doSomething called float-arguments");
	}
	
	@Override
	public void doSomething(long a)
	{
		System.out.println("doSomething called long-arguments");
	}
	
	public void doSomething(double a)
	{
		System.out.println("doSomething called double-arguments");
	}
	/*
	//@Override
	public void doSomething(Integer a)
	{
		System.out.println("doSomething called Integer-arguments");
	}
	*/
	@Override
	public void doSomething(String a)
	{
		System.out.println("doSomething called String-arguments");

	}
	
	//@Override
	public void doSomething(Object a)
	{
		System.out.println("doSomething called Object-arguments");
	}
	
	
	public static void main(String[] args)
	{
		try
		{
			AbstractClassAmbigoursMethodCall a = new AbstractClassAmbigoursMethodCall();
			a.doSomething();
			a.doSomething(23);
			a.doSomething("Vishal");
			a.doSomething("");
			a.doSomething(new Integer("32"));
			System.out.println("---------------");
			Integer b = null;
			a.doSomething(b);
			a.doSomething(3);
			a.doSomething(6l);
			a.doSomething(3.4);
			a.doSomething(null);
			
		} catch (Exception e)
		{
			System.out.println("Exception : " + e);
		}

	}

}
