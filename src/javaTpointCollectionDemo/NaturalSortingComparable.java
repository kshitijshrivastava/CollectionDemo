package javaTpointCollectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Person3 implements Comparable<Person3>{
	private String name;
	
	public Person3(String name)
	{
		this.name=name;
	}
	
	public String toString()
	{
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person3 other = (Person3) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Person3 person) {
		
		int len1= name.length();
		int len2= person.name.length();
		
		if (len1>len2)
		{
			return 1;
		}
		if (len1<len2)
		{
			return -1;
		}
		else
			//return 0;
			return name.compareTo(person.name);
		
	}
}

public class NaturalSortingComparable {

	public static void main(String[] args) {
	
		List<Person3> list = new ArrayList<Person3>();
		Set<Person3> set = new TreeSet<Person3>();
		
		
		addElements(list);
		addElements(set);
		Collections.sort(list);
		System.out.println("Printing elements of Array List");
		displayElements(list);
		System.out.println("*******************");
		System.out.println("Printing elements of Tree Set");
		displayElements(set);
	}
	
	public static void addElements(Collection<Person3> col)
	{
		col.add(new Person3("Arya"));
		col.add(new Person3("Zoe"));
		col.add(new Person3("Curie"));
		col.add(new Person3("Babbar"));
		col.add(new Person3("Tiger"));
		
	}
	
	public static void displayElements(Collection<Person3> col)
	{
		for(Person3 str:col)
		{
			System.out.println(str);
		}
		
	}

}
