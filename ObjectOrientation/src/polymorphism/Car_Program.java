package polymorphism;

public class Car_Program {	
	public static Car createNewCar() {
		return new SuperCar();
	}
	public static void main(String[] args) {
		Car a = new Car();
		System.out.println(a.drive());
		SuperCar s = new SuperCar();
		System.out.println(s.drive());
		System.out.println(s.superDrive());
		Car as = new SuperCar();
		System.out.println(as.drive());
		
		/**
		 * Polymorhpism is useful if you have more than one type of Car. 
		 * More insight at url: https://stackoverflow.com/questions/11064409/why-to-use-polymorphism
		 * Classes who inheritage can use methods of their SuperClass.
		 * If we write "Car as = new SuperCar();" it's still just a car while compiling.
		 * After this step, we are at runtime. At this point the program knows that instance "as" has the type SuperCar. -> sysout(as);
		 * For that reason, we can't use "SuperDrive()". The Class Car doesn't know SuperDrive();
		 * 
		 * The solution is converting variable "as" to a new variable with type SuperCar:
		 * This step is called "type casting"
		 */
		SuperCar as2 = (SuperCar) as;
		System.out.println(as2.superDrive());

		/**
		 * For the code below: 
		 * If you don't know whether a variable is a certain type or not, you can check with the method instanceof: 
		 * See line 5 ff. : switch SuperCar to Car (test it) and set it back.
		 */
		
		Car x = createNewCar();
		if(x instanceof SuperCar) {
			SuperCar x2 = (SuperCar) x;
			System.out.println(x2.superDrive());
			// short form without second variable: System.out.println(((SuperCar) x).SuperDrive());
		} else {
			System.out.println("x is no instance of the class SuperCar");
		}
	}
}
