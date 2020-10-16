package methods;

public class Recursion {
	//!n is a recursive function. It calls itself until it's basecase (break-up condition) is met:
	public static long fact(long n) {
		if(n<=1) {
			System.out.println("* 1"+"\n"+"=");
			return 1;
		}
		else {
			System.out.println("* "+(n));
			return n*fact(n-1);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(fact(8));
		
	}

}
