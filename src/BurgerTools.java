public class BurgerTools {
//    -- SHORT ASSIGNMENT #2 (part 1) --
//    Create a class of static properties and methods called BurgerTools
//    Include a string property of mostPopularTopping
//    Include an int property of averageDaysBeforeExpiration
//    Include an int property of temperatureWhenCooked
//    Include a void method called grill() that prints out "Grilling burger"
//    Create a class called BurgerTester to test assigning and printing property values
//            and testing methods.
//
//    If you have time, add additional properties and methods.
    public String mostPopularTopping;
    public static int averageDaysBeforeExpiration = 5;
    public int temperatureWhenCooked = 100;
    public int currentTempurature;
    public void grill(){
        currentTempurature = 150;
        System.out.println("Grilling burger");
    }
}
