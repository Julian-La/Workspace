package interfaces;

public class Car implements Drivable {
	private String brand;
	public Car(String brand) {
		this.brand = brand;
	}
	public void drive() {
		System.out.println("Car.drive()");
	}
}
