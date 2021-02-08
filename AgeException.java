package ExceptionAssignment;

public class AgeException extends Exception 
{
	String msg;

	public AgeException(String msg) {
		super();
		this.msg = msg;
		System.out.println("this is an example of checked custom exception");
	}
	

}
