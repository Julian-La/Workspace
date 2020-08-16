package constructor.inheritedBike;

public class Bike_Program {

	public static void main(String[] args) {
		BikeSuperClass standard = new BikeSuperClass("Standard");
		BikeSubmissiveClass special = new BikeSubmissiveClass("Special",12);
		System.out.println(standard.getBrand());
		System.out.println(special.getBrand());
		System.out.println(special.drive());
		

	}

}
