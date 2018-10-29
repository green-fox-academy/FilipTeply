import javax.xml.stream.events.Characters;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise5 {

    //Write a Stream Expression to find the uppercase characters in a string!

    public static void main(String[] args) {

        String str = "HJGDguqUSAwyegGhkK";

        String strUpper = str.chars()
                .filter(ch -> Character.isUpperCase(ch))
                //or shorter
                // .filter(Character::isUpperCase)
                .mapToObj(c -> Character.toString((char) c))
                .collect(Collectors.joining());

        System.out.println(strUpper);

        str.chars()
                .filter(c -> Character.isUpperCase(c))
                .forEach(c -> System.out.print((char) c + " "));

        //Stream<Character> stream = Stream.of(str.charAt(0), s.charAt(1), s.charAt(2), ...)

    }

}
