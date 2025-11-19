package inheritance;

public class MultiLevelChild extends MultiLevelParent {
	private void printChild()
	{
		System.out.println("Inside Child Class");
	}
	
	public static void main(String[] args) {
		MultiLevelChild obj=new MultiLevelChild();
		obj.printChild();
		obj.printParent();
		obj.printGrandParent();		
	}

}
