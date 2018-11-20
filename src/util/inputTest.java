package util;
import java.util.Scanner;

public class inputTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Input in = new Input(sc);
//        System.out.println(in.getString());
//        System.out.println(in.yesNo());
//        System.out.println(in.getInt(10,16));
//        System.out.println(in.getDouble(.005, .1000));

//        System.out.println(in.getInt());
//        System.out.println(in.getDouble());
//        Integer.valueOf(3);
//        try {
//            Double.valueOf("4.5");
//        } catch(NumberFormatException e){
//            System.out.println("this is a double");
//        }
        System.out.println(in.getDouble(10,15));
    }
}
