package sourceCode.java8.stream.depth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterDemo
{

	public static void main(String[] args)
	{
		List<String> nameList = new ArrayList<>();
		nameList.add("Rajat");
		Collections.addAll(nameList, "Vishal","Vijay","Vikram","Amar","Ashish","Rahul","Rajat");
		//Without using stream
		System.out.println("Filtered List getFilterOutput            :"+getFilterOutput(nameList,"R"));
		//Using stream
		System.out.println("Filtered List getFilterOutputUsingStream :"+getFilterOutputUsingStream(nameList,"R"));
		
		
	}
	
	//Filter List<String> without using Java 8 Stream
	private static List<String> getFilterOutput(List<String> namesList,String filter)
	{
		List<String> filteredNameList = new ArrayList<>();
		for(String a:namesList )
		{
			if(a.startsWith(filter))
			{
				filteredNameList.add(a);
			}
		}
		return filteredNameList;
	}
	
	public static List<String> getFilterOutputUsingStream(List<String> namesList,String filter)
	{
		//return namesList.stream().filter(s-> s.startsWith(filter)).collect(Collectors.toList());
		List<String> filteredNameList;
		Stream<String> stream ;
		
		stream = namesList.stream();//getting the stream object
		stream = stream.filter(s-> s.startsWith(filter));//filtering the stream object
		filteredNameList = stream.collect(Collectors.toList());//storing the stream into List
		
		return filteredNameList;
	}
	

}
