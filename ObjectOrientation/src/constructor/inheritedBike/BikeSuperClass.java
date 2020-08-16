package constructor.inheritedBike;

public class BikeSuperClass {
	public String drive() {
		return "Turbo can be activated.";
	}
	private String brand;
	public BikeSuperClass(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	
}
