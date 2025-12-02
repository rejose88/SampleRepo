package collections;

import java.util.HashSet;
import java.util.Set;

public class NonGenesricSetMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet s= new HashSet();
		
				//add()
				s.add("Green");
				s.add("violet");
				s.add(1000);
				s.add("???");
				s.add("null");
				s.add("null");
				System.out.println("Set s :"+s);
				
				Set <String> a= new HashSet<String>();
				a.add("blue");
				a.add("green");
				a.add("!@#$%^&*");
				a.add(null);
				System.out.println("Set a :"+a);
				
				//addAll()
				s.addAll(a);
				System.out.println("s+a   :"+s);
				
				//contains()
				System.out.println(s.contains("green"));
				
				//containsAll
				System.out.println("s.Conatins all a :"+s.containsAll(a));
				
				//isEmpty()
				System.out.println(a.isEmpty());
				
				//remove()
				s.remove("null");
				System.out.println("After remove  : "+s);
				
				//removeAll()
				s.removeAll(a);
				s.removeAll(a);
				System.out.println("After removeAll a: "+s);
				
				//size()
				System.out.println(s.size());
				
				//clear()
				a.clear();
				System.out.println(a);
		
	}

}
