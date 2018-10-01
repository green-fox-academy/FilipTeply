import java.util.ArrayList;
import java.util.Arrays;

public class test2 {
    public static void main(String... args) {
        // Create a function that takes a list as a parameter,
        // and returns a new list with every second element from the orignal list
        // example: [1, 2, 3, 4, 5] should produce [2, 4] - print this result


        ArrayList<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(everySecondItem(listOfNumbers));


        System.out.println(listOfNumbers);


    }

    public static ArrayList everySecondItem(ArrayList<> list1) {

        ArrayList<String> newList = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 != 0) {
                newList.add(list1.get(i));
            }

        }
    }

}