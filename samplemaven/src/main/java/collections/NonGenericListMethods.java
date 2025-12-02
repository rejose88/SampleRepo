package collections;

import java.util.ArrayList;

public class NonGenericListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l = new ArrayList();
		
		//add()
		l.add("One");
		l.add(1);
		l.add("2");
		l.add(1);
		l.add("&&");
	
		System.out.println(l);
		
		//get()
		System.out.println(l.get(0));
		
		//set()
		l.set(2, 100);
		System.out.println(l);
		
		//indexOf()
		System.out.println("Index of && is "+l.indexOf("&&"));
		
		//lastIndexOf()		
		System.out.println("Last index of 1 is: "+l.lastIndexOf(1));
		
		//remove()
		l.remove(3);
		System.out.println(l);
		
		//contains()
		System.out.println("Contains && ? :"+l.contains("&&"));
		
		//isEmpty()
		System.out.println("Is Empty? :"+l.isEmpty());
		
		//size()
		System.out.println("size of l is:"+l.size());
			

	}

}
