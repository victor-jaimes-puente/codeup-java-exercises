package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student bob = new Student("Bob");
        bob.addGrade(70);
        bob.addGrade(75);
        bob.addGrade(80);
        bob.recordAttendance("2020-01-01", "P");
        bob.recordAttendance("2020-01-02", "P");
        bob.recordAttendance("2020-01-03", "P");
        bob.recordAttendance("2020-01-04", "A");
        bob.recordAttendance("2020-01-05", "P");

        Student jane = new Student("Jane");
        jane.addGrade(80);
        jane.addGrade(85);
        jane.addGrade(90);
        jane.recordAttendance("2020-01-01", "P");
        jane.recordAttendance("2020-01-02", "A");
        jane.recordAttendance("2020-01-03", "P");
        jane.recordAttendance("2020-01-04", "A");
        jane.recordAttendance("2020-01-05", "P");

        Student john = new Student("John");
        john.addGrade(50);
        john.addGrade(55);
        john.addGrade(60);
        john.recordAttendance("2020-01-01", "P");
        john.recordAttendance("2020-01-02", "A");
        john.recordAttendance("2020-01-03", "A");
        john.recordAttendance("2020-01-04", "P");
        john.recordAttendance("2020-01-05", "A");

        Student cindy = new Student("Cindy");
        cindy.addGrade(90);
        cindy.addGrade(95);
        cindy.addGrade(100);
        cindy.recordAttendance("2020-01-01", "P");
        cindy.recordAttendance("2020-01-02", "P");
        cindy.recordAttendance("2020-01-03", "P");
        cindy.recordAttendance("2020-01-04", "P");
        cindy.recordAttendance("2020-01-05", "P");

        students.put("gitbob", bob);
        students.put("gitjane", jane);
        students.put("gitjohn", john);
        students.put("gitcindy", cindy);

        String student = "";
        String choice = "";
        boolean validStudentChoice = false;

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome!\n");

        do {
            do {
                System.out.println("Here are the GitHub usernames of our students:\n");

                System.out.println("all");

                for (String stu : students.keySet()) {
                    System.out.println(stu);
                }
                System.out.println();

                System.out.print("What student would you like to see more information on? ");
                student = input.nextLine();

                System.out.println();

                if(student.equalsIgnoreCase("all")) {
                    System.out.println("Name       | GitHub username | GPA   | Attendance");

                    double overallGPA = 0;

                    for(String stu : students.keySet()) {
                        Student s = students.get(stu);

                        System.out.printf("%-10s | %-15s | %-5s | %s%%%n", s.getName(), stu, s.getGradeAverage(), s.attendancePercentage());

                        overallGPA += s.getGradeAverage();
                    }

                    System.out.println();

                    System.out.println("Overall GPA: " + overallGPA / students.size());

                    validStudentChoice = true;
                } else if(!students.containsKey(student)) {
                    System.out.println("Sorry, no student found with the GitHub username of \"" + student + ".\"");
                    System.out.println();

                    validStudentChoice = false;
                } else {
                    Student s = students.get(student);

                    System.out.println("Name: " + s.getName() + " - GitHub Username: " + student);

                    System.out.println("Grades:");
                    for(int grade : s.getGrades()) {
                        System.out.println("\t" + grade);
                    }

                    System.out.println("Current Average: " + s.getGradeAverage());
                    System.out.println("Attendance: " + s.attendancePercentage() + "%");

                    System.out.println("Days Absent:");
                    for(String a : s.getAttendance().keySet()) {
                        if(s.getAttendance().get(a).equals("A")) {
                            System.out.println("\t" + a);
                        }
                    }

                    validStudentChoice = true;
                }
            } while(!validStudentChoice);

            System.out.println();

            System.out.print("Would you like to see another student? [Y/N] ");
            choice = input.nextLine();

            System.out.println();

            if(choice.equalsIgnoreCase("n")) {
                System.out.println("Goodbye, and have a wonderful day!");
            }
        } while(choice.equalsIgnoreCase("y"));
    }
}