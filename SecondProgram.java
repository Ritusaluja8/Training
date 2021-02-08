package day10;
class Attendance
{
	void loginTime(int time)
	{
		if(time>9)
		{
			throw new ArithmeticException("you are absent");
		}
		else
		{
			System.out.println("you are absent");
		}
	}
}

public class SecondProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Attendance attendance = new Attendance();
		attendance.loginTime(10);

	}

}
