import java.util.Scanner;

public class Bob {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You're walking in the woods. There's no one around and your phone is dead.\nOut of the corner of your eye you spot him.\nBob.");

        do {
            System.out.println("Do you want to try saying something to him?");
            String answer = scanner.nextLine();

            if (answer.endsWith("?")) {
                System.out.println("Bob replies with \"Sure.\"");
            } else if (answer.endsWith("!")) {
                System.out.println("Bob replies with \"Whoa, chill out!\"");
            } else if (answer.isEmpty()) {
                System.out.println("Bob replies with \"Fine. Be that way!\"");
            } else if (answer.contains("bye")) {
                System.out.println("Bob replies with \"Later loser.\"");
                break;
            } else {
                System.out.println("Bob replies with \"Whatever.\"");
            }
        } while (true);
    }
}
