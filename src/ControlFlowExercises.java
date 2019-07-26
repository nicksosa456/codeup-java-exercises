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

//        long z = 2;
//        do {
//            System.out.println(z);
//            z *= z;
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
//        for (long z = 2; z < 1000000; z *= z) {
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
        String answer;
        do {
            System.out.println("What number would you like to go up to?");
            int num = scanner.nextInt();
            System.out.println("Here is your table.");
            System.out.println();
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");
            for (int a = 1; a <= num; a++) {
                int squared = a * a;
                int cubed = a * a * a;
                System.out.printf("%-6d | %-8d|  %-7d%n", a, squared, cubed);
            }
            System.out.println("Would you like to continue? [Y/N]");
            answer = scanner.next();
        } while (answer.equalsIgnoreCase("y"));
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
