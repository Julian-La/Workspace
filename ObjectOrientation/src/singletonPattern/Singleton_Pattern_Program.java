package singletonPattern;

public class Singleton_Pattern_Program {

	public static void main(String[] args) {
		Singleton_Pattern a = Singleton_Pattern.getInstance();
		System.out.println(a);

		Singleton_Pattern b = Singleton_Pattern.getInstance();
		System.out.println(b);
	}

}
