package constructor.person;

public class Person_Program {

	public static void main(String[] args) {
		/**
		 * Class instance1 = new Class() creates a instance of this class.
		 * () has to be done. It's the instance's body. 
 		 * The body can be filled with the instances variables and methods.
		 */

		Person_Class person = new Person_Class("Paul", 22);
		person.setName("Paul");
		person.setAge(22);
		System.out.println(person);
		System.out.println("As "+person.getName()+" was asked about his age, he responded with "+person.getAge()+".");


		

	}

}
