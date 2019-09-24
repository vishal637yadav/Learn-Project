package sourceCode.array;

public class CopingJavaArrayDemo
{

	public static void main(String[] args)
	{
		//declaring the source Character Array
		char[] copyFrom = 
		{ 'd', 'e', 'c', 'a', 'f', 'f', 'e','i', 'n', 'a', 't', 'e', 'd' };
		//declaring the destination Character Array
		char[] copyTo = new char[7];
		System.arraycopy(copyFrom, 0,copyTo, 0, 3);
		//printing the destination array
		System.out.println(String.valueOf(copyTo));
	}

}
