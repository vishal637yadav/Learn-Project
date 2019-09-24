package sourceCode.collection.map.hasSet;

public class MainMethodDemo
{

	public static void main(String [] args)
	{
		 System.out.println("sdfsd");
		 displayTable(64,15);
//		Integer a[] = { 1, 23, 3, 55, 6, 77, 4, 6734, 6, 87, 54, 78 };
//		displayArray(a);
		
	}

	public static void displayTable(int table, int tableUpto)
	{
		System.out.println(" ");
		for (int i = 1; i <= tableUpto; i++)
			System.out.println(table + "X" + i + " = " + (table * i + 1));
	}
	
	public static <T> void displayArray(T array[])
	{
		for (T a : array)
		{
			System.out.println(a);
		}
	}

}
