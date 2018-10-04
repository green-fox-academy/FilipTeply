public class Strings2 {

    // Given a string, compute recursively a new string where all the 'x' chars have been removed.
    public static void main(String[] args) {

        System.out.println(removeX("XXXyxxxxxxxxxxxxxxxxxxxxabadxy"));
    }

    public static String removeX(String word) {

        return word.replace("x", "");
    }
}
