package interfaces;

public class Interfaces {
	public void m(Drivable c) {
		c.drive();
	}
	
	public static void main(String[] args) {
		Car car = new Car("BMW");
		Bike bike = new Bike("BMX");
		car.drive();
		bike.drive();
	}

}
