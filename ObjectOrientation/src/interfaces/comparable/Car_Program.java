package interfaces.comparable;

import java.util.Arrays;

public class Car_Program {

	public static void main(String[] args) {
			Car[] cars = new Car[3];
			cars[0] = new Car("XYZ", 150);
			cars[1] = new Car("ZYX", 200);
			cars[2] = new Car("ABC", 50);
			
			Arrays.sort(cars);
			
			for (Car car : cars) {
				System.out.println(car.getBrand() + ": " + car.getHp());
			}
/**
 * Code below shows an equals method.
 * Please look at class Car.java at line 21-36.			
 */
			Car car1 = new Car("ABC",150);
			Car car2 = new Car("ABC",150);
			System.out.println(car1==car2);
			System.out.println(car1.equals(car2));
	}	
}


