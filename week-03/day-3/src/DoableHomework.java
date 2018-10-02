import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class DoableHomework {
//    Create 5 trees
//    Store the data of them in variables in your program
//for every tree the program should store its'
//    type
//    leaf color
//    age
//    sex

//    you can use just variables, or lists and/or maps

    public static void main(String[] args) {

        ArrayList<ArrayList<String>> tree1 = new ArrayList<ArrayList<String>>();
        ArrayList<ArrayList<String>> tree2 = new ArrayList<ArrayList<String>>();
        ArrayList<ArrayList<String>> tree3 = new ArrayList<ArrayList<String>>();
        ArrayList<ArrayList<String>> tree4 = new ArrayList<ArrayList<String>>();
        ArrayList<ArrayList<String>> tree5 = new ArrayList<ArrayList<String>>();


        tree1.add(new ArrayList<String>(Arrays.asList("type", "leafColor", "age", "sex")));
        tree2.add(new ArrayList<String>(Arrays.asList("type", "leafColor", "age", "sex")));
        tree3.add(new ArrayList<String>(Arrays.asList("type", "leafColor", "age", "sex")));
        tree4.add(new ArrayList<String>(Arrays.asList("type", "leafColor", "age", "sex")));
        tree5.add(new ArrayList<String>(Arrays.asList("type", "leafColor", "age", "sex")));

        for (int i = 0; i < tree1.size(); i++) {
            for (int j = 0; j < tree1.get(i).size(); j++) {
                System.out.println(tree1.get(i).get(j));
            }

        }
//        ArrayList<ArrayList<String>> trees = new ArrayList<ArrayList<String>>();
//        ArrayList<ArrayList<String>> properties = new ArrayList<ArrayList<String>>();
//
//        trees.add(new ArrayList<String>(Arrays.asList("Tree1", "Tree2", "Tree3", "Tree4", "Tree5")));
//        trees.add(new ArrayList<String>(Arrays.asList("type", "leafColor", "age", "sex")));
//
//
//        for (int i = 0; i < trees.size(); i++) {
//
//            for (int j = 0; j < trees.get(i).size(); j++) {
//                System.out.println(trees.get(i).get(j));
//            }


    }


//    public static HashMap<String, String> defineTree (){}


}
