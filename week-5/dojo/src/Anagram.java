import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
//        String aWord = "Clint Eastwood";
//        String bWord = "Old West Action";
        //aWord = aWord.toLowerCase();
        //aWord = aWord.replaceAll("\\s+","");
        //bWord = bWord.toLowerCase();
        //bWord = bWord.replaceAll("\\s+","");
        //System.out.println(anagram(aWord,bWord));
    }


    public static boolean anagram(String aWord, String bWord) {
        //aWord = aWord.replaceAll("\\s+","");
        //bWord = bWord.replaceAll("\\s+","");
        //aWord = aWord.replaceAll("-","");
        //bWord = bWord.replaceAll("-","");
        aWord = aWord.toLowerCase();
        bWord = bWord.toLowerCase();
        //replaces all non-character and non/numeric strings with empty string
        aWord = aWord.replaceAll("[^A-Za-z0-9]", "");
        bWord = bWord.replaceAll("[^A-Za-z0-9]", "");


//return value.replaceAll("[^A-Za-z0-9]", "");
        char[] tempArrayA = aWord.toCharArray();
        char[] tempArrayB = bWord.toCharArray();

        Arrays.sort(tempArrayA);
        Arrays.sort(tempArrayB);
        return (Arrays.equals(tempArrayA, tempArrayB));
    }
}

