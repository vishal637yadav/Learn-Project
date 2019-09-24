package sourceCode.basics.backtracking;

public class GreekForGreekPermutation
{
	public static void main(String[] args)
	{
		String str = "ABC";
		int n = str.length();
		//GreekForGreekPermutation permutation = new GreekForGreekPermutation();
		//permutation.permute(str, 0, n - 1);
		permute(str, 0, n - 1);
	}

	/**
	 * permutation function
	 * 
	 * @param str
	 *            string to calculate permutation for
	 * @param startIndex
	 *            starting index
	 * @param lastIndex
	 *            end index
	 */
	private static void permute(String str, int startIndex, int lastIndex)
	{
		System.out.println("                  str :"+str+" startIndex:"+startIndex+" lastIndex:"+lastIndex);
		
		if (startIndex == lastIndex)
			System.out.println(str);
		else
		{
			for (int i = startIndex; i <= lastIndex; i++)
			{
				str = swap(str, startIndex, i);
				permute(str, startIndex + 1, lastIndex);
				str = swap(str, startIndex, i);
			}
		}
	}

	/**
	 * Swap Characters at position
	 * 
	 * @param a
	 *            string value
	 * @param i
	 *            position 1
	 * @param j
	 *            position 2
	 * @return swapped string
	 */
	public static String swap(String a, int i, int j)
	{
		//System.out.println("a:"+a+" i:"+i+" j:"+j);
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		System.out.println("                                    a:"+a+" i:"+i+" j:"+j+" return:"+String.valueOf(charArray));
		
		return String.valueOf(charArray);
	}

}
