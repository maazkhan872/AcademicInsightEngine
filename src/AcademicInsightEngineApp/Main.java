package AcademicInsightEngineApp;


import exception.InvalidMarksException;
import model.Student;
import model.Subject;
import service.GradeCalculatorService;
import service.PerformanceAnalyzerService;
import util.InputValidator;
import util.ReportGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	    public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);

	        List<Subject> subjects = new ArrayList<>();

	        System.out.println("==================================");
	        System.out.println("ACADEMIC INSIGHT ENGINE");
	        System.out.println("==================================");

	        System.out.print("Enter Student Name: ");
	        String name = scanner.nextLine();

	        System.out.print("Enter Roll Number: ");
	        String rollNo = scanner.nextLine();

	        System.out.print("Enter Department: ");
	        String department = scanner.nextLine();

	        System.out.print("Enter Number Of Subjects: ");
	        int numberOfSubjects = scanner.nextInt();
	        scanner.nextLine();

	        for (int i = 1; i <= numberOfSubjects; i++) {

	            System.out.println();

	            System.out.print("Enter Subject Name: ");
	            String subjectName = scanner.nextLine();

	            while (true) {

	                try {

	                    System.out.print(
	                            "Enter Marks (0-100): ");

	                    int marks = scanner.nextInt();
	                    scanner.nextLine();

	                    InputValidator
	                            .validateMarks(marks);

	                    subjects.add(
	                            new Subject(
	                                    subjectName,
	                                    marks
	                            ));

	                    break;

	                } catch (InvalidMarksException e) {

	                    System.out.println(
	                            "Validation Error: "
	                                    + e.getMessage());

	                } catch (Exception e) {

	                    System.out.println(
	                            "Invalid Input. Enter Numeric Value.");

	                    scanner.nextLine();
	                }
	            }
	        }

	        Student student =
	                new Student(
	                        name,
	                        rollNo,
	                        department,
	                        subjects
	                );

	        GradeCalculatorService gradeService =
	                new GradeCalculatorService();

	        PerformanceAnalyzerService analyzer =
	                new PerformanceAnalyzerService();

	        int totalMarks =
	                gradeService.calculateTotalMarks(student);

	        double percentage =
	                gradeService.calculateAverage(student);

	        Subject highest =
	                gradeService.getHighestSubject(student);

	        Subject lowest =
	                gradeService.getLowestSubject(student);

	        boolean failed =
	                analyzer.isFailed(student);

	        String grade =
	                analyzer.getGrade(percentage);

	        String division =
	                analyzer.getDivision(percentage);

	        String remark =
	                analyzer.getPerformanceRemark(
	                        percentage);

	        ReportGenerator reportGenerator =
	                new ReportGenerator();

	        reportGenerator.generateReport(
	                student,
	                totalMarks,
	                percentage,
	                grade,
	                division,
	                highest,
	                lowest,
	                failed,
	                remark
	        );

	        scanner.close();
	    }
	}
