package interfaces;

public class Bike implements Drivable {
	private String brand;
	public Bike(String t) {
		this.brand=t;
	}
	public void drive() {
		System.out.println("Bike.drive()");
	}
}
