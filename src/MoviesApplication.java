import java.util.Scanner;
import movies.Movie;
import movies.Movie;
import movies.MoviesArray;

public class MoviesApplication {
    public static void main(String[] args) {
        displayMenu();
        prcoessNumber();
    }

    public static void displayMenu() {
        System.out.println();
        System.out.println("What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category");
    }

    public static void prcoessNumber() {
        Scanner scanner = new Scanner(System.in);
        Integer userNumber = scanner.nextInt();
        if (userNumber == 0) {
            return;
        } else if (userNumber == 1) {
            displayAllMovies();
        } else if (userNumber == 2) {
            displayMovies("animated");
        } else if (userNumber == 3) {
            displayMovies("drama");
        } else if (userNumber == 4) {
            displayMovies("horror");
        } else if (userNumber == 5) {
            displayMovies("scifi");
        }
    }

    public static void displayAllMovies() {
        String output = "";
        for (Movie movie : MoviesArray.findAll()) {
            output += String.format("%s -- %s%n", movie.getName(), movie.getCategory());
        }
        System.out.println(output);
    }

    public static void displayMovies(String category) {
        String output = "";

        for (Movie movie : MoviesArray.findAll()) {
            if (category.equals(movie.getCategory())) {
                output += String.format("%s -- %s%n", movie.getName(), movie.getCategory());
            }

        }
            System.out.println(output);




    }
}
