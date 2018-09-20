
// Create a program that writes this line 100 times:
// "I won't cheat on the exam!"

public class Exercise23 {

    public static void main(String[] args) {
        int a = 0;
        while (a < 100) {
            System.out.println(a + " I won't cheat on the exam!");
            a += 1;
        }

        for (int i = 0; i < 100; i++) {
            System.out.println(i + " and I won't cheat on the exam!"); // Prints the numbers from 0 to 99
        }


    }

}
// for (int i = 0; i < 100; i++) {
//        System.out.println(i + " I won't cheat on the exam!"); // Prints the numbers from 0 to 99
//        }