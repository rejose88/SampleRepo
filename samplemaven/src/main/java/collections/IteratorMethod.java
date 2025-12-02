package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorMethod {

	public static void main(String[] args) {
		
		Set <String> s= new HashSet<String> ();		
		
		s.add("Green");
		s.add("violet");
		s.add("indigo");
		System.out.println(s);
		
		Iterator it =s.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		it.remove();
		System.out.println(s);
	}

}
