package service;

import model.Student;

public class PerformanceAnalyzerService {

    public boolean isFailed(Student student) {

        return student.getSubjects()
                .stream()
                .anyMatch(subject ->
                        subject.getMarks() < 40);
    }

    // boolean method
    public String getGrade(double percentage) {

        if (percentage >= 90)
            return "A+";

        if (percentage >= 80)
            return "A";

        if (percentage >= 70)
            return "B";

        if (percentage >= 60)
            return "C";

        if (percentage >= 50)
            return "D";

        return "F";
    }

    public String getDivision(double percentage) {

        if (percentage >= 80)
            return "Distinction";

        if (percentage >= 60)
            return "First Division";

        if (percentage >= 50)
            return "Second Division";

        if (percentage >= 40)
            return "Third Division";

        return "Fail";
    }

    public String getPerformanceRemark(double percentage) {

        if (percentage >= 95)
            return "Outstanding";

        if (percentage >= 85)
            return "Excellent";

        if (percentage >= 75)
            return "Very Good";

        if (percentage >= 65)
            return "Good";

        if (percentage >= 50)
            return "Satisfactory";

        return "Needs Improvement";
    }
}
