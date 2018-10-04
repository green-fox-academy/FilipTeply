public class SumDigit {

    public static int s = 0;
    // Given a non-negative int n, return the sum of its digits recursively (no loops).
// Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
// divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

    public static void main(String[] args) {

        System.out.println(sumDigit(123));
    }


    public static int sumDigit(int n) {

        if (n / 10 == 0) {
            return n;

        } else {
            return sumDigit(n / 10) + n%10;
        }

    }

}
