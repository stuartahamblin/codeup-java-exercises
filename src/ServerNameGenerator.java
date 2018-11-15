public class ServerNameGenerator {
// 2. Server Name Generator
//
//    We are going to build a server name generator. Create a class inside of src named ServerNameGenerator, and follow the specs below.
//
//    Create two arrays whose elements are strings, one with at least 10 adjectives, another with at least 10 nouns.
//    Create a method that will return a random element from an array of strings.
//    Add a main method, and inside of your main method select and random noun and adjective and hyphenate the
//    combination and display the generated name to the user.
//            Example Output
//    Here is your server name:
//    dedicated-photon
public static String randomElement(String[] sampleArray){
    int picker = MethodsExercises.random(sampleArray.length-1,0);
    return sampleArray[picker];
}
//    public static void main(String[] args) {
//        String[] adjectives = {"beautiful", "fast", "smart", "feminine", "athletic", "collaborative", "cool", "considerate", "wise", "mature"};
//        String[] nouns = {"dog", "girl", "racket", "ball", "sidewalk", "screen", "rainbow", "water", "universe", "air"};
//        System.out.println("Here is your server name: ");
//        System.out.println(randomElement(adjectives) + "-" + randomElement(nouns));
//    }
}
