package shapes;
import util.Input;

import java.util.Scanner;

public class CircleApp {
//       Inside of shapes, create a class named CircleApp that promts the user for the radius of the circle using
//       your Input class, creates a Circle object, and displays the circumference and area. (Note that you will
//       need to import your Input class.)
//
//       The formulas for circumference and area:

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in)
    Input in = new Input(sc);
    System.out.println("Enter the Radius of the circle?");
    double userRadius = in.getDouble();
    Circle round = new Circle(userRadius);
    System.out.println(round.getArea());
    System.out.println(round.getCircumference());

}
}
