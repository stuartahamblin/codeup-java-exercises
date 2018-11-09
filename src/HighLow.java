import java.util.Scanner;
public class HighLow {

//          QUESTION 5
//          Game Development 101
//          Welcome to the world of game development!
//          You are going to build a high-low guessing game. Create a class named HighLow inside of src.
//          The specs for the game are:
//          -Game picks a random number between 1 and 100.
//          -Prompts user to guess the number
//          -All user inputs are validated
//          -If user's guess is less than the number, it outputs "HIGHER"
//          -If user's guess is more than the number, it outputs "LOWER"
//          -If a user guesses the number, the game should declare "GOOD GUESS!"
//          Hints
//          -Use the random method of the java.lang.Math class to generate a random number.
//          Bonus
//          Keep track of how many guesses a user makes
//          Set an upper limit on the number of guesses
//              ANSWER
              public static void main(String[] args) {
                  System.out.println(highLowGame());
              }
              public static int random(int maxNumber){
                  int randomValue = (int )(Math.random() * maxNumber + 1);
                  return randomValue;
              }
              public static String highLowGame(){
                  Scanner sc = new Scanner(System.in);
                  int toBeGuessed = random(100);
                  int guess = 0;
                  String win ="";
                  int guesses = 0;
                  System.out.println("Guess a number between 1 and 100");
                  do {
                      guess = sc.nextInt();
                      if (guess == toBeGuessed) {
                          win = "win";
                          continue;
                      } else if (guess < toBeGuessed) {
                          System.out.println("The number is LARGER than the one guessed. \nGuess a number.");
                      } else {
                          System.out.println("The number is SMALLER than the one guessed. \nGuess a number.");
                      }
                      guesses += 1;
                  } while (!win.equals("win"));
                  return "Congratulations! you guessed the number " + toBeGuessed + " in " + guesses + " guesses.";
              }
}
