
import java.util.*;

public class QuoteSwapVer2{
    public static void main(String... args){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

        // Accidentally I messed up this quote from Richard Feynman.
        // Two words are out of place
        // Your task is to fix it by swapping the right words with code
        // Create a method called quoteSwap().



        System.out.println(list);

        System.out.println(quoteSwap(list));



        // Also, print the sentence to the output with spaces in between.
       // System.out.println(quoteSwap(list));
        // Expected output: "What I cannot create I do not understand."
        System.out.println(quoteString(list));






    }

    public static ArrayList<String> quoteSwap(ArrayList<String> arrayList) {


        String prov = arrayList.get(2);
        arrayList.set(2, arrayList.get(5));
        arrayList.set(5, prov);

        return arrayList;


    }

    public static String quoteString(ArrayList<String> arrayListEdit1) {
        String quote = "";

        for (int i = 0; i < arrayListEdit1.size(); i++) {

            quote += " " + arrayListEdit1.get(i);

        }
        return quote;
    }


}