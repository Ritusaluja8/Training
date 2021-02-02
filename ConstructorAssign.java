package day5;
class Car{
	int Model_Year,SeatCapacity;
	private String Brand,EngineType,StringType;
	Car(int Model_Year, int SeatCapacity, String Brand, String EngineType){
		this.Model_Year=Model_Year;
		this.SeatCapacity=SeatCapacity;
		this.Brand=Brand;
		this.EngineType=EngineType;
		this.StringType=StringType;
	}
	void display()
	{
		System.out.println("model year is" + Model_Year);
		System.out.println("Seat Capacity is" + SeatCapacity);
		System.out.println("brand is" + Brand);
		System.out.println("Engine Type is" + EngineType);
		if(SeatCapacity<9)
		{
			System.out.println("this is a car");
		}
		else
			System.out.println("this is a bus");
	}
	
}

public class ConstructorAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c= new Car(2018,8,"Honda","Petrol");
		c.display();

	}

}
