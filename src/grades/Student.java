
package grades;

import java.util.ArrayList;
import java.util.HashMap;
//MAIN
public class Student {
    public static void main(String[] args) {
        Student bob = new Student("Bob");
        bob.addGrade(25);
        bob.addGrade(50);
        bob.addGrade(75);
        bob.addGrade(100);

        System.out.println(bob.getName() +  "'s grade point average: " + bob.getGradeAverage());
    }

    private String name;
    private ArrayList<Integer> grades;
    private HashMap<String, String> attendance;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
        this.attendance = new HashMap<>();
    }

    public String getName() {
        return this.name;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    public double getGradeAverage() {
        int sum = 0;

        for(int grade : this.grades) {
            sum += grade;
        }

        return (double) sum / this.grades.size();
    }

    public void recordAttendance(String date, String value) {
        this.attendance.put(date, value);
    }

    public HashMap<String, String> getAttendance() {
        return this.attendance;
    }

    public double attendancePercentage() {
        int absences = 0;

        for(String a : this.attendance.values()) {
            if(a.equals("A")) {
                absences++;
            }
        }

        return ((double) (this.attendance.size() - absences) / this.attendance.size()) * 100;
    }
}