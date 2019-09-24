package sourceCode.multithread.vedio;

public class HappenBeforeRelationship
{

	public static void main(String[] args)
	{
		Runnable r1 = ()-> (new FieldVisibility()).writerThread();
		Runnable r2 = ()-> (new FieldVisibility()).readThread();
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		try
		{
			Thread.sleep(2000);
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		
	}
	
}

class FieldVisibility 
{
	int a=0,b=0,c=0;
	volatile int x = 0;
	
	public void writerThread()
	{
		a=1;
		b=1;
		c=1;
		//writing a volatile
		x=1;
		System.out.println("writerThread a :"+a);
		System.out.println("writerThread b :"+b);
		System.out.println("writerThread c :"+c);
		System.out.println("writerThread x :"+x);
		
		try
		{
			Thread.sleep(4000);
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void readThread()
	{
		//reading volatile variable
		int r2 =x;
		int d1 = a;
		int d2 = b;
		int d3 = c;
		System.out.println("readThread r2:"+r2);
		System.out.println("readThread d1:"+d1);
		System.out.println("readThread d2:"+d2);
		System.out.println("readThread d3:"+d3);
		
		try
		{
			Thread.sleep(4000);
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}