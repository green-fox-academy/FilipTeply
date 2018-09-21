// Write a program that asks for two integers
// The first represents the number of chickens the farmer has
// The second represents the number of pigs owned by the farmer
// It should print how many legs all the animals have

import java.util.Scanner;

public class Exercise16AnimalsAndLegs {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("How many chicken the farmer has?");
            int chicken = scanner.nextInt();
            System.out.println("How many pigs the farmer has?");
            int pigs = scanner.nextInt();

            System.out.println(chicken + " chicken and " + pigs + " pigs have " + (chicken*2 + pigs*4) + " legs altogether.");

        }
    }



