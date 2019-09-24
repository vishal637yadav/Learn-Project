package sourceCode.program.pratice.bny;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Question2
{

	public static void main(String[] args)
	{
		System.out.println("This is main");
		String s = " He had	had, quite : enough;of.this,course";
		//String s = "1 2	3,4.5:6;7-8";
		returnFirstRepeatedWord(s);

	}
	
	public static void returnFirstRepeatedWord(String s)
	{
		String strArr[]= s.split("[ 	,.:;-]");
		HashSet<String> hs = new HashSet<>();
		
		for(int i=0;i< strArr.length;i++)
		{
			//System.out.println(strArr[i].length());
			if(strArr[i].length()>0 )
			{
				//System.out.println(strArr[i].trim());
				if(!hs.add(strArr[i].trim()))
				{
					System.out.println("Second time added()");
					System.out.println("First 2nd  Found :"+strArr[i].trim());
					break;
				}
			}
		}
		//display(strArr);
	}
	
	public static void display(String a[])
	{
		System.out.println("a.length :="+ a.length);
		for(int i=0;i< a.length;i++)
		{
			System.out.println(a[i].trim());
		}
		System.out.println();
	}

}
