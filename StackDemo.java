package day13;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s=new Stack();
		s.add(1);
		s.push(2);
		s.push(3);
		System.out.println("elements in stack" + s);
		System.out.println("top element in stack is" + s.peek());
		System.out.println("elements in stack are" +s);
		s.remove(2);
		System.out.println("removing the top element " + s.pop());
		System.out.println("elements in stack" + s);
		System.out.println("top element in stack" +s.peek());
		System.out.println("removing the top element " + s.pop());
		System.out.println("elements in stack" + s);
		System.out.println("removing the top element " + s.pop());
		System.out.println("elements in stack" + s);
	}

}
