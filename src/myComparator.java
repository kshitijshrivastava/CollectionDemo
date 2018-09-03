import java.util.Comparator;


public class myComparator implements Comparator{
	
	public int compare(Object obj1, Object obj2)
	{
		String s1=obj1.toString();
		System.out.println("s1=" +s1);
		String s2=obj2.toString();
		System.out.println("s2=" +s2);
		int s1Lenght = s1.length();
		int s2Length = s2.length();
				
		if (s1Lenght>s2Length)
		{
			return 1;
		}
		else if (s1Lenght<s2Length)
		{
			return -1;
		}
		else
		{
			return s1.compareTo(s2);
		}
		
	}

}
