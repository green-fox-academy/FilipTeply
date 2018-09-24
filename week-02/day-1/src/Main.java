import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int[] numsToSort = new int[10];

        for (int i = 0; i < numsToSort.length; i++ ) {
            numsToSort[i] = (int) (Math.random() *100 );
        }

        Arrays.sort(numsToSort);
        System.out.println(Arrays.toString(numsToSort));

        int whereIs50 = Arrays.binarySearch(numsToSort, 50);
        System.out.println(whereIs50);
    }
}
