package day10;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s1="sachin";
       String s2="sachin";
       String s3= "ravi";
       String s4=new String("sachin");
       String s5=new String("sachin");
       System.out.println(s1.length());
       System.out.println(s1.indexOf('i'));
       System.out.println(s1.charAt(3));
       System.out.println(s1==s2);
       System.out.println(s3==s4);
       System.out.println(s5==s1);
       System.out.println(s1.equals("sam"));
       System.out.println(s1.equals("sachin"));
       System.out.println(s4.equals(s5));
       System.out.println(s3.equals("Ravi"));
       System.out.println(s4.equalsIgnoreCase(s5));
	}

}
