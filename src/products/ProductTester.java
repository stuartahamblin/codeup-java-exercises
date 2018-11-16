package products;

public class ProductTester {
//    ================================= INHERITANCE AND POLYMORPHISM BONUSES
//    BONUS #1
//    Experiment with inheritance and polymorphism for the following classes: Animal, Lizard, Dog.
//    Try extending the subtype of Dog further with a subtype of Pug
//    BONUS #2
//    Create a package called products that will hold all the classes for this bonus.
//    Create a class called ProductTester with a main method to test out the following...
//    Create a class of Product (this will be the parent class)
//            - add a few properties (like price, description, dateWhenAvailble, etc.) and methods appropriate for a
//              product a company may offer (the methods may simply sout out various messages like "ordering new products")
//    Create the following child classes: Item, Service, Subscription
//        - include a few additional properties and methods unique to each subclass
//        - override at least one method
//        - add an additional method that will call a parent method that has been overridden
//    Add a static property to ProductTester called products that will hold product objects.
//    Add a static method called addProduct in the ProductTester class that will create a
//            Product object based on a string name of the product subclass passed in to the method and create
//            a new array with the current product objects plus the new product object and store the array in
//    the products property on the ProductTester class
//    Add another static method to ProductTester called productCount that will return the number of
//    elements in the products array.
    public int price;
    public String description;
    public String dateWhenAvailable;
    public void ordering(){
        System.out.println("ordering new products");
    }
    public ProductTester(int price, String description, String dateWhenAvailable){
        this.price = price;
        this.description = description;
        this.dateWhenAvailable = description;
    }

    public ProductTester(){ // default constructor

    }
    public static void main(String[] args) {

    }
}
