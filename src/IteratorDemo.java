import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;


public class IteratorDemo {

	public static void main(String[] args) 
	{
		
		ArrayList al = new ArrayList();
		
		
		/*for (int i=0;i<10;i++)
		{
		   al.add(i);
			
		}
		
		for (int i=0;i<10;i++)
		{
			System.out.println(al.get(i));
			
		}
		
		System.out.println(al);*/
		
		LinkedList ll = new LinkedList();
	    ll.add(10);
	    ll.toArray();
	
	
		for (int i=0;i<10;i++)
		{
		   ll.add(i);
			
		}
		
		for (int i=0;i<10;i++)
		{
			System.out.println(ll.get(i));
			
		}
		
		System.out.println(ll);
		
		
	
		
		Iterator itr = al.iterator();
		
		while (itr.hasNext())
		{
			Integer n = (Integer) itr.next();
			if (n%2==0)
			{
				itr.remove();
			}
			
		}
		System.out.println(ll);
	}
	

}
