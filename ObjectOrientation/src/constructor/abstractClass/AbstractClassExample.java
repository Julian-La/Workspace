package constructor.abstractClass;
/**
 * Abstract classes don't need a defined function "{}". 
 * If you wanna implement this. Your target class needs to be extended by your abstract class. 
 * Abstract classes are used to make sure your target class implements a function for e.g. "drive()".
 * It's used much less than interfaces.
 * 
 * Difference between interfaces: 
 * Only the drive(){} implementation per class should vari. You can export driveToBerlin(){} and use it universal.
 */
public abstract class AbstractClassExample {
	abstract public void drive();
	public void driveToBerlin() {
	drive();
	/**
	 * Classes how extend with "AbstractClassExample" need to implement a "drive()" method.
	 * Please see class "Bike.java" line 10-15.
	 */
	}
}
