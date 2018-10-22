package w2d2;

import java.util.*;

public class HeWillNever {
    public static void main(String... args) {
        String out = "";
        int[] notSoCrypticMessage = {1, 12, 1, 2, 11, 1, 7, 11, 1, 49, 1, 3, 11, 1, 50, 11};

        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(7, "run around and desert you");
        map.put(50, "tell a lie and hurt you ");
        map.put(49, "make you cry, ");
        map.put(2, "let you down");
        map.put(12, "give you up, ");
        map.put(1, "Never gonna ");
        map.put(11, "\n");
        map.put(3, "say goodbye ");

        // Things are a little bit messed up
        // Your job is to decode the notSoCrypticMessage by using the hashmap as a look up table
        // Assemble the fragments into the out variable


        for (int i = 0; i < notSoCrypticMessage.length; i++) {
            String value;
            value = map.get(notSoCrypticMessage[i]);
            out += value;
            //out= out.concat(value);
        }

        System.out.println(map);
        System.out.println(out);
    }
}
//      Output of the code above:
//        Never gonna give you up, Never gonna let you down
//        Never gonna run around and desert you
//        Never gonna make you cry, Never gonna say goodbye
//        Never gonna tell a lie and hurt you

//Never gonna give you up
//Never gonna let you down
//Never gonna run around and desert you
//Never gonna make you cry
//Never gonna say goodbye
//Never gonna tell a lie and hurt you

//stackoverflow:

//    K key = getTheKey();
//    V value = getTheValue();
//
//    Map<K, V> map = new HashMap<>();
//map.put(key, value);
//        assert value == map.get(key);  // The call to get returns the same instance that you put into the map.


//System.out.println(map);, output: {b=2, a=1}

//Map<String, Integer> map = new HashMap<>();
//map.put("a", 1);
//        map.put("b", 2);
//        System.out.println(Arrays.asList(map)); // method 1
//        System.out.println(Collections.singletonList(map)); // method 2
//        Both method 1 and method 2 output this:
//
//        [{b=2, a=1}]