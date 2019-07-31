package util;
import java.util.Scanner;
public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString() {
        String userString;
        System.out.println("Enter your string.");
        userString = scanner.nextLine();
        return userString;
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
        int userInt;
        System.out.println("Enter a valid integer.");
        userInt = scanner.nextInt();
        return userInt;
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
        double userDouble;
        System.out.println("Enter a valid decimal number.");
        userDouble = scanner.nextDouble();
        return userDouble;
    }
}
