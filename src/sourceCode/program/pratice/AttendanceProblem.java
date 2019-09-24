package sourceCode.program.pratice;

import java.util.Scanner;

public class AttendanceProblem
{

	public static void main(String[] args)
	{
		//int attendanceArray[] = {1,2,3,3,4,6,4};
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter Total No of Students");
		int totalStudent = sc.nextInt();
		
		int attendanceArray[]=new int[totalStudent];
		for(int i=0;i<totalStudent;i++) 
			attendanceArray[i]=sc.nextInt();
		   
		//System.out.println(totalStudent);
		//Displaying input Array
		
		/*for(int a :attendanceArray)
			System.out.println(", "+a);
		*/
		
		getAbsentStudent(totalStudent,attendanceArray);
		
	}
	
	public static void getAbsentStudent(int totalStudent,int attendanceArray[])
	{
		StringBuilder attSb = new StringBuilder();
		for(int i=0;i<totalStudent;i++)
		{
			attSb.append(attendanceArray[i]).append(",");
		}
		
		String attString = attSb.toString();
		//System.out.println(""+attString);
		
		//System.out.println("----------------Output---------------");
		String result = null;
		for(int i = 1;i<= totalStudent;i++)
		{
			if(!attString.contains(""+i))
				if (result == null)
					result = ""+i;
				else
					result = result+" "+i;
			
				//System.out.print(i+" ");
		}
		System.out.println(result);
	}
}
