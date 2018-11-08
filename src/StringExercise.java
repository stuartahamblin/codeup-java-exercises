import java.sql.SQLOutput;
import java.util.Scanner;
public class StringExercise {
    public static void main(String[] args) {

//     Exercises
//     1. String Basics. Create a class named StringExercise with a main method.
//        -For each of the following output examples, create a string variable named message that contains the
//         desired output and print it out to the console.
//        -Do this with only one string variable and one print statement.

//        We don't need no education
//        We don't need no thought control
//                ANSWER
                String message = "We don't need no education \nWe don't need no thought control";
//                System.out.println(message);
//        Check "this" out!, "s inside of "s!
//                ANSWER
                message += "\n\nCheck \"this\" out!, \"s inside of \"s\"";
//                System.out.println(message);
//        In windows, the main drive is usually C:\
//                ANSWER
                message += "\n\nIn windows, the main drive is usually C:" + "\\";
//                System.out.println(message);
//        I can do backslashes \, double backslashes \\,
//        and the amazing triple backslash \\\!
//                ANSWER
                message += "\n\nI can do backslashes \\, double backslashes \\\\ \nand the amazing triple backslash \\\\\\!";
                System.out.println(message);

    }
}
