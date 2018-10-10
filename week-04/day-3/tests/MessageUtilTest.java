import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MessageUtilTest {

    String message = "Hello World";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage() {
        assertEquals(message, messageUtil.printMessage());
    }

    @Test
    public void testNotPrintMessage() {
        assertNotEquals(message, messageUtil.printMessage());
    }

    @Test
    public void testNotPrintMessage2() {
        assertNotEquals("ciao", messageUtil.printMessage());
    }

}
