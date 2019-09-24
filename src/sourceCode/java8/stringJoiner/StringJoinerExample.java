package sourceCode.java8.stringJoiner;

import java.util.StringJoiner;

public class StringJoinerExample
{

	public static void main(String[] args)
	{
		//passing comma(,) as delimiter
		StringJoiner joinNames = new StringJoiner("|","HHHH",null); 
		//Adding values to StringJoiner
		joinNames.add("Rahul");
		joinNames.add("Raju");
		joinNames.add("Peter");
		joinNames.add("Raheem");

		System.out.println(joinNames);

	}

}
