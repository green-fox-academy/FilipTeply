public class Counter {

    // Write a recursive function that takes one parameter: n and counts down from n.
    public static void main(String[] args) {

        countDown(99);

    }

    public static int countDown(int n) {

        if (n == 0) {
            System.out.println(n);
            return 0;
        } else {
            return countDown(n - 1);
        }

    }
}


