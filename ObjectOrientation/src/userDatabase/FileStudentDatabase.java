package userDatabase;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileStudentDatabase implements StudentDatabase {
	
	/**
	 * line 17 till 32 should be done be default collection, because it's ressource wasting to alter a String afterwards. 
	 */

	@Override
	public String[] readAllStudents() throws StudentDatabaseException {
		try (BufferedReader b = new BufferedReader(new FileReader("datenbank.txt"))) {
			String[] students = new String[0];
			while (b.ready()) {
				String student = b.readLine();
				students = Arrays.copyOf(students, students.length + 1);
				students[students.length - 1] = student;
			}
			return students;
		} catch (FileNotFoundException e) {
			throw new StudentDatabaseException(e);
		} catch (IOException e) {
			throw new StudentDatabaseException(e);
		}
	}

	@Override
	public void addStudent(String name) throws StudentDatabaseException {
		try (BufferedWriter b = new BufferedWriter(new FileWriter("datenbank.txt", true))) {
			b.write("\n" + name);
		} catch (FileNotFoundException e) {
			throw new StudentDatabaseException(e);
		} catch (IOException e) {
			throw new StudentDatabaseException(e);
		}
		 
	}

}