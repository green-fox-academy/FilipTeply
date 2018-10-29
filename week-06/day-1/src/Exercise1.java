import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;

//Write a Stream Expression to get the even numbers from the following array:

public class Exercise1 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>
                (Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));


        numbers.stream()
                .filter(x -> x % 2 == 0)
                //.collect(Collector.toList());
                .forEach(System.out::println);

        List<Integer> evenNumbers =
                numbers.stream()
                        .filter(x -> x % 2 == 0)
                        .collect(Collectors.toList());

        System.out.println(evenNumbers);

        //for odd numbers
        List<Integer> oddNumbers =
                numbers.stream()
                        .filter(x -> x % 2 != 0)
                        .collect(Collectors.toList());

        System.out.println(oddNumbers);

    }
}
