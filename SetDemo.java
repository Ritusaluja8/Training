package day13;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet h=new HashSet();
		h.add("java");
		h.add("sachin");
		h.add("bhaskar");
		h.add(45);
		h.add("rahul");
		h.add(15);
		System.out.println("hashset element own order" + h);
		// linked hash set
		LinkedHashSet lh=new LinkedHashSet();
		lh.add("java");
		lh.add("sachin");
		lh.add("bhaskar");
		lh.add(45);
		lh.add("rahul");
		lh.add(15);
		System.out.println("linked hashset element own order" + lh);
		// tree set
		TreeSet ts=new TreeSet();
		ts.add("java");
		ts.add("sachin");
		ts.add("bhaskar");
		ts.add(45);
		ts.add("rahul");
		ts.add(15);
		System.out.println("hashset element own order" + ts);
		
		

	}

}
