package day5;
class Student{
	int id;
	String name;
	static String CompanyName="fujitsu Consulting India";
	void display() {
		System.out.println("ID is" +id);
		System.out.println("Name is" +name);
		System.out.println("Company Name is" +CompanyName);
	}
	
}

public class StaticDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1=new Student();
s1.id=1;
s1.name="Ritu Saluja";
Student s2=new Student();
s2.id=2;
s2.name="Neha Verma";
Student s3=new Student();
s3.id=3;
s3.name="Swati Sahu";
s1.display();
s2.display();
s3.display();

	}

}
