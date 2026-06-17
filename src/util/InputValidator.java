package util;

import exception.InvalidMarksException;

public class InputValidator {

    private InputValidator() {
    }

    public static void validateMarks(int marks)
            throws InvalidMarksException {

        if (marks < 0 || marks > 100) {

            throw new InvalidMarksException(
                    "Marks must be between 0 and 100."
            );
        }
    }

    public static void validateStudentName(
            String name)
            throws IllegalArgumentException {

        if (name == null ||
                name.trim().isEmpty()) {

            throw new IllegalArgumentException(
                    "Student name cannot be empty."
            );
        }
    }

    public static void validateRollNumber(
            String rollNo)
            throws IllegalArgumentException {

        if (rollNo == null ||
                rollNo.trim().isEmpty()) {

            throw new IllegalArgumentException(
                    "Roll number cannot be empty."
            );
        }
    }

    public static void validateDepartment(
            String department)
            throws IllegalArgumentException {

        if (department == null ||
                department.trim().isEmpty()) {

            throw new IllegalArgumentException(
                    "Department cannot be empty."
            );
        }
    }

    public static void validateSubjectName(
            String subjectName)
            throws IllegalArgumentException {

        if (subjectName == null ||
                subjectName.trim().isEmpty()) {

            throw new IllegalArgumentException(
                    "Subject name cannot be empty."
            );
        }
    }

    public static void validateSubjectCount(
            int count)
            throws IllegalArgumentException {

        if (count <= 0) {

            throw new IllegalArgumentException(
                    "Subject count must be greater than 0."
            );
        }
    }
}