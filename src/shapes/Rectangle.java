package shapes;

public class Rectangle extends Quadrilateral implements Measurable{
//    Shapes
//
//    Inside of your shapes directory, create a class named Rectangle. It should have protected properties for both
//    length and width. Rectangle should define a constructor that accepts two numbers for length and width, and sets
//    those properties.
//
//    Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values. The
//    formulas for both follow:
//
//    perimeter = 2 x length + 2 x width
//    area = length x width
//    Create a class named Square, also inside of shapes, that extends Rectangle. Square should define a constructor
//    that accepts one argument, side, and calls the parent's constructor to set both the length and width to the
//    value of side.
//
//    Test your code by creating a new class, ShapesTest (also inside of shapes) with a main method. Inside the main method,
//
//    -create a variable of the type Rectangle named box1 and assign it a new instance of the Rectangle class with
//     a width of 4 and a length of 5
//    -verify that the getPerimeter and getArea methods return 18 and 20, respectively.
//    -create a variable of the type Rectangle named box2 and assign it a new instance of the Square class that
//     has a side value of 5.
//    -verify that the getPerimeter and getArea methods return 20 and 25, respectively.
//    In the Square class, override the getArea and getPerimeter methods with the following definitions for a square
//
//    perimeter = 4 x side
//    area = side ^ 2
//    Re-run your ShapesTest class. How can you determine which getArea and getPerimeter methods are being called on each object?
    protected double length;
    protected double width;
    public Rectangle(double length, double width) {
        super(length,width);
    }
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }

    public double getArea(){
        return this.length * this.width;
    }
    public double getPerimeter(){
        return 2*this.length + 2*this.width;
    }

    public static void main(String[] args) {
        Rectangle pointy = new Rectangle(5,3);
        System.out.println(pointy.getArea());
        System.out.println(pointy.getPerimeter());
    }

    public void setLength(double length) {
        super.length = length;
    }

    public void setWidth(double width) {
        super.width = width;
    }
}
