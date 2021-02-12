package day13;

import java.util.HashMap;

public class MapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String>hm2=new HashMap<String,String>();
		hm2.put("sachin", "he is opening batsman");
		hm2.put("raina", "he is a vice captain");
		hm2.put("bumrah", "he is opening bowler");
		System.out.println("hashmap: " + hm2);
		System.out.println("get the value from key =" + hm2.get("bumrah"));
		hm2.replace("raina", "he is a vice captain");
		System.out.println("hashmap: " + hm2);
		hm2.remove("bumrah");
		System.out.println("hashmap after removing:" +hm2);
	    System.out.println("it returns all the keys" + hm2.keySet());
	    System.out.println("get all tha values" +  hm2.values());
	    
	}

}
