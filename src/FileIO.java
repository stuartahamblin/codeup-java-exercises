import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

import static java.nio.file.Files.getFileStore;
import static java.nio.file.Files.readAllLines;

public class FileIO {
//      Exercises
//      Create a method for retrieving file contents.
//          The method should accept a string that is the location of the file, and return a list of strings
//          where each string is a line in the file.

    public static void retrieveFileContents(Path path){
        try {
            System.out.println(Files.readAllLines(path));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        ArrayList<String> writingFile = new ArrayList<>();
//        writingFile.add("Banana");
//        writingFile.add("Mango");
//        writingFile.add("Grape Fruit");
//
//        System.out.println(writingFile);
//        Path p = Paths.get(".","newFile.txt");
//        try {
//            Files.write(p,writingFile, StandardOpenOption.APPEND);
//            System.out.println(Files.readAllLines(p));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        retrieveFileContents(p);
        String[] names = {"Rick", "Stacey", "Brad", "Becca"};
        String x;
        try {
            x = names[100];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught!");
            x = "";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("This will always run.");
        }
    }
}
