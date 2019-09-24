package sourceCode.basics.pattern;

/*	1
 *	2 3
 * 	3 4 5
 *  4 5 6 7
 */
public class PatternExample1
{

	public static void main(String[] args)
	{
		for(int i = 1;i<= 4;i++)
		{
			for(int j=i;j<2*i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		

/*
		1
		2 3
		4 5 6
	  //6 8 9 10
		7 8 9 10
*/
		System.out.println("-----------------------------");
		int count = 0;
		for(int i = 1;i<= 6;i++)
		{
			if(i == 3 || i==5)
			{
				continue;
			}
			else
			{	
				count++;
				for(int j=i, temp=1;j<2*i && temp<=count ;j++,temp++)
				{
					if(j==6)
						j++;
					System.out.print(j+" ");
				}
				System.out.println();
			}
		}

		/*
		 * 
1
2 2 
3 3 3 
4 4 4 4
		*/
		
		System.out.println("--------------------------");
		for(int i = 1;i<5;i++)
		{
			for(int j= 1;j<= i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
/*		
	  1
    2 3
  4 5 6
7 8 9 10

		6 7 8 9   

*/
		System.out.println("---------------");
		int cnt = 1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(j>=5-i)
					System.out.print(" "+cnt++);
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		
		/*
		 * 
1       2
   3 4
    5
   6 7
8       9 
		*/
		
		System.out.println("------------------------");
		cnt = 1;
		for(int i=1;i<6;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if((i==1||i==5) && (j==1 || j==9))
					System.out.print(""+cnt++);
				else if((i==2||i==4) && (j==4 || j==6))
					System.out.print(""+cnt++);
				else if(i==3 && (j==5))
					System.out.print(""+cnt++);
				else	
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}
	
}
