package ESII.T1_82137;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testHello()
    {
    	TestClass test = new TestClass();
    	assertEquals("Hello World", test.hello());
    }
}
