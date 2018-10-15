package Conveter;

import org.junit.Test;
import sun.applet.Main;

import static org.junit.Assert.assertEquals;

public class ConverterTest {
    Converter mainConverter = new Converter();

//    @Test
//    public void returnsOneForThreeDigitNo() {
//        int number = 321;
//        assertEquals("one", mainConverter.noToWordConverter(number));
//    }
//
//    @Test
//    public void returns9ForThreeDigitNo() {
//        int number = 999;
//        assertEquals("nine", mainConverter.noToWordConverter(number));
//    }
//
//    @Test
//    public void returnsZeroForThreeDigitNo() {
//        int number = 320;
//        assertEquals("zero", mainConverter.noToWordConverter(number));
//    }

    @Test
    public void returns322For322No() {
        int number = 322;
        assertEquals("three hundred and twenty two", mainConverter.noToWordConverter(number));
    }

    @Test
    public void returns11For11() {
        int number = 11;
        assertEquals("eleven", mainConverter.noToWordConverter(number));
    }

    @Test
    public void returns19For19() {
        int number = 19;
        assertEquals("nineteen", mainConverter.noToWordConverter(number));
    }

    @Test
    public void returns119For119() {
        int number = 19;
        assertEquals("nine hundred and nineteen", mainConverter.noToWordConverter(number));
    }

    @Test
    public void returns999For999() {

        int number = 999;
        assertEquals("nine hundred and ninety nine", mainConverter.noToWordConverter(number));
    }

    @Test
    public void returns0For0() {
        int number = 0;
        assertEquals("zero", mainConverter.noToWordConverter(number));
    }

    @Test
    public void returns20For20() {
        int number = 20;
        assertEquals("twenty ", mainConverter.noToWordConverter(number));
    }

    @Test
    public void returns90For90() {
        int number = 90;
        assertEquals("ninety", mainConverter.noToWordConverter(number));
    }

    @Test
    public void returns99For99() {
        int number = 90;
        assertEquals("ninety nine", mainConverter.noToWordConverter(number));
    }
    @Test
    public void returns100For100() {
        int number = 100;
        assertEquals("one hundred", mainConverter.noToWordConverter(number));
    }

    @Test
    public void returns900For900() {
        int number = 900;
        assertEquals("nine hundred", mainConverter.noToWordConverter(number));
    }

    @Test
    public void returns950For950() {
        int number = 950;
        assertEquals("nine hundred and fifty", mainConverter.noToWordConverter(number));
    }

    @Test
    public void returns10For10() {
        int number = 10;
        assertEquals("ten", mainConverter.noToWordConverter(number));
    }

    @Test
    public void returns710For710() {
        int number = 710;
        assertEquals("seven hundred and ten ", mainConverter.noToWordConverter(number));
    }

    @Test
    public void returns110For110() {
        int number = 110;
        assertEquals("one hundred and ten ", mainConverter.noToWordConverter(number));
    }

    @Test
    public void returns113For113() {
        int number = 113;
        assertEquals("one hundred and thirteen", mainConverter.noToWordConverter(number));
    }

    @Test
    public void returns120For120() {
        int number = 120;
        assertEquals("one hundred and twenty ", mainConverter.noToWordConverter(number));
    }

    @Test
    public void returns50For50() {
        int number = 50;
        assertEquals("fifty ", mainConverter.noToWordConverter(number));
    }

    @Test
    public void returns930For930() {
        int number = 930;
        assertEquals("nine hundred and thirty ", mainConverter.noToWordConverter(number));
    }

    @Test
    public void returns990For990() {
        int number = 990;
        assertEquals("nine hundred and ninety ", mainConverter.noToWordConverter(number));
    }

    //tens, teens, make problem,
    //119,990,930 710,
    //910
    // Expected :nine hundred and ninety
    //Actual   :nine hundred and ninety zero

    //expand for thousands



}
