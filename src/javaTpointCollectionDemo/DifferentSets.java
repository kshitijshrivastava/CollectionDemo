package javaTpointCollectionDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DifferentSets {

	public static void main(String[] args) {


		HashSet<String> hashSet = new HashSet<String>();
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		TreeSet<String> treeSet = new TreeSet<String>();
		//addElementsToSet(hashSet);//no guarantee of insertion order preservation
		addElementsToSet(linkedHashSet);// insertion order will be preserved
		//addElementsToSet(treeSet);//default natural sorting will be used
		
		
	}
	public static void addElementsToSet(Set<String> set1 )
	{
		set1.add("dog");
		set1.add("cat");
		set1.add("monkey");
		set1.add("giraffe");
		set1.add("swan");
		
		for (String element:set1)
		{
			System.out.println(element);
		}
		System.out.println();
		
	}
		
		
	}


