public class String3 {
    // Given a string, compute recursively a new string where all the
// adjacent chars are now separated by a "*".
    public static void main(String[] args) {

        System.out.println(adjacentCharSepar("aaabcdee"));
    }

    public static String adjacentCharSepar(String word) {

        if (word.length() == 1) {
            return word;
        } else {
            return word.charAt(0) + "*" + adjacentCharSepar(word.substring(1));
        }


    }

}

