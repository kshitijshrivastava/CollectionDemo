package javaTpointCollectionDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class DifferentMaps {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		testMap(hashMap); //no guarantee of insertion order preservation
		testMap(linkedHashMap); // insertion order will be preserved
		testMap(treeMap);//default natural sorting will be used
		
	}
	
	public static void testMap(Map<Integer, String> map)
	{
		map.put(2,"cat");
		map.put(90,"dog");
		map.put(3,"rat");
		map.put(15,"snake");
		map.put(22,"elephant");
	
		for (Integer key : map.keySet())
		{
			String value = map.get(key);
			System.out.println(key+ " : "+ value);
		}
		
		

	}
}


