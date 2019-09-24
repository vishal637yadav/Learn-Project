package sourceCode.java8.stringJoiner;

import java.util.StringJoiner;

public class StringJoinerExample2
{

	public static void main(String[] args)
	{
		// passing comma(,) and square-brackets as delimiter
		StringJoiner joinNames = new StringJoiner(",", "{", "}"); 
		System.out.println(joinNames);
		// Adding values to StringJoiner
		joinNames.add("Rahul");
		joinNames.add("Raju");
		joinNames.add("Peter");
		joinNames.add("Raheem");

		System.out.println(joinNames);

	}

}
