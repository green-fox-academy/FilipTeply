package Conveter;

import java.util.ArrayList;
import java.util.Arrays;

public class Converter {

    public static void main(String[] args) {

        //System.out.println(noToWordConverter(321));
        System.out.println(noToWordConverter(119));


    }

    public static String noToWordConverter(int number) {

        ArrayList<String> unitWords = new ArrayList<String>(Arrays.asList("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"));
        ArrayList<String> tensWords = new ArrayList<String>(Arrays.asList(null, "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"));
        ArrayList<String> teenWords = new ArrayList<String>(Arrays.asList(null, "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"));
        String stringOut = "";


        //units in 3-digit integers
        int units;

        //teens, tens, hundreds in 3-digit integers
        int teens;
        int tens;
        int hundreds;
        int numberStrippedFromUnits;

        units = number % 10;
        teens = ((number % 20));
        tens = ((number % 100) - units) / 10;
        hundreds = (number - tens - units) / 100;

        //System.out.println(number - hundreds * 100);
        System.out.println(hundreds + " " + tens + " " + teens + " " + units);

        //numberStrippedFromUnits = number - units;

        //hundreds "one hundred" - "nine hundred"
        if (number > 100) {
            for (int i = 0; i < 10; i++) {
                if (hundreds == i) {
                    stringOut = stringOut.concat(unitWords.get(i) + " hundred");
                }
            }
            //gives and when tens and/or units follow hundreds
        }
        if (number > 100 && number % 100 != 0) {
            stringOut = stringOut.concat(" and ");
        }
        //gives tens "twenty" to "ninety"
        if (number >= 20) {
            for (int i = 0; i < 10; i++) {
                if (tens == i) {
                    stringOut = stringOut.concat(tensWords.get(i)+ " ");
                }
            }
        }
        if (number == 10 || (number - hundreds * 100)==10) {
            stringOut = stringOut.concat("ten");
        }

        //gives teens "eleven" to "nineteen"

        if ((number < 20 && number > 10 || (number > 100 && (number - hundreds * 100) < 20) && (number - hundreds * 100) > 10) ||
                ((number > 100 && (number - hundreds * 100) < 20) && (number > 100 && (number - hundreds * 100) > 10))) {
            for (int i = 0; i < 10; i++) {
                if (teens == i) {
                    stringOut = stringOut.concat(teenWords.get(i));
                }
            }
        }

//gives units "one" to "nine"
        if (number < 10
                || (number > 100 && (number - hundreds * 100) < 10)
                || (number > 100 && (number - hundreds * 100) > 20)) {
            for (int i = 0; i < 10; i++) {
                if (units == i) {
                    stringOut = stringOut.concat(unitWords.get(i));
                }
            }
        }
        return stringOut;
    }
}

