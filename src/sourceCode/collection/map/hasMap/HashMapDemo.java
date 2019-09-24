package sourceCode.collection.map.hasMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {

		String version = System.getProperty("java.version");
		System.out.println("Java Version :"+version);
		System.out.println("3 << 4 :"+(3 << 4));
		
		
		//HashMap<Integer, String> hm2 = new HashMap<Integer, String>(-2);
		//System.out.println(hm2);
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		System.out.println("Initial list of elements: " + hm);
		hm.put(33, "Rahul17");
		hm.put(65, "Rahul33");
		hm.put(97, "Rahul49");
		hm.put(129, "Rahul65");
		hm.put(161, "Rahul81");
		hm.put(193, "Rahul97");
		hm.put(225, "Rahul113");
		hm.put(257, "Rahul129");
		hm.put(289, "Rahul145");
		hm.put(321, "Rahul161");
		hm.put(353, "Rahul177");
		hm.put(385, "Rahul193");
		hm.put(417, "Rahul209");
		hm.put(449, "Rahul209");
		hm.put(481, "Rahul209");
		hm.put(417, "Rahul209");
		
		System.out.println("After invoking put() method ");
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		hm.putIfAbsent(103, "Gaurav");
		System.out.println("After invoking putIfAbsent() method ");
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(104, "Ravi");
		map.putAll(hm);
		System.out.println("After invoking putAll() method ");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		System.out.println("map.get(103) :=> "+map.get(103));
		System.out.println("map.get(234234) :=> "+map.get(234234));
		
	}

}
