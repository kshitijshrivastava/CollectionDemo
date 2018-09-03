package javaTpointCollectionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class stringLengthComparator implements Comparator<String>// sorts according to string length
{

	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		int l1 = s1.length();
		int l2=s2.length();
		if(l1>l2)
		{
			return 1;
		}
		else if (l1<l2)
		{
			return -1;
		}
		return 0;
		//return -s1.compareTo(s2);
	}
	
}

class stringAlphabeticalOrder implements Comparator<String>
{

	@Override
	public int compare(String s1, String s2) {
		return s1.compareTo(s2);
	
	}
	
}

class ReverseOrder implements Comparator<Integer>
{

	@Override
	public int compare(Integer num1, Integer num2) {
		return -num1.compareTo(num2);
	
	}
	
}

public class SortingList {

	public static void main(String[] args) {
		
		List<String> animals = new ArrayList<String>();
		animals.add("tiger");
		animals.add("lion");
		animals.add("cat");
		animals.add("swan");
		animals.add("elephant");
		
		System.out.println(animals);
		
		
		
		//Collections.sort(animals); //default sorting
		//Collections.sort(animals, new stringLengthComparator()); //user defined sorting
		Collections.sort(animals, new stringAlphabeticalOrder() );
		
		//System.out.println(animals);
		
		for(String str:animals)
		{
			System.out.println(str);
		}
		
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(3);
		numbers.add(73);
		numbers.add(23);
		numbers.add(13);
		numbers.add(30);
		
		System.out.println(numbers);
		
		//Collections.sort(numbers);
		//Collections.sort(numbers, new ReverseOrder());
		
		Collections.sort(numbers, new Comparator<Integer>(){

			@Override
			public int compare(Integer num1, Integer num2) {
				// TODO Auto-generated method stub
				return -num1.compareTo(num2);
			}
			
		});
		
		
		//System.out.println(numbers);
		
		for(Integer i:numbers)
		{
			System.out.println(i);
		}
		
		
		

	}

}
