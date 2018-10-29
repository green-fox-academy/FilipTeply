import java.util.Arrays;
import java.util.List;

public class WorkshopExample1 {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        myList.stream()
                .filter(x -> x > 3)
               .forEach(System.out::println);
        //.forEach(x-> System.out.println(x));
    }

}
