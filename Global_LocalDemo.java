package day5;

public class Global_LocalDemo {
	int a=10; //global variable
	void function1()
	{
		int x=2; //local variable
		System.out.println("value of x is" + x);
		System.out.println("value of a is"+ a);
	}
	void function2()
	{
		//System.out.println("value of x is" + x);
		System.out.println("value o a is " + a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Global_LocalDemo var=new Global_LocalDemo();
		var.function1();
		var.function2();

	}

}
