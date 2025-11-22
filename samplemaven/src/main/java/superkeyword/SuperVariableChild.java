package superkeyword;

public class SuperVariableChild extends SuperVariableParent {
	String s="Red";
	public void print()
	{		
		System.out.println(s);
		System.out.println(super.s);
						
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperVariableChild obj= new SuperVariableChild();
		obj.print();
	}

}
