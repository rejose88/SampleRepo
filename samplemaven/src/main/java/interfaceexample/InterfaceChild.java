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
	
	public static void main(String[] args) {
		InterfaceChild obj =new InterfaceChild();
		obj.display();
		obj.print();
	}

}
