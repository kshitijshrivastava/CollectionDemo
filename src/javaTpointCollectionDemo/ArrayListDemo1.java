package javaTpointCollectionDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Ksh");
		al.add("Ani");
		al.add("Rim");
		al.add("Rim");
		
		Iterator itr = al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		for(String str:al)
		{
			System.out.println(str);
		}
		
		
		

	}

}
