package movies;

import util.Input;
import static movies.MoviesArray.findAll;

public class MoviesApplication {
    public static void main (String[] args) {
        Movie newMovie = new Movie("Null", "Null");
        Input input = new Input();
        int decision;
        String prompt;
        boolean repeat = true;
        String addName;
        String addCat;

        prompt = input.getString("Do you want to look at your movies, or add a new movie? [view|add]");
        if (prompt.equalsIgnoreCase("view")) {
            do {
                System.out.println();
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
                System.out.println();
                switch (decision) {
                    case 0:
                        System.out.println("Okay bye.");
                        repeat = false;
                        break;
                    case 1:
                        for (Movie mov : findAll()) {
                            System.out.println(mov.getName() + " --- " + mov.getCategory());
                        }
                        break;
                    case 2:
                        for (Movie movie : findAll()) {
                            if (movie.getCategory().equals("drama")) {
                                System.out.println(movie.getName() + " -- " + movie.getCategory());
                            }
                        }
                        break;
                    case 3:
                        for (Movie movie : findAll()) {
                            if (movie.getCategory().equals("musical")) {
                                System.out.println(movie.getName() + " -- " + movie.getCategory());
                            }
                        }
                        break;
                    case 4:
                        for (Movie movie : findAll()) {
                            if (movie.getCategory().equals("scifi")) {
                                System.out.println(movie.getName() + " -- " + movie.getCategory());
                            }
                        }
                        break;
                    case 5:
                        for (Movie movie : findAll()) {
                            if (movie.getCategory().equals("comedy")) {
                                System.out.println(movie.getName() + " -- " + movie.getCategory());
                            }
                        }
                        break;
                    case 6:
                        for (Movie movie : findAll()) {
                            if (movie.getCategory().equals("animated")) {
                                System.out.println(movie.getName() + " -- " + movie.getCategory());
                            }
                        }
                        break;
                    case 7:
                        for (Movie movie : findAll()) {
                            if (movie.getCategory().equals("horror")) {
                                System.out.println(movie.getName() + " -- " + movie.getCategory());
                            }
                        }
                        break;
                    default:
                        System.out.println("That wasn't a valid input..");
                        break;
                }
            } while (repeat);
        } else if (prompt.equalsIgnoreCase("add")) {
            addName = input.getString("What is the name of the movie?");
            addCat = input.getString("What is the category for this movie?");
            newMovie.setName(addName);
            newMovie.setCategory(addCat);
            System.out.println(newMovie.getName()+ " ---" +newMovie.getCategory());
        }
    }
}
