import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise6 {

    //Write a Stream Expression to find the strings
    // which starts with A and ends with I in the following array:

    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>
                (Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));

        List<String> citiesStartingAendingI =
                cities.stream()
                        .filter(str -> str.startsWith("A"))
                        .filter(str -> str.endsWith("I"))
                        .collect(Collectors.toList());

        System.out.println(citiesStartingAendingI);



    }

}
