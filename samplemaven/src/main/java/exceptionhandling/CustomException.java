package exceptionhandling;

public class CustomException {

	public static void main(String[] args) throws VotingException   {
		int age=15;
		if(age>=18)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			//System.out.println("Not eligible!!!");
			throw new VotingException("Not eligible for voting!!!");
		}
		

	}

}
