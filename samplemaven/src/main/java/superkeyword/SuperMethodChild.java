package superkeyword;

public class SuperMethodChild extends SuperMethodParent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperMethodChild obj=new SuperMethodChild();
		obj.printChild();

	}
	
	public void printChild()
	{
		System.out.println("Printing super child");
		super.printParent();
	}

}
