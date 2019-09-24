package sourceCode.basics;

public class PowerFunctionDemo {

	public static long pow(long base,long power)
	{
		System.out.print(" pow("+base+","+power+") : ");
		long powReturn = 0;
		if(power == 0)
		{
			powReturn =	base; 
		}else
		{ 
			long tempPow = pow(base,power/2);
			if(power%2 == 0)
			{
				powReturn =	tempPow*tempPow;
			}else
			{
				powReturn =	base*tempPow*tempPow;
			}
		}
		System.out.println(powReturn);
		return powReturn;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" power "+pow(2,55));
		//int maxIntValue = 2147483647;
		//System.out.println("maxIntValue   = "+maxIntValue);
		//System.out.println("2*maxIntValue = "+(maxIntValue-4));
		
	}

}

