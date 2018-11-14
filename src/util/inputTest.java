package util;
import java.util.Scanner;

public class inputTest {
    public static void main(String[] args) {
        Input in = new Input(new Scanner(System.in));
        System.out.println(in.getString());
        System.out.println(in.yesNo());
//        System.out.println(in.getInt(10,16));
//        System.out.println(in.getDouble(.005, .1000));

    }
}
