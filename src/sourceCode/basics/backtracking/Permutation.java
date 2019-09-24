package sourceCode.basics.backtracking;

public class Permutation
{

	public static void main(String[] args)
	{
		System.out.println("This is main Class!!");
		String str = "ABCDE";
		int n = str.length(); 
        //String str1 = swap(str,3,3);
		//System.out.println(str1);
		
		permutation(str,0,n-1);
	}
	
	public static void permutation(String str,int startingIndex,int lastIndex)
	{
		if(startingIndex == lastIndex)
		{
			System.out.println(str);
		}else
		{
			for(int i = startingIndex; i<=lastIndex ;i++)
			{
				str = swap(str,startingIndex,i);
				permutation(str, startingIndex+1, lastIndex);
				str = swap(str,startingIndex,i);
			}
		}
	}

	public static String swap(String str, int i, int j)
	{
		char[] strCharArray = str.toCharArray();
		char temp = strCharArray[i];
		strCharArray[i] = strCharArray[j];
		strCharArray[j] = temp;
		return String.valueOf(strCharArray);
		//return String.copyValueOf(strCharArray);
	}

}
