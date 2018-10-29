import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise10 {

    //Create a Fox class with 3 properties(name, type, color) Fill a list with at least 5 foxes,
    // it's up to you how you name/create them! Write a Stream Expression to find the foxes with green color!
    // Write a Stream Expression to find the foxes with green color and pallida type!

    public static void main(String[] args) {

        List<Fox> packOfFoxes;
               packOfFoxes = Arrays.asList(
                new Fox("Reineke", "pallida", "green"),
                new Fox("Foxie", "vulpes_vulpes", "green"),
                new Fox("Liska_Rysava", "pallida", "green"),
                new Fox("Bystrouska", "vulpes_vulpes", "blue"),
                new Fox("Zikmund", "vulpes_vulpes", "rusty")
        );

        List<Fox> pallidaGreen = packOfFoxes.stream()
                .filter(fox -> fox.color == "green" && fox.type == "pallida")
                .collect(Collectors.toList());


        System.out.println(pallidaGreen);

    }
}
