package exceptionhandling;

public class Example {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		try
		{
			int c=a/b;
		}
		finally
		{
			System.out.println("Mandatory code");
		}
		/*catch(ArithmeticException e)
		{
			b=2;
			int d=a/b;
			System.out.println(d);
			System.out.println(e);
		} */
		
		

	}

}
