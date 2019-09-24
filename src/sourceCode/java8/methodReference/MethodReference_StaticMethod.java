package sourceCode.java8.methodReference;


interface Sayable
{  
	public void say();  
}

public class MethodReference_StaticMethod
{

	public static void saySomething()
	{
		System.out.println("Hello, this is the static method !");
	}
	
	public static void main(String[] args)
	{
		System.out.println("Starting of Main Method");
		//Reffering static Method
		Sayable sayable = MethodReference_StaticMethod ::saySomething;
		//Calling the interface
		sayable.say();
		
		Sayable s = ()-> System.out.println("This is Lambda Expression");
		s.say();
	}

}
