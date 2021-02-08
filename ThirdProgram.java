package day10;
class LateException extends RuntimeException
{
	String msg;
	public LateException(String msg) {
		super(msg);
		this.msg=msg;
		System.out.println("this is an example of custom exception");
		
	}
	// you can also print string message by toString method
	/*@Override
	public String toString() {
		return "LateException [msg=" + msg + "]";
	} */
	
}
	class StudentAttendance
	{
		void LoginTime(int time)
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
	


public class ThirdProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	StudentAttendance studentattendance = new StudentAttendance();	
	studentattendance.LoginTime(12);

	}

}
