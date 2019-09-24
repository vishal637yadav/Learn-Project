package sourceCode.basics;

import java.time.LocalDateTime;

public class BreakContinueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is Main()");
		BreakDemo();
		System.out.println("-----------------ContinuDemo()----------------------");
		ContinuDemo();
		
		
	}
	
	public static void BreakDemo()
	{
		for(int i=0 ;i<10;i++)
		{
			System.out.println("Step 1 i = "+i);
			System.out.println("Step 2 i = "+i);
			if(i>=6)
				break;
			System.out.println("Step 3 i = "+i);
			System.out.println("---------------------------------------");
		}
	
	}

	public static void ContinuDemo()
	{
		for(int i=0 ;i<10;i++)
		{
			System.out.println("Step 1 i = "+i);
			System.out.println("Step 2 i = "+i);
			if(i>=6)
				continue;
			System.out.println("Step 3 i = "+i);
			System.out.println("---------------------------------------");
		}
	
	}
}
