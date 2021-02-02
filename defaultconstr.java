package day5;
class Things
{
	int id;
	int price;
	String name;
	Things()
	{
		System.out.println("this is a default constructor");
	}
	void disp()
	{
		System.out.println("this is a method");
		System.out.println("id is" + id);
		System.out.println("name is"+ name);
		System.out.println("price is" +price);
	}
}

public class defaultconstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Things t=new Things();
		t.disp();
	}

}
