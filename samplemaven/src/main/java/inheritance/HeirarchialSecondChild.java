package inheritance;

public class HeirarchialSecondChild extends HeirarchialParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeirarchialSecondChild obj=new HeirarchialSecondChild();
		obj.printSecondChild();
		obj.printParent();

	}
	public void printSecondChild()
	{
		System.out.println("Inside Second Child");
	}

}
