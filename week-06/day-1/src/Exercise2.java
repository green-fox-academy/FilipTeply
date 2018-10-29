import java.util.*;

public class Exercise2 {

    //Write a Stream Expression to get the average value of the odd numbers from the following array:

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>
                (Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));


        OptionalDouble average = numbers.stream()
                .filter(n -> n % 2 != 0)
                .mapToInt(n -> n.intValue())
                //or
                // .mapToInt(Integer::intValue)
                .average();

        average.ifPresent(avg -> System.out.println(avg));
        //or
        // average.ifPresent(System.out::println);


//        IntSummaryStatistics statistics = numbers.stream()
//                .filter(n -> n % 2 != 0)
//                .mapToInt(n -> n.intValue())
//                //or
//                // .mapToInt(Integer::intValue)
//                .summaryStatistics();
//
//        int min = statistics.getMin();
//        int max = statistics.getMax();
//        int sum = statistics.getSum();
//
//        double avg = statistics.getAverage();

    }

}
