package sourceCode.thread;

public class ThreadCreationImplementatingRunnableInterface implements Runnable
{
	public void run()
	{
		System.out.println("Thread is Running using Runnable Inteface.");
	}
	
	public static void main(String[] args)
	{
		//Runnable o = new ThreadCreationImplementatingRunnableInterface();
		ThreadCreationImplementatingRunnableInterface o = new ThreadCreationImplementatingRunnableInterface();
		if(o instanceof Runnable)
			System.out.println("o is instanceof Runable True");
		
		Thread t = new Thread(o);
		t.start();
	}
}
