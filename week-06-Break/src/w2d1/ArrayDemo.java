package w2d1;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {

        // intializing an array arr1
        int[] arr1 = new int[]{45, 32, 75};

        //or longer form
        // int[] arr1 = new int[3];
        //arr1 = new int[] {45, 32, 75};


        // printing the array
        System.out.println("Printing 1st array:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        // copying array arr1 to arr2 with newlength as 5
        int[] arr2 = Arrays.copyOf(arr1, 5);
        arr2[3] = 11;
        arr2[4] = 55;

        // printing the array arr2
        System.out.println("Printing new array arr2:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        int[] arr2b = Arrays.copyOf(arr2, 3);
        System.out.println("Printing new array arr2b:");
        System.out.println(Arrays.toString(arr2b));

        // copying array arr2 to arr3 in range 1 to 4 (4 excluded)
        int[] arr3 = Arrays.copyOfRange(arr2, 1, 4);
        System.out.println("Printing new array arr3:");
        System.out.println(Arrays.toString(arr3));

        int[] arr4 = Arrays.copyOf(arr1,5);
    }
}