package sourceCode.java8.methodReference;

import java.util.function.BiFunction;

class Arithmetic2
{
	public int add(int a,int b)
	{
		return a+b;
	}
}
public class InstanceMethodReference3
{
	
	public static void main(String[] args)
	{
		BiFunction<Integer, Integer, Integer> allInt
		= new Arithmetic2() :: add;
		System.out.println("allInt.apply(34, 21) : "+allInt.apply(34, 21));
		
	}

}
