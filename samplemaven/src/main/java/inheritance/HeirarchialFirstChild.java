package inheritance;

public class HeirarchialFirstChild extends HeirarchialParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeirarchialFirstChild obj=new HeirarchialFirstChild();
		obj.printParent();
		obj.printFirstChild();
		

	}
	public void printFirstChild()
	{
		System.out.println("Inside First Child");
	}

}
