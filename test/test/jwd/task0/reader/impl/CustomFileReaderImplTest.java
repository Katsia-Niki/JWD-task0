package test.jwd.task0.reader.impl;

import by.jwd.task0.exception.CustomArrayException;
import by.jwd.task0.reader.CustomFileReader;
import by.jwd.task0.reader.impl.CustomFileReaderImpl;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CustomFileReaderImplTest {

    @Test
    public void readFromFileTest() throws CustomArrayException {
        CustomFileReader customFileReader = new CustomFileReaderImpl();
        String actual = customFileReader.readOneLineFromFile("resources\\testData\\TestCustomArrayData.txt");
        String expected = "7, -4, 5, 1, -7, ";

        assertEquals(actual, expected);
    }

}