import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class AppleTest {

    Apple apple1 = new Apple();

//    or
//    Apple apple1;
//    @Before
//    public void instantiateApple() {
//        this.apple1 = new Apple();
//    }

    @Test
    public void testsGetApple() {

        assertEquals("apple", apple1.getApple());
    }

    @Test
    public void testsNotGetApple() {
        //Apple apple1 = new Apple();
        assertNotEquals("pear", apple1.getApple());
    }

}
