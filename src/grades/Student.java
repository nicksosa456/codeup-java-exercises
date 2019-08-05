package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String studentName;
    private ArrayList<Integer> grades = new ArrayList<>();
    private HashMap<String, String> attendance = new HashMap<>();

    public Student(String studentName, ArrayList<Integer> grades) {
        this.studentName = studentName;
        this.grades = grades;
    }

    // returns the student's name
    public String getName() { return this.studentName; }

    public ArrayList<Integer> getGrades() { return this.grades; }

    // adds the given grade to the grades property
    public void addGrade(int grade) { this.grades.add(grade); }

    // returns the average of the students grades
    private double sum;
    private double average;
    public double getGradeAverage() {
        for (double grade : grades) {
            sum = sum + grade;
        }
        return average = sum/grades.size();
    }

    public void recordAttendance(String date, String value) {

    }

    public static void main(String[] args) {
        Student nick = new Student("Nick", new ArrayList<>());
        nick.addGrade(70);
        nick.addGrade(90);
        nick.addGrade(86);
        nick.addGrade(88);
        System.out.println("nick.grades = " + nick.grades);
        System.out.println("nick.getGradeAverage() = " + nick.getGradeAverage());
    }
}
