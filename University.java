import java.util.Scanner;
import java.util.ArrayList;

public class University {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Course> courses = new ArrayList<>();

        System.out.println("Welcome to the University Management System.");

        while (true) {
            System.out.println("\n ------MENU------");
            System.out.println("1. Register Student");
            System.out.println("2. Add Course");
            System.out.println("3. Enroll student in a course");
            System.out.println("4. View all Students");
            System.out.println("5. Exit");

            System.out.println("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Enter the student name.");
                    String studentName = scanner.nextLine();

                    System.out.println("Enter students ID: ");
                    int ID = scanner.nextInt();
                    students.add(new Student(studentName, ID));
                    
                    break;
            
                default:
                    break;
            }
        }

    }
}
