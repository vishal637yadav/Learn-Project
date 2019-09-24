package sourceCode.dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer in ;
	}
	
	public static int getIntegerInput() throws NumberFormatException, IOException
	{
		BufferedReader brIn3 = 	new BufferedReader(new InputStreamReader(System.in)); 
		//System.out.print("Enter the element to be added : ");   
		// Reading data using readLine 
		int element3 = Integer.parseInt(brIn3.readLine());
		return element3;
	}

}
