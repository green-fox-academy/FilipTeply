// - Create an array variable named `p1`
//   with the following content: `[1, 2, 3]`
// - Create an array variable named `p2`
//   with the following content: `[4, 5]`
// - Print if `p2` has more elements than `p1`

public class CompareLength {

    public static void main(String[] args) {

        int[] p1 = {1, 2, 3};
        int[] p2 = {4, 5, 0, 0};


        printLongerArray(p1, p2);

    }

    public static void printLongerArray(int[] a, int[] b){

        int x = a.length;
        int y = b.length;

        if (y > x) {
            System.out.println("The longer array + b + has the following elements: ");

            for (int i = 0; i < y; i++) {
                System.out.println(b[i] + " ");
            }
        }
        //else {
        //System.out.println("Array " + b + " is not longer than array" + a);
        //}


    }

}
