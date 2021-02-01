/**
 * 
 */
package Day2;

import java.util.Scanner;

/**
 * @author Lenovo
 *
 */
public class conditional_statement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if condition
		/*int i=25;
		if(i>20)
		System.out.println("hi"); */
		// if-else condition
	/*	System.out.println("enter your age");
		Scanner scan= new Scanner(System.in);
		int age= scan.nextInt();
		System.out.println("age is" + age);
		System.out.println("enter your salary");
		int salary= scan.nextInt();
		System.out.println("salary is" + salary);
		if(age>25 && salary>35000)
		{
			System.out.println("You can apply for loan");
		}
		else
			System.out.println("You cannot apply or loan"); */
		      // nested if
		 /* int age=17;
		int salary=5000;
		if(age>18)
		{
			if(salary>35000) {
				System.out.println("you cannot apply for loan");
			}
			else {
				System.out.println("salary is low");
			}
		}
		else
			{
				System.out.println("age is low");
			}
		} */
		       //switch statement
		System.out.println("press\n 1. Deposit\n 2. Withdraw\n 3. Balance check");
		Scanner scan=new Scanner(System.in);
		int choice=scan.nextInt();
		if(choice==1)
		{
			System.out.println("You are doing deposit");
		}
		else if(choice==2)
		{
			System.out.println("You are doing withdraw");
		}
		else if(choice==3)
		{
			System.out.println("You are checking balance");
		}
		else {
			System.out.println("Invalid option");
		}

	}

}
