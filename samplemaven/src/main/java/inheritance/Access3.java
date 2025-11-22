package inheritance;

import accessmodifiers.Access1;

public class Access3 extends Access1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access1 obj= new Access1();    // creating obj for the Access1 class where the methods are present.
		obj.display1();
		
		Access3 obj1 =new Access3();  // creating obj for the child class to call parent class methods
		obj1.display1();
		obj1.display3();
		
		

	}

}
