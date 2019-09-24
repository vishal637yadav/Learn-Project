package sourceCode.java8.stream;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExploration1
{

	@SuppressWarnings("unchecked")
	public static <R> void main(String[] args)
	{
		int a[] = {11,2,33,4,15,6,77,28,19};
		Arrays.stream(a).forEach(System.out::print);
		System.out.println();
		Arrays.stream(a).forEach((n)->System.out.print(n+" "));
		System.out.println();
		System.out.println("----------Sorted Array----------------");
		//Sorting int Array using stream
		Arrays.stream(a).sorted()
		.forEach((n)->System.out.print(n+" "));
		System.out.println();
		
		int max = Arrays.stream(a).max().getAsInt();
		System.out.println("max : "+max);
		
		System.out.println("count : "+Arrays.stream(a).count());
		System.out.println("Avg  : "+Arrays.stream(a).average().getAsDouble());
		System.out.println();

	}

}
