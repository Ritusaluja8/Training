package day8;

public class CarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car=new Car(1965,"Mobile");
		car.accelerate();
		System.out.println(car.getSpeed());
		car.accelerate();
		System.out.println(car.getSpeed());
		car.accelerate();
		System.out.println(car.getSpeed());
		car.accelerate();
		System.out.println(car.getSpeed());
		car.accelerate();
		System.out.println(car.getSpeed());
		car.brake();
		System.out.println(car.getSpeed());
		car.brake();
		System.out.println(car.getSpeed());
		car.brake();
		System.out.println(car.getSpeed());
		car.brake();
		System.out.println(car.getSpeed());

		car.brake();
		System.out.println(car.getSpeed());

		car.brake();
		System.out.println(car.getSpeed());


	}

}
