package w2d1;

import java.util.Arrays;

public class ReverseList {

    // - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`

    public static void main(String[] args) {

        int[] aj = {3, 4, 5, 6, 7};

        System.out.println("This is an original array ja: " + Arrays.toString(aj));


        //array copy is not needed as the original array aj is not overwritten
        // int[] ja = Arrays.copyOf(aj, 5);

        System.out.println("This is a reversed array ja: " + Arrays.toString(reverseArray(aj)));

    }

    public static int[] reverseArray(int[] arr) {

        int[] revArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {

            revArr[i] = arr[arr.length - i - 1];

        }
        return revArr;
    }
}


