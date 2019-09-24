package sourceCode.basics;

public class Covariant_Return_Type_Demo
{
	static
	{
		System.out.println("Static Block Covariant_Return_Type_Demo");
	}
	
	public static void main(String[] args)
	{
		System.out.println("This is the main method()");
		Parent p = new Parent();
		p.getObject();
		p.parentMethod();
		Parent c = new Child();
		//Parent c = new GrandSon(43);
		//Parent c = new Parent();
		//c.getObject();
		
		
		if( c instanceof GrandSon)
		{
			System.out.println("c instanceof Child : True");
		((Child)c).childMethod();
		}else
		{
			System.out.println("c instanceof Child : False");
		}
		
		System.out.println("int speedLimt ="+((Child)c).speedLimt);
		
		System.out.println("a.speedLimt : "+p.speedLimt);
		//System.out.println("b.speedLimt : "+b.speedLimt);
		System.out.println("c.speedLimt : "+c.speedLimt);
		
	}

}


class Parent
{
	int speedLimt = 40;
	static
	{
		System.out.println("Static Block Parent");
	}
	{
		System.out.println("Initialisation Block Parent");
	}
	public Parent()
	{
		System.out.println("Parent Default Constructor");
	}
	
	public Parent getObject()
	{
		System.out.println("Parent getObject() is Called");
		return this;
	}
	
	public void parentMethod()
	{
		System.out.println("parentMethod() Called.");
	}
}

class Child extends Parent
{
	int speedLimt = 50;
	static
	{
		System.out.println("Static Block Child");
	}
	{
		System.out.println("Initialisation Block Child");
	}
	public Child()
	{
		System.out.println("Child Default Constructor");
	}
	
	public Child getObject()
	{
		System.out.println("Child getObject() is Called");
		return this;
	}
	
	public void childMethod()
	{
		System.out.println("childMethod() Called.");
	}
}

class GrandSon extends Child
{
	int speedLimt = 60;
	static
	{
		System.out.println("Static Block GrandSon");
	}
	{
		System.out.println("Initialisation Block GrandSon");
	}
	
	public GrandSon()
	{
		System.out.println("GrandSon Default Constructor");
	}
	public GrandSon(int x)
	{
		System.out.println("GrandSon Parameteric Constructor x:"+x);
	}
	
	public void grandSonMethod()
	{
		System.out.println("grandSonMethod() Called.");
	}
	
}