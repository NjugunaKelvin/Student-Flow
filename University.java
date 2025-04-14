import java.util.Scanner;
import java.util.ArrayList;

public class University {
    // public void enrollCourse(String name) {
        
    // }
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
                    scanner.nextLine();
                    students.add(new Student(studentName, ID));

                    System.out.println("Student registered successfully");
                    
                    break;
                case 2:
                    System.out.println("Enter the name of the course.");
                    String courseName = scanner.nextLine();

                    System.out.println("Enter the course fee.");
                    int courseFee = scanner.nextInt();
                    scanner.nextLine();

                    courses.add(new Course(courseName, courseFee));

                    System.out.println("Course added successfully.");
                    break;
                case 3:
                    if (students.isEmpty() || courses.isEmpty()) {
                        System.out.println("No students or courses available.");
                        break;
                    }
                    System.out.println("Choose a student.");

                    for (int k = 0; k < students.size(); k++) {
                        System.out.println(k + ". " + students.get(k).getName());
                    }
                    int studentIndex = scanner.nextInt();
                    scanner.nextLine();

                    // course
                    System.out.println("Choose a course: ");
                    for (int i = 0; i < courses.size(); i++) {
                        System.out.println(i + ". " + courses.get(i).getCourseName());
                    }
                    int courseIndex = scanner.nextInt();
                    scanner.nextLine();

                    Student selectedStudent = students.get(studentIndex);
                    Course selectedCourse = courses.get(courseIndex);
                    selectedStudent.enrollCourse(selectedCourse);

                    System.out.println("Student enrolled in course");
                    break;
                case 4:
                    if (students.isEmpty()) {
                        System.out.println("No students enrolled yet.");
                        break;
                    }
                    for (Student s : students) {
                        System.out.println(s);                        
                    }
                    break;
                case 5:
                    System.out.println("Thanks for spending time here");
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }

    }
}
