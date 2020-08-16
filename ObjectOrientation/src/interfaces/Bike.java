package interfaces;

public class Bike implements Drivable {
	private String brand;
	public Bike(String brand) {
		this.brand=brand;
	}
	public void drive() {
		System.out.println("Bike.drive()");
	}
}
