package day13;

import java.util.ArrayList;

public class program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList o1=new ArrayList();
		o1.add("sachin");
		o1.add(10);
		o1.add("rahul");
		System.out.println("elements of o1 " + o1);
		o1.add(1,"java");
		System.out.println("elements of o1 " + o1);
		o1.set(2, "dravid");
		System.out.println("elements of o1 " + o1);
		o1.clear();
		System.out.println("elements of o1 " + o1);
		
		
		

	}

}
