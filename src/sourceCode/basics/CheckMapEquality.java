package sourceCode.basics;

import java.util.HashMap;
import java.util.Map;

public class CheckMapEquality
{

	public static void main(String[] args)
	{
		Map<String, String> map1 = new HashMap<>();
		map1.put("a", "vishal");
		map1.put("b", "Sachin");
		map1.put("c", "Ramesh");

		Map<String, String> map2 = new HashMap<>();
		map2.put("a", "vishal");
		map2.put("b", "Sachin");
		map2.put("c", "Ramesh");

		for (Map.Entry<String, String> m : map1.entrySet())
		{
			System.out.println(m.getKey() + " " + m.getValue());
		}

		System.out.println(" Result " + isMapEqual(map1, map2));
		System.out.println(" Result isMapEqualGeneric: "
				+ isMapEqualGeneric(map1, map2));

	}

	public static boolean isMapEqual(Map<String, String> a,
			Map<String, String> b)
	{
		if (a == b)
			return true;
		else if (a.size() == (b.size()))
		{
			for (String key : a.keySet())
			{
				System.out.println("key:" + key);
				if (b.containsKey(key))
				{
					if (!a.get(key).equals(b.get(key)))
					{
						return false;
					}
				} else
				{
					return false;
				}
			}
			return true;
		} else
			return false;
	}

	public static <K, V> boolean isMapEqualGeneric(Map<K, V> a, Map<K, V> b)
	{
		if (a == b)
			return true;
		else if (a.size() == (b.size()))
		{
			for (K key : a.keySet())
			{
				// System.out.println("key:" + key);
				if (b.containsKey(key))
				{
					if (!a.get(key).equals(b.get(key)))
					{
						return false;
					}
				} else
				{
					return false;
				}
			}
			return true;
		} else
			return false;
	}

}
