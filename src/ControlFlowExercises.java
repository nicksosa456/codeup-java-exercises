import javax.swing.table.TableCellEditor;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i+" ");
//            i++;
//        }

//        int x = 0;
//        do {
//            System.out.println(x);
//            x+=2;
//        } while (x < 100);

//        int y = 100;
//        do {
//            System.out.println(y);
//            y -= 5;
//        } while (y >= -10);

//        int z = 2;
//        do {
//            System.out.println(z);
//            z = (int) Math.pow(z, 2);
//        } while (z < 1000000);

//        for (int i = 5; i <= 15; i ++) {
//            System.out.print(i+" ");
//        }
//
//        for (int x = 0; x < 100; x+=2) {
//            System.out.println(x);
//        }
//
//        for (int y = 100; y >= -10; y-=5) {
//            System.out.println(y);
//        }
//
//        for (int z = 2; z < 1000000; z = (int) Math.pow(z, 2)) {
//            System.out.println(z);
//        }

//        for (int x = 1; x < 100; x++) {
//            if (x % 15 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (x % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (x % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(x);
//            }
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("What number would you like to go up to?");
        int num = scanner.nextInt();
        System.out.println("Here is your table.%n");
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");
        for (int a = 1; a <= num; a++) {
            int squared = (int) Math.pow(a, 2);
            int cubed = (int) Math.pow(a, 3);
            System.out.printf("%-7d| %-8d| %-8d%n", a, squared, cubed);
        }


//        System.out.println("Enter a numerical grade from 0 to 100.");
//        int grade = scanner.nextInt();
//        if (grade <= 59) {
//            System.out.println("You got a F.");
//        } else if (grade > 60 && grade < 66) {
//            System.out.println("You got an D.");
//        } else if (grade >= 67 && grade <= 79) {
//            System.out.println("You got a C.");
//        } else if (grade >= 80 && grade <=87) {
//            System.out.println("You got a B.");
//        } else if (grade >= 88 && grade <= 100) {
//            System.out.println("You got an A.");
//        }

    }
}
