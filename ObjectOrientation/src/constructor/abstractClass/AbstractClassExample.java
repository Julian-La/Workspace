package constructor.abstractClass;
/**
 * Abstract classes don't need a defined function "{}". 
 * If you wanna implement this. Your target class needs to be extended by your abstract class. 
 * Abstract classes are used to make sure your target class implements a function for e.g. "drive()".
 * It's used much less than interfaces.
 * 
 * Difference between interfaces: 
 * A interface only has final variables and you can't define something as private. 
 * You can have more Interfaces for one target class. In abstract classes you can/can't do these things. 
 * For abstract classes you need to use "extends" at the target. For interfaces you use "implements". 
 * By abstract classes you need to write "abstract" before a method to force it to a target.  
 */
public abstract class AbstractClassExample {
	abstract public void drive();
	public void driveToBerlin() {
	drive();
	/**
	 * Classes which extend with "AbstractClassExample" need to implement a "drive()" method.
	 * Please see class "Bike.java" line 10-15.
	 */
	}
}
