package day13;
import java.util.HashMap;
public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm=new HashMap();
		hm.put(1, "sachin");
		hm.put("name", "rahul");
		System.out.println(hm);
		HashMap<Integer,String> hm1=new HashMap<Integer,String>();
		HashMap<String,String>hm2=new HashMap<String,String>();
		hm2.put("sachin", "he is opening batsman");
		hm2.put("raina", "he is a vice captain");
		hm2.put("bumrah", "he is opening bowler");
		System.out.println("hashmap: " + hm2);
		

	}

}
