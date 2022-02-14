package test.jwd.task0.paser.impl;

import by.jwd.task0.exception.CustomArrayException;
import by.jwd.task0.parser.StringToIntArrayParser;
import by.jwd.task0.parser.impl.StringToIntArrayParserImpl;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StringToIntArrayParserImplTest {

    @Test
    public void parseCustomArrayTest() throws CustomArrayException {

        int[] expected = {1, 2, 3};

        String dataToParse = "1, 2, 3, ";

        StringToIntArrayParser parser = new StringToIntArrayParserImpl();

        int[] actual = parser.parseCustomArray(dataToParse);

        assertEquals(expected, actual);
    }

}