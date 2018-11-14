package util;
import java.util.Scanner;

public class Input {
//    3. Create an input validation class
//       Create directory inside of src named util. Inside of util, create a class named Input that has a private
//       property named scanner. When an instance of this object is created, the scanner property should be set to
//       a new instance of the Scanner class. The class should have the following methods, all of which return
//       command line input from the user:
//       String getString()
//       boolean yesNo()
//       int getInt(int min, int max)
//       int getInt()
//       double getDouble(double min, double max)
//       double getDouble()
//       The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.
//       -The getInt(int min, int max) method should keep prompting the user for input until they give an integer
//       within the min and max. The getDouble method should do the same thing, but with decimal numbers.
//       -Create another class named InputTest that has a static main method that uses all of the methods from
//       the Input class.
//       Bonus
//       Allow all of your methods for getting input to accept an optional string parameter named prompt. If passed,
//       the method should show the given prompt to the user before parsing the input.
    private Scanner scanner = new Scanner(System.in);
    private String newString = "This is a sentence";
    public Input(Scanner scanner){
        this.scanner = scanner;
    }
    public String getString() {
        return scanner.nextLine();
    }
    public boolean yesNo() {
        String input = getString();
        return (input.equalsIgnoreCase("y")||input.equalsIgnoreCase("yes"));
    }

    public int getInt(){
        if(!scanner.hasNextInt()){
            System.out.println("not an integer. Please try again.");
            scanner.nextLine();
            return getInt();
        } else {
            return scanner.nextInt();
        }
    }
    public int getInt(int min, int max){
        int userInput;
        do{
            System.out.println("Please enter a value between " + min + " and " + max);
            userInput = this.scanner.nextInt();
        } while (min >= userInput || max <= userInput);
        return userInput;
    }


    public double getDouble(double min, double max){
        double userInput;
        do{
            System.out.println("Please enter a value between " + min + " and " + max);
            userInput = this.scanner.nextDouble();
        } while (min >= userInput || max <= userInput);
        return userInput;
    }
    public double getDouble(){
        return this.scanner.nextDouble();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Input in = new Input(sc);
//        System.out.println("enter fav color");
//        String favColor = in.getString();
//        System.out.println("Are you awesome?");
//        System.out.println(in.yesNo());
//        System.out.println(in.getInt(1,15));
//        System.out.println(in.getDouble(.01,.1));
//        System.out.println(in.getInt());


    }
}