// - Create an array variable named `numList`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Double all the values in the array

public class DoubleItems {

    public static void main(String[] args) {

        int[] numList = {3, 4, 5, 6, 7};

        printArray(numList);
        printDoubledArray(numList);
        printArray(numList);
        doubleAndprintArray(numList);
        printArray(numList);


    }


    public static void printArray(int[] a) {


        for (int i = 0; i < a.length; i++) {


            System.out.print(a[i] + ", ");
        }

        System.out.println();
    }

    public static void printDoubledArray(int[] a) {


        for (int i = 0; i < a.length; i++) {

            System.out.print(a[i]*2 + ", ");
        }

        System.out.println();
    }

    public static void doubleAndprintArray(int[] a) {


        for (int i = 0; i < a.length; i++) {

            a[i]*=2;

            System.out.print(a[i] + ", ");
        }

        System.out.println();
    }








}

//    public static void doubleValues(int[] a){
//
//        for (int i = 0; i < a.length ; i++) {
//
//        double = a[i]
//
//
//        }
//
//    }
