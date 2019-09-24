package sourceCode.basics.dynamicPrograming;

public class FactorialDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Factorial.getFactorial(5)== "+Factorial.getFactorial(5));
		System.out.println("Factorial.getFactorial(6)== "+Factorial.getFactorial(6));
		System.out.println("Factorial.getFactorial(7)== "+Factorial.getFactorial(7));
		System.out.println("Factorial.getFactorial(7)== "+Factorial.getFactorial(7));
		System.out.println("Factorial.getFactorialDP(7)        == "+Factorial.getFactorialDP(7));
		System.out.println(" <<=::=>> "+Integer.parseInt("34"));
	}

}


class Factorial
{
	private Factorial(){};
	
	public static int getFactorial(int n)
	{
		System.out.println("getFactorial("+n+")");
		int result = 0;
		if(n == 1)
		{
			result = 1;
		}else
		{
			result = n*getFactorial(n-1);
		}
		System.out.println("result = "+result);
		return result;
	}
	
	public static int getFactorialDP(int n)
	{
		int result = 0 ;
		int factArray [] = new int[n];
		factArray[0]= 1; 
		
		for(int i = 1;i< factArray.length;i++)
		{
			
			factArray[i]=factArray[i-1]*i;
		}
		
		return factArray[n-1];
	}
}
