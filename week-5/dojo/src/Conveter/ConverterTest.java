package Conveter;

import org.junit.Test;
import sun.applet.Main;

import static org.junit.Assert.assertEquals;

public class ConverterTest {
    Converter mainConverter = new Converter();

    @Test
    public void returnsOneForThreeDigitNo() {
        int number = 321;
        assertEquals("one", mainConverter.noToWordConverter(number));
    }

    @Test
    public void returns9ForThreeDigitNo() {
        int number = 999;
        assertEquals("nine", mainConverter.noToWordConverter(number));
    }

    @Test
    public void returnsZeroForThreeDigitNo() {
        Converter mainConverter = new Converter();

        int number = 320;
        assertEquals("zero", mainConverter.noToWordConverter(number));
    }

    @Test
    public void returns10sForThreeDigitNo() {
        Converter mainConverter = new Converter();

        int number = 322;
        assertEquals("three hundred and twenty two", mainConverter.noToWordConverter(number));
    }

    @Test
    public void returns10For10() {
        Converter mainConverter = new Converter();

        int number = 10;
        assertEquals("ten", mainConverter.noToWordConverter(number));
    }



}
