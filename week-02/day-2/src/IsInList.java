

import java.util.*;

public class IsInList{
    public static void main(String... args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
        //checkNums(list);
        // Check if list contains all of the following elements: 4,8,12,16
        // Create a method that accepts list as an input
        // it should return "true" if it contains all, otherwise "false"


        System.out.println(checkIfInList(list, 4,8,13,16));

    }

    public static boolean checkIfInList(ArrayList<Integer> a, int i1, int i2, int i3, int i4) {

        if (a.contains(i1) && a.contains(i2) && a.contains(i3) && a.contains(i4)) {
            return true;
                    }
        else {
            return false;
        }

    }


}