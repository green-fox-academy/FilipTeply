package w2d1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Unique {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as a parameter
        //  Returns a list of numbers where every number in the list occurs only once

        //  Example
        System.out.println(unique(new int[]{1, 11, 34, 11, 52, 61, 1, 34}));
        //  should print: `[1, 11, 34, 52, 61]`

        System.out.println(unique(new int[]{1, 11, 34, 11, 52, 61, 1, 34, 2, 2}));
        //prints [1, 2, 11, 34, 52, 61]

        System.out.println(uniqueInNumberSeries(1, 11, 34, 11, 52, 61, 1, 34, 1, 1, 1, 1));
        //prints [1, 11, 34, 52, 61]

    }

    public static ArrayList uniqueInNumberSeries(Integer... numbers) {

        ArrayList<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(numbers));
        //or
        //ArrayList<Integer> listOfIntegers = new ArrayList<Integer>(Arrays.asList(numbers));

        Collections.sort(listOfIntegers);

        for (int i = 0; i < listOfIntegers.size() - 1; i++) {
            if (listOfIntegers.get(i) == listOfIntegers.get(i + 1)) {
                listOfIntegers.remove(i);
                i--;
            }
        }
        return listOfIntegers;
    }

    public static ArrayList unique(int[] arr) {
        ArrayList<Integer> listOfUniqueIntegers = new ArrayList<Integer>();
        Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            listOfUniqueIntegers.add(arr[i]);
        }

        for (int i = 0; i < listOfUniqueIntegers.size() - 1; i++) {
            if (listOfUniqueIntegers.get(i) == listOfUniqueIntegers.get(i + 1)) {
                listOfUniqueIntegers.remove(i);
                i--;
            }
        }
        return listOfUniqueIntegers;
    }
}
