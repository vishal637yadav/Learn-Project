package sourceCode.basics.inheritance;

public class MainClass
{

	public static void main(String[] args)
	{
		A a = new A();
		System.out.println("a.x : "+a.x);
		A b = new B();
		System.out.println("b.x : "+b.x);
		//B c = new A();
		//System.out.println("c.x : "+c.x);
		B d = new B();
		System.out.println("d.x : "+d.x);

	}

}
