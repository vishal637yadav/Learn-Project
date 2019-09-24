package sourceCode.basics;

public class JavaCallbyValueDemo1
{

	public static void main(String[] args)
	{
		//Creating a reference Variable
		Test t = new Test(5);
		System.out.println("In Main Method t = "+t);
		System.out.println("Before t.x = "+t.x);
		//Java is always call by Value.
		//Note that copy of this t = reference is passed.
		change(t);
		System.out.println("After t.x = "+t.x);
		
	}
	
	public static void change(Test t)
	{
		// Although t is having the copy of Reference 
		// but it is still reffering to the Original Object.
		// so if we change the state of the object then will be,
		// reflecting in the main object.
		System.out.println("1 change Method t = "+t);
		t.x = 555;
		System.out.println("1.1 change Method t.x = "+t.x);
		t = new Test();
		System.out.println("2 change Method t = "+t);
		t.x = 34;
		System.out.println("3 change Method t = "+t);
		
	}

}


class Test
{
	public int x;
	Test(){x=0;}
	Test(int x){ this.x = x; }
}