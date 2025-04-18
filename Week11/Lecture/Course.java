import java.io.Serializable;

public class Course implements Serializable, Comparable<Course> {
    private String prefix;
    private int number;
    private String title;
    private Grade grade;

    public Course(String prefix, int number, String title) {
        this(prefix, number, title, Grade.NOT_TAKEN);
    }

    public Course(String prefix, int number, String title, Grade grade) {
        this.prefix = prefix;
        this.number = number;
        this.title = title;
        this.grade = grade;
    }

    public String getPrefix() {
        return prefix;
    }

    public int getNumber() {
        return number;
    }

    public String getTitle() {
        return title;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public String getCourseString() {
        return this.prefix + "-" + this.number;
    }

    public boolean hasTaken() {
        return grade != Grade.NOT_TAKEN;
    }

    public String toString() {
        String result = getCourseString() + ": " + getTitle();
        if (hasTaken()) {
            result += " [" + this.grade + "]";
        }
        return result;
    }

    public boolean equals(Object otherCourse) {
        if (!(otherCourse instanceof Course)) { return false; }
        return getCourseString().equals(((Course)otherCourse).getCourseString());
    }

    @Override
    public int compareTo(Course other) {
        return this.getCourseString().compareTo(other.getCourseString());
    }


}
