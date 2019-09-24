package sourceCode.java8.methodReference;

import java.util.function.BiFunction;


public class UsingPredefinedFunctional_Interface_MethodReference
{

	public static int add(int a,int b)
	{
		return a+b;
	}
	
	public static void main(String[] args)
	{
		//Using Method Reference
		BiFunction<Integer,Integer,Integer> bf = UsingPredefinedFunctional_Interface_MethodReference :: add;
		int sum = bf.apply(34, 16);
		System.out.println("Value of Sum :"+sum);

		//Using Lambda Expression
		BiFunction<Integer,Integer,Integer> lambda = (a,b)->a+b;
		int sum2 = lambda.apply(23, 65);
		System.out.println(" sum2 : "+sum2);
		
	}

}
