package javaTpointCollectionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Person1{
	int id;
	String name;

	Person1(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return "Id ->"+id+" : "+"Name-> "+name;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

 class SortByName implements Comparator<Person1>
{

	@Override
	public int compare(Person1 p1, Person1 p2) {
		// TODO Auto-generated method stub
		return p1.getName().compareTo(p2.getName());
	}
}
 
 class SortByid implements Comparator<Person1>
{

	@Override
	public int compare(Person1 p1, Person1 p2) {
		// TODO Auto-generated method stub
		if(p1.getId()>p2.getId())
		{
			return 1;
		}
		else if (p1.getId()<p2.getId())
		{
			return -1;
		}
		return 0;
		
	}
}

public class SortingListUserDefinedClass {

	public static void main(String[] args) {
	Person1 p1 = new Person1(1, "Zoe");
	Person1 p2 = new Person1(4, "Bob");
	Person1 p3 = new Person1(3, "Rob");
	Person1 p4 = new Person1(2, "Adam");
	
	ArrayList<Person1> personList = new ArrayList<Person1>();
	
	personList.add(p1);
	personList.add(p2);
	personList.add(p3);
	personList.add(p4);
	
	
	for(Person1 per:personList)
	{
		System.out.println(per);
	}
	////// Sorting by Name//////
	Collections.sort(personList, new SortByName() );
	
	System.out.println("**********************");
	System.out.println("Sorting by Name");
	
	
	for(Person1 per:personList)
	{
		System.out.println(per);
	}

	
	
	Collections.sort(personList, new SortByid() );
	
	System.out.println("**********************");
	System.out.println("Sorting by Id");
	
	
	for(Person1 per:personList)
	{
		System.out.println(per);
	}

	}
}

