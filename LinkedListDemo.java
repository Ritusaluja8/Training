package day13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l2=new ArrayList();
		l2.add(2);
		LinkedList l1=new LinkedList();
		l1.add(1);
		l1.add(23);
		l1.addFirst(30);
		l1.addLast(45);
		l1.add(67);
		System.out.println("linked list" + l1);
		l1.removeFirst();
		System.out.println("linked list" + l1);
		l1.removeLast();
		System.out.println("linked list" + l1);
		
		

	}

}
