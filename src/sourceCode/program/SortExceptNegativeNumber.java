package sourceCode.program;

public class SortExceptNegativeNumber
{
	public static void main(String ar[])
	{
		System.out.println("Main ()");
		int a[] = { 5, 3, -2, 8, -5, 7, 1, -4 };
		// int a[] = {3,9,-2,4,-1,17,-3,7};
		
		display(a);

		for (int i = 0; i < a.length - 1; i++)
		{
			int j = i;
			while (j <= a.length - 1)
			{
				if (a[i] > a[j] && a[j] > 0 && a[i] > 0)
				{
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
				j++;
			}
		}
		

		display(a);
	}
	
	public static void display(int a[])
	{
		for(int i = 0 ; i<a.length;i++)
		{
			System.out.print(a[i]+", ");
		}
		System.out.println();
	}

}
