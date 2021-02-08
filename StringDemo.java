package day10;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//immutable
		String name="Ritu";
		System.out.println("name is" + name);
		name.concat("Saluja");
		System.out.println("name is" + name);
		name=name.concat("Saluja2");
		System.out.println("name is" + name);
		
		//mutable string buffer
		StringBuffer sb=new StringBuffer("Ritu");
		System.out.println("name is" + sb);
		sb.append("Saluja");
		System.out.println("name is" + sb);
		
		
		
		
		
	}

}
