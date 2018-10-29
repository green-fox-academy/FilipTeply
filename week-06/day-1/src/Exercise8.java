import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise8 {

    //Write a Stream Expression to find the frequency of numbers in the following array:

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>
                (Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2));

        Map<Integer, Long> frequencyOfNumbers = numbers.stream()
                //.mapToInt(n->(Integer)n)
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        System.out.println(frequencyOfNumbers);

        Map<Integer, Long> frequencyOfNumbers = numbers.stream() .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

    }

}
