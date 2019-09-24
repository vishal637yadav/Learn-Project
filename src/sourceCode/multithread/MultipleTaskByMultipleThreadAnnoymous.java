package sourceCode.multithread;

public class MultipleTaskByMultipleThreadAnnoymous
{

	public static void main(String[] args)
	{
		Thread t1 = new Thread("Vishal")
		{
			public void run()
			{
				System.out.println("Task One is Running!!"+this.getName());
				this.setName("Sonia");
				System.out.println("Task One is Running!!"+this.getName());
			}
			
		};
		t1.start();
		
		Runnable r = new Runnable()
		{
			public void run()
			{
				System.out.println("Task 2 Runnabing :"+Thread.currentThread().getName());
			}
		};
		Thread t2 = new Thread(r,"Rohani");
		Thread t3 = new Thread(r,"Rakesh");
		Thread t4 = new Thread(r,"Roheja");
		
		t2.start();
		t3.start();
		t4.start();
	
	}

}
