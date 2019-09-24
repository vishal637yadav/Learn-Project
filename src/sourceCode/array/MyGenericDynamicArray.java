package sourceCode.array;

import java.lang.reflect.Array;

public class MyGenericDynamicArray<E>
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("---------------------------String.class------"+String.class);
		
		String ar[]= createGenericDynamicArray(String.class,5);
		displayGenericDynamicArray(ar);
		ar = add(ar,"Vishal");
		System.out.println("----------------------------------------------------------");
		displayGenericDynamicArray(ar);
		ar = add(ar,"Naveen");
		System.out.println("----------------------------------------------------------");
		displayGenericDynamicArray(ar);
		ar = addAt(ar,"Swapinil",1);
		System.out.println("----------------------------------------------------------");
		displayGenericDynamicArray(ar);
		ar = addAt(ar,"Priyansh",2);
		System.out.println("----------------------------------------------------------");
		displayGenericDynamicArray(ar);
		ar = addAt(ar,"Ajim",0);
		System.out.println("----------------------------------------------------------");
		displayGenericDynamicArray(ar);
		ar = addAt(ar,"Sachin",3);
		System.out.println("----------------------------------------------------------");
		displayGenericDynamicArray(ar);
		
	}
	
	//createGenericDynamicArray
	public static<E> E[] createGenericDynamicArray(Class<E> c, int s)
	{
		@SuppressWarnings("unchecked")
		E[] a = (E[]) Array.newInstance(c, s);
		return a;
	}
		
	public static<E> void displayGenericDynamicArray(E [] gda)
	{
		for(E ar : gda)
			System.out.println(ar);
	}
	
	public static<E> E[] add(E[] array,E element)
	{
		for(int i = 0;i< array.length;i++)
		{
			if(array[i]==null)
			{
				array[i]= element;
				break;
			}
		}
		return array;
	}
	
	public static <E> E[] arrayShift(E[] array,int pos) throws Exception
	{
		if(pos > array.length ||pos < 0)
		{
			throw new Exception("Please Enter the Valid Postion.");
		}else
		{
			for(int i=array.length-2;pos<=i;i--)
			{
				if(array[i]==null)
				{
					continue;
				}
				else
				{
					array[i+1] =array[i];
				}
			}
		}
		return array;
	}
	public static<E> E[] addAt(E[] array,E element,int pos) throws Exception
	{
		if(pos > array.length ||pos <0)
		{
			throw new Exception("Please Enter the Valid Postion.");
		}else
		{
			System.out.println("---------------->>>--------");
			array = arrayShift(array,pos);
			array[pos] = element;
		}
		return array;
	}
	
}
