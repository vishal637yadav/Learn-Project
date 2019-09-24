package sourceCode.java5.for_eachLoop;

public class For_EachLoopLimitation1
{
	//1.For-each loops are not appropriate when you want to modify the array:
	//2.For-each loops do not keep track of index. So we can not obtain array index using For-Each loop
	//3.For-each only iterates forward over the array in single steps
	//4.For-each cannot process two decision making statements at once

	public static void main(String[] args)
	{
		int numbers[] = { 2, 3, 4, 5, 6, 7, 8 };

		System.out.println("Printing Array Before ");
		for(int i = 0 ;i< numbers.length;i++)
		{
			System.out.print(" " + numbers[i]);
		}
		
		System.out.println("");
		
		for (int num : numbers)
		{
			// only changes num, not the array element
			num = num * 2;
			System.out.println("Number :" + num);
		}
		
		System.out.println("Printing Array After ");
		for(int i = 0 ;i< numbers.length;i++)
		{
			System.out.print(" " + numbers[i]);
		}
	}

}
