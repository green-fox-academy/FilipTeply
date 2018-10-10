public class CountLetters {

    String word;
    int count;

    public CountLetters() {
    }

    public int countLet(String word) {

        for (int i = 0; i < word.length(); i++) {
            count++;
        }
        return count;
    }

//    Write a function, that takes a string as an argument and returns a dictionary with all letters in the string as keys, and numbers as values that shows how many occurrences there are.
//    Create a test for that.

}
