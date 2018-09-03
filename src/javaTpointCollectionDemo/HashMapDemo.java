package javaTpointCollectionDemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		HashMap<Integer, Student> map1 = new HashMap<Integer, Student>();
		map.put(1, "one");
		map.put(4, "four");
		map.put(6, "six");
		map.put(8, "eight");
		map.put(3, "three");
		
		String text = map.get(6);
		System.out.println(text);
		
		for(Map.Entry<Integer, String> entry: map.entrySet())
		{
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		Student s1 = new Student(10, "Kshitij", 38);
		Student s2 = new Student(11, "Anisha", 8);
		Student s3 = new Student(12, "Ankit", 9);
		
		map1.put(1,s1);
		map1.put(2,s2);
		map1.put(3,s3);
		
		System.out.println("Using User Defined Objects in Map");
		for(Map.Entry<Integer, Student> entry: map1.entrySet())
		{
			int key = entry.getKey();
			Student s = entry.getValue();
			System.out.println(key + " Details ");
			System.out.println(s.rollno+" "+s.name+" "+s.age);
		}
		

	}

}
