public class Strings1 {
    // Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.


    public static void main(String[] args) {

        System.out.println(xToyfunction("avghhsxyyxx"));

    }

    public static String xToyfunction(String s) {

        if (s.contains("x") == false) {
            return s;
        } else {
            if()


            return s.substring(0, s.length()). + xToyfunction();

            ) .charAt((s.substring(s.length()) xToyfunction(s.replace('x', 'y'));
        }

    }


}

//
//    public static String xToyfunction(String s) {
//
//
//        if (s.contains("x") == false) {
//            return s;
//        } else {
//            return xToyfunction(s.replace('x', 'y'));
//        }
//
//    }