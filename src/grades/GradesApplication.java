package grades;

import util.Input;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public void commandLineInterface(HashMap<String, Student> sampleHashMap) {
        System.out.println("Welcome! \nHere are the github usernames of our students:");

    }

public static void main(String[] args) {
    Student Newt = new Student("Newt Scamander");
    Newt.addGrade(90);
    Newt.addGrade(92);
    Newt.addGrade(93);
    Student Lillian = new Student("Lillian Potter");
    Lillian.addGrade(87);
    Lillian.addGrade(85);
    Lillian.addGrade(84);
    Student Queenie = new Student("Queenie Goldstein");
    Queenie.addGrade(93);
    Queenie.addGrade(90);
    Queenie.addGrade(89);
    HashMap<String, Student> students = new HashMap<>();
    students.put("hufflepuff", Newt);
    students.put("gryffindor", Lillian);
    students.put("ravenclaw", Queenie);

    System.out.println("Welcome! \nHere are the github usernames of our students:");
    String displayNames = "";
    for (int i = 0; i < students.size(); i += 1) {
        displayNames += "|" + students.keySet().toArray()[i] + "| ";
    }
    String seeAnother;
    do {
        System.out.println("What student would you like to see more information on?");
        System.out.println(displayNames);
        Scanner sc = new Scanner(System.in);
        Input in = new Input(sc);
        String userInput = sc.nextLine();
        String allThings = "name,github_username,average\n";
        boolean pickedInput = students.containsKey(userInput);
            if (!pickedInput){
                if (userInput.equalsIgnoreCase("all")){
                    for (int i = 0; i < students.size(); i += 1) {
                        allThings += students.get(students.keySet().toArray()[i]).getName() + ",";
                        allThings += students.keySet().toArray()[i] + ",";
                        allThings += students.get(students.keySet().toArray()[i]).getGradeAverage() + "\n";
                    }
                    System.out.println(allThings);
                } else {
                    System.out.println("Sorry, no student found with the github username of " + userInput + ".");
                }
            } else {
                System.out.println("Name: " + students.get(userInput).getName() + " - Github Username: " + userInput);
                System.out.format("Current Average: %.2f%n", students.get(userInput).getGradeAverage());
            }
        do {
            System.out.println("Would you like to see another student? \n[y/n]");
            seeAnother = sc.nextLine();
        } while ((!seeAnother.equalsIgnoreCase("y")&&!seeAnother.equalsIgnoreCase("n")&&!seeAnother.equalsIgnoreCase("no")));
    } while (seeAnother.equalsIgnoreCase("y"));
    System.out.println("Goodbye, and have a wonderful day!");
}
}
