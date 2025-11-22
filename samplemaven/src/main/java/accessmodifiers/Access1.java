package accessmodifiers;

public class Access1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub   
		Access1 obj=new Access1();
		obj.display1();
		obj.display2();
		obj.display3();
		obj.display4();

	}
	public void display1(){
		System.out.println("Public Method");
	}
	private void display2()
	{
		System.out.println("Private Method");
	}
	protected void display3() {
		System.out.println("Protected method");
	}
	void display4()
	{
		System.out.println("Default method");
	}

}
