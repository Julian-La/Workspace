package constructor.person;
	/**
	 *  The public class Person is needed to build instances.
	 */
public class Person_Class {
	
	private String name;
	private int age;
	
	public Person_Class() {}

	/** 
	 * Constructs a person with given name and age.
	 * 
	 * "this" is used to encapsulate a variable to a constructor.
	 * If you don't use "this" in a constructor, you have to 
	 * create new variable names in the constructor's body, or a name clash will happen.
	 * 
	 * If you use "static" to declare a method, you can't interact with instance variables of a class.
	 * Static methods can only interact with the whole class. --> Class.Method();
	 * 
	 * @param name
	 * 		of the person.
	 * @param age
	 * 		of the person.
	 */
	public Person_Class(String name, int age) {
		setName(name);
		setAge(age);
	}
	/**
	 * setName and setAge are methods. 
	 */
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setAge(int newAge) {
		this.age = newAge;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	public String toString() {
		return "The instance with name " + name + " has following number: " + age + ".";	
	}
}
