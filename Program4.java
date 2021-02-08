package day10;
class LateException extends Exception
{
	String msg;
	public LateException(String msg) {
		super(msg);
		this.msg=msg;
		System.out.println("this is an example of checked custom exception");
		
	}
	
	
}
class StudentAttendancee
{
	void LoginTime(int time) throws LateException
	{
		if(time>9)
		{
			throw new LateException("you are absent");
		}
		else {
			System.out.println("you are present");
		}
	}
}

public class Program4 {

	public static void main(String[] args) throws LateException {
		// TODO Auto-generated method stub
		StudentAttendancee student = new StudentAttendancee();
		student.LoginTime(9);
      
	}

}
