package sourceCode.basics.dynamicProgramming;

import java.lang.reflect.Array;

public class NormalFabinoci
{

	public static void main(String[] args)
	{
		NormalFabinoci f = new NormalFabinoci();
		System.out.println("f.fabinoci(5) " + f.fabinoci(15, " "));

	}

	NormalFabinoci()
	{
	}

	int fanbinociArray[];

	public void initialiseFabinociArray(int n)
	{
		this.fanbinociArray = (int[]) Array.newInstance(int.class, n);
	}

	public String displayFabinociArray()
	{
		String s = "";
		for (int a : this.fanbinociArray)
		{
			s = s + ", " + a;
		}
		s = s.substring(s.indexOf(",") + 1);
		return "[ " + s.trim() + " ]";
	}

	public int fabinoci(int n, String s)
	{
		s = " **** " + s;
		System.out.println(s + "n :" + n);
		int result = 0;

		if (this.fanbinociArray == null)
		{
			initialiseFabinociArray(n);
			displayFabinociArray();
		}

		if (this.fanbinociArray[n - 1] == 0)
		{
			if (n == 1 || n == 2)
			{
				result = 1;
				fanbinociArray[n - 1] = result;
			} else
			{
				result = fabinoci(n - 1, s) + fabinoci(n - 2, s);
				fanbinociArray[n - 1] = result;
			}
		} else
		{
			result = this.fanbinociArray[n - 1];
		}
		System.out.println(s + "r :" + result);
		System.out.println(s + "a :" + displayFabinociArray());

		return result;
	}
}
