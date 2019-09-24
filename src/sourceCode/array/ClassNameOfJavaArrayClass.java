package sourceCode.array;

public class ClassNameOfJavaArrayClass
{

	public static void main(String[] args)
	{
		//declaring and initialising Java Array
		int arr[] = {2,3,4,5,6,7,8};
		//Getting the Class Object of Java Array
		@SuppressWarnings("rawtypes")
		Class c = arr.getClass();
		//Getting the Class name of Java Array
		String name = c.getName();
		//Printing the name of the Class.
		System.out.println(" :"+name);
	}

}
