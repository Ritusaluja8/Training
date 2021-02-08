package day9;

import java.util.Scanner;

public class ExceptionDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,index,element;
		System.out.println("enter the size");
		Scanner scan = new Scanner(System.in);
		size=scan.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("elements of array are" + arr[i]);
		}
		try {
			System.out.println("enter the index");
			index=scan.nextInt();
			element=arr[index];
			System.out.println("value is" + element);
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("enter a valid index from 0 to 4");
		}
		
		

	}

}
