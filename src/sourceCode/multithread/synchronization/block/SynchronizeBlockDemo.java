package sourceCode.multithread.synchronization.block;

class Table
{
	public void printTable(int n)
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

public class SynchronizeBlockDemo
{
	public static Table tabObj = new Table();
	public static void main(String[] args)
	{
		Runnable r = ()->{ tabObj.printTable(13);};
		Thread t1 = new Thread(r);
		t1.start();
	
	}

}
