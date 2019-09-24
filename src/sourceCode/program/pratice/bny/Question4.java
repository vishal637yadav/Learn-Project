package sourceCode.program.pratice.bny;

public class Question4
{

	public static void main(String[] args)
	{
		System.out.println("This is Main()!!");
		//getCandleCount(3,2);
		getCandleCount(5,5);
		
		
	}
	
	public static void getCandleCount(int n,int r)
	{
		int count = n;
		while(true)
		{
			if(n/r ==0)
			{
				System.out.println("End");
				break;
			}else
			{
				int reusedCandle = n/r;
				int leftCandle = n%r;
				n = reusedCandle + leftCandle ;
				count = count + reusedCandle ;
			}
		}
		System.out.println("count = "+count);
	}
}
