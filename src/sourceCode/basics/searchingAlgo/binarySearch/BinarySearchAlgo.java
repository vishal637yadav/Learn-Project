package sourceCode.basics.searchingAlgo.binarySearch;

public class BinarySearchAlgo
{

	public static void main(String[] args)
	{
		System.out.println("--------This is main class-----------");
		int a[] = {12,45,54,65,78,87,320,434,543};
		
		int result = binarySearch(a, 0, 7, 11);
		System.out.println(result);
	}

	public static int binarySearch(int a[], int startIndex, int lastIndex,
			int searchElement)
	{
		if (lastIndex >= startIndex)
		{
			// calculate midElement index
			int mid = (startIndex + lastIndex) / 2;
			if (a[mid] == searchElement)
			{
				return mid;
			} else if (searchElement < a[mid])
			{
				return binarySearch(a, startIndex, mid - 1, searchElement);
			} else
				return binarySearch(a, mid + 1, lastIndex, searchElement);
		}
		return -1;
	}
}
