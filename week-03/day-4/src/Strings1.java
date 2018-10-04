public class Strings1 {
    // Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.


    public static void main(String[] args) {

        System.out.println(xToyfunction("XXxaxxvghhsxyxxyxx"));

    }

    public static String xToyfunction(String s) {

        return s.replace('x', 'y');


    }
}

//// unsuccessful attempt at recursive solution
//    public static String xToyfunction(String s) {
//
//        if (s.substring(1)) == 'y') {
//            return s;
//        } else if (s.substring(1).charAt(0)) == 'x') {
//            return 'y' + xToyfunction(s.substring(1));
//        }
//        else {
//            return "error";
//        }
//
//    }