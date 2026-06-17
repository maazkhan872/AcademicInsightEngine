package model;

import java.util.List;

public class Student {

    private String name;
    private String rollNo;
    private String department;
    private List<Subject> subjects;

    public Student(String name,
                   String rollNo,
                   String department,
                   List<Subject> subjects) {

        this.name = name;
        this.rollNo = rollNo;
        this.department = department;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public String getDepartment() {
        return department;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }
}