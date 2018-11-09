import java.sql.SQLOutput;
import java.util.Scanner;
public class CommandLineAdventureGame {
    public static void main(String[] args) {

//        1. Create a command line adventure game...
//           Be creative in communicating with your user different options and for given scenerios. Create at least three phases of the adventure, for example...
//
//                           Home
//                      |             |
//                  Store     or      Park
//                |      |          |      |
//           School  or  Park     Zoo  or  Pool
//                        |
//                       Home
//
//           Keep the game relatively simple and plan it out clearly before coding it.
//
//              todo reject values not equal to 1 or 2
//                    Scanner sc = new Scanner(System.in);
//                    System.out.println("Welcome to the Make it home game!");
//                    System.out.println("(1: Store) or (2: Park)");
//                    System.out.println("Pick 1 or 2");
//                    int direction1 = sc.nextInt();
//                    if (direction1 == 1) {
//                        System.out.println("(1: School)  or  (2: Park)");
//                        System.out.println("Pick 1 or 2");
//                        int direction2 = sc.nextInt();
//                        if (direction2 == 2) {
//                            System.out.println("YOU MADE IT HOME! YOU WIN!");
//                        } else {
//                            System.out.println("Teacher had to call your parents to pick you up. GAME OVER!");
//                        }
//                    } else {
//                        System.out.println("(1: Zoo)  or  (2: Pool)");
//                        System.out.println("Pick 1 or 2");
//                        int direction3 = sc.nextInt();
//                        if (direction3 == 1) {
//                            System.out.println("You got eaten by a lion. GAME OVER!");
//                        } else {
//                            System.out.println("You drowned in the pool. GAME OVER!");
//                        }
//                    }

//        2. Create a command line Hangman game...
//           Prompt a player 1 to enter a word for player 2 to guess.
//           Track the number of guesses by player 2. Display to the user the partially completed word
//           String lesson methods will be helpful for this bonus
//
            Scanner sc = new Scanner(System.in);
            Boolean continueGame = true;
            String playerTurn = "One";
            String guessLetter;
            System.out.println("Player One: Enter a word to be guessed");
            String hangmanAnswer = sc.nextLine();
            String hangmanBuild = "";
            int guessesLeft = 6;

            for (int i = 0; i<hangmanAnswer.length(); i++) {
                hangmanBuild = hangmanBuild + "X";
            }
                    while (continueGame) {
                        System.out.println("Guesses Left: " + guessesLeft);
                        System.out.println(hangmanBuild);
                            System.out.println("Guess a letter");
                            guessLetter = sc.nextLine();
                        String renderGuess = "";
                        for (int j = 0; j < hangmanAnswer.length(); j++) {
                            if (hangmanAnswer.substring(j,j+1).toLowerCase().equals(guessLetter.toLowerCase())) {
                                renderGuess += hangmanAnswer.substring(j,j+1);
                                continue;
                            }
                            renderGuess += hangmanBuild.substring(j,j+1);
                        }
                        hangmanBuild = renderGuess;
                        if (guessLetter.equals("exit")) {
                            continueGame = false;
                        }
                        if (hangmanAnswer.equals(hangmanBuild)) {
                            System.out.println(hangmanBuild);
                            System.out.println("Player Two Wins!");
                            continueGame = false;
                        }
                        if (guessesLeft == 1) {
                            System.out.println("Player One Wins!");
                            continueGame = false;
                        }
                        guessesLeft -= 1;
                    }
    }
}
