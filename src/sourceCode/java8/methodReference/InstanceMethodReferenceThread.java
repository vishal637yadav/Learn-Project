package sourceCode.java8.methodReference;

public class InstanceMethodReferenceThread
{
	public void myrun()
	{
		System.out.println("This is myrun() method !!");
		for(int i= 0 ;i< 11;i++)
		{
			System.out.println(" i :"+i+" : ");
		}
	}
	
	public static void main(String[] args)
	{
		InstanceMethodReferenceThread o = new InstanceMethodReferenceThread();
		Runnable r = o ::myrun;
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(new InstanceMethodReferenceThread()::myrun);
		t1.start();
		t2.start();
		
	}

}
