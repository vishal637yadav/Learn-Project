package sourceCode.algo.graph;

import java.lang.reflect.Array;

public class PrintMatrixInSpiral
{

	public static void main(String[] args)
	{
		Integer a[][] = (Integer[][]) Array.newInstance(Integer.class, 5,5);
		
		a = initialiseMatrix(a);
		displayMatrix(a);
		Integer visited[][] = visitedMatrix(5,5);
		visited = initilizingVisitedMatrix(visited);
		displayMatrix(visited);
		
	}
	
	public static Integer[][] initialiseMatrix(Integer a[][])
	{
		int cnt = 1;
		for(int i = 0;i< a.length;i++)
		{
			for(int j = 0;j<a[i].length;j++)
			{
				a[i][j]=cnt++;
			}
		}
		return a;
	}

	public static Integer[][] visitedMatrix(int i,int j)
	{
		Integer a[][] = (Integer[][]) Array.newInstance(Integer.class, i,j);
		return a;
	}
	
	public static Integer[][] initilizingVisitedMatrix(Integer[][] a)
	{
		for(int i = 0;i< a.length;i++)
		{
			for(int j = 0;j<a[i].length;j++)
			{
				a[i][j]= 0;
			}
		}
		return a;
	}

	
	
	public static <E> void displayMatrix(E[][] a)
	{
		for(int i = 0;i< a.length;i++)
		{
			for(int j = 0;j<a[i].length;j++)
			{
				System.out.print("   "+a[i][j]);
			}
			System.out.println("");
		}
	}
}
