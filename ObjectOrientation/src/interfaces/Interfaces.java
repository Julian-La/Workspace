package interfaces;

public class Interfaces {
	public void m(Drivable c) { // You can fill the header with a method.
		c.drive();				// Instances of the interface Drivable have the method drive().
	}							// No further usage here.
	
	public static void main(String[] args) {
		Car car = new Car("BMW");
		Bike bike = new Bike("BMX");
		car.drive();
		bike.drive();
	}

}
