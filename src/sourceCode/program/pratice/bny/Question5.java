package sourceCode.program.pratice.bny;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Question5
{

	public static void main(String[] args)
	{
		String s = "abcabdababeabcfg";
		int minLength = 2, maxLength = 4, maxUnique = 3;

		findMostFrequentSubstring(s, minLength, maxLength, maxUnique);

	}

	public static void findMostFrequentSubstring(String s, int minLength,
			int maxLength, int maxUnique)
	{
		HashMap<String, Integer> hs = new HashMap<String, Integer>();

		for (int i = minLength; i <= maxLength; i++)
		{
			System.out.println("i = " + i);
			for (int j = 0; j < s.length() - i + 1; j++)
			{
				String tmp = s.substring(j, (j + i));
				System.out.println(tmp);
				
				if(getUniqCharacterCount(tmp) <= maxUnique)
				{
					if (hs.containsKey(tmp))
					{
						Integer value = hs.get(tmp);
						hs.put(tmp, ++value);
					} else
					{
						hs.put(tmp, 1);
					}
				}
			}
		}
		
		System.out.println(hs);
		
		Integer i = hs.entrySet().stream().max(Map.Entry.comparingByValue()).get().getValue();
		System.out.println("---------------------i :"+i);
		Integer i1 =  hs.entrySet().stream().sorted((e1,e2)->e1.getValue()<e2.getValue()?1:e1.getValue()>e2.getValue()?-1:0).findFirst().get().getValue();
		System.out.println("---------------------i1 :"+i1);
		
		Optional<Entry<String, Integer>> i2 =  hs.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).findFirst();
		System.out.println("---------------------i2 :"+i2.get().getValue());
		
		System.out.println("Max value is " + i2.get().getValue());
		
		//older way of doing
		int maxValue = 0;
		for (Map.Entry m : hs.entrySet())
		{
			//System.out.println("key:" + m.getKey() + ", value:" + m.getValue());
			//System.out.println("Unque Character Count : "+ getUniqCharacterCount((String) m.getKey()));
			int currVal = (int) m.getValue();
			if(currVal>maxValue)
			{
				maxValue = currVal;
			}
		}
		System.out.println("maxvalue ="+maxValue);
		
	}

	public static int getUniqCharacterCount(String a)
	{
		HashSet<Character> hs = new HashSet<>();
		char[] c = a.toCharArray();
		for (int i = 0; i < c.length; i++)
		{
			hs.add(c[i]);
		}
		return hs.size();
	}

}
