/**
 * 
 */
package Day2;

import java.util.Scanner;

/**
 * @author Lenovo
 *
 */
public class Marks_User {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sub1,sub2,sub3;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter mark of sub 1");
		 sub1= scan.nextInt();		
		System.out.println("Enter mark of sub 2");
		 sub2= scan.nextInt();
		System.out.println("Enter mark of sub 3");
	    sub3= scan.nextInt();
		int marks=(sub1+sub2+sub3)/3;
		if(marks>90 || marks==100)
		{
			System.out.println("Your grade is A");
		}
		else if(marks>80 || marks<89)
		{
			System.out.println("Your grade is B");
		}
		else if (marks>70 || marks<79)
		{
			System.out.println("your grade is C");
		}
		else 
			System.out.println("yourgrade is D");
		

	}

}
