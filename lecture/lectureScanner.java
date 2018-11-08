import java.util.Scanner;
public class lectureScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int userInt = sc.nextInt();

        System.out.printf("You entered %d%n", userInt);

        System.out.print("Please enter two words: ");
        String first, second;
        first = sc.nextLine();
        second = sc.nextLine();

        System.out.println("first word: " + first + "\nsecond word: " + second);

        // ========== Explanation of why first word is blank after running the above code

        // total example user input a user will enter throughout the execution of the above
        String totalExampleUserInput = "5\none\ntwo\n";

        // nextInt() or next() just takes the 5...
        int resultOfNextInt = 5;
        // leaving...
        String afterNextInt = "\none\ntwo\n";

        // first nextLine() takes the new line character only
        String resultOfFirstNextLine = "\n";
        // leaving...
        String afterfirstNextLine = "one\ntwo\n"; // storing only a seemingly empty string

        // second nextLine() takes the one and new line character
        String resultOfSecondNextLine = "one\n";
        // leaving...
        String aftersecondNextLine = "two\n";


        // How to work around this behavior???
        // 1) Read the Stack Overflow link I posted in the Slack Channel
        // 2) tl;dr...
        // if you use a next(), nextInt(), or nextDouble before a nextLine()
        // add an extra nextLine() before the first nextLine() you are using

    }

}