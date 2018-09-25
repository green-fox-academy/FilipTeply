import java.util.ArrayList;

public class Reverse {
    public static void main(String... args){
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";



        // Create a method that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.

        System.out.println(reverse(reversed));
        System.out.println(reverse(reverse(reversed)));
        System.out.println(reverse(reverse(reverse(reversed))));
    }

    public static String reverse(String a) {

        String rev = "";

        for (int i = 0; i < a.length(); i++) {

            rev = rev.concat("" + a.charAt(a.length() - i -1));

        }
        return rev;

    }


}

//    String s1="hello";
//    char[] ch=s1.toCharArray();
//for(int i=0;i<ch.length;i++){
//        System.out.print(ch[i]);
//    }
//
//    char[] ch = a.toCharArray();
//
//
//
//        for (int i = 0; i < ch.length; i++) {
//        char[] r = new char[ch.length];
//        r[i] = ch[ch.length - i - 1];
//        System.out.print(r[i]);
//
//        ch
//
//
//        }



