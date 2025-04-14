import java.util.ArrayList;

public class Student {
    private String studentName;
    private int ID;
    private ArrayList<Course> enrolledCourses;
    ArrayList<Course> courses = new ArrayList<>();


    // constructor
    public Student(String studentName, int ID) {
        this.studentName = studentName;
        this.ID = ID;
    }

    // enrolled courses
    public void enrolledCourses(Course course) {
        enrolledCourses.add(course);
        System.out.println(course.getCourseName() + " has been added.");
    }

    public String getName() {
        return studentName;
    }

    // enroll course
    public void enrollCourse(Course course) {
        courses.add(course);
    }
    

    // fees
    public int calculateTotalFees() {
        int total = 0;
        for(Course course : enrolledCourses) {
            total += course.getCourseFee();
        }
        return total;
    }

    // show details
    public void showDetails() {
        System.out.println("Name: " + studentName);
        System.out.println("ID: " + ID);
        System.out.println("-------ENROLLED COURSES--------");
        for(Course course : enrolledCourses) {
            System.out.println("==> " + course);
        }
        System.out.println("Total fees: " + calculateTotalFees());
    }

    }

    