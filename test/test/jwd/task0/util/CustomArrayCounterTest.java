package test.jwd.task0.util;

import by.jwd.task0.util.CustomArrayCounter;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CustomArrayCounterTest {

    @Test
    public void generateCustomArrayIdTest() {
        int actual = 0;
        int expected = 10;

        for(int i = 0; i < expected; i++) {
            actual = CustomArrayCounter.generateCustomArrayId();
        }

        assertEquals(actual, expected);
    }
}