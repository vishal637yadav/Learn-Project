package sourceCode.collection.arrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListDemo
{

	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<>();
		list.add("Vishal");
		list.add("Ramesh");
		System.out.println("list :"+list);
		
		
		String [][][][]strArray = (String[][][][])Array.newInstance(String.class, 2,3,4,2);
		
		System.out.println("Array."+strArray);
		for(int i = 0;i< strArray.length;i++)
		{
			System.out.println("strArray.length() :"+strArray.length);
			for(int j = 0;j< strArray[i].length;j++)
			{
				System.out.println("strArray[i].length :"+strArray[i].length);
				for(int k = 0;k< strArray[i][j].length;k++)
				{
					System.out.println("strArray[i][j].length :"+strArray[i][j].length);
					for(int l = 0;l< strArray[i][j][k].length;l++)
					{
						System.out.println("strArray[i][j][k].length:"+strArray[i][j][k].length);
					}
				}
				
			}
			System.out.println("-------------------------------------------------");
		}
		
		
	}

}
