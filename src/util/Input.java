package util;
import java.util.Scanner;
public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

//    public String getString() {
//        return this.scanner.nextLine();
//    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return this.scanner.nextLine();
    }

//    public boolean yesNo() {
////        System.out.println("Yes or no?");
//        String answer = scanner.nextLine();
//        return answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes");
//    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String answer = scanner.nextLine();
        return answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes");
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
        int userInt = 0;
        try {
            userInt = Integer.valueOf(this.scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("That is not a valid number.");
        }
        return userInt;
    }

    public int getInt(String prompt) {
        System.out.println(prompt);
        return this.getInt();
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
        double userDouble = 0;
        try {
            userDouble = Double.valueOf(this.scanner.nextLine());
        } catch (Exception e) {
            System.out.println("That is not a valid number.");
        }
        return userDouble;
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        return this.getDouble();
    }

    public long getBinary() {
        long userBin = 0;
        try {
            userBin = Integer.valueOf(this.scanner.nextLine(), 2);
        } catch (NumberFormatException e) {
            System.out.println("Not a valid binary number.");
        }
        return userBin;
    }

    public long getBinary(String prompt) {
        System.out.println(prompt);
        return this.getBinary();
    }

    public int getHex() {
        int userHex = 0;
        try {
            userHex = Integer.valueOf(this.scanner.nextLine(), 16);
        } catch (NumberFormatException e) {
            System.out.println("Not a valid hexidecimal");
        }
        return userHex;
    }

    public int getHex(String prompt) {
        System.out.println(prompt);
        return this.getHex();
    }
}
