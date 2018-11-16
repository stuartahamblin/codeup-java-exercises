package shapes;

public class Square extends Quadrilateral {
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
    public double side;
    public Square(double side) {
        super(side, side);
    }
    public double getLength() {
        return super.getLength();
    }
    public void setLength(double side) {
        super.length = side;
        super.width = side;
    }
    public void setWidth(double side) {
        super.width = side;
        super.length = side;
    }

    public double getArea(){
        return Math.pow(this.length, 2);
    }
    public double getPerimeter(){
        return 4 * length;
    }


}
