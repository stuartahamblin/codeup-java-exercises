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

//    -- SHORT ASSIGNMENT #2 (part 2) --
//    Refactor your RestaurantDish and RestaurantTest classes...
// 1) Change your public properties in your RestaurantDish class to private
// 2) Add getters and setters for these properties (write them manually then erase them and use IntelliJ to do this quickly)
// 3) Refactor code used in RestaurantTest to set and print these property values...
//            ...to use your getters and setters
// 4) Add a constructor method to RestaurantDish that will assign property...
//            ...values based on arguments passed into the constructor

    private String mostPopularTopping;
    private static int averageDaysBeforeExpiration = 5;
    private int temperatureWhenCooked = 100;
    private int currentTempurature = 70;
    private void grill(){
        currentTempurature = 150;
        System.out.println("Grilling burger");
    }

// CONSTRUCTOR
    public BurgerTools(String mostPopularTopping, int temperatureWhenCooked, int currentTempurature) {
        this.mostPopularTopping = mostPopularTopping;
        this.temperatureWhenCooked = temperatureWhenCooked;
        this.currentTempurature = currentTempurature;
    }

// GETTERS
    public String getMostPopularTopping() {
        return mostPopularTopping;
    }
    public static int getAverageDaysBeforeExpiration() {
        return averageDaysBeforeExpiration;
    }
    public int getTemperatureWhenCooked() {
        return temperatureWhenCooked;
    }
    public int getCurrentTempurature() {
        return currentTempurature;
    }
// SETTER
    public void setMostPopularTopping(String mostPopularTopping) {
        this.mostPopularTopping = mostPopularTopping;
    }
    public static void setAverageDaysBeforeExpiration(int averageDaysBeforeExpiration) {
        BurgerTools.averageDaysBeforeExpiration = averageDaysBeforeExpiration;
    }
    public void setTemperatureWhenCooked(int temperatureWhenCooked) {
        this.temperatureWhenCooked = temperatureWhenCooked;
    }
    public void setCurrentTempurature(int currentTempurature) {
        this.currentTempurature = currentTempurature;
    }
}
