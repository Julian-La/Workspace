package exceptions;

public class Car_Program {

	public static void main(String[] args) {
			Car c = new Car(0);
			
			try {
				c.drive();
			} catch (CarDriveException e) {
				System.out.println("Drive-Methode hat nicht geklappt! " + e.getMessage());
			}
			// you can advance this command by adding another catch(className e){}.
			System.out.println("fertig!");
/**
 * CarDriveException only handles "hp == 0" defined in class Car.java. CarDriveException is just a class to fill in for that specific szenario. 
 * We want that to be catched because it's a natural failure. 
 * On the other hand, we don't want to handle ArithmeticExceptions "/O". They are programming failures.  
 */
	}

}
