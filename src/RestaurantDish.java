public class RestaurantDish {
//    -- OOP SHORT ASSIGNMENT #1 --
//
//    Create a class called "RestaurantDish" (you should not include quotes)
//
//    Include an integer property called "costInCents"
//    Include a string property called "nameOfDish"
//    Include a boolean property called "wouldRecommend"
//    Include a method called "eat"
//            this method will print out "Nom nom nom!"
//



    public int costInCents;
    public String nameOfDish;
    public boolean wouldRecommend;
    public int eat(){
        System.out.println("Nom nom nom!");
        return 0;
    }
    public void setPrice(){
        costInCents = 50;
    }
}
