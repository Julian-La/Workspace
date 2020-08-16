package constructor.abstractClass;

public class Bike extends AbstractClassExample{
private String brand;
private int number;
public Bike(String brand, int number) {
	this.brand = brand;
	this.number = number;
}

@Override
public void drive() { // Without implementing "drive(){}" no chance.
	// TODO Auto-generated method stub
	
}
public void driveToBerlin() { // You don't need to implement driveToBerlin(){}.
	drive();
}
}
