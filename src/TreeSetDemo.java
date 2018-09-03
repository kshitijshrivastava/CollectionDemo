import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;


public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet t = new TreeSet(new myComparator());
		t.add("A");
		t.add(new StringBuffer("ABC"));
		t.add(new StringBuffer("ABCD"));
		t.add("X");
		t.add("A");
		t.add("XX");
		System.out.println(t);
		
		

	}

}
