package day5;
class 	Product{
	int price,id;
	String name,brand;
	public Product(int price,int id,String name,String brand)
	{
		this.price = price;
		this.id = id;
		this.name = name;
		this.brand = brand;
		System.out.println("constructor having 4 parameter is called");
	}
	public Product(int price, int id, String name)
	{
		this.price = price;
		this.id = id;
		this.name = name;
		System.out.println("constructor having 3 parameter is called");
	}
	public Product(int price,String name)
	{
		this.price=price;
		this.name=name;
		System.out.println("constructor having 2 parameter is called");
	}
	public Product(String name)
	{
		this.name=name;
		System.out.println("constructor having 1 parameter is called");
	}
	void display() {
		System.out.println("price of the product is"+ " " + price);
		System.out.println("Name of the product is" + " " + name);
		System.out.println("ID of the product is"+" " +id);
		System.out.println("Brand of the product is" + " " + brand);
	}
}

public class ConstructorAssign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p=new Product(50000,1,"Mobile","Samsung");
		p.display();
	}

}
