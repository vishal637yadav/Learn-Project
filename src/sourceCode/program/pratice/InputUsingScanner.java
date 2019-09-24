package sourceCode.program.pratice;

import java.util.Scanner;

public class InputUsingScanner
{

	public static void main(String[] args)
	{
		try(Scanner sc = new Scanner(System.in))
		{
			System.out.print("Enter the Name :");
			//takes the continues String
			String name = sc.next();
			System.out.println("Name :"+name);
			sc.nextLine();
			System.out.println("Enter Description :-");
			//takes the continues String
			String description = sc.nextLine();
			System.out.println("Description :"+description);
			
		}catch (Exception e) {
			System.out.println("Exception :"+e);
		}

	}

}
