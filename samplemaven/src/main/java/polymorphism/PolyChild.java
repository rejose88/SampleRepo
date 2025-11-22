package polymorphism;

public class PolyChild extends PolyParent {
	
	public void print(int a,int b)
	{
		System.out.println(a-b);
		super.print(5,3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolyChild obj=new PolyChild();
		obj.print(8, 4);

	}

}
