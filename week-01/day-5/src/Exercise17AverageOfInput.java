// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4

import java.util.Scanner;

public class Exercise17AverageOfInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Give me an integer.");
        int v1 = scanner.nextInt();

        System.out.println("Give me an integer.");
        int v2 = scanner.nextInt();

        System.out.println("Give me an integer.");
        int v3 = scanner.nextInt();

        System.out.println("Give me an integer.");
        int v4 = scanner.nextInt();

        System.out.println("Give me an integer.");
        int v5 = scanner.nextInt();

        double sum = (v1+v2+v3+v4+v5);
        double average = sum/5;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }

}
