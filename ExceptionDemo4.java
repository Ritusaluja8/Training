package day9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,result=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter two numbers");
		
		try {
			System.out.println("enter a value");
			a=scan.nextInt();
			System.out.println("enter a value");
			b=scan.nextInt();
		result=a/b;
		}
		catch(ArithmeticException e) {
			System.out.println("do not enter zero");
		}
		catch(InputMismatchException e) {        //input mismatch exception then import it
			System.out.println("enter only integer");
		}
		
		System.out.println("result is" + result);
		
		
		

	}

}
