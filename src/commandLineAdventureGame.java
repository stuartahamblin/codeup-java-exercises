import java.sql.SQLOutput;
import java.util.Scanner;
public class commandLineAdventureGame {
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
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Welcome to the Make it home game!");
                    System.out.println("(1: Store) or (2: Park)");
                    System.out.println("Pick 1 or 2");
                    int direction1 = sc.nextInt();
                    if (direction1 == 1) {
                        System.out.println("(1: School)  or  (2: Park)");
                        System.out.println("Pick 1 or 2");
                        int direction2 = sc.nextInt();
                        if (direction2 == 2) {
                            System.out.println("YOU MADE IT HOME! YOU WIN!");
                        } else {
                            System.out.println("Teacher had to call your parents to pick you up. GAME OVER!");
                        }
                    } else {
                        System.out.println("(1: Zoo)  or  (2: Pool)");
                        System.out.println("Pick 1 or 2");
                        int direction3 = sc.nextInt();
                        if (direction3 == 1) {
                            System.out.println("You got eaten by a lion. GAME OVER!");
                        } else {
                            System.out.println("You drowned in the pool. GAME OVER!");
                        }
                    }

//        2. Create a command line Hangman game...
//           Prompt a player 1 to enter a word for player 2 to guess.
//           Track the number of guesses by player 2. Display to the user the partially completed word
//           String lesson methods will be helpful for this bonus
//
//            todo

    }
}
