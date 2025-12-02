package collections;

import java.util.ArrayList;
import java.util.List;

public class GenericListMethods {

	public static void main(String[] args) {
		
		List <String> s= new ArrayList<String> ();
		
		//add
		s.add("Red");
		s.add("Green");
		s.add("Yellow");
		s.add("Red");
		System.out.println(s);
		
		//get method
		String g=s.get(1);
		System.out.println(g);
		
		//set
		s.set(2, "Pink");
		System.out.println(s);
		
		//indexOf
		System.out.println("Index of Red is :"+s.indexOf("Red"));
		
		//lastIndexxOf
		System.out.println("Last index of Red is:"+s.lastIndexOf("Red"));
		
		//remove
		s.remove(3);
		System.out.println(s);
		System.out.println(s.remove("Red"));
		System.out.println(s);
		
		//conatins
		System.out.println("contains Blue? "+s.contains("Blue"));
		
		//isEmpty
		System.out.println("empty? "+s.isEmpty());
		
		//size
		System.out.println("Size of list   :  "+s.size());

	}

}
