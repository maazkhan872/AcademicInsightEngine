package service;

import model.Student;
import model.Subject;

import java.util.Comparator;

public class GradeCalculatorService {

    public int calculateTotalMarks(Student student) {

        return student.getSubjects()
                .stream()
                .mapToInt(Subject::getMarks)
                .sum();
    }

    public double calculateAverage(Student student) {

        return student.getSubjects()
                .stream()
                .mapToInt(Subject::getMarks)
                .average()
                .orElse(0);
    }

    public Subject getHighestSubject(Student student) {

        return student.getSubjects()
                .stream()
                .max(Comparator.comparingInt(
                        Subject::getMarks))
                .orElse(null);
    }

    public Subject getLowestSubject(Student student) {

        return student.getSubjects()
                .stream()
                .min(Comparator.comparingInt(
                        Subject::getMarks))
                .orElse(null);
    }
}