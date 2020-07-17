package exceptions;

public class Car {
	private int hp;

	public Car(int hp) {
		this.hp = hp;
	}
	
	public void drive() throws CarDriveException {
		if (hp == 0) {
			throw new CarDriveException("Das Auto hat keinen Motor");
		}
		System.out.println(hp / 0);
		System.out.println("drive()");
	}
}