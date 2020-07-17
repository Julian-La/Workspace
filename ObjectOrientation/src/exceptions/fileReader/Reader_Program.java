package exceptions.fileReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader_Program {

	public static void main(String[] args) {
		BufferedReader b = null;
		try {
			FileReader r = new FileReader("test.txt");
			b = new BufferedReader(r); // BufferedReader is more convenient
			/**
			 * Short version: BufferedReader b = new BufferedReader(new Filereader("test.txt"));
			 */
			while (b.ready()) { // As long as you have characters in the target file, this method will read.
				String line = b.readLine();
				System.out.println(line);
			}
			/**
			 * You could stop the leak by inserting b.close();. This is not exception proof!
			 * Exception could resolve everywhere, so you need to insert a finally method. 
			 */
		} catch (FileNotFoundException e) {
			System.out.println("Beim Öffnen der Datei ist ein Fehler aufgetreten");
		} catch (IOException e) {
			System.out.println("Beim Auslesen der Datei ist ein Fehler aufgetreten");
		} finally {
			try {
				if (b!=null) {
					b.close();
					}
				} catch (IOException e2) {}
				
			}
		/**
		 * Since Java Version 7, you can substitue the finally method with:
		 * line 11: try (BufferedReader b = new BufferedReader(new Filereader("test.txt"))){
		 * while (b.ready()){ etc....
		 * This way you don't need to enter the finally method at all.
		 */
	}
}