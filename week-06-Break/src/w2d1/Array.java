package w2d1;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 4, 7};


        System.out.println(arr1.toString());
        System.out.println(Arrays.toString(arr1));

        int[][] arr2D = {{1, 8}, {4, 7}};
        System.out.println(Arrays.toString(arr2D));

        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.println((arr2D[i][j]));
            }
        }

        for (int i = 0; i < arr2D.length; i++) {
            System.out.println(Arrays.toString(arr2D[i]));
        }

        // String[] array = new String[] {"John", "Mary", "Bob"};
        //or shorter
        String[] array = {"John", "Mary", "Bob"};
        System.out.println(Arrays.toString(array));

        int[][] arr2Dver2 = {{0, 2, 7}, {2}, {1, 11}};
        for (int i = 0; i < arr2Dver2.length; i++) {
            System.out.println(Arrays.toString(arr2Dver2[i]));
        }




    }
}
