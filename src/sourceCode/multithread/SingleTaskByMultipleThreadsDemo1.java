package sourceCode.multithread;

public class SingleTaskByMultipleThreadsDemo1 extends Thread
{
	public SingleTaskByMultipleThreadsDemo1(String string)
	{
		super(string);
		System.out.println("Constructor Called!!");
	}

	@Override
	public void run()
	{
		for(int i = 0;i<10;i++)
		{
			System.out.println("Step "+i+"1 Task in Progress by Thread :"+this.getName());
			System.out.println("Current Thread :"+Thread.currentThread().getName());
			System.out.println("Step "+i+"2 Task in Progress by Thread :"+this.getName());
			System.out.println("Step "+i+"3 Task in Progress by Thread :"+this.getName());
			System.out.println("Step "+i+"4 Task in Progress by Thread :"+this.getName());
			
		}
	}

	public static void main(String[] args)
	{
		System.out.println("This is the main class!1");
		SingleTaskByMultipleThreadsDemo1 t1 = new SingleTaskByMultipleThreadsDemo1("Vishal");
		SingleTaskByMultipleThreadsDemo1 t2 = new SingleTaskByMultipleThreadsDemo1("Rohina");
		
		t1.start();
		t2.start();
		System.out.println("main class! Ended.");
		
	}
}
