package util;

import model.Student;
import model.Subject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReportGenerator {

    public void generateReport(
            Student student,
            int totalMarks,
            double percentage,
            String grade,
            String division,
            Subject highest,
            Subject lowest,
            boolean failed,
            String remark) {

        System.out.println();
        System.out.println("======================================================");
        System.out.println("          ACADEMIC INSIGHT ENGINE REPORT");
        System.out.println("======================================================");

        System.out.println("Student Name : " + student.getName());
        System.out.println("Roll Number  : " + student.getRollNo());
        System.out.println("Department   : " + student.getDepartment());

        System.out.println(
                "Generated At : "
                + DateTimeUtil.getCurrentDateTime()
        );

        System.out.println("------------------------------------------------------");
        System.out.printf("%-25s %-10s %-10s%n",
                "Subject",
                "Marks",
                "Status");

        System.out.println("------------------------------------------------------");

        student.getSubjects().forEach(subject -> {

            String status =
                    subject.getMarks() >= 40
                            ? "PASS"
                            : "FAIL";

            System.out.printf(
                    "%-25s %-10d %-10s%n",
                    subject.getSubjectName(),
                    subject.getMarks(),
                    status
            );
        });

        System.out.println("------------------------------------------------------");

        System.out.println("Total Marks       : "
                + totalMarks + " / "
                + (student.getSubjects().size() * 100));

        System.out.printf("Percentage        : %.2f %% %n",
                percentage);

        System.out.println("Grade             : "
                + grade);

        System.out.println("Division          : "
                + division);

        System.out.println("Highest Subject   : "
                + highest.getSubjectName()
                + " ("
                + highest.getMarks()
                + ")");

        System.out.println("Lowest Subject    : "
                + lowest.getSubjectName()
                + " ("
                + lowest.getMarks()
                + ")");

        System.out.println("Overall Result    : "
                + (failed ? "FAIL" : "PASS"));

        System.out.println("Remark            : "
                + remark);

        System.out.println("======================================================");
    }
}