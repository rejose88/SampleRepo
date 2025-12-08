package abstraction;

public abstract class AbstractParent {   // parent l
	public abstract void print();
	public abstract void display();
	
	
	public AbstractParent()
	{
		System.out.println("Inside Abstract class constructor");
	}

	public void abstractParentMethod()
	{
		System.out.println("Inside abstractParentMethod ");
	}
}
