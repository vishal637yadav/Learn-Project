package sourceCode.basics.sortingAlgo.mergesort;

public class MergeSortAlgoDemo
{

	public static void main(String[] args)
	{
		System.out.println("This is the Main Class!!");
		
		MergeSortAlgoDemo m = new MergeSortAlgoDemo();
		int a[] = {12, 11,5, 13, 5, 6, 7,9,10}; 
		
		m.printArray(a);
		m.sort(a, 0, a.length-1);
		m.printArray(a);
		
		
	}
	
	public void sort(int a[],int startIndex,int lastIndex)
	{
		//printArray(a);
		if(startIndex<lastIndex)
		{
			int midIndex = (startIndex+lastIndex)/2;
			//Calling for First Half
			sort(a,startIndex,midIndex);
			//Calling for Second Half
			sort(a,midIndex+1,lastIndex);
			//Merge the Sorted Halfs
			merge(a,startIndex,midIndex,lastIndex);
		}

	}
	
	public void merge(int a[],int startIndex,int midIndex,int lastIndex)
	{
		//Find the sizes of two Sub-Arrays to be merged.
		int n1 = midIndex-startIndex+1;
		int n2 = lastIndex-midIndex;
		
		/* Create temp arrays */
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i) 
            L[i] = a[startIndex + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = a[midIndex + 1+ j]; 
  
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = startIndex; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                a[k] = L[i]; 
                i++; 
            } 
            else
            { 
                a[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) 
        { 
            a[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) 
        { 
            a[k] = R[j]; 
            j++; 
            k++; 
        }
		
	}
	
	
	public void printArray(int a[])
	{
		for(int i :a)
			System.out.print(" "+i);
		System.out.println();
	}
	
	
}
