package sourceCode.basics;

public class ValueSwapingDemo
{

	public static void swap(Integer i, Integer j)//xx10 , xx20
	{
		Integer temp = new Integer(i);
		System.out.println("--"+temp);
		i = j;
		j = temp;
	}

	public static void swap2(int i, int j)
	{
		int temp = i;
		i = j;
		j = temp;
	}
	public static void main(String ar[])
	{
		Integer i = new Integer(10);//xx10
		Integer j = new Integer(20);//xx20
		swap(i, j);
		System.out.println("i = " + i + ", j = " + j);
		
		int a = 33,b = 66;
		swap2(a, b);
		System.out.println("a = " + a + ", b = " + b);
		
	}
}
