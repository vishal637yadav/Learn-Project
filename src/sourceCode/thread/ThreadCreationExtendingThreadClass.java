package sourceCode.thread;

public class ThreadCreationExtendingThreadClass extends Thread
{
	public void run()
	{
		System.out.println("Thread is Running...extending Thread Class!!");
	}
	
	public static void main(String[] args)
	{
		ThreadCreationExtendingThreadClass t = new ThreadCreationExtendingThreadClass();
		t.start();
	}
}
