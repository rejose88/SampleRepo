package interfaceexample;

public interface InterfaceParent {
	
	public void display();
	public void print();
	
	default void interfaceParentMethod()
	{
		int a=0;System.out.println("Inside interfaceParentMethod");
	}
	
	static void staticMethod()
	{
		System.out.println("Inside static method of interface");
	}
	
	
	

}
