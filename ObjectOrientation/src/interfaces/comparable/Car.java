package interfaces.comparable;

import java.util.Arrays;

public class Car implements Comparable<Car> {
	private String brand;
	private int hp;
	public Car(String brand, int hp) {
		this.brand = brand;
		this.hp = hp;
	}
	public String getBrand() {
		return brand;
	}
	public int getHp() {
		return hp;
	}
/**
 * Code below shows the equals method, followed by the actual compareTo method (saving space).	
 */
	@Override
	public boolean equals(Object o) {
		if(this==o) {
			return true;
		}
		if(!(o instanceof Car)) {
			return false;
		}	
		Car other = (Car) o;
		if(brand.equals(other.getBrand()) && hp == other.getHp()) {
			return true;
		}
		else {
			return false;
		}
}
	@Override
	public int compareTo(Car o) {
		if (this.hp < o.getHp()) {
			return -1;
		} else if (this.hp == o.getHp()) {
			return 0;
		} else {
			return 1;
		}
		/**
		 * We implement the compare method to allow ourselves, using "Arrays.sort(nameofarray);".
		 * 
		 * In short term: 
		 * public int compareTo(Car o){
		 * 	return Integer.compare(hp, o.getHp());
		 * }
		 * 
		 * If you wanna compare 2 items, let's say primary numbers and if the numbers are equal, sort by name:
		 * public int compareTo(Car o){
		 * if(hp==o.getHP()){
		 * 	return brand.compareTo(o.getbrand());
		 * } else {
		 * 	return Integer.compare(hp, o.getHp());
		 * }
		 */
	}
}

