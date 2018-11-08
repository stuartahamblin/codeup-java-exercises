import java.sql.SQLOutput;
import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
//        Exercises
//        For all of the following exercises, create a new class named ControlFlowExercises with a main method.
//        After each exercise, commit your changes, then replace your code in the main method with the next exercise.

//        1.Loop Basics
//
//              While:
//              Create an integer variable i with a value of 5.
//              Create a while loop that runs so long as i is less than or equal to 15
//              Each loop iteration, output the current value of i, then increment i by one.
//              Your output should look like this: 5 6 7 8 9 10 11 12 13 14 15
//
//                        ANSWER
//                        byte i = 5;
//                        while (i <= 15) {
//                            System.out.print(i + " ");
//                            i += 1;
//                        }

//              Do While:
//              Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//
//                        ANSWER
//                        byte i = 0;
//                        do {
//                            i += 2;
//                            System.out.println(i);
//                        } while (i < 100);

//              Alter your loop to count backwards by 5's from 100 to -10.
//
//                        ANSWER
//                        byte i = 100;
//                        do {
//                            i -= 5;
//                            System.out.println(i);
//                        } while (i > -10);

//              Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//              2
//              4
//              16
//              256
//              65536
//
//                        ANSWER
//                        long i = 2;
//                        do {
//                            System.out.println(i);
//                            i *= i;
//                        } while (i < 1000000);

//              For:
//              refactor the previous two exercises to use a for loop instead
//
//                        ANSWER
//                        for(long i = 2; i < 1000000; i *= i) {
//                            System.out.println(i);
//                        }

//        2. Fizzbuzz
//
//              One of the most common interview questions for entry-level programmers is the FizzBuzz test.
//              Developed by Imran Ghory, the test is designed to test basic looping and conditional logic skills.
//
//                      Write a program that prints the numbers from 1 to 100.
//              For multiples of three print “Fizz” instead of the number
//              For the multiples of five print “Buzz”.
//              For numbers which are multiples of both three and five print “FizzBuzz”.
//
//                        ANSWER
//                        long i = 1;
//                        do {
//                            if(i % 15 == 0) {
//                                System.out.println("FizzBuzz");
//                            } else if (i % 5 == 0) {
//                                System.out.println("Buzz");
//                            } else if (i % 3 == 0) {
//                                System.out.println("Fizz");
//                            } else {
//                                System.out.println(i);
//                            }
//                            i += 1;
//                        } while (i <= 100);

//        3. Display a table of powers.
//
//              Prompt the user to enter an integer.
//              Display a table of squares and cubes from 1 to the value entered.
//              Ask if the user wants to continue.
//              Assume that the user will enter valid data.
//              Only continue if the user agrees to.
//
//              Example Output
//              What number would you like to go up to? 5
//              Here is your table!
//                    number | squared | cubed
//                    ------ | ------- | -----
//                    1      | 1       | 1
//                    2      | 4       | 8
//                    3      | 9       | 27
//                    4      | 16      | 64
//                    5      | 25      | 125
//
//                        ANSWER
//                        Scanner sc = new Scanner(System.in);
//                        String askContinue = "N";
//                        int maxInteger;
//                        do {
//                            System.out.println("Please enter an integer");
//                            maxInteger = sc.nextInt();
//                            System.out.println("do you want to continue?");
//                            System.out.println("Y or N");
//                            askContinue = sc.next()toLowerCase();
//                        } while (!askContinue.equals("y"));
//                        System.out.println("number | squared | cubed");
//                        System.out.println("------ | ------- | -----");
//                        for (int i = 1; i <= maxInteger; i++) {
//                            int square = i*i;
//                            int cubed = i*i*i;
//                            System.out.printf("%s      | %s       | %s%n", i, square, cubed);
//                        }

//        4. Convert given number grades into letter grades.
//
//              Prompt the user for a numerical grade from 0 to 100.
//              Display the corresponding letter grade.
//                      Prompt the user to continue.
//              Assume that the user will enter valid integers for the grades.
//              The application should only continue if the user agrees to.
//              Grade Ranges:
//              A : 100 - 88
//              B : 87 - 80
//              C : 79 - 67
//              D : 66 - 60
//              F : 59 - 0
//
//                    Scanner sc = new Scanner(System.in);
//                    int grade;
//                    String askContinue = "N";
//                    do {
//                        System.out.println("Numerical grade from 0 to 100");
//                        grade = sc.nextInt();
//                        System.out.println("do you want to continue?");
//                        System.out.println("Y or N");
//                        askContinue = sc.next().toLowerCase();
//                    } while (!askContinue.equals("y"));
//                    if (grade >= 88) {
//                        System.out.println("Your letter grade is A");
//                    } else if (grade >= 80) {
//                        System.out.println("Your letter grade is B");
//                    } else if (grade >= 67) {
//                        System.out.println("Your letter grade is C");
//                    } else if (grade >= 60) {
//                        System.out.println("Your letter grade is D");
//                    } else {
//                        System.out.println("Your letter grade is F");
//                    }

//        Bonus
//        Edit your grade ranges to include pluses and minuses (ex: 99-100 = A+).
//
                   Scanner sc = new Scanner(System.in);
                   int grade;
                   String askContinue = "N";
                   do {
                       System.out.println("Numerical grade from 0 to 100");
                       grade = sc.nextInt();
                       System.out.println("do you want to continue?");
                       System.out.println("Y or N");
                       askContinue = sc.next().toLowerCase();
                   } while (!askContinue.equals("y"));
                   if (grade >= 97) {
                       System.out.println("Your letter grade is A+");
                   } else if (grade >= 95) {
                       System.out.println("Your letter grade is A");
                   } else if (grade >= 91) {
                       System.out.println("Your letter grade is A-");
                   } else if (grade >= 88) {
                       System.out.println("Your letter grade is B+");
                   } else if (grade >= 85) {
                       System.out.println("Your letter grade is B");
                   } else if (grade >= 80) {
                       System.out.println("Your letter grade is B-");
                   } else if (grade >= 77) {
                       System.out.println("Your letter grade is C+");
                   } else if (grade >= 75) {
                       System.out.println("Your letter grade is C");
                   } else if (grade >= 70) {
                       System.out.println("Your letter grade is C-");
                   } else if (grade >= 67) {
                       System.out.println("Your letter grade is D+");
                   } else if (grade >= 63) {
                       System.out.println("Your letter grade is D");
                   } else if (grade >= 60) {
                       System.out.println("Your letter grade is D-");
                   } else {
                       System.out.println("Your letter grade is F");
                   }



    }
}

