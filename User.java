package ExceptionAssignment;

public class User {
	void checkAge(int age) throws AgeException
	{
		if(age<18)
		{
			throw new AgeException("you cannot vote");
		}
		else {
			System.out.println("you can vote");
		}
	}

}
