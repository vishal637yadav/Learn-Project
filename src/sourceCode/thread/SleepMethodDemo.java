package sourceCode.thread;

public class SleepMethodDemo implements Runnable
{

	@Override
	public void run()
	{
		for(int i = 0 ;i<=10;i++)
		{
			try
			{
				System.out.println("Thread is Running Method is Running..!! i :"+i);
				Thread.sleep(2000);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args)
	{
		System.out.println("This is the Main Class");
		Runnable o = new SleepMethodDemo();
		Thread t1 = new Thread(o);
		Thread t2 = new Thread(o);
		t1.start();
		t2.start();
	}
}
