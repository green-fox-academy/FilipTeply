//  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer

public class Summing {

    public static void main(String[] args) {

        int until = 4;
        System.out.println(sumUntil(until));

    }

    public static int sumUntil(int u){
        int s = 0;
        for (int i = 0; i <= u; i++) {

            s+=i;
        }

        return s;
    }

}
