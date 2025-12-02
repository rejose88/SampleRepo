package collections;

import java.util.HashSet;
import java.util.Set;

public class GenericSetMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set <String> s= new HashSet<String> ();		
		
		//add()
		s.add("Green");
		s.add("violet");
		s.add("indigo");
		System.out.println(s);
		
		Set <String> a= new HashSet<String>();
		a.add("blue");
		a.add("green");
		a.add("orange");
		System.out.println(a);
		
		//addAll()
		s.addAll(a);
		System.out.println(s);
		
		//contains()
		System.out.println(s.contains("green"));
		
		//containsAll
		System.out.println(s.containsAll(a));
		
		//isEmpty()
		System.out.println(a.isEmpty());
		
		//remove()
		s.remove("indigo");
		System.out.println("After remove  : "+s);
		
		//removeAll()
		s.removeAll(a);
		System.out.println(s);
		
		//size()
		System.out.println(s.size());
		
		//clear()
		a.clear();
		System.out.println(a);
		

	}

}
