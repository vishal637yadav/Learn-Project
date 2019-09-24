package sourceCode.java8.methodReference;

import java.util.function.BiFunction;

class Arithmetic
{
	public static int add(int a,int b)
	{
		return a+b;
	}
	public static float add(int a,float b)
	{
		return a+b;
	}
	public static float add(float a,int b)
	{
		return a+b;
	}
	public static float add(float a,float b)
	{
		return a+b;
	}
}

public class UsingPredefinedFunctionalInterface_OverLoadingMethod_MethodReference
{
	
	public static void main(String[] args)
	{
		BiFunction<Integer, Integer, Integer> allInt = Arithmetic :: add;
		int sumAllInt = allInt.apply(34, 66);
		System.out.println("sumAllInt : "+sumAllInt);
		
		BiFunction<Float, Integer, Float> floatInt = Arithmetic :: add;
		float sumFloatInt = floatInt.apply(34.45f, 698);
		System.out.println("sumFloatInt : "+sumFloatInt);
	
		//Using Lambada
		BiFunction<Float, Integer, Float> floatInt1 = (a,b)->a+b;
		System.out.println("floatInt1.apply(23.54f, 43) : "+floatInt1.apply(23.54f, 43));
	}

}
