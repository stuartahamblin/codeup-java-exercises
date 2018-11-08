import java.sql.SQLOutput;
import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
//        Exercises

//        QUESTION S1Q1:
//        For the following exercises, create a new class named ConsoleExercises with a main method like the one in your HelloWorld class.
//        Copy this code into your main method:
//          double pi = 3.14159;
//        Write some java code that uses the variable pi to output the following:
//          The value of pi is approximately 3.14.
//        Don't change the value of the variable, instead, reference one of the links above and use System.out.format to accomplish this.
//
//              ANSWER S1Q1:
//              double pi = 3.14159;
//              System.out.printf("The value of pi is approximately %.2f", pi);
//
//              ALT ANSWER
//              double pi = 3.14159;
//              String piMessage = String.format("The value of pi is approximately %.2f", pi);
//              System.out.printf(piMessage);

//        Explore the Scanner Class

//        QUESTION S2Q1. Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
//
//              ANSWER S2Q1:
//              Scanner sc = new Scanner(System.in);
//              System.out.println("ENTER AN INTEGER");
//              int integer = sc.nextInt();
//              System.out.println(integer);
//
//           What happens if you input something that is not an integer?
//
//              error

//        QUESTION S2Q2. Prompt a user to enter 3 words and store each of them in a separate variable, then display them back, each on a newline.
//
//                ANSWER S2Q2:
//                Scanner sc = new Scanner(System.in);
//                System.out.println("ENTER 3 WORDS");
//                String word1 = sc.next();
//                String word2 = sc.next();
//                String word3 = sc.next();
//                System.out.printf("%s%n%s%n%s", word1, word2, word3);     // or     System.out.printf("%s\n%s\n%s", word1, word2, word3);
//
//            What happens if you enter less than 3 words?
//
//                it will continue to prompt for more inputs
//
//            What happens if you enter more than 3 words?
//
//                it only records the first 3

//        QUESTION S2Q3. Prompt a user to enter a sentence, then store that sentence in a String variable using the .next method, then display that sentence back to the user.
//
//                ANSWER S2Q3:
//                Scanner sc = new Scanner(System.in);
//                System.out.println("ENTER A SENTENCE");
//                String word1 = sc.next();
//                System.out.println(word1);
//
//            do you capture all of the words?
//
//                just the first word // stops when it hits white space

//        QUESTION S2Q4. Rewrite the above example using the .nextLine method.
//
//                ANSWER S2Q4:
//                Scanner sc = new Scanner(System.in);
//                System.out.println("ENTER A SENTENCE");
//                String word1 = sc.nextLine();
//                System.out.println(word1);
//
//                captured the whole sentence

//        Calculate the perimeter and area of Codeup's classrooms

//        QUESTION S3Q1. Prompt the user to enter values of length and width of a classroom at Codeup.
//                       Use the .nextLine method to get user input and cast the resulting string to a numeric type.
//                       -Assume that the rooms are perfect rectangles.
//                       -Assume that the user will enter valid numeric data for length and width.
//
//                ANSWER S3Q1:
//                Scanner sc = new Scanner(System.in);
//                System.out.println("WHAT IS THE LENGTH OF THE CODEUP CLASSROOM");
//                int length = Integer.parseInt(sc.nextLine());
//                System.out.println("WHAT IS THE WIDTH OF THE CODEUP CLASSROOM");
//                int width = Integer.parseInt(sc.nextLine());
//                int area = length * width;
//                String message = String.format("The area of the Codeup Classroom is %d", area);
//                System.out.println(message);

//        QUESTION S3Q2. Display the area and perimeter of that classroom.
//                       The area of a rectangle is equal to the length times the width, and the perimeter of a
//                       rectangle is equal to 2 times the length plus 2 times the width.
//
//                ANSWER S3Q2:
//                Scanner sc = new Scanner(System.in);
//                System.out.println("WHAT IS THE LENGTH OF THE CODEUP CLASSROOM");
//                int length = Integer.parseInt(sc.nextLine());
//                System.out.println("WHAT IS THE WIDTH OF THE CODEUP CLASSROOM");
//                int width = Integer.parseInt(sc.nextLine());
//                int area = length * width;
//                int perimeter = 2*length + 2*width;
//                String message = String.format("The area of the Codeup Classroom is %d", area);
//                System.out.println(message);
//                String message1 = String.format("The perimeter of the Codeup Classroom is %d", perimeter);
//                System.out.println(message1);

        // todo
//        BONUSES
//        Accept decimal entries
//        Calculate the volume of the rooms in addition to the area and perimeter
//
//                ANSWER BONUS:
//                Scanner sc = new Scanner(System.in);
//                System.out.println("WHAT IS THE LENGTH OF THE CODEUP CLASSROOM");
//                int length = sc.nextInt();
//                System.out.println("WHAT IS THE WIDTH OF THE CODEUP CLASSROOM");
//                int width = sc.nextInt();
//                int area = length * width;
//                int perimeter = 2*length + 2*width;
//                System.out.println("The area of the Codeup Classroom is " + area);
//                System.out.println("The perimeter of the Codeup Classroom is " + perimeter);

//        ================================= CONSOLE IO BONUSES
        // todo
//        BONUS 1
//        Prompt the user to enter a favorite quote
//        Output the quote
//        Ask them to enter how many words are in the quote
//        Output the number they entered
//        Output if the number they entered indeed matched the number of words

        // todo
//        BONUS 2
//        Prompt the user to enter a list of top three favorite foods separated by only spaces
//        Use the printf() to output the three top foods with the format:
//        1) FirstFood
//        2) SecondFood
//        3) ThirdFood

        // todo
//        BONUS 3
//        Prompt the user to enter a grocery list of three items
//        Each item should only be separated by a comma (no spaces)
//        You will need to use the .useDelimiter() method on your scanner object
//        Output the result as a comma-separated list using printf()

    }
}
