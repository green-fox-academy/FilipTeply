package Dominoes;

import Dominoes.Domino;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DominoesMain {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
        // You have the list of Dominoes
        // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
        // eg: [2, 4], [4, 3], [3, 5] ...
        Collections.sort(dominoes);
//        List<Domino> orderedDominoes = new ArrayList<>();
//        orderedDominoes.add(dominoes.get(0));
//        dominoes.remove(0);
//
//        while (dominoes.size() != 0) {
//
//            for (int j = 0; j < dominoes.size(); j++) {
//                if (orderedDominoes.get(orderedDominoes.size() - 1).getValues()[1] == dominoes.get(j).getValues()[0]) {
//
//                    orderedDominoes.add(dominoes.get(j));
//                    dominoes.remove(j);
//                }
//            }
//        }


        System.out.println(dominoes);
    }


    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }
}
