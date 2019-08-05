package grades;

import util.Input;
import java.util.ArrayList;
import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        Input input = new Input();
        HashMap<String, Student> students = new HashMap<>();
        Student frank = new Student("Frank", new ArrayList<>());
        Student sam = new Student("Sam", new ArrayList<>());
        Student suzie = new Student("Suzie", new ArrayList<>());
        Student alice = new Student("Alice", new ArrayList<>());
        frank.addGrade(90);
        frank.addGrade(79);
        frank.addGrade(87);

        sam.addGrade(96);
        sam.addGrade(77);
        sam.addGrade(83);

        suzie.addGrade(91);
        suzie.addGrade(82);
        suzie.addGrade(74);

        alice.addGrade(95);
        alice.addGrade(84);
        alice.addGrade(88);

        students.put("frankles", frank);
        students.put("samwise", sam);
        students.put("coozie", suzie);
        students.put("rabbitz", alice);

        boolean compare = false;
        boolean again = true;
        double sum = 0;
        double classAverage = 0;

        do {
            System.out.println("Welcome\n");
            System.out.println("Here are the usernames for the current students: \n");
            for (String username : students.keySet()) {
                System.out.print("|" + username + "|  ");
            }
            System.out.println("|All|  |Class Grade Average|  |csv report|");
            String info = input.getString("\nWhich student do you want more information on?");

            if (info.equals("all")) {
                for (String username : students.keySet()) {
                    System.out.printf("Name: %s - GH Username: %s%nCurrent Grades: %s%nCurrent Grade Average: %f%n%n", students.get(username).getName(), username, students.get(username).getGrades(), students.get(username).getGradeAverage());
                }
            } else if (info.contains("average")) {
                for (String username : students.keySet()) {
                    sum = sum + students.get(username).getGradeAverage();
                }
                classAverage = sum/students.size();
                System.out.printf("The class' grade average is: %f%n", classAverage);
            } else if (info.contains("csv")) {
                System.out.println("name,github_username,average");
                for (String username : students.keySet()) {
                    System.out.printf("%s,%s,%f%n", students.get(username).getName(), username, students.get(username).getGradeAverage());
                }
            } else {
                for (String username : students.keySet()) {
                    if (students.get(info).equals(students.get(username))) {
                        compare = true;
                    } //else {
//                    System.out.printf("No student was found with the username \"%s\" %n", info);
//                }
                }
            }

            if (compare) {
                System.out.printf("Name: %s - GH Username: %s %nCurrent Grades: %s%nCurrent Grade Average: %f%n%n", students.get(info).getName(), info, students.get(info).getGrades(), students.get(info).getGradeAverage());
            } //else {
//                System.out.printf("No student was found with the username \"%s\" %n", info);
//            }
            again = input.yesNo("Do you want to see another student? [yes/no]");

        } while (again);

        System.out.println("Have a nice day.");
    }
}
