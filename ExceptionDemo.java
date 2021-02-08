package day9;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		System.out.println("Start from chennai");
		System.out.println("50 km");
		System.out.println("100 km");
		try {
		System.out.println(1/0);
		System.out.println("welcome to java programming");
		a[7]=22;
		System.out.println("welcome to exception handling");
		}
		catch(ArithmeticException ex) {
			System.out.println("dont print 0");
		}
		catch(ArrayIndexOutOfBoundsException exc) {
			System.out.println("array index out of bound");
		}
		
		System.out.println("200 km");
		System.out.println("300 km");
		System.out.println("Reached Bangalore");
		
		
	}

}
