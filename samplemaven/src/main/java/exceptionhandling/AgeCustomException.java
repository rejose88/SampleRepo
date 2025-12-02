package exceptionhandling;

public class AgeCustomException {

	public static void main(String[] args) throws AgeException {
			int age=15;
			if(age>=18)
			{
				System.out.println("Eligible");
			}
			else
			{
				
				throw new AgeException("Age exception!!!");
			}
			

		}

	}


