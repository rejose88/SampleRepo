package interfaceexample;

public class InterfaceChild implements InterfaceParent {

	@Override
	public void display() {
		System.out.println("Inside Display");
		
	}

	@Override
	public void print() {
		System.out.println("Inside Print");
		
	}
	
	public void newPrint()
	{
		System.out.println("Inside newPrint method");
	}
	
	public static void main(String[] args) {
		InterfaceChild obj =new InterfaceChild();
		
		obj.display();
		obj.print();
		obj.newPrint();
		
		//reference creation   // Using reference creation object, we can call only the methods in the Interface.
		InterfaceParent obj1= new InterfaceChild();
		obj1.display();
		obj1.print();
		obj1.interfaceParentMethod();
		InterfaceParent.staticMethod(); // static method can be called using interface name only.
	
	}
	
	

}
