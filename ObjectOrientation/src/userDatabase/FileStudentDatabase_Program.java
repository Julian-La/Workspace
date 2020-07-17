package userDatabase;

public class FileStudentDatabase_Program {
	public static void main(String[] args) {
		StudentDatabase sd = new FileStudentDatabase();
		
		try {
			sd.addStudent("5");
			
			String[] students = sd.readAllStudents();
			for (String student : students) {
				System.out.println(student);
			}
			
		} catch (StudentDatabaseException e) {
			System.out.println("Es ist ein Fehler aufgetreten!");
			e.printStackTrace();
		}
		

}

}