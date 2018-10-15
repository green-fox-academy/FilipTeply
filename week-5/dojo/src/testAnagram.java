import org.junit.Test;

import static org.junit.Assert.*;

public class testAnagram {


    @Test
    public void testTrueForAnagrams() {
        String true1 = "bago";
        String true2 = "goba";
        String nonAnagram = "kfmb";

        assertTrue(Anagram.anagram(true1, true2));
    }

    @Test
    public void testFalseForNonAnagrams() {
        String true1 = "bago";
        String true2 = "goba";
        String nonAnagram = "kfmb";

        assertFalse(Anagram.anagram(true1, nonAnagram));
    }

    @Test
    public void testTrueForAnagramsWithDifferentSpacing() {
        String str1 = "ba go";
        String str2 = "goba";

        assertTrue(Anagram.anagram(str1, str2));
    }

    @Test
    public void testTrueForAnagramsIrrespectiveLowerUpperCase() {
        String str1 = "Ba go";
        String str2 = "Goba";

        assertTrue(Anagram.anagram(str1, str2));
    }

    @Test
    public void testTrueForAnagramsWithDashes() {
        String str1 = "Ba-go";
        String str2 = "Goba";

        assertTrue(Anagram.anagram(str1, str2));
    }

    @Test
    public void testTrueForNonAlfaNumericCharacters() {
        String str1 = "mother-in-law1";
        String str2 = "hitler woman--=!1~#$^&";

        assertTrue(Anagram.anagram(str1, str2));
    }

//    @Test
//    public void testTrueForAnagrams

}