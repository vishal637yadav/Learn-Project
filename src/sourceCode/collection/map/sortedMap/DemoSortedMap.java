package sourceCode.collection.map.sortedMap;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DemoSortedMap 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> hm=new HashMap<Integer,String>();    
		System.out.println("Initial list of elements: "+hm);  
		hm.put(100,"Amit");    
		hm.put(101,"Vijay");    
		hm.put(102,"Rahul");   
	    //System.out.println(" --->>>"+(((Entry) hm).setValue("ERWEWE")).getClass());
		System.out.println("After invoking put() method ");  
		for(Map.Entry m:hm.entrySet())
		{    
			System.out.println(m.getKey()+" "+m.getValue());    
		}  
		    
		hm.putIfAbsent(103, "Gaurav");  
		System.out.println("After invoking putIfAbsent() method ");  
		for(Map.Entry m:hm.entrySet())
		{    
			System.out.println(m.getKey()+" "+m.getValue());    
		}  
		HashMap<Integer,String> map=new HashMap<Integer,String>();  
		map.put(104,"Ravi");  
		map.putAll(hm);  
		System.out.println("After invoking putAll() method ");  
		for(Map.Entry m:map.entrySet())
		{    
			System.out.println(m.getKey()+" "+m.getValue());    
		}
		

		System.out.println("  (new DemoSortedMap()).getClass():=>>"+(new DemoSortedMap()).getClass());
		System.out.println("  hm.getClass():=>>"+hm.getClass());
		
		System.out.println("  BigDecimal.valueOf(32324):=>>"+BigDecimal.valueOf(32324));
		
		
	}  
}