import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f%n", pi);

        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\n");

        System.out.println("Enter a number: ");
        int userInput = scan.nextInt();
        System.out.println("You entered: "+userInput);

        System.out.println("\nEnter 3 words: ");
        String userString = scan.next();
        String userString2 = scan.next();
        String userString3 = scan.nextLine();
        System.out.println(userString);
        System.out.println(userString2);
        System.out.println(userString3);

        System.out.println("Submit a sentence: ");
        String userSentence = scan.nextLine();
        System.out.println("Here is what you entered: "+userSentence);

//        System.out.println("Enter the length, width, and height of a classroom: ");
//        int length = Integer.parseInt(scan.next());
//        int width = Integer.parseInt(scan.next());
//        float length = scan.nextFloat();
//        float width = scan.nextFloat();
//        float height = scan.nextFloat();
//        System.out.println("The area of the classroom is: "+(length*width));
//        System.out.println("The perimeter of the classroom is: "+((length*2)+(width*2)));
//        System.out.println("The volume of the classroom is: "+(length*width*height));

        System.out.printf("What is the width?");
        String answer = scan.nextLine();
        double width = Double.valueOf(answer);
        System.out.println(width);
        System.out.printf("What is the length?");
        answer = scan.nextLine();
        double length = Double.valueOf(answer);
        System.out.printf("Area of classroom = %.2f%n", width*length);
        System.out.printf("Perimeter of the classroom = %.2f%n", 2*width+2*length);
        System.out.printf("Volume of the classroom = %.2f%n", width*length*10.0);
    }
}
