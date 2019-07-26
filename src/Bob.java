import java.util.Scanner;

public class Bob {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("You come across the teenager Bob. What do you say to him?");
            String answer = scanner.nextLine();

            if (answer.endsWith("?")) {
                System.out.println("Bob replies with \"Sure.\"");
            } else if (answer.endsWith("!")) {
                System.out.println("Bob replies with \"Whoa, chill out!\"");
            } else if (answer.equals("")) {
                System.out.println("Bob replies with \"Fine. Be that way!\"");
            } else if (answer.equalsIgnoreCase("bye")) {
                System.out.println("Bob replies with \"Later loser.\"");
                break;
            } else {
                System.out.println("Bob replies with \"Whatever.\"");
            }
        } while (true);
    }
}
