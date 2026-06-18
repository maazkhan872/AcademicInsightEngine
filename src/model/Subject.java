package model;

public class Subject {

    private String subjectName;
    private int marks;

    // constructor
    public Subject(String subjectName, int marks) {
        this.subjectName = subjectName;
        this.marks = marks;
    }

    // Getter/Setter
    public String getSubjectName() {
        return subjectName;
    }

    public int getMarks() {
        return marks;
    }
}
