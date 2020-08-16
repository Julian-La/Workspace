import java.util.Arrays;

public class MagicArrays {
	private static String task = "If all subarrays have the same sum, the word 'Magic Array' should be displayed. Else the word 'Simple Array' is required.";
	private static String taskMaterial = "The following array consists of three one dimensional arrays: {{2,2,5,1},{5,5},{7,2,1}}.";
	private static String border = "---------------------------------------------------------";
	private static int[][] arr = {{2,2,5,1},{5,5},{7,2,1}};
	public static void main(String[] args) {
		System.out.println(taskMaterial);
		System.out.println(task);
		System.out.println(border);
		int[]sums=new int[arr.length];
		int counter=0;
		for(int a[]:arr) {
			int sum=0;
			counter++;
			for (int b:a) {	
				sum = sum+b;	
			}
			sums[counter-1]=sum;
		}
		if(sums[0]==sums[1]&&sums[1]==sums[2]) {
			System.out.println("Magic Array");
		}
		else {System.out.println("Simple Array");		
		}
	}
}
