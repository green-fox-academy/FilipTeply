// - Create an array variable named `abc`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `abc`

public class SwapElements {

    public static void main(String[] args) {
        String[] abc = {"first", "second", "third"};

        for (int i = 0; i < abc.length; i++) {
            System.out.println(abc[i]);
        }

        swap(abc, 0, 2);


        for (int i = 0; i < abc.length; i++) {
            System.out.println(abc[i]);
        }

    }

    public static void swap(String[] a, int x, int y){

        String z;

        z = a[x];

        a[x] = a[y];
        a[y] = z;

    }

}
