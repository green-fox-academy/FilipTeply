public class NumberAdder {
    // Write a recursive function that takes one parameter: n and adds numbers from 1 to n.

    public static void main(String[] args) {

        System.out.println(addNumbers(4));

    }

    public static int addNumbers(int n) {
        if (n == 0) {
            return 0;
        } else {

            // System.out.println("The actual sum after " + n + "th cycle is " + n);
            return addNumbers(n - 1) + n;
        }

    }
}

