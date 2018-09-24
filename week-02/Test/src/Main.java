import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int[] numToSort = new int[10];

        for (int i = 0; i < numToSort.length; i++ ) {
            numToSort[i] = (int) (Math.random() * 100 );
        }

        System.out.println(numToSort.toString(numToSort));

    }
}

