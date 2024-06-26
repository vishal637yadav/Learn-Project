package sourceCode.java8.stream;

import java.util.stream.*;

public class StreamIterationExample
{

	public static void main(String[] args)
	{
		Stream.iterate(1, element -> element+1)
		.filter(element -> element%5 == 0)
		.limit(8)
		.forEach(System.out ::println);
	}
}
