package javaTpointCollectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class UserDefinedALDemo {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(10, "Kshitij", 38);
		Student s2 = new Student(10, "Anisha", 8);
		Student s3 = new Student(10, "Ankit", 9);
		
		//ArrayList<Student> al= new ArrayList<Student>();
		LinkedList<Student> al= new LinkedList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		
		Iterator itr = al.iterator();
		
		while(itr.hasNext())
		{
			Student st=(Student) itr.next();
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
		
		for (Student st1:al)
		{
			System.out.println(st1.rollno+" "+st1.name+" "+st1.age);
		}
		
		
		
	}

}


