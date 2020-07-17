package polymorphism;

public class SuperCar extends Car {
public String superDrive() {
	return "superDrive()";
	}
/**
 * To override a method of a superclass you need to notify by adding "@override"
 * Without overwriting, "Car as = new SuperCar()" will return "drive()" when as.drive() is used. 
 */
@Override
public String drive() {
	return "changedDrive()";
}
}
