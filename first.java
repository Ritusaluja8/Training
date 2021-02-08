package day8;
abstract class Bank
{
	abstract void RateOfInterest();
	abstract void MinimumBalance();
	void display()
	{
		System.out.println("every saturday is fixed day off");
	}
	
}
class SBI extends Bank{
	void RateOfInterest() {
		System.out.println("4%");
	}
	void MinimumBalance() {
		System.out.println("10000");
	}
}

class Axis extends Bank{
	void RateOfInterest() {
		System.out.println("5%");
	}
	void MinimumBalance() {
		System.out.println("5000");
}

class Icici extends Bank{
	void RateOfInterest() {
		System.out.println("6%");
	}
	void MinimumBalance() {
		System.out.println("8000");
	}
}
public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b= new SBI();
		b.display();
		b.MinimumBalance();
		b.RateOfInterest();
		Bank c= new Axis();
		c.display();
		c.MinimumBalance();
		c.RateOfInterest();
		Bank d= new Icici();
		d.display();
		d.MinimumBalance();
		d.MinimumBalance();
	}
}


