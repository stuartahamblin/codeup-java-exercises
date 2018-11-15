import java.util.Arrays;

public class ArraysExercises {
//    Exercises
// 1. Array Basics
//
//    Create a class inside of src named ArraysExercises. Create a main method for this class to do your work
//
//    What happens when you run the following code? Why is Arrays.toString necessary?
//    int[] numbers = {1, 2, 3, 4, 5};
//    System.out.println(numbers);
//
//    Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element.
//    Iterate through the array and print out the name of each person in the array.
//
//    Create a static method named addPerson. It should accept an array of Person objects, as well as a single
//    person object to add to the passed array. It should return an array whose length is 1 greater than the
//    passed array, with the passed person object at the end of the array.

public static Person[] addPerson(Person[] personArray, Person newPerson){
    Person[] morePeople = Arrays.copyOf(personArray, personArray.length + 1);
    morePeople[morePeople.length-1] = newPerson;
    return morePeople;
}

//    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
//        Person[] people = new Person[3];
//        people[0] = new Person("Juan");
//        people[1] = new Person("Kyla");
//        people[2] = new Person("Benny");
//        Person addedPerson = new Person("Steven");
//        for (int i = 0; i<people.length; i++){
//            System.out.println(people[i].getName());
//        }
//        Person[] evenMorePeople = addPerson(people, addedPerson);
//        for (int i = 0; i < evenMorePeople.length; i++){
//            System.out.println(evenMorePeople[i].getName());
//        }
//    }

// 2. Server Name Generator
//
//    We are going to build a server name generator. Create a class inside of src named ServerNameGenerator, and follow the specs below.
//
//    Create two arrays whose elements are strings, one with at least 10 adjectives, another with at least 10 nouns.
//    Create a method that will return a random element from an array of strings.
//    Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.
//            Example Output
//    Here is your server name:
//    dedicated-photon


// 3. Movie List
//
//    We are going to build an application that keeps track of movies and displays them by category.
//
//    Inside of src, create a directory named movies. Create all of the classes described below in this directory.
//    Create a class named Movie. It should have private fields for name and category, and a constructor that sets both of these. Create methods to access these properties and change them (getters and setters).
//    Download the MoviesArray file and save it as MoviesArray.java inside of movies. This class has a static method named findAll that will return an array of Movie objects.
//    Create a class named MoviesApplication that has a main method.
//    Give the user a list of options for viewing all the movies or viewing movies by category.
//    Use your Input class to get input from the user, and display information based on their choice. (Remember to import your Input class)
//    If a category is selected, only movies from that category should be displayed.
//    Your application should continue to run until the user chooses to exit.
//    Sample Output
//
//
//    What would you like to do?
//
//            0 - exit
//1 - view all movies
//2 - view movies in the animated category
//3 - view movies in the drama category
//4 - view movies in the horror category
//5 - view movies in the scifi category
//
//    Enter your choice: 1
//
//    Frankenstein -- horror
//    Goodfellas -- drama
//    Pulp Fiction -- drama
//...
//    Bonus
//
//    Add functionality to allow a user to add a new movie to the list.
}
