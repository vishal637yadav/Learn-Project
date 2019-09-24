package sourceCode.multithreading.concurrency;

import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample
{

	public static void main(String[] args)
	{
		ConcurrentHashMap<String, Integer> m = new ConcurrentHashMap<String, Integer>();
		
		m.put("a", 1);
		m.put("b", 2);
		
		//Print all values stored in ConcurrentHashMap instance
		for(Entry<String, Integer> a : m.entrySet())
		{
			System.out.println(" m.getKey() : "+a.getKey()+" || a.getValue() :"+a.getValue());
		}
	}

}
