package sourceCode.multithread.synchronization;
/*
class Table
{
	synchronized void printTable(int n)
	{// method not synchronized
		for (int i = 1; i <= 5; i++)
		{
			System.out.println("Thread Name :"+Thread.currentThread().getName()+" :"+n * i);
			try
			{
				Thread.sleep(400);
			} catch (Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
*/
class MyThread1 extends Thread
{
	Table t;

	MyThread1(Table t,String threadName)
	{
		super(threadName);
		this.t = t;
	}

	public void run()
	{
		t.printTable(5);
	}
}

class MyThread2 extends Thread
{
	Table t;

	MyThread2(Table t,String threadName)
	{
		super(threadName);
		this.t = t;
	}

	public void run()
	{
		t.printTable(100);
	}
}

public class ProblemWithoutSynchronization
{

	public static void main(String[] args)
	{
		System.out.println("The Main Class!!");
		
		Table tabObj = new Table();
		MyThread1 t1 = new MyThread1(tabObj,"Vishal");
		MyThread2 t2 = new MyThread2(tabObj,"Priyan");
		t1.start();
		t2.start();
	}
}
