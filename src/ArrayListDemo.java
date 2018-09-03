import java.util.ArrayList;


public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList();
		al.add("A");
		al.add(10);
		al.add("B");
		al.add("null");
		al.add(10);
		al.add("B");
		al.add("null");
		System.out.println(al);
		//al.remove(2);
		//System.out.println(al);
		//al.removeAll(al);
		//System.out.println(al);
		al.add(5, 7);
		System.out.println(al);
		
		
		
		
		

	}

}
