package constructor.abstractClass;

public class Bike extends AbstractClassExample{
private String brand;
private int number;
public Bike(String brand, int number) {
	this.brand = brand;
	this.number = number;
}
Bike b = new Bike("BMW",150); // Just for testing. 
public void drive() {
	System.out.println("lol");
}
public void driveToBerlin() { // Without implementing "drive(){}" no chance.  
	drive();
}
}
