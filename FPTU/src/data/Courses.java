package data;

public class Courses {
    private String courseCode;
    private String courseName;
    private String courseCredits;

    public Courses(String courseCode, String courseName, String courseCredits) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.courseCredits = courseCredits;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCredits() {
        return courseCredits;
    }

    public void setCourseCredits(String courseCredits) {
        this.courseCredits = courseCredits;
    }
}
