import java.util.Scanner;


public class MethodsExercises {
//        Exercises
//        Create a class named MethodsExercises. Inside of your class, write to code to create the specified methods.
//        Test your code by creating a main method and calling each of the methods you've created.

//        QUESTION 1
//          Create four separate methods. Each will perform an arithmetic operation:
//          -Addition
//          -Subtraction
//          -Multiplication
//          -Division
//          Each function needs to take two parameters/arguments so that the operation can be performed.
//          Test your functions and verify the output.
//          -Add a modulus function that finds the modulus of two numbers.
//          Food for thought: What happens if we try to divide by zero? What should happen?
//          todo Bonus
//          Create your multiplication method without the * operator (Hint: a loop might be helpful).
//          Do the above with recursion.
//              ANSWER
//              public static void main(String[] args) {
//                  System.out.println(addNumbers(1,2));
//                  System.out.println(subtractNumbers(5,1));
//                  System.out.println(multiplyNumbers(2,10));
//                  System.out.println(divideNumbers(100,2));
//                  System.out.println(modNumbers(50,2));
//              }
//
//              public static int addNumbers(int first, int second){
//                  return first + second;
//              }
//              public static int subtractNumbers(int first, int second) {
//                  return first - second;
//              }
//              public static int multiplyNumbers(int first, int second){
//                  return first*second;
//              }
//              public static int divideNumbers(int first, int second){
//                  return first/second;
//              }
//              public static int modNumbers(int first, int second){
//                  return first % second;
//              }

//        QUESTION 2
//          Create a method that validates that user input is in a certain range
//          The method signature should look like this:
//          EX: public static int getInteger(int min, int max);
//          and is used like this:
//          EX: System.out.print("Enter a number between 1 and 10: ");
//          int userInput = getInteger(1, 10);
//          If the input is invalid, prompt the user again.
//          Hint: recursion might be helpful here!
//              ANSWER
//              public static void main(String[] args) {
//                  getInteger(1,10);
//              }
//
//              public static int getInteger(int min, int max){
//                  Scanner sc = new Scanner(System.in);
//                  int between;
//                  do{
//                      System.out.println("Enter a value between " + min + " and " + max);
//                      between = sc.nextInt();
//                  } while (min >= between || max <= between);
//                  System.out.println("Value is between " + min + " and " + max);
//                  return between;
//              }

//        QUESTION 3
//          Calculate the factorial of a number.
//          Prompt the user to enter an integer from 1 to 10.
//          Display the factorial of the number entered by the user.
//          Ask if the user wants to continue.
//          Use a for loop to calculate the factorial.
//                  Assume that the user will enter an integer, but verify it’s between 1 and 10.
//          Use the long type to store the factorial.
//          Continue only if the user agrees to.
//          A factorial is a number multiplied by each of the numbers before it.
//                  Factorials are denoted by the exclamation point (n!). Ex:
//          1! = 1               = 1
//          2! = 1 x 2           = 2
//          3! = 1 x 2 x 3       = 6
//          4! = 1 x 2 x 3 x 4   = 24
//          Bonus
//          Test the application and find the integer for the highest factorial that can be accurately calculated by this
//          application, then modify the prompt so that it prompts the user for a number ("from 1 to {the highest integer " +
//          "that returns accurate factorial calculation}"). Don’t forget to change your verification too!
//          Use Recursion to implement the factorial.
//              ANSWER
//              public static void main(String[] args) {
//                  factorialNumber(1,10);
//              }
//
//              public static int getInteger(int min, int max){
//                  Scanner sc = new Scanner(System.in);
//                  int between;
//                  do{
//                      System.out.println("Enter a value between " + min + " and " + max);
//                      between = sc.nextInt();
//                  } while (min >= between || max <= between);
//                  System.out.println("Value is between " + min + " and " + max);
//                  return between;
//              }
//              public static int factorialNumber(int min, int max){
//                  Scanner sc = new Scanner(System.in);
//                  String userContinue;
//                  int factorialOf;
//                  do {
//                      factorialOf = getInteger(min, max);                                       //uncomment method above
//                      System.out.println("Do you want to compute the factorial? \n [y/n]");
//                      userContinue = sc.next();
//                  } while (!userContinue.equals("y"));
//                  int factorialValue = 1;
//                  for (int i = 1; i <= factorialOf; i++){
//                      factorialValue *= i;
//                      System.out.println(factorialValue);
//                  }
//                  return factorialOf;
//              }

//        QUESTION 4
//          Create an application that simulates dice rolling.
//                  Ask the user to enter the number of sides for a pair of dice.
//          Prompt the user to roll the dice.
//          "Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
//          Use static methods to implement the method(s) that generate the random numbers.
//          Use the .random method of the java.lang.Math class to generate random numbers.
//              ANSWER
//              public static void main(String[] args) {
//                  diceRoll();
//              }
//
//              public static int random(int maxNumber){
//                  int randomValue = (int )(Math.random() * maxNumber + 1);
//                  return randomValue;
//              }
//              public static int diceRoll(){
//                  Scanner sc = new Scanner(System.in);
//                  String userContinue;
//                  int diceSides;
//                  do {
//                      System.out.println("Enter a number of sides on the dice to roll");
//                      diceSides = sc.nextInt();
//                      System.out.println("Do you want to roll both " + diceSides + " sided dice? \n [y/n]");
//                      userContinue = sc.next().toLowerCase();
//                  } while (!userContinue.equals("y"));
//                  do {
//                      int diceOne = random(diceSides);
//                      int diceTwo = random(diceSides);
//                      System.out.println("First roll = " + diceOne);
//                      System.out.println("Second roll = " + diceTwo);
//                      System.out.println("Do you want to roll both " + diceSides + " sided dice again? \n [y/n]");
//                      userContinue = sc.next().toLowerCase();
//                  } while (!userContinue.equals("n"));
//                  return 0;
//              }

//                  do {
//                      System.out.println("Enter a number of sides on the dice to roll");
//                      diceSides = sc.nextInt();
//                      System.out.println("Do you want to roll both " + diceSides + " sided dice? \n [y/n]");
//                      userContinue = sc.next().toLowerCase();
//                  } while (!userContinue.equals("y"));

//    EXTRA function
//
//    public static void main(String[]args){
//        System.out.println(promptValueProceedLoop("Pick a number", "Proceed with value?"));
//        }
//                public static int promptValueProceedLoop(String promptStatement, String proceedStatement){
//                      String userProceed = "n";
//                      int proceedValue;
//                      do {
//                        Scanner sc = new Scanner(System.in);
//                        System.out.println(promptStatement);
//                        proceedValue = sc.nextInt();
//                        System.out.println(proceedStatement + "\n[y/n]" );
//                        userProceed = sc.next();
//                      } while (!userProceed.equalsIgnoreCase("y"));
//                      return proceedValue;
//                  }
//                                   -   -   -
//                                / \ / \ / \ / \
//                                 -   -   -   -
//                                \ / \ / \ / \ /
//                                   -   -   -
//                                / \ / \ / \ / \

//    ================================= METHOD BONUSES
//------ 1 ------
//    Create a vowel counting method for each vowel in the alphabet (not including y). Each method, when passed a string,
//    should return how many of that vowel is in the string. Given a string, use all of the these vowel counting methods
//    to output the count of each vowel in a word.
//    EXAMPLE...
//    INPUT: countVowels("cat")
//    OUTPUT:
//            |======== VOWEL COUNT ========|
//            | A's | E's | I's | O's | U's |
//            | 1   | 0   | 0   | 0   | 0   |
//            |=============================|
//    countVowels() will use...
//    countAs(),
//    countEs(),
//    countIs(),
//    countOs(),
//    and countUs()
//        ANSWER
//        public static void main(String[] args) {
//            countVowels("I always wanted to count all the vowels");
//        }
//        public static int countAs(String inputString){
//            int count = 0;
//            for(int i = 0; i < inputString.length(); i++) {
//                String testLetter = inputString.substring(i,i+1);
//                if (testLetter.equalsIgnoreCase("a")){
//                    count += 1;
//                }
//            }
//            return count;
//        }
//        public static int countEs(String inputString){
//            int count = 0;
//            for(int i = 0; i < inputString.length(); i++) {
//                String testLetter = inputString.substring(i,i+1);
//                if (testLetter.equalsIgnoreCase("e")){
//                    count += 1;
//                }
//            }
//            return count;
//        }
//        public static int countIs(String inputString){
//            int count = 0;
//            for(int i = 0; i < inputString.length(); i++) {
//                String testLetter = inputString.substring(i,i+1);
//                if (testLetter.equalsIgnoreCase("i")){
//                    count += 1;
//                }
//            }
//            return count;
//        }
//        public static int countOs(String inputString){
//            int count = 0;
//            for(int i = 0; i < inputString.length(); i++) {
//                String testLetter = inputString.substring(i,i+1);
//                if (testLetter.equalsIgnoreCase("o")){
//                    count += 1;
//                }
//            }
//            return count;
//        }
//        public static int countUs(String inputString){
//            int count = 0;
//            for(int i = 0; i < inputString.length(); i++) {
//                String testLetter = inputString.substring(i,i+1);
//                if (testLetter.equalsIgnoreCase("u")){
//                    count += 1;
//                }
//            }
//            return count;
//        }
//        public static int countVowels(String inputString){
//            System.out.println("|======== VOWEL COUNT ========|");
//            System.out.println("| A's | E's | I's | O's | U's |");
//            System.out.println("| "+countAs(inputString)+"   | " + countEs(inputString)+"   | " + countIs(inputString)+"   | "+countOs(inputString)+"   | "+countUs(inputString)+"   |");
//            System.out.println("|=============================|");
//            return countAs(inputString)+countEs(inputString)+countIs(inputString)+countOs(inputString)+countUs(inputString);
//        }

//------ 2 ------
//    Create a method that will return how many capital letters are in a string.
//        ANSWER
//        public static void main(String[] args) {
//            System.out.println(countCapitalLetters("I alWays"));
//        }
//        public static int countCapitalLetters(String inputString){
//            int count = 0;
//            for(int i = 0; i < inputString.length(); i++) {
//                String testLetter = inputString.substring(i,i+1);
//                if (!testLetter.toLowerCase().equals(testLetter)){
//                    count += 1;
//                }
//            }
//            return count;
//        }

//------ 3 ------
//    Create a method, getType() that will take in an input and return a string describing the type of the value.
//    Account for int, boolean, String, char, and double. Use method overloading.
//        ANSWER
//        public static void main(String[] args) {
//            System.out.println(getType("I alWays"));
//            System.out.println(getType('s'));
//            System.out.println(getType(5));
//            System.out.println(getType(5.5));
//            System.out.println(getType(true));
//        }
//        public static String getType(int input){
//            return "int";
//        }
//        public static String getType(boolean input){
//            return "boolean";
//        }
//        public static String getType(String input){
//            return "String";
//        }
//        public static String getType(char input){
//            return "char";
//        }
//        public static String getType(double input){
//            return "double";
//        }

//------ 4 ------
//    Create a method to print out every letter in a string using recursion.
//        ANSWER
//

//------ 5 ------
//    Create a method to determine if a string is a palindrome.
//        ANSWER

//    public static void main(String[] args) {
//
//    }
//    public static String isPalindrome(String input){
//        for(int i = 0; i < input.length(); ){
//
//        }
//        return
//    }

//------ 6 ------
//    Create a method that will convert a written out whole number from "zero" to "ninety-nine" and return the actual number.
//        ANSWER
//

//------ 7 ------
//    Create a command line calculator
//- the user may enter a number
//- the user may enter an operator
//- the user may enter a second number
//- the program should output a result, then prompt the user for another calculation
//        ANSWER
//

//------ 8 ------
//    Build a time conversion application:
//    The user should be prompted which time to enter (12 hour or 24 hour time), then the user should be able to enter a given time. The user should then see the converted time (12 hour to 24 hour or 24 hour to 12 hour)
//        ANSWER
//

//------ 9 ------
//    Create a command line Hangman game:
//            - prompt player 1 for a word
//  - player 2 (p2) has 9 guesses to correctly identify the word
//  - each round, display to the user...
//            1. the current visible letters of the word
//    2. the letters already incorrectly guessed
//    3. the number of guesses remaining
//  - at any round, they may guess a letter or multiple letters to complete the word
//    - if p2 guesses correctly, they WIN! and ask if they want to play again
//    - if p2 guesses wrong, they LOSE!
//            - if p2 runs out of guesses, they LOSE!
//        ANSWER
//

//------ 10 ------
//    Create date format converter application.
//    Take in the following format:
//    MM/DD/YYYY
//    Output the following:
//    MonthName DD, YYYY
//    Example:
//    input - 12/01/1999
//    output - December 12, 1999
//        ANSWER
//

//    public static void main(String[] args) {
//        sampleMethod();
//    }
//    public static String sampleMethod(String input){
//        return
//    }


}
