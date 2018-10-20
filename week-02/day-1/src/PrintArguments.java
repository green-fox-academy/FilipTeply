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

public class PrintArguments {


    public static void main(String[] args) {

        String[] words = {"first", "second", "third"};

        System.out.println(words.length);
        printParams(words);


    }

    public static void printParams(String[] params) {


        for (int i = 0; i < params.length; i++) {

            System.out.print(params[i] + " ");
        }

    }

}
