package sourceCode.collection.map.hasMap;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.*;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHashMapDemo
{

	public static void main(String[] args)
	{
		Map<Integer, String> hmap = new HashMap<Integer, String>();

		System.out.println("Put First Element :" + hmap.put(11, "Vishal"));
		System.out.println("Put First Element :" + hmap.put(6, "NItiket"));
		System.out.println("Put First Element :" + hmap.put(4, "Sandeep"));
		System.out.println("Put First Element :" + hmap.put(11, "Sachin"));
		
		hmap.put(19, "Tendulkar");
		hmap.put(12, "Ajay");
		hmap.put(1, "Rohit");
		
		System.out.println("Unsorted Map");
		displayMap(hmap);
		Map a = sortMapUsingTreeMap(hmap);
		System.out.println("Sorted   Map");
		displayMap(a);
		displaySortMapJava8(hmap);
		//Map b =sortMapUsingTreeMapComparator(hmap);
		//displayMap(b);
		
		
	}

	// Using TreeMap we can sort on the Basis of Key map
	public static <K, V> Map<K, V> sortMapUsingTreeMap(Map<K, V> hmap){
		Map<K, V> map = new TreeMap<K, V>(hmap);
		return map;
	}
	
	//Using Java 8 Streams
	public static void displaySortMapJava8(Map<Integer,String> unsortMap)
	{
		
		Map<Integer,String> result = unsortMap.entrySet().stream()
		.sorted((i1,i2)-> i1.getValue().compareTo(i2.getValue())
		/*i1.getValue()<i2.getValue()
				?-1
				:i1.getValue()>i2.getValue()
				?1
				:0
		*/		)
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
				(oldValue,newValue)-> oldValue,LinkedHashMap::new));
		
		System.out.println("--------------------------------");
		displayMap(result);
		
		
		/*Map<String, Integer> result = unsortMap.entrySet().stream()
				.sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
						(oldValue,newValue)-> oldValue,LinkedHashMap::new));
		*/		
		
		//sort by values, and reserve it, 10,9,8,7,6...
/*
		Map<String, Integer> result = unsortMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

*/						
        /*
        //Alternative way
        Map<String, Integer> result2 = new LinkedHashMap<>();
        unsortMap.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEachOrdered(x -> result2.put(x.getKey(), x.getValue()));
        */
        System.out.println("Sorted...");
	}
	
	public static <K, V> void displayMap(Map<K, V> map)
	{
		for (Map.Entry<K, V> entry : map.entrySet())
		{
			System.out.println("Key : " + entry.getKey() + " Value : "
					+ entry.getValue());
		}
	}
}
