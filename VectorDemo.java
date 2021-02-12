package day13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		Vector v2=new Vector();
		v.add(2);
		//LinkedList l1=new LinkedList();
		v2.add(1);
		v2.add(23);
		v2.addElement(30);
		v2.addElement(45);
		v2.add(67);
		System.out.println("linked list" + v2);
		v2.removeElement(30);
		System.out.println("linked list" + v2);
		v2.removeElement(23);
		System.out.println("linked list" + v2);
		
		

	}

}
