package w2d1;

public class PrintParams {

    //  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `printParams`
//   which prints the input String parameters
// - It can have any number of parameters

// Examples
// printParams("first")
// printParams("first", "second")
// printParams("first", "second", "third", "fourh")
// ...
//------------
    //my comment
    // instead of usual (String[] args)
    // (String... args)

    public static void main(String[] args) {

        printParams("first");
        printParams("first", "second");
        printParams("first", "second", "third");

    }

    public static void printParams(String... params) {

        for (String str : params) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
}
