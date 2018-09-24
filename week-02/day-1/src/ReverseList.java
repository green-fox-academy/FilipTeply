// - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`

public class ReverseList {

    public static void main(String[] args) {
        int[] aj ={3, 4, 5, 6, 7};
        int[] ja = new int[aj.length];



        for (int i = 0; i < aj.length; i++) {
            System.out.print(aj[i] + " ");
        }
        System.out.println();

        reverseArray(aj, ja);

        for (int i = 0; i < aj.length; i++) {
            System.out.print(ja[i] + " ");
        }
        System.out.println();


        for (int i = 0; i < aj.length; i++) {
            System.out.print(aj[i] + " ");
        }
        System.out.println();
    }

public static void reverseArray(int[] a, int[] b){

    for (int i = 0; i < a.length ; i++) {

        b[i] = a[a.length-i-1];
        System.out.print(b[i] + " ");
    }
    System.out.println();
        
}





}
