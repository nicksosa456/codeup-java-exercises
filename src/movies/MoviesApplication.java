package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {
    public static void main (String[] args) {
        Input input = new Input();
        int decision;
        String cat = null;

//        do {
            System.out.println("It's your movie collection.");
            System.out.println("How do you want to view your movies?");
            System.out.println();
            System.out.println("0 - exit");
            System.out.println("1 - view all the movies");
            System.out.println("2 - view all drama movies");
            System.out.println("3 - view all musical movies");
            System.out.println("4 - view all scifi movies");
            System.out.println("5 - view all comedy movies");
            System.out.println("6 - view all animated movies");
            System.out.println("7 - view all horror movies");

            decision = input.getInt("Enter your choice: ");
            switch (decision) {
                case 1:
                    cat = "all";
                    break;
                case 2:
                    cat = "drama";
                    break;
                case 3:
                    cat = "musical";
                    break;
                case 4:
                    cat = "scifi";
                    break;
                case 5:
                    cat = "comedy";
                    break;
                case 6:
                    cat = "animated";
                    break;
                case 7:
                    cat = "horror";
                    break;
                default:
                    break;
            }
            MoviesArray.findAll();
        System.out.println(cat);
//        } while (true);
    }
}
