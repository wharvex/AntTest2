package oata;

import org.junit.Test;

import static org.junit.Assert.fail;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
    @Test
    public void evaluatesExpression() {
        int sum = HelloWorld.evaluate("1+2+3");
        assertEquals(6, sum);
    }

    @Test
    public void testWillAlwaysFail() {
        assertEquals(1, 2);
    }
}
