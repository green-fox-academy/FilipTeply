import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountLettersTest {

    CountLetters item = new CountLetters();

    @Test
    public void doesCountLetters() {
        assertEquals(5, item.countLet("word1"));
    }

    @Test
    public void doesCountZeroLetters() {
        assertEquals(0, item.countLet(""));
    }

    @Test
    public void doesCountNullLetters() {
        assertEquals(null, item.countLet(null));
    }

}
