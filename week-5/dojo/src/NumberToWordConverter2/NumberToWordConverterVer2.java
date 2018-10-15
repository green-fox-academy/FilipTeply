//package NumberToWordConverter2;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class NumberToWordConverterVer2 {
//
//    public static void main(String[] args) {
//
//        //System.out.println(noToWordConverter(21));
//
//        ArrayList<String> unitWords = new ArrayList<String>(Arrays.asList("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"));
//        String stringOut = "";
//
//        int factor = 10;
//        int units = 0;
//        int number = 321;
//        units = number % 10;
//        System.out.println(units);
////        for (int i = 0; i < 10; i++) {
////            if (i == units) {
////                stringOut.concat("one");
////            }
////        }
//
//        System.out.println(stringOut);
//
//
//    }
//
//    public static String noToWordConverter(int number) {
//
//        ArrayList<String> unitWords = new ArrayList<String>(Arrays.asList("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"));
//        String stringOut = "";
//
//        //units in integers
//        int factor = 10;
//        int units;
//        units = number % 10;
//        for (int i = 0; i < 10; i++) {
//            if (units == i) {
//                stringOut.concat(unitWords.get(i));
//            }
//        }
//
//        return stringOut;
//
//
//    }
//
//
//}
