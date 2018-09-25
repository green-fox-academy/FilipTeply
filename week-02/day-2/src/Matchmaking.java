import java.util.*;

public class Matchmaking {
    public static void main(String... args) {
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));
        System.out.println(girls);
        System.out.println(boys);

    }

    public static ArrayList<String> makingMatches(ArrayList<String> a, ArrayList<String> b) {

        ArrayList<String> pairs = new ArrayList<>();

        for (int i = 0; i < a.size(); i++) {
            pairs.add(a.get(i));
            pairs.add(b.get(i));
        }
        return pairs;

    }


}
