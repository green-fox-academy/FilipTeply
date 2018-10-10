public class Fibonacci {

    public Fibonacci() {
    }


    public int fibonacciSeries(int n) {
        if (n<=1) {
            return n;
        } else {
            return fibonacciSeries(n - 1) + fibonacciSeries(n - 2);
        }
    }
}

//    Write a function that computes a member of the
//        fibonacci sequence by a given index
//        Create tests that covers all types of input
//        (like in the previous workshop exercise)

//// The fibonacci sequence is a famous bit of mathematics, and it happens to
//// have a recursive definition. The first two values in the sequence are
//// 0 and 1 (essentially 2 base cases). Each subsequent value is the sum of the
//// previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21
//// and so on. Define a recursive fibonacci(n) method that returns the nth
//// fibonacci number, with n=0 representing the start of the sequence.