package sourceCode.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
public class FindDuplicatesInArrayDemo {

	public static void main(String[] args) {
		System.out.println("This is the Main Class = !!");
		
		int[] myArray = {1,2,2,4,4,6,6,7,8,8,8};//--new int[10];
		/*for(int element : myArray){
			System.out.println("element => "+element);
		}
		*/
		//ArrayList<Integer> dupList = findDuplicateBruteForceMethod(myArray);
		//System.out.println(" dupList "+dupList);
		//findDuplicateSortArrayMethod(myArray);
	
		//findDuplicateSortArrayMethod(myArray);
		findDuplicateUsingHashSet(myArray);
		
	}

	public static ArrayList<Integer> findDuplicateBruteForceMethod(int array[])
	{
		ArrayList<Integer> duplicateArrayList = new ArrayList<Integer>();
		for(int i=0 ;i< array.length;i++)
		{
			System.out.println(" value of i : "+i);
			if(!duplicateArrayList.contains(array[i]))
			{
				for(int j =i+1; j< array.length; j++)
				{
					if(array[i]==array[j])
					{
						System.out.println("Duplicate Value array[i] => "+array[i]);
						duplicateArrayList.add(array[i]);
						break;
					}
				}
			}
			
		}
		System.out.println(duplicateArrayList.get(6));
		return duplicateArrayList;
	}
	
	public static ArrayList<Integer> findDuplicateSortArrayMethod(int array[])
	{
		ArrayList<Integer> duplicateArrayList = new ArrayList<Integer>();
		
		Arrays.sort(array);
		
		for(int i=0 ;i< array.length-1;i++)
		{
			if(!duplicateArrayList.contains(array[i]))
			{
				if(array[i]==array[i+1])
				{
					System.out.println("Duplicate Value array[i] => "+array[i]);
					duplicateArrayList.add(array[i]);
					i++;
				}
			}
		}
		System.out.println("duplicateArrayList => "+duplicateArrayList);
		return duplicateArrayList;
	}
	
	public static void findDuplicateUsingHashSet(int inputArray[])
	{
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		
		for (int element : inputArray) 
        {   
            if(map.get(element) == null)
            {
                map.put(element, 1);
            }
            else
            {
                map.put(element, map.get(element)+1);
            }
        }
		
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
        
        for (Entry<Integer, Integer> entry : entrySet) 
        {               
            if(entry.getValue() > 1)
            {
                System.out.println("Duplicate Element : "+entry.getKey()+" - found "+entry.getValue()+" times.");
            }
        }
        
        System.out.println("Math.pow(3,4) :=>> "+Math.pow(2,2.2));
	}
}