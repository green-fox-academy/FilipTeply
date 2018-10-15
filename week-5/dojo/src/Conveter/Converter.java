package Conveter;

import java.util.ArrayList;
import java.util.Arrays;

public class Converter {

    public static void main(String[] args) {


    }

    public static String noToWordConverter(int number) {

        ArrayList<String> unitWords = new ArrayList<String>(Arrays.asList("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"));
        ArrayList<String> tensWords = new ArrayList<String>(Arrays.asList(null, "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"));

        String stringOut = "";


        //units in 3-digit integers
        int units;

        //tens in 3-digit integers
        int tens;
        int hundreds;
        int numberStrippedFromUnits;

        units = number % 10;
        tens = ((number % 100) - units) / 10;
        hundreds = (number - tens - units) / 100;

        numberStrippedFromUnits = number - units;

        if (number > 100) {
            for (int i = 0; i < 10; i++) {
                if (hundreds == i) {
                    stringOut = stringOut.concat(unitWords.get(i) + " hundred ");
                }
            }
        } else if (number % 100 != 0) {
            stringOut = stringOut.concat(" and ");
        }


        if (number >= 20) {
            for (int i = 0; i < 10; i++) {
                if (tens == i) {
                    stringOut = stringOut.concat(tensWords.get(i));
                }
            }
        } else if (number < 20) {
            stringOut = stringOut.concat(" and ");

        }


            for (int i = 0; i < 10; i++) {
                if (units == i) {
                    stringOut = stringOut.concat(" " + unitWords.get(i));
                }
            }

        return stringOut;


    }


}
