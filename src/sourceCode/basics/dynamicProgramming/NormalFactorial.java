package sourceCode.basics.dynamicProgramming;

import java.lang.reflect.Array;

public class NormalFactorial
{

	public static void main(String[] args)
	{
		NormalFactorial n = new NormalFactorial();
		System.out.println("Factorial of 5 = " + n.factorial(5, " "));

	}

	int[] factorialArray;

	public void setFactorialArray(int n)
	{
		this.factorialArray = (int[]) Array.newInstance(int.class, n);
		for (int a : factorialArray)
		{
			System.out.println(a);
		}
	}
	
	public String displayArrayContent()
	{
		String str = "[" ;
		for (int a : this.factorialArray)
		{
			str = str+" "+a;
			//System.out.print(a);
		}
		return str+" ]" ;
	}

	public int factorial(int n, String sb)
	{
		sb = " **** " + sb;
		int result;
		
		if (this.factorialArray == null)
		{
			setFactorialArray(n);
		}
		
		if (this.factorialArray[n - 1] != 0)
		{
			result = this.factorialArray[n - 1];
			
		} else
		{
			System.out.println(sb + "n :" + n);
			if (n == 1)
			{
				result = 1;
			} else
			{
				result = n * factorial(n - 1, sb);
			}
		}
		System.out.println(sb + "r :" + result);
		factorialArray[n - 1] = result;
		System.out.println(sb + "A :" + this.displayArrayContent());
		
		return result;
	}

}
