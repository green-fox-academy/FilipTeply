import java.util.Scanner;

public class Refactorio {
    // Create a recursive function called `refactorio`
// that returns it's input's factorial
    public static void main(String[] args) {

        System.out.println("Give me your number.");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(refactorio(n));

    }

    public static int refactorio(int n) {

        if (n == 1) {
            return 1;
        } else {
            return n * refactorio(n - 1);

        }
    }

}
