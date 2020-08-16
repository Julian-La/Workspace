package constructor.inheritedBike;

public class BikeSubmissiveClass extends BikeSuperClass {
	private int numberOfCylinder;
	public BikeSubmissiveClass(String brand, int numberOfCylinder) {
		super(brand);
		super.drive();
		this.numberOfCylinder = numberOfCylinder;
	}

}
