package collections;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lists_Program {

	public static void main(String[] args) {
		
		//Arrays have a fix amount of space. Here it's 10. If we wanna go for more students...   
		String[] students = new String[3];
		students[0] = "Max";
		students[1] = "Tom";
		students[2] = "Diana";
		
		for(int i = 0;i<students.length;i++) {
			System.out.println(students[i]);
		}
//		You can also write:
//		for(String a:students) {
//			System.out.println("WARNING"+a);
//		}
		/**
		 * ...we need to handle this situation by using generics:
		 */
		System.out.println("---------------");
		ArrayList<String> studentList = new ArrayList<>();
		studentList.add("Max");
		studentList.add("Tom"); 
		studentList.add("Richard");
		studentList.add("Kerstin");
		studentList.remove("Kerstin");
		Collections.sort(studentList);
		for(String student:studentList) {
		System.out.println(student);
	}
		Scanner input = new Scanner(System.in);
		while(input.hasNext()) {
			String s = input.next();
			studentList.add(s);
			if(!s.equals("#Output")) {
				System.out.println("Du hast "+s+" angelegt. Derzeit befinden sich "+studentList.size()+" Studenten auf der Liste.");
			}
			if(s.contentEquals("#Output")) {
				studentList.remove("#Output");
				for(String output:studentList) {
				System.out.println(output);
				}     
			}
}		
}
}
