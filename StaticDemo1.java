package day5;

public class StaticDemo1 {
int a=10; //global non-static variable
static int b=20; //global static variable
void disp1()

{
	System.out.println("this is first static method");
}
void disp2()
{
	System.out.println("this is second static method");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(StaticDemo1.b);
// StaticDemo1.disp1();

	}

}
