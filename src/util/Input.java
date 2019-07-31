package util;
import java.util.Scanner;
public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Yes or no?");
        String answer = scanner.nextLine();
        return answer.toLowerCase().contains("yes") || answer.toLowerCase().contains("y");
    }

    public int getInt(int min, int max) {
        int userInt;
        do {
            System.out.println("Enter a whole number between "+min+" and "+max+": ");
            userInt = scanner.nextInt();
            if (userInt > max || userInt < min) {
                System.out.println("That is not between "+min+" and "+max);
            } else break;
        } while (true);
        return userInt;
    }

    public int getInt() {
        return this.scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        double userDouble;
        do {
            System.out.println("Enter a decimal number between "+min+" and "+max+": ");
            userDouble = scanner.nextDouble();
            if (userDouble > max || userDouble < min) {
                System.out.println("That is not between "+min+" and "+max);
            } else  break;
        } while (true);
        return userDouble;
    }

    public double getDouble() {
        return this.scanner.nextDouble();
    }
}
