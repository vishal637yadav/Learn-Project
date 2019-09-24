package sourceCode.java5.generics;

public class BoxingDemo
{
	public void displayBoxData(Box<Integer>[] boxing)
	{
		for(Box<Integer> a : boxing)
		{
			System.out.println(a);
		}
	}
	
	public void displayBoxData(Box<Integer[]> boxing)
	{
		Integer[] box = boxing.getT();
		for(Integer i :box)
		{
			System.out.println(i);
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println("Thread ----:--->>"+Thread.currentThread().getName());
	}

}
