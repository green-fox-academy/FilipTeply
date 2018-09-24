//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial

public class Factorial {

    public static void main(String[] args) {

        int number = 3;

        System.out.println(factorio(number));

    }

    public static int factorio(int f) {
               int product = 1;

        for (int i = 1; i <= f  ; i++) {

            product*=i;

        }
        return product;
    }
    
}
