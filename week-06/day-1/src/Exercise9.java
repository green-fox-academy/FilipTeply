import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class Exercise9 {
    private static Object Stream;

    //Write a Stream Expression to convert a char array to a string!

    public static void main(String[] args) {

        String str = "Hello, World!";

        char[] charArr = str.toCharArray();

        //Character[] chars = {new Character('a'),new Character('b'),new Character('c')};

        //List<char[]> value = Arrays.asList(charArr);

        String value =
                Arrays.asList(charArr).stream()
                .map(Object::toString)
                .collect(Collectors.joining());

        System.out.println(value);


        char[] array = {'a', 'b', 'c', 'd'};
        //String strOut =
        new String(array).          // Create string out of array of characters
                chars().            // From the string, create stream of characters encoded as integers (IntegerStream)
                mapToObj(i -> (char) i). // Map this IntegerStream (contains primitive ints) to Stream containing objects
                //collect(Collectors.joining());
                forEach(a -> System.out.print(a));    // Print each of these objects (in our case Character object)

        //= Arrays.stream(charArr)

//        Stream<Character> characterStream =
//                chars()
//                        .collect(Collectors.joining());
//        boolean str2;
//        System.out.println(str2);
//
//        str2 = str.chars();
//                .collect(Collectors.joining());
//        System.out.println(str2);
//
//        String str3 = Stream.ofAll;
//                .collect(Collectors.joining());
//        System.out.println(str3);


    }

}
