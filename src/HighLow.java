import java.util.Scanner;

public class HighLow {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        long random = Math.round(Math.random()*100);
        int guesses = 0;
        System.out.println(random);
        System.out.println("A number from 1 to 100 has been randomly picked.");
        System.out.println("Guess the number in 5 tries or less~");
        long guessNum = scanner.nextInt();
        do {
            if (guessNum == random) {
                guesses++;
                System.out.println("Wow, you guessed correctly!~");
                System.out.println("That took you "+guesses+" guesses");
                break;
            } else if (guessNum >= random) {
                guesses++;
                System.out.println("Guess number "+guesses+".\nToo high, go lower~");
                guessNum = scanner.nextInt();
            } else if (guessNum <= random) {
                guesses++;
                System.out.println("Guess number "+guesses+".\nToo low, go higher~");
                guessNum = scanner.nextInt();
            }
            if (guesses >= 4) {
                System.out.println("Oh no, that took you too many tries!");
                break;
            }
        } while (true);
    }
}
