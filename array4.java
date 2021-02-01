package day3;

import java.util.Scanner;

public class array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the length of array");
		int lenth=scan.nextInt();
		int[] marks= {45,78,90,60,30};
		int max=marks[0];
		int min=marks[0];
		for(int i=1;i<marks.length;i++)
		{
			if(max < marks[i]){
		        max = marks[i];
		      }else if(min > marks[i]){
		        min = marks[i];
		      }		   		   
		    }
		System.out.println("Maximum number = " +max);
		System.out.println("Minimum number = " +min); 
		}
		}