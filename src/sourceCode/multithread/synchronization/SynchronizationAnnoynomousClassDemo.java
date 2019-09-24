package sourceCode.multithread.synchronization;

class Table
{
	public synchronized void printTable(int n)
	{
		synchronized (this)
		{
			for (int i = 1; i < 11; i++)
			{
				System.out.println(n * i);
				try
				{
					Thread.sleep(400);
				} catch (InterruptedException e)
				{
					System.out.println(e);
				}
			}
		}
	}
}

public class SynchronizationAnnoynomousClassDemo
{
	public static Table tableObj = new Table();

	public static void main(String[] args)
	{
		System.out.println("The Main Table !!");

		Thread t1 = new Thread()
		{
			public void run()
			{
				System.out.println("This is Run :" + this.getName());
				tableObj.printTable(5);
			}
		};
		Thread t2 = new Thread()
		{
			public void run()
			{
				System.out.println("This is Run :" + this.getName());
				tableObj.printTable(100);
			}
		};
		t1.start();
		System.out.println("-------------------------------");
		t2.start();
		System.out.println("-------------------------------");

		// Using Lambda
		Runnable r = () ->
		{
			System.out.println("this is run mehtod "
					+ Thread.currentThread().getName());
			tableObj.printTable(50);
		};

		Thread t3 = new Thread(r);

		Thread t4 = new Thread(() ->
		{
			System.out.println("this is run mehtod "
					+ Thread.currentThread().getName());
			tableObj.printTable(50);
		});

		t3.start();
		t4.start();

	}
}
