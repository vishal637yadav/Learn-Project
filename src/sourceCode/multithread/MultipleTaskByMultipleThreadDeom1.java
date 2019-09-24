package sourceCode.multithread;

class Simple1 extends Thread
{
	public void run()
	{
		System.out.println("Simple1 running Task 1!!");
	}
}

class Simple2 extends Thread
{
	public void run()
	{
		System.out.println("Simple2 running Task 2!!");
	}
}

public class MultipleTaskByMultipleThreadDeom1
{

	public static void main(String[] args)
	{
		Thread t1 = new Simple1();
		Thread t2 = new Simple2();
		t1.start();
		t2.start();
	}

}
