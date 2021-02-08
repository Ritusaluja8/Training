package day9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]=new String[5];
		int a,b,result=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter two numbers");
		
		try {
			System.out.println("enter a value");
			a=scan.nextInt();
			System.out.println("enter a value");
			b=scan.nextInt();
		result=a/b;
		//String name=null;
		//System.out.println(name.length());
		}
		//catch(ArithmeticException | NullPointerException obj) {
			//System.out.println("do not enter zero");
		//}
		catch(Exception e) {        //input mismatch exception then import it
			System.out.println("enter only integer");
			e.printStackTrace();
		}
		
		System.out.println("result is" + result);
		
		
		

	}



		
	}


