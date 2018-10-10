import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {


    Fibonacci testnum = new Fibonacci();


//      primitives: int, char, double, float... cannot have null values
//      @Test
//      public void fibonacciNumberNullIndex() {
//      assertEquals( null, testnum.fibonacciSeries(null));
//    }

    @Test
    public void fibonacciNumberMinusIndex() {
        assertEquals(-8, testnum.fibonacciSeries(-8));
    }

    @Test
    public void fibonacciNumberZeroIndex() {
        assertEquals(0, testnum.fibonacciSeries(0));
    }

    @Test
    public void fibonacciNumberFirstIndex() {
        assertEquals(1, testnum.fibonacciSeries(1));
    }

    @Test
    public void fibonacciNumber2ndIndex() {
        assertEquals(1, testnum.fibonacciSeries(2));
    }

    @Test
    public void fibonacciNumber3rdIndex() {
        assertEquals(2, testnum.fibonacciSeries(3));
    }

    @Test
    public void fibonacciNumber4thIndex() {
        assertEquals(3, testnum.fibonacciSeries(4));
    }

    @Test
    public void fibonacciNumber5thIndex() {
        assertEquals(5, testnum.fibonacciSeries(5));
    }

    @Test
    public void fibonacciNumber6thIndex() {
        assertEquals(8, testnum.fibonacciSeries(6));
    }

    @Test
    public void fibonacciNumber7thIndex() {
        assertEquals(13, testnum.fibonacciSeries(7));
    }

    @Test
    public void fibonacciNumberNthIndex() {
        assertEquals(21, testnum.fibonacciSeries(8));
    }

}
