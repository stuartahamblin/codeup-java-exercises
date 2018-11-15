package movies;
import util.Input;
import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {
//    Create a class named MoviesApplication that has a main method.
//    Give the user a list of options for viewing all the movies or viewing movies by category.
//    Use your Input class to get input from the user, and display information based on their choice. (Remember to import your Input class)
//    If a category is selected, only movies from that category should be displayed.
//    Your application should continue to run until the user chooses to exit.
private static String allOrCategory(Scanner scanner) {
    System.out.println("Do you want to see all movies or by category?");
    Input in = new Input(scanner);
    String userInput;
    do{
        System.out.println("Enter [all\\category]");
        userInput = scanner.nextLine();
    } while (!(userInput.equalsIgnoreCase("all")||userInput.equalsIgnoreCase("category")));
    return userInput;
}

public static Movie[] addMovie(Movie[] movieArray, Movie newMovie){
    Movie[] morePeople = Arrays.copyOf(movieArray, movieArray.length + 1);
    morePeople[morePeople.length-1] = newMovie;
    return morePeople;
}

private static void pickCategory(Movie[] moviesArray, Scanner scanner){
    Movie[] renderMovies = {};
    System.out.println("Do you want to see all movies or by category? \n Enter [all\\drama\\musical\\scifi\\horror\\comedy\\animated");
    Input in = new Input(scanner);
    String userInput = scanner.nextLine();
    int count = 0;
    for (int i = 0; i < moviesArray.length; i++) {
        String pickMovie = moviesArray[i].getCategory();
        if(userInput.equalsIgnoreCase("all")) {
            System.out.println(moviesArray[i].getName());
            count += 1;
        } else if(pickMovie.equalsIgnoreCase(userInput)){
            System.out.println(moviesArray[i].getName());
            count += 1;
        }
    }
    if (count == 0) {
        System.out.println("no movies for that category");
    }
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movie[] theList = MoviesArray.findAll();
        String exit = "";
        do {
            pickCategory(theList, sc);
        } while (exit.equalsIgnoreCase("exit"));
    }
}
