package w2d1;

import java.util.Arrays;

public class ArraySort {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 10, 1, 8};
        int[] arr1s = Arrays.copyOf(arr1, 5);
        System.out.println("Array arr1s to be sorted: " + Arrays.toString(arr1s));

        Arrays.sort(arr1s);
        System.out.println("Array arr1s after sorting: " + Arrays.toString(arr1s));


// Our arr contains 8 elements
        int[] arr = {13, 7, 6, 45, 21, 9, 101, 102};

        Arrays.sort(arr);

        System.out.printf("Modified arr[] : %s",
                Arrays.toString(arr));

        System.out.println();

//String array to be sorted
        String[] strArr = {"cda", "a", "cad", "yyy", "opp", "xxx"};
        String[] strArrSort = Arrays.copyOf(strArr, 6);

        System.out.println("Array of Strings strArrSort to be sorted: " + Arrays.toString(strArrSort));

        Arrays.sort(strArrSort);

        System.out.println("Array of Strings strArrSort after sorting: " + Arrays.toString(strArrSort));

    }


}
