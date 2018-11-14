import java.util.*;
import java.util.stream.Collectors;

public class Hand {

    //HighCard = 1
    //Pair = 2
    //TwoPairs = 3
    //ThreeOfAKind = 4
    //Straight = 5
    //Flush = 6
    //FullHouse = 7
    //FourOfAKind = 8
    //StraightFlush = 9
    //RoyalFlush = 10

    public Hand(List<Card> cardsInHand) {
        this.cardsInHand = cardsInHand;
    }

    List<Card> cardsInHand;

    Card c1;
    Card c2;
    Card c3;
    Card c4;
    Card c5;

    int handAValue;
    int handBValue;

    List<Card> getCardsInHand;


    public Hand() {

        List<Card> cardsInHand = Arrays.asList(c1, c2, c3, c4, c5);
    }

    public Hand(Card c1, Card c2, Card c3, Card c4, Card c5) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.c4 = c4;
        this.c5 = c5;
    }


    public static List<Card> sortHand(List<Card> cardsInHand) {
        List<Card> cardsInHandSorted;
        cardsInHandSorted = cardsInHand.stream()
                .sorted(Comparator.comparingInt(Card::getId))
                .collect(Collectors.toList());
        return cardsInHandSorted;
    }

    public static int giveHandValue(List<Card> cardS) {
        int handvalue = 0;
        if (isRoyalFlush(cardS)) handvalue = 10;
        else if (isFlush(cardS) && isStraight(cardS)) handvalue = 9;
        else if (isFourOfAKind(cardS)) handvalue = 8;
        else if (isFullHouse(cardS)) handvalue = 7;
        else if (isFlush(cardS)) handvalue = 6;
        else if (isStraight(cardS)) handvalue = 5;
        else if (isThreeOfAKind(cardS)) handvalue = 4;
        else if (isTwoPairs(cardS)) handvalue = 3;
        else if (isOnePair(cardS)) handvalue = 2;
        else if (isHighCard(cardS)) handvalue = 1;

        return handvalue;

    }

    public static String whoWins(Hand handA, Hand handB) {
        int handAValue;
        int handBValue;

        if (handAValue > handBValue) return "White wins!";
        else if (handAValue < handBValue) return "Black wins!";
        else return function(handA, handB);
    }


    public static boolean isRoyalFlush(List<Card> cardS) {
        if ((cardS.get(0).id == 9 && cardS.get(1).id == 10 && cardS.get(2).id == 11 && cardS.get(3).id == 12 && cardS.get(4).id == 13)
                && isFlush(cardS))
            return true;
        else return false;
    }

    public static boolean isStraight(List<Card> cardS) {
        List<Card> cards;
        cards = cardS.stream()
                .sorted(Comparator.comparingInt(Card::getId))
                .collect(Collectors.toList());
        if (cards.get(0).id == (cards.get(1).id - 1) && cards.get(1).id == (cards.get(2).id - 1)
                && cards.get(2).id == (cards.get(3).id - 1) && cards.get(3).id == (cards.get(4).id - 1)) return true;
        else return false;
    }

    public static boolean isFlush(List<Card> cardS) {
        if (cardS.get(0).color == cardS.get(1).color && cardS.get(1).color == cardS.get(2).color && cardS.get(2).color == cardS.get(3).color && cardS.get(3).color == cardS.get(4).color)
            return true;
        else return false;
    }


    public static boolean isFourOfAKind(List<Card> cardS) {
        if ((cardS.get(0).getId() == cardS.get(1).getId() && cardS.get(1).getId() == cardS.get(2).getId() && cardS.get(2).getId() == cardS.get(3).getId())
                || (cardS.get(1).getId() == cardS.get(2).getId() && cardS.get(2).getId() == cardS.get(3).getId() && cardS.get(3).getId() == cardS.get(4).getId()))
            return true;
        else return false;
    }


    public static boolean isFullHouse(List<Card> cardS) {
       if ((cardS.get(0).getId() == cardS.get(1).getId()) && (cardS.get(2).getId() == cardS.get(3).getId() && (cardS.get(3).getId() == cardS.get(4).getId())) ||
               (cardS.get(0).getId() == cardS.get(1).getId() && cardS.get(1).getId() == cardS.get(2).getId()) && cardS.get(3).getId() == cardS.get(4).getId()) return true;
        else return false;
    }

    public static boolean isThreeOfAKind(List<Card> cardS) {
        if ((cardS.get(0).getId() == cardS.get(1).getId()) && (cardS.get(2).getId() == cardS.get(3).getId() && (cardS.get(3).getId() == cardS.get(4).getId())) ||
                (cardS.get(0).getId() == cardS.get(1).getId() && cardS.get(1).getId() == cardS.get(2).getId()) && cardS.get(3).getId() == cardS.get(4).getId()) return true;
        return true;
        else return false;
    }

    public static boolean isTwoPairs(List<Card> cardS) {
        return true;
        else return false;
    }

    public static boolean isOnePair(List<Card> cardS) {
        return true;
        else return false;
    }

//    public static boolean isHighCard(List<Card> cardS){  return true;
//        else return false;}

    public static boolean areCardIdsInHandsEqual(List<Card> cardSa, List<Card> cardSb) {

//        List<Integer> hand1 = Arrays.asList(value1, value2, value3, value4, value5);
//        List<Integer> hand2 = Arrays.asList(value6, value7, value8, value9, value10);
//        Collections.sort(hand1);
//        Collections.sort(hand2);

        if (cardSa.equals(cardSb)) return true;
        else return false;
    }


}
