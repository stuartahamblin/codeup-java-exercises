import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JavaPracticeFeb {
//    public static void main(String[] args) { Scanner in = new Scanner(System.in);
//        5
//        System.out.println("input first number");
//        int num1 = in.nextInt();
//        System.out.println("input second number");
//        int num2 = in.nextInt();
//        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
//        System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
//        System.out.println(num1 + " x " + num2 + " = " + num1*num2);
//        System.out.println(num1 + " / " + num2 + " = " + num1/num2);
//        System.out.println(num1 + " mod " + num2 + " = " + num1%num2);

//        7
//        System.out.println("input number to add to multiplication table");
//        int multiTableInput = in.nextInt();
//        for(int i = 1; i <= 10; i++){
//            System.out.println(multiTableInput + " x " + i + " = " + (multiTableInput*i));
//        }

//        9
//        System.out.println(((25.5*3.5)-(3.5*3.5))/(40.5-4.5));

//        11
//        double radius = 7.5;
//        System.out.println("parameter is = " + 2*Math.PI*radius);
//        System.out.println("Area is = " + Math.PI*Math.pow(radius,2));

//        13
//        final double width = 5.6;
//        final double height = 8.5;
//        double perimeter = 2*(height + width);
//        double area = height*width;
//        System.out.printf("Perimeter is 2*(%f + %f) = %f \n", height,width,perimeter);
//        System.out.printf("Aera is %.1f * %.1f = %.2f",width,height,area);

//        32
//        System.out.println("Input first integer");
//        int num1 = in.nextInt();
//        System.out.println("Input second integer");
//        int num2 = in.nextInt();
//        System.out.println(num1 != num2);
//        System.out.println(num1 < num2);
//        System.out.println(num1 <= num2);

//        33
//        System.out.println("Input an integer");
//        long num = in.nextLong();
//        System.out.println("The sum of the digits is: " + sumDigits(num));
//    }
//    public static int sumDigits(long n){
//        int sum = 0;
//        while (n != 0) {
//            System.out.println("sum = " + sum + ", n = " + n);
//            sum += n % 10;
//            System.out.println("sum += n % 10, sum = " + sum);
//            n /= 10;
//            System.out.println("n /= 10, n = " + n);
//        }
//        return sum;
//    }


//    public static void main(String[] args) { Scanner in = new Scanner(System.in);
//        39
//        int amount = 0;
//        for(int i = 1; i <= 4; i++){
//            for(int j = 1; j <= 4; j++){
//                for(int k = 1; k <= 4; k++){
//                    if(k != i && k != j && i != j){
//                        amount++;
//                        System.out.println(i + "" + j + "" + k);
//                    }
//                }
//            }
//        }
//        System.out.println(amount);

//        51
//        System.out.println("Input a number(string)");
//        String str1 = in.nextLine();
//        int result = Integer.parseInt(str1);
//        System.out.printf("The integer value is: %d", result);
//    }

//public static void main(String[] args) {
//    Scanner in = new Scanner(System.in);

//    array exercises 2
//    double[] values = {1,3,4,5};
//    double sum = 0;
//    for(int i = 0 ; i < values.length ; i++){
//        sum += values[i];
//    }
//    System.out.println(sum/values.length);

//    11
//    double[] values = {1,3,4,5};
//    System.out.println(Arrays.toString(arrayCopy(values)));
//}
//    public static double[] arrayCopy(double[] val){
//        double[] output = new double[val.length];
//        int arrayPick = 0;
//        for(int i = val.length - 1 ; i >= 0 ; i--){
//            output[i] = val[arrayPick];
//            arrayPick++;
//        }
//        return output;
//    }

//    17
//    int[] values = {3,5,1,7,8};
//    Arrays.sort(values);
//    System.out.println(Arrays.toString(values));
//    int secondLarge = values[values.length-2];
//    System.out.println("Second largest value is " + secondLarge);

//    20
//    String[] array = {"banana", "apple", "orange"};
//    ArrayList<String> changeArray = new ArrayList<String>(Arrays.asList(array));
//    System.out.println(changeArray);

//    26
//    int[] values = {0,1,2,0,5,3,1,0};
//    for(int i = 0 ; i < values.length ; i ++){
//        if(values[i] == 0){
//            for(int j = i ; j < values.length -1 ; j++){
//                values[j] = values[j+1];
//            }
//            values[values.length-1] = 0;
//        }
//    }
//    System.out.println(Arrays.toString(values));
//}

//    34
//    int[] values = {49,1,3,200,2,4,70,5};
//    Arrays.sort(values);
//    int maxIncreasing = 1;
//    int increasing = 1;
//    for(int i = 0 ; i < values.length -1 ; i++){
//        if(values[i] + 1 == values[i+1]){
//            increasing += 1;
//        } else {
//            if(increasing > maxIncreasing){
//                maxIncreasing = increasing;
//            }
//            increasing = 1;
//        }
//    }
//    System.out.println("the largest number incrementing sorted values is " + maxIncreasing);
//}

//    public static <list> void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        collection 1
//        List<String> stringList = new ArrayList<String>();
//        stringList.add("Banana");
//        stringList.add("Green");
//        stringList.add("Orange");
//        System.out.println(stringList);
//    }
//}

    private static String eats(){
        return "nom nom nom";
    }

    public String chops(){
        return "eating eating";
    }

    protected String name;


    public static void main(String[] args) {
        System.out.println(JavaPracticeFeb.eats());
//        System.out.println(JavaPracticeFeb.chops());    DOES NOT WORK BECAUSE NO JavaPracticeFeb CLASS INSTANTIATED
        JavaPracticeFeb test = new JavaPracticeFeb();
        System.out.println(test.chops());;
//        System.out.println(test.eats());                DOES NOT WORK BECAUSE THIS METHOD IS STATIC

    }
}

