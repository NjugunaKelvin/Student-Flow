public class Course {
    private String courseName;
    private int courseFee;

    // constructor
    public Course(String courseName, int courseFee) {
        this.courseName = courseName;
        this.courseFee = courseFee;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCourseFee() {
        return courseFee;
    }

    @Override
    public String toString() {
        return courseName + " ($" + courseFee + ")";
    }

}
