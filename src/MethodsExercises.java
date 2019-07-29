import java.util.Scanner;

public class MethodsExercises {
//    number 1
    public static long addition(int a, int b) {
        return a+b;
    }
    public static long subtraction(int a, int b) {
        return a-b;
    }
    public static long multiply(int a, int b) {
        return a*b;
    }
    public static long divide(int a, int b) {
        return a/b;
    }
    public static long modulus(int a, int b) {
        return a%b;
    }

//    number 2
//    public static int getInteger(int min, int max){
//
//    }

    static long factorial(long n){
        if (n == 1)
            return 1;
        else
            return(n * factorial(n-1));
    }

//    number 4
    static long rollDice(int x) {
        return Math.round(Math.random()*x);
    }

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

//        number 1
//        System.out.println(addition(3, 5));
//        System.out.println(subtraction(10, 5));
//        System.out.println(multiply(4, 2));
//        System.out.println(divide(9, 3));
//        System.out.println(modulus(50, 3));

//        number 2
//        System.out.println("Enter a number between 1 and 10: ");
//        int userInput = scan.nextInt();
//        userInput = getInteger(1, 10);

//        number 3
//        do {
//            System.out.println("Enter a number between 1 and 20 to see a factorial: ");
//            long factorialInput = scan.nextInt();
//            if (factorialInput <=0 || factorialInput > 20) {
//                continue;
//            }
//            System.out.println(factorial(factorialInput));
//            System.out.println("Do you want to see another factorial? [y/n]");
//            String answer = scan.next();
//            if (answer.equalsIgnoreCase("n")) {
//                break;
//            }
//        } while (true);

//        number 4
        System.out.println("You are about to roll 2 dice. How many sides do they have?");
        int diceSides = scan.nextInt();
        System.out.println("You rolled "+rollDice(diceSides)+" and "+rollDice(diceSides));
    }
}
