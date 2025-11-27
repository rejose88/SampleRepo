package exceptionhandling;

public class ThrowExample {

	public static void main(String[] args) {
		int age=15;
		if(age>=18)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			//System.out.println("Not eligible!!!");
			throw new NumberFormatException("Not eligible for voting!!!");
		}
		

	}

}
