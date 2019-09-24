package sourceCode.multithread;

public class SingleTaskMultipleThreadRunnableDemo2 implements Runnable
{
	@Override
	public void run()
	{
		for(int i = 0 ;i<10;i++)
		{
			System.out.println("Task One :"+Thread.currentThread().getName()+" : i "+i);
		}
		
	}

	public static void main(String[] args)
	{
		
		Runnable r = new SingleTaskMultipleThreadRunnableDemo2();
		Thread t1 = new Thread(r,"Vishal");
		Thread t2 = new Thread(r,"Rohani");
		t1.start();
		t2.start();
	}
}
