import java.util.Map;
import java.util.stream.Collectors;

public class Exercise7 {

    //Write a Stream Expression to find the frequency of characters in a given string!

    public static void main(String[] args) {

        String str = "HJGDguqUSAwyegGhkK";

        Map<Character, Long> charFrequencyMap = str.chars()
                .mapToObj(ch -> (char)(ch))
                //.mapToObj(ch-> Character.charCount(ch))
                .collect(Collectors.groupingBy(ch->ch, Collectors.counting()));

        System.out.println(charFrequencyMap);

        Map<Character, Long> charCaseInsensitiveFrequencyMap = str.chars()
                .map(Character::toLowerCase)
                .mapToObj(ch -> (char)ch)
                //.mapToObj(ch-> Character.charCount(ch))
                .collect(Collectors.groupingBy(ch->ch, Collectors.counting()));

        System.out.println(charCaseInsensitiveFrequencyMap);


        String string = "aasjjikkk";

        Map<Character, Long> characterFrequency = string.chars()  // creates an IntStream
                .mapToObj(c -> (char) c) // converts the IntStream to Stream<Character>
                .collect(Collectors.groupingBy(c -> c, Collectors.counting())); // creates a
        // Map<Character, Long>
        // where the Long is
        // the frequency

        System.out.println(characterFrequency);

    }

}
