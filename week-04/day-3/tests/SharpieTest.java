import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SharpieTest {

    Sharpie testsharpie = new Sharpie();

    @Test
    public void doesUseSharpie() {
        assertEquals(99f, testsharpie.use(), 0.0001);
    }

    @Test
    public void whatColorSharpie() {
        testsharpie.color = "blue";
        assertEquals("blue", testsharpie.color);
    }

    @Test
    public void whatWidthSharpie() {
        testsharpie.width = 4f;
        assertEquals(4f, testsharpie.width, 0.0001);
    }

    @Test
    public void whatInkAmountSharpie() {

        assertEquals(100f, testsharpie.inkAmount, 0.0001);
    }

    @Test
    public void whatInkAmountUsedSharpie() {
        testsharpie.use();
        testsharpie.use();
        testsharpie.use();
        assertEquals(97f, testsharpie.inkAmount, 0.0001);
    }
}


//Create Sharpie class
//We should know about each sharpie their color (which should be a string), width (which will be a floating point number), inkAmount (another floating point number)
//When creating one, we need to specify the color and the width
//Every sharpie is created with a default 100 as inkAmount
//We can use() the sharpie objects
//which decreases inkAmount