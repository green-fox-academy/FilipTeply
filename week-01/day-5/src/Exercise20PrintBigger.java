// Write a program that asks for two numbers and prints the bigger one

import java.util.Scanner;

public class Exercise20PrintBigger {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number.");
        double num1 = scanner.nextDouble();

        System.out.println("Give me another number.");
        double num2 = scanner.nextDouble();

        if (num1>num2) {
            System.out.println("Number " + num1 + " is bigger.");
        }
            else if (num1<num2) {
                System.out.println("Number " + num2 + " is bigger.");
            }

            else if (num1 == num2){
                System.out.println("The two numbers are equal.");
            }


        }

    }


