package sourceCode.program.pratice.bny;

import java.util.HashSet;

public class Question3
{

	public static void main(String[] args)
	{
		System.out.println("This is main ---------->><<----------------");
		int a[]= {1,3,3,4,4,4};
		
		HashSet<Integer> hs = new HashSet<>();
		HashSet<Integer> rehs = new HashSet<>();
		
		for(int i=0;i<a.length;i++)
		{
			if(!hs.add(a[i]))
			{
				rehs.add(a[i]);
				System.out.println("a[i] : "+a[i]);
			}
		}
		System.out.println("rehs  : "+rehs);
		System.out.println("Count : "+rehs.size());
		
	}
	
}
