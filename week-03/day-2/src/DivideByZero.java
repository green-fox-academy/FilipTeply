
import java.util.Scanner;

public class DivideByZero {

    // Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int divisor = sc.nextInt();

        divide10ByNumber(divisor);

    }

    public static void divide10ByNumber(int divisor) {

        int result =  10 / divisor;
        try {
            System.out.println(result);

        } catch (ArithmeticException except) {
            System.out.println("Fail");
        }

    }


}

