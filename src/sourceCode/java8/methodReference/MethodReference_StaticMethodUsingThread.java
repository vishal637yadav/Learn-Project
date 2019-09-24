package sourceCode.java8.methodReference;

public class MethodReference_StaticMethodUsingThread
{
	public static void threadStatus1()
	{
		System.out.println("Thread is Running (threadStatus1).");
	}
	public static void threadStatus2()
	{
		System.out.println("Thread is Running (threadStatus2).");
	}
	
	public static void main(String[] args)
	{
		System.out.println("------------Using Method Reference!!-------------");
		
		//Using Method Reference 
		Thread t1 = new Thread(MethodReference_StaticMethodUsingThread:: threadStatus1,"Thread 1");
		Thread t2 = new Thread(MethodReference_StaticMethodUsingThread:: threadStatus2);
		t1.start();
		System.out.println("t1.getName() :"+t1.getName());
		t2.start();
		System.out.println("t2.getName() :"+t2.getName());
		
		System.out.println("------------Using Lambda Expression!!-------------");
		Runnable r1 =()-> System.out.println("R1 this is using R1");
		
		
		Thread t3 = new Thread(r1); 
		System.out.println("t3.getName() :"+t3.getName());
		t3.start();
		
		r1 =()-> System.out.println("R5 this is using R6");

		Thread t4 = new Thread(r1);
		System.out.println("t4.getName() :"+t4.getName());
		
		t4.start();
		
	}

}
